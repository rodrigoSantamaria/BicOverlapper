/**
 * MSSearchTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSSearchTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MSSearchTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _monoisotopic = new org.apache.axis.types.NMToken("monoisotopic");
    public static final org.apache.axis.types.NMToken _average = new org.apache.axis.types.NMToken("average");
    public static final org.apache.axis.types.NMToken _monon15 = new org.apache.axis.types.NMToken("monon15");
    public static final org.apache.axis.types.NMToken _exact = new org.apache.axis.types.NMToken("exact");
    public static final org.apache.axis.types.NMToken _max = new org.apache.axis.types.NMToken("max");
    public static final MSSearchTypeTypeValue monoisotopic = new MSSearchTypeTypeValue(_monoisotopic);
    public static final MSSearchTypeTypeValue average = new MSSearchTypeTypeValue(_average);
    public static final MSSearchTypeTypeValue monon15 = new MSSearchTypeTypeValue(_monon15);
    public static final MSSearchTypeTypeValue exact = new MSSearchTypeTypeValue(_exact);
    public static final MSSearchTypeTypeValue max = new MSSearchTypeTypeValue(_max);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static MSSearchTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        MSSearchTypeTypeValue enumeration = (MSSearchTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MSSearchTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MSSearchTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">MSSearchTypeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
