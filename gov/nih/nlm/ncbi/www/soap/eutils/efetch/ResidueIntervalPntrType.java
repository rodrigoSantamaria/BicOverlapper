/**
 * ResidueIntervalPntrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResidueIntervalPntrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntr_moleculeIdType residueIntervalPntr_moleculeId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntr_fromType residueIntervalPntr_from;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntr_toType residueIntervalPntr_to;

    public ResidueIntervalPntrType() {
    }

    public ResidueIntervalPntrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntr_moleculeIdType residueIntervalPntr_moleculeId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntr_fromType residueIntervalPntr_from,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntr_toType residueIntervalPntr_to) {
           this.residueIntervalPntr_moleculeId = residueIntervalPntr_moleculeId;
           this.residueIntervalPntr_from = residueIntervalPntr_from;
           this.residueIntervalPntr_to = residueIntervalPntr_to;
    }


    /**
     * Gets the residueIntervalPntr_moleculeId value for this ResidueIntervalPntrType.
     * 
     * @return residueIntervalPntr_moleculeId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntr_moleculeIdType getResidueIntervalPntr_moleculeId() {
        return residueIntervalPntr_moleculeId;
    }


    /**
     * Sets the residueIntervalPntr_moleculeId value for this ResidueIntervalPntrType.
     * 
     * @param residueIntervalPntr_moleculeId
     */
    public void setResidueIntervalPntr_moleculeId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntr_moleculeIdType residueIntervalPntr_moleculeId) {
        this.residueIntervalPntr_moleculeId = residueIntervalPntr_moleculeId;
    }


    /**
     * Gets the residueIntervalPntr_from value for this ResidueIntervalPntrType.
     * 
     * @return residueIntervalPntr_from
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntr_fromType getResidueIntervalPntr_from() {
        return residueIntervalPntr_from;
    }


    /**
     * Sets the residueIntervalPntr_from value for this ResidueIntervalPntrType.
     * 
     * @param residueIntervalPntr_from
     */
    public void setResidueIntervalPntr_from(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntr_fromType residueIntervalPntr_from) {
        this.residueIntervalPntr_from = residueIntervalPntr_from;
    }


    /**
     * Gets the residueIntervalPntr_to value for this ResidueIntervalPntrType.
     * 
     * @return residueIntervalPntr_to
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntr_toType getResidueIntervalPntr_to() {
        return residueIntervalPntr_to;
    }


    /**
     * Sets the residueIntervalPntr_to value for this ResidueIntervalPntrType.
     * 
     * @param residueIntervalPntr_to
     */
    public void setResidueIntervalPntr_to(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntr_toType residueIntervalPntr_to) {
        this.residueIntervalPntr_to = residueIntervalPntr_to;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResidueIntervalPntrType)) return false;
        ResidueIntervalPntrType other = (ResidueIntervalPntrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.residueIntervalPntr_moleculeId==null && other.getResidueIntervalPntr_moleculeId()==null) || 
             (this.residueIntervalPntr_moleculeId!=null &&
              this.residueIntervalPntr_moleculeId.equals(other.getResidueIntervalPntr_moleculeId()))) &&
            ((this.residueIntervalPntr_from==null && other.getResidueIntervalPntr_from()==null) || 
             (this.residueIntervalPntr_from!=null &&
              this.residueIntervalPntr_from.equals(other.getResidueIntervalPntr_from()))) &&
            ((this.residueIntervalPntr_to==null && other.getResidueIntervalPntr_to()==null) || 
             (this.residueIntervalPntr_to!=null &&
              this.residueIntervalPntr_to.equals(other.getResidueIntervalPntr_to())));
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
        if (getResidueIntervalPntr_moleculeId() != null) {
            _hashCode += getResidueIntervalPntr_moleculeId().hashCode();
        }
        if (getResidueIntervalPntr_from() != null) {
            _hashCode += getResidueIntervalPntr_from().hashCode();
        }
        if (getResidueIntervalPntr_to() != null) {
            _hashCode += getResidueIntervalPntr_to().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResidueIntervalPntrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-interval-pntrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueIntervalPntr_moleculeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-interval-pntr_molecule-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-interval-pntr_molecule-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueIntervalPntr_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-interval-pntr_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-interval-pntr_fromType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueIntervalPntr_to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-interval-pntr_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-interval-pntr_toType"));
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
