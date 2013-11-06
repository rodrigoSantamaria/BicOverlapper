/**
 * CddViewer_ctrlTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddViewer_ctrlTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CddViewer_ctrlTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("unassigned");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("cd-info");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("align-annot");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("seq-list");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("seq-tree");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("merge-preview");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("cross-hits");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("notes");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("tax-tree");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("dart");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("dart-selected-rows");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("other");
    public static final CddViewer_ctrlTypeValue value1 = new CddViewer_ctrlTypeValue(_value1);
    public static final CddViewer_ctrlTypeValue value2 = new CddViewer_ctrlTypeValue(_value2);
    public static final CddViewer_ctrlTypeValue value3 = new CddViewer_ctrlTypeValue(_value3);
    public static final CddViewer_ctrlTypeValue value4 = new CddViewer_ctrlTypeValue(_value4);
    public static final CddViewer_ctrlTypeValue value5 = new CddViewer_ctrlTypeValue(_value5);
    public static final CddViewer_ctrlTypeValue value6 = new CddViewer_ctrlTypeValue(_value6);
    public static final CddViewer_ctrlTypeValue value7 = new CddViewer_ctrlTypeValue(_value7);
    public static final CddViewer_ctrlTypeValue value8 = new CddViewer_ctrlTypeValue(_value8);
    public static final CddViewer_ctrlTypeValue value9 = new CddViewer_ctrlTypeValue(_value9);
    public static final CddViewer_ctrlTypeValue value10 = new CddViewer_ctrlTypeValue(_value10);
    public static final CddViewer_ctrlTypeValue value11 = new CddViewer_ctrlTypeValue(_value11);
    public static final CddViewer_ctrlTypeValue value12 = new CddViewer_ctrlTypeValue(_value12);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static CddViewer_ctrlTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        CddViewer_ctrlTypeValue enumeration = (CddViewer_ctrlTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CddViewer_ctrlTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CddViewer_ctrlTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Cdd-Viewer_ctrlType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
