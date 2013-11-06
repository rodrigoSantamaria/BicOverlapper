/**
 * Txinit_evidenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Txinit_evidenceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidenceType[] txEvidence;

    public Txinit_evidenceType() {
    }

    public Txinit_evidenceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidenceType[] txEvidence) {
           this.txEvidence = txEvidence;
    }


    /**
     * Gets the txEvidence value for this Txinit_evidenceType.
     * 
     * @return txEvidence
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidenceType[] getTxEvidence() {
        return txEvidence;
    }


    /**
     * Sets the txEvidence value for this Txinit_evidenceType.
     * 
     * @param txEvidence
     */
    public void setTxEvidence(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidenceType[] txEvidence) {
        this.txEvidence = txEvidence;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidenceType getTxEvidence(int i) {
        return this.txEvidence[i];
    }

    public void setTxEvidence(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidenceType _value) {
        this.txEvidence[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Txinit_evidenceType)) return false;
        Txinit_evidenceType other = (Txinit_evidenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.txEvidence==null && other.getTxEvidence()==null) || 
             (this.txEvidence!=null &&
              java.util.Arrays.equals(this.txEvidence, other.getTxEvidence())));
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
        if (getTxEvidence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTxEvidence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTxEvidence(), i);
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
        new org.apache.axis.description.TypeDesc(Txinit_evidenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Txinit_evidenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txEvidence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Tx-evidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Tx-evidenceType"));
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
