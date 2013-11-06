/**
 * PCAssayResults_outcomeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAssayResults_outcomeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PCAssayResults_outcomeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _inactive = new org.apache.axis.types.NMToken("inactive");
    public static final org.apache.axis.types.NMToken _active = new org.apache.axis.types.NMToken("active");
    public static final org.apache.axis.types.NMToken _inconclusive = new org.apache.axis.types.NMToken("inconclusive");
    public static final org.apache.axis.types.NMToken _unspecified = new org.apache.axis.types.NMToken("unspecified");
    public static final PCAssayResults_outcomeTypeValue inactive = new PCAssayResults_outcomeTypeValue(_inactive);
    public static final PCAssayResults_outcomeTypeValue active = new PCAssayResults_outcomeTypeValue(_active);
    public static final PCAssayResults_outcomeTypeValue inconclusive = new PCAssayResults_outcomeTypeValue(_inconclusive);
    public static final PCAssayResults_outcomeTypeValue unspecified = new PCAssayResults_outcomeTypeValue(_unspecified);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static PCAssayResults_outcomeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        PCAssayResults_outcomeTypeValue enumeration = (PCAssayResults_outcomeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PCAssayResults_outcomeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PCAssayResults_outcomeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PC-AssayResults_outcomeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
