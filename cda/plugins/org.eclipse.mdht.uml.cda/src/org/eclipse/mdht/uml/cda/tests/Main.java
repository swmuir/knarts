/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.Entry;
import org.eclipse.mdht.uml.cda.InfrastructureRootTypeId;
import org.eclipse.mdht.uml.cda.Organization;
import org.eclipse.mdht.uml.cda.Patient;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.Person;
import org.eclipse.mdht.uml.cda.RecordTarget;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.ValidationResult;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.eclipse.mdht.uml.hl7.datatypes.TS;
import org.eclipse.mdht.uml.hl7.vocab.ActClass;
import org.eclipse.mdht.uml.hl7.vocab.NullFlavor;
import org.eclipse.mdht.uml.hl7.vocab.x_DocumentEncounterMood;

public class Main {

	/*
	 * <ownedAttribute xmi:id="_B19SQExsEd6h-an5IXo-DA" name="realmCode" visibility="private" aggregation="composite">
	 * <type xmi:type="uml:Class" href="pathmap://DATATYPES_MODEL/datatypes.uml#_iYn74D55Ed6cla2oXsPtlA"/>
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_B19SQkxsEd6h-an5IXo-DA"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_B19SQUxsEd6h-an5IXo-DA" value="*"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_B2GcNUxsEd6h-an5IXo-DA" name="typeId" visibility="private" type="_sKX1MEb9Ed6besF9iFIJkQ" aggregation="composite">
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_B2GcN0xsEd6h-an5IXo-DA"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_B2GcNkxsEd6h-an5IXo-DA" value="1"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_B2GcMkxsEd6h-an5IXo-DA" name="templateId" visibility="private" aggregation="composite">
	 * <type xmi:type="uml:Class" href="pathmap://DATATYPES_MODEL/datatypes.uml#_culQ8DxaEd6JwqSGecoePg"/>
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_B2GcNExsEd6h-an5IXo-DA"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_B2GcM0xsEd6h-an5IXo-DA" value="*"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_DKBLQEo0Ed6c3qsAxlFHaQ" name="id" visibility="private" aggregation="composite">
	 * <type xmi:type="uml:Class" href="pathmap://DATATYPES_MODEL/datatypes.uml#_culQ8DxaEd6JwqSGecoePg"/>
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_D2t5MEo0Ed6c3qsAxlFHaQ"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_D2t5MUo0Ed6c3qsAxlFHaQ" value="*"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_F_EFwEo0Ed6c3qsAxlFHaQ" name="code" visibility="private" aggregation="composite">
	 * <type xmi:type="uml:Class" href="pathmap://DATATYPES_MODEL/datatypes.uml#_VKl7EDxaEd6JwqSGecoePg"/>
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Gl9GoEo0Ed6c3qsAxlFHaQ"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Gl9GoUo0Ed6c3qsAxlFHaQ" value="1"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_H4XJsEo0Ed6c3qsAxlFHaQ" name="text" visibility="private" aggregation="composite">
	 * <type xmi:type="uml:Class" href="pathmap://DATATYPES_MODEL/datatypes.uml#_CowXkDxaEd6JwqSGecoePg"/>
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_IZvYcEo0Ed6c3qsAxlFHaQ"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_IZvYcUo0Ed6c3qsAxlFHaQ" value="1"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_KAZ0QEo0Ed6c3qsAxlFHaQ" name="statusCode" visibility="private" aggregation="composite">
	 * <type xmi:type="uml:Class" href="pathmap://DATATYPES_MODEL/datatypes.uml#_iYn74D55Ed6cla2oXsPtlA"/>
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_K1KSAEo0Ed6c3qsAxlFHaQ"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_K1KSAUo0Ed6c3qsAxlFHaQ" value="1"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_MZl5MEo0Ed6c3qsAxlFHaQ" name="effectiveTime" visibility="private" aggregation="composite">
	 * <type xmi:type="uml:Class" href="pathmap://DATATYPES_MODEL/datatypes.uml#_QYeW4D5-Ed6cla2oXsPtlA"/>
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_NdipgEo0Ed6c3qsAxlFHaQ"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_NdipgUo0Ed6c3qsAxlFHaQ" value="1"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_eCTm4I_1EeKDcJPVSJHobw" name="sDTCDischargeDispositionCode" visibility="private" aggregation="composite">
	 * <type xmi:type="uml:Class" href="pathmap://DATATYPES_MODEL/datatypes.uml#_Z1EGIDxaEd6JwqSGecoePg"/>
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_oI-U4I_1EeKDcJPVSJHobw"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_oI9t0I_1EeKDcJPVSJHobw" value="*"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_OtQk8Eo0Ed6c3qsAxlFHaQ" name="priorityCode" visibility="private" aggregation="composite">
	 * <type xmi:type="uml:Class" href="pathmap://DATATYPES_MODEL/datatypes.uml#_Z1EGIDxaEd6JwqSGecoePg"/>
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_PqzLQEo0Ed6c3qsAxlFHaQ"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_PqzLQUo0Ed6c3qsAxlFHaQ" value="1"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_LxP-EExpEd6h-an5IXo-DA" name="subject" visibility="private" type="_rNlWoEcaEd6besF9iFIJkQ" aggregation="composite"
	 * association="_LxGNEExpEd6h-an5IXo-DA">
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_LxP-EUxpEd6h-an5IXo-DA"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_LxP-EkxpEd6h-an5IXo-DA" value="1"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_wasAIUxpEd6h-an5IXo-DA" name="specimen" visibility="private" type="_mdwKcEcaEd6besF9iFIJkQ" aggregation="composite"
	 * association="_wasAIExpEd6h-an5IXo-DA">
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_wa1xIExpEd6h-an5IXo-DA"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_wa1xIUxpEd6h-an5IXo-DA" value="*"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_jKTaEUxnEd6h-an5IXo-DA" name="performer" visibility="private" type="_HP8qoEcaEd6besF9iFIJkQ" aggregation="composite"
	 * association="_jKTaEExnEd6h-an5IXo-DA">
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_jKTaEkxnEd6h-an5IXo-DA"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_jKTaE0xnEd6h-an5IXo-DA" value="*"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_AsZwkUxpEd6h-an5IXo-DA" name="author" visibility="private" type="_ChEisEcEEd6besF9iFIJkQ" aggregation="composite"
	 * association="_AsZwkExpEd6h-an5IXo-DA">
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_AsZwkkxpEd6h-an5IXo-DA"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_AsZwk0xpEd6h-an5IXo-DA" value="*"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_PEqsEUxoEd6h-an5IXo-DA" name="informant" visibility="private" type="_GUBDUEcZEd6besF9iFIJkQ" aggregation="composite"
	 * association="_PEqsEExoEd6h-an5IXo-DA">
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_PEqsEkxoEd6h-an5IXo-DA"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_PEqsE0xoEd6h-an5IXo-DA" value="*"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_h0gPUUxoEd6h-an5IXo-DA" name="participant" visibility="private" type="_51DLwEcZEd6besF9iFIJkQ" aggregation="composite"
	 * association="_h0gPUExoEd6h-an5IXo-DA">
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_h0gPUkxoEd6h-an5IXo-DA"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_h0gPU0xoEd6h-an5IXo-DA" value="*"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_KWYtIUxqEd6h-an5IXo-DA" name="entryRelationship" visibility="private" type="_BoxMQEcFEd6besF9iFIJkQ"
	 * aggregation="composite" association="_KWYtIExqEd6h-an5IXo-DA">
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_KWYtIkxqEd6h-an5IXo-DA"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_KWYtI0xqEd6h-an5IXo-DA" value="*"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_E2gO8ExoEd6h-an5IXo-DA" name="reference" visibility="private" type="_NDnXkEcIEd6besF9iFIJkQ" aggregation="composite"
	 * association="_E2Wd8ExoEd6h-an5IXo-DA">
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_E2gO8UxoEd6h-an5IXo-DA"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_E2gO8kxoEd6h-an5IXo-DA" value="*"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_iLevcExpEd6h-an5IXo-DA" name="precondition" visibility="private" type="_OJn4MEcaEd6besF9iFIJkQ"
	 * aggregation="composite" association="_iLVlgExpEd6h-an5IXo-DA">
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_iLevcUxpEd6h-an5IXo-DA"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_iLevckxpEd6h-an5IXo-DA" value="*"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_B19SQ0xsEd6h-an5IXo-DA" name="nullFlavor" visibility="private">
	 * <type xmi:type="uml:Enumeration" href="pathmap://VOCAB_MODEL/vocab.uml#__yyDSUDcEd6xYZuu1VKCVw"/>
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_B2GcMUxsEd6h-an5IXo-DA"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_B2GcMExsEd6h-an5IXo-DA" value="1"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_n4VYQEb9Ed6besF9iFIJkQ" name="classCode" visibility="private">
	 * <type xmi:type="uml:Enumeration" href="pathmap://VOCAB_MODEL/vocab.uml#__yVdYEDcEd6xYZuu1VKCVw"/>
	 * </ownedAttribute>
	 * <ownedAttribute xmi:id="_SaymoEo0Ed6c3qsAxlFHaQ" name="moodCode" visibility="private">
	 * <type xmi:type="uml:Enumeration" href="pathmap://VOCAB_MODEL/vocab.uml#__zOpnUDcEd6xYZuu1VKCVw"/>
	 * <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Y3GiwEo0Ed6c3qsAxlFHaQ" value="1"/>
	 * <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Y3GiwUo0Ed6c3qsAxlFHaQ" value="1"/>
	 * </ownedAttribute>
	 */

	/*
	 * <xs:element name="realmCode" type="CS" minOccurs="0" maxOccurs="unbounded" />
	 * <xs:element name="typeId" type="POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0" />
	 * <xs:element name="templateId" type="II" minOccurs="0" maxOccurs="unbounded" />
	 * <xs:element name="id" type="II" minOccurs="0" maxOccurs="unbounded" />
	 * <xs:element name="code" type="CD" minOccurs="0" />
	 * <xs:element name="text" type="ED" minOccurs="0" />
	 * <xs:element name="statusCode" type="CS" minOccurs="0" />
	 * <xs:element name="effectiveTime" type="IVL_TS" minOccurs="0" />
	 * <!-- Begin Extension: (SDTC) -->
	 * <xs:element ref="sdtc:dischargeDispositionCode" minOccurs="0" />
	 * <!-- End Extension: (SDTC) -->
	 * <xs:element name="priorityCode" type="CE" minOccurs="0" />
	 * <xs:element name="subject" type="POCD_MT000040.Subject" minOccurs="0" />
	 * <xs:element name="specimen" type="POCD_MT000040.Specimen" minOccurs="0" maxOccurs="unbounded" />
	 * <xs:element name="performer" type="POCD_MT000040.Performer2" minOccurs="0" maxOccurs="unbounded" />
	 * <xs:element name="author" type="POCD_MT000040.Author" minOccurs="0" maxOccurs="unbounded" />
	 * <xs:element name="informant" type="POCD_MT000040.Informant12" minOccurs="0" maxOccurs="unbounded" />
	 * <xs:element name="participant" type="POCD_MT000040.Participant2" minOccurs="0" maxOccurs="unbounded" />
	 * <xs:element name="entryRelationship" type="POCD_MT000040.EntryRelationship" minOccurs="0"
	 * maxOccurs="unbounded" />
	 * <xs:element name="reference" type="POCD_MT000040.Reference" minOccurs="0" maxOccurs="unbounded" />
	 * <xs:element name="precondition" type="POCD_MT000040.Precondition" minOccurs="0" maxOccurs="unbounded" />
	 * <!-- Begin Extension: (SDTC) -->
	 * <xs:element ref="sdtc:inFulfillmentOf1" minOccurs="0" maxOccurs="unbounded" />
	 * <!-- End Extension: (SDTC) -->
	 *
	 *
	 * <realmCode/>
	 * <typeId root="2.16.840.1.113883.1.3"/>
	 * <templateId/>
	 * <id/>
	 * <code/>
	 * <text/>
	 * <statusCode/>
	 * <effectiveTime/>
	 * <sdtc:dischargeDispositionCode/>
	 * <priorityCode/>
	 * <subject/>
	 * <specimen/>
	 * <performer/>
	 * <author/>
	 * <informant/>
	 * <participant/>
	 * <entryRelationship>
	 * <act/>
	 * </entryRelationship>
	 * <entryRelationship>
	 * <encounter/>
	 * </entryRelationship>
	 * <entryRelationship>
	 * <observation/>
	 * </entryRelationship>
	 * <entryRelationship>
	 * <observationMedia/>
	 * </entryRelationship>
	 * <entryRelationship>
	 * <organizer/>
	 * </entryRelationship>
	 * <entryRelationship>
	 * <procedure/>
	 * </entryRelationship>
	 * <entryRelationship>
	 * <regionOfInterest classCode="ROIOVL" moodCode="EVN"/>
	 * </entryRelationship>
	 * <entryRelationship>
	 * <substanceAdministration classCode="SBADM"/>
	 * </entryRelationship>
	 * <entryRelationship>
	 * <supply classCode="SPLY"/>
	 * </entryRelationship>
	 * <reference/>
	 * <precondition/>
	 */

	public static void testSDTCDischargeDispositionCodes() throws Exception {
		ClinicalDocument doc = CDAFactory.eINSTANCE.createClinicalDocument();
		Section section = CDAFactory.eINSTANCE.createSection();
		doc.addSection(section);
		Encounter encounter = CDAFactory.eINSTANCE.createEncounter();

		encounter.getRealmCodes().add(DatatypesFactory.eINSTANCE.createCS());
		encounter.setTypeId(CDAFactory.eINSTANCE.createInfrastructureRootTypeId());
		encounter.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII());
		encounter.getIds().add(DatatypesFactory.eINSTANCE.createII());
		encounter.setCode(DatatypesFactory.eINSTANCE.createCD());
		encounter.setText(DatatypesFactory.eINSTANCE.createED());
		encounter.setStatusCode(DatatypesFactory.eINSTANCE.createCS());
		encounter.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
		// encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE());
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("1", "1"));
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("2", "1"));
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("3", "1"));
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("4", "1"));
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("5", "1"));
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("6", "1"));
		encounter.setPriorityCode(DatatypesFactory.eINSTANCE.createCE());
		encounter.setSubject(CDAFactory.eINSTANCE.createSubject());
		encounter.getSpecimens().add(CDAFactory.eINSTANCE.createSpecimen());
		encounter.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
		encounter.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
		encounter.getInformants().add(CDAFactory.eINSTANCE.createInformant12());
		encounter.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
		encounter.addAct(CDAFactory.eINSTANCE.createAct());
		encounter.addEncounter(CDAFactory.eINSTANCE.createEncounter());
		encounter.addObservation(CDAFactory.eINSTANCE.createObservation());
		encounter.addObservationMedia(CDAFactory.eINSTANCE.createObservationMedia());
		encounter.addOrganizer(CDAFactory.eINSTANCE.createOrganizer());
		encounter.addProcedure(CDAFactory.eINSTANCE.createProcedure());
		encounter.addRegionOfInterest(CDAFactory.eINSTANCE.createRegionOfInterest());
		encounter.addSubstanceAdministration(CDAFactory.eINSTANCE.createSubstanceAdministration());
		encounter.addSupply(CDAFactory.eINSTANCE.createSupply());
		encounter.getReferences().add(CDAFactory.eINSTANCE.createReference());
		encounter.getPreconditions().add(CDAFactory.eINSTANCE.createPrecondition());
		encounter.setNullFlavor(NullFlavor.ASKU);
		encounter.setClassCode(ActClass.ACCM);
		encounter.setMoodCode(x_DocumentEncounterMood.APT);

		// encounter.setClassCode(value);
		// encounter.setCode(value);
		// encounter.setEffectiveTime(value);
		// encounter.setMoodCode(value);
		// encounter.setNullFlavor(value);
		// encounter.setPriorityCode(value);
		// encounter.setStatusCode(value);
		// encounter.setSubject(value);
		// encounter.setText(value);
		// encounter.setTypeId(value);
		// encounter.addAct(act);
		// encounter.addEncounter(encounter);
		// encounter.addObservation(observation);
		// encounter.addObservationMedia(observationMedia);
		// encounter.addOrganizer(organizer);
		// encounter.addProcedure(procedure);
		// encounter.addRegionOfInterest(regionOfInterest);
		// encounter.addSubstanceAdministration(substanceAdministration);
		// encounter.addSupply(supply);
		//
		// encounter.getAssignedEntities();
		// encounter.getAuthors();
		// encounter.getIds();
		// encounter.getSpecimens();
		// encounter.getPerformers();
		// encounter.getParticipants();
		// encounter.getReferences();
		// encounter.getPreconditions();
		//
		// encounter.addAct(CDAFactory.eINSTANCE.createAct());
		//
		// encounter.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
		// encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("1", "1"));
		// encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("2", "1"));
		// encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("3", "1"));
		// encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("4", "1"));
		// encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("5", "1"));
		// encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("6", "1"));
		//
		// encounter.setPriorityCode(DatatypesFactory.eINSTANCE.createCE());
		section.addEncounter(encounter);

		// saveData("foobar.xml", doc);
		CDAUtil.save(doc, new FileOutputStream("samples/sdtcdischargedispositioncodes.xml"));

		// ClinicalDocument clinicalDocument = loadData("foobar.xml");

		ClinicalDocument clinicalDocument = CDAUtil.load(
			new FileInputStream("samples/sdtcdischargedispositioncodes.xml"));

		for (Section s : clinicalDocument.getSections()) {

			for (Entry e : s.getEntries()) {

				if (e.getEncounter() != null) {

					for (CE ce : e.getEncounter().getSDTCDischargeDispositionCodes()) {
						System.out.println("Test Codes " + ce.getCode());
					}

				}

			}

		}

		CDAUtil.save(clinicalDocument, new FileOutputStream("samples/sdtcdischargedispositioncodes2.xml"));
	}

	public static void main(String[] args) throws Exception {
		ClinicalDocument doc = CDAFactory.eINSTANCE.createClinicalDocument();

		InfrastructureRootTypeId typeId = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();
		typeId.setExtension("POCD_HD000040");
		doc.setTypeId(typeId);

		II id = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.4", "c266");
		doc.setId(id);

		II templateId = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.27.1776");
		doc.getTemplateIds().add(templateId);

		CE code = DatatypesFactory.eINSTANCE.createCE("11488-4", "2.16.840.1.113883.6.1", "LOINC", "Consultation note");
		doc.setCode(code);

		ST title = DatatypesFactory.eINSTANCE.createST("Good Health Clinic Consultation Note");
		doc.setTitle(title);

		TS effectiveTime = DatatypesFactory.eINSTANCE.createTS("20000407");
		doc.setEffectiveTime(effectiveTime);

		CE confidentialityCode = DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.5.25");
		doc.setConfidentialityCode(confidentialityCode);

		RecordTarget recordTarget = CDAFactory.eINSTANCE.createRecordTarget();
		doc.getRecordTargets().add(recordTarget);

		PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();
		recordTarget.setPatientRole(patientRole);

		Patient patient = CDAFactory.eINSTANCE.createPatient();
		patientRole.setPatient(patient);

		PN name = DatatypesFactory.eINSTANCE.createPN();
		name.addGiven("Henry").addFamily("Levin").addSuffix("the 7th");
		patient.getNames().add(name);

		CE administrativeGenderCode = DatatypesFactory.eINSTANCE.createCE("M", "2.16.840.1.113883.5.1");
		patient.setAdministrativeGenderCode(administrativeGenderCode);

		TS birthTime = DatatypesFactory.eINSTANCE.createTS("19320924");
		patient.setBirthTime(birthTime);

		Organization providerOrganization = CDAFactory.eINSTANCE.createOrganization();
		providerOrganization.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.5"));
		patientRole.setProviderOrganization(providerOrganization);

		Author author = CDAFactory.eINSTANCE.createAuthor();
		author.setTime(DatatypesFactory.eINSTANCE.createTS("2000040714"));
		doc.getAuthors().add(author);

		AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
		assignedAuthor.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.5", "KP00017"));
		author.setAssignedAuthor(assignedAuthor);

		Person assignedPerson = CDAFactory.eINSTANCE.createPerson();
		assignedAuthor.setAssignedPerson(assignedPerson);

		name = DatatypesFactory.eINSTANCE.createPN();
		name.addGiven("Bob").addFamily("Dolin").addSuffix("MD");
		assignedPerson.getNames().add(name);

		Section section = CDAFactory.eINSTANCE.createSection();
		Encounter encounter = CDAFactory.eINSTANCE.createEncounter();

		encounter.setPriorityCode(DatatypesFactory.eINSTANCE.createCE("code", "system"));
		encounter.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("low", "high"));
		encounter.getSDTCDischargeDispositionCodes().add(DatatypesFactory.eINSTANCE.createCE("code", "system"));
		encounter.addAct(CDAFactory.eINSTANCE.createAct());

		section.addEncounter(encounter);
		doc.addSection(section);

		System.out.println("***** Constructed example *****");
		CDAUtil.save(doc, System.out);
		System.out.println();

		// create a validation result object to collect diagnostics produced during validation
		ValidationResult result = new ValidationResult();
		ClinicalDocument clinicalDocument = CDAUtil.load(new FileInputStream("samples/SampleCDADocument.xml"), result);

		System.out.println("\n***** Reserialization of sample *****");
		System.out.println(clinicalDocument);
		CDAUtil.save(clinicalDocument, System.out);
		System.out.println();

		System.out.println("\n***** Sample validation results *****");
		for (Diagnostic diagnostic : result.getErrorDiagnostics()) {
			System.out.println("ERROR: " + diagnostic.getMessage());
		}
		for (Diagnostic diagnostic : result.getWarningDiagnostics()) {
			System.out.println("WARNING: " + diagnostic.getMessage());
		}

		System.out.println(
			"Number of Schema Validation Diagnostics: " + result.getSchemaValidationDiagnostics().size());
		System.out.println("Number of EMF Resource Diagnostics: " + result.getEMFResourceDiagnostics().size());
		System.out.println("Number of EMF Validation Diagnostics: " + result.getEMFValidationDiagnostics().size());
		System.out.println("Number of Total Diagnostics: " + result.getAllDiagnostics().size());

		if (!result.hasErrors()) {
			System.out.println("Document is valid");
		} else {
			System.out.println("Document is invalid");
		}

		testSDTCDischargeDispositionCodes();

	}
}
