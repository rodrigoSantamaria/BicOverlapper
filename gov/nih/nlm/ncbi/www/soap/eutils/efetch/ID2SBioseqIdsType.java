/**
 * ID2SBioseqIdsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SBioseqIdsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_EType[] ID2SBioseqIds_E;

    public ID2SBioseqIdsType() {
    }

    public ID2SBioseqIdsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_EType[] ID2SBioseqIds_E) {
           this.ID2SBioseqIds_E = ID2SBioseqIds_E;
    }


    /**
     * Gets the ID2SBioseqIds_E value for this ID2SBioseqIdsType.
     * 
     * @return ID2SBioseqIds_E
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_EType[] getID2SBioseqIds_E() {
        return ID2SBioseqIds_E;
    }


    /**
     * Sets the ID2SBioseqIds_E value for this ID2SBioseqIdsType.
     * 
     * @param ID2SBioseqIds_E
     */
    public void setID2SBioseqIds_E(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_EType[] ID2SBioseqIds_E) {
        this.ID2SBioseqIds_E = ID2SBioseqIds_E;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_EType getID2SBioseqIds_E(int i) {
        return this.ID2SBioseqIds_E[i];
    }

    public void setID2SBioseqIds_E(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_EType _value) {
        this.ID2SBioseqIds_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SBioseqIdsType)) return false;
        ID2SBioseqIdsType other = (ID2SBioseqIdsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SBioseqIds_E==null && other.getID2SBioseqIds_E()==null) || 
             (this.ID2SBioseqIds_E!=null &&
              java.util.Arrays.equals(this.ID2SBioseqIds_E, other.getID2SBioseqIds_E())));
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
        if (getID2SBioseqIds_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2SBioseqIds_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2SBioseqIds_E(), i);
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
        new org.apache.axis.description.TypeDesc(ID2SBioseqIdsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-IdsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqIds_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-Ids_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-Ids_EType"));
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
