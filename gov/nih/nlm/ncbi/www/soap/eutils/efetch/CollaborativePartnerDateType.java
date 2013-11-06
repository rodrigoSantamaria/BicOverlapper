/**
 * CollaborativePartnerDateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CollaborativePartnerDateType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CollaborativePartnerDateTypeOwner owner;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CollaborativePartnerDateTypeCollaborativeStatus collaborativeStatus;  // attribute

    public CollaborativePartnerDateType() {
    }

    // Simple Types must have a String constructor
    public CollaborativePartnerDateType(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this CollaborativePartnerDateType.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this CollaborativePartnerDateType.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the owner value for this CollaborativePartnerDateType.
     * 
     * @return owner
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CollaborativePartnerDateTypeOwner getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CollaborativePartnerDateType.
     * 
     * @param owner
     */
    public void setOwner(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CollaborativePartnerDateTypeOwner owner) {
        this.owner = owner;
    }


    /**
     * Gets the collaborativeStatus value for this CollaborativePartnerDateType.
     * 
     * @return collaborativeStatus
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CollaborativePartnerDateTypeCollaborativeStatus getCollaborativeStatus() {
        return collaborativeStatus;
    }


    /**
     * Sets the collaborativeStatus value for this CollaborativePartnerDateType.
     * 
     * @param collaborativeStatus
     */
    public void setCollaborativeStatus(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CollaborativePartnerDateTypeCollaborativeStatus collaborativeStatus) {
        this.collaborativeStatus = collaborativeStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CollaborativePartnerDateType)) return false;
        CollaborativePartnerDateType other = (CollaborativePartnerDateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.collaborativeStatus==null && other.getCollaborativeStatus()==null) || 
             (this.collaborativeStatus!=null &&
              this.collaborativeStatus.equals(other.getCollaborativeStatus())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getCollaborativeStatus() != null) {
            _hashCode += getCollaborativeStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CollaborativePartnerDateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CollaborativePartnerDateType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("owner");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Owner"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">CollaborativePartnerDateType>Owner"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("collaborativeStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CollaborativeStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">CollaborativePartnerDateType>CollaborativeStatus"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
