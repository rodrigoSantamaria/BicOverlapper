/**
 * PCCoordinateTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCCoordinateTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PCCoordinateTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("twod");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("threed");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("submitted");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("experimental");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("computed");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("standardized");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("augmented");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("aligned");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("compact");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("units-angstroms");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("units-nanometers");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("units-pixel");
    public static final org.apache.axis.types.NMToken _value13 = new org.apache.axis.types.NMToken("units-points");
    public static final org.apache.axis.types.NMToken _value14 = new org.apache.axis.types.NMToken("units-stdbonds");
    public static final org.apache.axis.types.NMToken _value15 = new org.apache.axis.types.NMToken("units-unknown");
    public static final PCCoordinateTypeTypeValue value1 = new PCCoordinateTypeTypeValue(_value1);
    public static final PCCoordinateTypeTypeValue value2 = new PCCoordinateTypeTypeValue(_value2);
    public static final PCCoordinateTypeTypeValue value3 = new PCCoordinateTypeTypeValue(_value3);
    public static final PCCoordinateTypeTypeValue value4 = new PCCoordinateTypeTypeValue(_value4);
    public static final PCCoordinateTypeTypeValue value5 = new PCCoordinateTypeTypeValue(_value5);
    public static final PCCoordinateTypeTypeValue value6 = new PCCoordinateTypeTypeValue(_value6);
    public static final PCCoordinateTypeTypeValue value7 = new PCCoordinateTypeTypeValue(_value7);
    public static final PCCoordinateTypeTypeValue value8 = new PCCoordinateTypeTypeValue(_value8);
    public static final PCCoordinateTypeTypeValue value9 = new PCCoordinateTypeTypeValue(_value9);
    public static final PCCoordinateTypeTypeValue value10 = new PCCoordinateTypeTypeValue(_value10);
    public static final PCCoordinateTypeTypeValue value11 = new PCCoordinateTypeTypeValue(_value11);
    public static final PCCoordinateTypeTypeValue value12 = new PCCoordinateTypeTypeValue(_value12);
    public static final PCCoordinateTypeTypeValue value13 = new PCCoordinateTypeTypeValue(_value13);
    public static final PCCoordinateTypeTypeValue value14 = new PCCoordinateTypeTypeValue(_value14);
    public static final PCCoordinateTypeTypeValue value15 = new PCCoordinateTypeTypeValue(_value15);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static PCCoordinateTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        PCCoordinateTypeTypeValue enumeration = (PCCoordinateTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PCCoordinateTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PCCoordinateTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PC-CoordinateTypeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
