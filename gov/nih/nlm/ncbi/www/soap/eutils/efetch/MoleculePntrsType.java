/**
 * MoleculePntrsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MoleculePntrsType  implements java.io.Serializable {
    private java.lang.String moleculePntrs_numberOfPtrs;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MoleculePntrs_moleculeIdsType moleculePntrs_moleculeIds;

    public MoleculePntrsType() {
    }

    public MoleculePntrsType(
           java.lang.String moleculePntrs_numberOfPtrs,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MoleculePntrs_moleculeIdsType moleculePntrs_moleculeIds) {
           this.moleculePntrs_numberOfPtrs = moleculePntrs_numberOfPtrs;
           this.moleculePntrs_moleculeIds = moleculePntrs_moleculeIds;
    }


    /**
     * Gets the moleculePntrs_numberOfPtrs value for this MoleculePntrsType.
     * 
     * @return moleculePntrs_numberOfPtrs
     */
    public java.lang.String getMoleculePntrs_numberOfPtrs() {
        return moleculePntrs_numberOfPtrs;
    }


    /**
     * Sets the moleculePntrs_numberOfPtrs value for this MoleculePntrsType.
     * 
     * @param moleculePntrs_numberOfPtrs
     */
    public void setMoleculePntrs_numberOfPtrs(java.lang.String moleculePntrs_numberOfPtrs) {
        this.moleculePntrs_numberOfPtrs = moleculePntrs_numberOfPtrs;
    }


    /**
     * Gets the moleculePntrs_moleculeIds value for this MoleculePntrsType.
     * 
     * @return moleculePntrs_moleculeIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MoleculePntrs_moleculeIdsType getMoleculePntrs_moleculeIds() {
        return moleculePntrs_moleculeIds;
    }


    /**
     * Sets the moleculePntrs_moleculeIds value for this MoleculePntrsType.
     * 
     * @param moleculePntrs_moleculeIds
     */
    public void setMoleculePntrs_moleculeIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MoleculePntrs_moleculeIdsType moleculePntrs_moleculeIds) {
        this.moleculePntrs_moleculeIds = moleculePntrs_moleculeIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoleculePntrsType)) return false;
        MoleculePntrsType other = (MoleculePntrsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.moleculePntrs_numberOfPtrs==null && other.getMoleculePntrs_numberOfPtrs()==null) || 
             (this.moleculePntrs_numberOfPtrs!=null &&
              this.moleculePntrs_numberOfPtrs.equals(other.getMoleculePntrs_numberOfPtrs()))) &&
            ((this.moleculePntrs_moleculeIds==null && other.getMoleculePntrs_moleculeIds()==null) || 
             (this.moleculePntrs_moleculeIds!=null &&
              this.moleculePntrs_moleculeIds.equals(other.getMoleculePntrs_moleculeIds())));
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
        if (getMoleculePntrs_numberOfPtrs() != null) {
            _hashCode += getMoleculePntrs_numberOfPtrs().hashCode();
        }
        if (getMoleculePntrs_moleculeIds() != null) {
            _hashCode += getMoleculePntrs_moleculeIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoleculePntrsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Molecule-pntrsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moleculePntrs_numberOfPtrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Molecule-pntrs_number-of-ptrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moleculePntrs_moleculeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Molecule-pntrs_molecule-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Molecule-pntrs_molecule-idsType"));
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
