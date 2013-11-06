/**
 * GeneTrack_statusTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GeneTrack_statusTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GeneTrack_statusTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _live = new org.apache.axis.types.NMToken("live");
    public static final org.apache.axis.types.NMToken _secondary = new org.apache.axis.types.NMToken("secondary");
    public static final org.apache.axis.types.NMToken _discontinued = new org.apache.axis.types.NMToken("discontinued");
    public static final org.apache.axis.types.NMToken _newentry = new org.apache.axis.types.NMToken("newentry");
    public static final GeneTrack_statusTypeValue live = new GeneTrack_statusTypeValue(_live);
    public static final GeneTrack_statusTypeValue secondary = new GeneTrack_statusTypeValue(_secondary);
    public static final GeneTrack_statusTypeValue discontinued = new GeneTrack_statusTypeValue(_discontinued);
    public static final GeneTrack_statusTypeValue newentry = new GeneTrack_statusTypeValue(_newentry);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static GeneTrack_statusTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        GeneTrack_statusTypeValue enumeration = (GeneTrack_statusTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GeneTrack_statusTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GeneTrack_statusTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Gene-track_statusType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
