/**
 * MimLinkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimLinkType  implements java.io.Serializable {
    private java.lang.String mimLink_num;

    private java.lang.String mimLink_uids;

    private java.lang.String mimLink_numRelevant;

    public MimLinkType() {
    }

    public MimLinkType(
           java.lang.String mimLink_num,
           java.lang.String mimLink_uids,
           java.lang.String mimLink_numRelevant) {
           this.mimLink_num = mimLink_num;
           this.mimLink_uids = mimLink_uids;
           this.mimLink_numRelevant = mimLink_numRelevant;
    }


    /**
     * Gets the mimLink_num value for this MimLinkType.
     * 
     * @return mimLink_num
     */
    public java.lang.String getMimLink_num() {
        return mimLink_num;
    }


    /**
     * Sets the mimLink_num value for this MimLinkType.
     * 
     * @param mimLink_num
     */
    public void setMimLink_num(java.lang.String mimLink_num) {
        this.mimLink_num = mimLink_num;
    }


    /**
     * Gets the mimLink_uids value for this MimLinkType.
     * 
     * @return mimLink_uids
     */
    public java.lang.String getMimLink_uids() {
        return mimLink_uids;
    }


    /**
     * Sets the mimLink_uids value for this MimLinkType.
     * 
     * @param mimLink_uids
     */
    public void setMimLink_uids(java.lang.String mimLink_uids) {
        this.mimLink_uids = mimLink_uids;
    }


    /**
     * Gets the mimLink_numRelevant value for this MimLinkType.
     * 
     * @return mimLink_numRelevant
     */
    public java.lang.String getMimLink_numRelevant() {
        return mimLink_numRelevant;
    }


    /**
     * Sets the mimLink_numRelevant value for this MimLinkType.
     * 
     * @param mimLink_numRelevant
     */
    public void setMimLink_numRelevant(java.lang.String mimLink_numRelevant) {
        this.mimLink_numRelevant = mimLink_numRelevant;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimLinkType)) return false;
        MimLinkType other = (MimLinkType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimLink_num==null && other.getMimLink_num()==null) || 
             (this.mimLink_num!=null &&
              this.mimLink_num.equals(other.getMimLink_num()))) &&
            ((this.mimLink_uids==null && other.getMimLink_uids()==null) || 
             (this.mimLink_uids!=null &&
              this.mimLink_uids.equals(other.getMimLink_uids()))) &&
            ((this.mimLink_numRelevant==null && other.getMimLink_numRelevant()==null) || 
             (this.mimLink_numRelevant!=null &&
              this.mimLink_numRelevant.equals(other.getMimLink_numRelevant())));
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
        if (getMimLink_num() != null) {
            _hashCode += getMimLink_num().hashCode();
        }
        if (getMimLink_uids() != null) {
            _hashCode += getMimLink_uids().hashCode();
        }
        if (getMimLink_numRelevant() != null) {
            _hashCode += getMimLink_numRelevant().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimLinkType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-linkType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimLink_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-link_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimLink_uids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-link_uids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimLink_numRelevant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-link_numRelevant"));
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
