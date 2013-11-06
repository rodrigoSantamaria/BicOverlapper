/**
 * ModelSpace_occupancyFactorUnitsTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModelSpace_occupancyFactorUnitsTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ModelSpace_occupancyFactorUnitsTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _fractional = new org.apache.axis.types.NMToken("fractional");
    public static final org.apache.axis.types.NMToken _electrons = new org.apache.axis.types.NMToken("electrons");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final org.apache.axis.types.NMToken _unknown = new org.apache.axis.types.NMToken("unknown");
    public static final ModelSpace_occupancyFactorUnitsTypeValue fractional = new ModelSpace_occupancyFactorUnitsTypeValue(_fractional);
    public static final ModelSpace_occupancyFactorUnitsTypeValue electrons = new ModelSpace_occupancyFactorUnitsTypeValue(_electrons);
    public static final ModelSpace_occupancyFactorUnitsTypeValue other = new ModelSpace_occupancyFactorUnitsTypeValue(_other);
    public static final ModelSpace_occupancyFactorUnitsTypeValue unknown = new ModelSpace_occupancyFactorUnitsTypeValue(_unknown);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static ModelSpace_occupancyFactorUnitsTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        ModelSpace_occupancyFactorUnitsTypeValue enumeration = (ModelSpace_occupancyFactorUnitsTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ModelSpace_occupancyFactorUnitsTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ModelSpace_occupancyFactorUnitsTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Model-space_occupancy-factor-unitsType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
