/**
 * EMBLDbname_codeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EMBLDbname_codeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EMBLDbname_codeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _embl = new org.apache.axis.types.NMToken("embl");
    public static final org.apache.axis.types.NMToken _genbank = new org.apache.axis.types.NMToken("genbank");
    public static final org.apache.axis.types.NMToken _ddbj = new org.apache.axis.types.NMToken("ddbj");
    public static final org.apache.axis.types.NMToken _geninfo = new org.apache.axis.types.NMToken("geninfo");
    public static final org.apache.axis.types.NMToken _medline = new org.apache.axis.types.NMToken("medline");
    public static final org.apache.axis.types.NMToken _swissprot = new org.apache.axis.types.NMToken("swissprot");
    public static final org.apache.axis.types.NMToken _pir = new org.apache.axis.types.NMToken("pir");
    public static final org.apache.axis.types.NMToken _pdb = new org.apache.axis.types.NMToken("pdb");
    public static final org.apache.axis.types.NMToken _epd = new org.apache.axis.types.NMToken("epd");
    public static final org.apache.axis.types.NMToken _ecd = new org.apache.axis.types.NMToken("ecd");
    public static final org.apache.axis.types.NMToken _tfd = new org.apache.axis.types.NMToken("tfd");
    public static final org.apache.axis.types.NMToken _flybase = new org.apache.axis.types.NMToken("flybase");
    public static final org.apache.axis.types.NMToken _prosite = new org.apache.axis.types.NMToken("prosite");
    public static final org.apache.axis.types.NMToken _enzyme = new org.apache.axis.types.NMToken("enzyme");
    public static final org.apache.axis.types.NMToken _mim = new org.apache.axis.types.NMToken("mim");
    public static final org.apache.axis.types.NMToken _ecoseq = new org.apache.axis.types.NMToken("ecoseq");
    public static final org.apache.axis.types.NMToken _hiv = new org.apache.axis.types.NMToken("hiv");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final EMBLDbname_codeTypeValue embl = new EMBLDbname_codeTypeValue(_embl);
    public static final EMBLDbname_codeTypeValue genbank = new EMBLDbname_codeTypeValue(_genbank);
    public static final EMBLDbname_codeTypeValue ddbj = new EMBLDbname_codeTypeValue(_ddbj);
    public static final EMBLDbname_codeTypeValue geninfo = new EMBLDbname_codeTypeValue(_geninfo);
    public static final EMBLDbname_codeTypeValue medline = new EMBLDbname_codeTypeValue(_medline);
    public static final EMBLDbname_codeTypeValue swissprot = new EMBLDbname_codeTypeValue(_swissprot);
    public static final EMBLDbname_codeTypeValue pir = new EMBLDbname_codeTypeValue(_pir);
    public static final EMBLDbname_codeTypeValue pdb = new EMBLDbname_codeTypeValue(_pdb);
    public static final EMBLDbname_codeTypeValue epd = new EMBLDbname_codeTypeValue(_epd);
    public static final EMBLDbname_codeTypeValue ecd = new EMBLDbname_codeTypeValue(_ecd);
    public static final EMBLDbname_codeTypeValue tfd = new EMBLDbname_codeTypeValue(_tfd);
    public static final EMBLDbname_codeTypeValue flybase = new EMBLDbname_codeTypeValue(_flybase);
    public static final EMBLDbname_codeTypeValue prosite = new EMBLDbname_codeTypeValue(_prosite);
    public static final EMBLDbname_codeTypeValue enzyme = new EMBLDbname_codeTypeValue(_enzyme);
    public static final EMBLDbname_codeTypeValue mim = new EMBLDbname_codeTypeValue(_mim);
    public static final EMBLDbname_codeTypeValue ecoseq = new EMBLDbname_codeTypeValue(_ecoseq);
    public static final EMBLDbname_codeTypeValue hiv = new EMBLDbname_codeTypeValue(_hiv);
    public static final EMBLDbname_codeTypeValue other = new EMBLDbname_codeTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static EMBLDbname_codeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        EMBLDbname_codeTypeValue enumeration = (EMBLDbname_codeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EMBLDbname_codeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EMBLDbname_codeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">EMBL-dbname_codeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
