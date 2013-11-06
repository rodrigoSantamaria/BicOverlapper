/**
 * SubSourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SubSourceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubSource_subtypeType subSource_subtype;

    private java.lang.String subSource_name;

    private java.lang.String subSource_attrib;

    public SubSourceType() {
    }

    public SubSourceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubSource_subtypeType subSource_subtype,
           java.lang.String subSource_name,
           java.lang.String subSource_attrib) {
           this.subSource_subtype = subSource_subtype;
           this.subSource_name = subSource_name;
           this.subSource_attrib = subSource_attrib;
    }


    /**
     * Gets the subSource_subtype value for this SubSourceType.
     * 
     * @return subSource_subtype
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubSource_subtypeType getSubSource_subtype() {
        return subSource_subtype;
    }


    /**
     * Sets the subSource_subtype value for this SubSourceType.
     * 
     * @param subSource_subtype
     */
    public void setSubSource_subtype(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubSource_subtypeType subSource_subtype) {
        this.subSource_subtype = subSource_subtype;
    }


    /**
     * Gets the subSource_name value for this SubSourceType.
     * 
     * @return subSource_name
     */
    public java.lang.String getSubSource_name() {
        return subSource_name;
    }


    /**
     * Sets the subSource_name value for this SubSourceType.
     * 
     * @param subSource_name
     */
    public void setSubSource_name(java.lang.String subSource_name) {
        this.subSource_name = subSource_name;
    }


    /**
     * Gets the subSource_attrib value for this SubSourceType.
     * 
     * @return subSource_attrib
     */
    public java.lang.String getSubSource_attrib() {
        return subSource_attrib;
    }


    /**
     * Sets the subSource_attrib value for this SubSourceType.
     * 
     * @param subSource_attrib
     */
    public void setSubSource_attrib(java.lang.String subSource_attrib) {
        this.subSource_attrib = subSource_attrib;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubSourceType)) return false;
        SubSourceType other = (SubSourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subSource_subtype==null && other.getSubSource_subtype()==null) || 
             (this.subSource_subtype!=null &&
              this.subSource_subtype.equals(other.getSubSource_subtype()))) &&
            ((this.subSource_name==null && other.getSubSource_name()==null) || 
             (this.subSource_name!=null &&
              this.subSource_name.equals(other.getSubSource_name()))) &&
            ((this.subSource_attrib==null && other.getSubSource_attrib()==null) || 
             (this.subSource_attrib!=null &&
              this.subSource_attrib.equals(other.getSubSource_attrib())));
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
        if (getSubSource_subtype() != null) {
            _hashCode += getSubSource_subtype().hashCode();
        }
        if (getSubSource_name() != null) {
            _hashCode += getSubSource_name().hashCode();
        }
        if (getSubSource_attrib() != null) {
            _hashCode += getSubSource_attrib().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubSourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SubSourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSource_subtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SubSource_subtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SubSource_subtypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSource_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SubSource_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSource_attrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SubSource_attrib"));
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
