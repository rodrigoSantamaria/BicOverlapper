/**
 * Assay_molTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Assay_molTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Assay_molTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _genomic = new org.apache.axis.types.NMToken("genomic");
    public static final org.apache.axis.types.NMToken _cDNA = new org.apache.axis.types.NMToken("cDNA");
    public static final org.apache.axis.types.NMToken _mito = new org.apache.axis.types.NMToken("mito");
    public static final org.apache.axis.types.NMToken _chloro = new org.apache.axis.types.NMToken("chloro");
    public static final Assay_molTypeTypeValue genomic = new Assay_molTypeTypeValue(_genomic);
    public static final Assay_molTypeTypeValue cDNA = new Assay_molTypeTypeValue(_cDNA);
    public static final Assay_molTypeTypeValue mito = new Assay_molTypeTypeValue(_mito);
    public static final Assay_molTypeTypeValue chloro = new Assay_molTypeTypeValue(_chloro);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Assay_molTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Assay_molTypeTypeValue enumeration = (Assay_molTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Assay_molTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Assay_molTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Assay_molTypeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
