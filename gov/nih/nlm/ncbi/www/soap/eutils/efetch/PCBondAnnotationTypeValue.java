/**
 * PCBondAnnotationTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCBondAnnotationTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PCBondAnnotationTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("crossed");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("dashed");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("wavy");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("dotted");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("wedge-up");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("wedge-down");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("arrow");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("aromatic");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("resonance");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("bold");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("fischer");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("closeContact");
    public static final org.apache.axis.types.NMToken _value13 = new org.apache.axis.types.NMToken("unknown");
    public static final PCBondAnnotationTypeValue value1 = new PCBondAnnotationTypeValue(_value1);
    public static final PCBondAnnotationTypeValue value2 = new PCBondAnnotationTypeValue(_value2);
    public static final PCBondAnnotationTypeValue value3 = new PCBondAnnotationTypeValue(_value3);
    public static final PCBondAnnotationTypeValue value4 = new PCBondAnnotationTypeValue(_value4);
    public static final PCBondAnnotationTypeValue value5 = new PCBondAnnotationTypeValue(_value5);
    public static final PCBondAnnotationTypeValue value6 = new PCBondAnnotationTypeValue(_value6);
    public static final PCBondAnnotationTypeValue value7 = new PCBondAnnotationTypeValue(_value7);
    public static final PCBondAnnotationTypeValue value8 = new PCBondAnnotationTypeValue(_value8);
    public static final PCBondAnnotationTypeValue value9 = new PCBondAnnotationTypeValue(_value9);
    public static final PCBondAnnotationTypeValue value10 = new PCBondAnnotationTypeValue(_value10);
    public static final PCBondAnnotationTypeValue value11 = new PCBondAnnotationTypeValue(_value11);
    public static final PCBondAnnotationTypeValue value12 = new PCBondAnnotationTypeValue(_value12);
    public static final PCBondAnnotationTypeValue value13 = new PCBondAnnotationTypeValue(_value13);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static PCBondAnnotationTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        PCBondAnnotationTypeValue enumeration = (PCBondAnnotationTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PCBondAnnotationTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PCBondAnnotationTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PC-BondAnnotationType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
