/**
 * FxnSet_fxnClassTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class FxnSet_fxnClassTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FxnSet_fxnClassTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("locus-region");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("coding-unknown");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("coding-synonymous");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("coding-nonsynonymous");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("mrna-utr");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("intron");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("splice-site");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("reference");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("coding-exception");
    public static final FxnSet_fxnClassTypeValue value1 = new FxnSet_fxnClassTypeValue(_value1);
    public static final FxnSet_fxnClassTypeValue value2 = new FxnSet_fxnClassTypeValue(_value2);
    public static final FxnSet_fxnClassTypeValue value3 = new FxnSet_fxnClassTypeValue(_value3);
    public static final FxnSet_fxnClassTypeValue value4 = new FxnSet_fxnClassTypeValue(_value4);
    public static final FxnSet_fxnClassTypeValue value5 = new FxnSet_fxnClassTypeValue(_value5);
    public static final FxnSet_fxnClassTypeValue value6 = new FxnSet_fxnClassTypeValue(_value6);
    public static final FxnSet_fxnClassTypeValue value7 = new FxnSet_fxnClassTypeValue(_value7);
    public static final FxnSet_fxnClassTypeValue value8 = new FxnSet_fxnClassTypeValue(_value8);
    public static final FxnSet_fxnClassTypeValue value9 = new FxnSet_fxnClassTypeValue(_value9);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static FxnSet_fxnClassTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        FxnSet_fxnClassTypeValue enumeration = (FxnSet_fxnClassTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FxnSet_fxnClassTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FxnSet_fxnClassTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">FxnSet_fxnClassType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
