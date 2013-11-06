/**
 * AlignDefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AlignDefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignDef_alignTypeType alignDef_alignType;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignDef_idsType alignDef_ids;

    public AlignDefType() {
    }

    public AlignDefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignDef_alignTypeType alignDef_alignType,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignDef_idsType alignDef_ids) {
           this.alignDef_alignType = alignDef_alignType;
           this.alignDef_ids = alignDef_ids;
    }


    /**
     * Gets the alignDef_alignType value for this AlignDefType.
     * 
     * @return alignDef_alignType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignDef_alignTypeType getAlignDef_alignType() {
        return alignDef_alignType;
    }


    /**
     * Sets the alignDef_alignType value for this AlignDefType.
     * 
     * @param alignDef_alignType
     */
    public void setAlignDef_alignType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignDef_alignTypeType alignDef_alignType) {
        this.alignDef_alignType = alignDef_alignType;
    }


    /**
     * Gets the alignDef_ids value for this AlignDefType.
     * 
     * @return alignDef_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignDef_idsType getAlignDef_ids() {
        return alignDef_ids;
    }


    /**
     * Sets the alignDef_ids value for this AlignDefType.
     * 
     * @param alignDef_ids
     */
    public void setAlignDef_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignDef_idsType alignDef_ids) {
        this.alignDef_ids = alignDef_ids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlignDefType)) return false;
        AlignDefType other = (AlignDefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alignDef_alignType==null && other.getAlignDef_alignType()==null) || 
             (this.alignDef_alignType!=null &&
              this.alignDef_alignType.equals(other.getAlignDef_alignType()))) &&
            ((this.alignDef_ids==null && other.getAlignDef_ids()==null) || 
             (this.alignDef_ids!=null &&
              this.alignDef_ids.equals(other.getAlignDef_ids())));
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
        if (getAlignDef_alignType() != null) {
            _hashCode += getAlignDef_alignType().hashCode();
        }
        if (getAlignDef_ids() != null) {
            _hashCode += getAlignDef_ids().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlignDefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-defType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignDef_alignType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-def_align-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-def_align-typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignDef_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-def_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-def_idsType"));
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
