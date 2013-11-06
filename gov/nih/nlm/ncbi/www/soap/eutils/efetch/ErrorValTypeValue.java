/**
 * ErrorValTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ErrorValTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ErrorValTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("not-found");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("operational-error");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("cannot-connect-jrsrv");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("cannot-connect-pmdb");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("journal-not-found");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("citation-not-found");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("citation-ambiguous");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("citation-too-many");
    public static final ErrorValTypeValue value1 = new ErrorValTypeValue(_value1);
    public static final ErrorValTypeValue value2 = new ErrorValTypeValue(_value2);
    public static final ErrorValTypeValue value3 = new ErrorValTypeValue(_value3);
    public static final ErrorValTypeValue value4 = new ErrorValTypeValue(_value4);
    public static final ErrorValTypeValue value5 = new ErrorValTypeValue(_value5);
    public static final ErrorValTypeValue value6 = new ErrorValTypeValue(_value6);
    public static final ErrorValTypeValue value7 = new ErrorValTypeValue(_value7);
    public static final ErrorValTypeValue value8 = new ErrorValTypeValue(_value8);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static ErrorValTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        ErrorValTypeValue enumeration = (ErrorValTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ErrorValTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ErrorValTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Error-valType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
