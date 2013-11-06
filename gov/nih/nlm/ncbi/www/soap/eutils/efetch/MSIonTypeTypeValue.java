/**
 * MSIonTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSIonTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MSIonTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _a = new org.apache.axis.types.NMToken("a");
    public static final org.apache.axis.types.NMToken _b = new org.apache.axis.types.NMToken("b");
    public static final org.apache.axis.types.NMToken _c = new org.apache.axis.types.NMToken("c");
    public static final org.apache.axis.types.NMToken _x = new org.apache.axis.types.NMToken("x");
    public static final org.apache.axis.types.NMToken _y = new org.apache.axis.types.NMToken("y");
    public static final org.apache.axis.types.NMToken _z = new org.apache.axis.types.NMToken("z");
    public static final org.apache.axis.types.NMToken _max = new org.apache.axis.types.NMToken("max");
    public static final MSIonTypeTypeValue a = new MSIonTypeTypeValue(_a);
    public static final MSIonTypeTypeValue b = new MSIonTypeTypeValue(_b);
    public static final MSIonTypeTypeValue c = new MSIonTypeTypeValue(_c);
    public static final MSIonTypeTypeValue x = new MSIonTypeTypeValue(_x);
    public static final MSIonTypeTypeValue y = new MSIonTypeTypeValue(_y);
    public static final MSIonTypeTypeValue z = new MSIonTypeTypeValue(_z);
    public static final MSIonTypeTypeValue max = new MSIonTypeTypeValue(_max);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static MSIonTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        MSIonTypeTypeValue enumeration = (MSIonTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MSIonTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MSIonTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">MSIonTypeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
