/**
 * ModelSpace_coordinateUnitsTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModelSpace_coordinateUnitsTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ModelSpace_coordinateUnitsTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _angstroms = new org.apache.axis.types.NMToken("angstroms");
    public static final org.apache.axis.types.NMToken _nanometers = new org.apache.axis.types.NMToken("nanometers");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final org.apache.axis.types.NMToken _unknown = new org.apache.axis.types.NMToken("unknown");
    public static final ModelSpace_coordinateUnitsTypeValue angstroms = new ModelSpace_coordinateUnitsTypeValue(_angstroms);
    public static final ModelSpace_coordinateUnitsTypeValue nanometers = new ModelSpace_coordinateUnitsTypeValue(_nanometers);
    public static final ModelSpace_coordinateUnitsTypeValue other = new ModelSpace_coordinateUnitsTypeValue(_other);
    public static final ModelSpace_coordinateUnitsTypeValue unknown = new ModelSpace_coordinateUnitsTypeValue(_unknown);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static ModelSpace_coordinateUnitsTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        ModelSpace_coordinateUnitsTypeValue enumeration = (ModelSpace_coordinateUnitsTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ModelSpace_coordinateUnitsTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ModelSpace_coordinateUnitsTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Model-space_coordinate-unitsType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
