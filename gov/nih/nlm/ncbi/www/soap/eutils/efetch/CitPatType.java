/**
 * CitPatType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CitPatType  implements java.io.Serializable {
    private java.lang.String citPat_title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_authorsType citPat_authors;

    private java.lang.String citPat_country;

    private java.lang.String citPat_docType;

    private java.lang.String citPat_number;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_dateIssueType citPat_dateIssue;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_classType citPat_class;

    private java.lang.String citPat_appNumber;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_appDateType citPat_appDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_applicantsType citPat_applicants;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_assigneesType citPat_assignees;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_priorityType citPat_priority;

    private java.lang.String citPat_abstract;

    public CitPatType() {
    }

    public CitPatType(
           java.lang.String citPat_title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_authorsType citPat_authors,
           java.lang.String citPat_country,
           java.lang.String citPat_docType,
           java.lang.String citPat_number,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_dateIssueType citPat_dateIssue,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_classType citPat_class,
           java.lang.String citPat_appNumber,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_appDateType citPat_appDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_applicantsType citPat_applicants,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_assigneesType citPat_assignees,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_priorityType citPat_priority,
           java.lang.String citPat_abstract) {
           this.citPat_title = citPat_title;
           this.citPat_authors = citPat_authors;
           this.citPat_country = citPat_country;
           this.citPat_docType = citPat_docType;
           this.citPat_number = citPat_number;
           this.citPat_dateIssue = citPat_dateIssue;
           this.citPat_class = citPat_class;
           this.citPat_appNumber = citPat_appNumber;
           this.citPat_appDate = citPat_appDate;
           this.citPat_applicants = citPat_applicants;
           this.citPat_assignees = citPat_assignees;
           this.citPat_priority = citPat_priority;
           this.citPat_abstract = citPat_abstract;
    }


    /**
     * Gets the citPat_title value for this CitPatType.
     * 
     * @return citPat_title
     */
    public java.lang.String getCitPat_title() {
        return citPat_title;
    }


    /**
     * Sets the citPat_title value for this CitPatType.
     * 
     * @param citPat_title
     */
    public void setCitPat_title(java.lang.String citPat_title) {
        this.citPat_title = citPat_title;
    }


    /**
     * Gets the citPat_authors value for this CitPatType.
     * 
     * @return citPat_authors
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_authorsType getCitPat_authors() {
        return citPat_authors;
    }


    /**
     * Sets the citPat_authors value for this CitPatType.
     * 
     * @param citPat_authors
     */
    public void setCitPat_authors(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_authorsType citPat_authors) {
        this.citPat_authors = citPat_authors;
    }


    /**
     * Gets the citPat_country value for this CitPatType.
     * 
     * @return citPat_country
     */
    public java.lang.String getCitPat_country() {
        return citPat_country;
    }


    /**
     * Sets the citPat_country value for this CitPatType.
     * 
     * @param citPat_country
     */
    public void setCitPat_country(java.lang.String citPat_country) {
        this.citPat_country = citPat_country;
    }


    /**
     * Gets the citPat_docType value for this CitPatType.
     * 
     * @return citPat_docType
     */
    public java.lang.String getCitPat_docType() {
        return citPat_docType;
    }


    /**
     * Sets the citPat_docType value for this CitPatType.
     * 
     * @param citPat_docType
     */
    public void setCitPat_docType(java.lang.String citPat_docType) {
        this.citPat_docType = citPat_docType;
    }


    /**
     * Gets the citPat_number value for this CitPatType.
     * 
     * @return citPat_number
     */
    public java.lang.String getCitPat_number() {
        return citPat_number;
    }


    /**
     * Sets the citPat_number value for this CitPatType.
     * 
     * @param citPat_number
     */
    public void setCitPat_number(java.lang.String citPat_number) {
        this.citPat_number = citPat_number;
    }


    /**
     * Gets the citPat_dateIssue value for this CitPatType.
     * 
     * @return citPat_dateIssue
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_dateIssueType getCitPat_dateIssue() {
        return citPat_dateIssue;
    }


    /**
     * Sets the citPat_dateIssue value for this CitPatType.
     * 
     * @param citPat_dateIssue
     */
    public void setCitPat_dateIssue(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_dateIssueType citPat_dateIssue) {
        this.citPat_dateIssue = citPat_dateIssue;
    }


    /**
     * Gets the citPat_class value for this CitPatType.
     * 
     * @return citPat_class
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_classType getCitPat_class() {
        return citPat_class;
    }


    /**
     * Sets the citPat_class value for this CitPatType.
     * 
     * @param citPat_class
     */
    public void setCitPat_class(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_classType citPat_class) {
        this.citPat_class = citPat_class;
    }


    /**
     * Gets the citPat_appNumber value for this CitPatType.
     * 
     * @return citPat_appNumber
     */
    public java.lang.String getCitPat_appNumber() {
        return citPat_appNumber;
    }


    /**
     * Sets the citPat_appNumber value for this CitPatType.
     * 
     * @param citPat_appNumber
     */
    public void setCitPat_appNumber(java.lang.String citPat_appNumber) {
        this.citPat_appNumber = citPat_appNumber;
    }


    /**
     * Gets the citPat_appDate value for this CitPatType.
     * 
     * @return citPat_appDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_appDateType getCitPat_appDate() {
        return citPat_appDate;
    }


    /**
     * Sets the citPat_appDate value for this CitPatType.
     * 
     * @param citPat_appDate
     */
    public void setCitPat_appDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_appDateType citPat_appDate) {
        this.citPat_appDate = citPat_appDate;
    }


    /**
     * Gets the citPat_applicants value for this CitPatType.
     * 
     * @return citPat_applicants
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_applicantsType getCitPat_applicants() {
        return citPat_applicants;
    }


    /**
     * Sets the citPat_applicants value for this CitPatType.
     * 
     * @param citPat_applicants
     */
    public void setCitPat_applicants(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_applicantsType citPat_applicants) {
        this.citPat_applicants = citPat_applicants;
    }


    /**
     * Gets the citPat_assignees value for this CitPatType.
     * 
     * @return citPat_assignees
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_assigneesType getCitPat_assignees() {
        return citPat_assignees;
    }


    /**
     * Sets the citPat_assignees value for this CitPatType.
     * 
     * @param citPat_assignees
     */
    public void setCitPat_assignees(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_assigneesType citPat_assignees) {
        this.citPat_assignees = citPat_assignees;
    }


    /**
     * Gets the citPat_priority value for this CitPatType.
     * 
     * @return citPat_priority
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_priorityType getCitPat_priority() {
        return citPat_priority;
    }


    /**
     * Sets the citPat_priority value for this CitPatType.
     * 
     * @param citPat_priority
     */
    public void setCitPat_priority(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitPat_priorityType citPat_priority) {
        this.citPat_priority = citPat_priority;
    }


    /**
     * Gets the citPat_abstract value for this CitPatType.
     * 
     * @return citPat_abstract
     */
    public java.lang.String getCitPat_abstract() {
        return citPat_abstract;
    }


    /**
     * Sets the citPat_abstract value for this CitPatType.
     * 
     * @param citPat_abstract
     */
    public void setCitPat_abstract(java.lang.String citPat_abstract) {
        this.citPat_abstract = citPat_abstract;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CitPatType)) return false;
        CitPatType other = (CitPatType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citPat_title==null && other.getCitPat_title()==null) || 
             (this.citPat_title!=null &&
              this.citPat_title.equals(other.getCitPat_title()))) &&
            ((this.citPat_authors==null && other.getCitPat_authors()==null) || 
             (this.citPat_authors!=null &&
              this.citPat_authors.equals(other.getCitPat_authors()))) &&
            ((this.citPat_country==null && other.getCitPat_country()==null) || 
             (this.citPat_country!=null &&
              this.citPat_country.equals(other.getCitPat_country()))) &&
            ((this.citPat_docType==null && other.getCitPat_docType()==null) || 
             (this.citPat_docType!=null &&
              this.citPat_docType.equals(other.getCitPat_docType()))) &&
            ((this.citPat_number==null && other.getCitPat_number()==null) || 
             (this.citPat_number!=null &&
              this.citPat_number.equals(other.getCitPat_number()))) &&
            ((this.citPat_dateIssue==null && other.getCitPat_dateIssue()==null) || 
             (this.citPat_dateIssue!=null &&
              this.citPat_dateIssue.equals(other.getCitPat_dateIssue()))) &&
            ((this.citPat_class==null && other.getCitPat_class()==null) || 
             (this.citPat_class!=null &&
              this.citPat_class.equals(other.getCitPat_class()))) &&
            ((this.citPat_appNumber==null && other.getCitPat_appNumber()==null) || 
             (this.citPat_appNumber!=null &&
              this.citPat_appNumber.equals(other.getCitPat_appNumber()))) &&
            ((this.citPat_appDate==null && other.getCitPat_appDate()==null) || 
             (this.citPat_appDate!=null &&
              this.citPat_appDate.equals(other.getCitPat_appDate()))) &&
            ((this.citPat_applicants==null && other.getCitPat_applicants()==null) || 
             (this.citPat_applicants!=null &&
              this.citPat_applicants.equals(other.getCitPat_applicants()))) &&
            ((this.citPat_assignees==null && other.getCitPat_assignees()==null) || 
             (this.citPat_assignees!=null &&
              this.citPat_assignees.equals(other.getCitPat_assignees()))) &&
            ((this.citPat_priority==null && other.getCitPat_priority()==null) || 
             (this.citPat_priority!=null &&
              this.citPat_priority.equals(other.getCitPat_priority()))) &&
            ((this.citPat_abstract==null && other.getCitPat_abstract()==null) || 
             (this.citPat_abstract!=null &&
              this.citPat_abstract.equals(other.getCitPat_abstract())));
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
        if (getCitPat_title() != null) {
            _hashCode += getCitPat_title().hashCode();
        }
        if (getCitPat_authors() != null) {
            _hashCode += getCitPat_authors().hashCode();
        }
        if (getCitPat_country() != null) {
            _hashCode += getCitPat_country().hashCode();
        }
        if (getCitPat_docType() != null) {
            _hashCode += getCitPat_docType().hashCode();
        }
        if (getCitPat_number() != null) {
            _hashCode += getCitPat_number().hashCode();
        }
        if (getCitPat_dateIssue() != null) {
            _hashCode += getCitPat_dateIssue().hashCode();
        }
        if (getCitPat_class() != null) {
            _hashCode += getCitPat_class().hashCode();
        }
        if (getCitPat_appNumber() != null) {
            _hashCode += getCitPat_appNumber().hashCode();
        }
        if (getCitPat_appDate() != null) {
            _hashCode += getCitPat_appDate().hashCode();
        }
        if (getCitPat_applicants() != null) {
            _hashCode += getCitPat_applicants().hashCode();
        }
        if (getCitPat_assignees() != null) {
            _hashCode += getCitPat_assignees().hashCode();
        }
        if (getCitPat_priority() != null) {
            _hashCode += getCitPat_priority().hashCode();
        }
        if (getCitPat_abstract() != null) {
            _hashCode += getCitPat_abstract().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CitPatType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-patType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat_authors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_authors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_authorsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat_country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat_docType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_doc-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat_dateIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_date-issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_date-issueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat_class");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_classType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat_appNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_app-number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat_appDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_app-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_app-dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat_applicants");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_applicants"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_applicantsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat_assignees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_assignees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_assigneesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat_priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_priorityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citPat_abstract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_abstract"));
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
