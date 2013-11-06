/**
 * ID2BlobId_subSatTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2BlobId_subSatTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ID2BlobId_subSatTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("main");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("snp");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("snp-graph");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("cdd");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("mgc");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("hprd");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("sts");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("trna");
    public static final ID2BlobId_subSatTypeValue value1 = new ID2BlobId_subSatTypeValue(_value1);
    public static final ID2BlobId_subSatTypeValue value2 = new ID2BlobId_subSatTypeValue(_value2);
    public static final ID2BlobId_subSatTypeValue value3 = new ID2BlobId_subSatTypeValue(_value3);
    public static final ID2BlobId_subSatTypeValue value4 = new ID2BlobId_subSatTypeValue(_value4);
    public static final ID2BlobId_subSatTypeValue value5 = new ID2BlobId_subSatTypeValue(_value5);
    public static final ID2BlobId_subSatTypeValue value6 = new ID2BlobId_subSatTypeValue(_value6);
    public static final ID2BlobId_subSatTypeValue value7 = new ID2BlobId_subSatTypeValue(_value7);
    public static final ID2BlobId_subSatTypeValue value8 = new ID2BlobId_subSatTypeValue(_value8);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static ID2BlobId_subSatTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        ID2BlobId_subSatTypeValue enumeration = (ID2BlobId_subSatTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ID2BlobId_subSatTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ID2BlobId_subSatTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2-Blob-Id_sub-satType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
