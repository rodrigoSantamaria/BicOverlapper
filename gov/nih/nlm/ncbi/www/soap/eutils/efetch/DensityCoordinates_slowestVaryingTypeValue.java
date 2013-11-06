/**
 * DensityCoordinates_slowestVaryingTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DensityCoordinates_slowestVaryingTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DensityCoordinates_slowestVaryingTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _x = new org.apache.axis.types.NMToken("x");
    public static final org.apache.axis.types.NMToken _y = new org.apache.axis.types.NMToken("y");
    public static final org.apache.axis.types.NMToken _z = new org.apache.axis.types.NMToken("z");
    public static final DensityCoordinates_slowestVaryingTypeValue x = new DensityCoordinates_slowestVaryingTypeValue(_x);
    public static final DensityCoordinates_slowestVaryingTypeValue y = new DensityCoordinates_slowestVaryingTypeValue(_y);
    public static final DensityCoordinates_slowestVaryingTypeValue z = new DensityCoordinates_slowestVaryingTypeValue(_z);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static DensityCoordinates_slowestVaryingTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        DensityCoordinates_slowestVaryingTypeValue enumeration = (DensityCoordinates_slowestVaryingTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DensityCoordinates_slowestVaryingTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DensityCoordinates_slowestVaryingTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Density-coordinates_slowest-varyingType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
