/**
 * GrantListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GrantListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantType[] grant;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantListTypeCompleteYN completeYN;  // attribute

    public GrantListType() {
    }

    public GrantListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantType[] grant,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantListTypeCompleteYN completeYN) {
           this.grant = grant;
           this.completeYN = completeYN;
    }


    /**
     * Gets the grant value for this GrantListType.
     * 
     * @return grant
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantType[] getGrant() {
        return grant;
    }


    /**
     * Sets the grant value for this GrantListType.
     * 
     * @param grant
     */
    public void setGrant(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantType[] grant) {
        this.grant = grant;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantType getGrant(int i) {
        return this.grant[i];
    }

    public void setGrant(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantType _value) {
        this.grant[i] = _value;
    }


    /**
     * Gets the completeYN value for this GrantListType.
     * 
     * @return completeYN
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantListTypeCompleteYN getCompleteYN() {
        return completeYN;
    }


    /**
     * Sets the completeYN value for this GrantListType.
     * 
     * @param completeYN
     */
    public void setCompleteYN(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GrantListTypeCompleteYN completeYN) {
        this.completeYN = completeYN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GrantListType)) return false;
        GrantListType other = (GrantListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grant==null && other.getGrant()==null) || 
             (this.grant!=null &&
              java.util.Arrays.equals(this.grant, other.getGrant()))) &&
            ((this.completeYN==null && other.getCompleteYN()==null) || 
             (this.completeYN!=null &&
              this.completeYN.equals(other.getCompleteYN())));
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
        if (getGrant() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrant());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrant(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompleteYN() != null) {
            _hashCode += getCompleteYN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GrantListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GrantListType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("completeYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CompleteYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">GrantListType>CompleteYN"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Grant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GrantType"));
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
