/**
 * AnnotIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AnnotIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotId_localType annotId_local;

    private java.lang.String annotId_ncbi;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotId_generalType annotId_general;

    public AnnotIdType() {
    }

    public AnnotIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotId_localType annotId_local,
           java.lang.String annotId_ncbi,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotId_generalType annotId_general) {
           this.annotId_local = annotId_local;
           this.annotId_ncbi = annotId_ncbi;
           this.annotId_general = annotId_general;
    }


    /**
     * Gets the annotId_local value for this AnnotIdType.
     * 
     * @return annotId_local
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotId_localType getAnnotId_local() {
        return annotId_local;
    }


    /**
     * Sets the annotId_local value for this AnnotIdType.
     * 
     * @param annotId_local
     */
    public void setAnnotId_local(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotId_localType annotId_local) {
        this.annotId_local = annotId_local;
    }


    /**
     * Gets the annotId_ncbi value for this AnnotIdType.
     * 
     * @return annotId_ncbi
     */
    public java.lang.String getAnnotId_ncbi() {
        return annotId_ncbi;
    }


    /**
     * Sets the annotId_ncbi value for this AnnotIdType.
     * 
     * @param annotId_ncbi
     */
    public void setAnnotId_ncbi(java.lang.String annotId_ncbi) {
        this.annotId_ncbi = annotId_ncbi;
    }


    /**
     * Gets the annotId_general value for this AnnotIdType.
     * 
     * @return annotId_general
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotId_generalType getAnnotId_general() {
        return annotId_general;
    }


    /**
     * Sets the annotId_general value for this AnnotIdType.
     * 
     * @param annotId_general
     */
    public void setAnnotId_general(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnnotId_generalType annotId_general) {
        this.annotId_general = annotId_general;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnnotIdType)) return false;
        AnnotIdType other = (AnnotIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.annotId_local==null && other.getAnnotId_local()==null) || 
             (this.annotId_local!=null &&
              this.annotId_local.equals(other.getAnnotId_local()))) &&
            ((this.annotId_ncbi==null && other.getAnnotId_ncbi()==null) || 
             (this.annotId_ncbi!=null &&
              this.annotId_ncbi.equals(other.getAnnotId_ncbi()))) &&
            ((this.annotId_general==null && other.getAnnotId_general()==null) || 
             (this.annotId_general!=null &&
              this.annotId_general.equals(other.getAnnotId_general())));
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
        if (getAnnotId_local() != null) {
            _hashCode += getAnnotId_local().hashCode();
        }
        if (getAnnotId_ncbi() != null) {
            _hashCode += getAnnotId_ncbi().hashCode();
        }
        if (getAnnotId_general() != null) {
            _hashCode += getAnnotId_general().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnnotIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annot-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotId_local");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annot-id_local"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annot-id_localType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotId_ncbi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annot-id_ncbi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotId_general");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annot-id_general"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Annot-id_generalType"));
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
