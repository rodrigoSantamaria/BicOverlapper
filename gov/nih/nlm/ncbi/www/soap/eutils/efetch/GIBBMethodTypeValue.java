/**
 * GIBBMethodTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GIBBMethodTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GIBBMethodTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("concept-trans");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("seq-pept");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("both");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("seq-pept-overlap");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("seq-pept-homol");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("concept-trans-a");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("other");
    public static final GIBBMethodTypeValue value1 = new GIBBMethodTypeValue(_value1);
    public static final GIBBMethodTypeValue value2 = new GIBBMethodTypeValue(_value2);
    public static final GIBBMethodTypeValue value3 = new GIBBMethodTypeValue(_value3);
    public static final GIBBMethodTypeValue value4 = new GIBBMethodTypeValue(_value4);
    public static final GIBBMethodTypeValue value5 = new GIBBMethodTypeValue(_value5);
    public static final GIBBMethodTypeValue value6 = new GIBBMethodTypeValue(_value6);
    public static final GIBBMethodTypeValue value7 = new GIBBMethodTypeValue(_value7);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static GIBBMethodTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        GIBBMethodTypeValue enumeration = (GIBBMethodTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GIBBMethodTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GIBBMethodTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">GIBB-methodType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
