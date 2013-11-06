/**
 * ProjectDescr_descrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ProjectDescr_descrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjdescType[] projdesc;

    public ProjectDescr_descrType() {
    }

    public ProjectDescr_descrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjdescType[] projdesc) {
           this.projdesc = projdesc;
    }


    /**
     * Gets the projdesc value for this ProjectDescr_descrType.
     * 
     * @return projdesc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjdescType[] getProjdesc() {
        return projdesc;
    }


    /**
     * Sets the projdesc value for this ProjectDescr_descrType.
     * 
     * @param projdesc
     */
    public void setProjdesc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjdescType[] projdesc) {
        this.projdesc = projdesc;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjdescType getProjdesc(int i) {
        return this.projdesc[i];
    }

    public void setProjdesc(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjdescType _value) {
        this.projdesc[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectDescr_descrType)) return false;
        ProjectDescr_descrType other = (ProjectDescr_descrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.projdesc==null && other.getProjdesc()==null) || 
             (this.projdesc!=null &&
              java.util.Arrays.equals(this.projdesc, other.getProjdesc())));
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
        if (getProjdesc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjdesc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjdesc(), i);
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
        new org.apache.axis.description.TypeDesc(ProjectDescr_descrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-descr_descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projdesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Projdesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ProjdescType"));
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
