/**
 * PDBBlockType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PDBBlockType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_depositionType PDBBlock_deposition;

    private java.lang.String PDBBlock_class;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_compoundType PDBBlock_compound;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_sourceType PDBBlock_source;

    private java.lang.String PDBBlock_expMethod;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_replaceType PDBBlock_replace;

    public PDBBlockType() {
    }

    public PDBBlockType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_depositionType PDBBlock_deposition,
           java.lang.String PDBBlock_class,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_compoundType PDBBlock_compound,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_sourceType PDBBlock_source,
           java.lang.String PDBBlock_expMethod,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_replaceType PDBBlock_replace) {
           this.PDBBlock_deposition = PDBBlock_deposition;
           this.PDBBlock_class = PDBBlock_class;
           this.PDBBlock_compound = PDBBlock_compound;
           this.PDBBlock_source = PDBBlock_source;
           this.PDBBlock_expMethod = PDBBlock_expMethod;
           this.PDBBlock_replace = PDBBlock_replace;
    }


    /**
     * Gets the PDBBlock_deposition value for this PDBBlockType.
     * 
     * @return PDBBlock_deposition
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_depositionType getPDBBlock_deposition() {
        return PDBBlock_deposition;
    }


    /**
     * Sets the PDBBlock_deposition value for this PDBBlockType.
     * 
     * @param PDBBlock_deposition
     */
    public void setPDBBlock_deposition(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_depositionType PDBBlock_deposition) {
        this.PDBBlock_deposition = PDBBlock_deposition;
    }


    /**
     * Gets the PDBBlock_class value for this PDBBlockType.
     * 
     * @return PDBBlock_class
     */
    public java.lang.String getPDBBlock_class() {
        return PDBBlock_class;
    }


    /**
     * Sets the PDBBlock_class value for this PDBBlockType.
     * 
     * @param PDBBlock_class
     */
    public void setPDBBlock_class(java.lang.String PDBBlock_class) {
        this.PDBBlock_class = PDBBlock_class;
    }


    /**
     * Gets the PDBBlock_compound value for this PDBBlockType.
     * 
     * @return PDBBlock_compound
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_compoundType getPDBBlock_compound() {
        return PDBBlock_compound;
    }


    /**
     * Sets the PDBBlock_compound value for this PDBBlockType.
     * 
     * @param PDBBlock_compound
     */
    public void setPDBBlock_compound(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_compoundType PDBBlock_compound) {
        this.PDBBlock_compound = PDBBlock_compound;
    }


    /**
     * Gets the PDBBlock_source value for this PDBBlockType.
     * 
     * @return PDBBlock_source
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_sourceType getPDBBlock_source() {
        return PDBBlock_source;
    }


    /**
     * Sets the PDBBlock_source value for this PDBBlockType.
     * 
     * @param PDBBlock_source
     */
    public void setPDBBlock_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_sourceType PDBBlock_source) {
        this.PDBBlock_source = PDBBlock_source;
    }


    /**
     * Gets the PDBBlock_expMethod value for this PDBBlockType.
     * 
     * @return PDBBlock_expMethod
     */
    public java.lang.String getPDBBlock_expMethod() {
        return PDBBlock_expMethod;
    }


    /**
     * Sets the PDBBlock_expMethod value for this PDBBlockType.
     * 
     * @param PDBBlock_expMethod
     */
    public void setPDBBlock_expMethod(java.lang.String PDBBlock_expMethod) {
        this.PDBBlock_expMethod = PDBBlock_expMethod;
    }


    /**
     * Gets the PDBBlock_replace value for this PDBBlockType.
     * 
     * @return PDBBlock_replace
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_replaceType getPDBBlock_replace() {
        return PDBBlock_replace;
    }


    /**
     * Sets the PDBBlock_replace value for this PDBBlockType.
     * 
     * @param PDBBlock_replace
     */
    public void setPDBBlock_replace(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBBlock_replaceType PDBBlock_replace) {
        this.PDBBlock_replace = PDBBlock_replace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PDBBlockType)) return false;
        PDBBlockType other = (PDBBlockType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PDBBlock_deposition==null && other.getPDBBlock_deposition()==null) || 
             (this.PDBBlock_deposition!=null &&
              this.PDBBlock_deposition.equals(other.getPDBBlock_deposition()))) &&
            ((this.PDBBlock_class==null && other.getPDBBlock_class()==null) || 
             (this.PDBBlock_class!=null &&
              this.PDBBlock_class.equals(other.getPDBBlock_class()))) &&
            ((this.PDBBlock_compound==null && other.getPDBBlock_compound()==null) || 
             (this.PDBBlock_compound!=null &&
              this.PDBBlock_compound.equals(other.getPDBBlock_compound()))) &&
            ((this.PDBBlock_source==null && other.getPDBBlock_source()==null) || 
             (this.PDBBlock_source!=null &&
              this.PDBBlock_source.equals(other.getPDBBlock_source()))) &&
            ((this.PDBBlock_expMethod==null && other.getPDBBlock_expMethod()==null) || 
             (this.PDBBlock_expMethod!=null &&
              this.PDBBlock_expMethod.equals(other.getPDBBlock_expMethod()))) &&
            ((this.PDBBlock_replace==null && other.getPDBBlock_replace()==null) || 
             (this.PDBBlock_replace!=null &&
              this.PDBBlock_replace.equals(other.getPDBBlock_replace())));
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
        if (getPDBBlock_deposition() != null) {
            _hashCode += getPDBBlock_deposition().hashCode();
        }
        if (getPDBBlock_class() != null) {
            _hashCode += getPDBBlock_class().hashCode();
        }
        if (getPDBBlock_compound() != null) {
            _hashCode += getPDBBlock_compound().hashCode();
        }
        if (getPDBBlock_source() != null) {
            _hashCode += getPDBBlock_source().hashCode();
        }
        if (getPDBBlock_expMethod() != null) {
            _hashCode += getPDBBlock_expMethod().hashCode();
        }
        if (getPDBBlock_replace() != null) {
            _hashCode += getPDBBlock_replace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PDBBlockType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-blockType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBBlock_deposition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_deposition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_depositionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBBlock_class");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBBlock_compound");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_compound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_compoundType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBBlock_source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_sourceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBBlock_expMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_exp-method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBBlock_replace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_replace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_replaceType"));
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
