/**
 * ID2RequestGetSeqId_seqIdTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestGetSeqId_seqIdTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ID2RequestGetSeqId_seqIdTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _any = new org.apache.axis.types.NMToken("any");
    public static final org.apache.axis.types.NMToken _gi = new org.apache.axis.types.NMToken("gi");
    public static final org.apache.axis.types.NMToken _text = new org.apache.axis.types.NMToken("text");
    public static final org.apache.axis.types.NMToken _general = new org.apache.axis.types.NMToken("general");
    public static final org.apache.axis.types.NMToken _all = new org.apache.axis.types.NMToken("all");
    public static final ID2RequestGetSeqId_seqIdTypeTypeValue any = new ID2RequestGetSeqId_seqIdTypeTypeValue(_any);
    public static final ID2RequestGetSeqId_seqIdTypeTypeValue gi = new ID2RequestGetSeqId_seqIdTypeTypeValue(_gi);
    public static final ID2RequestGetSeqId_seqIdTypeTypeValue text = new ID2RequestGetSeqId_seqIdTypeTypeValue(_text);
    public static final ID2RequestGetSeqId_seqIdTypeTypeValue general = new ID2RequestGetSeqId_seqIdTypeTypeValue(_general);
    public static final ID2RequestGetSeqId_seqIdTypeTypeValue all = new ID2RequestGetSeqId_seqIdTypeTypeValue(_all);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static ID2RequestGetSeqId_seqIdTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        ID2RequestGetSeqId_seqIdTypeTypeValue enumeration = (ID2RequestGetSeqId_seqIdTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ID2RequestGetSeqId_seqIdTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ID2RequestGetSeqId_seqIdTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2-Request-Get-Seq-id_seq-id-typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
