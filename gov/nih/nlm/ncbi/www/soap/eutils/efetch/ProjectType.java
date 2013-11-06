/**
 * ProjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ProjectType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Project_descrType project_descr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Project_dataType project_data;

    public ProjectType() {
    }

    public ProjectType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Project_descrType project_descr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Project_dataType project_data) {
           this.project_descr = project_descr;
           this.project_data = project_data;
    }


    /**
     * Gets the project_descr value for this ProjectType.
     * 
     * @return project_descr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Project_descrType getProject_descr() {
        return project_descr;
    }


    /**
     * Sets the project_descr value for this ProjectType.
     * 
     * @param project_descr
     */
    public void setProject_descr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Project_descrType project_descr) {
        this.project_descr = project_descr;
    }


    /**
     * Gets the project_data value for this ProjectType.
     * 
     * @return project_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Project_dataType getProject_data() {
        return project_data;
    }


    /**
     * Sets the project_data value for this ProjectType.
     * 
     * @param project_data
     */
    public void setProject_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Project_dataType project_data) {
        this.project_data = project_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectType)) return false;
        ProjectType other = (ProjectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.project_descr==null && other.getProject_descr()==null) || 
             (this.project_descr!=null &&
              this.project_descr.equals(other.getProject_descr()))) &&
            ((this.project_data==null && other.getProject_data()==null) || 
             (this.project_data!=null &&
              this.project_data.equals(other.getProject_data())));
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
        if (getProject_descr() != null) {
            _hashCode += getProject_descr().hashCode();
        }
        if (getProject_data() != null) {
            _hashCode += getProject_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ProjectType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project_descrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project_dataType"));
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
