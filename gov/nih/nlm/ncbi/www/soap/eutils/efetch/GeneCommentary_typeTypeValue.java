/**
 * GeneCommentary_typeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GeneCommentary_typeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GeneCommentary_typeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("genomic");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("pre-RNA");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("mRNA");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("rRNA");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("tRNA");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("snRNA");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("scRNA");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("peptide");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("other-genetic");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("genomic-mRNA");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("cRNA");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("mature-peptide");
    public static final org.apache.axis.types.NMToken _value13 = new org.apache.axis.types.NMToken("pre-protein");
    public static final org.apache.axis.types.NMToken _value14 = new org.apache.axis.types.NMToken("miscRNA");
    public static final org.apache.axis.types.NMToken _value15 = new org.apache.axis.types.NMToken("snoRNA");
    public static final org.apache.axis.types.NMToken _value16 = new org.apache.axis.types.NMToken("property");
    public static final org.apache.axis.types.NMToken _value17 = new org.apache.axis.types.NMToken("reference");
    public static final org.apache.axis.types.NMToken _value18 = new org.apache.axis.types.NMToken("generif");
    public static final org.apache.axis.types.NMToken _value19 = new org.apache.axis.types.NMToken("phenotype");
    public static final org.apache.axis.types.NMToken _value20 = new org.apache.axis.types.NMToken("complex");
    public static final org.apache.axis.types.NMToken _value21 = new org.apache.axis.types.NMToken("compound");
    public static final org.apache.axis.types.NMToken _value22 = new org.apache.axis.types.NMToken("comment");
    public static final org.apache.axis.types.NMToken _value23 = new org.apache.axis.types.NMToken("other");
    public static final GeneCommentary_typeTypeValue value1 = new GeneCommentary_typeTypeValue(_value1);
    public static final GeneCommentary_typeTypeValue value2 = new GeneCommentary_typeTypeValue(_value2);
    public static final GeneCommentary_typeTypeValue value3 = new GeneCommentary_typeTypeValue(_value3);
    public static final GeneCommentary_typeTypeValue value4 = new GeneCommentary_typeTypeValue(_value4);
    public static final GeneCommentary_typeTypeValue value5 = new GeneCommentary_typeTypeValue(_value5);
    public static final GeneCommentary_typeTypeValue value6 = new GeneCommentary_typeTypeValue(_value6);
    public static final GeneCommentary_typeTypeValue value7 = new GeneCommentary_typeTypeValue(_value7);
    public static final GeneCommentary_typeTypeValue value8 = new GeneCommentary_typeTypeValue(_value8);
    public static final GeneCommentary_typeTypeValue value9 = new GeneCommentary_typeTypeValue(_value9);
    public static final GeneCommentary_typeTypeValue value10 = new GeneCommentary_typeTypeValue(_value10);
    public static final GeneCommentary_typeTypeValue value11 = new GeneCommentary_typeTypeValue(_value11);
    public static final GeneCommentary_typeTypeValue value12 = new GeneCommentary_typeTypeValue(_value12);
    public static final GeneCommentary_typeTypeValue value13 = new GeneCommentary_typeTypeValue(_value13);
    public static final GeneCommentary_typeTypeValue value14 = new GeneCommentary_typeTypeValue(_value14);
    public static final GeneCommentary_typeTypeValue value15 = new GeneCommentary_typeTypeValue(_value15);
    public static final GeneCommentary_typeTypeValue value16 = new GeneCommentary_typeTypeValue(_value16);
    public static final GeneCommentary_typeTypeValue value17 = new GeneCommentary_typeTypeValue(_value17);
    public static final GeneCommentary_typeTypeValue value18 = new GeneCommentary_typeTypeValue(_value18);
    public static final GeneCommentary_typeTypeValue value19 = new GeneCommentary_typeTypeValue(_value19);
    public static final GeneCommentary_typeTypeValue value20 = new GeneCommentary_typeTypeValue(_value20);
    public static final GeneCommentary_typeTypeValue value21 = new GeneCommentary_typeTypeValue(_value21);
    public static final GeneCommentary_typeTypeValue value22 = new GeneCommentary_typeTypeValue(_value22);
    public static final GeneCommentary_typeTypeValue value23 = new GeneCommentary_typeTypeValue(_value23);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static GeneCommentary_typeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        GeneCommentary_typeTypeValue enumeration = (GeneCommentary_typeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GeneCommentary_typeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GeneCommentary_typeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Gene-commentary_typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
