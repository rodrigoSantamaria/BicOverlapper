/**
 * RenderPropTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RenderPropTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RenderPropTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("default");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("wire");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("space");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("stick");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("ballNStick");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("thickWire");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("hide");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("name");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("number");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("pdbNumber");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("objWireFrame");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("objPolygons");
    public static final org.apache.axis.types.NMToken _value13 = new org.apache.axis.types.NMToken("colorsetCPK");
    public static final org.apache.axis.types.NMToken _value14 = new org.apache.axis.types.NMToken("colorsetbyChain");
    public static final org.apache.axis.types.NMToken _value15 = new org.apache.axis.types.NMToken("colorsetbyTemp");
    public static final org.apache.axis.types.NMToken _value16 = new org.apache.axis.types.NMToken("colorsetbyRes");
    public static final org.apache.axis.types.NMToken _value17 = new org.apache.axis.types.NMToken("colorsetbyLen");
    public static final org.apache.axis.types.NMToken _value18 = new org.apache.axis.types.NMToken("colorsetbySStru");
    public static final org.apache.axis.types.NMToken _value19 = new org.apache.axis.types.NMToken("colorsetbyHydro");
    public static final org.apache.axis.types.NMToken _value20 = new org.apache.axis.types.NMToken("colorsetbyObject");
    public static final org.apache.axis.types.NMToken _value21 = new org.apache.axis.types.NMToken("colorsetbyDomain");
    public static final org.apache.axis.types.NMToken _value22 = new org.apache.axis.types.NMToken("other");
    public static final RenderPropTypeValue value1 = new RenderPropTypeValue(_value1);
    public static final RenderPropTypeValue value2 = new RenderPropTypeValue(_value2);
    public static final RenderPropTypeValue value3 = new RenderPropTypeValue(_value3);
    public static final RenderPropTypeValue value4 = new RenderPropTypeValue(_value4);
    public static final RenderPropTypeValue value5 = new RenderPropTypeValue(_value5);
    public static final RenderPropTypeValue value6 = new RenderPropTypeValue(_value6);
    public static final RenderPropTypeValue value7 = new RenderPropTypeValue(_value7);
    public static final RenderPropTypeValue value8 = new RenderPropTypeValue(_value8);
    public static final RenderPropTypeValue value9 = new RenderPropTypeValue(_value9);
    public static final RenderPropTypeValue value10 = new RenderPropTypeValue(_value10);
    public static final RenderPropTypeValue value11 = new RenderPropTypeValue(_value11);
    public static final RenderPropTypeValue value12 = new RenderPropTypeValue(_value12);
    public static final RenderPropTypeValue value13 = new RenderPropTypeValue(_value13);
    public static final RenderPropTypeValue value14 = new RenderPropTypeValue(_value14);
    public static final RenderPropTypeValue value15 = new RenderPropTypeValue(_value15);
    public static final RenderPropTypeValue value16 = new RenderPropTypeValue(_value16);
    public static final RenderPropTypeValue value17 = new RenderPropTypeValue(_value17);
    public static final RenderPropTypeValue value18 = new RenderPropTypeValue(_value18);
    public static final RenderPropTypeValue value19 = new RenderPropTypeValue(_value19);
    public static final RenderPropTypeValue value20 = new RenderPropTypeValue(_value20);
    public static final RenderPropTypeValue value21 = new RenderPropTypeValue(_value21);
    public static final RenderPropTypeValue value22 = new RenderPropTypeValue(_value22);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static RenderPropTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        RenderPropTypeValue enumeration = (RenderPropTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RenderPropTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RenderPropTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Render-propType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
