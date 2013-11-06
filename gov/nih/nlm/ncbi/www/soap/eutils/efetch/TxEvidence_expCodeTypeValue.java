/**
 * TxEvidence_expCodeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TxEvidence_expCodeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TxEvidence_expCodeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("unknown");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("rna-seq");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("rna-size");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("np-map");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("np-size");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("pe-seq");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("cDNA-seq");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("pe-map");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("pe-size");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("pseudo-seq");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("rev-pe-map");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("other");
    public static final TxEvidence_expCodeTypeValue value1 = new TxEvidence_expCodeTypeValue(_value1);
    public static final TxEvidence_expCodeTypeValue value2 = new TxEvidence_expCodeTypeValue(_value2);
    public static final TxEvidence_expCodeTypeValue value3 = new TxEvidence_expCodeTypeValue(_value3);
    public static final TxEvidence_expCodeTypeValue value4 = new TxEvidence_expCodeTypeValue(_value4);
    public static final TxEvidence_expCodeTypeValue value5 = new TxEvidence_expCodeTypeValue(_value5);
    public static final TxEvidence_expCodeTypeValue value6 = new TxEvidence_expCodeTypeValue(_value6);
    public static final TxEvidence_expCodeTypeValue value7 = new TxEvidence_expCodeTypeValue(_value7);
    public static final TxEvidence_expCodeTypeValue value8 = new TxEvidence_expCodeTypeValue(_value8);
    public static final TxEvidence_expCodeTypeValue value9 = new TxEvidence_expCodeTypeValue(_value9);
    public static final TxEvidence_expCodeTypeValue value10 = new TxEvidence_expCodeTypeValue(_value10);
    public static final TxEvidence_expCodeTypeValue value11 = new TxEvidence_expCodeTypeValue(_value11);
    public static final TxEvidence_expCodeTypeValue value12 = new TxEvidence_expCodeTypeValue(_value12);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static TxEvidence_expCodeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        TxEvidence_expCodeTypeValue enumeration = (TxEvidence_expCodeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TxEvidence_expCodeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TxEvidence_expCodeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Tx-evidence_exp-codeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
