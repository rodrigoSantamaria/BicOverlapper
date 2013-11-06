/**
 * CddDescr_readonlyStatusTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddDescr_readonlyStatusTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CddDescr_readonlyStatusTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _unassigned = new org.apache.axis.types.NMToken("unassigned");
    public static final org.apache.axis.types.NMToken _readonly = new org.apache.axis.types.NMToken("readonly");
    public static final org.apache.axis.types.NMToken _readwrite = new org.apache.axis.types.NMToken("readwrite");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final CddDescr_readonlyStatusTypeValue unassigned = new CddDescr_readonlyStatusTypeValue(_unassigned);
    public static final CddDescr_readonlyStatusTypeValue readonly = new CddDescr_readonlyStatusTypeValue(_readonly);
    public static final CddDescr_readonlyStatusTypeValue readwrite = new CddDescr_readonlyStatusTypeValue(_readwrite);
    public static final CddDescr_readonlyStatusTypeValue other = new CddDescr_readonlyStatusTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static CddDescr_readonlyStatusTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        CddDescr_readonlyStatusTypeValue enumeration = (CddDescr_readonlyStatusTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CddDescr_readonlyStatusTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CddDescr_readonlyStatusTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Cdd-descr_readonly-statusType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
