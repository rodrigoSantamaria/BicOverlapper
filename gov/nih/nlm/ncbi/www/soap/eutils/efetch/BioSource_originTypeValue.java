/**
 * BioSource_originTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BioSource_originTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BioSource_originTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _unknown = new org.apache.axis.types.NMToken("unknown");
    public static final org.apache.axis.types.NMToken _natural = new org.apache.axis.types.NMToken("natural");
    public static final org.apache.axis.types.NMToken _natmut = new org.apache.axis.types.NMToken("natmut");
    public static final org.apache.axis.types.NMToken _mut = new org.apache.axis.types.NMToken("mut");
    public static final org.apache.axis.types.NMToken _artificial = new org.apache.axis.types.NMToken("artificial");
    public static final org.apache.axis.types.NMToken _synthetic = new org.apache.axis.types.NMToken("synthetic");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final BioSource_originTypeValue unknown = new BioSource_originTypeValue(_unknown);
    public static final BioSource_originTypeValue natural = new BioSource_originTypeValue(_natural);
    public static final BioSource_originTypeValue natmut = new BioSource_originTypeValue(_natmut);
    public static final BioSource_originTypeValue mut = new BioSource_originTypeValue(_mut);
    public static final BioSource_originTypeValue artificial = new BioSource_originTypeValue(_artificial);
    public static final BioSource_originTypeValue synthetic = new BioSource_originTypeValue(_synthetic);
    public static final BioSource_originTypeValue other = new BioSource_originTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static BioSource_originTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        BioSource_originTypeValue enumeration = (BioSource_originTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BioSource_originTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BioSource_originTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">BioSource_originType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
