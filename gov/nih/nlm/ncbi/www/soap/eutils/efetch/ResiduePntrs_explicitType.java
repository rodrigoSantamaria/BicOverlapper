/**
 * ResiduePntrs_explicitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResiduePntrs_explicitType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueExplicitPntrsType residueExplicitPntrs;

    public ResiduePntrs_explicitType() {
    }

    public ResiduePntrs_explicitType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueExplicitPntrsType residueExplicitPntrs) {
           this.residueExplicitPntrs = residueExplicitPntrs;
    }


    /**
     * Gets the residueExplicitPntrs value for this ResiduePntrs_explicitType.
     * 
     * @return residueExplicitPntrs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueExplicitPntrsType getResidueExplicitPntrs() {
        return residueExplicitPntrs;
    }


    /**
     * Sets the residueExplicitPntrs value for this ResiduePntrs_explicitType.
     * 
     * @param residueExplicitPntrs
     */
    public void setResidueExplicitPntrs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueExplicitPntrsType residueExplicitPntrs) {
        this.residueExplicitPntrs = residueExplicitPntrs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResiduePntrs_explicitType)) return false;
        ResiduePntrs_explicitType other = (ResiduePntrs_explicitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.residueExplicitPntrs==null && other.getResidueExplicitPntrs()==null) || 
             (this.residueExplicitPntrs!=null &&
              this.residueExplicitPntrs.equals(other.getResidueExplicitPntrs())));
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
        if (getResidueExplicitPntrs() != null) {
            _hashCode += getResidueExplicitPntrs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResiduePntrs_explicitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-pntrs_explicitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueExplicitPntrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-explicit-pntrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-explicit-pntrsType"));
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
