/**
 * PCStereoCenter_pentagonalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCStereoCenter_pentagonalType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoPentagonalBiPyramidType PCStereoPentagonalBiPyramid;

    public PCStereoCenter_pentagonalType() {
    }

    public PCStereoCenter_pentagonalType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoPentagonalBiPyramidType PCStereoPentagonalBiPyramid) {
           this.PCStereoPentagonalBiPyramid = PCStereoPentagonalBiPyramid;
    }


    /**
     * Gets the PCStereoPentagonalBiPyramid value for this PCStereoCenter_pentagonalType.
     * 
     * @return PCStereoPentagonalBiPyramid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoPentagonalBiPyramidType getPCStereoPentagonalBiPyramid() {
        return PCStereoPentagonalBiPyramid;
    }


    /**
     * Sets the PCStereoPentagonalBiPyramid value for this PCStereoCenter_pentagonalType.
     * 
     * @param PCStereoPentagonalBiPyramid
     */
    public void setPCStereoPentagonalBiPyramid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoPentagonalBiPyramidType PCStereoPentagonalBiPyramid) {
        this.PCStereoPentagonalBiPyramid = PCStereoPentagonalBiPyramid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCStereoCenter_pentagonalType)) return false;
        PCStereoCenter_pentagonalType other = (PCStereoCenter_pentagonalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCStereoPentagonalBiPyramid==null && other.getPCStereoPentagonalBiPyramid()==null) || 
             (this.PCStereoPentagonalBiPyramid!=null &&
              this.PCStereoPentagonalBiPyramid.equals(other.getPCStereoPentagonalBiPyramid())));
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
        if (getPCStereoPentagonalBiPyramid() != null) {
            _hashCode += getPCStereoPentagonalBiPyramid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCStereoCenter_pentagonalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoCenter_pentagonalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCStereoPentagonalBiPyramid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoPentagonalBiPyramid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoPentagonalBiPyramidType"));
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
