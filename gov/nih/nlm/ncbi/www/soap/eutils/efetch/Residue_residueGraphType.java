/**
 * Residue_residueGraphType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Residue_residueGraphType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntrType residueGraphPntr;

    public Residue_residueGraphType() {
    }

    public Residue_residueGraphType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntrType residueGraphPntr) {
           this.residueGraphPntr = residueGraphPntr;
    }


    /**
     * Gets the residueGraphPntr value for this Residue_residueGraphType.
     * 
     * @return residueGraphPntr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntrType getResidueGraphPntr() {
        return residueGraphPntr;
    }


    /**
     * Sets the residueGraphPntr value for this Residue_residueGraphType.
     * 
     * @param residueGraphPntr
     */
    public void setResidueGraphPntr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphPntrType residueGraphPntr) {
        this.residueGraphPntr = residueGraphPntr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Residue_residueGraphType)) return false;
        Residue_residueGraphType other = (Residue_residueGraphType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.residueGraphPntr==null && other.getResidueGraphPntr()==null) || 
             (this.residueGraphPntr!=null &&
              this.residueGraphPntr.equals(other.getResidueGraphPntr())));
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
        if (getResidueGraphPntr() != null) {
            _hashCode += getResidueGraphPntr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Residue_residueGraphType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue_residue-graphType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueGraphPntr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph-pntr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph-pntrType"));
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
