//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.04 at 12:32:21 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.ejbjar.jeus.v5_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for signatureAlgorithmType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="signatureAlgorithmType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http://www.w3.org/2000/09/xmldsig#dsa-sha1"/>
 *     &lt;enumeration value="http://www.w3.org/2000/09/xmldsig#rsa-sha1"/>
 *     &lt;enumeration value="http://www.w3.org/2000/09/xmldsig#hmac-sha1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "signatureAlgorithmType")
@XmlEnum
public enum SignatureAlgorithmType {


    /**
     * 
     * 						[Description]: DSS(DSAWithSHA1)
     * 					
     * 
     */
    @XmlEnumValue("http://www.w3.org/2000/09/xmldsig#dsa-sha1")
    HTTP_WWW_W_3_ORG_2000_09_XMLDSIG_DSA_SHA_1("http://www.w3.org/2000/09/xmldsig#dsa-sha1"),

    /**
     * 
     * 						[Description]: RSAWithSHA1
     * 					
     * 
     */
    @XmlEnumValue("http://www.w3.org/2000/09/xmldsig#rsa-sha1")
    HTTP_WWW_W_3_ORG_2000_09_XMLDSIG_RSA_SHA_1("http://www.w3.org/2000/09/xmldsig#rsa-sha1"),

    /**
     * 
     * [Description]: HMACSHA1
     * 
     * 
     */
    @XmlEnumValue("http://www.w3.org/2000/09/xmldsig#hmac-sha1")
    HTTP_WWW_W_3_ORG_2000_09_XMLDSIG_HMAC_SHA_1("http://www.w3.org/2000/09/xmldsig#hmac-sha1");
    private final String value;

    SignatureAlgorithmType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignatureAlgorithmType fromValue(String v) {
        for (SignatureAlgorithmType c: SignatureAlgorithmType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
