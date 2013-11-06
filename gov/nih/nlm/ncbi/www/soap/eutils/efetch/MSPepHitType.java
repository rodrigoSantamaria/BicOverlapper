/**
 * MSPepHitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSPepHitType  implements java.io.Serializable {
    private java.lang.String MSPepHit_start;

    private java.lang.String MSPepHit_stop;

    private java.lang.String MSPepHit_gi;

    private java.lang.String MSPepHit_accession;

    private java.lang.String MSPepHit_defline;

    private java.lang.String MSPepHit_protlength;

    private java.lang.String MSPepHit_oid;

    public MSPepHitType() {
    }

    public MSPepHitType(
           java.lang.String MSPepHit_start,
           java.lang.String MSPepHit_stop,
           java.lang.String MSPepHit_gi,
           java.lang.String MSPepHit_accession,
           java.lang.String MSPepHit_defline,
           java.lang.String MSPepHit_protlength,
           java.lang.String MSPepHit_oid) {
           this.MSPepHit_start = MSPepHit_start;
           this.MSPepHit_stop = MSPepHit_stop;
           this.MSPepHit_gi = MSPepHit_gi;
           this.MSPepHit_accession = MSPepHit_accession;
           this.MSPepHit_defline = MSPepHit_defline;
           this.MSPepHit_protlength = MSPepHit_protlength;
           this.MSPepHit_oid = MSPepHit_oid;
    }


    /**
     * Gets the MSPepHit_start value for this MSPepHitType.
     * 
     * @return MSPepHit_start
     */
    public java.lang.String getMSPepHit_start() {
        return MSPepHit_start;
    }


    /**
     * Sets the MSPepHit_start value for this MSPepHitType.
     * 
     * @param MSPepHit_start
     */
    public void setMSPepHit_start(java.lang.String MSPepHit_start) {
        this.MSPepHit_start = MSPepHit_start;
    }


    /**
     * Gets the MSPepHit_stop value for this MSPepHitType.
     * 
     * @return MSPepHit_stop
     */
    public java.lang.String getMSPepHit_stop() {
        return MSPepHit_stop;
    }


    /**
     * Sets the MSPepHit_stop value for this MSPepHitType.
     * 
     * @param MSPepHit_stop
     */
    public void setMSPepHit_stop(java.lang.String MSPepHit_stop) {
        this.MSPepHit_stop = MSPepHit_stop;
    }


    /**
     * Gets the MSPepHit_gi value for this MSPepHitType.
     * 
     * @return MSPepHit_gi
     */
    public java.lang.String getMSPepHit_gi() {
        return MSPepHit_gi;
    }


    /**
     * Sets the MSPepHit_gi value for this MSPepHitType.
     * 
     * @param MSPepHit_gi
     */
    public void setMSPepHit_gi(java.lang.String MSPepHit_gi) {
        this.MSPepHit_gi = MSPepHit_gi;
    }


    /**
     * Gets the MSPepHit_accession value for this MSPepHitType.
     * 
     * @return MSPepHit_accession
     */
    public java.lang.String getMSPepHit_accession() {
        return MSPepHit_accession;
    }


    /**
     * Sets the MSPepHit_accession value for this MSPepHitType.
     * 
     * @param MSPepHit_accession
     */
    public void setMSPepHit_accession(java.lang.String MSPepHit_accession) {
        this.MSPepHit_accession = MSPepHit_accession;
    }


    /**
     * Gets the MSPepHit_defline value for this MSPepHitType.
     * 
     * @return MSPepHit_defline
     */
    public java.lang.String getMSPepHit_defline() {
        return MSPepHit_defline;
    }


    /**
     * Sets the MSPepHit_defline value for this MSPepHitType.
     * 
     * @param MSPepHit_defline
     */
    public void setMSPepHit_defline(java.lang.String MSPepHit_defline) {
        this.MSPepHit_defline = MSPepHit_defline;
    }


    /**
     * Gets the MSPepHit_protlength value for this MSPepHitType.
     * 
     * @return MSPepHit_protlength
     */
    public java.lang.String getMSPepHit_protlength() {
        return MSPepHit_protlength;
    }


    /**
     * Sets the MSPepHit_protlength value for this MSPepHitType.
     * 
     * @param MSPepHit_protlength
     */
    public void setMSPepHit_protlength(java.lang.String MSPepHit_protlength) {
        this.MSPepHit_protlength = MSPepHit_protlength;
    }


    /**
     * Gets the MSPepHit_oid value for this MSPepHitType.
     * 
     * @return MSPepHit_oid
     */
    public java.lang.String getMSPepHit_oid() {
        return MSPepHit_oid;
    }


    /**
     * Sets the MSPepHit_oid value for this MSPepHitType.
     * 
     * @param MSPepHit_oid
     */
    public void setMSPepHit_oid(java.lang.String MSPepHit_oid) {
        this.MSPepHit_oid = MSPepHit_oid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSPepHitType)) return false;
        MSPepHitType other = (MSPepHitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSPepHit_start==null && other.getMSPepHit_start()==null) || 
             (this.MSPepHit_start!=null &&
              this.MSPepHit_start.equals(other.getMSPepHit_start()))) &&
            ((this.MSPepHit_stop==null && other.getMSPepHit_stop()==null) || 
             (this.MSPepHit_stop!=null &&
              this.MSPepHit_stop.equals(other.getMSPepHit_stop()))) &&
            ((this.MSPepHit_gi==null && other.getMSPepHit_gi()==null) || 
             (this.MSPepHit_gi!=null &&
              this.MSPepHit_gi.equals(other.getMSPepHit_gi()))) &&
            ((this.MSPepHit_accession==null && other.getMSPepHit_accession()==null) || 
             (this.MSPepHit_accession!=null &&
              this.MSPepHit_accession.equals(other.getMSPepHit_accession()))) &&
            ((this.MSPepHit_defline==null && other.getMSPepHit_defline()==null) || 
             (this.MSPepHit_defline!=null &&
              this.MSPepHit_defline.equals(other.getMSPepHit_defline()))) &&
            ((this.MSPepHit_protlength==null && other.getMSPepHit_protlength()==null) || 
             (this.MSPepHit_protlength!=null &&
              this.MSPepHit_protlength.equals(other.getMSPepHit_protlength()))) &&
            ((this.MSPepHit_oid==null && other.getMSPepHit_oid()==null) || 
             (this.MSPepHit_oid!=null &&
              this.MSPepHit_oid.equals(other.getMSPepHit_oid())));
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
        if (getMSPepHit_start() != null) {
            _hashCode += getMSPepHit_start().hashCode();
        }
        if (getMSPepHit_stop() != null) {
            _hashCode += getMSPepHit_stop().hashCode();
        }
        if (getMSPepHit_gi() != null) {
            _hashCode += getMSPepHit_gi().hashCode();
        }
        if (getMSPepHit_accession() != null) {
            _hashCode += getMSPepHit_accession().hashCode();
        }
        if (getMSPepHit_defline() != null) {
            _hashCode += getMSPepHit_defline().hashCode();
        }
        if (getMSPepHit_protlength() != null) {
            _hashCode += getMSPepHit_protlength().hashCode();
        }
        if (getMSPepHit_oid() != null) {
            _hashCode += getMSPepHit_oid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSPepHitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSPepHitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSPepHit_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSPepHit_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSPepHit_stop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSPepHit_stop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSPepHit_gi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSPepHit_gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSPepHit_accession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSPepHit_accession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSPepHit_defline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSPepHit_defline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSPepHit_protlength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSPepHit_protlength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSPepHit_oid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSPepHit_oid"));
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
