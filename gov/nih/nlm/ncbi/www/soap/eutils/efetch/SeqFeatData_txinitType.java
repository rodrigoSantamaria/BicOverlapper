/**
 * SeqFeatData_txinitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqFeatData_txinitType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxinitType txinit;

    public SeqFeatData_txinitType() {
    }

    public SeqFeatData_txinitType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxinitType txinit) {
           this.txinit = txinit;
    }


    /**
     * Gets the txinit value for this SeqFeatData_txinitType.
     * 
     * @return txinit
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxinitType getTxinit() {
        return txinit;
    }


    /**
     * Sets the txinit value for this SeqFeatData_txinitType.
     * 
     * @param txinit
     */
    public void setTxinit(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxinitType txinit) {
        this.txinit = txinit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqFeatData_txinitType)) return false;
        SeqFeatData_txinitType other = (SeqFeatData_txinitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.txinit==null && other.getTxinit()==null) || 
             (this.txinit!=null &&
              this.txinit.equals(other.getTxinit())));
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
        if (getTxinit() != null) {
            _hashCode += getTxinit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqFeatData_txinitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_txinitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txinit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Txinit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TxinitType"));
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
