//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.14 at 07:19:59 PM GST 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ccbcase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ccbcase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wonum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="caseid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccbcase", propOrder = {
    "wonum",
    "lang",
    "caseid"
})
public class Ccbcase {

    @XmlElement(required = true)
    protected String wonum;
    @XmlElement(required = true)
    protected String lang;
    @XmlElement(required = true)
    protected String caseid;

    /**
     * Gets the value of the wonum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWonum() {
        return wonum;
    }

    /**
     * Sets the value of the wonum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWonum(String value) {
        this.wonum = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the caseid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseid() {
        return caseid;
    }

    /**
     * Sets the value of the caseid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseid(String value) {
        this.caseid = value;
    }

}
