/**
 * TitleTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TitleTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TitleTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("not-set");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("name");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("tsub");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("trans");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("jta");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("iso-jta");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("ml-jta");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("coden");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("issn");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("abr");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("isbn");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("all");
    public static final TitleTypeTypeValue value1 = new TitleTypeTypeValue(_value1);
    public static final TitleTypeTypeValue value2 = new TitleTypeTypeValue(_value2);
    public static final TitleTypeTypeValue value3 = new TitleTypeTypeValue(_value3);
    public static final TitleTypeTypeValue value4 = new TitleTypeTypeValue(_value4);
    public static final TitleTypeTypeValue value5 = new TitleTypeTypeValue(_value5);
    public static final TitleTypeTypeValue value6 = new TitleTypeTypeValue(_value6);
    public static final TitleTypeTypeValue value7 = new TitleTypeTypeValue(_value7);
    public static final TitleTypeTypeValue value8 = new TitleTypeTypeValue(_value8);
    public static final TitleTypeTypeValue value9 = new TitleTypeTypeValue(_value9);
    public static final TitleTypeTypeValue value10 = new TitleTypeTypeValue(_value10);
    public static final TitleTypeTypeValue value11 = new TitleTypeTypeValue(_value11);
    public static final TitleTypeTypeValue value12 = new TitleTypeTypeValue(_value12);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static TitleTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        TitleTypeTypeValue enumeration = (TitleTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TitleTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TitleTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Title-typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
