/**
 * PRFExtraSrcType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PRFExtraSrcType  implements java.io.Serializable {
    private java.lang.String PRFExtraSrc_host;

    private java.lang.String PRFExtraSrc_part;

    private java.lang.String PRFExtraSrc_state;

    private java.lang.String PRFExtraSrc_strain;

    private java.lang.String PRFExtraSrc_taxon;

    public PRFExtraSrcType() {
    }

    public PRFExtraSrcType(
           java.lang.String PRFExtraSrc_host,
           java.lang.String PRFExtraSrc_part,
           java.lang.String PRFExtraSrc_state,
           java.lang.String PRFExtraSrc_strain,
           java.lang.String PRFExtraSrc_taxon) {
           this.PRFExtraSrc_host = PRFExtraSrc_host;
           this.PRFExtraSrc_part = PRFExtraSrc_part;
           this.PRFExtraSrc_state = PRFExtraSrc_state;
           this.PRFExtraSrc_strain = PRFExtraSrc_strain;
           this.PRFExtraSrc_taxon = PRFExtraSrc_taxon;
    }


    /**
     * Gets the PRFExtraSrc_host value for this PRFExtraSrcType.
     * 
     * @return PRFExtraSrc_host
     */
    public java.lang.String getPRFExtraSrc_host() {
        return PRFExtraSrc_host;
    }


    /**
     * Sets the PRFExtraSrc_host value for this PRFExtraSrcType.
     * 
     * @param PRFExtraSrc_host
     */
    public void setPRFExtraSrc_host(java.lang.String PRFExtraSrc_host) {
        this.PRFExtraSrc_host = PRFExtraSrc_host;
    }


    /**
     * Gets the PRFExtraSrc_part value for this PRFExtraSrcType.
     * 
     * @return PRFExtraSrc_part
     */
    public java.lang.String getPRFExtraSrc_part() {
        return PRFExtraSrc_part;
    }


    /**
     * Sets the PRFExtraSrc_part value for this PRFExtraSrcType.
     * 
     * @param PRFExtraSrc_part
     */
    public void setPRFExtraSrc_part(java.lang.String PRFExtraSrc_part) {
        this.PRFExtraSrc_part = PRFExtraSrc_part;
    }


    /**
     * Gets the PRFExtraSrc_state value for this PRFExtraSrcType.
     * 
     * @return PRFExtraSrc_state
     */
    public java.lang.String getPRFExtraSrc_state() {
        return PRFExtraSrc_state;
    }


    /**
     * Sets the PRFExtraSrc_state value for this PRFExtraSrcType.
     * 
     * @param PRFExtraSrc_state
     */
    public void setPRFExtraSrc_state(java.lang.String PRFExtraSrc_state) {
        this.PRFExtraSrc_state = PRFExtraSrc_state;
    }


    /**
     * Gets the PRFExtraSrc_strain value for this PRFExtraSrcType.
     * 
     * @return PRFExtraSrc_strain
     */
    public java.lang.String getPRFExtraSrc_strain() {
        return PRFExtraSrc_strain;
    }


    /**
     * Sets the PRFExtraSrc_strain value for this PRFExtraSrcType.
     * 
     * @param PRFExtraSrc_strain
     */
    public void setPRFExtraSrc_strain(java.lang.String PRFExtraSrc_strain) {
        this.PRFExtraSrc_strain = PRFExtraSrc_strain;
    }


    /**
     * Gets the PRFExtraSrc_taxon value for this PRFExtraSrcType.
     * 
     * @return PRFExtraSrc_taxon
     */
    public java.lang.String getPRFExtraSrc_taxon() {
        return PRFExtraSrc_taxon;
    }


    /**
     * Sets the PRFExtraSrc_taxon value for this PRFExtraSrcType.
     * 
     * @param PRFExtraSrc_taxon
     */
    public void setPRFExtraSrc_taxon(java.lang.String PRFExtraSrc_taxon) {
        this.PRFExtraSrc_taxon = PRFExtraSrc_taxon;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PRFExtraSrcType)) return false;
        PRFExtraSrcType other = (PRFExtraSrcType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PRFExtraSrc_host==null && other.getPRFExtraSrc_host()==null) || 
             (this.PRFExtraSrc_host!=null &&
              this.PRFExtraSrc_host.equals(other.getPRFExtraSrc_host()))) &&
            ((this.PRFExtraSrc_part==null && other.getPRFExtraSrc_part()==null) || 
             (this.PRFExtraSrc_part!=null &&
              this.PRFExtraSrc_part.equals(other.getPRFExtraSrc_part()))) &&
            ((this.PRFExtraSrc_state==null && other.getPRFExtraSrc_state()==null) || 
             (this.PRFExtraSrc_state!=null &&
              this.PRFExtraSrc_state.equals(other.getPRFExtraSrc_state()))) &&
            ((this.PRFExtraSrc_strain==null && other.getPRFExtraSrc_strain()==null) || 
             (this.PRFExtraSrc_strain!=null &&
              this.PRFExtraSrc_strain.equals(other.getPRFExtraSrc_strain()))) &&
            ((this.PRFExtraSrc_taxon==null && other.getPRFExtraSrc_taxon()==null) || 
             (this.PRFExtraSrc_taxon!=null &&
              this.PRFExtraSrc_taxon.equals(other.getPRFExtraSrc_taxon())));
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
        if (getPRFExtraSrc_host() != null) {
            _hashCode += getPRFExtraSrc_host().hashCode();
        }
        if (getPRFExtraSrc_part() != null) {
            _hashCode += getPRFExtraSrc_part().hashCode();
        }
        if (getPRFExtraSrc_state() != null) {
            _hashCode += getPRFExtraSrc_state().hashCode();
        }
        if (getPRFExtraSrc_strain() != null) {
            _hashCode += getPRFExtraSrc_strain().hashCode();
        }
        if (getPRFExtraSrc_taxon() != null) {
            _hashCode += getPRFExtraSrc_taxon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PRFExtraSrcType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-ExtraSrcType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRFExtraSrc_host");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-ExtraSrc_host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRFExtraSrc_part");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-ExtraSrc_part"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRFExtraSrc_state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-ExtraSrc_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRFExtraSrc_strain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-ExtraSrc_strain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRFExtraSrc_taxon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PRF-ExtraSrc_taxon"));
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
