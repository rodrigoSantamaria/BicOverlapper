/**
 * Cn3DUserAnnotations_annotationsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DUserAnnotations_annotationsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotationType[] cn3DUserAnnotation;

    public Cn3DUserAnnotations_annotationsType() {
    }

    public Cn3DUserAnnotations_annotationsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotationType[] cn3DUserAnnotation) {
           this.cn3DUserAnnotation = cn3DUserAnnotation;
    }


    /**
     * Gets the cn3DUserAnnotation value for this Cn3DUserAnnotations_annotationsType.
     * 
     * @return cn3DUserAnnotation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotationType[] getCn3DUserAnnotation() {
        return cn3DUserAnnotation;
    }


    /**
     * Sets the cn3DUserAnnotation value for this Cn3DUserAnnotations_annotationsType.
     * 
     * @param cn3DUserAnnotation
     */
    public void setCn3DUserAnnotation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotationType[] cn3DUserAnnotation) {
        this.cn3DUserAnnotation = cn3DUserAnnotation;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotationType getCn3DUserAnnotation(int i) {
        return this.cn3DUserAnnotation[i];
    }

    public void setCn3DUserAnnotation(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotationType _value) {
        this.cn3DUserAnnotation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DUserAnnotations_annotationsType)) return false;
        Cn3DUserAnnotations_annotationsType other = (Cn3DUserAnnotations_annotationsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DUserAnnotation==null && other.getCn3DUserAnnotation()==null) || 
             (this.cn3DUserAnnotation!=null &&
              java.util.Arrays.equals(this.cn3DUserAnnotation, other.getCn3DUserAnnotation())));
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
        if (getCn3DUserAnnotation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCn3DUserAnnotation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCn3DUserAnnotation(), i);
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
        new org.apache.axis.description.TypeDesc(Cn3DUserAnnotations_annotationsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotations_annotationsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DUserAnnotation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotationType"));
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
