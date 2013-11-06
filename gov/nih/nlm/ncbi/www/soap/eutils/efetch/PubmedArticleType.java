/**
 * PubmedArticleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubmedArticleType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NCBIArticleType NCBIArticle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationType medlineCitation;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedDataType pubmedData;

    public PubmedArticleType() {
    }

    public PubmedArticleType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NCBIArticleType NCBIArticle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationType medlineCitation,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedDataType pubmedData) {
           this.NCBIArticle = NCBIArticle;
           this.medlineCitation = medlineCitation;
           this.pubmedData = pubmedData;
    }


    /**
     * Gets the NCBIArticle value for this PubmedArticleType.
     * 
     * @return NCBIArticle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NCBIArticleType getNCBIArticle() {
        return NCBIArticle;
    }


    /**
     * Sets the NCBIArticle value for this PubmedArticleType.
     * 
     * @param NCBIArticle
     */
    public void setNCBIArticle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NCBIArticleType NCBIArticle) {
        this.NCBIArticle = NCBIArticle;
    }


    /**
     * Gets the medlineCitation value for this PubmedArticleType.
     * 
     * @return medlineCitation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationType getMedlineCitation() {
        return medlineCitation;
    }


    /**
     * Sets the medlineCitation value for this PubmedArticleType.
     * 
     * @param medlineCitation
     */
    public void setMedlineCitation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationType medlineCitation) {
        this.medlineCitation = medlineCitation;
    }


    /**
     * Gets the pubmedData value for this PubmedArticleType.
     * 
     * @return pubmedData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedDataType getPubmedData() {
        return pubmedData;
    }


    /**
     * Sets the pubmedData value for this PubmedArticleType.
     * 
     * @param pubmedData
     */
    public void setPubmedData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedDataType pubmedData) {
        this.pubmedData = pubmedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubmedArticleType)) return false;
        PubmedArticleType other = (PubmedArticleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NCBIArticle==null && other.getNCBIArticle()==null) || 
             (this.NCBIArticle!=null &&
              this.NCBIArticle.equals(other.getNCBIArticle()))) &&
            ((this.medlineCitation==null && other.getMedlineCitation()==null) || 
             (this.medlineCitation!=null &&
              this.medlineCitation.equals(other.getMedlineCitation()))) &&
            ((this.pubmedData==null && other.getPubmedData()==null) || 
             (this.pubmedData!=null &&
              this.pubmedData.equals(other.getPubmedData())));
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
        if (getNCBIArticle() != null) {
            _hashCode += getNCBIArticle().hashCode();
        }
        if (getMedlineCitation() != null) {
            _hashCode += getMedlineCitation().hashCode();
        }
        if (getPubmedData() != null) {
            _hashCode += getPubmedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PubmedArticleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubmedArticleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCBIArticle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NCBIArticle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NCBIArticleType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineCitation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MedlineCitation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MedlineCitationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubmedData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubmedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubmedDataType"));
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
