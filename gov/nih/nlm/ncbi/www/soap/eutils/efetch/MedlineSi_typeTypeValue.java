/**
 * MedlineSi_typeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineSi_typeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MedlineSi_typeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _ddbj = new org.apache.axis.types.NMToken("ddbj");
    public static final org.apache.axis.types.NMToken _carbbank = new org.apache.axis.types.NMToken("carbbank");
    public static final org.apache.axis.types.NMToken _embl = new org.apache.axis.types.NMToken("embl");
    public static final org.apache.axis.types.NMToken _hdb = new org.apache.axis.types.NMToken("hdb");
    public static final org.apache.axis.types.NMToken _genbank = new org.apache.axis.types.NMToken("genbank");
    public static final org.apache.axis.types.NMToken _hgml = new org.apache.axis.types.NMToken("hgml");
    public static final org.apache.axis.types.NMToken _mim = new org.apache.axis.types.NMToken("mim");
    public static final org.apache.axis.types.NMToken _msd = new org.apache.axis.types.NMToken("msd");
    public static final org.apache.axis.types.NMToken _pdb = new org.apache.axis.types.NMToken("pdb");
    public static final org.apache.axis.types.NMToken _pir = new org.apache.axis.types.NMToken("pir");
    public static final org.apache.axis.types.NMToken _prfseqdb = new org.apache.axis.types.NMToken("prfseqdb");
    public static final org.apache.axis.types.NMToken _psd = new org.apache.axis.types.NMToken("psd");
    public static final org.apache.axis.types.NMToken _swissprot = new org.apache.axis.types.NMToken("swissprot");
    public static final org.apache.axis.types.NMToken _gdb = new org.apache.axis.types.NMToken("gdb");
    public static final MedlineSi_typeTypeValue ddbj = new MedlineSi_typeTypeValue(_ddbj);
    public static final MedlineSi_typeTypeValue carbbank = new MedlineSi_typeTypeValue(_carbbank);
    public static final MedlineSi_typeTypeValue embl = new MedlineSi_typeTypeValue(_embl);
    public static final MedlineSi_typeTypeValue hdb = new MedlineSi_typeTypeValue(_hdb);
    public static final MedlineSi_typeTypeValue genbank = new MedlineSi_typeTypeValue(_genbank);
    public static final MedlineSi_typeTypeValue hgml = new MedlineSi_typeTypeValue(_hgml);
    public static final MedlineSi_typeTypeValue mim = new MedlineSi_typeTypeValue(_mim);
    public static final MedlineSi_typeTypeValue msd = new MedlineSi_typeTypeValue(_msd);
    public static final MedlineSi_typeTypeValue pdb = new MedlineSi_typeTypeValue(_pdb);
    public static final MedlineSi_typeTypeValue pir = new MedlineSi_typeTypeValue(_pir);
    public static final MedlineSi_typeTypeValue prfseqdb = new MedlineSi_typeTypeValue(_prfseqdb);
    public static final MedlineSi_typeTypeValue psd = new MedlineSi_typeTypeValue(_psd);
    public static final MedlineSi_typeTypeValue swissprot = new MedlineSi_typeTypeValue(_swissprot);
    public static final MedlineSi_typeTypeValue gdb = new MedlineSi_typeTypeValue(_gdb);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static MedlineSi_typeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        MedlineSi_typeTypeValue enumeration = (MedlineSi_typeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MedlineSi_typeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MedlineSi_typeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Medline-si_typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
