/**
 * FeatDefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class FeatDefType  implements java.io.Serializable {
    private java.lang.String featDef_typelabel;

    private java.lang.String featDef_menulabel;

    private java.lang.String featDef_featdefKey;

    private java.lang.String featDef_seqfeatKey;

    private java.lang.String featDef_entrygroup;

    private java.lang.String featDef_displaygroup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDef_molgroupType featDef_molgroup;

    public FeatDefType() {
    }

    public FeatDefType(
           java.lang.String featDef_typelabel,
           java.lang.String featDef_menulabel,
           java.lang.String featDef_featdefKey,
           java.lang.String featDef_seqfeatKey,
           java.lang.String featDef_entrygroup,
           java.lang.String featDef_displaygroup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDef_molgroupType featDef_molgroup) {
           this.featDef_typelabel = featDef_typelabel;
           this.featDef_menulabel = featDef_menulabel;
           this.featDef_featdefKey = featDef_featdefKey;
           this.featDef_seqfeatKey = featDef_seqfeatKey;
           this.featDef_entrygroup = featDef_entrygroup;
           this.featDef_displaygroup = featDef_displaygroup;
           this.featDef_molgroup = featDef_molgroup;
    }


    /**
     * Gets the featDef_typelabel value for this FeatDefType.
     * 
     * @return featDef_typelabel
     */
    public java.lang.String getFeatDef_typelabel() {
        return featDef_typelabel;
    }


    /**
     * Sets the featDef_typelabel value for this FeatDefType.
     * 
     * @param featDef_typelabel
     */
    public void setFeatDef_typelabel(java.lang.String featDef_typelabel) {
        this.featDef_typelabel = featDef_typelabel;
    }


    /**
     * Gets the featDef_menulabel value for this FeatDefType.
     * 
     * @return featDef_menulabel
     */
    public java.lang.String getFeatDef_menulabel() {
        return featDef_menulabel;
    }


    /**
     * Sets the featDef_menulabel value for this FeatDefType.
     * 
     * @param featDef_menulabel
     */
    public void setFeatDef_menulabel(java.lang.String featDef_menulabel) {
        this.featDef_menulabel = featDef_menulabel;
    }


    /**
     * Gets the featDef_featdefKey value for this FeatDefType.
     * 
     * @return featDef_featdefKey
     */
    public java.lang.String getFeatDef_featdefKey() {
        return featDef_featdefKey;
    }


    /**
     * Sets the featDef_featdefKey value for this FeatDefType.
     * 
     * @param featDef_featdefKey
     */
    public void setFeatDef_featdefKey(java.lang.String featDef_featdefKey) {
        this.featDef_featdefKey = featDef_featdefKey;
    }


    /**
     * Gets the featDef_seqfeatKey value for this FeatDefType.
     * 
     * @return featDef_seqfeatKey
     */
    public java.lang.String getFeatDef_seqfeatKey() {
        return featDef_seqfeatKey;
    }


    /**
     * Sets the featDef_seqfeatKey value for this FeatDefType.
     * 
     * @param featDef_seqfeatKey
     */
    public void setFeatDef_seqfeatKey(java.lang.String featDef_seqfeatKey) {
        this.featDef_seqfeatKey = featDef_seqfeatKey;
    }


    /**
     * Gets the featDef_entrygroup value for this FeatDefType.
     * 
     * @return featDef_entrygroup
     */
    public java.lang.String getFeatDef_entrygroup() {
        return featDef_entrygroup;
    }


    /**
     * Sets the featDef_entrygroup value for this FeatDefType.
     * 
     * @param featDef_entrygroup
     */
    public void setFeatDef_entrygroup(java.lang.String featDef_entrygroup) {
        this.featDef_entrygroup = featDef_entrygroup;
    }


    /**
     * Gets the featDef_displaygroup value for this FeatDefType.
     * 
     * @return featDef_displaygroup
     */
    public java.lang.String getFeatDef_displaygroup() {
        return featDef_displaygroup;
    }


    /**
     * Sets the featDef_displaygroup value for this FeatDefType.
     * 
     * @param featDef_displaygroup
     */
    public void setFeatDef_displaygroup(java.lang.String featDef_displaygroup) {
        this.featDef_displaygroup = featDef_displaygroup;
    }


    /**
     * Gets the featDef_molgroup value for this FeatDefType.
     * 
     * @return featDef_molgroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDef_molgroupType getFeatDef_molgroup() {
        return featDef_molgroup;
    }


    /**
     * Sets the featDef_molgroup value for this FeatDefType.
     * 
     * @param featDef_molgroup
     */
    public void setFeatDef_molgroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDef_molgroupType featDef_molgroup) {
        this.featDef_molgroup = featDef_molgroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatDefType)) return false;
        FeatDefType other = (FeatDefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featDef_typelabel==null && other.getFeatDef_typelabel()==null) || 
             (this.featDef_typelabel!=null &&
              this.featDef_typelabel.equals(other.getFeatDef_typelabel()))) &&
            ((this.featDef_menulabel==null && other.getFeatDef_menulabel()==null) || 
             (this.featDef_menulabel!=null &&
              this.featDef_menulabel.equals(other.getFeatDef_menulabel()))) &&
            ((this.featDef_featdefKey==null && other.getFeatDef_featdefKey()==null) || 
             (this.featDef_featdefKey!=null &&
              this.featDef_featdefKey.equals(other.getFeatDef_featdefKey()))) &&
            ((this.featDef_seqfeatKey==null && other.getFeatDef_seqfeatKey()==null) || 
             (this.featDef_seqfeatKey!=null &&
              this.featDef_seqfeatKey.equals(other.getFeatDef_seqfeatKey()))) &&
            ((this.featDef_entrygroup==null && other.getFeatDef_entrygroup()==null) || 
             (this.featDef_entrygroup!=null &&
              this.featDef_entrygroup.equals(other.getFeatDef_entrygroup()))) &&
            ((this.featDef_displaygroup==null && other.getFeatDef_displaygroup()==null) || 
             (this.featDef_displaygroup!=null &&
              this.featDef_displaygroup.equals(other.getFeatDef_displaygroup()))) &&
            ((this.featDef_molgroup==null && other.getFeatDef_molgroup()==null) || 
             (this.featDef_molgroup!=null &&
              this.featDef_molgroup.equals(other.getFeatDef_molgroup())));
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
        if (getFeatDef_typelabel() != null) {
            _hashCode += getFeatDef_typelabel().hashCode();
        }
        if (getFeatDef_menulabel() != null) {
            _hashCode += getFeatDef_menulabel().hashCode();
        }
        if (getFeatDef_featdefKey() != null) {
            _hashCode += getFeatDef_featdefKey().hashCode();
        }
        if (getFeatDef_seqfeatKey() != null) {
            _hashCode += getFeatDef_seqfeatKey().hashCode();
        }
        if (getFeatDef_entrygroup() != null) {
            _hashCode += getFeatDef_entrygroup().hashCode();
        }
        if (getFeatDef_displaygroup() != null) {
            _hashCode += getFeatDef_displaygroup().hashCode();
        }
        if (getFeatDef_molgroup() != null) {
            _hashCode += getFeatDef_molgroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatDefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDef_typelabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDef_typelabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDef_menulabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDef_menulabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDef_featdefKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDef_featdef-key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDef_seqfeatKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDef_seqfeat-key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDef_entrygroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDef_entrygroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDef_displaygroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDef_displaygroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDef_molgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDef_molgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDef_molgroupType"));
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
