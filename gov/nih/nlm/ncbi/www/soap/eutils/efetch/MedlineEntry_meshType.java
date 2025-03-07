/**
 * MedlineEntry_meshType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineEntry_meshType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMeshType[] medlineMesh;

    public MedlineEntry_meshType() {
    }

    public MedlineEntry_meshType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMeshType[] medlineMesh) {
           this.medlineMesh = medlineMesh;
    }


    /**
     * Gets the medlineMesh value for this MedlineEntry_meshType.
     * 
     * @return medlineMesh
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMeshType[] getMedlineMesh() {
        return medlineMesh;
    }


    /**
     * Sets the medlineMesh value for this MedlineEntry_meshType.
     * 
     * @param medlineMesh
     */
    public void setMedlineMesh(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMeshType[] medlineMesh) {
        this.medlineMesh = medlineMesh;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMeshType getMedlineMesh(int i) {
        return this.medlineMesh[i];
    }

    public void setMedlineMesh(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMeshType _value) {
        this.medlineMesh[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineEntry_meshType)) return false;
        MedlineEntry_meshType other = (MedlineEntry_meshType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlineMesh==null && other.getMedlineMesh()==null) || 
             (this.medlineMesh!=null &&
              java.util.Arrays.equals(this.medlineMesh, other.getMedlineMesh())));
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
        if (getMedlineMesh() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMedlineMesh());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMedlineMesh(), i);
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
        new org.apache.axis.description.TypeDesc(MedlineEntry_meshType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_meshType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineMesh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-mesh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-meshType"));
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
