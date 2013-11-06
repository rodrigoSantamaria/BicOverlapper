/**
 * ID2Error_severityTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Error_severityTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ID2Error_severityTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("warning");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("failed-command");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("failed-connection");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("failed-server");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("no-data");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("restricted-data");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("unsupported-command");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("invalid-arguments");
    public static final ID2Error_severityTypeValue value1 = new ID2Error_severityTypeValue(_value1);
    public static final ID2Error_severityTypeValue value2 = new ID2Error_severityTypeValue(_value2);
    public static final ID2Error_severityTypeValue value3 = new ID2Error_severityTypeValue(_value3);
    public static final ID2Error_severityTypeValue value4 = new ID2Error_severityTypeValue(_value4);
    public static final ID2Error_severityTypeValue value5 = new ID2Error_severityTypeValue(_value5);
    public static final ID2Error_severityTypeValue value6 = new ID2Error_severityTypeValue(_value6);
    public static final ID2Error_severityTypeValue value7 = new ID2Error_severityTypeValue(_value7);
    public static final ID2Error_severityTypeValue value8 = new ID2Error_severityTypeValue(_value8);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static ID2Error_severityTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        ID2Error_severityTypeValue enumeration = (ID2Error_severityTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ID2Error_severityTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ID2Error_severityTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2-Error_severityType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
