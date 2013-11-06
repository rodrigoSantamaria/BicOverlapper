/**
 * Ss_subSnpClassTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Ss_subSnpClassTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Ss_subSnpClassTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("snp");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("in-del");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("heterozygous");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("microsatellite");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("named-locus");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("no-variation");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("mixed");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("multinucleotide-polymorphism");
    public static final Ss_subSnpClassTypeValue value1 = new Ss_subSnpClassTypeValue(_value1);
    public static final Ss_subSnpClassTypeValue value2 = new Ss_subSnpClassTypeValue(_value2);
    public static final Ss_subSnpClassTypeValue value3 = new Ss_subSnpClassTypeValue(_value3);
    public static final Ss_subSnpClassTypeValue value4 = new Ss_subSnpClassTypeValue(_value4);
    public static final Ss_subSnpClassTypeValue value5 = new Ss_subSnpClassTypeValue(_value5);
    public static final Ss_subSnpClassTypeValue value6 = new Ss_subSnpClassTypeValue(_value6);
    public static final Ss_subSnpClassTypeValue value7 = new Ss_subSnpClassTypeValue(_value7);
    public static final Ss_subSnpClassTypeValue value8 = new Ss_subSnpClassTypeValue(_value8);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Ss_subSnpClassTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Ss_subSnpClassTypeValue enumeration = (Ss_subSnpClassTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Ss_subSnpClassTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Ss_subSnpClassTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Ss_subSnpClassType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
