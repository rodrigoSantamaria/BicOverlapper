/**
 * Assay_citationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Assay_citationType  implements java.io.Serializable {
    private java.lang.String[] assay_citation_E;

    public Assay_citationType() {
    }

    public Assay_citationType(
           java.lang.String[] assay_citation_E) {
           this.assay_citation_E = assay_citation_E;
    }


    /**
     * Gets the assay_citation_E value for this Assay_citationType.
     * 
     * @return assay_citation_E
     */
    public java.lang.String[] getAssay_citation_E() {
        return assay_citation_E;
    }


    /**
     * Sets the assay_citation_E value for this Assay_citationType.
     * 
     * @param assay_citation_E
     */
    public void setAssay_citation_E(java.lang.String[] assay_citation_E) {
        this.assay_citation_E = assay_citation_E;
    }

    public java.lang.String getAssay_citation_E(int i) {
        return this.assay_citation_E[i];
    }

    public void setAssay_citation_E(int i, java.lang.String _value) {
        this.assay_citation_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Assay_citationType)) return false;
        Assay_citationType other = (Assay_citationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assay_citation_E==null && other.getAssay_citation_E()==null) || 
             (this.assay_citation_E!=null &&
              java.util.Arrays.equals(this.assay_citation_E, other.getAssay_citation_E())));
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
        if (getAssay_citation_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssay_citation_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssay_citation_E(), i);
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
        new org.apache.axis.description.TypeDesc(Assay_citationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_citationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_citation_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_citation_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_citation_E"));
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
