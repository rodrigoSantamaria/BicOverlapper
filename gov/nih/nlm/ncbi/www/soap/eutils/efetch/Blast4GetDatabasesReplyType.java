/**
 * Blast4GetDatabasesReplyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4GetDatabasesReplyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfoType[] blast4DatabaseInfo;

    public Blast4GetDatabasesReplyType() {
    }

    public Blast4GetDatabasesReplyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfoType[] blast4DatabaseInfo) {
           this.blast4DatabaseInfo = blast4DatabaseInfo;
    }


    /**
     * Gets the blast4DatabaseInfo value for this Blast4GetDatabasesReplyType.
     * 
     * @return blast4DatabaseInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfoType[] getBlast4DatabaseInfo() {
        return blast4DatabaseInfo;
    }


    /**
     * Sets the blast4DatabaseInfo value for this Blast4GetDatabasesReplyType.
     * 
     * @param blast4DatabaseInfo
     */
    public void setBlast4DatabaseInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfoType[] blast4DatabaseInfo) {
        this.blast4DatabaseInfo = blast4DatabaseInfo;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfoType getBlast4DatabaseInfo(int i) {
        return this.blast4DatabaseInfo[i];
    }

    public void setBlast4DatabaseInfo(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4DatabaseInfoType _value) {
        this.blast4DatabaseInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4GetDatabasesReplyType)) return false;
        Blast4GetDatabasesReplyType other = (Blast4GetDatabasesReplyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4DatabaseInfo==null && other.getBlast4DatabaseInfo()==null) || 
             (this.blast4DatabaseInfo!=null &&
              java.util.Arrays.equals(this.blast4DatabaseInfo, other.getBlast4DatabaseInfo())));
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
        if (getBlast4DatabaseInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlast4DatabaseInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlast4DatabaseInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4GetDatabasesReplyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-databases-replyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4DatabaseInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-database-infoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
