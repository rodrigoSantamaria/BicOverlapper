/**
 * Cdd_featuresType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cdd_featuresType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSetType biostrucAnnotSet;

    public Cdd_featuresType() {
    }

    public Cdd_featuresType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSetType biostrucAnnotSet) {
           this.biostrucAnnotSet = biostrucAnnotSet;
    }


    /**
     * Gets the biostrucAnnotSet value for this Cdd_featuresType.
     * 
     * @return biostrucAnnotSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSetType getBiostrucAnnotSet() {
        return biostrucAnnotSet;
    }


    /**
     * Sets the biostrucAnnotSet value for this Cdd_featuresType.
     * 
     * @param biostrucAnnotSet
     */
    public void setBiostrucAnnotSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSetType biostrucAnnotSet) {
        this.biostrucAnnotSet = biostrucAnnotSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cdd_featuresType)) return false;
        Cdd_featuresType other = (Cdd_featuresType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucAnnotSet==null && other.getBiostrucAnnotSet()==null) || 
             (this.biostrucAnnotSet!=null &&
              this.biostrucAnnotSet.equals(other.getBiostrucAnnotSet())));
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
        if (getBiostrucAnnotSet() != null) {
            _hashCode += getBiostrucAnnotSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cdd_featuresType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_featuresType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucAnnotSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-annot-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-annot-setType"));
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
