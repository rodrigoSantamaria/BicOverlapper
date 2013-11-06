/**
 * SeqData_ncbi2NaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqData_ncbi2NaType  implements java.io.Serializable {
    private java.lang.String NCBI2Na;

    public SeqData_ncbi2NaType() {
    }

    public SeqData_ncbi2NaType(
           java.lang.String NCBI2Na) {
           this.NCBI2Na = NCBI2Na;
    }


    /**
     * Gets the NCBI2Na value for this SeqData_ncbi2NaType.
     * 
     * @return NCBI2Na
     */
    public java.lang.String getNCBI2Na() {
        return NCBI2Na;
    }


    /**
     * Sets the NCBI2Na value for this SeqData_ncbi2NaType.
     * 
     * @param NCBI2Na
     */
    public void setNCBI2Na(java.lang.String NCBI2Na) {
        this.NCBI2Na = NCBI2Na;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqData_ncbi2NaType)) return false;
        SeqData_ncbi2NaType other = (SeqData_ncbi2NaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NCBI2Na==null && other.getNCBI2Na()==null) || 
             (this.NCBI2Na!=null &&
              this.NCBI2Na.equals(other.getNCBI2Na())));
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
        if (getNCBI2Na() != null) {
            _hashCode += getNCBI2Na().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqData_ncbi2NaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-data_ncbi2naType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCBI2Na");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NCBI2na"));
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
