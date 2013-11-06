/**
 * Blast4KaBlockType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4KaBlockType  implements java.io.Serializable {
    private java.lang.String blast4KaBlock_lambda;

    private java.lang.String blast4KaBlock_k;

    private java.lang.String blast4KaBlock_h;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4KaBlock_gappedType blast4KaBlock_gapped;

    public Blast4KaBlockType() {
    }

    public Blast4KaBlockType(
           java.lang.String blast4KaBlock_lambda,
           java.lang.String blast4KaBlock_k,
           java.lang.String blast4KaBlock_h,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4KaBlock_gappedType blast4KaBlock_gapped) {
           this.blast4KaBlock_lambda = blast4KaBlock_lambda;
           this.blast4KaBlock_k = blast4KaBlock_k;
           this.blast4KaBlock_h = blast4KaBlock_h;
           this.blast4KaBlock_gapped = blast4KaBlock_gapped;
    }


    /**
     * Gets the blast4KaBlock_lambda value for this Blast4KaBlockType.
     * 
     * @return blast4KaBlock_lambda
     */
    public java.lang.String getBlast4KaBlock_lambda() {
        return blast4KaBlock_lambda;
    }


    /**
     * Sets the blast4KaBlock_lambda value for this Blast4KaBlockType.
     * 
     * @param blast4KaBlock_lambda
     */
    public void setBlast4KaBlock_lambda(java.lang.String blast4KaBlock_lambda) {
        this.blast4KaBlock_lambda = blast4KaBlock_lambda;
    }


    /**
     * Gets the blast4KaBlock_k value for this Blast4KaBlockType.
     * 
     * @return blast4KaBlock_k
     */
    public java.lang.String getBlast4KaBlock_k() {
        return blast4KaBlock_k;
    }


    /**
     * Sets the blast4KaBlock_k value for this Blast4KaBlockType.
     * 
     * @param blast4KaBlock_k
     */
    public void setBlast4KaBlock_k(java.lang.String blast4KaBlock_k) {
        this.blast4KaBlock_k = blast4KaBlock_k;
    }


    /**
     * Gets the blast4KaBlock_h value for this Blast4KaBlockType.
     * 
     * @return blast4KaBlock_h
     */
    public java.lang.String getBlast4KaBlock_h() {
        return blast4KaBlock_h;
    }


    /**
     * Sets the blast4KaBlock_h value for this Blast4KaBlockType.
     * 
     * @param blast4KaBlock_h
     */
    public void setBlast4KaBlock_h(java.lang.String blast4KaBlock_h) {
        this.blast4KaBlock_h = blast4KaBlock_h;
    }


    /**
     * Gets the blast4KaBlock_gapped value for this Blast4KaBlockType.
     * 
     * @return blast4KaBlock_gapped
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4KaBlock_gappedType getBlast4KaBlock_gapped() {
        return blast4KaBlock_gapped;
    }


    /**
     * Sets the blast4KaBlock_gapped value for this Blast4KaBlockType.
     * 
     * @param blast4KaBlock_gapped
     */
    public void setBlast4KaBlock_gapped(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4KaBlock_gappedType blast4KaBlock_gapped) {
        this.blast4KaBlock_gapped = blast4KaBlock_gapped;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4KaBlockType)) return false;
        Blast4KaBlockType other = (Blast4KaBlockType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4KaBlock_lambda==null && other.getBlast4KaBlock_lambda()==null) || 
             (this.blast4KaBlock_lambda!=null &&
              this.blast4KaBlock_lambda.equals(other.getBlast4KaBlock_lambda()))) &&
            ((this.blast4KaBlock_k==null && other.getBlast4KaBlock_k()==null) || 
             (this.blast4KaBlock_k!=null &&
              this.blast4KaBlock_k.equals(other.getBlast4KaBlock_k()))) &&
            ((this.blast4KaBlock_h==null && other.getBlast4KaBlock_h()==null) || 
             (this.blast4KaBlock_h!=null &&
              this.blast4KaBlock_h.equals(other.getBlast4KaBlock_h()))) &&
            ((this.blast4KaBlock_gapped==null && other.getBlast4KaBlock_gapped()==null) || 
             (this.blast4KaBlock_gapped!=null &&
              this.blast4KaBlock_gapped.equals(other.getBlast4KaBlock_gapped())));
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
        if (getBlast4KaBlock_lambda() != null) {
            _hashCode += getBlast4KaBlock_lambda().hashCode();
        }
        if (getBlast4KaBlock_k() != null) {
            _hashCode += getBlast4KaBlock_k().hashCode();
        }
        if (getBlast4KaBlock_h() != null) {
            _hashCode += getBlast4KaBlock_h().hashCode();
        }
        if (getBlast4KaBlock_gapped() != null) {
            _hashCode += getBlast4KaBlock_gapped().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4KaBlockType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-ka-blockType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4KaBlock_lambda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-ka-block_lambda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4KaBlock_k");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-ka-block_k"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4KaBlock_h");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-ka-block_h"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4KaBlock_gapped");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-ka-block_gapped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-ka-block_gappedType"));
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
