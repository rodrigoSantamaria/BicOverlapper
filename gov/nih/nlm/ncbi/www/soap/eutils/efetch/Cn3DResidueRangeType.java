/**
 * Cn3DResidueRangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DResidueRangeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRange_fromType cn3DResidueRange_from;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRange_toType cn3DResidueRange_to;

    public Cn3DResidueRangeType() {
    }

    public Cn3DResidueRangeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRange_fromType cn3DResidueRange_from,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRange_toType cn3DResidueRange_to) {
           this.cn3DResidueRange_from = cn3DResidueRange_from;
           this.cn3DResidueRange_to = cn3DResidueRange_to;
    }


    /**
     * Gets the cn3DResidueRange_from value for this Cn3DResidueRangeType.
     * 
     * @return cn3DResidueRange_from
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRange_fromType getCn3DResidueRange_from() {
        return cn3DResidueRange_from;
    }


    /**
     * Sets the cn3DResidueRange_from value for this Cn3DResidueRangeType.
     * 
     * @param cn3DResidueRange_from
     */
    public void setCn3DResidueRange_from(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRange_fromType cn3DResidueRange_from) {
        this.cn3DResidueRange_from = cn3DResidueRange_from;
    }


    /**
     * Gets the cn3DResidueRange_to value for this Cn3DResidueRangeType.
     * 
     * @return cn3DResidueRange_to
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRange_toType getCn3DResidueRange_to() {
        return cn3DResidueRange_to;
    }


    /**
     * Sets the cn3DResidueRange_to value for this Cn3DResidueRangeType.
     * 
     * @param cn3DResidueRange_to
     */
    public void setCn3DResidueRange_to(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRange_toType cn3DResidueRange_to) {
        this.cn3DResidueRange_to = cn3DResidueRange_to;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DResidueRangeType)) return false;
        Cn3DResidueRangeType other = (Cn3DResidueRangeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DResidueRange_from==null && other.getCn3DResidueRange_from()==null) || 
             (this.cn3DResidueRange_from!=null &&
              this.cn3DResidueRange_from.equals(other.getCn3DResidueRange_from()))) &&
            ((this.cn3DResidueRange_to==null && other.getCn3DResidueRange_to()==null) || 
             (this.cn3DResidueRange_to!=null &&
              this.cn3DResidueRange_to.equals(other.getCn3DResidueRange_to())));
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
        if (getCn3DResidueRange_from() != null) {
            _hashCode += getCn3DResidueRange_from().hashCode();
        }
        if (getCn3DResidueRange_to() != null) {
            _hashCode += getCn3DResidueRange_to().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DResidueRangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-residue-rangeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DResidueRange_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-residue-range_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-residue-range_fromType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DResidueRange_to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-residue-range_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-residue-range_toType"));
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
