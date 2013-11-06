/**
 * MedlineEntry_substanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineEntry_substanceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineRnType[] medlineRn;

    public MedlineEntry_substanceType() {
    }

    public MedlineEntry_substanceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineRnType[] medlineRn) {
           this.medlineRn = medlineRn;
    }


    /**
     * Gets the medlineRn value for this MedlineEntry_substanceType.
     * 
     * @return medlineRn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineRnType[] getMedlineRn() {
        return medlineRn;
    }


    /**
     * Sets the medlineRn value for this MedlineEntry_substanceType.
     * 
     * @param medlineRn
     */
    public void setMedlineRn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineRnType[] medlineRn) {
        this.medlineRn = medlineRn;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineRnType getMedlineRn(int i) {
        return this.medlineRn[i];
    }

    public void setMedlineRn(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineRnType _value) {
        this.medlineRn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineEntry_substanceType)) return false;
        MedlineEntry_substanceType other = (MedlineEntry_substanceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlineRn==null && other.getMedlineRn()==null) || 
             (this.medlineRn!=null &&
              java.util.Arrays.equals(this.medlineRn, other.getMedlineRn())));
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
        if (getMedlineRn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMedlineRn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMedlineRn(), i);
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
        new org.apache.axis.description.TypeDesc(MedlineEntry_substanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_substanceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineRn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-rn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-rnType"));
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
