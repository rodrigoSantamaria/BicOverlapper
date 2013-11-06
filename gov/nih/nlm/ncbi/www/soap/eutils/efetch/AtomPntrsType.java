/**
 * AtomPntrsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AtomPntrsType  implements java.io.Serializable {
    private java.lang.String atomPntrs_numberOfPtrs;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrs_moleculeIdsType atomPntrs_moleculeIds;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrs_residueIdsType atomPntrs_residueIds;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrs_atomIdsType atomPntrs_atomIds;

    public AtomPntrsType() {
    }

    public AtomPntrsType(
           java.lang.String atomPntrs_numberOfPtrs,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrs_moleculeIdsType atomPntrs_moleculeIds,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrs_residueIdsType atomPntrs_residueIds,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrs_atomIdsType atomPntrs_atomIds) {
           this.atomPntrs_numberOfPtrs = atomPntrs_numberOfPtrs;
           this.atomPntrs_moleculeIds = atomPntrs_moleculeIds;
           this.atomPntrs_residueIds = atomPntrs_residueIds;
           this.atomPntrs_atomIds = atomPntrs_atomIds;
    }


    /**
     * Gets the atomPntrs_numberOfPtrs value for this AtomPntrsType.
     * 
     * @return atomPntrs_numberOfPtrs
     */
    public java.lang.String getAtomPntrs_numberOfPtrs() {
        return atomPntrs_numberOfPtrs;
    }


    /**
     * Sets the atomPntrs_numberOfPtrs value for this AtomPntrsType.
     * 
     * @param atomPntrs_numberOfPtrs
     */
    public void setAtomPntrs_numberOfPtrs(java.lang.String atomPntrs_numberOfPtrs) {
        this.atomPntrs_numberOfPtrs = atomPntrs_numberOfPtrs;
    }


    /**
     * Gets the atomPntrs_moleculeIds value for this AtomPntrsType.
     * 
     * @return atomPntrs_moleculeIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrs_moleculeIdsType getAtomPntrs_moleculeIds() {
        return atomPntrs_moleculeIds;
    }


    /**
     * Sets the atomPntrs_moleculeIds value for this AtomPntrsType.
     * 
     * @param atomPntrs_moleculeIds
     */
    public void setAtomPntrs_moleculeIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrs_moleculeIdsType atomPntrs_moleculeIds) {
        this.atomPntrs_moleculeIds = atomPntrs_moleculeIds;
    }


    /**
     * Gets the atomPntrs_residueIds value for this AtomPntrsType.
     * 
     * @return atomPntrs_residueIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrs_residueIdsType getAtomPntrs_residueIds() {
        return atomPntrs_residueIds;
    }


    /**
     * Sets the atomPntrs_residueIds value for this AtomPntrsType.
     * 
     * @param atomPntrs_residueIds
     */
    public void setAtomPntrs_residueIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrs_residueIdsType atomPntrs_residueIds) {
        this.atomPntrs_residueIds = atomPntrs_residueIds;
    }


    /**
     * Gets the atomPntrs_atomIds value for this AtomPntrsType.
     * 
     * @return atomPntrs_atomIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrs_atomIdsType getAtomPntrs_atomIds() {
        return atomPntrs_atomIds;
    }


    /**
     * Sets the atomPntrs_atomIds value for this AtomPntrsType.
     * 
     * @param atomPntrs_atomIds
     */
    public void setAtomPntrs_atomIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrs_atomIdsType atomPntrs_atomIds) {
        this.atomPntrs_atomIds = atomPntrs_atomIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtomPntrsType)) return false;
        AtomPntrsType other = (AtomPntrsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atomPntrs_numberOfPtrs==null && other.getAtomPntrs_numberOfPtrs()==null) || 
             (this.atomPntrs_numberOfPtrs!=null &&
              this.atomPntrs_numberOfPtrs.equals(other.getAtomPntrs_numberOfPtrs()))) &&
            ((this.atomPntrs_moleculeIds==null && other.getAtomPntrs_moleculeIds()==null) || 
             (this.atomPntrs_moleculeIds!=null &&
              this.atomPntrs_moleculeIds.equals(other.getAtomPntrs_moleculeIds()))) &&
            ((this.atomPntrs_residueIds==null && other.getAtomPntrs_residueIds()==null) || 
             (this.atomPntrs_residueIds!=null &&
              this.atomPntrs_residueIds.equals(other.getAtomPntrs_residueIds()))) &&
            ((this.atomPntrs_atomIds==null && other.getAtomPntrs_atomIds()==null) || 
             (this.atomPntrs_atomIds!=null &&
              this.atomPntrs_atomIds.equals(other.getAtomPntrs_atomIds())));
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
        if (getAtomPntrs_numberOfPtrs() != null) {
            _hashCode += getAtomPntrs_numberOfPtrs().hashCode();
        }
        if (getAtomPntrs_moleculeIds() != null) {
            _hashCode += getAtomPntrs_moleculeIds().hashCode();
        }
        if (getAtomPntrs_residueIds() != null) {
            _hashCode += getAtomPntrs_residueIds().hashCode();
        }
        if (getAtomPntrs_atomIds() != null) {
            _hashCode += getAtomPntrs_atomIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtomPntrsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntrsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomPntrs_numberOfPtrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntrs_number-of-ptrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomPntrs_moleculeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntrs_molecule-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntrs_molecule-idsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomPntrs_residueIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntrs_residue-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntrs_residue-idsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomPntrs_atomIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntrs_atom-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntrs_atom-idsType"));
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
