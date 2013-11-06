/**
 * TxEvidenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TxEvidenceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_expCodeType txEvidence_expCode;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_expressionSystemType txEvidence_expressionSystem;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_lowPrecDataType txEvidence_lowPrecData;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_fromHomologType txEvidence_fromHomolog;

    public TxEvidenceType() {
    }

    public TxEvidenceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_expCodeType txEvidence_expCode,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_expressionSystemType txEvidence_expressionSystem,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_lowPrecDataType txEvidence_lowPrecData,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_fromHomologType txEvidence_fromHomolog) {
           this.txEvidence_expCode = txEvidence_expCode;
           this.txEvidence_expressionSystem = txEvidence_expressionSystem;
           this.txEvidence_lowPrecData = txEvidence_lowPrecData;
           this.txEvidence_fromHomolog = txEvidence_fromHomolog;
    }


    /**
     * Gets the txEvidence_expCode value for this TxEvidenceType.
     * 
     * @return txEvidence_expCode
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_expCodeType getTxEvidence_expCode() {
        return txEvidence_expCode;
    }


    /**
     * Sets the txEvidence_expCode value for this TxEvidenceType.
     * 
     * @param txEvidence_expCode
     */
    public void setTxEvidence_expCode(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_expCodeType txEvidence_expCode) {
        this.txEvidence_expCode = txEvidence_expCode;
    }


    /**
     * Gets the txEvidence_expressionSystem value for this TxEvidenceType.
     * 
     * @return txEvidence_expressionSystem
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_expressionSystemType getTxEvidence_expressionSystem() {
        return txEvidence_expressionSystem;
    }


    /**
     * Sets the txEvidence_expressionSystem value for this TxEvidenceType.
     * 
     * @param txEvidence_expressionSystem
     */
    public void setTxEvidence_expressionSystem(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_expressionSystemType txEvidence_expressionSystem) {
        this.txEvidence_expressionSystem = txEvidence_expressionSystem;
    }


    /**
     * Gets the txEvidence_lowPrecData value for this TxEvidenceType.
     * 
     * @return txEvidence_lowPrecData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_lowPrecDataType getTxEvidence_lowPrecData() {
        return txEvidence_lowPrecData;
    }


    /**
     * Sets the txEvidence_lowPrecData value for this TxEvidenceType.
     * 
     * @param txEvidence_lowPrecData
     */
    public void setTxEvidence_lowPrecData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_lowPrecDataType txEvidence_lowPrecData) {
        this.txEvidence_lowPrecData = txEvidence_lowPrecData;
    }


    /**
     * Gets the txEvidence_fromHomolog value for this TxEvidenceType.
     * 
     * @return txEvidence_fromHomolog
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_fromHomologType getTxEvidence_fromHomolog() {
        return txEvidence_fromHomolog;
    }


    /**
     * Sets the txEvidence_fromHomolog value for this TxEvidenceType.
     * 
     * @param txEvidence_fromHomolog
     */
    public void setTxEvidence_fromHomolog(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TxEvidence_fromHomologType txEvidence_fromHomolog) {
        this.txEvidence_fromHomolog = txEvidence_fromHomolog;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TxEvidenceType)) return false;
        TxEvidenceType other = (TxEvidenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.txEvidence_expCode==null && other.getTxEvidence_expCode()==null) || 
             (this.txEvidence_expCode!=null &&
              this.txEvidence_expCode.equals(other.getTxEvidence_expCode()))) &&
            ((this.txEvidence_expressionSystem==null && other.getTxEvidence_expressionSystem()==null) || 
             (this.txEvidence_expressionSystem!=null &&
              this.txEvidence_expressionSystem.equals(other.getTxEvidence_expressionSystem()))) &&
            ((this.txEvidence_lowPrecData==null && other.getTxEvidence_lowPrecData()==null) || 
             (this.txEvidence_lowPrecData!=null &&
              this.txEvidence_lowPrecData.equals(other.getTxEvidence_lowPrecData()))) &&
            ((this.txEvidence_fromHomolog==null && other.getTxEvidence_fromHomolog()==null) || 
             (this.txEvidence_fromHomolog!=null &&
              this.txEvidence_fromHomolog.equals(other.getTxEvidence_fromHomolog())));
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
        if (getTxEvidence_expCode() != null) {
            _hashCode += getTxEvidence_expCode().hashCode();
        }
        if (getTxEvidence_expressionSystem() != null) {
            _hashCode += getTxEvidence_expressionSystem().hashCode();
        }
        if (getTxEvidence_lowPrecData() != null) {
            _hashCode += getTxEvidence_lowPrecData().hashCode();
        }
        if (getTxEvidence_fromHomolog() != null) {
            _hashCode += getTxEvidence_fromHomolog().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TxEvidenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Tx-evidenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txEvidence_expCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Tx-evidence_exp-code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Tx-evidence_exp-codeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txEvidence_expressionSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Tx-evidence_expression-system"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Tx-evidence_expression-systemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txEvidence_lowPrecData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Tx-evidence_low-prec-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Tx-evidence_low-prec-dataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txEvidence_fromHomolog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Tx-evidence_from-homolog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Tx-evidence_from-homologType"));
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
