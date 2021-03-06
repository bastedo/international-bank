//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.14 at 06:57:19 AM CEST 
//


package com.tim15.model.xml.izvestajBanke;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StavkaIzvestajaBanke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StavkaIzvestajaBanke">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="racun" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="klijentId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="datumOtvaranja" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="valuta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stanje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="15"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StavkaIzvestajaBanke", propOrder = {
    "racun",
    "klijentId",
    "datumOtvaranja",
    "valuta",
    "stanje"
})
public class StavkaIzvestajaBanke {

    @XmlElement(required = true)
    protected String racun;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger klijentId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumOtvaranja;
    @XmlElement(required = true)
    protected String valuta;
    @XmlElement(required = true)
    protected BigDecimal stanje;

    /**
     * Gets the value of the racun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRacun() {
        return racun;
    }

    /**
     * Sets the value of the racun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRacun(String value) {
        this.racun = value;
    }

    /**
     * Gets the value of the klijentId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKlijentId() {
        return klijentId;
    }

    /**
     * Sets the value of the klijentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKlijentId(BigInteger value) {
        this.klijentId = value;
    }

    /**
     * Gets the value of the datumOtvaranja property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumOtvaranja() {
        return datumOtvaranja;
    }

    /**
     * Sets the value of the datumOtvaranja property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumOtvaranja(XMLGregorianCalendar value) {
        this.datumOtvaranja = value;
    }

    /**
     * Gets the value of the valuta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuta() {
        return valuta;
    }

    /**
     * Sets the value of the valuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuta(String value) {
        this.valuta = value;
    }

    /**
     * Gets the value of the stanje property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStanje() {
        return stanje;
    }

    /**
     * Sets the value of the stanje property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStanje(BigDecimal value) {
        this.stanje = value;
    }

}
