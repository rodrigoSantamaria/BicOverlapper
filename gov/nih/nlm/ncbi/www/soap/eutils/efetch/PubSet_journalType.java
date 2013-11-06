/**
 * PubSet_journalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubSet_journalType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJourType[] citJour;

    public PubSet_journalType() {
    }

    public PubSet_journalType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJourType[] citJour) {
           this.citJour = citJour;
    }


    /**
     * Gets the citJour value for this PubSet_journalType.
     * 
     * @return citJour
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJourType[] getCitJour() {
        return citJour;
    }


    /**
     * Sets the citJour value for this PubSet_journalType.
     * 
     * @param citJour
     */
    public void setCitJour(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJourType[] citJour) {
        this.citJour = citJour;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJourType getCitJour(int i) {
        return this.citJour[i];
    }

    public void setCitJour(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJourType _value) {
        this.citJour[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubSet_journalType)) return false;
        PubSet_journalType other = (PubSet_journalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citJour==null && other.getCitJour()==null) || 
             (this.citJour!=null &&
              java.util.Arrays.equals(this.citJour, other.getCitJour())));
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
        if (getCitJour() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCitJour());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCitJour(), i);
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
        new org.apache.axis.description.TypeDesc(PubSet_journalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_journalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citJour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-jour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-jourType"));
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
