//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.04 at 12:32:21 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.ejbjar.jeus.v5_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ejb-relation-mapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ejb-relation-mapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relation-name" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="table-name" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="jeus-relationship-role" type="{http://www.tmaxsoft.com/xml/ns/jeus}jeus-relationship-roleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejb-relation-mapType", propOrder = {
    "relationName",
    "tableName",
    "jeusRelationshipRole"
})
public class EjbRelationMapType {

    @XmlElement(name = "relation-name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String relationName;
    @XmlElement(name = "table-name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tableName;
    @XmlElement(name = "jeus-relationship-role")
    protected List<JeusRelationshipRoleType> jeusRelationshipRole;

    /**
     * Gets the value of the relationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationName() {
        return relationName;
    }

    /**
     * Sets the value of the relationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationName(String value) {
        this.relationName = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the jeusRelationshipRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jeusRelationshipRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJeusRelationshipRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JeusRelationshipRoleType }
     * 
     * 
     */
    public List<JeusRelationshipRoleType> getJeusRelationshipRole() {
        if (jeusRelationshipRole == null) {
            jeusRelationshipRole = new ArrayList<JeusRelationshipRoleType>();
        }
        return this.jeusRelationshipRole;
    }

}
