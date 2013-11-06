/**
 * MolInfo_completenessTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MolInfo_completenessTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MolInfo_completenessTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("unknown");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("complete");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("partial");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("no-left");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("no-right");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("no-ends");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("has-left");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("has-right");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("other");
    public static final MolInfo_completenessTypeValue value1 = new MolInfo_completenessTypeValue(_value1);
    public static final MolInfo_completenessTypeValue value2 = new MolInfo_completenessTypeValue(_value2);
    public static final MolInfo_completenessTypeValue value3 = new MolInfo_completenessTypeValue(_value3);
    public static final MolInfo_completenessTypeValue value4 = new MolInfo_completenessTypeValue(_value4);
    public static final MolInfo_completenessTypeValue value5 = new MolInfo_completenessTypeValue(_value5);
    public static final MolInfo_completenessTypeValue value6 = new MolInfo_completenessTypeValue(_value6);
    public static final MolInfo_completenessTypeValue value7 = new MolInfo_completenessTypeValue(_value7);
    public static final MolInfo_completenessTypeValue value8 = new MolInfo_completenessTypeValue(_value8);
    public static final MolInfo_completenessTypeValue value9 = new MolInfo_completenessTypeValue(_value9);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static MolInfo_completenessTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        MolInfo_completenessTypeValue enumeration = (MolInfo_completenessTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MolInfo_completenessTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MolInfo_completenessTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">MolInfo_completenessType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
