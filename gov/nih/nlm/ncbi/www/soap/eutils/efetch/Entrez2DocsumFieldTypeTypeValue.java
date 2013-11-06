/**
 * Entrez2DocsumFieldTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2DocsumFieldTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Entrez2DocsumFieldTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("string");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("int");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("float");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("date-pubmed");
    public static final Entrez2DocsumFieldTypeTypeValue value1 = new Entrez2DocsumFieldTypeTypeValue(_value1);
    public static final Entrez2DocsumFieldTypeTypeValue value2 = new Entrez2DocsumFieldTypeTypeValue(_value2);
    public static final Entrez2DocsumFieldTypeTypeValue value3 = new Entrez2DocsumFieldTypeTypeValue(_value3);
    public static final Entrez2DocsumFieldTypeTypeValue value4 = new Entrez2DocsumFieldTypeTypeValue(_value4);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Entrez2DocsumFieldTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Entrez2DocsumFieldTypeTypeValue enumeration = (Entrez2DocsumFieldTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Entrez2DocsumFieldTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Entrez2DocsumFieldTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Entrez2-docsum-field-typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
