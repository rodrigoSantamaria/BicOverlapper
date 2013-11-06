/**
 * GraphicMimeSubtype.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GraphicMimeSubtype implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GraphicMimeSubtype(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _value1 = new org.apache.axis.types.Token("cgm");
    public static final org.apache.axis.types.Token _value2 = new org.apache.axis.types.Token("g3fax");
    public static final org.apache.axis.types.Token _value3 = new org.apache.axis.types.Token("gif");
    public static final org.apache.axis.types.Token _value4 = new org.apache.axis.types.Token("ief");
    public static final org.apache.axis.types.Token _value5 = new org.apache.axis.types.Token("jpeg");
    public static final org.apache.axis.types.Token _value6 = new org.apache.axis.types.Token("naplps");
    public static final org.apache.axis.types.Token _value7 = new org.apache.axis.types.Token("png");
    public static final org.apache.axis.types.Token _value8 = new org.apache.axis.types.Token("prs.btif");
    public static final org.apache.axis.types.Token _value9 = new org.apache.axis.types.Token("prs.pti");
    public static final org.apache.axis.types.Token _value10 = new org.apache.axis.types.Token("t38");
    public static final org.apache.axis.types.Token _value11 = new org.apache.axis.types.Token("tiff");
    public static final org.apache.axis.types.Token _value12 = new org.apache.axis.types.Token("tiff-fx");
    public static final GraphicMimeSubtype value1 = new GraphicMimeSubtype(_value1);
    public static final GraphicMimeSubtype value2 = new GraphicMimeSubtype(_value2);
    public static final GraphicMimeSubtype value3 = new GraphicMimeSubtype(_value3);
    public static final GraphicMimeSubtype value4 = new GraphicMimeSubtype(_value4);
    public static final GraphicMimeSubtype value5 = new GraphicMimeSubtype(_value5);
    public static final GraphicMimeSubtype value6 = new GraphicMimeSubtype(_value6);
    public static final GraphicMimeSubtype value7 = new GraphicMimeSubtype(_value7);
    public static final GraphicMimeSubtype value8 = new GraphicMimeSubtype(_value8);
    public static final GraphicMimeSubtype value9 = new GraphicMimeSubtype(_value9);
    public static final GraphicMimeSubtype value10 = new GraphicMimeSubtype(_value10);
    public static final GraphicMimeSubtype value11 = new GraphicMimeSubtype(_value11);
    public static final GraphicMimeSubtype value12 = new GraphicMimeSubtype(_value12);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static GraphicMimeSubtype fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        GraphicMimeSubtype enumeration = (GraphicMimeSubtype)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GraphicMimeSubtype fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.Token(value));
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
        new org.apache.axis.description.TypeDesc(GraphicMimeSubtype.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>graphic>mime-subtype"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
