/**
 * EntryComplexitiesTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EntryComplexitiesTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EntryComplexitiesTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("entry");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("bioseq");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("bioseq-set");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("nuc-prot");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("pub-set");
    public static final EntryComplexitiesTypeValue value1 = new EntryComplexitiesTypeValue(_value1);
    public static final EntryComplexitiesTypeValue value2 = new EntryComplexitiesTypeValue(_value2);
    public static final EntryComplexitiesTypeValue value3 = new EntryComplexitiesTypeValue(_value3);
    public static final EntryComplexitiesTypeValue value4 = new EntryComplexitiesTypeValue(_value4);
    public static final EntryComplexitiesTypeValue value5 = new EntryComplexitiesTypeValue(_value5);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static EntryComplexitiesTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        EntryComplexitiesTypeValue enumeration = (EntryComplexitiesTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EntryComplexitiesTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EntryComplexitiesTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Entry-complexitiesType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
