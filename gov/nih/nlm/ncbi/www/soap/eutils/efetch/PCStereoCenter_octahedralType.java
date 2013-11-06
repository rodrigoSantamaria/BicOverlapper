/**
 * PCStereoCenter_octahedralType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCStereoCenter_octahedralType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoOctahedralType PCStereoOctahedral;

    public PCStereoCenter_octahedralType() {
    }

    public PCStereoCenter_octahedralType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoOctahedralType PCStereoOctahedral) {
           this.PCStereoOctahedral = PCStereoOctahedral;
    }


    /**
     * Gets the PCStereoOctahedral value for this PCStereoCenter_octahedralType.
     * 
     * @return PCStereoOctahedral
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoOctahedralType getPCStereoOctahedral() {
        return PCStereoOctahedral;
    }


    /**
     * Sets the PCStereoOctahedral value for this PCStereoCenter_octahedralType.
     * 
     * @param PCStereoOctahedral
     */
    public void setPCStereoOctahedral(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoOctahedralType PCStereoOctahedral) {
        this.PCStereoOctahedral = PCStereoOctahedral;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCStereoCenter_octahedralType)) return false;
        PCStereoCenter_octahedralType other = (PCStereoCenter_octahedralType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCStereoOctahedral==null && other.getPCStereoOctahedral()==null) || 
             (this.PCStereoOctahedral!=null &&
              this.PCStereoOctahedral.equals(other.getPCStereoOctahedral())));
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
        if (getPCStereoOctahedral() != null) {
            _hashCode += getPCStereoOctahedral().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCStereoCenter_octahedralType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoCenter_octahedralType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCStereoOctahedral");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoOctahedral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoOctahedralType"));
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
