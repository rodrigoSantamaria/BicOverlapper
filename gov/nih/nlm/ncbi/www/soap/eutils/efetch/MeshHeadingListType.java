/**
 * MeshHeadingListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MeshHeadingListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingType[] meshHeading;

    public MeshHeadingListType() {
    }

    public MeshHeadingListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingType[] meshHeading) {
           this.meshHeading = meshHeading;
    }


    /**
     * Gets the meshHeading value for this MeshHeadingListType.
     * 
     * @return meshHeading
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingType[] getMeshHeading() {
        return meshHeading;
    }


    /**
     * Sets the meshHeading value for this MeshHeadingListType.
     * 
     * @param meshHeading
     */
    public void setMeshHeading(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingType[] meshHeading) {
        this.meshHeading = meshHeading;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingType getMeshHeading(int i) {
        return this.meshHeading[i];
    }

    public void setMeshHeading(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MeshHeadingType _value) {
        this.meshHeading[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MeshHeadingListType)) return false;
        MeshHeadingListType other = (MeshHeadingListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.meshHeading==null && other.getMeshHeading()==null) || 
             (this.meshHeading!=null &&
              java.util.Arrays.equals(this.meshHeading, other.getMeshHeading())));
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
        if (getMeshHeading() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMeshHeading());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMeshHeading(), i);
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
        new org.apache.axis.description.TypeDesc(MeshHeadingListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MeshHeadingListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meshHeading");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MeshHeading"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MeshHeadingType"));
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
