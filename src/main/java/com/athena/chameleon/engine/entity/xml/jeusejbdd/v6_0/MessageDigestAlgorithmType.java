//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.05 at 10:14:54 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.jeusejbdd.v6_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for messageDigestAlgorithmType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messageDigestAlgorithmType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http://www.w3.org/2000/09/xmldsig#sha1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum MessageDigestAlgorithmType {

    @XmlEnumValue("http://www.w3.org/2000/09/xmldsig#sha1")
    HTTP_WWW_W_3_ORG_2000_09_XMLDSIG_SHA_1("http://www.w3.org/2000/09/xmldsig#sha1");
    private final String value;

    MessageDigestAlgorithmType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageDigestAlgorithmType fromValue(String v) {
        for (MessageDigestAlgorithmType c: MessageDigestAlgorithmType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
