/**
 * BioSource_genomeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BioSource_genomeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BioSource_genomeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("unknown");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("genomic");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("chloroplast");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("chromoplast");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("kinetoplast");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("mitochondrion");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("plastid");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("macronuclear");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("extrachrom");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("plasmid");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("transposon");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("insertion-seq");
    public static final org.apache.axis.types.NMToken _value13 = new org.apache.axis.types.NMToken("cyanelle");
    public static final org.apache.axis.types.NMToken _value14 = new org.apache.axis.types.NMToken("proviral");
    public static final org.apache.axis.types.NMToken _value15 = new org.apache.axis.types.NMToken("virion");
    public static final org.apache.axis.types.NMToken _value16 = new org.apache.axis.types.NMToken("nucleomorph");
    public static final org.apache.axis.types.NMToken _value17 = new org.apache.axis.types.NMToken("apicoplast");
    public static final org.apache.axis.types.NMToken _value18 = new org.apache.axis.types.NMToken("leucoplast");
    public static final org.apache.axis.types.NMToken _value19 = new org.apache.axis.types.NMToken("proplastid");
    public static final org.apache.axis.types.NMToken _value20 = new org.apache.axis.types.NMToken("endogenous-virus");
    public static final org.apache.axis.types.NMToken _value21 = new org.apache.axis.types.NMToken("hydrogenosome");
    public static final BioSource_genomeTypeValue value1 = new BioSource_genomeTypeValue(_value1);
    public static final BioSource_genomeTypeValue value2 = new BioSource_genomeTypeValue(_value2);
    public static final BioSource_genomeTypeValue value3 = new BioSource_genomeTypeValue(_value3);
    public static final BioSource_genomeTypeValue value4 = new BioSource_genomeTypeValue(_value4);
    public static final BioSource_genomeTypeValue value5 = new BioSource_genomeTypeValue(_value5);
    public static final BioSource_genomeTypeValue value6 = new BioSource_genomeTypeValue(_value6);
    public static final BioSource_genomeTypeValue value7 = new BioSource_genomeTypeValue(_value7);
    public static final BioSource_genomeTypeValue value8 = new BioSource_genomeTypeValue(_value8);
    public static final BioSource_genomeTypeValue value9 = new BioSource_genomeTypeValue(_value9);
    public static final BioSource_genomeTypeValue value10 = new BioSource_genomeTypeValue(_value10);
    public static final BioSource_genomeTypeValue value11 = new BioSource_genomeTypeValue(_value11);
    public static final BioSource_genomeTypeValue value12 = new BioSource_genomeTypeValue(_value12);
    public static final BioSource_genomeTypeValue value13 = new BioSource_genomeTypeValue(_value13);
    public static final BioSource_genomeTypeValue value14 = new BioSource_genomeTypeValue(_value14);
    public static final BioSource_genomeTypeValue value15 = new BioSource_genomeTypeValue(_value15);
    public static final BioSource_genomeTypeValue value16 = new BioSource_genomeTypeValue(_value16);
    public static final BioSource_genomeTypeValue value17 = new BioSource_genomeTypeValue(_value17);
    public static final BioSource_genomeTypeValue value18 = new BioSource_genomeTypeValue(_value18);
    public static final BioSource_genomeTypeValue value19 = new BioSource_genomeTypeValue(_value19);
    public static final BioSource_genomeTypeValue value20 = new BioSource_genomeTypeValue(_value20);
    public static final BioSource_genomeTypeValue value21 = new BioSource_genomeTypeValue(_value21);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static BioSource_genomeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        BioSource_genomeTypeValue enumeration = (BioSource_genomeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BioSource_genomeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BioSource_genomeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">BioSource_genomeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
