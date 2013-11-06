/**
 * TMesh_swapType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TMesh_swapType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_swap_EType[] TMesh_swap_E;

    public TMesh_swapType() {
    }

    public TMesh_swapType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_swap_EType[] TMesh_swap_E) {
           this.TMesh_swap_E = TMesh_swap_E;
    }


    /**
     * Gets the TMesh_swap_E value for this TMesh_swapType.
     * 
     * @return TMesh_swap_E
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_swap_EType[] getTMesh_swap_E() {
        return TMesh_swap_E;
    }


    /**
     * Sets the TMesh_swap_E value for this TMesh_swapType.
     * 
     * @param TMesh_swap_E
     */
    public void setTMesh_swap_E(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_swap_EType[] TMesh_swap_E) {
        this.TMesh_swap_E = TMesh_swap_E;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_swap_EType getTMesh_swap_E(int i) {
        return this.TMesh_swap_E[i];
    }

    public void setTMesh_swap_E(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.TMesh_swap_EType _value) {
        this.TMesh_swap_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TMesh_swapType)) return false;
        TMesh_swapType other = (TMesh_swapType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TMesh_swap_E==null && other.getTMesh_swap_E()==null) || 
             (this.TMesh_swap_E!=null &&
              java.util.Arrays.equals(this.TMesh_swap_E, other.getTMesh_swap_E())));
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
        if (getTMesh_swap_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTMesh_swap_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTMesh_swap_E(), i);
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
        new org.apache.axis.description.TypeDesc(TMesh_swapType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh_swapType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TMesh_swap_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh_swap_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "T-mesh_swap_EType"));
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
