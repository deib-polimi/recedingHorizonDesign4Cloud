//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.11 at 06:33:42 AM CET 
//


package it.polimi.modaclouds.adaptationDesignTime4Cloud.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for container complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="container">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationTier" type="{}applicationTier" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="capacity" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxReserved" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="reservedCost" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="onDemandCost" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "container", propOrder = {
    "applicationTier"
})
public class Container {

    @XmlElement(required = true)
    protected List<ApplicationTier> applicationTier;
    @XmlAttribute(name = "capacity", required = true)
    protected float capacity;
    @XmlAttribute(name = "maxReserved", required = true)
    protected int maxReserved;
    @XmlAttribute(name = "reservedCost", required = true)
    protected float reservedCost;
    @XmlAttribute(name = "onDemandCost", required = true)
    protected float onDemandCost;

    /**
     * Gets the value of the applicationTier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationTier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationTier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationTier }
     * 
     * 
     */
    public List<ApplicationTier> getApplicationTier() {
        if (applicationTier == null) {
            applicationTier = new ArrayList<ApplicationTier>();
        }
        return this.applicationTier;
    }

    /**
     * Gets the value of the capacity property.
     * 
     */
    public float getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     */
    public void setCapacity(float value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the maxReserved property.
     * 
     */
    public int getMaxReserved() {
        return maxReserved;
    }

    /**
     * Sets the value of the maxReserved property.
     * 
     */
    public void setMaxReserved(int value) {
        this.maxReserved = value;
    }

    /**
     * Gets the value of the reservedCost property.
     * 
     */
    public float getReservedCost() {
        return reservedCost;
    }

    /**
     * Sets the value of the reservedCost property.
     * 
     */
    public void setReservedCost(float value) {
        this.reservedCost = value;
    }

    /**
     * Gets the value of the onDemandCost property.
     * 
     */
    public float getOnDemandCost() {
        return onDemandCost;
    }

    /**
     * Sets the value of the onDemandCost property.
     * 
     */
    public void setOnDemandCost(float value) {
        this.onDemandCost = value;
    }

}
