//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.05 at 10:14:54 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.jeusejbdd.v6_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for user-handlerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user-handlerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmaxsoft.com/xml/ns/jeus}common-handlerType">
 *       &lt;sequence>
 *         &lt;element name="handler-class" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="handler-property" type="{http://www.tmaxsoft.com/xml/ns/jeus}handlerPropertySetType" minOccurs="0"/>
 *         &lt;element name="formatter-class" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="formatter-property" type="{http://www.tmaxsoft.com/xml/ns/jeus}handlerPropertySetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user-handlerType", propOrder = {
    "handlerClass",
    "handlerProperty",
    "formatterClass",
    "formatterProperty"
})
public class UserHandlerType
    extends CommonHandlerType
{

    @XmlElement(name = "handler-class", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String handlerClass;
    @XmlElement(name = "handler-property", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected HandlerPropertySetType handlerProperty;
    @XmlElement(name = "formatter-class", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "jeus.util.logging.SimpleFormatter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatterClass;
    @XmlElement(name = "formatter-property", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected HandlerPropertySetType formatterProperty;

    /**
     * Gets the value of the handlerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlerClass() {
        return handlerClass;
    }

    /**
     * Sets the value of the handlerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlerClass(String value) {
        this.handlerClass = value;
    }

    /**
     * Gets the value of the handlerProperty property.
     * 
     * @return
     *     possible object is
     *     {@link HandlerPropertySetType }
     *     
     */
    public HandlerPropertySetType getHandlerProperty() {
        return handlerProperty;
    }

    /**
     * Sets the value of the handlerProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlerPropertySetType }
     *     
     */
    public void setHandlerProperty(HandlerPropertySetType value) {
        this.handlerProperty = value;
    }

    /**
     * Gets the value of the formatterClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatterClass() {
        return formatterClass;
    }

    /**
     * Sets the value of the formatterClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatterClass(String value) {
        this.formatterClass = value;
    }

    /**
     * Gets the value of the formatterProperty property.
     * 
     * @return
     *     possible object is
     *     {@link HandlerPropertySetType }
     *     
     */
    public HandlerPropertySetType getFormatterProperty() {
        return formatterProperty;
    }

    /**
     * Sets the value of the formatterProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlerPropertySetType }
     *     
     */
    public void setFormatterProperty(HandlerPropertySetType value) {
        this.formatterProperty = value;
    }

}
