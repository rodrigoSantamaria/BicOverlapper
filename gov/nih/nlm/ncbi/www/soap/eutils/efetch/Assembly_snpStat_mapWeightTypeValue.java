/**
 * Assembly_snpStat_mapWeightTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Assembly_snpStat_mapWeightTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Assembly_snpStat_mapWeightTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("unmapped");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("unique-in-contig");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("two-hits-in-contig");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("less-10-hits");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("multiple-hits");
    public static final Assembly_snpStat_mapWeightTypeValue value1 = new Assembly_snpStat_mapWeightTypeValue(_value1);
    public static final Assembly_snpStat_mapWeightTypeValue value2 = new Assembly_snpStat_mapWeightTypeValue(_value2);
    public static final Assembly_snpStat_mapWeightTypeValue value3 = new Assembly_snpStat_mapWeightTypeValue(_value3);
    public static final Assembly_snpStat_mapWeightTypeValue value4 = new Assembly_snpStat_mapWeightTypeValue(_value4);
    public static final Assembly_snpStat_mapWeightTypeValue value5 = new Assembly_snpStat_mapWeightTypeValue(_value5);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Assembly_snpStat_mapWeightTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Assembly_snpStat_mapWeightTypeValue enumeration = (Assembly_snpStat_mapWeightTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Assembly_snpStat_mapWeightTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Assembly_snpStat_mapWeightTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Assembly_snpStat_mapWeightType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
