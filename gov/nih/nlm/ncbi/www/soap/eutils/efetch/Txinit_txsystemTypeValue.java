/**
 * Txinit_txsystemTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Txinit_txsystemTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Txinit_txsystemTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _unknown = new org.apache.axis.types.NMToken("unknown");
    public static final org.apache.axis.types.NMToken _pol1 = new org.apache.axis.types.NMToken("pol1");
    public static final org.apache.axis.types.NMToken _pol2 = new org.apache.axis.types.NMToken("pol2");
    public static final org.apache.axis.types.NMToken _pol3 = new org.apache.axis.types.NMToken("pol3");
    public static final org.apache.axis.types.NMToken _bacterial = new org.apache.axis.types.NMToken("bacterial");
    public static final org.apache.axis.types.NMToken _viral = new org.apache.axis.types.NMToken("viral");
    public static final org.apache.axis.types.NMToken _rna = new org.apache.axis.types.NMToken("rna");
    public static final org.apache.axis.types.NMToken _organelle = new org.apache.axis.types.NMToken("organelle");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final Txinit_txsystemTypeValue unknown = new Txinit_txsystemTypeValue(_unknown);
    public static final Txinit_txsystemTypeValue pol1 = new Txinit_txsystemTypeValue(_pol1);
    public static final Txinit_txsystemTypeValue pol2 = new Txinit_txsystemTypeValue(_pol2);
    public static final Txinit_txsystemTypeValue pol3 = new Txinit_txsystemTypeValue(_pol3);
    public static final Txinit_txsystemTypeValue bacterial = new Txinit_txsystemTypeValue(_bacterial);
    public static final Txinit_txsystemTypeValue viral = new Txinit_txsystemTypeValue(_viral);
    public static final Txinit_txsystemTypeValue rna = new Txinit_txsystemTypeValue(_rna);
    public static final Txinit_txsystemTypeValue organelle = new Txinit_txsystemTypeValue(_organelle);
    public static final Txinit_txsystemTypeValue other = new Txinit_txsystemTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Txinit_txsystemTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Txinit_txsystemTypeValue enumeration = (Txinit_txsystemTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Txinit_txsystemTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Txinit_txsystemTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Txinit_txsystemType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
