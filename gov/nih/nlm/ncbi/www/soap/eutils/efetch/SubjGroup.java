/**
 * SubjGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SubjGroup  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Subject[] subject;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubjGroup[] subjGroup;

    private java.lang.String subjGroupType;  // attribute

    public SubjGroup() {
    }

    public SubjGroup(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Subject[] subject,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubjGroup[] subjGroup,
           java.lang.String subjGroupType) {
           this.subject = subject;
           this.subjGroup = subjGroup;
           this.subjGroupType = subjGroupType;
    }


    /**
     * Gets the subject value for this SubjGroup.
     * 
     * @return subject
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Subject[] getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this SubjGroup.
     * 
     * @param subject
     */
    public void setSubject(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Subject[] subject) {
        this.subject = subject;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Subject getSubject(int i) {
        return this.subject[i];
    }

    public void setSubject(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Subject _value) {
        this.subject[i] = _value;
    }


    /**
     * Gets the subjGroup value for this SubjGroup.
     * 
     * @return subjGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubjGroup[] getSubjGroup() {
        return subjGroup;
    }


    /**
     * Sets the subjGroup value for this SubjGroup.
     * 
     * @param subjGroup
     */
    public void setSubjGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubjGroup[] subjGroup) {
        this.subjGroup = subjGroup;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubjGroup getSubjGroup(int i) {
        return this.subjGroup[i];
    }

    public void setSubjGroup(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubjGroup _value) {
        this.subjGroup[i] = _value;
    }


    /**
     * Gets the subjGroupType value for this SubjGroup.
     * 
     * @return subjGroupType
     */
    public java.lang.String getSubjGroupType() {
        return subjGroupType;
    }


    /**
     * Sets the subjGroupType value for this SubjGroup.
     * 
     * @param subjGroupType
     */
    public void setSubjGroupType(java.lang.String subjGroupType) {
        this.subjGroupType = subjGroupType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubjGroup)) return false;
        SubjGroup other = (SubjGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              java.util.Arrays.equals(this.subject, other.getSubject()))) &&
            ((this.subjGroup==null && other.getSubjGroup()==null) || 
             (this.subjGroup!=null &&
              java.util.Arrays.equals(this.subjGroup, other.getSubjGroup()))) &&
            ((this.subjGroupType==null && other.getSubjGroupType()==null) || 
             (this.subjGroupType!=null &&
              this.subjGroupType.equals(other.getSubjGroupType())));
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
        if (getSubject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubject(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubjGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubjGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubjGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubjGroupType() != null) {
            _hashCode += getSubjGroupType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubjGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">subj-group"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("subjGroupType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "subj-group-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "subject"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "subj-group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "subj-group"));
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
