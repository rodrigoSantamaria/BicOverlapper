/**
 * PubmedDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubmedDataType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.apache.axis.message.MessageElement [] _any;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HistoryType[] history;

    private java.lang.String publicationStatus;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleIdListType articleIdList;

    public PubmedDataType() {
    }

    public PubmedDataType(
           org.apache.axis.message.MessageElement [] _any,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HistoryType[] history,
           java.lang.String publicationStatus,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleIdListType articleIdList) {
           this._any = _any;
           this.history = history;
           this.publicationStatus = publicationStatus;
           this.articleIdList = articleIdList;
    }


    /**
     * Gets the _any value for this PubmedDataType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PubmedDataType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the history value for this PubmedDataType.
     * 
     * @return history
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HistoryType[] getHistory() {
        return history;
    }


    /**
     * Sets the history value for this PubmedDataType.
     * 
     * @param history
     */
    public void setHistory(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HistoryType[] history) {
        this.history = history;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HistoryType getHistory(int i) {
        return this.history[i];
    }

    public void setHistory(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.HistoryType _value) {
        this.history[i] = _value;
    }


    /**
     * Gets the publicationStatus value for this PubmedDataType.
     * 
     * @return publicationStatus
     */
    public java.lang.String getPublicationStatus() {
        return publicationStatus;
    }


    /**
     * Sets the publicationStatus value for this PubmedDataType.
     * 
     * @param publicationStatus
     */
    public void setPublicationStatus(java.lang.String publicationStatus) {
        this.publicationStatus = publicationStatus;
    }


    /**
     * Gets the articleIdList value for this PubmedDataType.
     * 
     * @return articleIdList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleIdListType getArticleIdList() {
        return articleIdList;
    }


    /**
     * Sets the articleIdList value for this PubmedDataType.
     * 
     * @param articleIdList
     */
    public void setArticleIdList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleIdListType articleIdList) {
        this.articleIdList = articleIdList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubmedDataType)) return false;
        PubmedDataType other = (PubmedDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any()))) &&
            ((this.history==null && other.getHistory()==null) || 
             (this.history!=null &&
              java.util.Arrays.equals(this.history, other.getHistory()))) &&
            ((this.publicationStatus==null && other.getPublicationStatus()==null) || 
             (this.publicationStatus!=null &&
              this.publicationStatus.equals(other.getPublicationStatus()))) &&
            ((this.articleIdList==null && other.getArticleIdList()==null) || 
             (this.articleIdList!=null &&
              this.articleIdList.equals(other.getArticleIdList())));
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
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPublicationStatus() != null) {
            _hashCode += getPublicationStatus().hashCode();
        }
        if (getArticleIdList() != null) {
            _hashCode += getArticleIdList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PubmedDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubmedDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "History"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HistoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PublicationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleIdListType"));
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
