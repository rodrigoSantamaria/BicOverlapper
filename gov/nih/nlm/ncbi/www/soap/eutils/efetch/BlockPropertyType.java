/**
 * BlockPropertyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BlockPropertyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlockProperty_typeType blockProperty_type;

    private java.lang.String blockProperty_intvalue;

    private java.lang.String blockProperty_textvalue;

    public BlockPropertyType() {
    }

    public BlockPropertyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlockProperty_typeType blockProperty_type,
           java.lang.String blockProperty_intvalue,
           java.lang.String blockProperty_textvalue) {
           this.blockProperty_type = blockProperty_type;
           this.blockProperty_intvalue = blockProperty_intvalue;
           this.blockProperty_textvalue = blockProperty_textvalue;
    }


    /**
     * Gets the blockProperty_type value for this BlockPropertyType.
     * 
     * @return blockProperty_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlockProperty_typeType getBlockProperty_type() {
        return blockProperty_type;
    }


    /**
     * Sets the blockProperty_type value for this BlockPropertyType.
     * 
     * @param blockProperty_type
     */
    public void setBlockProperty_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlockProperty_typeType blockProperty_type) {
        this.blockProperty_type = blockProperty_type;
    }


    /**
     * Gets the blockProperty_intvalue value for this BlockPropertyType.
     * 
     * @return blockProperty_intvalue
     */
    public java.lang.String getBlockProperty_intvalue() {
        return blockProperty_intvalue;
    }


    /**
     * Sets the blockProperty_intvalue value for this BlockPropertyType.
     * 
     * @param blockProperty_intvalue
     */
    public void setBlockProperty_intvalue(java.lang.String blockProperty_intvalue) {
        this.blockProperty_intvalue = blockProperty_intvalue;
    }


    /**
     * Gets the blockProperty_textvalue value for this BlockPropertyType.
     * 
     * @return blockProperty_textvalue
     */
    public java.lang.String getBlockProperty_textvalue() {
        return blockProperty_textvalue;
    }


    /**
     * Sets the blockProperty_textvalue value for this BlockPropertyType.
     * 
     * @param blockProperty_textvalue
     */
    public void setBlockProperty_textvalue(java.lang.String blockProperty_textvalue) {
        this.blockProperty_textvalue = blockProperty_textvalue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BlockPropertyType)) return false;
        BlockPropertyType other = (BlockPropertyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blockProperty_type==null && other.getBlockProperty_type()==null) || 
             (this.blockProperty_type!=null &&
              this.blockProperty_type.equals(other.getBlockProperty_type()))) &&
            ((this.blockProperty_intvalue==null && other.getBlockProperty_intvalue()==null) || 
             (this.blockProperty_intvalue!=null &&
              this.blockProperty_intvalue.equals(other.getBlockProperty_intvalue()))) &&
            ((this.blockProperty_textvalue==null && other.getBlockProperty_textvalue()==null) || 
             (this.blockProperty_textvalue!=null &&
              this.blockProperty_textvalue.equals(other.getBlockProperty_textvalue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBlockProperty_type() != null) {
            _hashCode += getBlockProperty_type().hashCode();
        }
        if (getBlockProperty_intvalue() != null) {
            _hashCode += getBlockProperty_intvalue().hashCode();
        }
        if (getBlockProperty_textvalue() != null) {
            _hashCode += getBlockProperty_textvalue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BlockPropertyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlockPropertyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockProperty_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlockProperty_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlockProperty_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockProperty_intvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlockProperty_intvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockProperty_textvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlockProperty_textvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
