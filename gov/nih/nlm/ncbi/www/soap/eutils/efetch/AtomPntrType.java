/**
 * AtomPntrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AtomPntrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntr_moleculeIdType atomPntr_moleculeId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntr_residueIdType atomPntr_residueId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntr_atomIdType atomPntr_atomId;

    public AtomPntrType() {
    }

    public AtomPntrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntr_moleculeIdType atomPntr_moleculeId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntr_residueIdType atomPntr_residueId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntr_atomIdType atomPntr_atomId) {
           this.atomPntr_moleculeId = atomPntr_moleculeId;
           this.atomPntr_residueId = atomPntr_residueId;
           this.atomPntr_atomId = atomPntr_atomId;
    }


    /**
     * Gets the atomPntr_moleculeId value for this AtomPntrType.
     * 
     * @return atomPntr_moleculeId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntr_moleculeIdType getAtomPntr_moleculeId() {
        return atomPntr_moleculeId;
    }


    /**
     * Sets the atomPntr_moleculeId value for this AtomPntrType.
     * 
     * @param atomPntr_moleculeId
     */
    public void setAtomPntr_moleculeId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntr_moleculeIdType atomPntr_moleculeId) {
        this.atomPntr_moleculeId = atomPntr_moleculeId;
    }


    /**
     * Gets the atomPntr_residueId value for this AtomPntrType.
     * 
     * @return atomPntr_residueId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntr_residueIdType getAtomPntr_residueId() {
        return atomPntr_residueId;
    }


    /**
     * Sets the atomPntr_residueId value for this AtomPntrType.
     * 
     * @param atomPntr_residueId
     */
    public void setAtomPntr_residueId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntr_residueIdType atomPntr_residueId) {
        this.atomPntr_residueId = atomPntr_residueId;
    }


    /**
     * Gets the atomPntr_atomId value for this AtomPntrType.
     * 
     * @return atomPntr_atomId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntr_atomIdType getAtomPntr_atomId() {
        return atomPntr_atomId;
    }


    /**
     * Sets the atomPntr_atomId value for this AtomPntrType.
     * 
     * @param atomPntr_atomId
     */
    public void setAtomPntr_atomId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntr_atomIdType atomPntr_atomId) {
        this.atomPntr_atomId = atomPntr_atomId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtomPntrType)) return false;
        AtomPntrType other = (AtomPntrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atomPntr_moleculeId==null && other.getAtomPntr_moleculeId()==null) || 
             (this.atomPntr_moleculeId!=null &&
              this.atomPntr_moleculeId.equals(other.getAtomPntr_moleculeId()))) &&
            ((this.atomPntr_residueId==null && other.getAtomPntr_residueId()==null) || 
             (this.atomPntr_residueId!=null &&
              this.atomPntr_residueId.equals(other.getAtomPntr_residueId()))) &&
            ((this.atomPntr_atomId==null && other.getAtomPntr_atomId()==null) || 
             (this.atomPntr_atomId!=null &&
              this.atomPntr_atomId.equals(other.getAtomPntr_atomId())));
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
        if (getAtomPntr_moleculeId() != null) {
            _hashCode += getAtomPntr_moleculeId().hashCode();
        }
        if (getAtomPntr_residueId() != null) {
            _hashCode += getAtomPntr_residueId().hashCode();
        }
        if (getAtomPntr_atomId() != null) {
            _hashCode += getAtomPntr_atomId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtomPntrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomPntr_moleculeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntr_molecule-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntr_molecule-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomPntr_residueId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntr_residue-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntr_residue-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomPntr_atomId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntr_atom-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntr_atom-idType"));
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
