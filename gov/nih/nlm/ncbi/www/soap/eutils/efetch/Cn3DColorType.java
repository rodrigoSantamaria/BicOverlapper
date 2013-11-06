/**
 * Cn3DColorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DColorType  implements java.io.Serializable {
    private java.lang.String cn3DColor_scaleFactor;

    private java.lang.String cn3DColor_red;

    private java.lang.String cn3DColor_green;

    private java.lang.String cn3DColor_blue;

    private java.lang.String cn3DColor_alpha;

    public Cn3DColorType() {
    }

    public Cn3DColorType(
           java.lang.String cn3DColor_scaleFactor,
           java.lang.String cn3DColor_red,
           java.lang.String cn3DColor_green,
           java.lang.String cn3DColor_blue,
           java.lang.String cn3DColor_alpha) {
           this.cn3DColor_scaleFactor = cn3DColor_scaleFactor;
           this.cn3DColor_red = cn3DColor_red;
           this.cn3DColor_green = cn3DColor_green;
           this.cn3DColor_blue = cn3DColor_blue;
           this.cn3DColor_alpha = cn3DColor_alpha;
    }


    /**
     * Gets the cn3DColor_scaleFactor value for this Cn3DColorType.
     * 
     * @return cn3DColor_scaleFactor
     */
    public java.lang.String getCn3DColor_scaleFactor() {
        return cn3DColor_scaleFactor;
    }


    /**
     * Sets the cn3DColor_scaleFactor value for this Cn3DColorType.
     * 
     * @param cn3DColor_scaleFactor
     */
    public void setCn3DColor_scaleFactor(java.lang.String cn3DColor_scaleFactor) {
        this.cn3DColor_scaleFactor = cn3DColor_scaleFactor;
    }


    /**
     * Gets the cn3DColor_red value for this Cn3DColorType.
     * 
     * @return cn3DColor_red
     */
    public java.lang.String getCn3DColor_red() {
        return cn3DColor_red;
    }


    /**
     * Sets the cn3DColor_red value for this Cn3DColorType.
     * 
     * @param cn3DColor_red
     */
    public void setCn3DColor_red(java.lang.String cn3DColor_red) {
        this.cn3DColor_red = cn3DColor_red;
    }


    /**
     * Gets the cn3DColor_green value for this Cn3DColorType.
     * 
     * @return cn3DColor_green
     */
    public java.lang.String getCn3DColor_green() {
        return cn3DColor_green;
    }


    /**
     * Sets the cn3DColor_green value for this Cn3DColorType.
     * 
     * @param cn3DColor_green
     */
    public void setCn3DColor_green(java.lang.String cn3DColor_green) {
        this.cn3DColor_green = cn3DColor_green;
    }


    /**
     * Gets the cn3DColor_blue value for this Cn3DColorType.
     * 
     * @return cn3DColor_blue
     */
    public java.lang.String getCn3DColor_blue() {
        return cn3DColor_blue;
    }


    /**
     * Sets the cn3DColor_blue value for this Cn3DColorType.
     * 
     * @param cn3DColor_blue
     */
    public void setCn3DColor_blue(java.lang.String cn3DColor_blue) {
        this.cn3DColor_blue = cn3DColor_blue;
    }


    /**
     * Gets the cn3DColor_alpha value for this Cn3DColorType.
     * 
     * @return cn3DColor_alpha
     */
    public java.lang.String getCn3DColor_alpha() {
        return cn3DColor_alpha;
    }


    /**
     * Sets the cn3DColor_alpha value for this Cn3DColorType.
     * 
     * @param cn3DColor_alpha
     */
    public void setCn3DColor_alpha(java.lang.String cn3DColor_alpha) {
        this.cn3DColor_alpha = cn3DColor_alpha;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DColorType)) return false;
        Cn3DColorType other = (Cn3DColorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DColor_scaleFactor==null && other.getCn3DColor_scaleFactor()==null) || 
             (this.cn3DColor_scaleFactor!=null &&
              this.cn3DColor_scaleFactor.equals(other.getCn3DColor_scaleFactor()))) &&
            ((this.cn3DColor_red==null && other.getCn3DColor_red()==null) || 
             (this.cn3DColor_red!=null &&
              this.cn3DColor_red.equals(other.getCn3DColor_red()))) &&
            ((this.cn3DColor_green==null && other.getCn3DColor_green()==null) || 
             (this.cn3DColor_green!=null &&
              this.cn3DColor_green.equals(other.getCn3DColor_green()))) &&
            ((this.cn3DColor_blue==null && other.getCn3DColor_blue()==null) || 
             (this.cn3DColor_blue!=null &&
              this.cn3DColor_blue.equals(other.getCn3DColor_blue()))) &&
            ((this.cn3DColor_alpha==null && other.getCn3DColor_alpha()==null) || 
             (this.cn3DColor_alpha!=null &&
              this.cn3DColor_alpha.equals(other.getCn3DColor_alpha())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCn3DColor_scaleFactor() != null) {
            _hashCode += getCn3DColor_scaleFactor().hashCode();
        }
        if (getCn3DColor_red() != null) {
            _hashCode += getCn3DColor_red().hashCode();
        }
        if (getCn3DColor_green() != null) {
            _hashCode += getCn3DColor_green().hashCode();
        }
        if (getCn3DColor_blue() != null) {
            _hashCode += getCn3DColor_blue().hashCode();
        }
        if (getCn3DColor_alpha() != null) {
            _hashCode += getCn3DColor_alpha().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DColorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-colorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DColor_scaleFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-color_scale-factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DColor_red");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-color_red"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DColor_green");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-color_green"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DColor_blue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-color_blue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DColor_alpha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-color_alpha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
