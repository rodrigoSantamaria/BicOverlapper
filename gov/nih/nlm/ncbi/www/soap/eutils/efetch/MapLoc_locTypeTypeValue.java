/**
 * MapLoc_locTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MapLoc_locTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MapLoc_locTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("insertion");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("exact");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("deletion");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("range-ins");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("range-exact");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("range-del");
    public static final MapLoc_locTypeTypeValue value1 = new MapLoc_locTypeTypeValue(_value1);
    public static final MapLoc_locTypeTypeValue value2 = new MapLoc_locTypeTypeValue(_value2);
    public static final MapLoc_locTypeTypeValue value3 = new MapLoc_locTypeTypeValue(_value3);
    public static final MapLoc_locTypeTypeValue value4 = new MapLoc_locTypeTypeValue(_value4);
    public static final MapLoc_locTypeTypeValue value5 = new MapLoc_locTypeTypeValue(_value5);
    public static final MapLoc_locTypeTypeValue value6 = new MapLoc_locTypeTypeValue(_value6);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static MapLoc_locTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        MapLoc_locTypeTypeValue enumeration = (MapLoc_locTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MapLoc_locTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MapLoc_locTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">MapLoc_locTypeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
