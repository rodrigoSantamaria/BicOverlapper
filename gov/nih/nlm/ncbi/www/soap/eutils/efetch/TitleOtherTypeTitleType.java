/**
 * TitleOtherTypeTitleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TitleOtherTypeTitleType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TitleOtherTypeTitleType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _Absorbed = new org.apache.axis.types.NMToken("Absorbed");
    public static final org.apache.axis.types.NMToken _AbsorbedBy = new org.apache.axis.types.NMToken("AbsorbedBy");
    public static final org.apache.axis.types.NMToken _Analytic = new org.apache.axis.types.NMToken("Analytic");
    public static final org.apache.axis.types.NMToken _Key = new org.apache.axis.types.NMToken("Key");
    public static final org.apache.axis.types.NMToken _MergedTo = new org.apache.axis.types.NMToken("MergedTo");
    public static final org.apache.axis.types.NMToken _MergerOf = new org.apache.axis.types.NMToken("MergerOf");
    public static final org.apache.axis.types.NMToken _Other = new org.apache.axis.types.NMToken("Other");
    public static final org.apache.axis.types.NMToken _OtherTA = new org.apache.axis.types.NMToken("OtherTA");
    public static final org.apache.axis.types.NMToken _Preceding = new org.apache.axis.types.NMToken("Preceding");
    public static final org.apache.axis.types.NMToken _Related = new org.apache.axis.types.NMToken("Related");
    public static final org.apache.axis.types.NMToken _Reversion = new org.apache.axis.types.NMToken("Reversion");
    public static final org.apache.axis.types.NMToken _Series = new org.apache.axis.types.NMToken("Series");
    public static final org.apache.axis.types.NMToken _SeriesAuthority = new org.apache.axis.types.NMToken("SeriesAuthority");
    public static final org.apache.axis.types.NMToken _SplitFrom = new org.apache.axis.types.NMToken("SplitFrom");
    public static final org.apache.axis.types.NMToken _SplitTo = new org.apache.axis.types.NMToken("SplitTo");
    public static final org.apache.axis.types.NMToken _Succeeding = new org.apache.axis.types.NMToken("Succeeding");
    public static final org.apache.axis.types.NMToken _SupersededBy = new org.apache.axis.types.NMToken("SupersededBy");
    public static final org.apache.axis.types.NMToken _Supersedes = new org.apache.axis.types.NMToken("Supersedes");
    public static final org.apache.axis.types.NMToken _Translated = new org.apache.axis.types.NMToken("Translated");
    public static final org.apache.axis.types.NMToken _Undetermined = new org.apache.axis.types.NMToken("Undetermined");
    public static final org.apache.axis.types.NMToken _Uniform = new org.apache.axis.types.NMToken("Uniform");
    public static final TitleOtherTypeTitleType Absorbed = new TitleOtherTypeTitleType(_Absorbed);
    public static final TitleOtherTypeTitleType AbsorbedBy = new TitleOtherTypeTitleType(_AbsorbedBy);
    public static final TitleOtherTypeTitleType Analytic = new TitleOtherTypeTitleType(_Analytic);
    public static final TitleOtherTypeTitleType Key = new TitleOtherTypeTitleType(_Key);
    public static final TitleOtherTypeTitleType MergedTo = new TitleOtherTypeTitleType(_MergedTo);
    public static final TitleOtherTypeTitleType MergerOf = new TitleOtherTypeTitleType(_MergerOf);
    public static final TitleOtherTypeTitleType Other = new TitleOtherTypeTitleType(_Other);
    public static final TitleOtherTypeTitleType OtherTA = new TitleOtherTypeTitleType(_OtherTA);
    public static final TitleOtherTypeTitleType Preceding = new TitleOtherTypeTitleType(_Preceding);
    public static final TitleOtherTypeTitleType Related = new TitleOtherTypeTitleType(_Related);
    public static final TitleOtherTypeTitleType Reversion = new TitleOtherTypeTitleType(_Reversion);
    public static final TitleOtherTypeTitleType Series = new TitleOtherTypeTitleType(_Series);
    public static final TitleOtherTypeTitleType SeriesAuthority = new TitleOtherTypeTitleType(_SeriesAuthority);
    public static final TitleOtherTypeTitleType SplitFrom = new TitleOtherTypeTitleType(_SplitFrom);
    public static final TitleOtherTypeTitleType SplitTo = new TitleOtherTypeTitleType(_SplitTo);
    public static final TitleOtherTypeTitleType Succeeding = new TitleOtherTypeTitleType(_Succeeding);
    public static final TitleOtherTypeTitleType SupersededBy = new TitleOtherTypeTitleType(_SupersededBy);
    public static final TitleOtherTypeTitleType Supersedes = new TitleOtherTypeTitleType(_Supersedes);
    public static final TitleOtherTypeTitleType Translated = new TitleOtherTypeTitleType(_Translated);
    public static final TitleOtherTypeTitleType Undetermined = new TitleOtherTypeTitleType(_Undetermined);
    public static final TitleOtherTypeTitleType Uniform = new TitleOtherTypeTitleType(_Uniform);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static TitleOtherTypeTitleType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        TitleOtherTypeTitleType enumeration = (TitleOtherTypeTitleType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TitleOtherTypeTitleType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TitleOtherTypeTitleType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">TitleOtherType>TitleType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
