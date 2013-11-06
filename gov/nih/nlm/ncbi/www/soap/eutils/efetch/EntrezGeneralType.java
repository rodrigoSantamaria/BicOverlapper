/**
 * EntrezGeneralType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EntrezGeneralType  implements java.io.Serializable {
    private java.lang.String entrezGeneral_title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezGeneral_dataType entrezGeneral_data;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezGeneral_styleType entrezGeneral_style;

    private java.lang.String entrezGeneral_location;

    public EntrezGeneralType() {
    }

    public EntrezGeneralType(
           java.lang.String entrezGeneral_title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezGeneral_dataType entrezGeneral_data,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezGeneral_styleType entrezGeneral_style,
           java.lang.String entrezGeneral_location) {
           this.entrezGeneral_title = entrezGeneral_title;
           this.entrezGeneral_data = entrezGeneral_data;
           this.entrezGeneral_style = entrezGeneral_style;
           this.entrezGeneral_location = entrezGeneral_location;
    }


    /**
     * Gets the entrezGeneral_title value for this EntrezGeneralType.
     * 
     * @return entrezGeneral_title
     */
    public java.lang.String getEntrezGeneral_title() {
        return entrezGeneral_title;
    }


    /**
     * Sets the entrezGeneral_title value for this EntrezGeneralType.
     * 
     * @param entrezGeneral_title
     */
    public void setEntrezGeneral_title(java.lang.String entrezGeneral_title) {
        this.entrezGeneral_title = entrezGeneral_title;
    }


    /**
     * Gets the entrezGeneral_data value for this EntrezGeneralType.
     * 
     * @return entrezGeneral_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezGeneral_dataType getEntrezGeneral_data() {
        return entrezGeneral_data;
    }


    /**
     * Sets the entrezGeneral_data value for this EntrezGeneralType.
     * 
     * @param entrezGeneral_data
     */
    public void setEntrezGeneral_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezGeneral_dataType entrezGeneral_data) {
        this.entrezGeneral_data = entrezGeneral_data;
    }


    /**
     * Gets the entrezGeneral_style value for this EntrezGeneralType.
     * 
     * @return entrezGeneral_style
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezGeneral_styleType getEntrezGeneral_style() {
        return entrezGeneral_style;
    }


    /**
     * Sets the entrezGeneral_style value for this EntrezGeneralType.
     * 
     * @param entrezGeneral_style
     */
    public void setEntrezGeneral_style(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezGeneral_styleType entrezGeneral_style) {
        this.entrezGeneral_style = entrezGeneral_style;
    }


    /**
     * Gets the entrezGeneral_location value for this EntrezGeneralType.
     * 
     * @return entrezGeneral_location
     */
    public java.lang.String getEntrezGeneral_location() {
        return entrezGeneral_location;
    }


    /**
     * Sets the entrezGeneral_location value for this EntrezGeneralType.
     * 
     * @param entrezGeneral_location
     */
    public void setEntrezGeneral_location(java.lang.String entrezGeneral_location) {
        this.entrezGeneral_location = entrezGeneral_location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntrezGeneralType)) return false;
        EntrezGeneralType other = (EntrezGeneralType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrezGeneral_title==null && other.getEntrezGeneral_title()==null) || 
             (this.entrezGeneral_title!=null &&
              this.entrezGeneral_title.equals(other.getEntrezGeneral_title()))) &&
            ((this.entrezGeneral_data==null && other.getEntrezGeneral_data()==null) || 
             (this.entrezGeneral_data!=null &&
              this.entrezGeneral_data.equals(other.getEntrezGeneral_data()))) &&
            ((this.entrezGeneral_style==null && other.getEntrezGeneral_style()==null) || 
             (this.entrezGeneral_style!=null &&
              this.entrezGeneral_style.equals(other.getEntrezGeneral_style()))) &&
            ((this.entrezGeneral_location==null && other.getEntrezGeneral_location()==null) || 
             (this.entrezGeneral_location!=null &&
              this.entrezGeneral_location.equals(other.getEntrezGeneral_location())));
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
        if (getEntrezGeneral_title() != null) {
            _hashCode += getEntrezGeneral_title().hashCode();
        }
        if (getEntrezGeneral_data() != null) {
            _hashCode += getEntrezGeneral_data().hashCode();
        }
        if (getEntrezGeneral_style() != null) {
            _hashCode += getEntrezGeneral_style().hashCode();
        }
        if (getEntrezGeneral_location() != null) {
            _hashCode += getEntrezGeneral_location().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntrezGeneralType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-generalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezGeneral_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-general_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezGeneral_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-general_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-general_dataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezGeneral_style");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-general_style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-general_styleType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezGeneral_location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-general_location"));
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
