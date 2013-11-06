/**
 * PCResultType_transformTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCResultType_transformTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PCResultType_transformTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _linear = new org.apache.axis.types.NMToken("linear");
    public static final org.apache.axis.types.NMToken _ln = new org.apache.axis.types.NMToken("ln");
    public static final org.apache.axis.types.NMToken _log = new org.apache.axis.types.NMToken("log");
    public static final org.apache.axis.types.NMToken _reciprocal = new org.apache.axis.types.NMToken("reciprocal");
    public static final org.apache.axis.types.NMToken _negative = new org.apache.axis.types.NMToken("negative");
    public static final org.apache.axis.types.NMToken _nlog = new org.apache.axis.types.NMToken("nlog");
    public static final org.apache.axis.types.NMToken _nln = new org.apache.axis.types.NMToken("nln");
    public static final PCResultType_transformTypeValue linear = new PCResultType_transformTypeValue(_linear);
    public static final PCResultType_transformTypeValue ln = new PCResultType_transformTypeValue(_ln);
    public static final PCResultType_transformTypeValue log = new PCResultType_transformTypeValue(_log);
    public static final PCResultType_transformTypeValue reciprocal = new PCResultType_transformTypeValue(_reciprocal);
    public static final PCResultType_transformTypeValue negative = new PCResultType_transformTypeValue(_negative);
    public static final PCResultType_transformTypeValue nlog = new PCResultType_transformTypeValue(_nlog);
    public static final PCResultType_transformTypeValue nln = new PCResultType_transformTypeValue(_nln);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static PCResultType_transformTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        PCResultType_transformTypeValue enumeration = (PCResultType_transformTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PCResultType_transformTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PCResultType_transformTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PC-ResultType_transformType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
