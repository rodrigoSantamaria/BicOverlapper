/**
 * ResidueGraph_descrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResidueGraph_descrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescrType[] biomolDescr;

    public ResidueGraph_descrType() {
    }

    public ResidueGraph_descrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescrType[] biomolDescr) {
           this.biomolDescr = biomolDescr;
    }


    /**
     * Gets the biomolDescr value for this ResidueGraph_descrType.
     * 
     * @return biomolDescr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescrType[] getBiomolDescr() {
        return biomolDescr;
    }


    /**
     * Sets the biomolDescr value for this ResidueGraph_descrType.
     * 
     * @param biomolDescr
     */
    public void setBiomolDescr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescrType[] biomolDescr) {
        this.biomolDescr = biomolDescr;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescrType getBiomolDescr(int i) {
        return this.biomolDescr[i];
    }

    public void setBiomolDescr(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescrType _value) {
        this.biomolDescr[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResidueGraph_descrType)) return false;
        ResidueGraph_descrType other = (ResidueGraph_descrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biomolDescr==null && other.getBiomolDescr()==null) || 
             (this.biomolDescr!=null &&
              java.util.Arrays.equals(this.biomolDescr, other.getBiomolDescr())));
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
        if (getBiomolDescr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBiomolDescr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBiomolDescr(), i);
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
        new org.apache.axis.description.TypeDesc(ResidueGraph_descrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph_descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biomolDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descrType"));
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
