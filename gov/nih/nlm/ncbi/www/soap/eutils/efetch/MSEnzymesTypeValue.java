/**
 * MSEnzymesTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSEnzymesTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MSEnzymesTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("trypsin");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("argc");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("cnbr");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("chymotrypsin");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("formicacid");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("lysc");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("lysc-p");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("pepsin-a");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("tryp-cnbr");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("tryp-chymo");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("trypsin-p");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("whole-protein");
    public static final org.apache.axis.types.NMToken _value13 = new org.apache.axis.types.NMToken("aspn");
    public static final org.apache.axis.types.NMToken _value14 = new org.apache.axis.types.NMToken("gluc");
    public static final org.apache.axis.types.NMToken _value15 = new org.apache.axis.types.NMToken("aspngluc");
    public static final org.apache.axis.types.NMToken _value16 = new org.apache.axis.types.NMToken("top-down");
    public static final org.apache.axis.types.NMToken _value17 = new org.apache.axis.types.NMToken("semi-tryptic");
    public static final org.apache.axis.types.NMToken _value18 = new org.apache.axis.types.NMToken("no-enzyme");
    public static final org.apache.axis.types.NMToken _value19 = new org.apache.axis.types.NMToken("chymotrypsin-p");
    public static final org.apache.axis.types.NMToken _value20 = new org.apache.axis.types.NMToken("aspn-de");
    public static final org.apache.axis.types.NMToken _value21 = new org.apache.axis.types.NMToken("gluc-de");
    public static final org.apache.axis.types.NMToken _value22 = new org.apache.axis.types.NMToken("max");
    public static final org.apache.axis.types.NMToken _value23 = new org.apache.axis.types.NMToken("none");
    public static final MSEnzymesTypeValue value1 = new MSEnzymesTypeValue(_value1);
    public static final MSEnzymesTypeValue value2 = new MSEnzymesTypeValue(_value2);
    public static final MSEnzymesTypeValue value3 = new MSEnzymesTypeValue(_value3);
    public static final MSEnzymesTypeValue value4 = new MSEnzymesTypeValue(_value4);
    public static final MSEnzymesTypeValue value5 = new MSEnzymesTypeValue(_value5);
    public static final MSEnzymesTypeValue value6 = new MSEnzymesTypeValue(_value6);
    public static final MSEnzymesTypeValue value7 = new MSEnzymesTypeValue(_value7);
    public static final MSEnzymesTypeValue value8 = new MSEnzymesTypeValue(_value8);
    public static final MSEnzymesTypeValue value9 = new MSEnzymesTypeValue(_value9);
    public static final MSEnzymesTypeValue value10 = new MSEnzymesTypeValue(_value10);
    public static final MSEnzymesTypeValue value11 = new MSEnzymesTypeValue(_value11);
    public static final MSEnzymesTypeValue value12 = new MSEnzymesTypeValue(_value12);
    public static final MSEnzymesTypeValue value13 = new MSEnzymesTypeValue(_value13);
    public static final MSEnzymesTypeValue value14 = new MSEnzymesTypeValue(_value14);
    public static final MSEnzymesTypeValue value15 = new MSEnzymesTypeValue(_value15);
    public static final MSEnzymesTypeValue value16 = new MSEnzymesTypeValue(_value16);
    public static final MSEnzymesTypeValue value17 = new MSEnzymesTypeValue(_value17);
    public static final MSEnzymesTypeValue value18 = new MSEnzymesTypeValue(_value18);
    public static final MSEnzymesTypeValue value19 = new MSEnzymesTypeValue(_value19);
    public static final MSEnzymesTypeValue value20 = new MSEnzymesTypeValue(_value20);
    public static final MSEnzymesTypeValue value21 = new MSEnzymesTypeValue(_value21);
    public static final MSEnzymesTypeValue value22 = new MSEnzymesTypeValue(_value22);
    public static final MSEnzymesTypeValue value23 = new MSEnzymesTypeValue(_value23);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static MSEnzymesTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        MSEnzymesTypeValue enumeration = (MSEnzymesTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MSEnzymesTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MSEnzymesTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">MSEnzymesType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
