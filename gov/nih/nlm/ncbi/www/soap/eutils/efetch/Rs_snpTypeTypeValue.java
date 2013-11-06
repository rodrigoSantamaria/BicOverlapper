/**
 * Rs_snpTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Rs_snpTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Rs_snpTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("notwithdrawn");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("artifact");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("gene-duplication");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("duplicate-submission");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("notspecified");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("ambiguous-location");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("low-map-quality");
    public static final Rs_snpTypeTypeValue value1 = new Rs_snpTypeTypeValue(_value1);
    public static final Rs_snpTypeTypeValue value2 = new Rs_snpTypeTypeValue(_value2);
    public static final Rs_snpTypeTypeValue value3 = new Rs_snpTypeTypeValue(_value3);
    public static final Rs_snpTypeTypeValue value4 = new Rs_snpTypeTypeValue(_value4);
    public static final Rs_snpTypeTypeValue value5 = new Rs_snpTypeTypeValue(_value5);
    public static final Rs_snpTypeTypeValue value6 = new Rs_snpTypeTypeValue(_value6);
    public static final Rs_snpTypeTypeValue value7 = new Rs_snpTypeTypeValue(_value7);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Rs_snpTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Rs_snpTypeTypeValue enumeration = (Rs_snpTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Rs_snpTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Rs_snpTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Rs_snpTypeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
