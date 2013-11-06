/**
 * Assembly_componentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Assembly_componentType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ComponentType[] component;

    public Assembly_componentType() {
    }

    public Assembly_componentType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ComponentType[] component) {
           this.component = component;
    }


    /**
     * Gets the component value for this Assembly_componentType.
     * 
     * @return component
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ComponentType[] getComponent() {
        return component;
    }


    /**
     * Sets the component value for this Assembly_componentType.
     * 
     * @param component
     */
    public void setComponent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ComponentType[] component) {
        this.component = component;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ComponentType getComponent(int i) {
        return this.component[i];
    }

    public void setComponent(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ComponentType _value) {
        this.component[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Assembly_componentType)) return false;
        Assembly_componentType other = (Assembly_componentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.component==null && other.getComponent()==null) || 
             (this.component!=null &&
              java.util.Arrays.equals(this.component, other.getComponent())));
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
        if (getComponent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponent(), i);
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
        new org.apache.axis.description.TypeDesc(Assembly_componentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_componentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ComponentType"));
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
