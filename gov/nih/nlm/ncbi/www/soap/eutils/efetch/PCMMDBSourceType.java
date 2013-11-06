/**
 * PCMMDBSourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCMMDBSourceType  implements java.io.Serializable {
    private java.lang.String PCMMDBSource_mmdbId;

    private java.lang.String PCMMDBSource_moleculeId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCMMDBSource_moleculeNameType PCMMDBSource_moleculeName;

    private java.lang.String PCMMDBSource_residueId;

    private java.lang.String PCMMDBSource_residueName;

    private java.lang.String PCMMDBSource_atomId;

    private java.lang.String PCMMDBSource_atomName;

    public PCMMDBSourceType() {
    }

    public PCMMDBSourceType(
           java.lang.String PCMMDBSource_mmdbId,
           java.lang.String PCMMDBSource_moleculeId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCMMDBSource_moleculeNameType PCMMDBSource_moleculeName,
           java.lang.String PCMMDBSource_residueId,
           java.lang.String PCMMDBSource_residueName,
           java.lang.String PCMMDBSource_atomId,
           java.lang.String PCMMDBSource_atomName) {
           this.PCMMDBSource_mmdbId = PCMMDBSource_mmdbId;
           this.PCMMDBSource_moleculeId = PCMMDBSource_moleculeId;
           this.PCMMDBSource_moleculeName = PCMMDBSource_moleculeName;
           this.PCMMDBSource_residueId = PCMMDBSource_residueId;
           this.PCMMDBSource_residueName = PCMMDBSource_residueName;
           this.PCMMDBSource_atomId = PCMMDBSource_atomId;
           this.PCMMDBSource_atomName = PCMMDBSource_atomName;
    }


    /**
     * Gets the PCMMDBSource_mmdbId value for this PCMMDBSourceType.
     * 
     * @return PCMMDBSource_mmdbId
     */
    public java.lang.String getPCMMDBSource_mmdbId() {
        return PCMMDBSource_mmdbId;
    }


    /**
     * Sets the PCMMDBSource_mmdbId value for this PCMMDBSourceType.
     * 
     * @param PCMMDBSource_mmdbId
     */
    public void setPCMMDBSource_mmdbId(java.lang.String PCMMDBSource_mmdbId) {
        this.PCMMDBSource_mmdbId = PCMMDBSource_mmdbId;
    }


    /**
     * Gets the PCMMDBSource_moleculeId value for this PCMMDBSourceType.
     * 
     * @return PCMMDBSource_moleculeId
     */
    public java.lang.String getPCMMDBSource_moleculeId() {
        return PCMMDBSource_moleculeId;
    }


    /**
     * Sets the PCMMDBSource_moleculeId value for this PCMMDBSourceType.
     * 
     * @param PCMMDBSource_moleculeId
     */
    public void setPCMMDBSource_moleculeId(java.lang.String PCMMDBSource_moleculeId) {
        this.PCMMDBSource_moleculeId = PCMMDBSource_moleculeId;
    }


    /**
     * Gets the PCMMDBSource_moleculeName value for this PCMMDBSourceType.
     * 
     * @return PCMMDBSource_moleculeName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCMMDBSource_moleculeNameType getPCMMDBSource_moleculeName() {
        return PCMMDBSource_moleculeName;
    }


    /**
     * Sets the PCMMDBSource_moleculeName value for this PCMMDBSourceType.
     * 
     * @param PCMMDBSource_moleculeName
     */
    public void setPCMMDBSource_moleculeName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCMMDBSource_moleculeNameType PCMMDBSource_moleculeName) {
        this.PCMMDBSource_moleculeName = PCMMDBSource_moleculeName;
    }


    /**
     * Gets the PCMMDBSource_residueId value for this PCMMDBSourceType.
     * 
     * @return PCMMDBSource_residueId
     */
    public java.lang.String getPCMMDBSource_residueId() {
        return PCMMDBSource_residueId;
    }


    /**
     * Sets the PCMMDBSource_residueId value for this PCMMDBSourceType.
     * 
     * @param PCMMDBSource_residueId
     */
    public void setPCMMDBSource_residueId(java.lang.String PCMMDBSource_residueId) {
        this.PCMMDBSource_residueId = PCMMDBSource_residueId;
    }


    /**
     * Gets the PCMMDBSource_residueName value for this PCMMDBSourceType.
     * 
     * @return PCMMDBSource_residueName
     */
    public java.lang.String getPCMMDBSource_residueName() {
        return PCMMDBSource_residueName;
    }


    /**
     * Sets the PCMMDBSource_residueName value for this PCMMDBSourceType.
     * 
     * @param PCMMDBSource_residueName
     */
    public void setPCMMDBSource_residueName(java.lang.String PCMMDBSource_residueName) {
        this.PCMMDBSource_residueName = PCMMDBSource_residueName;
    }


    /**
     * Gets the PCMMDBSource_atomId value for this PCMMDBSourceType.
     * 
     * @return PCMMDBSource_atomId
     */
    public java.lang.String getPCMMDBSource_atomId() {
        return PCMMDBSource_atomId;
    }


    /**
     * Sets the PCMMDBSource_atomId value for this PCMMDBSourceType.
     * 
     * @param PCMMDBSource_atomId
     */
    public void setPCMMDBSource_atomId(java.lang.String PCMMDBSource_atomId) {
        this.PCMMDBSource_atomId = PCMMDBSource_atomId;
    }


    /**
     * Gets the PCMMDBSource_atomName value for this PCMMDBSourceType.
     * 
     * @return PCMMDBSource_atomName
     */
    public java.lang.String getPCMMDBSource_atomName() {
        return PCMMDBSource_atomName;
    }


    /**
     * Sets the PCMMDBSource_atomName value for this PCMMDBSourceType.
     * 
     * @param PCMMDBSource_atomName
     */
    public void setPCMMDBSource_atomName(java.lang.String PCMMDBSource_atomName) {
        this.PCMMDBSource_atomName = PCMMDBSource_atomName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCMMDBSourceType)) return false;
        PCMMDBSourceType other = (PCMMDBSourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCMMDBSource_mmdbId==null && other.getPCMMDBSource_mmdbId()==null) || 
             (this.PCMMDBSource_mmdbId!=null &&
              this.PCMMDBSource_mmdbId.equals(other.getPCMMDBSource_mmdbId()))) &&
            ((this.PCMMDBSource_moleculeId==null && other.getPCMMDBSource_moleculeId()==null) || 
             (this.PCMMDBSource_moleculeId!=null &&
              this.PCMMDBSource_moleculeId.equals(other.getPCMMDBSource_moleculeId()))) &&
            ((this.PCMMDBSource_moleculeName==null && other.getPCMMDBSource_moleculeName()==null) || 
             (this.PCMMDBSource_moleculeName!=null &&
              this.PCMMDBSource_moleculeName.equals(other.getPCMMDBSource_moleculeName()))) &&
            ((this.PCMMDBSource_residueId==null && other.getPCMMDBSource_residueId()==null) || 
             (this.PCMMDBSource_residueId!=null &&
              this.PCMMDBSource_residueId.equals(other.getPCMMDBSource_residueId()))) &&
            ((this.PCMMDBSource_residueName==null && other.getPCMMDBSource_residueName()==null) || 
             (this.PCMMDBSource_residueName!=null &&
              this.PCMMDBSource_residueName.equals(other.getPCMMDBSource_residueName()))) &&
            ((this.PCMMDBSource_atomId==null && other.getPCMMDBSource_atomId()==null) || 
             (this.PCMMDBSource_atomId!=null &&
              this.PCMMDBSource_atomId.equals(other.getPCMMDBSource_atomId()))) &&
            ((this.PCMMDBSource_atomName==null && other.getPCMMDBSource_atomName()==null) || 
             (this.PCMMDBSource_atomName!=null &&
              this.PCMMDBSource_atomName.equals(other.getPCMMDBSource_atomName())));
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
        if (getPCMMDBSource_mmdbId() != null) {
            _hashCode += getPCMMDBSource_mmdbId().hashCode();
        }
        if (getPCMMDBSource_moleculeId() != null) {
            _hashCode += getPCMMDBSource_moleculeId().hashCode();
        }
        if (getPCMMDBSource_moleculeName() != null) {
            _hashCode += getPCMMDBSource_moleculeName().hashCode();
        }
        if (getPCMMDBSource_residueId() != null) {
            _hashCode += getPCMMDBSource_residueId().hashCode();
        }
        if (getPCMMDBSource_residueName() != null) {
            _hashCode += getPCMMDBSource_residueName().hashCode();
        }
        if (getPCMMDBSource_atomId() != null) {
            _hashCode += getPCMMDBSource_atomId().hashCode();
        }
        if (getPCMMDBSource_atomName() != null) {
            _hashCode += getPCMMDBSource_atomName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCMMDBSourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-MMDBSourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCMMDBSource_mmdbId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-MMDBSource_mmdb-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCMMDBSource_moleculeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-MMDBSource_molecule-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCMMDBSource_moleculeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-MMDBSource_molecule-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-MMDBSource_molecule-nameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCMMDBSource_residueId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-MMDBSource_residue-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCMMDBSource_residueName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-MMDBSource_residue-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCMMDBSource_atomId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-MMDBSource_atom-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCMMDBSource_atomName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-MMDBSource_atom-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
