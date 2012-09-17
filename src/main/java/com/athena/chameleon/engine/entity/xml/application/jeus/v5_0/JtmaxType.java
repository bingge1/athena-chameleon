//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.17 at 02:39:44 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.jeus.v5_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for jtmaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jtmaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="context-name" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="listen-port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="webt-logging" type="{http://www.tmaxsoft.com/xml/ns/jeus}webt-file-handlerType" minOccurs="0"/>
 *         &lt;element name="pooling" type="{http://www.tmaxsoft.com/xml/ns/jeus}oldPoolingType" minOccurs="0"/>
 *         &lt;element name="ejb-service" type="{http://www.tmaxsoft.com/xml/ns/jeus}jtmax-ejb-serviceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="beans-service" type="{http://www.tmaxsoft.com/xml/ns/jeus}jtmax-beans-serviceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jtmaxType", propOrder = {
    "contextName",
    "listenPort",
    "webtLogging",
    "pooling",
    "ejbService",
    "beansService"
})
public class JtmaxType {

    @XmlElement(name = "context-name", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contextName;
    @XmlElement(name = "listen-port", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected int listenPort;
    @XmlElement(name = "webt-logging", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected WebtFileHandlerType webtLogging;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected OldPoolingType pooling;
    @XmlElement(name = "ejb-service", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<JtmaxEjbServiceType> ejbService;
    @XmlElement(name = "beans-service", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<JtmaxBeansServiceType> beansService;

    /**
     * Gets the value of the contextName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextName() {
        return contextName;
    }

    /**
     * Sets the value of the contextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextName(String value) {
        this.contextName = value;
    }

    /**
     * Gets the value of the listenPort property.
     * 
     */
    public int getListenPort() {
        return listenPort;
    }

    /**
     * Sets the value of the listenPort property.
     * 
     */
    public void setListenPort(int value) {
        this.listenPort = value;
    }

    /**
     * Gets the value of the webtLogging property.
     * 
     * @return
     *     possible object is
     *     {@link WebtFileHandlerType }
     *     
     */
    public WebtFileHandlerType getWebtLogging() {
        return webtLogging;
    }

    /**
     * Sets the value of the webtLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebtFileHandlerType }
     *     
     */
    public void setWebtLogging(WebtFileHandlerType value) {
        this.webtLogging = value;
    }

    /**
     * Gets the value of the pooling property.
     * 
     * @return
     *     possible object is
     *     {@link OldPoolingType }
     *     
     */
    public OldPoolingType getPooling() {
        return pooling;
    }

    /**
     * Sets the value of the pooling property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldPoolingType }
     *     
     */
    public void setPooling(OldPoolingType value) {
        this.pooling = value;
    }

    /**
     * Gets the value of the ejbService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ejbService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEjbService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JtmaxEjbServiceType }
     * 
     * 
     */
    public List<JtmaxEjbServiceType> getEjbService() {
        if (ejbService == null) {
            ejbService = new ArrayList<JtmaxEjbServiceType>();
        }
        return this.ejbService;
    }

    /**
     * Gets the value of the beansService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beansService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeansService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JtmaxBeansServiceType }
     * 
     * 
     */
    public List<JtmaxBeansServiceType> getBeansService() {
        if (beansService == null) {
            beansService = new ArrayList<JtmaxBeansServiceType>();
        }
        return this.beansService;
    }

}
