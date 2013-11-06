/**
 * EntrezGeneral_styleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EntrezGeneral_styleType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezStyleType entrezStyle;

    public EntrezGeneral_styleType() {
    }

    public EntrezGeneral_styleType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezStyleType entrezStyle) {
           this.entrezStyle = entrezStyle;
    }


    /**
     * Gets the entrezStyle value for this EntrezGeneral_styleType.
     * 
     * @return entrezStyle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezStyleType getEntrezStyle() {
        return entrezStyle;
    }


    /**
     * Sets the entrezStyle value for this EntrezGeneral_styleType.
     * 
     * @param entrezStyle
     */
    public void setEntrezStyle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntrezStyleType entrezStyle) {
        this.entrezStyle = entrezStyle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntrezGeneral_styleType)) return false;
        EntrezGeneral_styleType other = (EntrezGeneral_styleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrezStyle==null && other.getEntrezStyle()==null) || 
             (this.entrezStyle!=null &&
              this.entrezStyle.equals(other.getEntrezStyle())));
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
        if (getEntrezStyle() != null) {
            _hashCode += getEntrezStyle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntrezGeneral_styleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-general_styleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrezStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-styleType"));
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
