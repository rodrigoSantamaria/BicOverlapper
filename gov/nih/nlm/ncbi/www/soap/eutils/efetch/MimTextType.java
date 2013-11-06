/**
 * MimTextType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimTextType  implements java.io.Serializable {
    private java.lang.String mimText_label;

    private java.lang.String mimText_text;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimText_neighborsType mimText_neighbors;

    public MimTextType() {
    }

    public MimTextType(
           java.lang.String mimText_label,
           java.lang.String mimText_text,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimText_neighborsType mimText_neighbors) {
           this.mimText_label = mimText_label;
           this.mimText_text = mimText_text;
           this.mimText_neighbors = mimText_neighbors;
    }


    /**
     * Gets the mimText_label value for this MimTextType.
     * 
     * @return mimText_label
     */
    public java.lang.String getMimText_label() {
        return mimText_label;
    }


    /**
     * Sets the mimText_label value for this MimTextType.
     * 
     * @param mimText_label
     */
    public void setMimText_label(java.lang.String mimText_label) {
        this.mimText_label = mimText_label;
    }


    /**
     * Gets the mimText_text value for this MimTextType.
     * 
     * @return mimText_text
     */
    public java.lang.String getMimText_text() {
        return mimText_text;
    }


    /**
     * Sets the mimText_text value for this MimTextType.
     * 
     * @param mimText_text
     */
    public void setMimText_text(java.lang.String mimText_text) {
        this.mimText_text = mimText_text;
    }


    /**
     * Gets the mimText_neighbors value for this MimTextType.
     * 
     * @return mimText_neighbors
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimText_neighborsType getMimText_neighbors() {
        return mimText_neighbors;
    }


    /**
     * Sets the mimText_neighbors value for this MimTextType.
     * 
     * @param mimText_neighbors
     */
    public void setMimText_neighbors(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimText_neighborsType mimText_neighbors) {
        this.mimText_neighbors = mimText_neighbors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimTextType)) return false;
        MimTextType other = (MimTextType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimText_label==null && other.getMimText_label()==null) || 
             (this.mimText_label!=null &&
              this.mimText_label.equals(other.getMimText_label()))) &&
            ((this.mimText_text==null && other.getMimText_text()==null) || 
             (this.mimText_text!=null &&
              this.mimText_text.equals(other.getMimText_text()))) &&
            ((this.mimText_neighbors==null && other.getMimText_neighbors()==null) || 
             (this.mimText_neighbors!=null &&
              this.mimText_neighbors.equals(other.getMimText_neighbors())));
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
        if (getMimText_label() != null) {
            _hashCode += getMimText_label().hashCode();
        }
        if (getMimText_text() != null) {
            _hashCode += getMimText_text().hashCode();
        }
        if (getMimText_neighbors() != null) {
            _hashCode += getMimText_neighbors().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimTextType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-textType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimText_label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-text_label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimText_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-text_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimText_neighbors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-text_neighbors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-text_neighborsType"));
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
