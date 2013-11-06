/**
 * Imprint_historyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Imprint_historyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubStatusDateSetType pubStatusDateSet;

    public Imprint_historyType() {
    }

    public Imprint_historyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubStatusDateSetType pubStatusDateSet) {
           this.pubStatusDateSet = pubStatusDateSet;
    }


    /**
     * Gets the pubStatusDateSet value for this Imprint_historyType.
     * 
     * @return pubStatusDateSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubStatusDateSetType getPubStatusDateSet() {
        return pubStatusDateSet;
    }


    /**
     * Sets the pubStatusDateSet value for this Imprint_historyType.
     * 
     * @param pubStatusDateSet
     */
    public void setPubStatusDateSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubStatusDateSetType pubStatusDateSet) {
        this.pubStatusDateSet = pubStatusDateSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Imprint_historyType)) return false;
        Imprint_historyType other = (Imprint_historyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pubStatusDateSet==null && other.getPubStatusDateSet()==null) || 
             (this.pubStatusDateSet!=null &&
              this.pubStatusDateSet.equals(other.getPubStatusDateSet())));
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
        if (getPubStatusDateSet() != null) {
            _hashCode += getPubStatusDateSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Imprint_historyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint_historyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubStatusDateSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubStatusDateSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubStatusDateSetType"));
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
