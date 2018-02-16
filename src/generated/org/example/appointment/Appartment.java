//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.16 at 10:49:26 PM CET 
//


package org.example.appointment;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Appartment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Appartment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.example.org/Appointment}Address"/>
 *         &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="freeFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="monthlyCosts" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Appartment", propOrder = {
    "address",
    "floor",
    "freeFrom",
    "monthlyCosts"
})
public class Appartment
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected Address address;
    protected int floor;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar freeFrom;
    protected float monthlyCosts;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     */
    public int getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     */
    public void setFloor(int value) {
        this.floor = value;
    }

    /**
     * Gets the value of the freeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFreeFrom() {
        return freeFrom;
    }

    /**
     * Sets the value of the freeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFreeFrom(XMLGregorianCalendar value) {
        this.freeFrom = value;
    }

    /**
     * Gets the value of the monthlyCosts property.
     * 
     */
    public float getMonthlyCosts() {
        return monthlyCosts;
    }

    /**
     * Sets the value of the monthlyCosts property.
     * 
     */
    public void setMonthlyCosts(float value) {
        this.monthlyCosts = value;
    }

	@Override
	public String toString() {
		return "Appartment [address=" + address + ", floor=" + floor + ", freeFrom=" + freeFrom + ", monthlyCosts="
				+ monthlyCosts + "]";
	}

    
}