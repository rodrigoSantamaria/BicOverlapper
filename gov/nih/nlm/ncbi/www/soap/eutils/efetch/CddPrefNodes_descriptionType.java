/**
 * CddPrefNodes_descriptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddPrefNodes_descriptionType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescrSetType cddPrefNodeDescrSet;

    public CddPrefNodes_descriptionType() {
    }

    public CddPrefNodes_descriptionType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescrSetType cddPrefNodeDescrSet) {
           this.cddPrefNodeDescrSet = cddPrefNodeDescrSet;
    }


    /**
     * Gets the cddPrefNodeDescrSet value for this CddPrefNodes_descriptionType.
     * 
     * @return cddPrefNodeDescrSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescrSetType getCddPrefNodeDescrSet() {
        return cddPrefNodeDescrSet;
    }


    /**
     * Sets the cddPrefNodeDescrSet value for this CddPrefNodes_descriptionType.
     * 
     * @param cddPrefNodeDescrSet
     */
    public void setCddPrefNodeDescrSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescrSetType cddPrefNodeDescrSet) {
        this.cddPrefNodeDescrSet = cddPrefNodeDescrSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddPrefNodes_descriptionType)) return false;
        CddPrefNodes_descriptionType other = (CddPrefNodes_descriptionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddPrefNodeDescrSet==null && other.getCddPrefNodeDescrSet()==null) || 
             (this.cddPrefNodeDescrSet!=null &&
              this.cddPrefNodeDescrSet.equals(other.getCddPrefNodeDescrSet())));
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
        if (getCddPrefNodeDescrSet() != null) {
            _hashCode += getCddPrefNodeDescrSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddPrefNodes_descriptionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-nodes_descriptionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddPrefNodeDescrSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-node-descr-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-node-descr-setType"));
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
