/**
 * SeqInst_reprTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqInst_reprTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SeqInst_reprTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("not-set");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("virtual");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("raw");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("seg");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("const");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("ref");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("consen");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("map");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("delta");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("other");
    public static final SeqInst_reprTypeValue value1 = new SeqInst_reprTypeValue(_value1);
    public static final SeqInst_reprTypeValue value2 = new SeqInst_reprTypeValue(_value2);
    public static final SeqInst_reprTypeValue value3 = new SeqInst_reprTypeValue(_value3);
    public static final SeqInst_reprTypeValue value4 = new SeqInst_reprTypeValue(_value4);
    public static final SeqInst_reprTypeValue value5 = new SeqInst_reprTypeValue(_value5);
    public static final SeqInst_reprTypeValue value6 = new SeqInst_reprTypeValue(_value6);
    public static final SeqInst_reprTypeValue value7 = new SeqInst_reprTypeValue(_value7);
    public static final SeqInst_reprTypeValue value8 = new SeqInst_reprTypeValue(_value8);
    public static final SeqInst_reprTypeValue value9 = new SeqInst_reprTypeValue(_value9);
    public static final SeqInst_reprTypeValue value10 = new SeqInst_reprTypeValue(_value10);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static SeqInst_reprTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        SeqInst_reprTypeValue enumeration = (SeqInst_reprTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SeqInst_reprTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SeqInst_reprTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Seq-inst_reprType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
