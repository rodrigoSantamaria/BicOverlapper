/**
 * CitJourType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CitJourType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJour_titleType citJour_title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJour_impType citJour_imp;

    public CitJourType() {
    }

    public CitJourType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJour_titleType citJour_title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJour_impType citJour_imp) {
           this.citJour_title = citJour_title;
           this.citJour_imp = citJour_imp;
    }


    /**
     * Gets the citJour_title value for this CitJourType.
     * 
     * @return citJour_title
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJour_titleType getCitJour_title() {
        return citJour_title;
    }


    /**
     * Sets the citJour_title value for this CitJourType.
     * 
     * @param citJour_title
     */
    public void setCitJour_title(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJour_titleType citJour_title) {
        this.citJour_title = citJour_title;
    }


    /**
     * Gets the citJour_imp value for this CitJourType.
     * 
     * @return citJour_imp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJour_impType getCitJour_imp() {
        return citJour_imp;
    }


    /**
     * Sets the citJour_imp value for this CitJourType.
     * 
     * @param citJour_imp
     */
    public void setCitJour_imp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitJour_impType citJour_imp) {
        this.citJour_imp = citJour_imp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CitJourType)) return false;
        CitJourType other = (CitJourType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citJour_title==null && other.getCitJour_title()==null) || 
             (this.citJour_title!=null &&
              this.citJour_title.equals(other.getCitJour_title()))) &&
            ((this.citJour_imp==null && other.getCitJour_imp()==null) || 
             (this.citJour_imp!=null &&
              this.citJour_imp.equals(other.getCitJour_imp())));
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
        if (getCitJour_title() != null) {
            _hashCode += getCitJour_title().hashCode();
        }
        if (getCitJour_imp() != null) {
            _hashCode += getCitJour_imp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CitJourType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-jourType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citJour_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-jour_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-jour_titleType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citJour_imp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-jour_imp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-jour_impType"));
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
