/**
 * Blast4DatabaseInfo_databaseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4DatabaseInfo_databaseType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseType blast4Database;

    public Blast4DatabaseInfo_databaseType() {
    }

    public Blast4DatabaseInfo_databaseType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseType blast4Database) {
           this.blast4Database = blast4Database;
    }


    /**
     * Gets the blast4Database value for this Blast4DatabaseInfo_databaseType.
     * 
     * @return blast4Database
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseType getBlast4Database() {
        return blast4Database;
    }


    /**
     * Sets the blast4Database value for this Blast4DatabaseInfo_databaseType.
     * 
     * @param blast4Database
     */
    public void setBlast4Database(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseType blast4Database) {
        this.blast4Database = blast4Database;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4DatabaseInfo_databaseType)) return false;
        Blast4DatabaseInfo_databaseType other = (Blast4DatabaseInfo_databaseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Database==null && other.getBlast4Database()==null) || 
             (this.blast4Database!=null &&
              this.blast4Database.equals(other.getBlast4Database())));
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
        if (getBlast4Database() != null) {
            _hashCode += getBlast4Database().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4DatabaseInfo_databaseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-info_databaseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Database");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-databaseType"));
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
