/**
 * CddDescr_curationStatusTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddDescr_curationStatusTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CddDescr_curationStatusTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _unassigned = new org.apache.axis.types.NMToken("unassigned");
    public static final org.apache.axis.types.NMToken _prein = new org.apache.axis.types.NMToken("prein");
    public static final org.apache.axis.types.NMToken _ofc = new org.apache.axis.types.NMToken("ofc");
    public static final org.apache.axis.types.NMToken _iac = new org.apache.axis.types.NMToken("iac");
    public static final org.apache.axis.types.NMToken _ofv1 = new org.apache.axis.types.NMToken("ofv1");
    public static final org.apache.axis.types.NMToken _iav1 = new org.apache.axis.types.NMToken("iav1");
    public static final org.apache.axis.types.NMToken _ofv2 = new org.apache.axis.types.NMToken("ofv2");
    public static final org.apache.axis.types.NMToken _iav2 = new org.apache.axis.types.NMToken("iav2");
    public static final org.apache.axis.types.NMToken _postin = new org.apache.axis.types.NMToken("postin");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final CddDescr_curationStatusTypeValue unassigned = new CddDescr_curationStatusTypeValue(_unassigned);
    public static final CddDescr_curationStatusTypeValue prein = new CddDescr_curationStatusTypeValue(_prein);
    public static final CddDescr_curationStatusTypeValue ofc = new CddDescr_curationStatusTypeValue(_ofc);
    public static final CddDescr_curationStatusTypeValue iac = new CddDescr_curationStatusTypeValue(_iac);
    public static final CddDescr_curationStatusTypeValue ofv1 = new CddDescr_curationStatusTypeValue(_ofv1);
    public static final CddDescr_curationStatusTypeValue iav1 = new CddDescr_curationStatusTypeValue(_iav1);
    public static final CddDescr_curationStatusTypeValue ofv2 = new CddDescr_curationStatusTypeValue(_ofv2);
    public static final CddDescr_curationStatusTypeValue iav2 = new CddDescr_curationStatusTypeValue(_iav2);
    public static final CddDescr_curationStatusTypeValue postin = new CddDescr_curationStatusTypeValue(_postin);
    public static final CddDescr_curationStatusTypeValue other = new CddDescr_curationStatusTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static CddDescr_curationStatusTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        CddDescr_curationStatusTypeValue enumeration = (CddDescr_curationStatusTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CddDescr_curationStatusTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CddDescr_curationStatusTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Cdd-descr_curation-statusType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
