/**
 * Taxon2Data_blastNameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Taxon2Data_blastNameType  implements java.io.Serializable {
    private java.lang.String[] taxon2Data_blastName_E;

    public Taxon2Data_blastNameType() {
    }

    public Taxon2Data_blastNameType(
           java.lang.String[] taxon2Data_blastName_E) {
           this.taxon2Data_blastName_E = taxon2Data_blastName_E;
    }


    /**
     * Gets the taxon2Data_blastName_E value for this Taxon2Data_blastNameType.
     * 
     * @return taxon2Data_blastName_E
     */
    public java.lang.String[] getTaxon2Data_blastName_E() {
        return taxon2Data_blastName_E;
    }


    /**
     * Sets the taxon2Data_blastName_E value for this Taxon2Data_blastNameType.
     * 
     * @param taxon2Data_blastName_E
     */
    public void setTaxon2Data_blastName_E(java.lang.String[] taxon2Data_blastName_E) {
        this.taxon2Data_blastName_E = taxon2Data_blastName_E;
    }

    public java.lang.String getTaxon2Data_blastName_E(int i) {
        return this.taxon2Data_blastName_E[i];
    }

    public void setTaxon2Data_blastName_E(int i, java.lang.String _value) {
        this.taxon2Data_blastName_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Taxon2Data_blastNameType)) return false;
        Taxon2Data_blastNameType other = (Taxon2Data_blastNameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxon2Data_blastName_E==null && other.getTaxon2Data_blastName_E()==null) || 
             (this.taxon2Data_blastName_E!=null &&
              java.util.Arrays.equals(this.taxon2Data_blastName_E, other.getTaxon2Data_blastName_E())));
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
        if (getTaxon2Data_blastName_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxon2Data_blastName_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxon2Data_blastName_E(), i);
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
        new org.apache.axis.description.TypeDesc(Taxon2Data_blastNameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-data_blast-nameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon2Data_blastName_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-data_blast-name_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-data_blast-name_E"));
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
