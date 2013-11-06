/**
 * Entrezgene_typeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrezgene_typeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Entrezgene_typeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("unknown");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("tRNA");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("rRNA");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("snRNA");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("scRNA");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("snoRNA");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("protein-coding");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("pseudo");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("transposon");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("miscRNA");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("other");
    public static final Entrezgene_typeTypeValue value1 = new Entrezgene_typeTypeValue(_value1);
    public static final Entrezgene_typeTypeValue value2 = new Entrezgene_typeTypeValue(_value2);
    public static final Entrezgene_typeTypeValue value3 = new Entrezgene_typeTypeValue(_value3);
    public static final Entrezgene_typeTypeValue value4 = new Entrezgene_typeTypeValue(_value4);
    public static final Entrezgene_typeTypeValue value5 = new Entrezgene_typeTypeValue(_value5);
    public static final Entrezgene_typeTypeValue value6 = new Entrezgene_typeTypeValue(_value6);
    public static final Entrezgene_typeTypeValue value7 = new Entrezgene_typeTypeValue(_value7);
    public static final Entrezgene_typeTypeValue value8 = new Entrezgene_typeTypeValue(_value8);
    public static final Entrezgene_typeTypeValue value9 = new Entrezgene_typeTypeValue(_value9);
    public static final Entrezgene_typeTypeValue value10 = new Entrezgene_typeTypeValue(_value10);
    public static final Entrezgene_typeTypeValue value11 = new Entrezgene_typeTypeValue(_value11);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Entrezgene_typeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Entrezgene_typeTypeValue enumeration = (Entrezgene_typeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Entrezgene_typeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Entrezgene_typeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Entrezgene_typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
