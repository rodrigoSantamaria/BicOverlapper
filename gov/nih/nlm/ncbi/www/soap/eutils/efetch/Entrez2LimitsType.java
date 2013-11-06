/**
 * Entrez2LimitsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2LimitsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Limits_filterDateType entrez2Limits_filterDate;

    private java.lang.String entrez2Limits_maxUIDs;

    private java.lang.String entrez2Limits_offsetUIDs;

    public Entrez2LimitsType() {
    }

    public Entrez2LimitsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Limits_filterDateType entrez2Limits_filterDate,
           java.lang.String entrez2Limits_maxUIDs,
           java.lang.String entrez2Limits_offsetUIDs) {
           this.entrez2Limits_filterDate = entrez2Limits_filterDate;
           this.entrez2Limits_maxUIDs = entrez2Limits_maxUIDs;
           this.entrez2Limits_offsetUIDs = entrez2Limits_offsetUIDs;
    }


    /**
     * Gets the entrez2Limits_filterDate value for this Entrez2LimitsType.
     * 
     * @return entrez2Limits_filterDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Limits_filterDateType getEntrez2Limits_filterDate() {
        return entrez2Limits_filterDate;
    }


    /**
     * Sets the entrez2Limits_filterDate value for this Entrez2LimitsType.
     * 
     * @param entrez2Limits_filterDate
     */
    public void setEntrez2Limits_filterDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Limits_filterDateType entrez2Limits_filterDate) {
        this.entrez2Limits_filterDate = entrez2Limits_filterDate;
    }


    /**
     * Gets the entrez2Limits_maxUIDs value for this Entrez2LimitsType.
     * 
     * @return entrez2Limits_maxUIDs
     */
    public java.lang.String getEntrez2Limits_maxUIDs() {
        return entrez2Limits_maxUIDs;
    }


    /**
     * Sets the entrez2Limits_maxUIDs value for this Entrez2LimitsType.
     * 
     * @param entrez2Limits_maxUIDs
     */
    public void setEntrez2Limits_maxUIDs(java.lang.String entrez2Limits_maxUIDs) {
        this.entrez2Limits_maxUIDs = entrez2Limits_maxUIDs;
    }


    /**
     * Gets the entrez2Limits_offsetUIDs value for this Entrez2LimitsType.
     * 
     * @return entrez2Limits_offsetUIDs
     */
    public java.lang.String getEntrez2Limits_offsetUIDs() {
        return entrez2Limits_offsetUIDs;
    }


    /**
     * Sets the entrez2Limits_offsetUIDs value for this Entrez2LimitsType.
     * 
     * @param entrez2Limits_offsetUIDs
     */
    public void setEntrez2Limits_offsetUIDs(java.lang.String entrez2Limits_offsetUIDs) {
        this.entrez2Limits_offsetUIDs = entrez2Limits_offsetUIDs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2LimitsType)) return false;
        Entrez2LimitsType other = (Entrez2LimitsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2Limits_filterDate==null && other.getEntrez2Limits_filterDate()==null) || 
             (this.entrez2Limits_filterDate!=null &&
              this.entrez2Limits_filterDate.equals(other.getEntrez2Limits_filterDate()))) &&
            ((this.entrez2Limits_maxUIDs==null && other.getEntrez2Limits_maxUIDs()==null) || 
             (this.entrez2Limits_maxUIDs!=null &&
              this.entrez2Limits_maxUIDs.equals(other.getEntrez2Limits_maxUIDs()))) &&
            ((this.entrez2Limits_offsetUIDs==null && other.getEntrez2Limits_offsetUIDs()==null) || 
             (this.entrez2Limits_offsetUIDs!=null &&
              this.entrez2Limits_offsetUIDs.equals(other.getEntrez2Limits_offsetUIDs())));
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
        if (getEntrez2Limits_filterDate() != null) {
            _hashCode += getEntrez2Limits_filterDate().hashCode();
        }
        if (getEntrez2Limits_maxUIDs() != null) {
            _hashCode += getEntrez2Limits_maxUIDs().hashCode();
        }
        if (getEntrez2Limits_offsetUIDs() != null) {
            _hashCode += getEntrez2Limits_offsetUIDs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2LimitsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-limitsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Limits_filterDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-limits_filter-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-limits_filter-dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Limits_maxUIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-limits_max-UIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Limits_offsetUIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-limits_offset-UIDs"));
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
