/**
 * SeqSubmit_subType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqSubmit_subType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlockType submitBlock;

    public SeqSubmit_subType() {
    }

    public SeqSubmit_subType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlockType submitBlock) {
           this.submitBlock = submitBlock;
    }


    /**
     * Gets the submitBlock value for this SeqSubmit_subType.
     * 
     * @return submitBlock
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlockType getSubmitBlock() {
        return submitBlock;
    }


    /**
     * Sets the submitBlock value for this SeqSubmit_subType.
     * 
     * @param submitBlock
     */
    public void setSubmitBlock(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SubmitBlockType submitBlock) {
        this.submitBlock = submitBlock;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqSubmit_subType)) return false;
        SeqSubmit_subType other = (SeqSubmit_subType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.submitBlock==null && other.getSubmitBlock()==null) || 
             (this.submitBlock!=null &&
              this.submitBlock.equals(other.getSubmitBlock())));
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
        if (getSubmitBlock() != null) {
            _hashCode += getSubmitBlock().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqSubmit_subType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-submit_subType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-blockType"));
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
