/**
 * TexMathNotation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TexMathNotation implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TexMathNotation(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _LaTeX = new org.apache.axis.types.Token("LaTeX");
    public static final org.apache.axis.types.Token _tex = new org.apache.axis.types.Token("tex");
    public static final org.apache.axis.types.Token _TEX = new org.apache.axis.types.Token("TEX");
    public static final org.apache.axis.types.Token _TeX = new org.apache.axis.types.Token("TeX");
    public static final TexMathNotation LaTeX = new TexMathNotation(_LaTeX);
    public static final TexMathNotation tex = new TexMathNotation(_tex);
    public static final TexMathNotation TEX = new TexMathNotation(_TEX);
    public static final TexMathNotation TeX = new TexMathNotation(_TeX);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static TexMathNotation fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        TexMathNotation enumeration = (TexMathNotation)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TexMathNotation fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TexMathNotation.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>tex-math>notation"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
