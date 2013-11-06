/**
 * HGNodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGNodeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_typeType HGNode_type;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_idType HGNode_id;

    private java.lang.String HGNode_caption;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_currentNodeType HGNode_currentNode;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_childrenType HGNode_children;

    private java.lang.String HGNode_branchLen;

    public HGNodeType() {
    }

    public HGNodeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_typeType HGNode_type,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_idType HGNode_id,
           java.lang.String HGNode_caption,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_currentNodeType HGNode_currentNode,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_childrenType HGNode_children,
           java.lang.String HGNode_branchLen) {
           this.HGNode_type = HGNode_type;
           this.HGNode_id = HGNode_id;
           this.HGNode_caption = HGNode_caption;
           this.HGNode_currentNode = HGNode_currentNode;
           this.HGNode_children = HGNode_children;
           this.HGNode_branchLen = HGNode_branchLen;
    }


    /**
     * Gets the HGNode_type value for this HGNodeType.
     * 
     * @return HGNode_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_typeType getHGNode_type() {
        return HGNode_type;
    }


    /**
     * Sets the HGNode_type value for this HGNodeType.
     * 
     * @param HGNode_type
     */
    public void setHGNode_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_typeType HGNode_type) {
        this.HGNode_type = HGNode_type;
    }


    /**
     * Gets the HGNode_id value for this HGNodeType.
     * 
     * @return HGNode_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_idType getHGNode_id() {
        return HGNode_id;
    }


    /**
     * Sets the HGNode_id value for this HGNodeType.
     * 
     * @param HGNode_id
     */
    public void setHGNode_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_idType HGNode_id) {
        this.HGNode_id = HGNode_id;
    }


    /**
     * Gets the HGNode_caption value for this HGNodeType.
     * 
     * @return HGNode_caption
     */
    public java.lang.String getHGNode_caption() {
        return HGNode_caption;
    }


    /**
     * Sets the HGNode_caption value for this HGNodeType.
     * 
     * @param HGNode_caption
     */
    public void setHGNode_caption(java.lang.String HGNode_caption) {
        this.HGNode_caption = HGNode_caption;
    }


    /**
     * Gets the HGNode_currentNode value for this HGNodeType.
     * 
     * @return HGNode_currentNode
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_currentNodeType getHGNode_currentNode() {
        return HGNode_currentNode;
    }


    /**
     * Sets the HGNode_currentNode value for this HGNodeType.
     * 
     * @param HGNode_currentNode
     */
    public void setHGNode_currentNode(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_currentNodeType HGNode_currentNode) {
        this.HGNode_currentNode = HGNode_currentNode;
    }


    /**
     * Gets the HGNode_children value for this HGNodeType.
     * 
     * @return HGNode_children
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_childrenType getHGNode_children() {
        return HGNode_children;
    }


    /**
     * Sets the HGNode_children value for this HGNodeType.
     * 
     * @param HGNode_children
     */
    public void setHGNode_children(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNode_childrenType HGNode_children) {
        this.HGNode_children = HGNode_children;
    }


    /**
     * Gets the HGNode_branchLen value for this HGNodeType.
     * 
     * @return HGNode_branchLen
     */
    public java.lang.String getHGNode_branchLen() {
        return HGNode_branchLen;
    }


    /**
     * Sets the HGNode_branchLen value for this HGNodeType.
     * 
     * @param HGNode_branchLen
     */
    public void setHGNode_branchLen(java.lang.String HGNode_branchLen) {
        this.HGNode_branchLen = HGNode_branchLen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGNodeType)) return false;
        HGNodeType other = (HGNodeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGNode_type==null && other.getHGNode_type()==null) || 
             (this.HGNode_type!=null &&
              this.HGNode_type.equals(other.getHGNode_type()))) &&
            ((this.HGNode_id==null && other.getHGNode_id()==null) || 
             (this.HGNode_id!=null &&
              this.HGNode_id.equals(other.getHGNode_id()))) &&
            ((this.HGNode_caption==null && other.getHGNode_caption()==null) || 
             (this.HGNode_caption!=null &&
              this.HGNode_caption.equals(other.getHGNode_caption()))) &&
            ((this.HGNode_currentNode==null && other.getHGNode_currentNode()==null) || 
             (this.HGNode_currentNode!=null &&
              this.HGNode_currentNode.equals(other.getHGNode_currentNode()))) &&
            ((this.HGNode_children==null && other.getHGNode_children()==null) || 
             (this.HGNode_children!=null &&
              this.HGNode_children.equals(other.getHGNode_children()))) &&
            ((this.HGNode_branchLen==null && other.getHGNode_branchLen()==null) || 
             (this.HGNode_branchLen!=null &&
              this.HGNode_branchLen.equals(other.getHGNode_branchLen())));
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
        if (getHGNode_type() != null) {
            _hashCode += getHGNode_type().hashCode();
        }
        if (getHGNode_id() != null) {
            _hashCode += getHGNode_id().hashCode();
        }
        if (getHGNode_caption() != null) {
            _hashCode += getHGNode_caption().hashCode();
        }
        if (getHGNode_currentNode() != null) {
            _hashCode += getHGNode_currentNode().hashCode();
        }
        if (getHGNode_children() != null) {
            _hashCode += getHGNode_children().hashCode();
        }
        if (getHGNode_branchLen() != null) {
            _hashCode += getHGNode_branchLen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HGNodeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-NodeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGNode_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGNode_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGNode_caption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node_caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGNode_currentNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node_current-node"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node_current-nodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGNode_children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node_children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node_childrenType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGNode_branchLen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node_branch-len"));
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
