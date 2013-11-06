/**
 * ProjectDescrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ProjectDescrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectDescr_idType projectDescr_id;

    private java.lang.String projectDescr_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectDescr_descrType projectDescr_descr;

    public ProjectDescrType() {
    }

    public ProjectDescrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectDescr_idType projectDescr_id,
           java.lang.String projectDescr_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectDescr_descrType projectDescr_descr) {
           this.projectDescr_id = projectDescr_id;
           this.projectDescr_name = projectDescr_name;
           this.projectDescr_descr = projectDescr_descr;
    }


    /**
     * Gets the projectDescr_id value for this ProjectDescrType.
     * 
     * @return projectDescr_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectDescr_idType getProjectDescr_id() {
        return projectDescr_id;
    }


    /**
     * Sets the projectDescr_id value for this ProjectDescrType.
     * 
     * @param projectDescr_id
     */
    public void setProjectDescr_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectDescr_idType projectDescr_id) {
        this.projectDescr_id = projectDescr_id;
    }


    /**
     * Gets the projectDescr_name value for this ProjectDescrType.
     * 
     * @return projectDescr_name
     */
    public java.lang.String getProjectDescr_name() {
        return projectDescr_name;
    }


    /**
     * Sets the projectDescr_name value for this ProjectDescrType.
     * 
     * @param projectDescr_name
     */
    public void setProjectDescr_name(java.lang.String projectDescr_name) {
        this.projectDescr_name = projectDescr_name;
    }


    /**
     * Gets the projectDescr_descr value for this ProjectDescrType.
     * 
     * @return projectDescr_descr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectDescr_descrType getProjectDescr_descr() {
        return projectDescr_descr;
    }


    /**
     * Sets the projectDescr_descr value for this ProjectDescrType.
     * 
     * @param projectDescr_descr
     */
    public void setProjectDescr_descr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectDescr_descrType projectDescr_descr) {
        this.projectDescr_descr = projectDescr_descr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectDescrType)) return false;
        ProjectDescrType other = (ProjectDescrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.projectDescr_id==null && other.getProjectDescr_id()==null) || 
             (this.projectDescr_id!=null &&
              this.projectDescr_id.equals(other.getProjectDescr_id()))) &&
            ((this.projectDescr_name==null && other.getProjectDescr_name()==null) || 
             (this.projectDescr_name!=null &&
              this.projectDescr_name.equals(other.getProjectDescr_name()))) &&
            ((this.projectDescr_descr==null && other.getProjectDescr_descr()==null) || 
             (this.projectDescr_descr!=null &&
              this.projectDescr_descr.equals(other.getProjectDescr_descr())));
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
        if (getProjectDescr_id() != null) {
            _hashCode += getProjectDescr_id().hashCode();
        }
        if (getProjectDescr_name() != null) {
            _hashCode += getProjectDescr_name().hashCode();
        }
        if (getProjectDescr_descr() != null) {
            _hashCode += getProjectDescr_descr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectDescrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectDescr_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-descr_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-descr_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectDescr_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-descr_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectDescr_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-descr_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-descr_descrType"));
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
