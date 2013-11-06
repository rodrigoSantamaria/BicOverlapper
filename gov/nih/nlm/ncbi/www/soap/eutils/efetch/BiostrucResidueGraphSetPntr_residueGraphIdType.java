/**
 * BiostrucResidueGraphSetPntr_residueGraphIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucResidueGraphSetPntr_residueGraphIdType  implements java.io.Serializable {
    private java.lang.String residueGraphId;

    public BiostrucResidueGraphSetPntr_residueGraphIdType() {
    }

    public BiostrucResidueGraphSetPntr_residueGraphIdType(
           java.lang.String residueGraphId) {
           this.residueGraphId = residueGraphId;
    }


    /**
     * Gets the residueGraphId value for this BiostrucResidueGraphSetPntr_residueGraphIdType.
     * 
     * @return residueGraphId
     */
    public java.lang.String getResidueGraphId() {
        return residueGraphId;
    }


    /**
     * Sets the residueGraphId value for this BiostrucResidueGraphSetPntr_residueGraphIdType.
     * 
     * @param residueGraphId
     */
    public void setResidueGraphId(java.lang.String residueGraphId) {
        this.residueGraphId = residueGraphId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucResidueGraphSetPntr_residueGraphIdType)) return false;
        BiostrucResidueGraphSetPntr_residueGraphIdType other = (BiostrucResidueGraphSetPntr_residueGraphIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.residueGraphId==null && other.getResidueGraphId()==null) || 
             (this.residueGraphId!=null &&
              this.residueGraphId.equals(other.getResidueGraphId())));
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
        if (getResidueGraphId() != null) {
            _hashCode += getResidueGraphId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucResidueGraphSetPntr_residueGraphIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set-pntr_residue-graph-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueGraphId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph-id"));
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
