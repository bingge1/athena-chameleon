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
 * <p>Java class for classloader-structureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="classloader-structureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="module-ref" type="{http://www.bea.com/ns/weblogic/weblogic-application}module-refType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="classloader-structure" type="{http://www.bea.com/ns/weblogic/weblogic-application}classloader-structureType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classloader-structureType", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", propOrder = {
    "moduleRef",
    "classloaderStructure"
})
public class ClassloaderStructureType {

    @XmlElement(name = "module-ref", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", required = true)
    protected List<ModuleRefType> moduleRef;
    @XmlElement(name = "classloader-structure", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", required = true)
    protected List<ClassloaderStructureType> classloaderStructure;

    /**
     * Gets the value of the moduleRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moduleRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModuleRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModuleRefType }
     * 
     * 
     */
    public List<ModuleRefType> getModuleRef() {
        if (moduleRef == null) {
            moduleRef = new ArrayList<ModuleRefType>();
        }
        return this.moduleRef;
    }

    /**
     * Gets the value of the classloaderStructure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classloaderStructure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassloaderStructure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassloaderStructureType }
     * 
     * 
     */
    public List<ClassloaderStructureType> getClassloaderStructure() {
        if (classloaderStructure == null) {
            classloaderStructure = new ArrayList<ClassloaderStructureType>();
        }
        return this.classloaderStructure;
    }

}