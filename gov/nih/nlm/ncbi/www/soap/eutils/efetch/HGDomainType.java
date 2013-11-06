/**
 * HGDomainType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGDomainType  implements java.io.Serializable {
    private java.lang.String HGDomain_begin;

    private java.lang.String HGDomain_end;

    private java.lang.String HGDomain_pssmId;

    private java.lang.String HGDomain_cddId;

    private java.lang.String HGDomain_cddName;

    public HGDomainType() {
    }

    public HGDomainType(
           java.lang.String HGDomain_begin,
           java.lang.String HGDomain_end,
           java.lang.String HGDomain_pssmId,
           java.lang.String HGDomain_cddId,
           java.lang.String HGDomain_cddName) {
           this.HGDomain_begin = HGDomain_begin;
           this.HGDomain_end = HGDomain_end;
           this.HGDomain_pssmId = HGDomain_pssmId;
           this.HGDomain_cddId = HGDomain_cddId;
           this.HGDomain_cddName = HGDomain_cddName;
    }


    /**
     * Gets the HGDomain_begin value for this HGDomainType.
     * 
     * @return HGDomain_begin
     */
    public java.lang.String getHGDomain_begin() {
        return HGDomain_begin;
    }


    /**
     * Sets the HGDomain_begin value for this HGDomainType.
     * 
     * @param HGDomain_begin
     */
    public void setHGDomain_begin(java.lang.String HGDomain_begin) {
        this.HGDomain_begin = HGDomain_begin;
    }


    /**
     * Gets the HGDomain_end value for this HGDomainType.
     * 
     * @return HGDomain_end
     */
    public java.lang.String getHGDomain_end() {
        return HGDomain_end;
    }


    /**
     * Sets the HGDomain_end value for this HGDomainType.
     * 
     * @param HGDomain_end
     */
    public void setHGDomain_end(java.lang.String HGDomain_end) {
        this.HGDomain_end = HGDomain_end;
    }


    /**
     * Gets the HGDomain_pssmId value for this HGDomainType.
     * 
     * @return HGDomain_pssmId
     */
    public java.lang.String getHGDomain_pssmId() {
        return HGDomain_pssmId;
    }


    /**
     * Sets the HGDomain_pssmId value for this HGDomainType.
     * 
     * @param HGDomain_pssmId
     */
    public void setHGDomain_pssmId(java.lang.String HGDomain_pssmId) {
        this.HGDomain_pssmId = HGDomain_pssmId;
    }


    /**
     * Gets the HGDomain_cddId value for this HGDomainType.
     * 
     * @return HGDomain_cddId
     */
    public java.lang.String getHGDomain_cddId() {
        return HGDomain_cddId;
    }


    /**
     * Sets the HGDomain_cddId value for this HGDomainType.
     * 
     * @param HGDomain_cddId
     */
    public void setHGDomain_cddId(java.lang.String HGDomain_cddId) {
        this.HGDomain_cddId = HGDomain_cddId;
    }


    /**
     * Gets the HGDomain_cddName value for this HGDomainType.
     * 
     * @return HGDomain_cddName
     */
    public java.lang.String getHGDomain_cddName() {
        return HGDomain_cddName;
    }


    /**
     * Sets the HGDomain_cddName value for this HGDomainType.
     * 
     * @param HGDomain_cddName
     */
    public void setHGDomain_cddName(java.lang.String HGDomain_cddName) {
        this.HGDomain_cddName = HGDomain_cddName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGDomainType)) return false;
        HGDomainType other = (HGDomainType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGDomain_begin==null && other.getHGDomain_begin()==null) || 
             (this.HGDomain_begin!=null &&
              this.HGDomain_begin.equals(other.getHGDomain_begin()))) &&
            ((this.HGDomain_end==null && other.getHGDomain_end()==null) || 
             (this.HGDomain_end!=null &&
              this.HGDomain_end.equals(other.getHGDomain_end()))) &&
            ((this.HGDomain_pssmId==null && other.getHGDomain_pssmId()==null) || 
             (this.HGDomain_pssmId!=null &&
              this.HGDomain_pssmId.equals(other.getHGDomain_pssmId()))) &&
            ((this.HGDomain_cddId==null && other.getHGDomain_cddId()==null) || 
             (this.HGDomain_cddId!=null &&
              this.HGDomain_cddId.equals(other.getHGDomain_cddId()))) &&
            ((this.HGDomain_cddName==null && other.getHGDomain_cddName()==null) || 
             (this.HGDomain_cddName!=null &&
              this.HGDomain_cddName.equals(other.getHGDomain_cddName())));
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
        if (getHGDomain_begin() != null) {
            _hashCode += getHGDomain_begin().hashCode();
        }
        if (getHGDomain_end() != null) {
            _hashCode += getHGDomain_end().hashCode();
        }
        if (getHGDomain_pssmId() != null) {
            _hashCode += getHGDomain_pssmId().hashCode();
        }
        if (getHGDomain_cddId() != null) {
            _hashCode += getHGDomain_cddId().hashCode();
        }
        if (getHGDomain_cddName() != null) {
            _hashCode += getHGDomain_cddName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HGDomainType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-DomainType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGDomain_begin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Domain_begin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGDomain_end");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Domain_end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGDomain_pssmId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Domain_pssm-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGDomain_cddId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Domain_cdd-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGDomain_cddName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Domain_cdd-name"));
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
