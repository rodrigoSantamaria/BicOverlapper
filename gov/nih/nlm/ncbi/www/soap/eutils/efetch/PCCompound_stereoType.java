/**
 * PCCompound_stereoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCCompound_stereoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoCenterType[] PCStereoCenter;

    public PCCompound_stereoType() {
    }

    public PCCompound_stereoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoCenterType[] PCStereoCenter) {
           this.PCStereoCenter = PCStereoCenter;
    }


    /**
     * Gets the PCStereoCenter value for this PCCompound_stereoType.
     * 
     * @return PCStereoCenter
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoCenterType[] getPCStereoCenter() {
        return PCStereoCenter;
    }


    /**
     * Sets the PCStereoCenter value for this PCCompound_stereoType.
     * 
     * @param PCStereoCenter
     */
    public void setPCStereoCenter(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoCenterType[] PCStereoCenter) {
        this.PCStereoCenter = PCStereoCenter;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoCenterType getPCStereoCenter(int i) {
        return this.PCStereoCenter[i];
    }

    public void setPCStereoCenter(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCStereoCenterType _value) {
        this.PCStereoCenter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCCompound_stereoType)) return false;
        PCCompound_stereoType other = (PCCompound_stereoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCStereoCenter==null && other.getPCStereoCenter()==null) || 
             (this.PCStereoCenter!=null &&
              java.util.Arrays.equals(this.PCStereoCenter, other.getPCStereoCenter())));
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
        if (getPCStereoCenter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCStereoCenter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCStereoCenter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCCompound_stereoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Compound_stereoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCStereoCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoCenterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
