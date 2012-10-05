//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.05 at 01:53:24 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for loggingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loggingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="log-filename" type="{http://java.sun.com/xml/ns/j2ee}string" minOccurs="0"/>
 *         &lt;element name="logging-enabled" type="{http://www.bea.com/ns/weblogic/90}true-falseType" minOccurs="0"/>
 *         &lt;element name="rotation-type" type="{http://java.sun.com/xml/ns/j2ee}string" minOccurs="0"/>
 *         &lt;element name="number-of-files-limited" type="{http://www.bea.com/ns/weblogic/90}true-falseType" minOccurs="0"/>
 *         &lt;element name="file-count" type="{http://java.sun.com/xml/ns/j2ee}xsdPositiveIntegerType" minOccurs="0"/>
 *         &lt;element name="file-size-limit" type="{http://java.sun.com/xml/ns/j2ee}xsdPositiveIntegerType" minOccurs="0"/>
 *         &lt;element name="rotate-log-on-startup" type="{http://www.bea.com/ns/weblogic/90}true-falseType" minOccurs="0"/>
 *         &lt;element name="log-file-rotation-dir" type="{http://java.sun.com/xml/ns/j2ee}string" minOccurs="0"/>
 *         &lt;element name="rotation-time" type="{http://java.sun.com/xml/ns/j2ee}string" minOccurs="0"/>
 *         &lt;element name="file-time-span" type="{http://java.sun.com/xml/ns/j2ee}xsdPositiveIntegerType" minOccurs="0"/>
 *         &lt;element name="date-format-pattern" type="{http://java.sun.com/xml/ns/j2ee}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loggingType", propOrder = {
    "logFilename",
    "loggingEnabled",
    "rotationType",
    "numberOfFilesLimited",
    "fileCount",
    "fileSizeLimit",
    "rotateLogOnStartup",
    "logFileRotationDir",
    "rotationTime",
    "fileTimeSpan",
    "dateFormatPattern"
})
public class LoggingType {

    @XmlElement(name = "log-filename", namespace = "http://www.bea.com/ns/weblogic/90")
    protected com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String logFilename;
    @XmlElement(name = "logging-enabled", namespace = "http://www.bea.com/ns/weblogic/90")
    protected TrueFalseType loggingEnabled;
    @XmlElement(name = "rotation-type", namespace = "http://www.bea.com/ns/weblogic/90")
    protected com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String rotationType;
    @XmlElement(name = "number-of-files-limited", namespace = "http://www.bea.com/ns/weblogic/90")
    protected TrueFalseType numberOfFilesLimited;
    @XmlElement(name = "file-count", namespace = "http://www.bea.com/ns/weblogic/90")
    protected XsdPositiveIntegerType fileCount;
    @XmlElement(name = "file-size-limit", namespace = "http://www.bea.com/ns/weblogic/90")
    protected XsdPositiveIntegerType fileSizeLimit;
    @XmlElement(name = "rotate-log-on-startup", namespace = "http://www.bea.com/ns/weblogic/90")
    protected TrueFalseType rotateLogOnStartup;
    @XmlElement(name = "log-file-rotation-dir", namespace = "http://www.bea.com/ns/weblogic/90")
    protected com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String logFileRotationDir;
    @XmlElement(name = "rotation-time", namespace = "http://www.bea.com/ns/weblogic/90")
    protected com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String rotationTime;
    @XmlElement(name = "file-time-span", namespace = "http://www.bea.com/ns/weblogic/90")
    protected XsdPositiveIntegerType fileTimeSpan;
    @XmlElement(name = "date-format-pattern", namespace = "http://www.bea.com/ns/weblogic/90")
    protected com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String dateFormatPattern;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected java.lang.String id;

    /**
     * Gets the value of the logFilename property.
     * 
     * @return
     *     possible object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String }
     *     
     */
    public com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String getLogFilename() {
        return logFilename;
    }

    /**
     * Sets the value of the logFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String }
     *     
     */
    public void setLogFilename(com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String value) {
        this.logFilename = value;
    }

    /**
     * Gets the value of the loggingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getLoggingEnabled() {
        return loggingEnabled;
    }

    /**
     * Sets the value of the loggingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setLoggingEnabled(TrueFalseType value) {
        this.loggingEnabled = value;
    }

    /**
     * Gets the value of the rotationType property.
     * 
     * @return
     *     possible object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String }
     *     
     */
    public com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String getRotationType() {
        return rotationType;
    }

    /**
     * Sets the value of the rotationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String }
     *     
     */
    public void setRotationType(com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String value) {
        this.rotationType = value;
    }

    /**
     * Gets the value of the numberOfFilesLimited property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getNumberOfFilesLimited() {
        return numberOfFilesLimited;
    }

    /**
     * Sets the value of the numberOfFilesLimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setNumberOfFilesLimited(TrueFalseType value) {
        this.numberOfFilesLimited = value;
    }

    /**
     * Gets the value of the fileCount property.
     * 
     * @return
     *     possible object is
     *     {@link XsdPositiveIntegerType }
     *     
     */
    public XsdPositiveIntegerType getFileCount() {
        return fileCount;
    }

    /**
     * Sets the value of the fileCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsdPositiveIntegerType }
     *     
     */
    public void setFileCount(XsdPositiveIntegerType value) {
        this.fileCount = value;
    }

    /**
     * Gets the value of the fileSizeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link XsdPositiveIntegerType }
     *     
     */
    public XsdPositiveIntegerType getFileSizeLimit() {
        return fileSizeLimit;
    }

    /**
     * Sets the value of the fileSizeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsdPositiveIntegerType }
     *     
     */
    public void setFileSizeLimit(XsdPositiveIntegerType value) {
        this.fileSizeLimit = value;
    }

    /**
     * Gets the value of the rotateLogOnStartup property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getRotateLogOnStartup() {
        return rotateLogOnStartup;
    }

    /**
     * Sets the value of the rotateLogOnStartup property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setRotateLogOnStartup(TrueFalseType value) {
        this.rotateLogOnStartup = value;
    }

    /**
     * Gets the value of the logFileRotationDir property.
     * 
     * @return
     *     possible object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String }
     *     
     */
    public com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String getLogFileRotationDir() {
        return logFileRotationDir;
    }

    /**
     * Sets the value of the logFileRotationDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String }
     *     
     */
    public void setLogFileRotationDir(com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String value) {
        this.logFileRotationDir = value;
    }

    /**
     * Gets the value of the rotationTime property.
     * 
     * @return
     *     possible object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String }
     *     
     */
    public com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String getRotationTime() {
        return rotationTime;
    }

    /**
     * Sets the value of the rotationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String }
     *     
     */
    public void setRotationTime(com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String value) {
        this.rotationTime = value;
    }

    /**
     * Gets the value of the fileTimeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link XsdPositiveIntegerType }
     *     
     */
    public XsdPositiveIntegerType getFileTimeSpan() {
        return fileTimeSpan;
    }

    /**
     * Sets the value of the fileTimeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsdPositiveIntegerType }
     *     
     */
    public void setFileTimeSpan(XsdPositiveIntegerType value) {
        this.fileTimeSpan = value;
    }

    /**
     * Gets the value of the dateFormatPattern property.
     * 
     * @return
     *     possible object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String }
     *     
     */
    public com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String getDateFormatPattern() {
        return dateFormatPattern;
    }

    /**
     * Sets the value of the dateFormatPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String }
     *     
     */
    public void setDateFormatPattern(com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0.String value) {
        this.dateFormatPattern = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}