/**
 * ID2BlobIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2BlobIdType  implements java.io.Serializable {
    private java.lang.String ID2BlobId_sat;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobId_subSatType ID2BlobId_subSat;

    private java.lang.String ID2BlobId_satKey;

    private java.lang.String ID2BlobId_version;

    public ID2BlobIdType() {
    }

    public ID2BlobIdType(
           java.lang.String ID2BlobId_sat,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobId_subSatType ID2BlobId_subSat,
           java.lang.String ID2BlobId_satKey,
           java.lang.String ID2BlobId_version) {
           this.ID2BlobId_sat = ID2BlobId_sat;
           this.ID2BlobId_subSat = ID2BlobId_subSat;
           this.ID2BlobId_satKey = ID2BlobId_satKey;
           this.ID2BlobId_version = ID2BlobId_version;
    }


    /**
     * Gets the ID2BlobId_sat value for this ID2BlobIdType.
     * 
     * @return ID2BlobId_sat
     */
    public java.lang.String getID2BlobId_sat() {
        return ID2BlobId_sat;
    }


    /**
     * Sets the ID2BlobId_sat value for this ID2BlobIdType.
     * 
     * @param ID2BlobId_sat
     */
    public void setID2BlobId_sat(java.lang.String ID2BlobId_sat) {
        this.ID2BlobId_sat = ID2BlobId_sat;
    }


    /**
     * Gets the ID2BlobId_subSat value for this ID2BlobIdType.
     * 
     * @return ID2BlobId_subSat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobId_subSatType getID2BlobId_subSat() {
        return ID2BlobId_subSat;
    }


    /**
     * Sets the ID2BlobId_subSat value for this ID2BlobIdType.
     * 
     * @param ID2BlobId_subSat
     */
    public void setID2BlobId_subSat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobId_subSatType ID2BlobId_subSat) {
        this.ID2BlobId_subSat = ID2BlobId_subSat;
    }


    /**
     * Gets the ID2BlobId_satKey value for this ID2BlobIdType.
     * 
     * @return ID2BlobId_satKey
     */
    public java.lang.String getID2BlobId_satKey() {
        return ID2BlobId_satKey;
    }


    /**
     * Sets the ID2BlobId_satKey value for this ID2BlobIdType.
     * 
     * @param ID2BlobId_satKey
     */
    public void setID2BlobId_satKey(java.lang.String ID2BlobId_satKey) {
        this.ID2BlobId_satKey = ID2BlobId_satKey;
    }


    /**
     * Gets the ID2BlobId_version value for this ID2BlobIdType.
     * 
     * @return ID2BlobId_version
     */
    public java.lang.String getID2BlobId_version() {
        return ID2BlobId_version;
    }


    /**
     * Sets the ID2BlobId_version value for this ID2BlobIdType.
     * 
     * @param ID2BlobId_version
     */
    public void setID2BlobId_version(java.lang.String ID2BlobId_version) {
        this.ID2BlobId_version = ID2BlobId_version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2BlobIdType)) return false;
        ID2BlobIdType other = (ID2BlobIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2BlobId_sat==null && other.getID2BlobId_sat()==null) || 
             (this.ID2BlobId_sat!=null &&
              this.ID2BlobId_sat.equals(other.getID2BlobId_sat()))) &&
            ((this.ID2BlobId_subSat==null && other.getID2BlobId_subSat()==null) || 
             (this.ID2BlobId_subSat!=null &&
              this.ID2BlobId_subSat.equals(other.getID2BlobId_subSat()))) &&
            ((this.ID2BlobId_satKey==null && other.getID2BlobId_satKey()==null) || 
             (this.ID2BlobId_satKey!=null &&
              this.ID2BlobId_satKey.equals(other.getID2BlobId_satKey()))) &&
            ((this.ID2BlobId_version==null && other.getID2BlobId_version()==null) || 
             (this.ID2BlobId_version!=null &&
              this.ID2BlobId_version.equals(other.getID2BlobId_version())));
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
        if (getID2BlobId_sat() != null) {
            _hashCode += getID2BlobId_sat().hashCode();
        }
        if (getID2BlobId_subSat() != null) {
            _hashCode += getID2BlobId_subSat().hashCode();
        }
        if (getID2BlobId_satKey() != null) {
            _hashCode += getID2BlobId_satKey().hashCode();
        }
        if (getID2BlobId_version() != null) {
            _hashCode += getID2BlobId_version().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2BlobIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-IdType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2BlobId_sat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-Id_sat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2BlobId_subSat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-Id_sub-sat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-Id_sub-satType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2BlobId_satKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-Id_sat-key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2BlobId_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-Id_version"));
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
