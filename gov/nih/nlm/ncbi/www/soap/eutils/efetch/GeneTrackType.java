/**
 * GeneTrackType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GeneTrackType  implements java.io.Serializable {
    private java.lang.String geneTrack_geneid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_statusType geneTrack_status;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_currentIdType geneTrack_currentId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_createDateType geneTrack_createDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_updateDateType geneTrack_updateDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_discontinueDateType geneTrack_discontinueDate;

    public GeneTrackType() {
    }

    public GeneTrackType(
           java.lang.String geneTrack_geneid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_statusType geneTrack_status,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_currentIdType geneTrack_currentId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_createDateType geneTrack_createDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_updateDateType geneTrack_updateDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_discontinueDateType geneTrack_discontinueDate) {
           this.geneTrack_geneid = geneTrack_geneid;
           this.geneTrack_status = geneTrack_status;
           this.geneTrack_currentId = geneTrack_currentId;
           this.geneTrack_createDate = geneTrack_createDate;
           this.geneTrack_updateDate = geneTrack_updateDate;
           this.geneTrack_discontinueDate = geneTrack_discontinueDate;
    }


    /**
     * Gets the geneTrack_geneid value for this GeneTrackType.
     * 
     * @return geneTrack_geneid
     */
    public java.lang.String getGeneTrack_geneid() {
        return geneTrack_geneid;
    }


    /**
     * Sets the geneTrack_geneid value for this GeneTrackType.
     * 
     * @param geneTrack_geneid
     */
    public void setGeneTrack_geneid(java.lang.String geneTrack_geneid) {
        this.geneTrack_geneid = geneTrack_geneid;
    }


    /**
     * Gets the geneTrack_status value for this GeneTrackType.
     * 
     * @return geneTrack_status
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_statusType getGeneTrack_status() {
        return geneTrack_status;
    }


    /**
     * Sets the geneTrack_status value for this GeneTrackType.
     * 
     * @param geneTrack_status
     */
    public void setGeneTrack_status(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_statusType geneTrack_status) {
        this.geneTrack_status = geneTrack_status;
    }


    /**
     * Gets the geneTrack_currentId value for this GeneTrackType.
     * 
     * @return geneTrack_currentId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_currentIdType getGeneTrack_currentId() {
        return geneTrack_currentId;
    }


    /**
     * Sets the geneTrack_currentId value for this GeneTrackType.
     * 
     * @param geneTrack_currentId
     */
    public void setGeneTrack_currentId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_currentIdType geneTrack_currentId) {
        this.geneTrack_currentId = geneTrack_currentId;
    }


    /**
     * Gets the geneTrack_createDate value for this GeneTrackType.
     * 
     * @return geneTrack_createDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_createDateType getGeneTrack_createDate() {
        return geneTrack_createDate;
    }


    /**
     * Sets the geneTrack_createDate value for this GeneTrackType.
     * 
     * @param geneTrack_createDate
     */
    public void setGeneTrack_createDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_createDateType geneTrack_createDate) {
        this.geneTrack_createDate = geneTrack_createDate;
    }


    /**
     * Gets the geneTrack_updateDate value for this GeneTrackType.
     * 
     * @return geneTrack_updateDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_updateDateType getGeneTrack_updateDate() {
        return geneTrack_updateDate;
    }


    /**
     * Sets the geneTrack_updateDate value for this GeneTrackType.
     * 
     * @param geneTrack_updateDate
     */
    public void setGeneTrack_updateDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_updateDateType geneTrack_updateDate) {
        this.geneTrack_updateDate = geneTrack_updateDate;
    }


    /**
     * Gets the geneTrack_discontinueDate value for this GeneTrackType.
     * 
     * @return geneTrack_discontinueDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_discontinueDateType getGeneTrack_discontinueDate() {
        return geneTrack_discontinueDate;
    }


    /**
     * Sets the geneTrack_discontinueDate value for this GeneTrackType.
     * 
     * @param geneTrack_discontinueDate
     */
    public void setGeneTrack_discontinueDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GeneTrack_discontinueDateType geneTrack_discontinueDate) {
        this.geneTrack_discontinueDate = geneTrack_discontinueDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneTrackType)) return false;
        GeneTrackType other = (GeneTrackType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geneTrack_geneid==null && other.getGeneTrack_geneid()==null) || 
             (this.geneTrack_geneid!=null &&
              this.geneTrack_geneid.equals(other.getGeneTrack_geneid()))) &&
            ((this.geneTrack_status==null && other.getGeneTrack_status()==null) || 
             (this.geneTrack_status!=null &&
              this.geneTrack_status.equals(other.getGeneTrack_status()))) &&
            ((this.geneTrack_currentId==null && other.getGeneTrack_currentId()==null) || 
             (this.geneTrack_currentId!=null &&
              this.geneTrack_currentId.equals(other.getGeneTrack_currentId()))) &&
            ((this.geneTrack_createDate==null && other.getGeneTrack_createDate()==null) || 
             (this.geneTrack_createDate!=null &&
              this.geneTrack_createDate.equals(other.getGeneTrack_createDate()))) &&
            ((this.geneTrack_updateDate==null && other.getGeneTrack_updateDate()==null) || 
             (this.geneTrack_updateDate!=null &&
              this.geneTrack_updateDate.equals(other.getGeneTrack_updateDate()))) &&
            ((this.geneTrack_discontinueDate==null && other.getGeneTrack_discontinueDate()==null) || 
             (this.geneTrack_discontinueDate!=null &&
              this.geneTrack_discontinueDate.equals(other.getGeneTrack_discontinueDate())));
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
        if (getGeneTrack_geneid() != null) {
            _hashCode += getGeneTrack_geneid().hashCode();
        }
        if (getGeneTrack_status() != null) {
            _hashCode += getGeneTrack_status().hashCode();
        }
        if (getGeneTrack_currentId() != null) {
            _hashCode += getGeneTrack_currentId().hashCode();
        }
        if (getGeneTrack_createDate() != null) {
            _hashCode += getGeneTrack_createDate().hashCode();
        }
        if (getGeneTrack_updateDate() != null) {
            _hashCode += getGeneTrack_updateDate().hashCode();
        }
        if (getGeneTrack_discontinueDate() != null) {
            _hashCode += getGeneTrack_discontinueDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneTrackType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-trackType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneTrack_geneid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-track_geneid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneTrack_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-track_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-track_statusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneTrack_currentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-track_current-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-track_current-idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneTrack_createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-track_create-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-track_create-dateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneTrack_updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-track_update-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-track_update-dateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geneTrack_discontinueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-track_discontinue-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Gene-track_discontinue-dateType"));
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
