/**
 * ModelDescrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModelDescrType  implements java.io.Serializable {
    private java.lang.String modelDescr_name;

    private java.lang.String modelDescr_pdbReso;

    private java.lang.String modelDescr_pdbMethod;

    private java.lang.String modelDescr_pdbComment;

    private java.lang.String modelDescr_otherComment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelDescr_attributionType modelDescr_attribution;

    public ModelDescrType() {
    }

    public ModelDescrType(
           java.lang.String modelDescr_name,
           java.lang.String modelDescr_pdbReso,
           java.lang.String modelDescr_pdbMethod,
           java.lang.String modelDescr_pdbComment,
           java.lang.String modelDescr_otherComment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelDescr_attributionType modelDescr_attribution) {
           this.modelDescr_name = modelDescr_name;
           this.modelDescr_pdbReso = modelDescr_pdbReso;
           this.modelDescr_pdbMethod = modelDescr_pdbMethod;
           this.modelDescr_pdbComment = modelDescr_pdbComment;
           this.modelDescr_otherComment = modelDescr_otherComment;
           this.modelDescr_attribution = modelDescr_attribution;
    }


    /**
     * Gets the modelDescr_name value for this ModelDescrType.
     * 
     * @return modelDescr_name
     */
    public java.lang.String getModelDescr_name() {
        return modelDescr_name;
    }


    /**
     * Sets the modelDescr_name value for this ModelDescrType.
     * 
     * @param modelDescr_name
     */
    public void setModelDescr_name(java.lang.String modelDescr_name) {
        this.modelDescr_name = modelDescr_name;
    }


    /**
     * Gets the modelDescr_pdbReso value for this ModelDescrType.
     * 
     * @return modelDescr_pdbReso
     */
    public java.lang.String getModelDescr_pdbReso() {
        return modelDescr_pdbReso;
    }


    /**
     * Sets the modelDescr_pdbReso value for this ModelDescrType.
     * 
     * @param modelDescr_pdbReso
     */
    public void setModelDescr_pdbReso(java.lang.String modelDescr_pdbReso) {
        this.modelDescr_pdbReso = modelDescr_pdbReso;
    }


    /**
     * Gets the modelDescr_pdbMethod value for this ModelDescrType.
     * 
     * @return modelDescr_pdbMethod
     */
    public java.lang.String getModelDescr_pdbMethod() {
        return modelDescr_pdbMethod;
    }


    /**
     * Sets the modelDescr_pdbMethod value for this ModelDescrType.
     * 
     * @param modelDescr_pdbMethod
     */
    public void setModelDescr_pdbMethod(java.lang.String modelDescr_pdbMethod) {
        this.modelDescr_pdbMethod = modelDescr_pdbMethod;
    }


    /**
     * Gets the modelDescr_pdbComment value for this ModelDescrType.
     * 
     * @return modelDescr_pdbComment
     */
    public java.lang.String getModelDescr_pdbComment() {
        return modelDescr_pdbComment;
    }


    /**
     * Sets the modelDescr_pdbComment value for this ModelDescrType.
     * 
     * @param modelDescr_pdbComment
     */
    public void setModelDescr_pdbComment(java.lang.String modelDescr_pdbComment) {
        this.modelDescr_pdbComment = modelDescr_pdbComment;
    }


    /**
     * Gets the modelDescr_otherComment value for this ModelDescrType.
     * 
     * @return modelDescr_otherComment
     */
    public java.lang.String getModelDescr_otherComment() {
        return modelDescr_otherComment;
    }


    /**
     * Sets the modelDescr_otherComment value for this ModelDescrType.
     * 
     * @param modelDescr_otherComment
     */
    public void setModelDescr_otherComment(java.lang.String modelDescr_otherComment) {
        this.modelDescr_otherComment = modelDescr_otherComment;
    }


    /**
     * Gets the modelDescr_attribution value for this ModelDescrType.
     * 
     * @return modelDescr_attribution
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelDescr_attributionType getModelDescr_attribution() {
        return modelDescr_attribution;
    }


    /**
     * Sets the modelDescr_attribution value for this ModelDescrType.
     * 
     * @param modelDescr_attribution
     */
    public void setModelDescr_attribution(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelDescr_attributionType modelDescr_attribution) {
        this.modelDescr_attribution = modelDescr_attribution;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModelDescrType)) return false;
        ModelDescrType other = (ModelDescrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelDescr_name==null && other.getModelDescr_name()==null) || 
             (this.modelDescr_name!=null &&
              this.modelDescr_name.equals(other.getModelDescr_name()))) &&
            ((this.modelDescr_pdbReso==null && other.getModelDescr_pdbReso()==null) || 
             (this.modelDescr_pdbReso!=null &&
              this.modelDescr_pdbReso.equals(other.getModelDescr_pdbReso()))) &&
            ((this.modelDescr_pdbMethod==null && other.getModelDescr_pdbMethod()==null) || 
             (this.modelDescr_pdbMethod!=null &&
              this.modelDescr_pdbMethod.equals(other.getModelDescr_pdbMethod()))) &&
            ((this.modelDescr_pdbComment==null && other.getModelDescr_pdbComment()==null) || 
             (this.modelDescr_pdbComment!=null &&
              this.modelDescr_pdbComment.equals(other.getModelDescr_pdbComment()))) &&
            ((this.modelDescr_otherComment==null && other.getModelDescr_otherComment()==null) || 
             (this.modelDescr_otherComment!=null &&
              this.modelDescr_otherComment.equals(other.getModelDescr_otherComment()))) &&
            ((this.modelDescr_attribution==null && other.getModelDescr_attribution()==null) || 
             (this.modelDescr_attribution!=null &&
              this.modelDescr_attribution.equals(other.getModelDescr_attribution())));
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
        if (getModelDescr_name() != null) {
            _hashCode += getModelDescr_name().hashCode();
        }
        if (getModelDescr_pdbReso() != null) {
            _hashCode += getModelDescr_pdbReso().hashCode();
        }
        if (getModelDescr_pdbMethod() != null) {
            _hashCode += getModelDescr_pdbMethod().hashCode();
        }
        if (getModelDescr_pdbComment() != null) {
            _hashCode += getModelDescr_pdbComment().hashCode();
        }
        if (getModelDescr_otherComment() != null) {
            _hashCode += getModelDescr_otherComment().hashCode();
        }
        if (getModelDescr_attribution() != null) {
            _hashCode += getModelDescr_attribution().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModelDescrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelDescr_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-descr_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelDescr_pdbReso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-descr_pdb-reso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelDescr_pdbMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-descr_pdb-method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelDescr_pdbComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-descr_pdb-comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelDescr_otherComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-descr_other-comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelDescr_attribution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-descr_attribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-descr_attributionType"));
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
