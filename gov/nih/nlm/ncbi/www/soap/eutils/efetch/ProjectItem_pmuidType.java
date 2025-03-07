/**
 * ProjectItem_pmuidType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ProjectItem_pmuidType  implements java.io.Serializable {
    private java.lang.String[] projectItem_pmuid_E;

    public ProjectItem_pmuidType() {
    }

    public ProjectItem_pmuidType(
           java.lang.String[] projectItem_pmuid_E) {
           this.projectItem_pmuid_E = projectItem_pmuid_E;
    }


    /**
     * Gets the projectItem_pmuid_E value for this ProjectItem_pmuidType.
     * 
     * @return projectItem_pmuid_E
     */
    public java.lang.String[] getProjectItem_pmuid_E() {
        return projectItem_pmuid_E;
    }


    /**
     * Sets the projectItem_pmuid_E value for this ProjectItem_pmuidType.
     * 
     * @param projectItem_pmuid_E
     */
    public void setProjectItem_pmuid_E(java.lang.String[] projectItem_pmuid_E) {
        this.projectItem_pmuid_E = projectItem_pmuid_E;
    }

    public java.lang.String getProjectItem_pmuid_E(int i) {
        return this.projectItem_pmuid_E[i];
    }

    public void setProjectItem_pmuid_E(int i, java.lang.String _value) {
        this.projectItem_pmuid_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectItem_pmuidType)) return false;
        ProjectItem_pmuidType other = (ProjectItem_pmuidType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.projectItem_pmuid_E==null && other.getProjectItem_pmuid_E()==null) || 
             (this.projectItem_pmuid_E!=null &&
              java.util.Arrays.equals(this.projectItem_pmuid_E, other.getProjectItem_pmuid_E())));
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
        if (getProjectItem_pmuid_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectItem_pmuid_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectItem_pmuid_E(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectItem_pmuidType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_pmuidType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_pmuid_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_pmuid_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_pmuid_E"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
