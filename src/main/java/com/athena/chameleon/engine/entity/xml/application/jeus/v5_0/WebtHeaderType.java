//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.17 at 02:39:44 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.jeus.v5_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for webt-headerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="webt-headerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="extendedV2"/>
 *     &lt;enumeration value="extendedV3"/>
 *     &lt;enumeration value="extendedV4"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum WebtHeaderType {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("extendedV2")
    EXTENDED_V_2("extendedV2"),
    @XmlEnumValue("extendedV3")
    EXTENDED_V_3("extendedV3"),
    @XmlEnumValue("extendedV4")
    EXTENDED_V_4("extendedV4");
    private final String value;

    WebtHeaderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebtHeaderType fromValue(String v) {
        for (WebtHeaderType c: WebtHeaderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}