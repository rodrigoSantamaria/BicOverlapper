/**
 * CddScriptType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddScriptType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddScript_typeType cddScript_type;

    private java.lang.String cddScript_name;

    private java.lang.String cddScript_commands;

    public CddScriptType() {
    }

    public CddScriptType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddScript_typeType cddScript_type,
           java.lang.String cddScript_name,
           java.lang.String cddScript_commands) {
           this.cddScript_type = cddScript_type;
           this.cddScript_name = cddScript_name;
           this.cddScript_commands = cddScript_commands;
    }


    /**
     * Gets the cddScript_type value for this CddScriptType.
     * 
     * @return cddScript_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddScript_typeType getCddScript_type() {
        return cddScript_type;
    }


    /**
     * Sets the cddScript_type value for this CddScriptType.
     * 
     * @param cddScript_type
     */
    public void setCddScript_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddScript_typeType cddScript_type) {
        this.cddScript_type = cddScript_type;
    }


    /**
     * Gets the cddScript_name value for this CddScriptType.
     * 
     * @return cddScript_name
     */
    public java.lang.String getCddScript_name() {
        return cddScript_name;
    }


    /**
     * Sets the cddScript_name value for this CddScriptType.
     * 
     * @param cddScript_name
     */
    public void setCddScript_name(java.lang.String cddScript_name) {
        this.cddScript_name = cddScript_name;
    }


    /**
     * Gets the cddScript_commands value for this CddScriptType.
     * 
     * @return cddScript_commands
     */
    public java.lang.String getCddScript_commands() {
        return cddScript_commands;
    }


    /**
     * Sets the cddScript_commands value for this CddScriptType.
     * 
     * @param cddScript_commands
     */
    public void setCddScript_commands(java.lang.String cddScript_commands) {
        this.cddScript_commands = cddScript_commands;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddScriptType)) return false;
        CddScriptType other = (CddScriptType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddScript_type==null && other.getCddScript_type()==null) || 
             (this.cddScript_type!=null &&
              this.cddScript_type.equals(other.getCddScript_type()))) &&
            ((this.cddScript_name==null && other.getCddScript_name()==null) || 
             (this.cddScript_name!=null &&
              this.cddScript_name.equals(other.getCddScript_name()))) &&
            ((this.cddScript_commands==null && other.getCddScript_commands()==null) || 
             (this.cddScript_commands!=null &&
              this.cddScript_commands.equals(other.getCddScript_commands())));
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
        if (getCddScript_type() != null) {
            _hashCode += getCddScript_type().hashCode();
        }
        if (getCddScript_name() != null) {
            _hashCode += getCddScript_name().hashCode();
        }
        if (getCddScript_commands() != null) {
            _hashCode += getCddScript_commands().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddScriptType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-ScriptType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddScript_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Script_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Script_typeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddScript_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Script_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddScript_commands");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Script_commands"));
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
