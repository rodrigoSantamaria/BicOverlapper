/**
 * GIBBMolTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GIBBMolTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GIBBMolTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("unknown");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("genomic");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("pre-mRNA");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("mRNA");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("rRNA");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("tRNA");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("snRNA");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("scRNA");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("peptide");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("other-genetic");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("genomic-mRNA");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("other");
    public static final GIBBMolTypeValue value1 = new GIBBMolTypeValue(_value1);
    public static final GIBBMolTypeValue value2 = new GIBBMolTypeValue(_value2);
    public static final GIBBMolTypeValue value3 = new GIBBMolTypeValue(_value3);
    public static final GIBBMolTypeValue value4 = new GIBBMolTypeValue(_value4);
    public static final GIBBMolTypeValue value5 = new GIBBMolTypeValue(_value5);
    public static final GIBBMolTypeValue value6 = new GIBBMolTypeValue(_value6);
    public static final GIBBMolTypeValue value7 = new GIBBMolTypeValue(_value7);
    public static final GIBBMolTypeValue value8 = new GIBBMolTypeValue(_value8);
    public static final GIBBMolTypeValue value9 = new GIBBMolTypeValue(_value9);
    public static final GIBBMolTypeValue value10 = new GIBBMolTypeValue(_value10);
    public static final GIBBMolTypeValue value11 = new GIBBMolTypeValue(_value11);
    public static final GIBBMolTypeValue value12 = new GIBBMolTypeValue(_value12);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static GIBBMolTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        GIBBMolTypeValue enumeration = (GIBBMolTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GIBBMolTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GIBBMolTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">GIBB-molType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
