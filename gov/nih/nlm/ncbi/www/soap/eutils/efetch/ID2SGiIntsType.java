/**
 * ID2SGiIntsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SGiIntsType  implements java.io.Serializable {
    private java.lang.String ID2SGiInts_gi;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SGiInts_intsType ID2SGiInts_ints;

    public ID2SGiIntsType() {
    }

    public ID2SGiIntsType(
           java.lang.String ID2SGiInts_gi,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SGiInts_intsType ID2SGiInts_ints) {
           this.ID2SGiInts_gi = ID2SGiInts_gi;
           this.ID2SGiInts_ints = ID2SGiInts_ints;
    }


    /**
     * Gets the ID2SGiInts_gi value for this ID2SGiIntsType.
     * 
     * @return ID2SGiInts_gi
     */
    public java.lang.String getID2SGiInts_gi() {
        return ID2SGiInts_gi;
    }


    /**
     * Sets the ID2SGiInts_gi value for this ID2SGiIntsType.
     * 
     * @param ID2SGiInts_gi
     */
    public void setID2SGiInts_gi(java.lang.String ID2SGiInts_gi) {
        this.ID2SGiInts_gi = ID2SGiInts_gi;
    }


    /**
     * Gets the ID2SGiInts_ints value for this ID2SGiIntsType.
     * 
     * @return ID2SGiInts_ints
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SGiInts_intsType getID2SGiInts_ints() {
        return ID2SGiInts_ints;
    }


    /**
     * Sets the ID2SGiInts_ints value for this ID2SGiIntsType.
     * 
     * @param ID2SGiInts_ints
     */
    public void setID2SGiInts_ints(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SGiInts_intsType ID2SGiInts_ints) {
        this.ID2SGiInts_ints = ID2SGiInts_ints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SGiIntsType)) return false;
        ID2SGiIntsType other = (ID2SGiIntsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SGiInts_gi==null && other.getID2SGiInts_gi()==null) || 
             (this.ID2SGiInts_gi!=null &&
              this.ID2SGiInts_gi.equals(other.getID2SGiInts_gi()))) &&
            ((this.ID2SGiInts_ints==null && other.getID2SGiInts_ints()==null) || 
             (this.ID2SGiInts_ints!=null &&
              this.ID2SGiInts_ints.equals(other.getID2SGiInts_ints())));
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
        if (getID2SGiInts_gi() != null) {
            _hashCode += getID2SGiInts_gi().hashCode();
        }
        if (getID2SGiInts_ints() != null) {
            _hashCode += getID2SGiInts_ints().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SGiIntsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-IntsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SGiInts_gi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-Ints_gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SGiInts_ints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-Ints_ints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Gi-Ints_intsType"));
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
