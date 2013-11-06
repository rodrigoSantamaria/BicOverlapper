/**
 * Blast4GetMatricesReplyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4GetMatricesReplyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MatrixIdType[] blast4MatrixId;

    public Blast4GetMatricesReplyType() {
    }

    public Blast4GetMatricesReplyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MatrixIdType[] blast4MatrixId) {
           this.blast4MatrixId = blast4MatrixId;
    }


    /**
     * Gets the blast4MatrixId value for this Blast4GetMatricesReplyType.
     * 
     * @return blast4MatrixId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MatrixIdType[] getBlast4MatrixId() {
        return blast4MatrixId;
    }


    /**
     * Sets the blast4MatrixId value for this Blast4GetMatricesReplyType.
     * 
     * @param blast4MatrixId
     */
    public void setBlast4MatrixId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MatrixIdType[] blast4MatrixId) {
        this.blast4MatrixId = blast4MatrixId;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MatrixIdType getBlast4MatrixId(int i) {
        return this.blast4MatrixId[i];
    }

    public void setBlast4MatrixId(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4MatrixIdType _value) {
        this.blast4MatrixId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4GetMatricesReplyType)) return false;
        Blast4GetMatricesReplyType other = (Blast4GetMatricesReplyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4MatrixId==null && other.getBlast4MatrixId()==null) || 
             (this.blast4MatrixId!=null &&
              java.util.Arrays.equals(this.blast4MatrixId, other.getBlast4MatrixId())));
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
        if (getBlast4MatrixId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlast4MatrixId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlast4MatrixId(), i);
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
        new org.apache.axis.description.TypeDesc(Blast4GetMatricesReplyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-matrices-replyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4MatrixId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-matrix-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-matrix-idType"));
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
