/**
 * RNARef_typeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RNARef_typeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RNARef_typeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _unknown = new org.apache.axis.types.NMToken("unknown");
    public static final org.apache.axis.types.NMToken _premsg = new org.apache.axis.types.NMToken("premsg");
    public static final org.apache.axis.types.NMToken _mRNA = new org.apache.axis.types.NMToken("mRNA");
    public static final org.apache.axis.types.NMToken _tRNA = new org.apache.axis.types.NMToken("tRNA");
    public static final org.apache.axis.types.NMToken _rRNA = new org.apache.axis.types.NMToken("rRNA");
    public static final org.apache.axis.types.NMToken _snRNA = new org.apache.axis.types.NMToken("snRNA");
    public static final org.apache.axis.types.NMToken _scRNA = new org.apache.axis.types.NMToken("scRNA");
    public static final org.apache.axis.types.NMToken _snoRNA = new org.apache.axis.types.NMToken("snoRNA");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final RNARef_typeTypeValue unknown = new RNARef_typeTypeValue(_unknown);
    public static final RNARef_typeTypeValue premsg = new RNARef_typeTypeValue(_premsg);
    public static final RNARef_typeTypeValue mRNA = new RNARef_typeTypeValue(_mRNA);
    public static final RNARef_typeTypeValue tRNA = new RNARef_typeTypeValue(_tRNA);
    public static final RNARef_typeTypeValue rRNA = new RNARef_typeTypeValue(_rRNA);
    public static final RNARef_typeTypeValue snRNA = new RNARef_typeTypeValue(_snRNA);
    public static final RNARef_typeTypeValue scRNA = new RNARef_typeTypeValue(_scRNA);
    public static final RNARef_typeTypeValue snoRNA = new RNARef_typeTypeValue(_snoRNA);
    public static final RNARef_typeTypeValue other = new RNARef_typeTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static RNARef_typeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        RNARef_typeTypeValue enumeration = (RNARef_typeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RNARef_typeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RNARef_typeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">RNA-ref_typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
