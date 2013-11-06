/**
 * Ss_methodClassTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Ss_methodClassTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Ss_methodClassTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _dHPLC = new org.apache.axis.types.NMToken("dHPLC");
    public static final org.apache.axis.types.NMToken _hybridize = new org.apache.axis.types.NMToken("hybridize");
    public static final org.apache.axis.types.NMToken _computed = new org.apache.axis.types.NMToken("computed");
    public static final org.apache.axis.types.NMToken _sSCP = new org.apache.axis.types.NMToken("sSCP");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final org.apache.axis.types.NMToken _unknown = new org.apache.axis.types.NMToken("unknown");
    public static final org.apache.axis.types.NMToken _rFLP = new org.apache.axis.types.NMToken("rFLP");
    public static final org.apache.axis.types.NMToken _sequence = new org.apache.axis.types.NMToken("sequence");
    public static final Ss_methodClassTypeValue dHPLC = new Ss_methodClassTypeValue(_dHPLC);
    public static final Ss_methodClassTypeValue hybridize = new Ss_methodClassTypeValue(_hybridize);
    public static final Ss_methodClassTypeValue computed = new Ss_methodClassTypeValue(_computed);
    public static final Ss_methodClassTypeValue sSCP = new Ss_methodClassTypeValue(_sSCP);
    public static final Ss_methodClassTypeValue other = new Ss_methodClassTypeValue(_other);
    public static final Ss_methodClassTypeValue unknown = new Ss_methodClassTypeValue(_unknown);
    public static final Ss_methodClassTypeValue rFLP = new Ss_methodClassTypeValue(_rFLP);
    public static final Ss_methodClassTypeValue sequence = new Ss_methodClassTypeValue(_sequence);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Ss_methodClassTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Ss_methodClassTypeValue enumeration = (Ss_methodClassTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Ss_methodClassTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Ss_methodClassTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Ss_methodClassType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
