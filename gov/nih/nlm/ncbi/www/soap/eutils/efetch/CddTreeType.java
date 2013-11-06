/**
 * CddTreeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddTreeType  implements java.io.Serializable {
    private java.lang.String cddTree_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_idType cddTree_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_descriptionType cddTree_description;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_parentType cddTree_parent;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_childrenType cddTree_children;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_siblingsType cddTree_siblings;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_neighborsType cddTree_neighbors;

    public CddTreeType() {
    }

    public CddTreeType(
           java.lang.String cddTree_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_idType cddTree_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_descriptionType cddTree_description,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_parentType cddTree_parent,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_childrenType cddTree_children,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_siblingsType cddTree_siblings,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_neighborsType cddTree_neighbors) {
           this.cddTree_name = cddTree_name;
           this.cddTree_id = cddTree_id;
           this.cddTree_description = cddTree_description;
           this.cddTree_parent = cddTree_parent;
           this.cddTree_children = cddTree_children;
           this.cddTree_siblings = cddTree_siblings;
           this.cddTree_neighbors = cddTree_neighbors;
    }


    /**
     * Gets the cddTree_name value for this CddTreeType.
     * 
     * @return cddTree_name
     */
    public java.lang.String getCddTree_name() {
        return cddTree_name;
    }


    /**
     * Sets the cddTree_name value for this CddTreeType.
     * 
     * @param cddTree_name
     */
    public void setCddTree_name(java.lang.String cddTree_name) {
        this.cddTree_name = cddTree_name;
    }


    /**
     * Gets the cddTree_id value for this CddTreeType.
     * 
     * @return cddTree_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_idType getCddTree_id() {
        return cddTree_id;
    }


    /**
     * Sets the cddTree_id value for this CddTreeType.
     * 
     * @param cddTree_id
     */
    public void setCddTree_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_idType cddTree_id) {
        this.cddTree_id = cddTree_id;
    }


    /**
     * Gets the cddTree_description value for this CddTreeType.
     * 
     * @return cddTree_description
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_descriptionType getCddTree_description() {
        return cddTree_description;
    }


    /**
     * Sets the cddTree_description value for this CddTreeType.
     * 
     * @param cddTree_description
     */
    public void setCddTree_description(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_descriptionType cddTree_description) {
        this.cddTree_description = cddTree_description;
    }


    /**
     * Gets the cddTree_parent value for this CddTreeType.
     * 
     * @return cddTree_parent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_parentType getCddTree_parent() {
        return cddTree_parent;
    }


    /**
     * Sets the cddTree_parent value for this CddTreeType.
     * 
     * @param cddTree_parent
     */
    public void setCddTree_parent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_parentType cddTree_parent) {
        this.cddTree_parent = cddTree_parent;
    }


    /**
     * Gets the cddTree_children value for this CddTreeType.
     * 
     * @return cddTree_children
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_childrenType getCddTree_children() {
        return cddTree_children;
    }


    /**
     * Sets the cddTree_children value for this CddTreeType.
     * 
     * @param cddTree_children
     */
    public void setCddTree_children(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_childrenType cddTree_children) {
        this.cddTree_children = cddTree_children;
    }


    /**
     * Gets the cddTree_siblings value for this CddTreeType.
     * 
     * @return cddTree_siblings
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_siblingsType getCddTree_siblings() {
        return cddTree_siblings;
    }


    /**
     * Sets the cddTree_siblings value for this CddTreeType.
     * 
     * @param cddTree_siblings
     */
    public void setCddTree_siblings(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_siblingsType cddTree_siblings) {
        this.cddTree_siblings = cddTree_siblings;
    }


    /**
     * Gets the cddTree_neighbors value for this CddTreeType.
     * 
     * @return cddTree_neighbors
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_neighborsType getCddTree_neighbors() {
        return cddTree_neighbors;
    }


    /**
     * Sets the cddTree_neighbors value for this CddTreeType.
     * 
     * @param cddTree_neighbors
     */
    public void setCddTree_neighbors(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTree_neighborsType cddTree_neighbors) {
        this.cddTree_neighbors = cddTree_neighbors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddTreeType)) return false;
        CddTreeType other = (CddTreeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddTree_name==null && other.getCddTree_name()==null) || 
             (this.cddTree_name!=null &&
              this.cddTree_name.equals(other.getCddTree_name()))) &&
            ((this.cddTree_id==null && other.getCddTree_id()==null) || 
             (this.cddTree_id!=null &&
              this.cddTree_id.equals(other.getCddTree_id()))) &&
            ((this.cddTree_description==null && other.getCddTree_description()==null) || 
             (this.cddTree_description!=null &&
              this.cddTree_description.equals(other.getCddTree_description()))) &&
            ((this.cddTree_parent==null && other.getCddTree_parent()==null) || 
             (this.cddTree_parent!=null &&
              this.cddTree_parent.equals(other.getCddTree_parent()))) &&
            ((this.cddTree_children==null && other.getCddTree_children()==null) || 
             (this.cddTree_children!=null &&
              this.cddTree_children.equals(other.getCddTree_children()))) &&
            ((this.cddTree_siblings==null && other.getCddTree_siblings()==null) || 
             (this.cddTree_siblings!=null &&
              this.cddTree_siblings.equals(other.getCddTree_siblings()))) &&
            ((this.cddTree_neighbors==null && other.getCddTree_neighbors()==null) || 
             (this.cddTree_neighbors!=null &&
              this.cddTree_neighbors.equals(other.getCddTree_neighbors())));
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
        if (getCddTree_name() != null) {
            _hashCode += getCddTree_name().hashCode();
        }
        if (getCddTree_id() != null) {
            _hashCode += getCddTree_id().hashCode();
        }
        if (getCddTree_description() != null) {
            _hashCode += getCddTree_description().hashCode();
        }
        if (getCddTree_parent() != null) {
            _hashCode += getCddTree_parent().hashCode();
        }
        if (getCddTree_children() != null) {
            _hashCode += getCddTree_children().hashCode();
        }
        if (getCddTree_siblings() != null) {
            _hashCode += getCddTree_siblings().hashCode();
        }
        if (getCddTree_neighbors() != null) {
            _hashCode += getCddTree_neighbors().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddTreeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-treeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddTree_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddTree_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddTree_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree_descriptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddTree_parent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree_parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree_parentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddTree_children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree_children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree_childrenType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddTree_siblings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree_siblings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree_siblingsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddTree_neighbors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree_neighbors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree_neighborsType"));
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
