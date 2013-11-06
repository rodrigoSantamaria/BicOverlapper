/**
 * JournalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class JournalType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNType[] ISSN;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalIssueType journalIssue;

    private java.lang.String coden;

    private java.lang.String title;

    private java.lang.String ISOAbbreviation;

    public JournalType() {
    }

    public JournalType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNType[] ISSN,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalIssueType journalIssue,
           java.lang.String coden,
           java.lang.String title,
           java.lang.String ISOAbbreviation) {
           this.ISSN = ISSN;
           this.journalIssue = journalIssue;
           this.coden = coden;
           this.title = title;
           this.ISOAbbreviation = ISOAbbreviation;
    }


    /**
     * Gets the ISSN value for this JournalType.
     * 
     * @return ISSN
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNType[] getISSN() {
        return ISSN;
    }


    /**
     * Sets the ISSN value for this JournalType.
     * 
     * @param ISSN
     */
    public void setISSN(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNType[] ISSN) {
        this.ISSN = ISSN;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNType getISSN(int i) {
        return this.ISSN[i];
    }

    public void setISSN(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNType _value) {
        this.ISSN[i] = _value;
    }


    /**
     * Gets the journalIssue value for this JournalType.
     * 
     * @return journalIssue
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalIssueType getJournalIssue() {
        return journalIssue;
    }


    /**
     * Sets the journalIssue value for this JournalType.
     * 
     * @param journalIssue
     */
    public void setJournalIssue(gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalIssueType journalIssue) {
        this.journalIssue = journalIssue;
    }


    /**
     * Gets the coden value for this JournalType.
     * 
     * @return coden
     */
    public java.lang.String getCoden() {
        return coden;
    }


    /**
     * Sets the coden value for this JournalType.
     * 
     * @param coden
     */
    public void setCoden(java.lang.String coden) {
        this.coden = coden;
    }


    /**
     * Gets the title value for this JournalType.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this JournalType.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the ISOAbbreviation value for this JournalType.
     * 
     * @return ISOAbbreviation
     */
    public java.lang.String getISOAbbreviation() {
        return ISOAbbreviation;
    }


    /**
     * Sets the ISOAbbreviation value for this JournalType.
     * 
     * @param ISOAbbreviation
     */
    public void setISOAbbreviation(java.lang.String ISOAbbreviation) {
        this.ISOAbbreviation = ISOAbbreviation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JournalType)) return false;
        JournalType other = (JournalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ISSN==null && other.getISSN()==null) || 
             (this.ISSN!=null &&
              java.util.Arrays.equals(this.ISSN, other.getISSN()))) &&
            ((this.journalIssue==null && other.getJournalIssue()==null) || 
             (this.journalIssue!=null &&
              this.journalIssue.equals(other.getJournalIssue()))) &&
            ((this.coden==null && other.getCoden()==null) || 
             (this.coden!=null &&
              this.coden.equals(other.getCoden()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.ISOAbbreviation==null && other.getISOAbbreviation()==null) || 
             (this.ISOAbbreviation!=null &&
              this.ISOAbbreviation.equals(other.getISOAbbreviation())));
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
        if (getISSN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getISSN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getISSN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJournalIssue() != null) {
            _hashCode += getJournalIssue().hashCode();
        }
        if (getCoden() != null) {
            _hashCode += getCoden().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getISOAbbreviation() != null) {
            _hashCode += getISOAbbreviation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JournalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "JournalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISSN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ISSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ISSNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "JournalIssue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "JournalIssueType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Coden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISOAbbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ISOAbbreviation"));
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
