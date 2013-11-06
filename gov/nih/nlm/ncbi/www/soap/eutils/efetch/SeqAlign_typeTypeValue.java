/**
 * SeqAlign_typeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqAlign_typeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SeqAlign_typeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("not-set");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("global");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("diags");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("partial");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("disc");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("other");
    public static final SeqAlign_typeTypeValue value1 = new SeqAlign_typeTypeValue(_value1);
    public static final SeqAlign_typeTypeValue value2 = new SeqAlign_typeTypeValue(_value2);
    public static final SeqAlign_typeTypeValue value3 = new SeqAlign_typeTypeValue(_value3);
    public static final SeqAlign_typeTypeValue value4 = new SeqAlign_typeTypeValue(_value4);
    public static final SeqAlign_typeTypeValue value5 = new SeqAlign_typeTypeValue(_value5);
    public static final SeqAlign_typeTypeValue value6 = new SeqAlign_typeTypeValue(_value6);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static SeqAlign_typeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        SeqAlign_typeTypeValue enumeration = (SeqAlign_typeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SeqAlign_typeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SeqAlign_typeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Seq-align_typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
