//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.6 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2012.09.12 시간 04:26:39 PM KST 
//


package com.athena.chameleon.engine.entity.xml.ejbjar.weblogic.v8_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "maxBeansInFreePool",
    "initialBeansInFreePool"
})
@XmlRootElement(name = "pool")
public class Pool {

    @XmlElement(name = "max-beans-in-free-pool")
    protected String maxBeansInFreePool;
    @XmlElement(name = "initial-beans-in-free-pool")
    protected String initialBeansInFreePool;

    /**
     * maxBeansInFreePool 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxBeansInFreePool() {
        return maxBeansInFreePool;
    }

    /**
     * maxBeansInFreePool 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxBeansInFreePool(String value) {
        this.maxBeansInFreePool = value;
    }

    /**
     * initialBeansInFreePool 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialBeansInFreePool() {
        return initialBeansInFreePool;
    }

    /**
     * initialBeansInFreePool 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialBeansInFreePool(String value) {
        this.initialBeansInFreePool = value;
    }

}
