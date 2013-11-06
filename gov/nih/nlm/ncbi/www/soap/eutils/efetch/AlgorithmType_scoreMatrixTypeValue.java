/**
 * AlgorithmType_scoreMatrixTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AlgorithmType_scoreMatrixTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlgorithmType_scoreMatrixTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _unassigned = new org.apache.axis.types.NMToken("unassigned");
    public static final org.apache.axis.types.NMToken _blosum45 = new org.apache.axis.types.NMToken("blosum45");
    public static final org.apache.axis.types.NMToken _blosum62 = new org.apache.axis.types.NMToken("blosum62");
    public static final org.apache.axis.types.NMToken _blosum80 = new org.apache.axis.types.NMToken("blosum80");
    public static final org.apache.axis.types.NMToken _pam30 = new org.apache.axis.types.NMToken("pam30");
    public static final org.apache.axis.types.NMToken _pam70 = new org.apache.axis.types.NMToken("pam70");
    public static final org.apache.axis.types.NMToken _pam250 = new org.apache.axis.types.NMToken("pam250");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final AlgorithmType_scoreMatrixTypeValue unassigned = new AlgorithmType_scoreMatrixTypeValue(_unassigned);
    public static final AlgorithmType_scoreMatrixTypeValue blosum45 = new AlgorithmType_scoreMatrixTypeValue(_blosum45);
    public static final AlgorithmType_scoreMatrixTypeValue blosum62 = new AlgorithmType_scoreMatrixTypeValue(_blosum62);
    public static final AlgorithmType_scoreMatrixTypeValue blosum80 = new AlgorithmType_scoreMatrixTypeValue(_blosum80);
    public static final AlgorithmType_scoreMatrixTypeValue pam30 = new AlgorithmType_scoreMatrixTypeValue(_pam30);
    public static final AlgorithmType_scoreMatrixTypeValue pam70 = new AlgorithmType_scoreMatrixTypeValue(_pam70);
    public static final AlgorithmType_scoreMatrixTypeValue pam250 = new AlgorithmType_scoreMatrixTypeValue(_pam250);
    public static final AlgorithmType_scoreMatrixTypeValue other = new AlgorithmType_scoreMatrixTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static AlgorithmType_scoreMatrixTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        AlgorithmType_scoreMatrixTypeValue enumeration = (AlgorithmType_scoreMatrixTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlgorithmType_scoreMatrixTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlgorithmType_scoreMatrixTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Algorithm-type_score-MatrixType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
