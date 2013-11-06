/**
 * CollaborativePartnerDateTypeOwner.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CollaborativePartnerDateTypeOwner implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CollaborativePartnerDateTypeOwner(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _HMD = new org.apache.axis.types.NMToken("HMD");
    public static final org.apache.axis.types.NMToken _HSR = new org.apache.axis.types.NMToken("HSR");
    public static final org.apache.axis.types.NMToken _KIE = new org.apache.axis.types.NMToken("KIE");
    public static final org.apache.axis.types.NMToken _NASA = new org.apache.axis.types.NMToken("NASA");
    public static final org.apache.axis.types.NMToken _NCBI = new org.apache.axis.types.NMToken("NCBI");
    public static final org.apache.axis.types.NMToken _NLM = new org.apache.axis.types.NMToken("NLM");
    public static final org.apache.axis.types.NMToken _NOTNLM = new org.apache.axis.types.NMToken("NOTNLM");
    public static final org.apache.axis.types.NMToken _NYA = new org.apache.axis.types.NMToken("NYA");
    public static final org.apache.axis.types.NMToken _PIP = new org.apache.axis.types.NMToken("PIP");
    public static final org.apache.axis.types.NMToken _Undetermined = new org.apache.axis.types.NMToken("Undetermined");
    public static final CollaborativePartnerDateTypeOwner HMD = new CollaborativePartnerDateTypeOwner(_HMD);
    public static final CollaborativePartnerDateTypeOwner HSR = new CollaborativePartnerDateTypeOwner(_HSR);
    public static final CollaborativePartnerDateTypeOwner KIE = new CollaborativePartnerDateTypeOwner(_KIE);
    public static final CollaborativePartnerDateTypeOwner NASA = new CollaborativePartnerDateTypeOwner(_NASA);
    public static final CollaborativePartnerDateTypeOwner NCBI = new CollaborativePartnerDateTypeOwner(_NCBI);
    public static final CollaborativePartnerDateTypeOwner NLM = new CollaborativePartnerDateTypeOwner(_NLM);
    public static final CollaborativePartnerDateTypeOwner NOTNLM = new CollaborativePartnerDateTypeOwner(_NOTNLM);
    public static final CollaborativePartnerDateTypeOwner NYA = new CollaborativePartnerDateTypeOwner(_NYA);
    public static final CollaborativePartnerDateTypeOwner PIP = new CollaborativePartnerDateTypeOwner(_PIP);
    public static final CollaborativePartnerDateTypeOwner Undetermined = new CollaborativePartnerDateTypeOwner(_Undetermined);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static CollaborativePartnerDateTypeOwner fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        CollaborativePartnerDateTypeOwner enumeration = (CollaborativePartnerDateTypeOwner)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CollaborativePartnerDateTypeOwner fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CollaborativePartnerDateTypeOwner.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">CollaborativePartnerDateType>Owner"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
