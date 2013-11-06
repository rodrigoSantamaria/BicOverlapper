/**
 * Cn3DColorSchemeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DColorSchemeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Cn3DColorSchemeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("element");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("object");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("molecule");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("domain");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("residue");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("secondary-structure");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("user-select");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("aligned");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("identity");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("variety");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("weighted-variety");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("information-content");
    public static final org.apache.axis.types.NMToken _value13 = new org.apache.axis.types.NMToken("fit");
    public static final org.apache.axis.types.NMToken _value14 = new org.apache.axis.types.NMToken("block-fit");
    public static final org.apache.axis.types.NMToken _value15 = new org.apache.axis.types.NMToken("block-z-fit");
    public static final org.apache.axis.types.NMToken _value16 = new org.apache.axis.types.NMToken("block-row-fit");
    public static final org.apache.axis.types.NMToken _value17 = new org.apache.axis.types.NMToken("temperature");
    public static final org.apache.axis.types.NMToken _value18 = new org.apache.axis.types.NMToken("hydrophobicity");
    public static final org.apache.axis.types.NMToken _value19 = new org.apache.axis.types.NMToken("charge");
    public static final org.apache.axis.types.NMToken _value20 = new org.apache.axis.types.NMToken("rainbow");
    public static final Cn3DColorSchemeTypeValue value1 = new Cn3DColorSchemeTypeValue(_value1);
    public static final Cn3DColorSchemeTypeValue value2 = new Cn3DColorSchemeTypeValue(_value2);
    public static final Cn3DColorSchemeTypeValue value3 = new Cn3DColorSchemeTypeValue(_value3);
    public static final Cn3DColorSchemeTypeValue value4 = new Cn3DColorSchemeTypeValue(_value4);
    public static final Cn3DColorSchemeTypeValue value5 = new Cn3DColorSchemeTypeValue(_value5);
    public static final Cn3DColorSchemeTypeValue value6 = new Cn3DColorSchemeTypeValue(_value6);
    public static final Cn3DColorSchemeTypeValue value7 = new Cn3DColorSchemeTypeValue(_value7);
    public static final Cn3DColorSchemeTypeValue value8 = new Cn3DColorSchemeTypeValue(_value8);
    public static final Cn3DColorSchemeTypeValue value9 = new Cn3DColorSchemeTypeValue(_value9);
    public static final Cn3DColorSchemeTypeValue value10 = new Cn3DColorSchemeTypeValue(_value10);
    public static final Cn3DColorSchemeTypeValue value11 = new Cn3DColorSchemeTypeValue(_value11);
    public static final Cn3DColorSchemeTypeValue value12 = new Cn3DColorSchemeTypeValue(_value12);
    public static final Cn3DColorSchemeTypeValue value13 = new Cn3DColorSchemeTypeValue(_value13);
    public static final Cn3DColorSchemeTypeValue value14 = new Cn3DColorSchemeTypeValue(_value14);
    public static final Cn3DColorSchemeTypeValue value15 = new Cn3DColorSchemeTypeValue(_value15);
    public static final Cn3DColorSchemeTypeValue value16 = new Cn3DColorSchemeTypeValue(_value16);
    public static final Cn3DColorSchemeTypeValue value17 = new Cn3DColorSchemeTypeValue(_value17);
    public static final Cn3DColorSchemeTypeValue value18 = new Cn3DColorSchemeTypeValue(_value18);
    public static final Cn3DColorSchemeTypeValue value19 = new Cn3DColorSchemeTypeValue(_value19);
    public static final Cn3DColorSchemeTypeValue value20 = new Cn3DColorSchemeTypeValue(_value20);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Cn3DColorSchemeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Cn3DColorSchemeTypeValue enumeration = (Cn3DColorSchemeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Cn3DColorSchemeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Cn3DColorSchemeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Cn3d-color-schemeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
