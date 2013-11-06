/**
 * ModelSpace_referenceFrameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModelSpace_referenceFrameType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReferenceFrameType referenceFrame;

    public ModelSpace_referenceFrameType() {
    }

    public ModelSpace_referenceFrameType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReferenceFrameType referenceFrame) {
           this.referenceFrame = referenceFrame;
    }


    /**
     * Gets the referenceFrame value for this ModelSpace_referenceFrameType.
     * 
     * @return referenceFrame
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReferenceFrameType getReferenceFrame() {
        return referenceFrame;
    }


    /**
     * Sets the referenceFrame value for this ModelSpace_referenceFrameType.
     * 
     * @param referenceFrame
     */
    public void setReferenceFrame(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReferenceFrameType referenceFrame) {
        this.referenceFrame = referenceFrame;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModelSpace_referenceFrameType)) return false;
        ModelSpace_referenceFrameType other = (ModelSpace_referenceFrameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenceFrame==null && other.getReferenceFrame()==null) || 
             (this.referenceFrame!=null &&
              this.referenceFrame.equals(other.getReferenceFrame())));
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
        if (getReferenceFrame() != null) {
            _hashCode += getReferenceFrame().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModelSpace_referenceFrameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space_reference-frameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Reference-frame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Reference-frameType"));
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
