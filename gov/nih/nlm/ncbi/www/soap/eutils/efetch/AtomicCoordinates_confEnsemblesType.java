/**
 * AtomicCoordinates_confEnsemblesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AtomicCoordinates_confEnsemblesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConformationEnsembleType[] conformationEnsemble;

    public AtomicCoordinates_confEnsemblesType() {
    }

    public AtomicCoordinates_confEnsemblesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConformationEnsembleType[] conformationEnsemble) {
           this.conformationEnsemble = conformationEnsemble;
    }


    /**
     * Gets the conformationEnsemble value for this AtomicCoordinates_confEnsemblesType.
     * 
     * @return conformationEnsemble
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConformationEnsembleType[] getConformationEnsemble() {
        return conformationEnsemble;
    }


    /**
     * Sets the conformationEnsemble value for this AtomicCoordinates_confEnsemblesType.
     * 
     * @param conformationEnsemble
     */
    public void setConformationEnsemble(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConformationEnsembleType[] conformationEnsemble) {
        this.conformationEnsemble = conformationEnsemble;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConformationEnsembleType getConformationEnsemble(int i) {
        return this.conformationEnsemble[i];
    }

    public void setConformationEnsemble(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConformationEnsembleType _value) {
        this.conformationEnsemble[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtomicCoordinates_confEnsemblesType)) return false;
        AtomicCoordinates_confEnsemblesType other = (AtomicCoordinates_confEnsemblesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conformationEnsemble==null && other.getConformationEnsemble()==null) || 
             (this.conformationEnsemble!=null &&
              java.util.Arrays.equals(this.conformationEnsemble, other.getConformationEnsemble())));
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
        if (getConformationEnsemble() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConformationEnsemble());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConformationEnsemble(), i);
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
        new org.apache.axis.description.TypeDesc(AtomicCoordinates_confEnsemblesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-coordinates_conf-ensemblesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conformationEnsemble");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Conformation-ensemble"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Conformation-ensembleType"));
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
