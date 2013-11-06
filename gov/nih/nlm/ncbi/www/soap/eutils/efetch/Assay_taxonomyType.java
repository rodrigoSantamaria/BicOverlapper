/**
 * Assay_taxonomyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Assay_taxonomyType  implements java.io.Serializable {
    private java.lang.String assay_taxonomy_id;

    private java.lang.String assay_taxonomy_organism;

    public Assay_taxonomyType() {
    }

    public Assay_taxonomyType(
           java.lang.String assay_taxonomy_id,
           java.lang.String assay_taxonomy_organism) {
           this.assay_taxonomy_id = assay_taxonomy_id;
           this.assay_taxonomy_organism = assay_taxonomy_organism;
    }


    /**
     * Gets the assay_taxonomy_id value for this Assay_taxonomyType.
     * 
     * @return assay_taxonomy_id
     */
    public java.lang.String getAssay_taxonomy_id() {
        return assay_taxonomy_id;
    }


    /**
     * Sets the assay_taxonomy_id value for this Assay_taxonomyType.
     * 
     * @param assay_taxonomy_id
     */
    public void setAssay_taxonomy_id(java.lang.String assay_taxonomy_id) {
        this.assay_taxonomy_id = assay_taxonomy_id;
    }


    /**
     * Gets the assay_taxonomy_organism value for this Assay_taxonomyType.
     * 
     * @return assay_taxonomy_organism
     */
    public java.lang.String getAssay_taxonomy_organism() {
        return assay_taxonomy_organism;
    }


    /**
     * Sets the assay_taxonomy_organism value for this Assay_taxonomyType.
     * 
     * @param assay_taxonomy_organism
     */
    public void setAssay_taxonomy_organism(java.lang.String assay_taxonomy_organism) {
        this.assay_taxonomy_organism = assay_taxonomy_organism;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Assay_taxonomyType)) return false;
        Assay_taxonomyType other = (Assay_taxonomyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assay_taxonomy_id==null && other.getAssay_taxonomy_id()==null) || 
             (this.assay_taxonomy_id!=null &&
              this.assay_taxonomy_id.equals(other.getAssay_taxonomy_id()))) &&
            ((this.assay_taxonomy_organism==null && other.getAssay_taxonomy_organism()==null) || 
             (this.assay_taxonomy_organism!=null &&
              this.assay_taxonomy_organism.equals(other.getAssay_taxonomy_organism())));
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
        if (getAssay_taxonomy_id() != null) {
            _hashCode += getAssay_taxonomy_id().hashCode();
        }
        if (getAssay_taxonomy_organism() != null) {
            _hashCode += getAssay_taxonomy_organism().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Assay_taxonomyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_taxonomyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_taxonomy_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_taxonomy_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assay_taxonomy_organism");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assay_taxonomy_organism"));
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
