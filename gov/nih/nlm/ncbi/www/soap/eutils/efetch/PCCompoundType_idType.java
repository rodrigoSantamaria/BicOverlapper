/**
 * PCCompoundType_idType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCCompoundType_idType  implements java.io.Serializable {
    private java.lang.String PCCompoundType_id_cid;

    private java.lang.String PCCompoundType_id_sid;

    private java.lang.String PCCompoundType_id_xid;

    public PCCompoundType_idType() {
    }

    public PCCompoundType_idType(
           java.lang.String PCCompoundType_id_cid,
           java.lang.String PCCompoundType_id_sid,
           java.lang.String PCCompoundType_id_xid) {
           this.PCCompoundType_id_cid = PCCompoundType_id_cid;
           this.PCCompoundType_id_sid = PCCompoundType_id_sid;
           this.PCCompoundType_id_xid = PCCompoundType_id_xid;
    }


    /**
     * Gets the PCCompoundType_id_cid value for this PCCompoundType_idType.
     * 
     * @return PCCompoundType_id_cid
     */
    public java.lang.String getPCCompoundType_id_cid() {
        return PCCompoundType_id_cid;
    }


    /**
     * Sets the PCCompoundType_id_cid value for this PCCompoundType_idType.
     * 
     * @param PCCompoundType_id_cid
     */
    public void setPCCompoundType_id_cid(java.lang.String PCCompoundType_id_cid) {
        this.PCCompoundType_id_cid = PCCompoundType_id_cid;
    }


    /**
     * Gets the PCCompoundType_id_sid value for this PCCompoundType_idType.
     * 
     * @return PCCompoundType_id_sid
     */
    public java.lang.String getPCCompoundType_id_sid() {
        return PCCompoundType_id_sid;
    }


    /**
     * Sets the PCCompoundType_id_sid value for this PCCompoundType_idType.
     * 
     * @param PCCompoundType_id_sid
     */
    public void setPCCompoundType_id_sid(java.lang.String PCCompoundType_id_sid) {
        this.PCCompoundType_id_sid = PCCompoundType_id_sid;
    }


    /**
     * Gets the PCCompoundType_id_xid value for this PCCompoundType_idType.
     * 
     * @return PCCompoundType_id_xid
     */
    public java.lang.String getPCCompoundType_id_xid() {
        return PCCompoundType_id_xid;
    }


    /**
     * Sets the PCCompoundType_id_xid value for this PCCompoundType_idType.
     * 
     * @param PCCompoundType_id_xid
     */
    public void setPCCompoundType_id_xid(java.lang.String PCCompoundType_id_xid) {
        this.PCCompoundType_id_xid = PCCompoundType_id_xid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCCompoundType_idType)) return false;
        PCCompoundType_idType other = (PCCompoundType_idType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCCompoundType_id_cid==null && other.getPCCompoundType_id_cid()==null) || 
             (this.PCCompoundType_id_cid!=null &&
              this.PCCompoundType_id_cid.equals(other.getPCCompoundType_id_cid()))) &&
            ((this.PCCompoundType_id_sid==null && other.getPCCompoundType_id_sid()==null) || 
             (this.PCCompoundType_id_sid!=null &&
              this.PCCompoundType_id_sid.equals(other.getPCCompoundType_id_sid()))) &&
            ((this.PCCompoundType_id_xid==null && other.getPCCompoundType_id_xid()==null) || 
             (this.PCCompoundType_id_xid!=null &&
              this.PCCompoundType_id_xid.equals(other.getPCCompoundType_id_xid())));
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
        if (getPCCompoundType_id_cid() != null) {
            _hashCode += getPCCompoundType_id_cid().hashCode();
        }
        if (getPCCompoundType_id_sid() != null) {
            _hashCode += getPCCompoundType_id_sid().hashCode();
        }
        if (getPCCompoundType_id_xid() != null) {
            _hashCode += getPCCompoundType_id_xid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCCompoundType_idType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CompoundType_idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCompoundType_id_cid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CompoundType_id_cid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCompoundType_id_sid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CompoundType_id_sid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCompoundType_id_xid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CompoundType_id_xid"));
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
