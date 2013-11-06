/**
 * BioSourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BioSourceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_genomeType bioSource_genome;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_originType bioSource_origin;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_orgType bioSource_org;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_subtypeType bioSource_subtype;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_isFocus bioSource_isFocus;

    public BioSourceType() {
    }

    public BioSourceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_genomeType bioSource_genome,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_originType bioSource_origin,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_orgType bioSource_org,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_subtypeType bioSource_subtype,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_isFocus bioSource_isFocus) {
           this.bioSource_genome = bioSource_genome;
           this.bioSource_origin = bioSource_origin;
           this.bioSource_org = bioSource_org;
           this.bioSource_subtype = bioSource_subtype;
           this.bioSource_isFocus = bioSource_isFocus;
    }


    /**
     * Gets the bioSource_genome value for this BioSourceType.
     * 
     * @return bioSource_genome
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_genomeType getBioSource_genome() {
        return bioSource_genome;
    }


    /**
     * Sets the bioSource_genome value for this BioSourceType.
     * 
     * @param bioSource_genome
     */
    public void setBioSource_genome(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_genomeType bioSource_genome) {
        this.bioSource_genome = bioSource_genome;
    }


    /**
     * Gets the bioSource_origin value for this BioSourceType.
     * 
     * @return bioSource_origin
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_originType getBioSource_origin() {
        return bioSource_origin;
    }


    /**
     * Sets the bioSource_origin value for this BioSourceType.
     * 
     * @param bioSource_origin
     */
    public void setBioSource_origin(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_originType bioSource_origin) {
        this.bioSource_origin = bioSource_origin;
    }


    /**
     * Gets the bioSource_org value for this BioSourceType.
     * 
     * @return bioSource_org
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_orgType getBioSource_org() {
        return bioSource_org;
    }


    /**
     * Sets the bioSource_org value for this BioSourceType.
     * 
     * @param bioSource_org
     */
    public void setBioSource_org(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_orgType bioSource_org) {
        this.bioSource_org = bioSource_org;
    }


    /**
     * Gets the bioSource_subtype value for this BioSourceType.
     * 
     * @return bioSource_subtype
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_subtypeType getBioSource_subtype() {
        return bioSource_subtype;
    }


    /**
     * Sets the bioSource_subtype value for this BioSourceType.
     * 
     * @param bioSource_subtype
     */
    public void setBioSource_subtype(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_subtypeType bioSource_subtype) {
        this.bioSource_subtype = bioSource_subtype;
    }


    /**
     * Gets the bioSource_isFocus value for this BioSourceType.
     * 
     * @return bioSource_isFocus
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_isFocus getBioSource_isFocus() {
        return bioSource_isFocus;
    }


    /**
     * Sets the bioSource_isFocus value for this BioSourceType.
     * 
     * @param bioSource_isFocus
     */
    public void setBioSource_isFocus(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioSource_isFocus bioSource_isFocus) {
        this.bioSource_isFocus = bioSource_isFocus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BioSourceType)) return false;
        BioSourceType other = (BioSourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bioSource_genome==null && other.getBioSource_genome()==null) || 
             (this.bioSource_genome!=null &&
              this.bioSource_genome.equals(other.getBioSource_genome()))) &&
            ((this.bioSource_origin==null && other.getBioSource_origin()==null) || 
             (this.bioSource_origin!=null &&
              this.bioSource_origin.equals(other.getBioSource_origin()))) &&
            ((this.bioSource_org==null && other.getBioSource_org()==null) || 
             (this.bioSource_org!=null &&
              this.bioSource_org.equals(other.getBioSource_org()))) &&
            ((this.bioSource_subtype==null && other.getBioSource_subtype()==null) || 
             (this.bioSource_subtype!=null &&
              this.bioSource_subtype.equals(other.getBioSource_subtype()))) &&
            ((this.bioSource_isFocus==null && other.getBioSource_isFocus()==null) || 
             (this.bioSource_isFocus!=null &&
              this.bioSource_isFocus.equals(other.getBioSource_isFocus())));
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
        if (getBioSource_genome() != null) {
            _hashCode += getBioSource_genome().hashCode();
        }
        if (getBioSource_origin() != null) {
            _hashCode += getBioSource_origin().hashCode();
        }
        if (getBioSource_org() != null) {
            _hashCode += getBioSource_org().hashCode();
        }
        if (getBioSource_subtype() != null) {
            _hashCode += getBioSource_subtype().hashCode();
        }
        if (getBioSource_isFocus() != null) {
            _hashCode += getBioSource_isFocus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BioSourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioSourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioSource_genome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioSource_genome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioSource_genomeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioSource_origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioSource_origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioSource_originType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioSource_org");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioSource_org"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioSource_orgType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioSource_subtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioSource_subtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioSource_subtypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioSource_isFocus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioSource_is-focus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">BioSource_is-focus"));
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
