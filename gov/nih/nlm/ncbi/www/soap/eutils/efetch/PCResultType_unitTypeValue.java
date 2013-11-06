/**
 * PCResultType_unitTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCResultType_unitTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PCResultType_unitTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _ppt = new org.apache.axis.types.NMToken("ppt");
    public static final org.apache.axis.types.NMToken _ppm = new org.apache.axis.types.NMToken("ppm");
    public static final org.apache.axis.types.NMToken _ppb = new org.apache.axis.types.NMToken("ppb");
    public static final org.apache.axis.types.NMToken _mm = new org.apache.axis.types.NMToken("mm");
    public static final org.apache.axis.types.NMToken _um = new org.apache.axis.types.NMToken("um");
    public static final org.apache.axis.types.NMToken _nm = new org.apache.axis.types.NMToken("nm");
    public static final org.apache.axis.types.NMToken _pm = new org.apache.axis.types.NMToken("pm");
    public static final org.apache.axis.types.NMToken _fm = new org.apache.axis.types.NMToken("fm");
    public static final org.apache.axis.types.NMToken _mgml = new org.apache.axis.types.NMToken("mgml");
    public static final org.apache.axis.types.NMToken _ugml = new org.apache.axis.types.NMToken("ugml");
    public static final org.apache.axis.types.NMToken _ngml = new org.apache.axis.types.NMToken("ngml");
    public static final org.apache.axis.types.NMToken _pgml = new org.apache.axis.types.NMToken("pgml");
    public static final org.apache.axis.types.NMToken _fgml = new org.apache.axis.types.NMToken("fgml");
    public static final org.apache.axis.types.NMToken _m = new org.apache.axis.types.NMToken("m");
    public static final org.apache.axis.types.NMToken _percent = new org.apache.axis.types.NMToken("percent");
    public static final org.apache.axis.types.NMToken _ratio = new org.apache.axis.types.NMToken("ratio");
    public static final org.apache.axis.types.NMToken _sec = new org.apache.axis.types.NMToken("sec");
    public static final org.apache.axis.types.NMToken _rsec = new org.apache.axis.types.NMToken("rsec");
    public static final org.apache.axis.types.NMToken _min = new org.apache.axis.types.NMToken("min");
    public static final org.apache.axis.types.NMToken _rmin = new org.apache.axis.types.NMToken("rmin");
    public static final org.apache.axis.types.NMToken _day = new org.apache.axis.types.NMToken("day");
    public static final org.apache.axis.types.NMToken _rday = new org.apache.axis.types.NMToken("rday");
    public static final org.apache.axis.types.NMToken _none = new org.apache.axis.types.NMToken("none");
    public static final org.apache.axis.types.NMToken _unspecified = new org.apache.axis.types.NMToken("unspecified");
    public static final PCResultType_unitTypeValue ppt = new PCResultType_unitTypeValue(_ppt);
    public static final PCResultType_unitTypeValue ppm = new PCResultType_unitTypeValue(_ppm);
    public static final PCResultType_unitTypeValue ppb = new PCResultType_unitTypeValue(_ppb);
    public static final PCResultType_unitTypeValue mm = new PCResultType_unitTypeValue(_mm);
    public static final PCResultType_unitTypeValue um = new PCResultType_unitTypeValue(_um);
    public static final PCResultType_unitTypeValue nm = new PCResultType_unitTypeValue(_nm);
    public static final PCResultType_unitTypeValue pm = new PCResultType_unitTypeValue(_pm);
    public static final PCResultType_unitTypeValue fm = new PCResultType_unitTypeValue(_fm);
    public static final PCResultType_unitTypeValue mgml = new PCResultType_unitTypeValue(_mgml);
    public static final PCResultType_unitTypeValue ugml = new PCResultType_unitTypeValue(_ugml);
    public static final PCResultType_unitTypeValue ngml = new PCResultType_unitTypeValue(_ngml);
    public static final PCResultType_unitTypeValue pgml = new PCResultType_unitTypeValue(_pgml);
    public static final PCResultType_unitTypeValue fgml = new PCResultType_unitTypeValue(_fgml);
    public static final PCResultType_unitTypeValue m = new PCResultType_unitTypeValue(_m);
    public static final PCResultType_unitTypeValue percent = new PCResultType_unitTypeValue(_percent);
    public static final PCResultType_unitTypeValue ratio = new PCResultType_unitTypeValue(_ratio);
    public static final PCResultType_unitTypeValue sec = new PCResultType_unitTypeValue(_sec);
    public static final PCResultType_unitTypeValue rsec = new PCResultType_unitTypeValue(_rsec);
    public static final PCResultType_unitTypeValue min = new PCResultType_unitTypeValue(_min);
    public static final PCResultType_unitTypeValue rmin = new PCResultType_unitTypeValue(_rmin);
    public static final PCResultType_unitTypeValue day = new PCResultType_unitTypeValue(_day);
    public static final PCResultType_unitTypeValue rday = new PCResultType_unitTypeValue(_rday);
    public static final PCResultType_unitTypeValue none = new PCResultType_unitTypeValue(_none);
    public static final PCResultType_unitTypeValue unspecified = new PCResultType_unitTypeValue(_unspecified);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static PCResultType_unitTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        PCResultType_unitTypeValue enumeration = (PCResultType_unitTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PCResultType_unitTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PCResultType_unitTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PC-ResultType_unitType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
