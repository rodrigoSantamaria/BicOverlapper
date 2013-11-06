/**
 * MoleculeGraph_sidType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MoleculeGraph_sidType  implements java.io.Serializable {
    private java.lang.String PCSubstanceId;

    public MoleculeGraph_sidType() {
    }

    public MoleculeGraph_sidType(
           java.lang.String PCSubstanceId) {
           this.PCSubstanceId = PCSubstanceId;
    }


    /**
     * Gets the PCSubstanceId value for this MoleculeGraph_sidType.
     * 
     * @return PCSubstanceId
     */
    public java.lang.String getPCSubstanceId() {
        return PCSubstanceId;
    }


    /**
     * Sets the PCSubstanceId value for this MoleculeGraph_sidType.
     * 
     * @param PCSubstanceId
     */
    public void setPCSubstanceId(java.lang.String PCSubstanceId) {
        this.PCSubstanceId = PCSubstanceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoleculeGraph_sidType)) return false;
        MoleculeGraph_sidType other = (MoleculeGraph_sidType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCSubstanceId==null && other.getPCSubstanceId()==null) || 
             (this.PCSubstanceId!=null &&
              this.PCSubstanceId.equals(other.getPCSubstanceId())));
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
        if (getPCSubstanceId() != null) {
            _hashCode += getPCSubstanceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoleculeGraph_sidType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Molecule-graph_sidType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCSubstanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PCSubstance-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
