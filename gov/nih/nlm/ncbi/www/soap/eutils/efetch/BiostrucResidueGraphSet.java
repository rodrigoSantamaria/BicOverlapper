/**
 * BiostrucResidueGraphSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucResidueGraphSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSet_idType biostrucResidueGraphSet_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSet_descrType biostrucResidueGraphSet_descr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSet_residueGraphsType biostrucResidueGraphSet_residueGraphs;

    public BiostrucResidueGraphSet() {
    }

    public BiostrucResidueGraphSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSet_idType biostrucResidueGraphSet_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSet_descrType biostrucResidueGraphSet_descr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSet_residueGraphsType biostrucResidueGraphSet_residueGraphs) {
           this.biostrucResidueGraphSet_id = biostrucResidueGraphSet_id;
           this.biostrucResidueGraphSet_descr = biostrucResidueGraphSet_descr;
           this.biostrucResidueGraphSet_residueGraphs = biostrucResidueGraphSet_residueGraphs;
    }


    /**
     * Gets the biostrucResidueGraphSet_id value for this BiostrucResidueGraphSet.
     * 
     * @return biostrucResidueGraphSet_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSet_idType getBiostrucResidueGraphSet_id() {
        return biostrucResidueGraphSet_id;
    }


    /**
     * Sets the biostrucResidueGraphSet_id value for this BiostrucResidueGraphSet.
     * 
     * @param biostrucResidueGraphSet_id
     */
    public void setBiostrucResidueGraphSet_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSet_idType biostrucResidueGraphSet_id) {
        this.biostrucResidueGraphSet_id = biostrucResidueGraphSet_id;
    }


    /**
     * Gets the biostrucResidueGraphSet_descr value for this BiostrucResidueGraphSet.
     * 
     * @return biostrucResidueGraphSet_descr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSet_descrType getBiostrucResidueGraphSet_descr() {
        return biostrucResidueGraphSet_descr;
    }


    /**
     * Sets the biostrucResidueGraphSet_descr value for this BiostrucResidueGraphSet.
     * 
     * @param biostrucResidueGraphSet_descr
     */
    public void setBiostrucResidueGraphSet_descr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSet_descrType biostrucResidueGraphSet_descr) {
        this.biostrucResidueGraphSet_descr = biostrucResidueGraphSet_descr;
    }


    /**
     * Gets the biostrucResidueGraphSet_residueGraphs value for this BiostrucResidueGraphSet.
     * 
     * @return biostrucResidueGraphSet_residueGraphs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSet_residueGraphsType getBiostrucResidueGraphSet_residueGraphs() {
        return biostrucResidueGraphSet_residueGraphs;
    }


    /**
     * Sets the biostrucResidueGraphSet_residueGraphs value for this BiostrucResidueGraphSet.
     * 
     * @param biostrucResidueGraphSet_residueGraphs
     */
    public void setBiostrucResidueGraphSet_residueGraphs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSet_residueGraphsType biostrucResidueGraphSet_residueGraphs) {
        this.biostrucResidueGraphSet_residueGraphs = biostrucResidueGraphSet_residueGraphs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucResidueGraphSet)) return false;
        BiostrucResidueGraphSet other = (BiostrucResidueGraphSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucResidueGraphSet_id==null && other.getBiostrucResidueGraphSet_id()==null) || 
             (this.biostrucResidueGraphSet_id!=null &&
              this.biostrucResidueGraphSet_id.equals(other.getBiostrucResidueGraphSet_id()))) &&
            ((this.biostrucResidueGraphSet_descr==null && other.getBiostrucResidueGraphSet_descr()==null) || 
             (this.biostrucResidueGraphSet_descr!=null &&
              this.biostrucResidueGraphSet_descr.equals(other.getBiostrucResidueGraphSet_descr()))) &&
            ((this.biostrucResidueGraphSet_residueGraphs==null && other.getBiostrucResidueGraphSet_residueGraphs()==null) || 
             (this.biostrucResidueGraphSet_residueGraphs!=null &&
              this.biostrucResidueGraphSet_residueGraphs.equals(other.getBiostrucResidueGraphSet_residueGraphs())));
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
        if (getBiostrucResidueGraphSet_id() != null) {
            _hashCode += getBiostrucResidueGraphSet_id().hashCode();
        }
        if (getBiostrucResidueGraphSet_descr() != null) {
            _hashCode += getBiostrucResidueGraphSet_descr().hashCode();
        }
        if (getBiostrucResidueGraphSet_residueGraphs() != null) {
            _hashCode += getBiostrucResidueGraphSet_residueGraphs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucResidueGraphSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Biostruc-residue-graph-set"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucResidueGraphSet_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set_idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucResidueGraphSet_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set_descrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucResidueGraphSet_residueGraphs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set_residue-graphs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set_residue-graphsType"));
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
