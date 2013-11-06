/**
 * Cn3DUserAnnotation_residuesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DUserAnnotation_residuesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocationType[] cn3DObjectLocation;

    public Cn3DUserAnnotation_residuesType() {
    }

    public Cn3DUserAnnotation_residuesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocationType[] cn3DObjectLocation) {
           this.cn3DObjectLocation = cn3DObjectLocation;
    }


    /**
     * Gets the cn3DObjectLocation value for this Cn3DUserAnnotation_residuesType.
     * 
     * @return cn3DObjectLocation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocationType[] getCn3DObjectLocation() {
        return cn3DObjectLocation;
    }


    /**
     * Sets the cn3DObjectLocation value for this Cn3DUserAnnotation_residuesType.
     * 
     * @param cn3DObjectLocation
     */
    public void setCn3DObjectLocation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocationType[] cn3DObjectLocation) {
        this.cn3DObjectLocation = cn3DObjectLocation;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocationType getCn3DObjectLocation(int i) {
        return this.cn3DObjectLocation[i];
    }

    public void setCn3DObjectLocation(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocationType _value) {
        this.cn3DObjectLocation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DUserAnnotation_residuesType)) return false;
        Cn3DUserAnnotation_residuesType other = (Cn3DUserAnnotation_residuesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DObjectLocation==null && other.getCn3DObjectLocation()==null) || 
             (this.cn3DObjectLocation!=null &&
              java.util.Arrays.equals(this.cn3DObjectLocation, other.getCn3DObjectLocation())));
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
        if (getCn3DObjectLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCn3DObjectLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCn3DObjectLocation(), i);
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
        new org.apache.axis.description.TypeDesc(Cn3DUserAnnotation_residuesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotation_residuesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DObjectLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-object-location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-object-locationType"));
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
