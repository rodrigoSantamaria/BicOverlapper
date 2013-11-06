/**
 * Taxon1Error_levelTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Taxon1Error_levelTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Taxon1Error_levelTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _none = new org.apache.axis.types.NMToken("none");
    public static final org.apache.axis.types.NMToken _info = new org.apache.axis.types.NMToken("info");
    public static final org.apache.axis.types.NMToken _warn = new org.apache.axis.types.NMToken("warn");
    public static final org.apache.axis.types.NMToken _error = new org.apache.axis.types.NMToken("error");
    public static final org.apache.axis.types.NMToken _fatal = new org.apache.axis.types.NMToken("fatal");
    public static final Taxon1Error_levelTypeValue none = new Taxon1Error_levelTypeValue(_none);
    public static final Taxon1Error_levelTypeValue info = new Taxon1Error_levelTypeValue(_info);
    public static final Taxon1Error_levelTypeValue warn = new Taxon1Error_levelTypeValue(_warn);
    public static final Taxon1Error_levelTypeValue error = new Taxon1Error_levelTypeValue(_error);
    public static final Taxon1Error_levelTypeValue fatal = new Taxon1Error_levelTypeValue(_fatal);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Taxon1Error_levelTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Taxon1Error_levelTypeValue enumeration = (Taxon1Error_levelTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Taxon1Error_levelTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Taxon1Error_levelTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Taxon1-error_levelType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
