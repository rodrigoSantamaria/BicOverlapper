/**
 * RNARefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RNARefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_typeType RNARef_type;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_pseudoType RNARef_pseudo;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_extType RNARef_ext;

    public RNARefType() {
    }

    public RNARefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_typeType RNARef_type,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_pseudoType RNARef_pseudo,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_extType RNARef_ext) {
           this.RNARef_type = RNARef_type;
           this.RNARef_pseudo = RNARef_pseudo;
           this.RNARef_ext = RNARef_ext;
    }


    /**
     * Gets the RNARef_type value for this RNARefType.
     * 
     * @return RNARef_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_typeType getRNARef_type() {
        return RNARef_type;
    }


    /**
     * Sets the RNARef_type value for this RNARefType.
     * 
     * @param RNARef_type
     */
    public void setRNARef_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_typeType RNARef_type) {
        this.RNARef_type = RNARef_type;
    }


    /**
     * Gets the RNARef_pseudo value for this RNARefType.
     * 
     * @return RNARef_pseudo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_pseudoType getRNARef_pseudo() {
        return RNARef_pseudo;
    }


    /**
     * Sets the RNARef_pseudo value for this RNARefType.
     * 
     * @param RNARef_pseudo
     */
    public void setRNARef_pseudo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_pseudoType RNARef_pseudo) {
        this.RNARef_pseudo = RNARef_pseudo;
    }


    /**
     * Gets the RNARef_ext value for this RNARefType.
     * 
     * @return RNARef_ext
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_extType getRNARef_ext() {
        return RNARef_ext;
    }


    /**
     * Sets the RNARef_ext value for this RNARefType.
     * 
     * @param RNARef_ext
     */
    public void setRNARef_ext(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_extType RNARef_ext) {
        this.RNARef_ext = RNARef_ext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RNARefType)) return false;
        RNARefType other = (RNARefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RNARef_type==null && other.getRNARef_type()==null) || 
             (this.RNARef_type!=null &&
              this.RNARef_type.equals(other.getRNARef_type()))) &&
            ((this.RNARef_pseudo==null && other.getRNARef_pseudo()==null) || 
             (this.RNARef_pseudo!=null &&
              this.RNARef_pseudo.equals(other.getRNARef_pseudo()))) &&
            ((this.RNARef_ext==null && other.getRNARef_ext()==null) || 
             (this.RNARef_ext!=null &&
              this.RNARef_ext.equals(other.getRNARef_ext())));
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
        if (getRNARef_type() != null) {
            _hashCode += getRNARef_type().hashCode();
        }
        if (getRNARef_pseudo() != null) {
            _hashCode += getRNARef_pseudo().hashCode();
        }
        if (getRNARef_ext() != null) {
            _hashCode += getRNARef_ext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RNARefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RNA-refType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RNARef_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RNA-ref_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RNA-ref_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RNARef_pseudo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RNA-ref_pseudo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RNA-ref_pseudoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RNARef_ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RNA-ref_ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RNA-ref_extType"));
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
