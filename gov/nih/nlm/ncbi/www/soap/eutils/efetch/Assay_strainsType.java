/**
 * Assay_strainsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Assay_strainsType  implements java.io.Serializable {
    private java.lang.String[] assay_strains_E;

    public Assay_strainsType() {
    }

    public Assay_strainsType(
           java.lang.String[] assay_strains_E) {
           this.assay_strains_E = assay_strains_E;
    }


    /**
     * Gets the assay_strains_E value for this Assay_strainsType.
     * 
     * @return assay_strains_E
     */
    public java.lang.String[] getAssay_strains_E() {
        return assay_strains_E;
    }


    /**
     * Sets the assay_strains_E value for this Assay_strainsType.
     * 
     * @param assay_strains_E
     */
    public void setAssay_strains_E(java.lang.String[] assay_strains_E) {
        this.assay_strains_E = assay_strains_E;
    }

    public java.lang.String getAssay_strains_E(int i) {
        return this.assay_strains_E[i];
    }

    public void setAssay_strains_E(int i, java.lang.String _value) {
        this.assay_strains_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Assay_strainsType)) return false;
        Assay_strainsType other = (Assay_strainsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assay_strains_E==null && other.getAssay_strains_E()==null) || 
             (this.assay_strains_E!=null &&
              java.util.Arrays.equals(this.assay_strains_E, other.getAssay_strains_E())));
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
        if (getAssay_strains_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssay_strains_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssay_strains_E(), i);
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
        new org.apache.axis.description.TypeDesc(Assay_strainsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_strainsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_strains_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_strains_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_strains_E"));
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
