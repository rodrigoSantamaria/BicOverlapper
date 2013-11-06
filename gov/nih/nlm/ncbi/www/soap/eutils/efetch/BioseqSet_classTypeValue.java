/**
 * BioseqSet_classTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BioseqSet_classTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BioseqSet_classTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("not-set");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("nuc-prot");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("segset");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("conset");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("parts");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("gibb");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("gi");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("genbank");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("pir");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("pub-set");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("equiv");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("swissprot");
    public static final org.apache.axis.types.NMToken _value13 = new org.apache.axis.types.NMToken("pdb-entry");
    public static final org.apache.axis.types.NMToken _value14 = new org.apache.axis.types.NMToken("mut-set");
    public static final org.apache.axis.types.NMToken _value15 = new org.apache.axis.types.NMToken("pop-set");
    public static final org.apache.axis.types.NMToken _value16 = new org.apache.axis.types.NMToken("phy-set");
    public static final org.apache.axis.types.NMToken _value17 = new org.apache.axis.types.NMToken("eco-set");
    public static final org.apache.axis.types.NMToken _value18 = new org.apache.axis.types.NMToken("gen-prod-set");
    public static final org.apache.axis.types.NMToken _value19 = new org.apache.axis.types.NMToken("wgs-set");
    public static final org.apache.axis.types.NMToken _value20 = new org.apache.axis.types.NMToken("other");
    public static final BioseqSet_classTypeValue value1 = new BioseqSet_classTypeValue(_value1);
    public static final BioseqSet_classTypeValue value2 = new BioseqSet_classTypeValue(_value2);
    public static final BioseqSet_classTypeValue value3 = new BioseqSet_classTypeValue(_value3);
    public static final BioseqSet_classTypeValue value4 = new BioseqSet_classTypeValue(_value4);
    public static final BioseqSet_classTypeValue value5 = new BioseqSet_classTypeValue(_value5);
    public static final BioseqSet_classTypeValue value6 = new BioseqSet_classTypeValue(_value6);
    public static final BioseqSet_classTypeValue value7 = new BioseqSet_classTypeValue(_value7);
    public static final BioseqSet_classTypeValue value8 = new BioseqSet_classTypeValue(_value8);
    public static final BioseqSet_classTypeValue value9 = new BioseqSet_classTypeValue(_value9);
    public static final BioseqSet_classTypeValue value10 = new BioseqSet_classTypeValue(_value10);
    public static final BioseqSet_classTypeValue value11 = new BioseqSet_classTypeValue(_value11);
    public static final BioseqSet_classTypeValue value12 = new BioseqSet_classTypeValue(_value12);
    public static final BioseqSet_classTypeValue value13 = new BioseqSet_classTypeValue(_value13);
    public static final BioseqSet_classTypeValue value14 = new BioseqSet_classTypeValue(_value14);
    public static final BioseqSet_classTypeValue value15 = new BioseqSet_classTypeValue(_value15);
    public static final BioseqSet_classTypeValue value16 = new BioseqSet_classTypeValue(_value16);
    public static final BioseqSet_classTypeValue value17 = new BioseqSet_classTypeValue(_value17);
    public static final BioseqSet_classTypeValue value18 = new BioseqSet_classTypeValue(_value18);
    public static final BioseqSet_classTypeValue value19 = new BioseqSet_classTypeValue(_value19);
    public static final BioseqSet_classTypeValue value20 = new BioseqSet_classTypeValue(_value20);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static BioseqSet_classTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        BioseqSet_classTypeValue enumeration = (BioseqSet_classTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BioseqSet_classTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BioseqSet_classTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Bioseq-set_classType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
