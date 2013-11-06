/**
 * PCStereoCenter_bipyramidType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCStereoCenter_bipyramidType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoTrigonalBiPyramidType PCStereoTrigonalBiPyramid;

    public PCStereoCenter_bipyramidType() {
    }

    public PCStereoCenter_bipyramidType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoTrigonalBiPyramidType PCStereoTrigonalBiPyramid) {
           this.PCStereoTrigonalBiPyramid = PCStereoTrigonalBiPyramid;
    }


    /**
     * Gets the PCStereoTrigonalBiPyramid value for this PCStereoCenter_bipyramidType.
     * 
     * @return PCStereoTrigonalBiPyramid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoTrigonalBiPyramidType getPCStereoTrigonalBiPyramid() {
        return PCStereoTrigonalBiPyramid;
    }


    /**
     * Sets the PCStereoTrigonalBiPyramid value for this PCStereoCenter_bipyramidType.
     * 
     * @param PCStereoTrigonalBiPyramid
     */
    public void setPCStereoTrigonalBiPyramid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoTrigonalBiPyramidType PCStereoTrigonalBiPyramid) {
        this.PCStereoTrigonalBiPyramid = PCStereoTrigonalBiPyramid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCStereoCenter_bipyramidType)) return false;
        PCStereoCenter_bipyramidType other = (PCStereoCenter_bipyramidType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCStereoTrigonalBiPyramid==null && other.getPCStereoTrigonalBiPyramid()==null) || 
             (this.PCStereoTrigonalBiPyramid!=null &&
              this.PCStereoTrigonalBiPyramid.equals(other.getPCStereoTrigonalBiPyramid())));
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
        if (getPCStereoTrigonalBiPyramid() != null) {
            _hashCode += getPCStereoTrigonalBiPyramid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCStereoCenter_bipyramidType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoCenter_bipyramidType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCStereoTrigonalBiPyramid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoTrigonalBiPyramid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoTrigonalBiPyramidType"));
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
