package org.eclipse.mdht.fhir.converter.jackson;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.impl.ResourceImpl;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@XmlJavaTypeAdapter(ResourceContainerImplAdapter.class)
@JsonDeserialize(using = JaxbBasedDeserializer.class, as = ResourceImpl.class)
@JsonSerialize(using = JaxbBasedSerializer.class, as = ResourceContainer.class)
public interface MixinResourceContainer {

}
