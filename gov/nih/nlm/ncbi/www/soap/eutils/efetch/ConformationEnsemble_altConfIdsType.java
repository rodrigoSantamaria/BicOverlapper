/**
 * ConformationEnsemble_altConfIdsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ConformationEnsemble_altConfIdsType  implements java.io.Serializable {
    private java.lang.String[] alternateConformationId;

    public ConformationEnsemble_altConfIdsType() {
    }

    public ConformationEnsemble_altConfIdsType(
           java.lang.String[] alternateConformationId) {
           this.alternateConformationId = alternateConformationId;
    }


    /**
     * Gets the alternateConformationId value for this ConformationEnsemble_altConfIdsType.
     * 
     * @return alternateConformationId
     */
    public java.lang.String[] getAlternateConformationId() {
        return alternateConformationId;
    }


    /**
     * Sets the alternateConformationId value for this ConformationEnsemble_altConfIdsType.
     * 
     * @param alternateConformationId
     */
    public void setAlternateConformationId(java.lang.String[] alternateConformationId) {
        this.alternateConformationId = alternateConformationId;
    }

    public java.lang.String getAlternateConformationId(int i) {
        return this.alternateConformationId[i];
    }

    public void setAlternateConformationId(int i, java.lang.String _value) {
        this.alternateConformationId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConformationEnsemble_altConfIdsType)) return false;
        ConformationEnsemble_altConfIdsType other = (ConformationEnsemble_altConfIdsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alternateConformationId==null && other.getAlternateConformationId()==null) || 
             (this.alternateConformationId!=null &&
              java.util.Arrays.equals(this.alternateConformationId, other.getAlternateConformationId())));
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
        if (getAlternateConformationId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternateConformationId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternateConformationId(), i);
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
        new org.apache.axis.description.TypeDesc(ConformationEnsemble_altConfIdsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Conformation-ensemble_alt-conf-idsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateConformationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Alternate-conformation-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Alternate-conformation-id"));
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
