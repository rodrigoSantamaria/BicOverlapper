/**
 * INSDXrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class INSDXrefType  implements java.io.Serializable {
    private java.lang.String INSDXref_dbname;

    private java.lang.String INSDXref_id;

    public INSDXrefType() {
    }

    public INSDXrefType(
           java.lang.String INSDXref_dbname,
           java.lang.String INSDXref_id) {
           this.INSDXref_dbname = INSDXref_dbname;
           this.INSDXref_id = INSDXref_id;
    }


    /**
     * Gets the INSDXref_dbname value for this INSDXrefType.
     * 
     * @return INSDXref_dbname
     */
    public java.lang.String getINSDXref_dbname() {
        return INSDXref_dbname;
    }


    /**
     * Sets the INSDXref_dbname value for this INSDXrefType.
     * 
     * @param INSDXref_dbname
     */
    public void setINSDXref_dbname(java.lang.String INSDXref_dbname) {
        this.INSDXref_dbname = INSDXref_dbname;
    }


    /**
     * Gets the INSDXref_id value for this INSDXrefType.
     * 
     * @return INSDXref_id
     */
    public java.lang.String getINSDXref_id() {
        return INSDXref_id;
    }


    /**
     * Sets the INSDXref_id value for this INSDXrefType.
     * 
     * @param INSDXref_id
     */
    public void setINSDXref_id(java.lang.String INSDXref_id) {
        this.INSDXref_id = INSDXref_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSDXrefType)) return false;
        INSDXrefType other = (INSDXrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSDXref_dbname==null && other.getINSDXref_dbname()==null) || 
             (this.INSDXref_dbname!=null &&
              this.INSDXref_dbname.equals(other.getINSDXref_dbname()))) &&
            ((this.INSDXref_id==null && other.getINSDXref_id()==null) || 
             (this.INSDXref_id!=null &&
              this.INSDXref_id.equals(other.getINSDXref_id())));
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
        if (getINSDXref_dbname() != null) {
            _hashCode += getINSDXref_dbname().hashCode();
        }
        if (getINSDXref_id() != null) {
            _hashCode += getINSDXref_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(INSDXrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDXrefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDXref_dbname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDXref_dbname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDXref_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDXref_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
