/**
 * MSModTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSModTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MSModTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _modaa = new org.apache.axis.types.NMToken("modaa");
    public static final org.apache.axis.types.NMToken _modn = new org.apache.axis.types.NMToken("modn");
    public static final org.apache.axis.types.NMToken _modnaa = new org.apache.axis.types.NMToken("modnaa");
    public static final org.apache.axis.types.NMToken _modc = new org.apache.axis.types.NMToken("modc");
    public static final org.apache.axis.types.NMToken _modcaa = new org.apache.axis.types.NMToken("modcaa");
    public static final org.apache.axis.types.NMToken _modnp = new org.apache.axis.types.NMToken("modnp");
    public static final org.apache.axis.types.NMToken _modnpaa = new org.apache.axis.types.NMToken("modnpaa");
    public static final org.apache.axis.types.NMToken _modcp = new org.apache.axis.types.NMToken("modcp");
    public static final org.apache.axis.types.NMToken _modcpaa = new org.apache.axis.types.NMToken("modcpaa");
    public static final org.apache.axis.types.NMToken _modmax = new org.apache.axis.types.NMToken("modmax");
    public static final MSModTypeTypeValue modaa = new MSModTypeTypeValue(_modaa);
    public static final MSModTypeTypeValue modn = new MSModTypeTypeValue(_modn);
    public static final MSModTypeTypeValue modnaa = new MSModTypeTypeValue(_modnaa);
    public static final MSModTypeTypeValue modc = new MSModTypeTypeValue(_modc);
    public static final MSModTypeTypeValue modcaa = new MSModTypeTypeValue(_modcaa);
    public static final MSModTypeTypeValue modnp = new MSModTypeTypeValue(_modnp);
    public static final MSModTypeTypeValue modnpaa = new MSModTypeTypeValue(_modnpaa);
    public static final MSModTypeTypeValue modcp = new MSModTypeTypeValue(_modcp);
    public static final MSModTypeTypeValue modcpaa = new MSModTypeTypeValue(_modcpaa);
    public static final MSModTypeTypeValue modmax = new MSModTypeTypeValue(_modmax);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static MSModTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        MSModTypeTypeValue enumeration = (MSModTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MSModTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MSModTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">MSModTypeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
