/**
 * PubMedPubDateTypePubStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubMedPubDateTypePubStatus implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PubMedPubDateTypePubStatus(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _received = new org.apache.axis.types.NMToken("received");
    public static final org.apache.axis.types.NMToken _accepted = new org.apache.axis.types.NMToken("accepted");
    public static final org.apache.axis.types.NMToken _epublish = new org.apache.axis.types.NMToken("epublish");
    public static final org.apache.axis.types.NMToken _ppublish = new org.apache.axis.types.NMToken("ppublish");
    public static final org.apache.axis.types.NMToken _revised = new org.apache.axis.types.NMToken("revised");
    public static final org.apache.axis.types.NMToken _aheadofprint = new org.apache.axis.types.NMToken("aheadofprint");
    public static final org.apache.axis.types.NMToken _retracted = new org.apache.axis.types.NMToken("retracted");
    public static final org.apache.axis.types.NMToken _pmc = new org.apache.axis.types.NMToken("pmc");
    public static final org.apache.axis.types.NMToken _pmcr = new org.apache.axis.types.NMToken("pmcr");
    public static final org.apache.axis.types.NMToken _pubmed = new org.apache.axis.types.NMToken("pubmed");
    public static final org.apache.axis.types.NMToken _pubmedr = new org.apache.axis.types.NMToken("pubmedr");
    public static final org.apache.axis.types.NMToken _premedline = new org.apache.axis.types.NMToken("premedline");
    public static final org.apache.axis.types.NMToken _medline = new org.apache.axis.types.NMToken("medline");
    public static final org.apache.axis.types.NMToken _medliner = new org.apache.axis.types.NMToken("medliner");
    public static final PubMedPubDateTypePubStatus received = new PubMedPubDateTypePubStatus(_received);
    public static final PubMedPubDateTypePubStatus accepted = new PubMedPubDateTypePubStatus(_accepted);
    public static final PubMedPubDateTypePubStatus epublish = new PubMedPubDateTypePubStatus(_epublish);
    public static final PubMedPubDateTypePubStatus ppublish = new PubMedPubDateTypePubStatus(_ppublish);
    public static final PubMedPubDateTypePubStatus revised = new PubMedPubDateTypePubStatus(_revised);
    public static final PubMedPubDateTypePubStatus aheadofprint = new PubMedPubDateTypePubStatus(_aheadofprint);
    public static final PubMedPubDateTypePubStatus retracted = new PubMedPubDateTypePubStatus(_retracted);
    public static final PubMedPubDateTypePubStatus pmc = new PubMedPubDateTypePubStatus(_pmc);
    public static final PubMedPubDateTypePubStatus pmcr = new PubMedPubDateTypePubStatus(_pmcr);
    public static final PubMedPubDateTypePubStatus pubmed = new PubMedPubDateTypePubStatus(_pubmed);
    public static final PubMedPubDateTypePubStatus pubmedr = new PubMedPubDateTypePubStatus(_pubmedr);
    public static final PubMedPubDateTypePubStatus premedline = new PubMedPubDateTypePubStatus(_premedline);
    public static final PubMedPubDateTypePubStatus medline = new PubMedPubDateTypePubStatus(_medline);
    public static final PubMedPubDateTypePubStatus medliner = new PubMedPubDateTypePubStatus(_medliner);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static PubMedPubDateTypePubStatus fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        PubMedPubDateTypePubStatus enumeration = (PubMedPubDateTypePubStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PubMedPubDateTypePubStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PubMedPubDateTypePubStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PubMedPubDateType>PubStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
