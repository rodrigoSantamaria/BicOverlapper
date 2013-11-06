/**
 * JournalIssueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class JournalIssueType  implements java.io.Serializable {
    private java.lang.String volume;

    private java.lang.String issue;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubDateType pubDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalIssueTypeCitedMedium citedMedium;  // attribute

    public JournalIssueType() {
    }

    public JournalIssueType(
           java.lang.String volume,
           java.lang.String issue,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubDateType pubDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalIssueTypeCitedMedium citedMedium) {
           this.volume = volume;
           this.issue = issue;
           this.pubDate = pubDate;
           this.citedMedium = citedMedium;
    }


    /**
     * Gets the volume value for this JournalIssueType.
     * 
     * @return volume
     */
    public java.lang.String getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this JournalIssueType.
     * 
     * @param volume
     */
    public void setVolume(java.lang.String volume) {
        this.volume = volume;
    }


    /**
     * Gets the issue value for this JournalIssueType.
     * 
     * @return issue
     */
    public java.lang.String getIssue() {
        return issue;
    }


    /**
     * Sets the issue value for this JournalIssueType.
     * 
     * @param issue
     */
    public void setIssue(java.lang.String issue) {
        this.issue = issue;
    }


    /**
     * Gets the pubDate value for this JournalIssueType.
     * 
     * @return pubDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubDateType getPubDate() {
        return pubDate;
    }


    /**
     * Sets the pubDate value for this JournalIssueType.
     * 
     * @param pubDate
     */
    public void setPubDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubDateType pubDate) {
        this.pubDate = pubDate;
    }


    /**
     * Gets the citedMedium value for this JournalIssueType.
     * 
     * @return citedMedium
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalIssueTypeCitedMedium getCitedMedium() {
        return citedMedium;
    }


    /**
     * Sets the citedMedium value for this JournalIssueType.
     * 
     * @param citedMedium
     */
    public void setCitedMedium(gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalIssueTypeCitedMedium citedMedium) {
        this.citedMedium = citedMedium;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JournalIssueType)) return false;
        JournalIssueType other = (JournalIssueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.issue==null && other.getIssue()==null) || 
             (this.issue!=null &&
              this.issue.equals(other.getIssue()))) &&
            ((this.pubDate==null && other.getPubDate()==null) || 
             (this.pubDate!=null &&
              this.pubDate.equals(other.getPubDate()))) &&
            ((this.citedMedium==null && other.getCitedMedium()==null) || 
             (this.citedMedium!=null &&
              this.citedMedium.equals(other.getCitedMedium())));
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
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getIssue() != null) {
            _hashCode += getIssue().hashCode();
        }
        if (getPubDate() != null) {
            _hashCode += getPubDate().hashCode();
        }
        if (getCitedMedium() != null) {
            _hashCode += getCitedMedium().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JournalIssueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "JournalIssueType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("citedMedium");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CitedMedium"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">JournalIssueType>CitedMedium"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubDateType"));
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
