/**
 * ArticleIdType_pubmedIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ArticleIdType_pubmedIdType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ArticleIdType_pubmedIdType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _doi = new org.apache.axis.types.NMToken("doi");
    public static final org.apache.axis.types.NMToken _pii = new org.apache.axis.types.NMToken("pii");
    public static final org.apache.axis.types.NMToken _pmcpid = new org.apache.axis.types.NMToken("pmcpid");
    public static final org.apache.axis.types.NMToken _pmpid = new org.apache.axis.types.NMToken("pmpid");
    public static final org.apache.axis.types.NMToken _sici = new org.apache.axis.types.NMToken("sici");
    public static final org.apache.axis.types.NMToken _pubmed = new org.apache.axis.types.NMToken("pubmed");
    public static final org.apache.axis.types.NMToken _medline = new org.apache.axis.types.NMToken("medline");
    public static final org.apache.axis.types.NMToken _pmcid = new org.apache.axis.types.NMToken("pmcid");
    public static final ArticleIdType_pubmedIdType doi = new ArticleIdType_pubmedIdType(_doi);
    public static final ArticleIdType_pubmedIdType pii = new ArticleIdType_pubmedIdType(_pii);
    public static final ArticleIdType_pubmedIdType pmcpid = new ArticleIdType_pubmedIdType(_pmcpid);
    public static final ArticleIdType_pubmedIdType pmpid = new ArticleIdType_pubmedIdType(_pmpid);
    public static final ArticleIdType_pubmedIdType sici = new ArticleIdType_pubmedIdType(_sici);
    public static final ArticleIdType_pubmedIdType pubmed = new ArticleIdType_pubmedIdType(_pubmed);
    public static final ArticleIdType_pubmedIdType medline = new ArticleIdType_pubmedIdType(_medline);
    public static final ArticleIdType_pubmedIdType pmcid = new ArticleIdType_pubmedIdType(_pmcid);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static ArticleIdType_pubmedIdType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        ArticleIdType_pubmedIdType enumeration = (ArticleIdType_pubmedIdType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ArticleIdType_pubmedIdType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.NMToken(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleIdType_pubmedIdType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ArticleIdType_pubmed>IdType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
