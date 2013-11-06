/**
 * ChemicalListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ChemicalListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalType[] chemical;

    public ChemicalListType() {
    }

    public ChemicalListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalType[] chemical) {
           this.chemical = chemical;
    }


    /**
     * Gets the chemical value for this ChemicalListType.
     * 
     * @return chemical
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalType[] getChemical() {
        return chemical;
    }


    /**
     * Sets the chemical value for this ChemicalListType.
     * 
     * @param chemical
     */
    public void setChemical(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalType[] chemical) {
        this.chemical = chemical;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalType getChemical(int i) {
        return this.chemical[i];
    }

    public void setChemical(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemicalType _value) {
        this.chemical[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChemicalListType)) return false;
        ChemicalListType other = (ChemicalListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chemical==null && other.getChemical()==null) || 
             (this.chemical!=null &&
              java.util.Arrays.equals(this.chemical, other.getChemical())));
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
        if (getChemical() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChemical());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChemical(), i);
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
        new org.apache.axis.description.TypeDesc(ChemicalListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ChemicalListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemical");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chemical"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ChemicalType"));
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
