/**
 * ProtRefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ProtRefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_nameType protRef_name;

    private java.lang.String protRef_desc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_ecType protRef_ec;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_activityType protRef_activity;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_dbType protRef_db;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_processedType protRef_processed;

    public ProtRefType() {
    }

    public ProtRefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_nameType protRef_name,
           java.lang.String protRef_desc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_ecType protRef_ec,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_activityType protRef_activity,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_dbType protRef_db,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_processedType protRef_processed) {
           this.protRef_name = protRef_name;
           this.protRef_desc = protRef_desc;
           this.protRef_ec = protRef_ec;
           this.protRef_activity = protRef_activity;
           this.protRef_db = protRef_db;
           this.protRef_processed = protRef_processed;
    }


    /**
     * Gets the protRef_name value for this ProtRefType.
     * 
     * @return protRef_name
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_nameType getProtRef_name() {
        return protRef_name;
    }


    /**
     * Sets the protRef_name value for this ProtRefType.
     * 
     * @param protRef_name
     */
    public void setProtRef_name(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_nameType protRef_name) {
        this.protRef_name = protRef_name;
    }


    /**
     * Gets the protRef_desc value for this ProtRefType.
     * 
     * @return protRef_desc
     */
    public java.lang.String getProtRef_desc() {
        return protRef_desc;
    }


    /**
     * Sets the protRef_desc value for this ProtRefType.
     * 
     * @param protRef_desc
     */
    public void setProtRef_desc(java.lang.String protRef_desc) {
        this.protRef_desc = protRef_desc;
    }


    /**
     * Gets the protRef_ec value for this ProtRefType.
     * 
     * @return protRef_ec
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_ecType getProtRef_ec() {
        return protRef_ec;
    }


    /**
     * Sets the protRef_ec value for this ProtRefType.
     * 
     * @param protRef_ec
     */
    public void setProtRef_ec(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_ecType protRef_ec) {
        this.protRef_ec = protRef_ec;
    }


    /**
     * Gets the protRef_activity value for this ProtRefType.
     * 
     * @return protRef_activity
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_activityType getProtRef_activity() {
        return protRef_activity;
    }


    /**
     * Sets the protRef_activity value for this ProtRefType.
     * 
     * @param protRef_activity
     */
    public void setProtRef_activity(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_activityType protRef_activity) {
        this.protRef_activity = protRef_activity;
    }


    /**
     * Gets the protRef_db value for this ProtRefType.
     * 
     * @return protRef_db
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_dbType getProtRef_db() {
        return protRef_db;
    }


    /**
     * Sets the protRef_db value for this ProtRefType.
     * 
     * @param protRef_db
     */
    public void setProtRef_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_dbType protRef_db) {
        this.protRef_db = protRef_db;
    }


    /**
     * Gets the protRef_processed value for this ProtRefType.
     * 
     * @return protRef_processed
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_processedType getProtRef_processed() {
        return protRef_processed;
    }


    /**
     * Sets the protRef_processed value for this ProtRefType.
     * 
     * @param protRef_processed
     */
    public void setProtRef_processed(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProtRef_processedType protRef_processed) {
        this.protRef_processed = protRef_processed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProtRefType)) return false;
        ProtRefType other = (ProtRefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.protRef_name==null && other.getProtRef_name()==null) || 
             (this.protRef_name!=null &&
              this.protRef_name.equals(other.getProtRef_name()))) &&
            ((this.protRef_desc==null && other.getProtRef_desc()==null) || 
             (this.protRef_desc!=null &&
              this.protRef_desc.equals(other.getProtRef_desc()))) &&
            ((this.protRef_ec==null && other.getProtRef_ec()==null) || 
             (this.protRef_ec!=null &&
              this.protRef_ec.equals(other.getProtRef_ec()))) &&
            ((this.protRef_activity==null && other.getProtRef_activity()==null) || 
             (this.protRef_activity!=null &&
              this.protRef_activity.equals(other.getProtRef_activity()))) &&
            ((this.protRef_db==null && other.getProtRef_db()==null) || 
             (this.protRef_db!=null &&
              this.protRef_db.equals(other.getProtRef_db()))) &&
            ((this.protRef_processed==null && other.getProtRef_processed()==null) || 
             (this.protRef_processed!=null &&
              this.protRef_processed.equals(other.getProtRef_processed())));
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
        if (getProtRef_name() != null) {
            _hashCode += getProtRef_name().hashCode();
        }
        if (getProtRef_desc() != null) {
            _hashCode += getProtRef_desc().hashCode();
        }
        if (getProtRef_ec() != null) {
            _hashCode += getProtRef_ec().hashCode();
        }
        if (getProtRef_activity() != null) {
            _hashCode += getProtRef_activity().hashCode();
        }
        if (getProtRef_db() != null) {
            _hashCode += getProtRef_db().hashCode();
        }
        if (getProtRef_processed() != null) {
            _hashCode += getProtRef_processed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProtRefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-refType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protRef_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_nameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protRef_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protRef_ec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_ec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_ecType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protRef_activity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_activityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protRef_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_dbType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protRef_processed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_processed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Prot-ref_processedType"));
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
