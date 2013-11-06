/**
 * EMBLBlock_divTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EMBLBlock_divTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EMBLBlock_divTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _fun = new org.apache.axis.types.NMToken("fun");
    public static final org.apache.axis.types.NMToken _inv = new org.apache.axis.types.NMToken("inv");
    public static final org.apache.axis.types.NMToken _mam = new org.apache.axis.types.NMToken("mam");
    public static final org.apache.axis.types.NMToken _org = new org.apache.axis.types.NMToken("org");
    public static final org.apache.axis.types.NMToken _phg = new org.apache.axis.types.NMToken("phg");
    public static final org.apache.axis.types.NMToken _pln = new org.apache.axis.types.NMToken("pln");
    public static final org.apache.axis.types.NMToken _pri = new org.apache.axis.types.NMToken("pri");
    public static final org.apache.axis.types.NMToken _pro = new org.apache.axis.types.NMToken("pro");
    public static final org.apache.axis.types.NMToken _rod = new org.apache.axis.types.NMToken("rod");
    public static final org.apache.axis.types.NMToken _syn = new org.apache.axis.types.NMToken("syn");
    public static final org.apache.axis.types.NMToken _una = new org.apache.axis.types.NMToken("una");
    public static final org.apache.axis.types.NMToken _vrl = new org.apache.axis.types.NMToken("vrl");
    public static final org.apache.axis.types.NMToken _vrt = new org.apache.axis.types.NMToken("vrt");
    public static final org.apache.axis.types.NMToken _pat = new org.apache.axis.types.NMToken("pat");
    public static final org.apache.axis.types.NMToken _est = new org.apache.axis.types.NMToken("est");
    public static final org.apache.axis.types.NMToken _sts = new org.apache.axis.types.NMToken("sts");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final EMBLBlock_divTypeValue fun = new EMBLBlock_divTypeValue(_fun);
    public static final EMBLBlock_divTypeValue inv = new EMBLBlock_divTypeValue(_inv);
    public static final EMBLBlock_divTypeValue mam = new EMBLBlock_divTypeValue(_mam);
    public static final EMBLBlock_divTypeValue org = new EMBLBlock_divTypeValue(_org);
    public static final EMBLBlock_divTypeValue phg = new EMBLBlock_divTypeValue(_phg);
    public static final EMBLBlock_divTypeValue pln = new EMBLBlock_divTypeValue(_pln);
    public static final EMBLBlock_divTypeValue pri = new EMBLBlock_divTypeValue(_pri);
    public static final EMBLBlock_divTypeValue pro = new EMBLBlock_divTypeValue(_pro);
    public static final EMBLBlock_divTypeValue rod = new EMBLBlock_divTypeValue(_rod);
    public static final EMBLBlock_divTypeValue syn = new EMBLBlock_divTypeValue(_syn);
    public static final EMBLBlock_divTypeValue una = new EMBLBlock_divTypeValue(_una);
    public static final EMBLBlock_divTypeValue vrl = new EMBLBlock_divTypeValue(_vrl);
    public static final EMBLBlock_divTypeValue vrt = new EMBLBlock_divTypeValue(_vrt);
    public static final EMBLBlock_divTypeValue pat = new EMBLBlock_divTypeValue(_pat);
    public static final EMBLBlock_divTypeValue est = new EMBLBlock_divTypeValue(_est);
    public static final EMBLBlock_divTypeValue sts = new EMBLBlock_divTypeValue(_sts);
    public static final EMBLBlock_divTypeValue other = new EMBLBlock_divTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static EMBLBlock_divTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        EMBLBlock_divTypeValue enumeration = (EMBLBlock_divTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EMBLBlock_divTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EMBLBlock_divTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">EMBL-block_divType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
