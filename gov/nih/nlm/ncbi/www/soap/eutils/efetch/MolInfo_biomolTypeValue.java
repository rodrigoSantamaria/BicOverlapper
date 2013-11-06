/**
 * MolInfo_biomolTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MolInfo_biomolTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MolInfo_biomolTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("unknown");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("genomic");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("pre-RNA");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("mRNA");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("rRNA");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("tRNA");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("snRNA");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("scRNA");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("peptide");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("other-genetic");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("genomic-mRNA");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("cRNA");
    public static final org.apache.axis.types.NMToken _value13 = new org.apache.axis.types.NMToken("snoRNA");
    public static final org.apache.axis.types.NMToken _value14 = new org.apache.axis.types.NMToken("transcribed-RNA");
    public static final org.apache.axis.types.NMToken _value15 = new org.apache.axis.types.NMToken("other");
    public static final MolInfo_biomolTypeValue value1 = new MolInfo_biomolTypeValue(_value1);
    public static final MolInfo_biomolTypeValue value2 = new MolInfo_biomolTypeValue(_value2);
    public static final MolInfo_biomolTypeValue value3 = new MolInfo_biomolTypeValue(_value3);
    public static final MolInfo_biomolTypeValue value4 = new MolInfo_biomolTypeValue(_value4);
    public static final MolInfo_biomolTypeValue value5 = new MolInfo_biomolTypeValue(_value5);
    public static final MolInfo_biomolTypeValue value6 = new MolInfo_biomolTypeValue(_value6);
    public static final MolInfo_biomolTypeValue value7 = new MolInfo_biomolTypeValue(_value7);
    public static final MolInfo_biomolTypeValue value8 = new MolInfo_biomolTypeValue(_value8);
    public static final MolInfo_biomolTypeValue value9 = new MolInfo_biomolTypeValue(_value9);
    public static final MolInfo_biomolTypeValue value10 = new MolInfo_biomolTypeValue(_value10);
    public static final MolInfo_biomolTypeValue value11 = new MolInfo_biomolTypeValue(_value11);
    public static final MolInfo_biomolTypeValue value12 = new MolInfo_biomolTypeValue(_value12);
    public static final MolInfo_biomolTypeValue value13 = new MolInfo_biomolTypeValue(_value13);
    public static final MolInfo_biomolTypeValue value14 = new MolInfo_biomolTypeValue(_value14);
    public static final MolInfo_biomolTypeValue value15 = new MolInfo_biomolTypeValue(_value15);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static MolInfo_biomolTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        MolInfo_biomolTypeValue enumeration = (MolInfo_biomolTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MolInfo_biomolTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MolInfo_biomolTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">MolInfo_biomolType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
