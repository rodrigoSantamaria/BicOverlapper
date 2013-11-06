/**
 * ResidueGraphPntrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResidueGraphPntrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntr_localType residueGraphPntr_local;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntr_biostrucType residueGraphPntr_biostruc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntr_standardType residueGraphPntr_standard;

    public ResidueGraphPntrType() {
    }

    public ResidueGraphPntrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntr_localType residueGraphPntr_local,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntr_biostrucType residueGraphPntr_biostruc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntr_standardType residueGraphPntr_standard) {
           this.residueGraphPntr_local = residueGraphPntr_local;
           this.residueGraphPntr_biostruc = residueGraphPntr_biostruc;
           this.residueGraphPntr_standard = residueGraphPntr_standard;
    }


    /**
     * Gets the residueGraphPntr_local value for this ResidueGraphPntrType.
     * 
     * @return residueGraphPntr_local
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntr_localType getResidueGraphPntr_local() {
        return residueGraphPntr_local;
    }


    /**
     * Sets the residueGraphPntr_local value for this ResidueGraphPntrType.
     * 
     * @param residueGraphPntr_local
     */
    public void setResidueGraphPntr_local(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntr_localType residueGraphPntr_local) {
        this.residueGraphPntr_local = residueGraphPntr_local;
    }


    /**
     * Gets the residueGraphPntr_biostruc value for this ResidueGraphPntrType.
     * 
     * @return residueGraphPntr_biostruc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntr_biostrucType getResidueGraphPntr_biostruc() {
        return residueGraphPntr_biostruc;
    }


    /**
     * Sets the residueGraphPntr_biostruc value for this ResidueGraphPntrType.
     * 
     * @param residueGraphPntr_biostruc
     */
    public void setResidueGraphPntr_biostruc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntr_biostrucType residueGraphPntr_biostruc) {
        this.residueGraphPntr_biostruc = residueGraphPntr_biostruc;
    }


    /**
     * Gets the residueGraphPntr_standard value for this ResidueGraphPntrType.
     * 
     * @return residueGraphPntr_standard
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntr_standardType getResidueGraphPntr_standard() {
        return residueGraphPntr_standard;
    }


    /**
     * Sets the residueGraphPntr_standard value for this ResidueGraphPntrType.
     * 
     * @param residueGraphPntr_standard
     */
    public void setResidueGraphPntr_standard(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntr_standardType residueGraphPntr_standard) {
        this.residueGraphPntr_standard = residueGraphPntr_standard;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResidueGraphPntrType)) return false;
        ResidueGraphPntrType other = (ResidueGraphPntrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.residueGraphPntr_local==null && other.getResidueGraphPntr_local()==null) || 
             (this.residueGraphPntr_local!=null &&
              this.residueGraphPntr_local.equals(other.getResidueGraphPntr_local()))) &&
            ((this.residueGraphPntr_biostruc==null && other.getResidueGraphPntr_biostruc()==null) || 
             (this.residueGraphPntr_biostruc!=null &&
              this.residueGraphPntr_biostruc.equals(other.getResidueGraphPntr_biostruc()))) &&
            ((this.residueGraphPntr_standard==null && other.getResidueGraphPntr_standard()==null) || 
             (this.residueGraphPntr_standard!=null &&
              this.residueGraphPntr_standard.equals(other.getResidueGraphPntr_standard())));
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
        if (getResidueGraphPntr_local() != null) {
            _hashCode += getResidueGraphPntr_local().hashCode();
        }
        if (getResidueGraphPntr_biostruc() != null) {
            _hashCode += getResidueGraphPntr_biostruc().hashCode();
        }
        if (getResidueGraphPntr_standard() != null) {
            _hashCode += getResidueGraphPntr_standard().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResidueGraphPntrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph-pntrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueGraphPntr_local");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph-pntr_local"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph-pntr_localType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueGraphPntr_biostruc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph-pntr_biostruc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph-pntr_biostrucType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueGraphPntr_standard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph-pntr_standard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph-pntr_standardType"));
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
