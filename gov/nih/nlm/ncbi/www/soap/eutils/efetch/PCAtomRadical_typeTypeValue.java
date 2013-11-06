/**
 * PCAtomRadical_typeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAtomRadical_typeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PCAtomRadical_typeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _singlet = new org.apache.axis.types.NMToken("singlet");
    public static final org.apache.axis.types.NMToken _doublet = new org.apache.axis.types.NMToken("doublet");
    public static final org.apache.axis.types.NMToken _triplet = new org.apache.axis.types.NMToken("triplet");
    public static final org.apache.axis.types.NMToken _quartet = new org.apache.axis.types.NMToken("quartet");
    public static final org.apache.axis.types.NMToken _quintet = new org.apache.axis.types.NMToken("quintet");
    public static final org.apache.axis.types.NMToken _hextet = new org.apache.axis.types.NMToken("hextet");
    public static final org.apache.axis.types.NMToken _heptet = new org.apache.axis.types.NMToken("heptet");
    public static final org.apache.axis.types.NMToken _octet = new org.apache.axis.types.NMToken("octet");
    public static final org.apache.axis.types.NMToken _none = new org.apache.axis.types.NMToken("none");
    public static final PCAtomRadical_typeTypeValue singlet = new PCAtomRadical_typeTypeValue(_singlet);
    public static final PCAtomRadical_typeTypeValue doublet = new PCAtomRadical_typeTypeValue(_doublet);
    public static final PCAtomRadical_typeTypeValue triplet = new PCAtomRadical_typeTypeValue(_triplet);
    public static final PCAtomRadical_typeTypeValue quartet = new PCAtomRadical_typeTypeValue(_quartet);
    public static final PCAtomRadical_typeTypeValue quintet = new PCAtomRadical_typeTypeValue(_quintet);
    public static final PCAtomRadical_typeTypeValue hextet = new PCAtomRadical_typeTypeValue(_hextet);
    public static final PCAtomRadical_typeTypeValue heptet = new PCAtomRadical_typeTypeValue(_heptet);
    public static final PCAtomRadical_typeTypeValue octet = new PCAtomRadical_typeTypeValue(_octet);
    public static final PCAtomRadical_typeTypeValue none = new PCAtomRadical_typeTypeValue(_none);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static PCAtomRadical_typeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        PCAtomRadical_typeTypeValue enumeration = (PCAtomRadical_typeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PCAtomRadical_typeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PCAtomRadical_typeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PC-AtomRadical_typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
