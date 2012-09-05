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
 * <p>Java class for encKeyIdentifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="encKeyIdentifierType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IssuerSerial"/>
 *     &lt;enumeration value="DirectReference"/>
 *     &lt;enumeration value="SKIKeyIdentifier"/>
 *     &lt;enumeration value="X509KeyIdentifier"/>
 *     &lt;enumeration value="EmbeddedKeyName"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum EncKeyIdentifierType {

    @XmlEnumValue("DirectReference")
    DIRECT_REFERENCE("DirectReference"),
    @XmlEnumValue("EmbeddedKeyName")
    EMBEDDED_KEY_NAME("EmbeddedKeyName"),
    @XmlEnumValue("IssuerSerial")
    ISSUER_SERIAL("IssuerSerial"),
    @XmlEnumValue("SKIKeyIdentifier")
    SKI_KEY_IDENTIFIER("SKIKeyIdentifier"),
    @XmlEnumValue("X509KeyIdentifier")
    X_509_KEY_IDENTIFIER("X509KeyIdentifier");
    private final String value;

    EncKeyIdentifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncKeyIdentifierType fromValue(String v) {
        for (EncKeyIdentifierType c: EncKeyIdentifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
