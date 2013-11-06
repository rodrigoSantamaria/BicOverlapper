/**
 * EntrezStyleTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EntrezStyleTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EntrezStyleTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _docsum = new org.apache.axis.types.NMToken("docsum");
    public static final org.apache.axis.types.NMToken _genbank = new org.apache.axis.types.NMToken("genbank");
    public static final org.apache.axis.types.NMToken _genpept = new org.apache.axis.types.NMToken("genpept");
    public static final org.apache.axis.types.NMToken _fasta = new org.apache.axis.types.NMToken("fasta");
    public static final org.apache.axis.types.NMToken _asn1 = new org.apache.axis.types.NMToken("asn1");
    public static final org.apache.axis.types.NMToken _graphic = new org.apache.axis.types.NMToken("graphic");
    public static final org.apache.axis.types.NMToken _alignment = new org.apache.axis.types.NMToken("alignment");
    public static final org.apache.axis.types.NMToken _globalview = new org.apache.axis.types.NMToken("globalview");
    public static final org.apache.axis.types.NMToken _report = new org.apache.axis.types.NMToken("report");
    public static final org.apache.axis.types.NMToken _medlars = new org.apache.axis.types.NMToken("medlars");
    public static final org.apache.axis.types.NMToken _embl = new org.apache.axis.types.NMToken("embl");
    public static final org.apache.axis.types.NMToken _pdb = new org.apache.axis.types.NMToken("pdb");
    public static final org.apache.axis.types.NMToken _kinemage = new org.apache.axis.types.NMToken("kinemage");
    public static final EntrezStyleTypeValue docsum = new EntrezStyleTypeValue(_docsum);
    public static final EntrezStyleTypeValue genbank = new EntrezStyleTypeValue(_genbank);
    public static final EntrezStyleTypeValue genpept = new EntrezStyleTypeValue(_genpept);
    public static final EntrezStyleTypeValue fasta = new EntrezStyleTypeValue(_fasta);
    public static final EntrezStyleTypeValue asn1 = new EntrezStyleTypeValue(_asn1);
    public static final EntrezStyleTypeValue graphic = new EntrezStyleTypeValue(_graphic);
    public static final EntrezStyleTypeValue alignment = new EntrezStyleTypeValue(_alignment);
    public static final EntrezStyleTypeValue globalview = new EntrezStyleTypeValue(_globalview);
    public static final EntrezStyleTypeValue report = new EntrezStyleTypeValue(_report);
    public static final EntrezStyleTypeValue medlars = new EntrezStyleTypeValue(_medlars);
    public static final EntrezStyleTypeValue embl = new EntrezStyleTypeValue(_embl);
    public static final EntrezStyleTypeValue pdb = new EntrezStyleTypeValue(_pdb);
    public static final EntrezStyleTypeValue kinemage = new EntrezStyleTypeValue(_kinemage);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static EntrezStyleTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        EntrezStyleTypeValue enumeration = (EntrezStyleTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EntrezStyleTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EntrezStyleTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Entrez-styleType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
