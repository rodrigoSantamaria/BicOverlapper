/**
 * OtherSubjectListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OtherSubjectListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectType[] otherSubject;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectListTypeOwner owner;  // attribute

    public OtherSubjectListType() {
    }

    public OtherSubjectListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectType[] otherSubject,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectListTypeOwner owner) {
           this.otherSubject = otherSubject;
           this.owner = owner;
    }


    /**
     * Gets the otherSubject value for this OtherSubjectListType.
     * 
     * @return otherSubject
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectType[] getOtherSubject() {
        return otherSubject;
    }


    /**
     * Sets the otherSubject value for this OtherSubjectListType.
     * 
     * @param otherSubject
     */
    public void setOtherSubject(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectType[] otherSubject) {
        this.otherSubject = otherSubject;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectType getOtherSubject(int i) {
        return this.otherSubject[i];
    }

    public void setOtherSubject(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectType _value) {
        this.otherSubject[i] = _value;
    }


    /**
     * Gets the owner value for this OtherSubjectListType.
     * 
     * @return owner
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectListTypeOwner getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this OtherSubjectListType.
     * 
     * @param owner
     */
    public void setOwner(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectListTypeOwner owner) {
        this.owner = owner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherSubjectListType)) return false;
        OtherSubjectListType other = (OtherSubjectListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.otherSubject==null && other.getOtherSubject()==null) || 
             (this.otherSubject!=null &&
              java.util.Arrays.equals(this.otherSubject, other.getOtherSubject()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner())));
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
        if (getOtherSubject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherSubject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherSubject(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtherSubjectListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherSubjectListType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("owner");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Owner"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">OtherSubjectListType>Owner"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherSubjectType"));
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
