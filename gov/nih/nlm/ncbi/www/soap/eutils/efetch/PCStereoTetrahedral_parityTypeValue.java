/**
 * PCStereoTetrahedral_parityTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCStereoTetrahedral_parityTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PCStereoTetrahedral_parityTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _clockwise = new org.apache.axis.types.NMToken("clockwise");
    public static final org.apache.axis.types.NMToken _counterclockwise = new org.apache.axis.types.NMToken("counterclockwise");
    public static final org.apache.axis.types.NMToken _any = new org.apache.axis.types.NMToken("any");
    public static final org.apache.axis.types.NMToken _unknown = new org.apache.axis.types.NMToken("unknown");
    public static final PCStereoTetrahedral_parityTypeValue clockwise = new PCStereoTetrahedral_parityTypeValue(_clockwise);
    public static final PCStereoTetrahedral_parityTypeValue counterclockwise = new PCStereoTetrahedral_parityTypeValue(_counterclockwise);
    public static final PCStereoTetrahedral_parityTypeValue any = new PCStereoTetrahedral_parityTypeValue(_any);
    public static final PCStereoTetrahedral_parityTypeValue unknown = new PCStereoTetrahedral_parityTypeValue(_unknown);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static PCStereoTetrahedral_parityTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        PCStereoTetrahedral_parityTypeValue enumeration = (PCStereoTetrahedral_parityTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PCStereoTetrahedral_parityTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PCStereoTetrahedral_parityTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PC-StereoTetrahedral_parityType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
