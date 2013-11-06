/**
 * Cn3DBackboneTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DBackboneTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Cn3DBackboneTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _off = new org.apache.axis.types.NMToken("off");
    public static final org.apache.axis.types.NMToken _trace = new org.apache.axis.types.NMToken("trace");
    public static final org.apache.axis.types.NMToken _partial = new org.apache.axis.types.NMToken("partial");
    public static final org.apache.axis.types.NMToken _complete = new org.apache.axis.types.NMToken("complete");
    public static final Cn3DBackboneTypeTypeValue off = new Cn3DBackboneTypeTypeValue(_off);
    public static final Cn3DBackboneTypeTypeValue trace = new Cn3DBackboneTypeTypeValue(_trace);
    public static final Cn3DBackboneTypeTypeValue partial = new Cn3DBackboneTypeTypeValue(_partial);
    public static final Cn3DBackboneTypeTypeValue complete = new Cn3DBackboneTypeTypeValue(_complete);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Cn3DBackboneTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Cn3DBackboneTypeTypeValue enumeration = (Cn3DBackboneTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Cn3DBackboneTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Cn3DBackboneTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Cn3d-backbone-typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
