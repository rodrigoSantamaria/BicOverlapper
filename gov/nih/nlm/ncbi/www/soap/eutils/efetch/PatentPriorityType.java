/**
 * PatentPriorityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PatentPriorityType  implements java.io.Serializable {
    private java.lang.String patentPriority_country;

    private java.lang.String patentPriority_number;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentPriority_dateType patentPriority_date;

    public PatentPriorityType() {
    }

    public PatentPriorityType(
           java.lang.String patentPriority_country,
           java.lang.String patentPriority_number,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentPriority_dateType patentPriority_date) {
           this.patentPriority_country = patentPriority_country;
           this.patentPriority_number = patentPriority_number;
           this.patentPriority_date = patentPriority_date;
    }


    /**
     * Gets the patentPriority_country value for this PatentPriorityType.
     * 
     * @return patentPriority_country
     */
    public java.lang.String getPatentPriority_country() {
        return patentPriority_country;
    }


    /**
     * Sets the patentPriority_country value for this PatentPriorityType.
     * 
     * @param patentPriority_country
     */
    public void setPatentPriority_country(java.lang.String patentPriority_country) {
        this.patentPriority_country = patentPriority_country;
    }


    /**
     * Gets the patentPriority_number value for this PatentPriorityType.
     * 
     * @return patentPriority_number
     */
    public java.lang.String getPatentPriority_number() {
        return patentPriority_number;
    }


    /**
     * Sets the patentPriority_number value for this PatentPriorityType.
     * 
     * @param patentPriority_number
     */
    public void setPatentPriority_number(java.lang.String patentPriority_number) {
        this.patentPriority_number = patentPriority_number;
    }


    /**
     * Gets the patentPriority_date value for this PatentPriorityType.
     * 
     * @return patentPriority_date
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentPriority_dateType getPatentPriority_date() {
        return patentPriority_date;
    }


    /**
     * Sets the patentPriority_date value for this PatentPriorityType.
     * 
     * @param patentPriority_date
     */
    public void setPatentPriority_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentPriority_dateType patentPriority_date) {
        this.patentPriority_date = patentPriority_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PatentPriorityType)) return false;
        PatentPriorityType other = (PatentPriorityType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.patentPriority_country==null && other.getPatentPriority_country()==null) || 
             (this.patentPriority_country!=null &&
              this.patentPriority_country.equals(other.getPatentPriority_country()))) &&
            ((this.patentPriority_number==null && other.getPatentPriority_number()==null) || 
             (this.patentPriority_number!=null &&
              this.patentPriority_number.equals(other.getPatentPriority_number()))) &&
            ((this.patentPriority_date==null && other.getPatentPriority_date()==null) || 
             (this.patentPriority_date!=null &&
              this.patentPriority_date.equals(other.getPatentPriority_date())));
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
        if (getPatentPriority_country() != null) {
            _hashCode += getPatentPriority_country().hashCode();
        }
        if (getPatentPriority_number() != null) {
            _hashCode += getPatentPriority_number().hashCode();
        }
        if (getPatentPriority_date() != null) {
            _hashCode += getPatentPriority_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PatentPriorityType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Patent-priorityType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patentPriority_country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Patent-priority_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patentPriority_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Patent-priority_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patentPriority_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Patent-priority_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Patent-priority_dateType"));
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
