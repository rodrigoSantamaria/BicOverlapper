/**
 * SeqTreeNodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqTreeNodeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_isAnnotatedType seqTreeNode_isAnnotated;

    private java.lang.String seqTreeNode_name;

    private java.lang.String seqTreeNode_distance;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_childrenType seqTreeNode_children;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_annotationType seqTreeNode_annotation;

    public SeqTreeNodeType() {
    }

    public SeqTreeNodeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_isAnnotatedType seqTreeNode_isAnnotated,
           java.lang.String seqTreeNode_name,
           java.lang.String seqTreeNode_distance,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_childrenType seqTreeNode_children,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_annotationType seqTreeNode_annotation) {
           this.seqTreeNode_isAnnotated = seqTreeNode_isAnnotated;
           this.seqTreeNode_name = seqTreeNode_name;
           this.seqTreeNode_distance = seqTreeNode_distance;
           this.seqTreeNode_children = seqTreeNode_children;
           this.seqTreeNode_annotation = seqTreeNode_annotation;
    }


    /**
     * Gets the seqTreeNode_isAnnotated value for this SeqTreeNodeType.
     * 
     * @return seqTreeNode_isAnnotated
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_isAnnotatedType getSeqTreeNode_isAnnotated() {
        return seqTreeNode_isAnnotated;
    }


    /**
     * Sets the seqTreeNode_isAnnotated value for this SeqTreeNodeType.
     * 
     * @param seqTreeNode_isAnnotated
     */
    public void setSeqTreeNode_isAnnotated(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_isAnnotatedType seqTreeNode_isAnnotated) {
        this.seqTreeNode_isAnnotated = seqTreeNode_isAnnotated;
    }


    /**
     * Gets the seqTreeNode_name value for this SeqTreeNodeType.
     * 
     * @return seqTreeNode_name
     */
    public java.lang.String getSeqTreeNode_name() {
        return seqTreeNode_name;
    }


    /**
     * Sets the seqTreeNode_name value for this SeqTreeNodeType.
     * 
     * @param seqTreeNode_name
     */
    public void setSeqTreeNode_name(java.lang.String seqTreeNode_name) {
        this.seqTreeNode_name = seqTreeNode_name;
    }


    /**
     * Gets the seqTreeNode_distance value for this SeqTreeNodeType.
     * 
     * @return seqTreeNode_distance
     */
    public java.lang.String getSeqTreeNode_distance() {
        return seqTreeNode_distance;
    }


    /**
     * Sets the seqTreeNode_distance value for this SeqTreeNodeType.
     * 
     * @param seqTreeNode_distance
     */
    public void setSeqTreeNode_distance(java.lang.String seqTreeNode_distance) {
        this.seqTreeNode_distance = seqTreeNode_distance;
    }


    /**
     * Gets the seqTreeNode_children value for this SeqTreeNodeType.
     * 
     * @return seqTreeNode_children
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_childrenType getSeqTreeNode_children() {
        return seqTreeNode_children;
    }


    /**
     * Sets the seqTreeNode_children value for this SeqTreeNodeType.
     * 
     * @param seqTreeNode_children
     */
    public void setSeqTreeNode_children(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_childrenType seqTreeNode_children) {
        this.seqTreeNode_children = seqTreeNode_children;
    }


    /**
     * Gets the seqTreeNode_annotation value for this SeqTreeNodeType.
     * 
     * @return seqTreeNode_annotation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_annotationType getSeqTreeNode_annotation() {
        return seqTreeNode_annotation;
    }


    /**
     * Sets the seqTreeNode_annotation value for this SeqTreeNodeType.
     * 
     * @param seqTreeNode_annotation
     */
    public void setSeqTreeNode_annotation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_annotationType seqTreeNode_annotation) {
        this.seqTreeNode_annotation = seqTreeNode_annotation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqTreeNodeType)) return false;
        SeqTreeNodeType other = (SeqTreeNodeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqTreeNode_isAnnotated==null && other.getSeqTreeNode_isAnnotated()==null) || 
             (this.seqTreeNode_isAnnotated!=null &&
              this.seqTreeNode_isAnnotated.equals(other.getSeqTreeNode_isAnnotated()))) &&
            ((this.seqTreeNode_name==null && other.getSeqTreeNode_name()==null) || 
             (this.seqTreeNode_name!=null &&
              this.seqTreeNode_name.equals(other.getSeqTreeNode_name()))) &&
            ((this.seqTreeNode_distance==null && other.getSeqTreeNode_distance()==null) || 
             (this.seqTreeNode_distance!=null &&
              this.seqTreeNode_distance.equals(other.getSeqTreeNode_distance()))) &&
            ((this.seqTreeNode_children==null && other.getSeqTreeNode_children()==null) || 
             (this.seqTreeNode_children!=null &&
              this.seqTreeNode_children.equals(other.getSeqTreeNode_children()))) &&
            ((this.seqTreeNode_annotation==null && other.getSeqTreeNode_annotation()==null) || 
             (this.seqTreeNode_annotation!=null &&
              this.seqTreeNode_annotation.equals(other.getSeqTreeNode_annotation())));
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
        if (getSeqTreeNode_isAnnotated() != null) {
            _hashCode += getSeqTreeNode_isAnnotated().hashCode();
        }
        if (getSeqTreeNode_name() != null) {
            _hashCode += getSeqTreeNode_name().hashCode();
        }
        if (getSeqTreeNode_distance() != null) {
            _hashCode += getSeqTreeNode_distance().hashCode();
        }
        if (getSeqTreeNode_children() != null) {
            _hashCode += getSeqTreeNode_children().hashCode();
        }
        if (getSeqTreeNode_annotation() != null) {
            _hashCode += getSeqTreeNode_annotation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqTreeNodeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-nodeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqTreeNode_isAnnotated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_isAnnotated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_isAnnotatedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqTreeNode_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqTreeNode_distance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_distance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqTreeNode_children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_childrenType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqTreeNode_annotation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_annotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_annotationType"));
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
