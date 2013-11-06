/**
 * BundleSeqsAligns_userAnnotationsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BundleSeqsAligns_userAnnotationsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotationsType cn3DUserAnnotations;

    public BundleSeqsAligns_userAnnotationsType() {
    }

    public BundleSeqsAligns_userAnnotationsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotationsType cn3DUserAnnotations) {
           this.cn3DUserAnnotations = cn3DUserAnnotations;
    }


    /**
     * Gets the cn3DUserAnnotations value for this BundleSeqsAligns_userAnnotationsType.
     * 
     * @return cn3DUserAnnotations
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotationsType getCn3DUserAnnotations() {
        return cn3DUserAnnotations;
    }


    /**
     * Sets the cn3DUserAnnotations value for this BundleSeqsAligns_userAnnotationsType.
     * 
     * @param cn3DUserAnnotations
     */
    public void setCn3DUserAnnotations(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotationsType cn3DUserAnnotations) {
        this.cn3DUserAnnotations = cn3DUserAnnotations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BundleSeqsAligns_userAnnotationsType)) return false;
        BundleSeqsAligns_userAnnotationsType other = (BundleSeqsAligns_userAnnotationsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DUserAnnotations==null && other.getCn3DUserAnnotations()==null) || 
             (this.cn3DUserAnnotations!=null &&
              this.cn3DUserAnnotations.equals(other.getCn3DUserAnnotations())));
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
        if (getCn3DUserAnnotations() != null) {
            _hashCode += getCn3DUserAnnotations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BundleSeqsAligns_userAnnotationsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bundle-seqs-aligns_user-annotationsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DUserAnnotations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotationsType"));
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
