/**
 * SeqFeatData_bondTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqFeatData_bondTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SeqFeatData_bondTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _disulfide = new org.apache.axis.types.NMToken("disulfide");
    public static final org.apache.axis.types.NMToken _thiolester = new org.apache.axis.types.NMToken("thiolester");
    public static final org.apache.axis.types.NMToken _xlink = new org.apache.axis.types.NMToken("xlink");
    public static final org.apache.axis.types.NMToken _thioether = new org.apache.axis.types.NMToken("thioether");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final SeqFeatData_bondTypeValue disulfide = new SeqFeatData_bondTypeValue(_disulfide);
    public static final SeqFeatData_bondTypeValue thiolester = new SeqFeatData_bondTypeValue(_thiolester);
    public static final SeqFeatData_bondTypeValue xlink = new SeqFeatData_bondTypeValue(_xlink);
    public static final SeqFeatData_bondTypeValue thioether = new SeqFeatData_bondTypeValue(_thioether);
    public static final SeqFeatData_bondTypeValue other = new SeqFeatData_bondTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static SeqFeatData_bondTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        SeqFeatData_bondTypeValue enumeration = (SeqFeatData_bondTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SeqFeatData_bondTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SeqFeatData_bondTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">SeqFeatData_bondType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
