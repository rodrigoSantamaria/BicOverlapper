/**
 * Maps_method_mapTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Maps_method_mapTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Maps_method_mapTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _cyto = new org.apache.axis.types.NMToken("cyto");
    public static final org.apache.axis.types.NMToken _bp = new org.apache.axis.types.NMToken("bp");
    public static final org.apache.axis.types.NMToken _cM = new org.apache.axis.types.NMToken("cM");
    public static final org.apache.axis.types.NMToken _cR = new org.apache.axis.types.NMToken("cR");
    public static final org.apache.axis.types.NMToken _min = new org.apache.axis.types.NMToken("min");
    public static final Maps_method_mapTypeTypeValue cyto = new Maps_method_mapTypeTypeValue(_cyto);
    public static final Maps_method_mapTypeTypeValue bp = new Maps_method_mapTypeTypeValue(_bp);
    public static final Maps_method_mapTypeTypeValue cM = new Maps_method_mapTypeTypeValue(_cM);
    public static final Maps_method_mapTypeTypeValue cR = new Maps_method_mapTypeTypeValue(_cR);
    public static final Maps_method_mapTypeTypeValue min = new Maps_method_mapTypeTypeValue(_min);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Maps_method_mapTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Maps_method_mapTypeTypeValue enumeration = (Maps_method_mapTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Maps_method_mapTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Maps_method_mapTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Maps_method_map-typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
