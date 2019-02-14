/*******************************************************************************
 * Copyright (c) 2019 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     seanmuir - initial API and implementation
 *     
 *******************************************************************************/
package org.eclipse.mdht.cda.xml.ui.handlers;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.eclipse.mdht.uml.cda.Act;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.Procedure;
import org.eclipse.mdht.uml.cda.SubstanceAdministration;
import org.eclipse.mdht.uml.cda.Supply;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.datatypes.SXCM_TS;

/**
 * @author seanmuir
 *
 */
public class EncounterUtil {

	/**
	 *
	 * @TODO Fix with proper date comparison routines
	 * @param encounter
	 * @param date
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static boolean isWithinEncounterDateRate(Encounter encounter, Date date) {
	
		if (encounter.getEffectiveTime() != null) {
			if (!StringUtils.isEmpty(encounter.getEffectiveTime().getValue())) {
	
				Date edate = CDAValueUtil.getDate(encounter.getEffectiveTime().getValue());
				if (edate != null) {
	
					if (edate.compareTo(date) == 0) {
						return true;
					}
	
					if (edate.getYear() == date.getYear()) {
						if (edate.getMonth() == date.getMonth()) {
							if (edate.getDay() == date.getDay()) {
								return true;
							}
						}
					}
				}
			}
	
			if (encounter.getEffectiveTime().getLow() != null &&
					!StringUtils.isEmpty(encounter.getEffectiveTime().getLow().getValue())) {
				Date edate = CDAValueUtil.getDate(encounter.getEffectiveTime().getLow().getValue());
				if (edate != null) {
					if (edate.getYear() == date.getYear()) {
						if (edate.getMonth() == date.getMonth()) {
							if (edate.getDay() == date.getDay()) {
								return true;
							}
	
						}
					}
				}
	
			}
	
			if (encounter.getEffectiveTime().getHigh() != null &&
					!StringUtils.isEmpty(encounter.getEffectiveTime().getLow().getValue())) {
				Date edate = CDAValueUtil.getDate(encounter.getEffectiveTime().getHigh().getValue());
				if (edate != null) {
					if (edate != null && date != null) {
						if (edate.getYear() == date.getYear()) {
							if (edate.getMonth() == date.getMonth()) {
								if (edate.getDay() == date.getDay()) {
									return true;
								}
	
							}
						}
					}
				}
			}
		}
	
		return false;
	}

	public static MatchEncounterBy matchesEncounter(Encounter encounter, Act act) {
	
		for (II ii : act.getIds()) {
			for (II iii : encounter.getIds()) {
				if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
					return MatchEncounterBy.BYID;
				}
			}
		}
	
		Date observationTime = null;
	
		MatchEncounterBy result = MatchEncounterBy.BYEFFECTIVETIME;
	
		if (act.getEffectiveTime() != null) {
			IVL_TS ivlts = act.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
			}
	
			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getHigh().getValue());
			}
		}
	
		if (observationTime == null) {
			for (Author author : act.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = CDAValueUtil.getDate(author.getTime().getValue());
					result = MatchEncounterBy.BYAUTHORID;
				}
			}
		}
	
		if (observationTime != null && isWithinEncounterDateRate(encounter, observationTime)) {
			return result;
		}
	
		return MatchEncounterBy.NOMATCH;
	
	}

	public static MatchEncounterBy matchesEncounter(Encounter encounter, Observation observation) {
		for (II ii : observation.getIds()) {
			for (II iii : encounter.getIds()) {
				if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
					return MatchEncounterBy.BYID;
				}
			}
		}
	
		Date observationTime = null;
	
		MatchEncounterBy result = MatchEncounterBy.BYEFFECTIVETIME;
	
		if (observation.getEffectiveTime() != null) {
			IVL_TS ivlts = observation.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
			}
	
			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getHigh().getValue());
			}
		}
	
		if (observationTime == null) {
			for (Author author : observation.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = CDAValueUtil.getDate(author.getTime().getValue());
					result = MatchEncounterBy.BYAUTHORID;
				}
			}
		}
	
		if (observationTime != null && isWithinEncounterDateRate(encounter, observationTime)) {
			return result;
		}
	
		return MatchEncounterBy.NOMATCH;
	
	}

	/**
	 * @param encounter2
	 * @param organizer
	 * @return
	 */
	public static MatchEncounterBy matchesEncounter(Encounter encounter, Organizer organizer) {
	
		for (II ii : organizer.getIds()) {
			for (II iii : encounter.getIds()) {
				if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
					return MatchEncounterBy.BYID;
				}
			}
		}
	
		Date observationTime = null;
	
		MatchEncounterBy result = MatchEncounterBy.BYEFFECTIVETIME;
	
		if (organizer.getEffectiveTime() != null) {
			IVL_TS ivlts = organizer.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
			}
	
			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getHigh().getValue());
			}
		}
	
		if (observationTime == null) {
			for (Author author : organizer.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = CDAValueUtil.getDate(author.getTime().getValue());
					result = MatchEncounterBy.BYAUTHORID;
				}
			}
		}
	
		if (observationTime != null && isWithinEncounterDateRate(encounter, observationTime)) {
			return result;
		}
	
		return MatchEncounterBy.NOMATCH;
	
	}

	public static MatchEncounterBy matchesEncounter(Encounter encounter, Procedure procedure) {
	
		for (II ii : procedure.getIds()) {
			for (II iii : encounter.getIds()) {
				if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
					return MatchEncounterBy.BYID;
				}
			}
		}
	
		Date observationTime = null;
	
		MatchEncounterBy result = MatchEncounterBy.BYEFFECTIVETIME;
		if (procedure.getEffectiveTime() != null) {
			IVL_TS ivlts = procedure.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
			}
	
			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getHigh().getValue());
			}
		}
	
		if (observationTime == null) {
			for (Author author : procedure.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = CDAValueUtil.getDate(author.getTime().getValue());
					result = MatchEncounterBy.BYAUTHORID;
				}
			}
		}
	
		if (observationTime != null && isWithinEncounterDateRate(encounter, observationTime)) {
			return result;
		}
	
		return MatchEncounterBy.NOMATCH;
	
	}

	public static MatchEncounterBy matchesEncounter(Encounter encounter, SubstanceAdministration item) {
	
		for (Encounter e : item.getEncounters()) {
	
			for (II ii : e.getIds()) {
				for (II iii : encounter.getIds()) {
					if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
						return MatchEncounterBy.BYID;
					}
	
				}
			}
	
		}
	
		MatchEncounterBy result = MatchEncounterBy.BYEFFECTIVETIME;
		Date substanceAdminTime = null;
	
		for (SXCM_TS ts : item.getEffectiveTimes()) {
			if (ts instanceof IVL_TS) {
				IVL_TS ivlts = (IVL_TS) ts;
				if (ivlts.getLow() != null) {
					if (ivlts.getLow().getValue() != null) {
						substanceAdminTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
					}
				}
			} else {
				if (!StringUtils.isEmpty(ts.getValue())) {
					substanceAdminTime = CDAValueUtil.getDate(ts.getValue());
				}
			}
	
		}
	
		if (substanceAdminTime == null) {
			for (Author author : item.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					substanceAdminTime = CDAValueUtil.getDate(author.getTime().getValue());
				}
			}
		}
	
		if (substanceAdminTime != null && isWithinEncounterDateRate(encounter, substanceAdminTime)) {
			return result;
	
		}
		return MatchEncounterBy.NOMATCH;
	}

	/**
	 * @param encounter
	 * @param supply
	 * @return
	 */
	public static MatchEncounterBy matchesEncounter(Encounter encounter, Supply supply) {
		for (Encounter e : supply.getEncounters()) {
	
			for (II ii : e.getIds()) {
				for (II iii : encounter.getIds()) {
					if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
						return MatchEncounterBy.BYID;
					}
	
				}
			}
	
		}
	
		Date supplyTime = null;
	
		MatchEncounterBy result = MatchEncounterBy.BYEFFECTIVETIME;
	
		for (SXCM_TS ts : supply.getEffectiveTimes()) {
			if (ts instanceof IVL_TS) {
				IVL_TS ivlts = (IVL_TS) ts;
				if (ivlts.getLow() != null) {
					if (ivlts.getLow().getValue() != null) {
						supplyTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
					}
				}
			} else {
				if (!StringUtils.isEmpty(ts.getValue())) {
					supplyTime = CDAValueUtil.getDate(ts.getValue());
				}
			}
	
		}
	
		if (supplyTime == null) {
			for (Author author : supply.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					supplyTime = CDAValueUtil.getDate(author.getTime().getValue());
					result = MatchEncounterBy.BYAUTHORID;
				}
			}
		}
	
		if (supplyTime != null && isWithinEncounterDateRate(encounter, supplyTime)) {
			return result;
	
		}
		return MatchEncounterBy.NOMATCH;
	}

}

enum MatchEncounterBy {
	BYAUTHORID("MatchedUsingAuthor"), BYEFFECTIVETIME("MatchedUsingEffectiveTime"), BYID("MatchedUsingID"), NOMATCH(
			"NoMatch");

	private String match;

	private MatchEncounterBy(String match) {
		this.match = match;
	}

	public String getMatch() {
		return this.match;
	}
}
