/**
 * Blast4SeqtechTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4SeqtechTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Blast4SeqtechTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("unknown");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("standard");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("est");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("sts");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("survey");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("genemap");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("physmap");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("derived");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("concept-trans");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("seq-pept");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("both");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("seq-pept-overlap");
    public static final org.apache.axis.types.NMToken _value13 = new org.apache.axis.types.NMToken("seq-pept-homol");
    public static final org.apache.axis.types.NMToken _value14 = new org.apache.axis.types.NMToken("concept-trans-a");
    public static final org.apache.axis.types.NMToken _value15 = new org.apache.axis.types.NMToken("htgs-1");
    public static final org.apache.axis.types.NMToken _value16 = new org.apache.axis.types.NMToken("htgs-2");
    public static final org.apache.axis.types.NMToken _value17 = new org.apache.axis.types.NMToken("htgs-3");
    public static final org.apache.axis.types.NMToken _value18 = new org.apache.axis.types.NMToken("fli-cdna");
    public static final org.apache.axis.types.NMToken _value19 = new org.apache.axis.types.NMToken("htgs-0");
    public static final org.apache.axis.types.NMToken _value20 = new org.apache.axis.types.NMToken("htc");
    public static final org.apache.axis.types.NMToken _value21 = new org.apache.axis.types.NMToken("wgs");
    public static final org.apache.axis.types.NMToken _value22 = new org.apache.axis.types.NMToken("other");
    public static final Blast4SeqtechTypeValue value1 = new Blast4SeqtechTypeValue(_value1);
    public static final Blast4SeqtechTypeValue value2 = new Blast4SeqtechTypeValue(_value2);
    public static final Blast4SeqtechTypeValue value3 = new Blast4SeqtechTypeValue(_value3);
    public static final Blast4SeqtechTypeValue value4 = new Blast4SeqtechTypeValue(_value4);
    public static final Blast4SeqtechTypeValue value5 = new Blast4SeqtechTypeValue(_value5);
    public static final Blast4SeqtechTypeValue value6 = new Blast4SeqtechTypeValue(_value6);
    public static final Blast4SeqtechTypeValue value7 = new Blast4SeqtechTypeValue(_value7);
    public static final Blast4SeqtechTypeValue value8 = new Blast4SeqtechTypeValue(_value8);
    public static final Blast4SeqtechTypeValue value9 = new Blast4SeqtechTypeValue(_value9);
    public static final Blast4SeqtechTypeValue value10 = new Blast4SeqtechTypeValue(_value10);
    public static final Blast4SeqtechTypeValue value11 = new Blast4SeqtechTypeValue(_value11);
    public static final Blast4SeqtechTypeValue value12 = new Blast4SeqtechTypeValue(_value12);
    public static final Blast4SeqtechTypeValue value13 = new Blast4SeqtechTypeValue(_value13);
    public static final Blast4SeqtechTypeValue value14 = new Blast4SeqtechTypeValue(_value14);
    public static final Blast4SeqtechTypeValue value15 = new Blast4SeqtechTypeValue(_value15);
    public static final Blast4SeqtechTypeValue value16 = new Blast4SeqtechTypeValue(_value16);
    public static final Blast4SeqtechTypeValue value17 = new Blast4SeqtechTypeValue(_value17);
    public static final Blast4SeqtechTypeValue value18 = new Blast4SeqtechTypeValue(_value18);
    public static final Blast4SeqtechTypeValue value19 = new Blast4SeqtechTypeValue(_value19);
    public static final Blast4SeqtechTypeValue value20 = new Blast4SeqtechTypeValue(_value20);
    public static final Blast4SeqtechTypeValue value21 = new Blast4SeqtechTypeValue(_value21);
    public static final Blast4SeqtechTypeValue value22 = new Blast4SeqtechTypeValue(_value22);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Blast4SeqtechTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Blast4SeqtechTypeValue enumeration = (Blast4SeqtechTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Blast4SeqtechTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Blast4SeqtechTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Blast4-seqtechType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
