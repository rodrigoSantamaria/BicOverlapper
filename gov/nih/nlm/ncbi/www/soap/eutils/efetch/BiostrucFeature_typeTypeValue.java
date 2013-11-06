/**
 * BiostrucFeature_typeTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucFeature_typeTypeValue implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BiostrucFeature_typeTypeValue(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _helix = new org.apache.axis.types.NMToken("helix");
    public static final org.apache.axis.types.NMToken _strand = new org.apache.axis.types.NMToken("strand");
    public static final org.apache.axis.types.NMToken _sheet = new org.apache.axis.types.NMToken("sheet");
    public static final org.apache.axis.types.NMToken _turn = new org.apache.axis.types.NMToken("turn");
    public static final org.apache.axis.types.NMToken _site = new org.apache.axis.types.NMToken("site");
    public static final org.apache.axis.types.NMToken _footnote = new org.apache.axis.types.NMToken("footnote");
    public static final org.apache.axis.types.NMToken _comment = new org.apache.axis.types.NMToken("comment");
    public static final org.apache.axis.types.NMToken _subgraph = new org.apache.axis.types.NMToken("subgraph");
    public static final org.apache.axis.types.NMToken _region = new org.apache.axis.types.NMToken("region");
    public static final org.apache.axis.types.NMToken _core = new org.apache.axis.types.NMToken("core");
    public static final org.apache.axis.types.NMToken _supercore = new org.apache.axis.types.NMToken("supercore");
    public static final org.apache.axis.types.NMToken _color = new org.apache.axis.types.NMToken("color");
    public static final org.apache.axis.types.NMToken _render = new org.apache.axis.types.NMToken("render");
    public static final org.apache.axis.types.NMToken _label = new org.apache.axis.types.NMToken("label");
    public static final org.apache.axis.types.NMToken _transform = new org.apache.axis.types.NMToken("transform");
    public static final org.apache.axis.types.NMToken _camera = new org.apache.axis.types.NMToken("camera");
    public static final org.apache.axis.types.NMToken _script = new org.apache.axis.types.NMToken("script");
    public static final org.apache.axis.types.NMToken _alignment = new org.apache.axis.types.NMToken("alignment");
    public static final org.apache.axis.types.NMToken _similarity = new org.apache.axis.types.NMToken("similarity");
    public static final org.apache.axis.types.NMToken _multalign = new org.apache.axis.types.NMToken("multalign");
    public static final org.apache.axis.types.NMToken _indirect = new org.apache.axis.types.NMToken("indirect");
    public static final org.apache.axis.types.NMToken _cn3dstate = new org.apache.axis.types.NMToken("cn3dstate");
    public static final org.apache.axis.types.NMToken _other = new org.apache.axis.types.NMToken("other");
    public static final BiostrucFeature_typeTypeValue helix = new BiostrucFeature_typeTypeValue(_helix);
    public static final BiostrucFeature_typeTypeValue strand = new BiostrucFeature_typeTypeValue(_strand);
    public static final BiostrucFeature_typeTypeValue sheet = new BiostrucFeature_typeTypeValue(_sheet);
    public static final BiostrucFeature_typeTypeValue turn = new BiostrucFeature_typeTypeValue(_turn);
    public static final BiostrucFeature_typeTypeValue site = new BiostrucFeature_typeTypeValue(_site);
    public static final BiostrucFeature_typeTypeValue footnote = new BiostrucFeature_typeTypeValue(_footnote);
    public static final BiostrucFeature_typeTypeValue comment = new BiostrucFeature_typeTypeValue(_comment);
    public static final BiostrucFeature_typeTypeValue subgraph = new BiostrucFeature_typeTypeValue(_subgraph);
    public static final BiostrucFeature_typeTypeValue region = new BiostrucFeature_typeTypeValue(_region);
    public static final BiostrucFeature_typeTypeValue core = new BiostrucFeature_typeTypeValue(_core);
    public static final BiostrucFeature_typeTypeValue supercore = new BiostrucFeature_typeTypeValue(_supercore);
    public static final BiostrucFeature_typeTypeValue color = new BiostrucFeature_typeTypeValue(_color);
    public static final BiostrucFeature_typeTypeValue render = new BiostrucFeature_typeTypeValue(_render);
    public static final BiostrucFeature_typeTypeValue label = new BiostrucFeature_typeTypeValue(_label);
    public static final BiostrucFeature_typeTypeValue transform = new BiostrucFeature_typeTypeValue(_transform);
    public static final BiostrucFeature_typeTypeValue camera = new BiostrucFeature_typeTypeValue(_camera);
    public static final BiostrucFeature_typeTypeValue script = new BiostrucFeature_typeTypeValue(_script);
    public static final BiostrucFeature_typeTypeValue alignment = new BiostrucFeature_typeTypeValue(_alignment);
    public static final BiostrucFeature_typeTypeValue similarity = new BiostrucFeature_typeTypeValue(_similarity);
    public static final BiostrucFeature_typeTypeValue multalign = new BiostrucFeature_typeTypeValue(_multalign);
    public static final BiostrucFeature_typeTypeValue indirect = new BiostrucFeature_typeTypeValue(_indirect);
    public static final BiostrucFeature_typeTypeValue cn3dstate = new BiostrucFeature_typeTypeValue(_cn3dstate);
    public static final BiostrucFeature_typeTypeValue other = new BiostrucFeature_typeTypeValue(_other);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static BiostrucFeature_typeTypeValue fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        BiostrucFeature_typeTypeValue enumeration = (BiostrucFeature_typeTypeValue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BiostrucFeature_typeTypeValue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BiostrucFeature_typeTypeValue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Biostruc-feature_typeType>value"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
