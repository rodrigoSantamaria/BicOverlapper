/**
 * IntFuzz_limTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class IntFuzz_limTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IntFuzz_limTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _unk = new org.apache.axis.types.NMToken("unk");
    public static final org.apache.axis.types.NMToken _gt = new org.apache.axis.types.NMToken("gt");
    public static final org.apache.axis.types.NMToken _lt = new org.apache.axis.types.NMToken("lt");
    public static final org.apache.axis.types.NMToken _tr = new org.apache.axis.types.NMToken("tr");
    public static final org.apache.axis.types.NMToken _tl = new org.apache.axis.types.NMToken("tl");
    public static final org.apache.axis.types.NMToken _circle = new org.apache.axis.types.NMToken("circle");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final IntFuzz_limTypeValue unk = new IntFuzz_limTypeValue(_unk);
    public static final IntFuzz_limTypeValue gt = new IntFuzz_limTypeValue(_gt);
    public static final IntFuzz_limTypeValue lt = new IntFuzz_limTypeValue(_lt);
    public static final IntFuzz_limTypeValue tr = new IntFuzz_limTypeValue(_tr);
    public static final IntFuzz_limTypeValue tl = new IntFuzz_limTypeValue(_tl);
    public static final IntFuzz_limTypeValue circle = new IntFuzz_limTypeValue(_circle);
    public static final IntFuzz_limTypeValue other = new IntFuzz_limTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static IntFuzz_limTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        IntFuzz_limTypeValue enumeration = (IntFuzz_limTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IntFuzz_limTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(IntFuzz_limTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Int-fuzz_limType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
