/**
 * Cn3DUserAnnotationsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DUserAnnotationsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotations_annotationsType cn3DUserAnnotations_annotations;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotations_viewType cn3DUserAnnotations_view;

    public Cn3DUserAnnotationsType() {
    }

    public Cn3DUserAnnotationsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotations_annotationsType cn3DUserAnnotations_annotations,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotations_viewType cn3DUserAnnotations_view) {
           this.cn3DUserAnnotations_annotations = cn3DUserAnnotations_annotations;
           this.cn3DUserAnnotations_view = cn3DUserAnnotations_view;
    }


    /**
     * Gets the cn3DUserAnnotations_annotations value for this Cn3DUserAnnotationsType.
     * 
     * @return cn3DUserAnnotations_annotations
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotations_annotationsType getCn3DUserAnnotations_annotations() {
        return cn3DUserAnnotations_annotations;
    }


    /**
     * Sets the cn3DUserAnnotations_annotations value for this Cn3DUserAnnotationsType.
     * 
     * @param cn3DUserAnnotations_annotations
     */
    public void setCn3DUserAnnotations_annotations(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotations_annotationsType cn3DUserAnnotations_annotations) {
        this.cn3DUserAnnotations_annotations = cn3DUserAnnotations_annotations;
    }


    /**
     * Gets the cn3DUserAnnotations_view value for this Cn3DUserAnnotationsType.
     * 
     * @return cn3DUserAnnotations_view
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotations_viewType getCn3DUserAnnotations_view() {
        return cn3DUserAnnotations_view;
    }


    /**
     * Sets the cn3DUserAnnotations_view value for this Cn3DUserAnnotationsType.
     * 
     * @param cn3DUserAnnotations_view
     */
    public void setCn3DUserAnnotations_view(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DUserAnnotations_viewType cn3DUserAnnotations_view) {
        this.cn3DUserAnnotations_view = cn3DUserAnnotations_view;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DUserAnnotationsType)) return false;
        Cn3DUserAnnotationsType other = (Cn3DUserAnnotationsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DUserAnnotations_annotations==null && other.getCn3DUserAnnotations_annotations()==null) || 
             (this.cn3DUserAnnotations_annotations!=null &&
              this.cn3DUserAnnotations_annotations.equals(other.getCn3DUserAnnotations_annotations()))) &&
            ((this.cn3DUserAnnotations_view==null && other.getCn3DUserAnnotations_view()==null) || 
             (this.cn3DUserAnnotations_view!=null &&
              this.cn3DUserAnnotations_view.equals(other.getCn3DUserAnnotations_view())));
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
        if (getCn3DUserAnnotations_annotations() != null) {
            _hashCode += getCn3DUserAnnotations_annotations().hashCode();
        }
        if (getCn3DUserAnnotations_view() != null) {
            _hashCode += getCn3DUserAnnotations_view().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DUserAnnotationsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotationsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DUserAnnotations_annotations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotations_annotations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotations_annotationsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DUserAnnotations_view");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotations_view"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-user-annotations_viewType"));
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
