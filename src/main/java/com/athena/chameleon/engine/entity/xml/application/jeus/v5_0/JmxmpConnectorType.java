//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.17 at 02:39:44 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.jeus.v5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jmxmp-connectorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jmxmp-connectorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jmxmp-connector-port" type="{http://www.tmaxsoft.com/xml/ns/jeus}nonNegativeIntType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jmxmp-connectorType", propOrder = {
    "jmxmpConnectorPort"
})
public class JmxmpConnectorType {

    @XmlElement(name = "jmxmp-connector-port", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "0")
    protected Integer jmxmpConnectorPort;

    /**
     * Gets the value of the jmxmpConnectorPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJmxmpConnectorPort() {
        return jmxmpConnectorPort;
    }

    /**
     * Sets the value of the jmxmpConnectorPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJmxmpConnectorPort(Integer value) {
        this.jmxmpConnectorPort = value;
    }

}
