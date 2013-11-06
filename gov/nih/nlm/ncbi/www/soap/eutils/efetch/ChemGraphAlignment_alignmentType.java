/**
 * ChemGraphAlignment_alignmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ChemGraphAlignment_alignmentType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrsType[] chemGraphPntrs;

    public ChemGraphAlignment_alignmentType() {
    }

    public ChemGraphAlignment_alignmentType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrsType[] chemGraphPntrs) {
           this.chemGraphPntrs = chemGraphPntrs;
    }


    /**
     * Gets the chemGraphPntrs value for this ChemGraphAlignment_alignmentType.
     * 
     * @return chemGraphPntrs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrsType[] getChemGraphPntrs() {
        return chemGraphPntrs;
    }


    /**
     * Sets the chemGraphPntrs value for this ChemGraphAlignment_alignmentType.
     * 
     * @param chemGraphPntrs
     */
    public void setChemGraphPntrs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrsType[] chemGraphPntrs) {
        this.chemGraphPntrs = chemGraphPntrs;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrsType getChemGraphPntrs(int i) {
        return this.chemGraphPntrs[i];
    }

    public void setChemGraphPntrs(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrsType _value) {
        this.chemGraphPntrs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChemGraphAlignment_alignmentType)) return false;
        ChemGraphAlignment_alignmentType other = (ChemGraphAlignment_alignmentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chemGraphPntrs==null && other.getChemGraphPntrs()==null) || 
             (this.chemGraphPntrs!=null &&
              java.util.Arrays.equals(this.chemGraphPntrs, other.getChemGraphPntrs())));
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
        if (getChemGraphPntrs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChemGraphPntrs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChemGraphPntrs(), i);
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
        new org.apache.axis.description.TypeDesc(ChemGraphAlignment_alignmentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_alignmentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemGraphPntrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-pntrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-pntrsType"));
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
