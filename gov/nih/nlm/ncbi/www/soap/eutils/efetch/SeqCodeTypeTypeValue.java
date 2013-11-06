/**
 * SeqCodeTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqCodeTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SeqCodeTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _iupacna = new org.apache.axis.types.NMToken("iupacna");
    public static final org.apache.axis.types.NMToken _iupacaa = new org.apache.axis.types.NMToken("iupacaa");
    public static final org.apache.axis.types.NMToken _ncbi2na = new org.apache.axis.types.NMToken("ncbi2na");
    public static final org.apache.axis.types.NMToken _ncbi4na = new org.apache.axis.types.NMToken("ncbi4na");
    public static final org.apache.axis.types.NMToken _ncbi8na = new org.apache.axis.types.NMToken("ncbi8na");
    public static final org.apache.axis.types.NMToken _ncbipna = new org.apache.axis.types.NMToken("ncbipna");
    public static final org.apache.axis.types.NMToken _ncbi8aa = new org.apache.axis.types.NMToken("ncbi8aa");
    public static final org.apache.axis.types.NMToken _ncbieaa = new org.apache.axis.types.NMToken("ncbieaa");
    public static final org.apache.axis.types.NMToken _ncbipaa = new org.apache.axis.types.NMToken("ncbipaa");
    public static final org.apache.axis.types.NMToken _iupacaa3 = new org.apache.axis.types.NMToken("iupacaa3");
    public static final org.apache.axis.types.NMToken _ncbistdaa = new org.apache.axis.types.NMToken("ncbistdaa");
    public static final SeqCodeTypeTypeValue iupacna = new SeqCodeTypeTypeValue(_iupacna);
    public static final SeqCodeTypeTypeValue iupacaa = new SeqCodeTypeTypeValue(_iupacaa);
    public static final SeqCodeTypeTypeValue ncbi2na = new SeqCodeTypeTypeValue(_ncbi2na);
    public static final SeqCodeTypeTypeValue ncbi4na = new SeqCodeTypeTypeValue(_ncbi4na);
    public static final SeqCodeTypeTypeValue ncbi8na = new SeqCodeTypeTypeValue(_ncbi8na);
    public static final SeqCodeTypeTypeValue ncbipna = new SeqCodeTypeTypeValue(_ncbipna);
    public static final SeqCodeTypeTypeValue ncbi8aa = new SeqCodeTypeTypeValue(_ncbi8aa);
    public static final SeqCodeTypeTypeValue ncbieaa = new SeqCodeTypeTypeValue(_ncbieaa);
    public static final SeqCodeTypeTypeValue ncbipaa = new SeqCodeTypeTypeValue(_ncbipaa);
    public static final SeqCodeTypeTypeValue iupacaa3 = new SeqCodeTypeTypeValue(_iupacaa3);
    public static final SeqCodeTypeTypeValue ncbistdaa = new SeqCodeTypeTypeValue(_ncbistdaa);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static SeqCodeTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        SeqCodeTypeTypeValue enumeration = (SeqCodeTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SeqCodeTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SeqCodeTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Seq-code-typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
