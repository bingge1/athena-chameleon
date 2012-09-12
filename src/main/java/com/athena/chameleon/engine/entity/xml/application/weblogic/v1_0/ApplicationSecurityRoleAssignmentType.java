//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.12 at 01:39:08 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for application-security-role-assignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="application-security-role-assignmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="role-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="principal-name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *           &lt;element name="externally-defined" type="{http://java.sun.com/xml/ns/javaee}emptyType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "application-security-role-assignmentType", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", propOrder = {
    "roleName",
    "principalName",
    "externallyDefined"
})
public class ApplicationSecurityRoleAssignmentType {

    @XmlElement(name = "role-name", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", required = true)
    protected java.lang.String roleName;
    @XmlElement(name = "principal-name", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", required = true)
    protected List<java.lang.String> principalName;
    @XmlElement(name = "externally-defined", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected EmptyType externallyDefined;

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRoleName(java.lang.String value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the principalName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getPrincipalName() {
        if (principalName == null) {
            principalName = new ArrayList<java.lang.String>();
        }
        return this.principalName;
    }

    /**
     * Gets the value of the externallyDefined property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getExternallyDefined() {
        return externallyDefined;
    }

    /**
     * Sets the value of the externallyDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setExternallyDefined(EmptyType value) {
        this.externallyDefined = value;
    }

}