/**
 * MimEntry_mimTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimEntry_mimTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MimEntry_mimTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _none = new org.apache.axis.types.NMToken("none");
    public static final org.apache.axis.types.NMToken _star = new org.apache.axis.types.NMToken("star");
    public static final org.apache.axis.types.NMToken _caret = new org.apache.axis.types.NMToken("caret");
    public static final org.apache.axis.types.NMToken _pound = new org.apache.axis.types.NMToken("pound");
    public static final org.apache.axis.types.NMToken _plus = new org.apache.axis.types.NMToken("plus");
    public static final org.apache.axis.types.NMToken _perc = new org.apache.axis.types.NMToken("perc");
    public static final MimEntry_mimTypeTypeValue none = new MimEntry_mimTypeTypeValue(_none);
    public static final MimEntry_mimTypeTypeValue star = new MimEntry_mimTypeTypeValue(_star);
    public static final MimEntry_mimTypeTypeValue caret = new MimEntry_mimTypeTypeValue(_caret);
    public static final MimEntry_mimTypeTypeValue pound = new MimEntry_mimTypeTypeValue(_pound);
    public static final MimEntry_mimTypeTypeValue plus = new MimEntry_mimTypeTypeValue(_plus);
    public static final MimEntry_mimTypeTypeValue perc = new MimEntry_mimTypeTypeValue(_perc);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static MimEntry_mimTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        MimEntry_mimTypeTypeValue enumeration = (MimEntry_mimTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MimEntry_mimTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MimEntry_mimTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Mim-entry_mimTypeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
