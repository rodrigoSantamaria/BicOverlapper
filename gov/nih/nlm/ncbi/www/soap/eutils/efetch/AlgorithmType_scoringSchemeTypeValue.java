/**
 * AlgorithmType_scoringSchemeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AlgorithmType_scoringSchemeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlgorithmType_scoringSchemeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("unassigned");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("percent-id");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("kimura-corrected");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("aligned-score");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("aligned-score-ext");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("aligned-score-filled");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("blast-footprint");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("blast-full");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("hybrid-aligned-score");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("other");
    public static final AlgorithmType_scoringSchemeTypeValue value1 = new AlgorithmType_scoringSchemeTypeValue(_value1);
    public static final AlgorithmType_scoringSchemeTypeValue value2 = new AlgorithmType_scoringSchemeTypeValue(_value2);
    public static final AlgorithmType_scoringSchemeTypeValue value3 = new AlgorithmType_scoringSchemeTypeValue(_value3);
    public static final AlgorithmType_scoringSchemeTypeValue value4 = new AlgorithmType_scoringSchemeTypeValue(_value4);
    public static final AlgorithmType_scoringSchemeTypeValue value5 = new AlgorithmType_scoringSchemeTypeValue(_value5);
    public static final AlgorithmType_scoringSchemeTypeValue value6 = new AlgorithmType_scoringSchemeTypeValue(_value6);
    public static final AlgorithmType_scoringSchemeTypeValue value7 = new AlgorithmType_scoringSchemeTypeValue(_value7);
    public static final AlgorithmType_scoringSchemeTypeValue value8 = new AlgorithmType_scoringSchemeTypeValue(_value8);
    public static final AlgorithmType_scoringSchemeTypeValue value9 = new AlgorithmType_scoringSchemeTypeValue(_value9);
    public static final AlgorithmType_scoringSchemeTypeValue value10 = new AlgorithmType_scoringSchemeTypeValue(_value10);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static AlgorithmType_scoringSchemeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        AlgorithmType_scoringSchemeTypeValue enumeration = (AlgorithmType_scoringSchemeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlgorithmType_scoringSchemeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlgorithmType_scoringSchemeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Algorithm-type_scoring-SchemeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
