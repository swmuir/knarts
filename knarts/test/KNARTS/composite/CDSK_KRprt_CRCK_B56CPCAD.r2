<?xml version="1.0" encoding="UTF-8"?>
<compositeKnowledgeDocument xmlns="urn:hl7-org:knowledgeartifact:r2" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="urn:hl7-org:knowledgeartifact:r2 ../../compositeschema/knowledgeartifact/compositeknowledgedocument.xsd urn:hl7-org:elm:r1 ../../compositeschema/elm/clinicalexpression.xsd urn:hl7-org:elm-types:r1 ../../compositeschema/elm/types.xsd" xmlns:elm="urn:hl7-org:elm:r1" xmlns:t="urn:hl7-org:elm-types:r1" xmlns:dt="urn:hl7-org:cdsdt:r2">
	<metadata>
		<identifiers>
			<identifier root="urn:va.gov:kbs:knart:artifact:r1" extension="2c272096-e0dd-5540-9a91-ed155e0927ce" version="1.0" identifierName="B56"/>
			<identifier root="urn:va.gov:kbs:contract:VA118-16-D-1008:to:VA-118-16-F-1008-0007" extension="CLIN0006AC"
				identifierName="Contract: VA118-16-D-1008, Task Order (TO): VA-118-16-F-1008-0007, CLIN0006AC"/>
			<identifier root="urn:cognitivemedicine.com:lab:jira" extension="KP-921" identifierName="Jira KP-921"/>
		</identifiers>
		<artifactType value="Composite"/>
		<schemaIdentifier root="urn:hl7-org:knowledgeartifact:r2" version="1"/>
		<dataModels>
			<modelReference>
				<!-- Based on the composite data models -->
				<description value="VA Analysis Normal Form Model"/>
				<referencedModel value="urn:solor.io:anf-model:0.8"/>
			</modelReference>
		</dataModels>
		<title value="Cardiology: Chest Pain (CP) / Coronary Artery Disease (CAD)"/>
		<description value="The “Chest Pain (CP) / Coronary Artery Disease (CAD) Consult Request/Composite” knowledge artifact is intended to harmonize and integrate related knowledge artifacts (documentation template and order set) to facilitate referral to cardiology for adult patients with stable CP (with or without known CAD).  The intent is to ensure that information required by the consulting specialist is available for the consultation, both by provision of historical data in the documentation template and by facilitating appropriate workup and treatment using the order set."/>
		<status value="Draft"/>
		<eventHistory>
			<artifactLifeCycleEvent>
				<eventType value="Pre-published"/>
				<eventDateTime value="20180418"/>
			</artifactLifeCycleEvent>
			<artifactLifeCycleEvent>
				<eventType value="Published"/>
				<eventDateTime value="20180622"/>
			</artifactLifeCycleEvent>
		</eventHistory>
		<publishers>
			<publisher xsi:type="Organization">
				<name value="Department of Veterans Affairs"/>
			</publisher>
		</publishers>
		<usageTerms>
			<rightsDeclaration>
				<assertedRights
					value="Copyright 2018 B3 Group, Inc.
					NOTICE OF GOVERNMENT COPYRIGHT LICENSE AND UNLIMITED RIGHTS LICENSE
					Licensed under the Apache License, Version 2.0 (the &quot;License&quot;); you may not use this file except in compliance with the License.
					You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
					Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an &quot;AS IS&quot; BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
					Portions of this content are derivative works from content produced by Cognitive Medical Systems, Inc. licensed under the Apache License, Version 2.0.
					Additional portions of this content are derivative works from content contributed by Motive Medical Intelligence Inc., under Creative Commons Attribution-ShareAlike 4.0.
					Contributions from 2013-2018 were performed either by US Government employees, or under US Veterans Health Administration contracts.
					US Veterans Health Administration contributions by government employees are work of the U.S. Government and are not subject to copyright protection in the United States. Portions contributed by government employees are USGovWork (17USC §105). Not subject to copyright.
					See: https://www.usa.gov/government-works
					Contribution by contractors to the US Veterans Health Administration during this period are contractually contributed under the Apache License, Version 2.0 and US Government sponsorship is acknowledged under Contract VA118-16-D-1008, Task Order VA11817F10080007."/>
				<rightsHolder xsi:type="Organization">
					<addresses>
						<address>
							<dt:part type="AL" value="10156 Tapestry Ct"/>
							<dt:part type="ADL" value=""/>
							<dt:part type="CTY" value="Fairfax"/>
							<dt:part type="STA" value="VA"/>
							<dt:part type="ZIP" value="22032"/>
						</address>
					</addresses>
					<name value="B3 Group, Inc."/>
				</rightsHolder>
			</rightsDeclaration>
			<rightsDeclaration>
				<assertedRights
					value="Copyright 2018 Cognitive Medical Systems, Inc.
					Licensed under the Apache License, Version 2.0 (the &quot;License&quot;); you may not use this file except in compliance with the License.
					You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
					Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an &quot;AS IS&quot; BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
					This and related content produced by Cognitive Medical Systems, Inc. licensed under the Apache License, Version 2.0 is available at: https://bitbucket.org/cogmedsys/hl7-kas-examples
					Additional portions of this content are derivative works from content contributed by Motive Medical Intelligence Inc., under Creative Commons Attribution-ShareAlike 4.0. https://bitbucket.org/cogmedsys/kas-source-material
					Contributions from 2013-2018 were performed either by US Government employees, or under US Veterans Health Administration contracts.
					US Veterans Health Administration contributions by government employees are work of the U.S. Government and are not subject to copyright protection in the United States. Portions contributed by government employees are USGovWork (17USC §105). Not subject to copyright. See: https://www.usa.gov/government-works
					Contribution by contractors to the US Veterans Health Administration during this period are contractually contributed under the Apache License, Version 2.0 and US Government sponsorship is acknowledged under Contract VA118-16-D-1008-0007."/>
				<rightsHolder xsi:type="Organization">
					<addresses>
						<address>
							<dt:part type="AL" value="9444 Waples Street"/>
							<dt:part type="ADL" value="Suite 300"/>
							<dt:part type="CTY" value="San Diego"/>
							<dt:part type="STA" value="CA"/>
							<dt:part type="ZIP" value="92121"/>
						</address>
					</addresses>
					<name value="Cognitive Medical Systems, Inc."/>
				</rightsHolder>
			</rightsDeclaration>
		</usageTerms>
	</metadata>
	<controlBlock>
		<controllingArtifact bindingName="main"/>
	</controlBlock>
	<containedArtifacts>
		<artifact>
			<artifactType value="Rule"/>
			<name value="Main controller"/>
			<bindingName value="main"/>
			<inclusionCriteria/>
			<knowledgeDocument>
				<metadata>
					<identifiers>
						<identifier root="urn:cognitivemedicine.com:lab:knart:internaluseonly" identifierName="main"/>
					</identifiers>
					<artifactType value="Rule"/>
					<schemaIdentifier root="urn:hl7-org:knowledgeartifact:r2" version="1"/>
					<title value="main controller"/>
					<status value="Draft"/>
				</metadata>
				<actionGroup>
					<subElements>
						<simpleAction xsi:type="FireEventAction">
							<eventType eventType="NamedEvent"/>
							<actionSentence xsi:type="elm:Instance" classType="xml:lang">
								<elm:element name="EventName">
									<elm:value xsi:type="elm:Literal" value="FireDocTemplate" valueType="t:String"/>
								</elm:element>
							</actionSentence>
						</simpleAction>
					</subElements>
				</actionGroup>
			</knowledgeDocument>
		</artifact>
		<artifact>
			<artifactType value="Documentation Template"/>
			<name value="TheDocumentTemplate"/>
			<bindingName value="BaseTemplate"/>
			<eventBinding>
				<bindingModel model="Encapsulated"/>
				<triggers>
					<trigger xsi:type="NamedEventTrigger" onEventName="FireDocTemplate"/>
				</triggers>
			</eventBinding>
			<reference>
				<url address="CDSK_KRprt_CRDT_B35CPCAD.xml"/>
				<uuid value="cdf88754-ad05-53d2-a87d-1a959a52c8cb"/>
				<identifiers>
					<identifier root="urn:va.gov:kbs:knart:artifact:r1" extension="b098e1ee-609b-5225-b023-56083333057c" identifierName="B35" version="1.0"/>
				</identifiers>
			</reference>
			<onCompletion>
				<eventDefinition>
					<eventName name="DocumentationCompleteEvent"/>
				</eventDefinition>
			</onCompletion>
		</artifact>
		<artifact>
			<artifactType value="Rule"/>
			<name value="RouteOnTempleteComplete"/>
			<bindingName value="router"/>
			<inclusionCriteria/>
			<knowledgeDocument>
				<metadata>
					<identifiers>
						<identifier root="urn:cognitivemedicine.com:lab:knart:internaluseonly" identifierName="router"/>
					</identifiers>
					<artifactType value="Rule"/>
					<schemaIdentifier root="urn:hl7-org:knowledgeartifact:r2" version="1"/>
					<title value="Composite Router"/>
					<status value="Draft"/>
				</metadata>
				<triggers>
					<trigger xsi:type="NamedEventTrigger" onEventName="DocumentationCompleteEvent">
						<textEquivalent value="Trigger when the Documentation Template is Complete"></textEquivalent>
					</trigger>
				</triggers>
				<actionGroup>
					<subElements>
						<simpleAction xsi:type="FireEventAction">
							<conditions>
								<condition>
									<!-- Validate that the patient was not unstable -->
									<logic xsi:type="elm:IsNull">
										<elm:operand xsi:type="elm:Property" path="DocumentationCompleteEvent.Responses.patientWasUnstable"/>
									</logic>
									<conditionRole value="ApplicableScenario"/>
								</condition>
							</conditions>
							<eventType eventType="NamedEvent"></eventType>
							<actionSentence xsi:type="elm:Instance" classType="xml:lang">
								<elm:element name="EventName">
									<elm:value xsi:type="elm:Literal" value="FireOrderSet" valueType="t:String"/>
								</elm:element>
							</actionSentence>
						</simpleAction>
					</subElements>
				</actionGroup>
			</knowledgeDocument>
		</artifact>
		<artifact>
			<artifactType value="Order Set"/>
			<name value="TheOrderSet"/>
			<bindingName value="OrderSet"/>
			<eventBinding>
				<bindingModel model="Encapsulated"/>
				<triggers>
					<trigger xsi:type="NamedEventTrigger" onEventName="FireOrderSet">
					</trigger>
				</triggers>
			</eventBinding>
			<reference>
				<url address="CDSK_KRprt_OS_B5CPCAD.xml"/>
				<uuid value="ce30ff93-c0ab-572b-bcfe-fbd34a085d21"/>
				<identifiers>
					<identifier root="urn:va.gov:kbs:knart:artifact:r1" extension="ce30ff93-c0ab-572b-bcfe-fbd34a085d21" version="1.0" identifierName="B5"/>
				</identifiers>
			</reference>
		</artifact>
	</containedArtifacts>
</compositeKnowledgeDocument>
