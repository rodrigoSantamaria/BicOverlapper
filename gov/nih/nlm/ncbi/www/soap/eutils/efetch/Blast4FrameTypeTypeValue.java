/**
 * Blast4FrameTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4FrameTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Blast4FrameTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _notset = new org.apache.axis.types.NMToken("notset");
    public static final org.apache.axis.types.NMToken _plus1 = new org.apache.axis.types.NMToken("plus1");
    public static final org.apache.axis.types.NMToken _plus2 = new org.apache.axis.types.NMToken("plus2");
    public static final org.apache.axis.types.NMToken _plus3 = new org.apache.axis.types.NMToken("plus3");
    public static final org.apache.axis.types.NMToken _minus1 = new org.apache.axis.types.NMToken("minus1");
    public static final org.apache.axis.types.NMToken _minus2 = new org.apache.axis.types.NMToken("minus2");
    public static final org.apache.axis.types.NMToken _minus3 = new org.apache.axis.types.NMToken("minus3");
    public static final Blast4FrameTypeTypeValue notset = new Blast4FrameTypeTypeValue(_notset);
    public static final Blast4FrameTypeTypeValue plus1 = new Blast4FrameTypeTypeValue(_plus1);
    public static final Blast4FrameTypeTypeValue plus2 = new Blast4FrameTypeTypeValue(_plus2);
    public static final Blast4FrameTypeTypeValue plus3 = new Blast4FrameTypeTypeValue(_plus3);
    public static final Blast4FrameTypeTypeValue minus1 = new Blast4FrameTypeTypeValue(_minus1);
    public static final Blast4FrameTypeTypeValue minus2 = new Blast4FrameTypeTypeValue(_minus2);
    public static final Blast4FrameTypeTypeValue minus3 = new Blast4FrameTypeTypeValue(_minus3);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Blast4FrameTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Blast4FrameTypeTypeValue enumeration = (Blast4FrameTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Blast4FrameTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Blast4FrameTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Blast4-frame-typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
