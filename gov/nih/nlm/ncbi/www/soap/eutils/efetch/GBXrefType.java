/**
 * GBXrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBXrefType  implements java.io.Serializable {
    private java.lang.String GBXref_dbname;

    private java.lang.String GBXref_id;

    public GBXrefType() {
    }

    public GBXrefType(
           java.lang.String GBXref_dbname,
           java.lang.String GBXref_id) {
           this.GBXref_dbname = GBXref_dbname;
           this.GBXref_id = GBXref_id;
    }


    /**
     * Gets the GBXref_dbname value for this GBXrefType.
     * 
     * @return GBXref_dbname
     */
    public java.lang.String getGBXref_dbname() {
        return GBXref_dbname;
    }


    /**
     * Sets the GBXref_dbname value for this GBXrefType.
     * 
     * @param GBXref_dbname
     */
    public void setGBXref_dbname(java.lang.String GBXref_dbname) {
        this.GBXref_dbname = GBXref_dbname;
    }


    /**
     * Gets the GBXref_id value for this GBXrefType.
     * 
     * @return GBXref_id
     */
    public java.lang.String getGBXref_id() {
        return GBXref_id;
    }


    /**
     * Sets the GBXref_id value for this GBXrefType.
     * 
     * @param GBXref_id
     */
    public void setGBXref_id(java.lang.String GBXref_id) {
        this.GBXref_id = GBXref_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBXrefType)) return false;
        GBXrefType other = (GBXrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBXref_dbname==null && other.getGBXref_dbname()==null) || 
             (this.GBXref_dbname!=null &&
              this.GBXref_dbname.equals(other.getGBXref_dbname()))) &&
            ((this.GBXref_id==null && other.getGBXref_id()==null) || 
             (this.GBXref_id!=null &&
              this.GBXref_id.equals(other.getGBXref_id())));
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
        if (getGBXref_dbname() != null) {
            _hashCode += getGBXref_dbname().hashCode();
        }
        if (getGBXref_id() != null) {
            _hashCode += getGBXref_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GBXrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBXrefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBXref_dbname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBXref_dbname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBXref_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBXref_id"));
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
