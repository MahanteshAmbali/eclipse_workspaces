
package com.tesco.service.impl.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.2
 * Sun Aug 30 12:53:44 IST 2015
 * Generated source version: 3.1.2
 */

@XmlRootElement(name = "validateCriditCard", namespace = "http://impl.service.tesco.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateCriditCard", namespace = "http://impl.service.tesco.com/")

public class ValidateCriditCard {

    @XmlElement(name = "arg0")
    private java.lang.Integer arg0;

    public java.lang.Integer getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.Integer newArg0)  {
        this.arg0 = newArg0;
    }

}
