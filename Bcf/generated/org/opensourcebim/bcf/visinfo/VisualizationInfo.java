//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 08:24:56 AM CEST 
//


package org.opensourcebim.bcf.visinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Components" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Component" type="{}Component" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrthogonalCamera" type="{}OrthogonalCamera" minOccurs="0"/>
 *         &lt;element name="PerspectiveCamera" type="{}PerspectiveCamera" minOccurs="0"/>
 *         &lt;element name="Lines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Line" type="{}Line" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClippingPlanes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClippingPlane" type="{}ClippingPlane" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Bitmaps" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Bitmap" type="{}BitmapFormat"/>
 *                   &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Location" type="{}Point"/>
 *                   &lt;element name="Normal" type="{}Direction"/>
 *                   &lt;element name="Up" type="{}Direction"/>
 *                   &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "", propOrder = {
    "components",
    "orthogonalCamera",
    "perspectiveCamera",
    "lines",
    "clippingPlanes",
    "bitmaps"
})
@XmlRootElement(name = "VisualizationInfo")
public class VisualizationInfo {

    @XmlElement(name = "Components")
    protected VisualizationInfo.Components components;
    @XmlElement(name = "OrthogonalCamera")
    protected OrthogonalCamera orthogonalCamera;
    @XmlElement(name = "PerspectiveCamera")
    protected PerspectiveCamera perspectiveCamera;
    @XmlElement(name = "Lines")
    protected VisualizationInfo.Lines lines;
    @XmlElement(name = "ClippingPlanes")
    protected VisualizationInfo.ClippingPlanes clippingPlanes;
    @XmlElement(name = "Bitmaps")
    protected List<VisualizationInfo.Bitmaps> bitmaps;

    /**
     * Gets the value of the components property.
     * 
     * @return
     *     possible object is
     *     {@link VisualizationInfo.Components }
     *     
     */
    public VisualizationInfo.Components getComponents() {
        return components;
    }

    /**
     * Sets the value of the components property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisualizationInfo.Components }
     *     
     */
    public void setComponents(VisualizationInfo.Components value) {
        this.components = value;
    }

    /**
     * Gets the value of the orthogonalCamera property.
     * 
     * @return
     *     possible object is
     *     {@link OrthogonalCamera }
     *     
     */
    public OrthogonalCamera getOrthogonalCamera() {
        return orthogonalCamera;
    }

    /**
     * Sets the value of the orthogonalCamera property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrthogonalCamera }
     *     
     */
    public void setOrthogonalCamera(OrthogonalCamera value) {
        this.orthogonalCamera = value;
    }

    /**
     * Gets the value of the perspectiveCamera property.
     * 
     * @return
     *     possible object is
     *     {@link PerspectiveCamera }
     *     
     */
    public PerspectiveCamera getPerspectiveCamera() {
        return perspectiveCamera;
    }

    /**
     * Sets the value of the perspectiveCamera property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerspectiveCamera }
     *     
     */
    public void setPerspectiveCamera(PerspectiveCamera value) {
        this.perspectiveCamera = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link VisualizationInfo.Lines }
     *     
     */
    public VisualizationInfo.Lines getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisualizationInfo.Lines }
     *     
     */
    public void setLines(VisualizationInfo.Lines value) {
        this.lines = value;
    }

    /**
     * Gets the value of the clippingPlanes property.
     * 
     * @return
     *     possible object is
     *     {@link VisualizationInfo.ClippingPlanes }
     *     
     */
    public VisualizationInfo.ClippingPlanes getClippingPlanes() {
        return clippingPlanes;
    }

    /**
     * Sets the value of the clippingPlanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisualizationInfo.ClippingPlanes }
     *     
     */
    public void setClippingPlanes(VisualizationInfo.ClippingPlanes value) {
        this.clippingPlanes = value;
    }

    /**
     * Gets the value of the bitmaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bitmaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBitmaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisualizationInfo.Bitmaps }
     * 
     * 
     */
    public List<VisualizationInfo.Bitmaps> getBitmaps() {
        if (bitmaps == null) {
            bitmaps = new ArrayList<VisualizationInfo.Bitmaps>();
        }
        return this.bitmaps;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Bitmap" type="{}BitmapFormat"/>
     *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Location" type="{}Point"/>
     *         &lt;element name="Normal" type="{}Direction"/>
     *         &lt;element name="Up" type="{}Direction"/>
     *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bitmap",
        "reference",
        "location",
        "normal",
        "up",
        "height"
    })
    public static class Bitmaps {

        @XmlElement(name = "Bitmap", required = true)
        @XmlSchemaType(name = "string")
        protected BitmapFormat bitmap;
        @XmlElement(name = "Reference", required = true)
        protected String reference;
        @XmlElement(name = "Location", required = true)
        protected Point location;
        @XmlElement(name = "Normal", required = true)
        protected Direction normal;
        @XmlElement(name = "Up", required = true)
        protected Direction up;
        @XmlElement(name = "Height")
        protected double height;

        /**
         * Gets the value of the bitmap property.
         * 
         * @return
         *     possible object is
         *     {@link BitmapFormat }
         *     
         */
        public BitmapFormat getBitmap() {
            return bitmap;
        }

        /**
         * Sets the value of the bitmap property.
         * 
         * @param value
         *     allowed object is
         *     {@link BitmapFormat }
         *     
         */
        public void setBitmap(BitmapFormat value) {
            this.bitmap = value;
        }

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReference(String value) {
            this.reference = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link Point }
         *     
         */
        public Point getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link Point }
         *     
         */
        public void setLocation(Point value) {
            this.location = value;
        }

        /**
         * Gets the value of the normal property.
         * 
         * @return
         *     possible object is
         *     {@link Direction }
         *     
         */
        public Direction getNormal() {
            return normal;
        }

        /**
         * Sets the value of the normal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Direction }
         *     
         */
        public void setNormal(Direction value) {
            this.normal = value;
        }

        /**
         * Gets the value of the up property.
         * 
         * @return
         *     possible object is
         *     {@link Direction }
         *     
         */
        public Direction getUp() {
            return up;
        }

        /**
         * Sets the value of the up property.
         * 
         * @param value
         *     allowed object is
         *     {@link Direction }
         *     
         */
        public void setUp(Direction value) {
            this.up = value;
        }

        /**
         * Gets the value of the height property.
         * 
         */
        public double getHeight() {
            return height;
        }

        /**
         * Sets the value of the height property.
         * 
         */
        public void setHeight(double value) {
            this.height = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ClippingPlane" type="{}ClippingPlane" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "clippingPlane"
    })
    public static class ClippingPlanes {

        @XmlElement(name = "ClippingPlane")
        protected List<ClippingPlane> clippingPlane;

        /**
         * Gets the value of the clippingPlane property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clippingPlane property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClippingPlane().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClippingPlane }
         * 
         * 
         */
        public List<ClippingPlane> getClippingPlane() {
            if (clippingPlane == null) {
                clippingPlane = new ArrayList<ClippingPlane>();
            }
            return this.clippingPlane;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Component" type="{}Component" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "component"
    })
    public static class Components {

        @XmlElement(name = "Component", required = true)
        protected List<Component> component;

        /**
         * Gets the value of the component property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the component property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Component }
         * 
         * 
         */
        public List<Component> getComponent() {
            if (component == null) {
                component = new ArrayList<Component>();
            }
            return this.component;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Line" type="{}Line" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "line"
    })
    public static class Lines {

        @XmlElement(name = "Line", required = true)
        protected List<Line> line;

        /**
         * Gets the value of the line property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the line property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Line }
         * 
         * 
         */
        public List<Line> getLine() {
            if (line == null) {
                line = new ArrayList<Line>();
            }
            return this.line;
        }

    }

}
