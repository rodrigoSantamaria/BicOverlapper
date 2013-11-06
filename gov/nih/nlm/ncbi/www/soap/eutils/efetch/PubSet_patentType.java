/**
 * PubSet_patentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubSet_patentType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPatType[] citPat;

    public PubSet_patentType() {
    }

    public PubSet_patentType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPatType[] citPat) {
           this.citPat = citPat;
    }


    /**
     * Gets the citPat value for this PubSet_patentType.
     * 
     * @return citPat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPatType[] getCitPat() {
        return citPat;
    }


    /**
     * Sets the citPat value for this PubSet_patentType.
     * 
     * @param citPat
     */
    public void setCitPat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPatType[] citPat) {
        this.citPat = citPat;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPatType getCitPat(int i) {
        return this.citPat[i];
    }

    public void setCitPat(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPatType _value) {
        this.citPat[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubSet_patentType)) return false;
        PubSet_patentType other = (PubSet_patentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citPat==null && other.getCitPat()==null) || 
             (this.citPat!=null &&
              java.util.Arrays.equals(this.citPat, other.getCitPat())));
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
        if (getCitPat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCitPat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCitPat(), i);
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
        new org.apache.axis.description.TypeDesc(PubSet_patentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_patentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-patType"));
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
