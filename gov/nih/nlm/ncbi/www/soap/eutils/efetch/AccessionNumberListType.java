/**
 * AccessionNumberListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AccessionNumberListType  implements java.io.Serializable {
    private java.lang.String[] accessionNumber;

    public AccessionNumberListType() {
    }

    public AccessionNumberListType(
           java.lang.String[] accessionNumber) {
           this.accessionNumber = accessionNumber;
    }


    /**
     * Gets the accessionNumber value for this AccessionNumberListType.
     * 
     * @return accessionNumber
     */
    public java.lang.String[] getAccessionNumber() {
        return accessionNumber;
    }


    /**
     * Sets the accessionNumber value for this AccessionNumberListType.
     * 
     * @param accessionNumber
     */
    public void setAccessionNumber(java.lang.String[] accessionNumber) {
        this.accessionNumber = accessionNumber;
    }

    public java.lang.String getAccessionNumber(int i) {
        return this.accessionNumber[i];
    }

    public void setAccessionNumber(int i, java.lang.String _value) {
        this.accessionNumber[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccessionNumberListType)) return false;
        AccessionNumberListType other = (AccessionNumberListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessionNumber==null && other.getAccessionNumber()==null) || 
             (this.accessionNumber!=null &&
              java.util.Arrays.equals(this.accessionNumber, other.getAccessionNumber())));
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
        if (getAccessionNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessionNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessionNumber(), i);
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
        new org.apache.axis.description.TypeDesc(AccessionNumberListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AccessionNumberListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AccessionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AccessionNumber"));
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
