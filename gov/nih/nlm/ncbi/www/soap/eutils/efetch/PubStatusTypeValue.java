/**
 * PubStatusTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubStatusTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PubStatusTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _received = new org.apache.axis.types.NMToken("received");
    public static final org.apache.axis.types.NMToken _accepted = new org.apache.axis.types.NMToken("accepted");
    public static final org.apache.axis.types.NMToken _epublish = new org.apache.axis.types.NMToken("epublish");
    public static final org.apache.axis.types.NMToken _ppublish = new org.apache.axis.types.NMToken("ppublish");
    public static final org.apache.axis.types.NMToken _revised = new org.apache.axis.types.NMToken("revised");
    public static final org.apache.axis.types.NMToken _pmc = new org.apache.axis.types.NMToken("pmc");
    public static final org.apache.axis.types.NMToken _pmcr = new org.apache.axis.types.NMToken("pmcr");
    public static final org.apache.axis.types.NMToken _pubmed = new org.apache.axis.types.NMToken("pubmed");
    public static final org.apache.axis.types.NMToken _pubmedr = new org.apache.axis.types.NMToken("pubmedr");
    public static final org.apache.axis.types.NMToken _aheadofprint = new org.apache.axis.types.NMToken("aheadofprint");
    public static final org.apache.axis.types.NMToken _premedline = new org.apache.axis.types.NMToken("premedline");
    public static final org.apache.axis.types.NMToken _medline = new org.apache.axis.types.NMToken("medline");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final PubStatusTypeValue received = new PubStatusTypeValue(_received);
    public static final PubStatusTypeValue accepted = new PubStatusTypeValue(_accepted);
    public static final PubStatusTypeValue epublish = new PubStatusTypeValue(_epublish);
    public static final PubStatusTypeValue ppublish = new PubStatusTypeValue(_ppublish);
    public static final PubStatusTypeValue revised = new PubStatusTypeValue(_revised);
    public static final PubStatusTypeValue pmc = new PubStatusTypeValue(_pmc);
    public static final PubStatusTypeValue pmcr = new PubStatusTypeValue(_pmcr);
    public static final PubStatusTypeValue pubmed = new PubStatusTypeValue(_pubmed);
    public static final PubStatusTypeValue pubmedr = new PubStatusTypeValue(_pubmedr);
    public static final PubStatusTypeValue aheadofprint = new PubStatusTypeValue(_aheadofprint);
    public static final PubStatusTypeValue premedline = new PubStatusTypeValue(_premedline);
    public static final PubStatusTypeValue medline = new PubStatusTypeValue(_medline);
    public static final PubStatusTypeValue other = new PubStatusTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static PubStatusTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        PubStatusTypeValue enumeration = (PubStatusTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PubStatusTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PubStatusTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PubStatusType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
