/**
 * CddBookRef_textelementTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddBookRef_textelementTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CddBookRef_textelementTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _unassigned = new org.apache.axis.types.NMToken("unassigned");
    public static final org.apache.axis.types.NMToken _section = new org.apache.axis.types.NMToken("section");
    public static final org.apache.axis.types.NMToken _figgrp = new org.apache.axis.types.NMToken("figgrp");
    public static final org.apache.axis.types.NMToken _table = new org.apache.axis.types.NMToken("table");
    public static final org.apache.axis.types.NMToken _chapter = new org.apache.axis.types.NMToken("chapter");
    public static final org.apache.axis.types.NMToken _biblist = new org.apache.axis.types.NMToken("biblist");
    public static final org.apache.axis.types.NMToken _box = new org.apache.axis.types.NMToken("box");
    public static final org.apache.axis.types.NMToken _glossary = new org.apache.axis.types.NMToken("glossary");
    public static final org.apache.axis.types.NMToken _appendix = new org.apache.axis.types.NMToken("appendix");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final CddBookRef_textelementTypeValue unassigned = new CddBookRef_textelementTypeValue(_unassigned);
    public static final CddBookRef_textelementTypeValue section = new CddBookRef_textelementTypeValue(_section);
    public static final CddBookRef_textelementTypeValue figgrp = new CddBookRef_textelementTypeValue(_figgrp);
    public static final CddBookRef_textelementTypeValue table = new CddBookRef_textelementTypeValue(_table);
    public static final CddBookRef_textelementTypeValue chapter = new CddBookRef_textelementTypeValue(_chapter);
    public static final CddBookRef_textelementTypeValue biblist = new CddBookRef_textelementTypeValue(_biblist);
    public static final CddBookRef_textelementTypeValue box = new CddBookRef_textelementTypeValue(_box);
    public static final CddBookRef_textelementTypeValue glossary = new CddBookRef_textelementTypeValue(_glossary);
    public static final CddBookRef_textelementTypeValue appendix = new CddBookRef_textelementTypeValue(_appendix);
    public static final CddBookRef_textelementTypeValue other = new CddBookRef_textelementTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static CddBookRef_textelementTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        CddBookRef_textelementTypeValue enumeration = (CddBookRef_textelementTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CddBookRef_textelementTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CddBookRef_textelementTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Cdd-book-ref_textelementType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
