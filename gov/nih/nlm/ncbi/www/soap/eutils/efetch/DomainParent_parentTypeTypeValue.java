/**
 * DomainParent_parentTypeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DomainParent_parentTypeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DomainParent_parentTypeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _classical = new org.apache.axis.types.NMToken("classical");
    public static final org.apache.axis.types.NMToken _fusion = new org.apache.axis.types.NMToken("fusion");
    public static final org.apache.axis.types.NMToken _deletion = new org.apache.axis.types.NMToken("deletion");
    public static final org.apache.axis.types.NMToken _permutation = new org.apache.axis.types.NMToken("permutation");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final DomainParent_parentTypeTypeValue classical = new DomainParent_parentTypeTypeValue(_classical);
    public static final DomainParent_parentTypeTypeValue fusion = new DomainParent_parentTypeTypeValue(_fusion);
    public static final DomainParent_parentTypeTypeValue deletion = new DomainParent_parentTypeTypeValue(_deletion);
    public static final DomainParent_parentTypeTypeValue permutation = new DomainParent_parentTypeTypeValue(_permutation);
    public static final DomainParent_parentTypeTypeValue other = new DomainParent_parentTypeTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static DomainParent_parentTypeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        DomainParent_parentTypeTypeValue enumeration = (DomainParent_parentTypeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DomainParent_parentTypeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DomainParent_parentTypeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Domain-parent_parent-typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
