/**
 * ProjectItem_pmidType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ProjectItem_pmidType  implements java.io.Serializable {
    private java.lang.String[] pubMedId;

    public ProjectItem_pmidType() {
    }

    public ProjectItem_pmidType(
           java.lang.String[] pubMedId) {
           this.pubMedId = pubMedId;
    }


    /**
     * Gets the pubMedId value for this ProjectItem_pmidType.
     * 
     * @return pubMedId
     */
    public java.lang.String[] getPubMedId() {
        return pubMedId;
    }


    /**
     * Sets the pubMedId value for this ProjectItem_pmidType.
     * 
     * @param pubMedId
     */
    public void setPubMedId(java.lang.String[] pubMedId) {
        this.pubMedId = pubMedId;
    }

    public java.lang.String getPubMedId(int i) {
        return this.pubMedId[i];
    }

    public void setPubMedId(int i, java.lang.String _value) {
        this.pubMedId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectItem_pmidType)) return false;
        ProjectItem_pmidType other = (ProjectItem_pmidType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pubMedId==null && other.getPubMedId()==null) || 
             (this.pubMedId!=null &&
              java.util.Arrays.equals(this.pubMedId, other.getPubMedId())));
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
        if (getPubMedId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPubMedId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPubMedId(), i);
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
        new org.apache.axis.description.TypeDesc(ProjectItem_pmidType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_pmidType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubMedId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubMedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubMedId"));
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
