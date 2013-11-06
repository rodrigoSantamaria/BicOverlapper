/**
 * Article.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Article  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Front front;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Body body;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Back back;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubArticle[] subArticle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Response[] response;

    private java.lang.String articleType;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleDtdVersion dtdVersion;  // attribute

    public Article() {
    }

    public Article(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Front front,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Body body,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Back back,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubArticle[] subArticle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Response[] response,
           java.lang.String articleType,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleDtdVersion dtdVersion) {
           this.front = front;
           this.body = body;
           this.back = back;
           this.subArticle = subArticle;
           this.response = response;
           this.articleType = articleType;
           this.dtdVersion = dtdVersion;
    }


    /**
     * Gets the front value for this Article.
     * 
     * @return front
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Front getFront() {
        return front;
    }


    /**
     * Sets the front value for this Article.
     * 
     * @param front
     */
    public void setFront(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Front front) {
        this.front = front;
    }


    /**
     * Gets the body value for this Article.
     * 
     * @return body
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Body getBody() {
        return body;
    }


    /**
     * Sets the body value for this Article.
     * 
     * @param body
     */
    public void setBody(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Body body) {
        this.body = body;
    }


    /**
     * Gets the back value for this Article.
     * 
     * @return back
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Back getBack() {
        return back;
    }


    /**
     * Sets the back value for this Article.
     * 
     * @param back
     */
    public void setBack(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Back back) {
        this.back = back;
    }


    /**
     * Gets the subArticle value for this Article.
     * 
     * @return subArticle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubArticle[] getSubArticle() {
        return subArticle;
    }


    /**
     * Sets the subArticle value for this Article.
     * 
     * @param subArticle
     */
    public void setSubArticle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubArticle[] subArticle) {
        this.subArticle = subArticle;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubArticle getSubArticle(int i) {
        return this.subArticle[i];
    }

    public void setSubArticle(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubArticle _value) {
        this.subArticle[i] = _value;
    }


    /**
     * Gets the response value for this Article.
     * 
     * @return response
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Response[] getResponse() {
        return response;
    }


    /**
     * Sets the response value for this Article.
     * 
     * @param response
     */
    public void setResponse(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Response[] response) {
        this.response = response;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Response getResponse(int i) {
        return this.response[i];
    }

    public void setResponse(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Response _value) {
        this.response[i] = _value;
    }


    /**
     * Gets the articleType value for this Article.
     * 
     * @return articleType
     */
    public java.lang.String getArticleType() {
        return articleType;
    }


    /**
     * Sets the articleType value for this Article.
     * 
     * @param articleType
     */
    public void setArticleType(java.lang.String articleType) {
        this.articleType = articleType;
    }


    /**
     * Gets the dtdVersion value for this Article.
     * 
     * @return dtdVersion
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleDtdVersion getDtdVersion() {
        return dtdVersion;
    }


    /**
     * Sets the dtdVersion value for this Article.
     * 
     * @param dtdVersion
     */
    public void setDtdVersion(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleDtdVersion dtdVersion) {
        this.dtdVersion = dtdVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Article)) return false;
        Article other = (Article) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.front==null && other.getFront()==null) || 
             (this.front!=null &&
              this.front.equals(other.getFront()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.back==null && other.getBack()==null) || 
             (this.back!=null &&
              this.back.equals(other.getBack()))) &&
            ((this.subArticle==null && other.getSubArticle()==null) || 
             (this.subArticle!=null &&
              java.util.Arrays.equals(this.subArticle, other.getSubArticle()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              java.util.Arrays.equals(this.response, other.getResponse()))) &&
            ((this.articleType==null && other.getArticleType()==null) || 
             (this.articleType!=null &&
              this.articleType.equals(other.getArticleType()))) &&
            ((this.dtdVersion==null && other.getDtdVersion()==null) || 
             (this.dtdVersion!=null &&
              this.dtdVersion.equals(other.getDtdVersion())));
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
        if (getFront() != null) {
            _hashCode += getFront().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getBack() != null) {
            _hashCode += getBack().hashCode();
        }
        if (getSubArticle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubArticle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubArticle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArticleType() != null) {
            _hashCode += getArticleType().hashCode();
        }
        if (getDtdVersion() != null) {
            _hashCode += getDtdVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Article.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">article"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("articleType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "article-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dtdVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "dtd-version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>article>dtd-version"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("front");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "front"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">front"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">body"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("back");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "back"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">back"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subArticle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "sub-article"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "sub-article"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "response"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
