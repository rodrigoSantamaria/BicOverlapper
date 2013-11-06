/**
 * ModifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModifierType  implements java.io.Serializable {
    private java.lang.String modId;

    private java.lang.String modType;

    private java.lang.String modName;

    private java.lang.String modGBhidden;

    private java.lang.String RModId;

    private java.lang.String RTaxId;

    public ModifierType() {
    }

    public ModifierType(
           java.lang.String modId,
           java.lang.String modType,
           java.lang.String modName,
           java.lang.String modGBhidden,
           java.lang.String RModId,
           java.lang.String RTaxId) {
           this.modId = modId;
           this.modType = modType;
           this.modName = modName;
           this.modGBhidden = modGBhidden;
           this.RModId = RModId;
           this.RTaxId = RTaxId;
    }


    /**
     * Gets the modId value for this ModifierType.
     * 
     * @return modId
     */
    public java.lang.String getModId() {
        return modId;
    }


    /**
     * Sets the modId value for this ModifierType.
     * 
     * @param modId
     */
    public void setModId(java.lang.String modId) {
        this.modId = modId;
    }


    /**
     * Gets the modType value for this ModifierType.
     * 
     * @return modType
     */
    public java.lang.String getModType() {
        return modType;
    }


    /**
     * Sets the modType value for this ModifierType.
     * 
     * @param modType
     */
    public void setModType(java.lang.String modType) {
        this.modType = modType;
    }


    /**
     * Gets the modName value for this ModifierType.
     * 
     * @return modName
     */
    public java.lang.String getModName() {
        return modName;
    }


    /**
     * Sets the modName value for this ModifierType.
     * 
     * @param modName
     */
    public void setModName(java.lang.String modName) {
        this.modName = modName;
    }


    /**
     * Gets the modGBhidden value for this ModifierType.
     * 
     * @return modGBhidden
     */
    public java.lang.String getModGBhidden() {
        return modGBhidden;
    }


    /**
     * Sets the modGBhidden value for this ModifierType.
     * 
     * @param modGBhidden
     */
    public void setModGBhidden(java.lang.String modGBhidden) {
        this.modGBhidden = modGBhidden;
    }


    /**
     * Gets the RModId value for this ModifierType.
     * 
     * @return RModId
     */
    public java.lang.String getRModId() {
        return RModId;
    }


    /**
     * Sets the RModId value for this ModifierType.
     * 
     * @param RModId
     */
    public void setRModId(java.lang.String RModId) {
        this.RModId = RModId;
    }


    /**
     * Gets the RTaxId value for this ModifierType.
     * 
     * @return RTaxId
     */
    public java.lang.String getRTaxId() {
        return RTaxId;
    }


    /**
     * Sets the RTaxId value for this ModifierType.
     * 
     * @param RTaxId
     */
    public void setRTaxId(java.lang.String RTaxId) {
        this.RTaxId = RTaxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifierType)) return false;
        ModifierType other = (ModifierType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modId==null && other.getModId()==null) || 
             (this.modId!=null &&
              this.modId.equals(other.getModId()))) &&
            ((this.modType==null && other.getModType()==null) || 
             (this.modType!=null &&
              this.modType.equals(other.getModType()))) &&
            ((this.modName==null && other.getModName()==null) || 
             (this.modName!=null &&
              this.modName.equals(other.getModName()))) &&
            ((this.modGBhidden==null && other.getModGBhidden()==null) || 
             (this.modGBhidden!=null &&
              this.modGBhidden.equals(other.getModGBhidden()))) &&
            ((this.RModId==null && other.getRModId()==null) || 
             (this.RModId!=null &&
              this.RModId.equals(other.getRModId()))) &&
            ((this.RTaxId==null && other.getRTaxId()==null) || 
             (this.RTaxId!=null &&
              this.RTaxId.equals(other.getRTaxId())));
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
        if (getModId() != null) {
            _hashCode += getModId().hashCode();
        }
        if (getModType() != null) {
            _hashCode += getModType().hashCode();
        }
        if (getModName() != null) {
            _hashCode += getModName().hashCode();
        }
        if (getModGBhidden() != null) {
            _hashCode += getModGBhidden().hashCode();
        }
        if (getRModId() != null) {
            _hashCode += getRModId().hashCode();
        }
        if (getRTaxId() != null) {
            _hashCode += getRTaxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifierType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ModifierType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ModId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ModType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ModName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modGBhidden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ModGBhidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RModId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RModId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RTaxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RTaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
