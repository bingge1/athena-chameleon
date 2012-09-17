//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.17 at 02:39:44 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.jeus.v5_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for invocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="invocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invocation-method" type="{http://www.tmaxsoft.com/xml/ns/jeus}methodParamType"/>
 *         &lt;element name="invocation-argument" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="invocation-type" type="{http://www.tmaxsoft.com/xml/ns/jeus}invocation-typeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invocationType", propOrder = {
    "invocationMethod",
    "invocationArgument",
    "invocationType"
})
public class InvocationType {

    @XmlElement(name = "invocation-method", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected MethodParamType invocationMethod;
    @XmlElementRef(name = "invocation-argument", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", type = JAXBElement.class)
    protected List<JAXBElement<String>> invocationArgument;
    @XmlElement(name = "invocation-type", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected InvocationTypeType invocationType;

    /**
     * Gets the value of the invocationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link MethodParamType }
     *     
     */
    public MethodParamType getInvocationMethod() {
        return invocationMethod;
    }

    /**
     * Sets the value of the invocationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodParamType }
     *     
     */
    public void setInvocationMethod(MethodParamType value) {
        this.invocationMethod = value;
    }

    /**
     * Gets the value of the invocationArgument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invocationArgument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvocationArgument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getInvocationArgument() {
        if (invocationArgument == null) {
            invocationArgument = new ArrayList<JAXBElement<String>>();
        }
        return this.invocationArgument;
    }

    /**
     * Gets the value of the invocationType property.
     * 
     * @return
     *     possible object is
     *     {@link InvocationTypeType }
     *     
     */
    public InvocationTypeType getInvocationType() {
        return invocationType;
    }

    /**
     * Sets the value of the invocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvocationTypeType }
     *     
     */
    public void setInvocationType(InvocationTypeType value) {
        this.invocationType = value;
    }

}
