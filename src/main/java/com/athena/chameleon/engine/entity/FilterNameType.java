//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.24 at 04:01:54 오후 KST 
//


package com.athena.chameleon.engine.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * 	The logical name of the filter is declare
 * 	by using filter-nameType. This name is used to map the
 * 	filter.  Each filter name is unique within the web
 * 	application.
 * 
 * 	Used in: filter, filter-mapping
 * 
 *       
 * 
 * <p>Java class for filter-nameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filter-nameType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://java.sun.com/xml/ns/javaee>nonEmptyStringType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filter-nameType")
public class FilterNameType
    extends NonEmptyStringType
{


}