/**
 * ResidueExplicitPntrsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResidueExplicitPntrsType  implements java.io.Serializable {
    private java.lang.String residueExplicitPntrs_numberOfPtrs;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueExplicitPntrs_moleculeIdsType residueExplicitPntrs_moleculeIds;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueExplicitPntrs_residueIdsType residueExplicitPntrs_residueIds;

    public ResidueExplicitPntrsType() {
    }

    public ResidueExplicitPntrsType(
           java.lang.String residueExplicitPntrs_numberOfPtrs,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueExplicitPntrs_moleculeIdsType residueExplicitPntrs_moleculeIds,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueExplicitPntrs_residueIdsType residueExplicitPntrs_residueIds) {
           this.residueExplicitPntrs_numberOfPtrs = residueExplicitPntrs_numberOfPtrs;
           this.residueExplicitPntrs_moleculeIds = residueExplicitPntrs_moleculeIds;
           this.residueExplicitPntrs_residueIds = residueExplicitPntrs_residueIds;
    }


    /**
     * Gets the residueExplicitPntrs_numberOfPtrs value for this ResidueExplicitPntrsType.
     * 
     * @return residueExplicitPntrs_numberOfPtrs
     */
    public java.lang.String getResidueExplicitPntrs_numberOfPtrs() {
        return residueExplicitPntrs_numberOfPtrs;
    }


    /**
     * Sets the residueExplicitPntrs_numberOfPtrs value for this ResidueExplicitPntrsType.
     * 
     * @param residueExplicitPntrs_numberOfPtrs
     */
    public void setResidueExplicitPntrs_numberOfPtrs(java.lang.String residueExplicitPntrs_numberOfPtrs) {
        this.residueExplicitPntrs_numberOfPtrs = residueExplicitPntrs_numberOfPtrs;
    }


    /**
     * Gets the residueExplicitPntrs_moleculeIds value for this ResidueExplicitPntrsType.
     * 
     * @return residueExplicitPntrs_moleculeIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueExplicitPntrs_moleculeIdsType getResidueExplicitPntrs_moleculeIds() {
        return residueExplicitPntrs_moleculeIds;
    }


    /**
     * Sets the residueExplicitPntrs_moleculeIds value for this ResidueExplicitPntrsType.
     * 
     * @param residueExplicitPntrs_moleculeIds
     */
    public void setResidueExplicitPntrs_moleculeIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueExplicitPntrs_moleculeIdsType residueExplicitPntrs_moleculeIds) {
        this.residueExplicitPntrs_moleculeIds = residueExplicitPntrs_moleculeIds;
    }


    /**
     * Gets the residueExplicitPntrs_residueIds value for this ResidueExplicitPntrsType.
     * 
     * @return residueExplicitPntrs_residueIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueExplicitPntrs_residueIdsType getResidueExplicitPntrs_residueIds() {
        return residueExplicitPntrs_residueIds;
    }


    /**
     * Sets the residueExplicitPntrs_residueIds value for this ResidueExplicitPntrsType.
     * 
     * @param residueExplicitPntrs_residueIds
     */
    public void setResidueExplicitPntrs_residueIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueExplicitPntrs_residueIdsType residueExplicitPntrs_residueIds) {
        this.residueExplicitPntrs_residueIds = residueExplicitPntrs_residueIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResidueExplicitPntrsType)) return false;
        ResidueExplicitPntrsType other = (ResidueExplicitPntrsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.residueExplicitPntrs_numberOfPtrs==null && other.getResidueExplicitPntrs_numberOfPtrs()==null) || 
             (this.residueExplicitPntrs_numberOfPtrs!=null &&
              this.residueExplicitPntrs_numberOfPtrs.equals(other.getResidueExplicitPntrs_numberOfPtrs()))) &&
            ((this.residueExplicitPntrs_moleculeIds==null && other.getResidueExplicitPntrs_moleculeIds()==null) || 
             (this.residueExplicitPntrs_moleculeIds!=null &&
              this.residueExplicitPntrs_moleculeIds.equals(other.getResidueExplicitPntrs_moleculeIds()))) &&
            ((this.residueExplicitPntrs_residueIds==null && other.getResidueExplicitPntrs_residueIds()==null) || 
             (this.residueExplicitPntrs_residueIds!=null &&
              this.residueExplicitPntrs_residueIds.equals(other.getResidueExplicitPntrs_residueIds())));
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
        if (getResidueExplicitPntrs_numberOfPtrs() != null) {
            _hashCode += getResidueExplicitPntrs_numberOfPtrs().hashCode();
        }
        if (getResidueExplicitPntrs_moleculeIds() != null) {
            _hashCode += getResidueExplicitPntrs_moleculeIds().hashCode();
        }
        if (getResidueExplicitPntrs_residueIds() != null) {
            _hashCode += getResidueExplicitPntrs_residueIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResidueExplicitPntrsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-explicit-pntrsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueExplicitPntrs_numberOfPtrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-explicit-pntrs_number-of-ptrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueExplicitPntrs_moleculeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-explicit-pntrs_molecule-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-explicit-pntrs_molecule-idsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueExplicitPntrs_residueIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-explicit-pntrs_residue-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-explicit-pntrs_residue-idsType"));
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
