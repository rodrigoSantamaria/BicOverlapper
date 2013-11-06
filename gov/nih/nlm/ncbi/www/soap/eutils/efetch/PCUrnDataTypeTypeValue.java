/**
 * PCUrnDataTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCUrnDataTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PCUrnDataTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("string");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("stringlist");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("int");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("intvec");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("uint");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("uintvec");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("double");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("doublevec");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("bool");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("boolvec");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("uint64");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("binary");
    public static final org.apache.axis.types.NMToken _value13 = new org.apache.axis.types.NMToken("url");
    public static final org.apache.axis.types.NMToken _value14 = new org.apache.axis.types.NMToken("unicode");
    public static final org.apache.axis.types.NMToken _value15 = new org.apache.axis.types.NMToken("date");
    public static final org.apache.axis.types.NMToken _value16 = new org.apache.axis.types.NMToken("fingerprint");
    public static final org.apache.axis.types.NMToken _value17 = new org.apache.axis.types.NMToken("unknown");
    public static final PCUrnDataTypeTypeValue value1 = new PCUrnDataTypeTypeValue(_value1);
    public static final PCUrnDataTypeTypeValue value2 = new PCUrnDataTypeTypeValue(_value2);
    public static final PCUrnDataTypeTypeValue value3 = new PCUrnDataTypeTypeValue(_value3);
    public static final PCUrnDataTypeTypeValue value4 = new PCUrnDataTypeTypeValue(_value4);
    public static final PCUrnDataTypeTypeValue value5 = new PCUrnDataTypeTypeValue(_value5);
    public static final PCUrnDataTypeTypeValue value6 = new PCUrnDataTypeTypeValue(_value6);
    public static final PCUrnDataTypeTypeValue value7 = new PCUrnDataTypeTypeValue(_value7);
    public static final PCUrnDataTypeTypeValue value8 = new PCUrnDataTypeTypeValue(_value8);
    public static final PCUrnDataTypeTypeValue value9 = new PCUrnDataTypeTypeValue(_value9);
    public static final PCUrnDataTypeTypeValue value10 = new PCUrnDataTypeTypeValue(_value10);
    public static final PCUrnDataTypeTypeValue value11 = new PCUrnDataTypeTypeValue(_value11);
    public static final PCUrnDataTypeTypeValue value12 = new PCUrnDataTypeTypeValue(_value12);
    public static final PCUrnDataTypeTypeValue value13 = new PCUrnDataTypeTypeValue(_value13);
    public static final PCUrnDataTypeTypeValue value14 = new PCUrnDataTypeTypeValue(_value14);
    public static final PCUrnDataTypeTypeValue value15 = new PCUrnDataTypeTypeValue(_value15);
    public static final PCUrnDataTypeTypeValue value16 = new PCUrnDataTypeTypeValue(_value16);
    public static final PCUrnDataTypeTypeValue value17 = new PCUrnDataTypeTypeValue(_value17);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static PCUrnDataTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        PCUrnDataTypeTypeValue enumeration = (PCUrnDataTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PCUrnDataTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PCUrnDataTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PC-UrnDataTypeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
