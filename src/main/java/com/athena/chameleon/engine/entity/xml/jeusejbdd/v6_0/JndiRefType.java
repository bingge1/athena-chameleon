//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.05 at 10:14:54 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.jeusejbdd.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jndi-refType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jndi-refType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jndi-info" type="{http://www.tmaxsoft.com/xml/ns/jeus}jndi-infoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jndi-refType", propOrder = {
    "jndiInfo"
})
public class JndiRefType {

    @XmlElement(name = "jndi-info", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<JndiInfoType> jndiInfo;

    /**
     * Gets the value of the jndiInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jndiInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJndiInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JndiInfoType }
     * 
     * 
     */
    public List<JndiInfoType> getJndiInfo() {
        if (jndiInfo == null) {
            jndiInfo = new ArrayList<JndiInfoType>();
        }
        return this.jndiInfo;
    }

}
