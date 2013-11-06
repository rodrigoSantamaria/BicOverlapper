/**
 * SeqAnnot_dbTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqAnnot_dbTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SeqAnnot_dbTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _genbank = new org.apache.axis.types.NMToken("genbank");
    public static final org.apache.axis.types.NMToken _embl = new org.apache.axis.types.NMToken("embl");
    public static final org.apache.axis.types.NMToken _ddbj = new org.apache.axis.types.NMToken("ddbj");
    public static final org.apache.axis.types.NMToken _pir = new org.apache.axis.types.NMToken("pir");
    public static final org.apache.axis.types.NMToken _sp = new org.apache.axis.types.NMToken("sp");
    public static final org.apache.axis.types.NMToken _bbone = new org.apache.axis.types.NMToken("bbone");
    public static final org.apache.axis.types.NMToken _pdb = new org.apache.axis.types.NMToken("pdb");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final SeqAnnot_dbTypeValue genbank = new SeqAnnot_dbTypeValue(_genbank);
    public static final SeqAnnot_dbTypeValue embl = new SeqAnnot_dbTypeValue(_embl);
    public static final SeqAnnot_dbTypeValue ddbj = new SeqAnnot_dbTypeValue(_ddbj);
    public static final SeqAnnot_dbTypeValue pir = new SeqAnnot_dbTypeValue(_pir);
    public static final SeqAnnot_dbTypeValue sp = new SeqAnnot_dbTypeValue(_sp);
    public static final SeqAnnot_dbTypeValue bbone = new SeqAnnot_dbTypeValue(_bbone);
    public static final SeqAnnot_dbTypeValue pdb = new SeqAnnot_dbTypeValue(_pdb);
    public static final SeqAnnot_dbTypeValue other = new SeqAnnot_dbTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static SeqAnnot_dbTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        SeqAnnot_dbTypeValue enumeration = (SeqAnnot_dbTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SeqAnnot_dbTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SeqAnnot_dbTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Seq-annot_dbType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
