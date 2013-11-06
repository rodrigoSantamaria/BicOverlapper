/**
 * BookType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BookType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubDateType pubDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherType publisher;

    private java.lang.String title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListType authorList;

    private java.lang.String collectionTitle;

    private java.lang.String volume;

    public BookType() {
    }

    public BookType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubDateType pubDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherType publisher,
           java.lang.String title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListType authorList,
           java.lang.String collectionTitle,
           java.lang.String volume) {
           this.pubDate = pubDate;
           this.publisher = publisher;
           this.title = title;
           this.authorList = authorList;
           this.collectionTitle = collectionTitle;
           this.volume = volume;
    }


    /**
     * Gets the pubDate value for this BookType.
     * 
     * @return pubDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubDateType getPubDate() {
        return pubDate;
    }


    /**
     * Sets the pubDate value for this BookType.
     * 
     * @param pubDate
     */
    public void setPubDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubDateType pubDate) {
        this.pubDate = pubDate;
    }


    /**
     * Gets the publisher value for this BookType.
     * 
     * @return publisher
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherType getPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this BookType.
     * 
     * @param publisher
     */
    public void setPublisher(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherType publisher) {
        this.publisher = publisher;
    }


    /**
     * Gets the title value for this BookType.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this BookType.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the authorList value for this BookType.
     * 
     * @return authorList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListType getAuthorList() {
        return authorList;
    }


    /**
     * Sets the authorList value for this BookType.
     * 
     * @param authorList
     */
    public void setAuthorList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorListType authorList) {
        this.authorList = authorList;
    }


    /**
     * Gets the collectionTitle value for this BookType.
     * 
     * @return collectionTitle
     */
    public java.lang.String getCollectionTitle() {
        return collectionTitle;
    }


    /**
     * Sets the collectionTitle value for this BookType.
     * 
     * @param collectionTitle
     */
    public void setCollectionTitle(java.lang.String collectionTitle) {
        this.collectionTitle = collectionTitle;
    }


    /**
     * Gets the volume value for this BookType.
     * 
     * @return volume
     */
    public java.lang.String getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this BookType.
     * 
     * @param volume
     */
    public void setVolume(java.lang.String volume) {
        this.volume = volume;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookType)) return false;
        BookType other = (BookType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pubDate==null && other.getPubDate()==null) || 
             (this.pubDate!=null &&
              this.pubDate.equals(other.getPubDate()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              this.publisher.equals(other.getPublisher()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.authorList==null && other.getAuthorList()==null) || 
             (this.authorList!=null &&
              this.authorList.equals(other.getAuthorList()))) &&
            ((this.collectionTitle==null && other.getCollectionTitle()==null) || 
             (this.collectionTitle!=null &&
              this.collectionTitle.equals(other.getCollectionTitle()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume())));
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
        if (getPubDate() != null) {
            _hashCode += getPubDate().hashCode();
        }
        if (getPublisher() != null) {
            _hashCode += getPublisher().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getAuthorList() != null) {
            _hashCode += getAuthorList().hashCode();
        }
        if (getCollectionTitle() != null) {
            _hashCode += getCollectionTitle().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BookType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubDateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Publisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PublisherType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AuthorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AuthorListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CollectionTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Volume"));
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
