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


/**
 * <p>Java class for creating-tableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creating-tableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="use-existing-table" type="{http://www.tmaxsoft.com/xml/ns/jeus}emptyType" minOccurs="0"/>
 *         &lt;element name="force-creating-table" type="{http://www.tmaxsoft.com/xml/ns/jeus}emptyType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creating-tableType", propOrder = {
    "useExistingTable",
    "forceCreatingTable"
})
public class CreatingTableType {

    @XmlElement(name = "use-existing-table", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected EmptyType useExistingTable;
    @XmlElement(name = "force-creating-table", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected EmptyType forceCreatingTable;

    /**
     * Gets the value of the useExistingTable property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getUseExistingTable() {
        return useExistingTable;
    }

    /**
     * Sets the value of the useExistingTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setUseExistingTable(EmptyType value) {
        this.useExistingTable = value;
    }

    /**
     * Gets the value of the forceCreatingTable property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getForceCreatingTable() {
        return forceCreatingTable;
    }

    /**
     * Sets the value of the forceCreatingTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setForceCreatingTable(EmptyType value) {
        this.forceCreatingTable = value;
    }

}
