/**
 * CddDescr_statusTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddDescr_statusTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CddDescr_statusTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("unassigned");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("finished-ok");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("pending-release");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("other-asis");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("matrix-only");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("update-running");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("auto-updated");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("claimed");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("curated-complete");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("other");
    public static final CddDescr_statusTypeValue value1 = new CddDescr_statusTypeValue(_value1);
    public static final CddDescr_statusTypeValue value2 = new CddDescr_statusTypeValue(_value2);
    public static final CddDescr_statusTypeValue value3 = new CddDescr_statusTypeValue(_value3);
    public static final CddDescr_statusTypeValue value4 = new CddDescr_statusTypeValue(_value4);
    public static final CddDescr_statusTypeValue value5 = new CddDescr_statusTypeValue(_value5);
    public static final CddDescr_statusTypeValue value6 = new CddDescr_statusTypeValue(_value6);
    public static final CddDescr_statusTypeValue value7 = new CddDescr_statusTypeValue(_value7);
    public static final CddDescr_statusTypeValue value8 = new CddDescr_statusTypeValue(_value8);
    public static final CddDescr_statusTypeValue value9 = new CddDescr_statusTypeValue(_value9);
    public static final CddDescr_statusTypeValue value10 = new CddDescr_statusTypeValue(_value10);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static CddDescr_statusTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        CddDescr_statusTypeValue enumeration = (CddDescr_statusTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CddDescr_statusTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CddDescr_statusTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Cdd-descr_statusType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
