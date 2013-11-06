/**
 * MSChargeHandleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSChargeHandleType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSChargeHandle_calcplusoneType MSChargeHandle_calcplusone;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSChargeHandle_calcchargeType MSChargeHandle_calccharge;

    private java.lang.String MSChargeHandle_mincharge;

    private java.lang.String MSChargeHandle_maxcharge;

    private java.lang.String MSChargeHandle_considermult;

    private java.lang.String MSChargeHandle_plusone;

    public MSChargeHandleType() {
    }

    public MSChargeHandleType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSChargeHandle_calcplusoneType MSChargeHandle_calcplusone,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSChargeHandle_calcchargeType MSChargeHandle_calccharge,
           java.lang.String MSChargeHandle_mincharge,
           java.lang.String MSChargeHandle_maxcharge,
           java.lang.String MSChargeHandle_considermult,
           java.lang.String MSChargeHandle_plusone) {
           this.MSChargeHandle_calcplusone = MSChargeHandle_calcplusone;
           this.MSChargeHandle_calccharge = MSChargeHandle_calccharge;
           this.MSChargeHandle_mincharge = MSChargeHandle_mincharge;
           this.MSChargeHandle_maxcharge = MSChargeHandle_maxcharge;
           this.MSChargeHandle_considermult = MSChargeHandle_considermult;
           this.MSChargeHandle_plusone = MSChargeHandle_plusone;
    }


    /**
     * Gets the MSChargeHandle_calcplusone value for this MSChargeHandleType.
     * 
     * @return MSChargeHandle_calcplusone
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSChargeHandle_calcplusoneType getMSChargeHandle_calcplusone() {
        return MSChargeHandle_calcplusone;
    }


    /**
     * Sets the MSChargeHandle_calcplusone value for this MSChargeHandleType.
     * 
     * @param MSChargeHandle_calcplusone
     */
    public void setMSChargeHandle_calcplusone(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSChargeHandle_calcplusoneType MSChargeHandle_calcplusone) {
        this.MSChargeHandle_calcplusone = MSChargeHandle_calcplusone;
    }


    /**
     * Gets the MSChargeHandle_calccharge value for this MSChargeHandleType.
     * 
     * @return MSChargeHandle_calccharge
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSChargeHandle_calcchargeType getMSChargeHandle_calccharge() {
        return MSChargeHandle_calccharge;
    }


    /**
     * Sets the MSChargeHandle_calccharge value for this MSChargeHandleType.
     * 
     * @param MSChargeHandle_calccharge
     */
    public void setMSChargeHandle_calccharge(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSChargeHandle_calcchargeType MSChargeHandle_calccharge) {
        this.MSChargeHandle_calccharge = MSChargeHandle_calccharge;
    }


    /**
     * Gets the MSChargeHandle_mincharge value for this MSChargeHandleType.
     * 
     * @return MSChargeHandle_mincharge
     */
    public java.lang.String getMSChargeHandle_mincharge() {
        return MSChargeHandle_mincharge;
    }


    /**
     * Sets the MSChargeHandle_mincharge value for this MSChargeHandleType.
     * 
     * @param MSChargeHandle_mincharge
     */
    public void setMSChargeHandle_mincharge(java.lang.String MSChargeHandle_mincharge) {
        this.MSChargeHandle_mincharge = MSChargeHandle_mincharge;
    }


    /**
     * Gets the MSChargeHandle_maxcharge value for this MSChargeHandleType.
     * 
     * @return MSChargeHandle_maxcharge
     */
    public java.lang.String getMSChargeHandle_maxcharge() {
        return MSChargeHandle_maxcharge;
    }


    /**
     * Sets the MSChargeHandle_maxcharge value for this MSChargeHandleType.
     * 
     * @param MSChargeHandle_maxcharge
     */
    public void setMSChargeHandle_maxcharge(java.lang.String MSChargeHandle_maxcharge) {
        this.MSChargeHandle_maxcharge = MSChargeHandle_maxcharge;
    }


    /**
     * Gets the MSChargeHandle_considermult value for this MSChargeHandleType.
     * 
     * @return MSChargeHandle_considermult
     */
    public java.lang.String getMSChargeHandle_considermult() {
        return MSChargeHandle_considermult;
    }


    /**
     * Sets the MSChargeHandle_considermult value for this MSChargeHandleType.
     * 
     * @param MSChargeHandle_considermult
     */
    public void setMSChargeHandle_considermult(java.lang.String MSChargeHandle_considermult) {
        this.MSChargeHandle_considermult = MSChargeHandle_considermult;
    }


    /**
     * Gets the MSChargeHandle_plusone value for this MSChargeHandleType.
     * 
     * @return MSChargeHandle_plusone
     */
    public java.lang.String getMSChargeHandle_plusone() {
        return MSChargeHandle_plusone;
    }


    /**
     * Sets the MSChargeHandle_plusone value for this MSChargeHandleType.
     * 
     * @param MSChargeHandle_plusone
     */
    public void setMSChargeHandle_plusone(java.lang.String MSChargeHandle_plusone) {
        this.MSChargeHandle_plusone = MSChargeHandle_plusone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSChargeHandleType)) return false;
        MSChargeHandleType other = (MSChargeHandleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSChargeHandle_calcplusone==null && other.getMSChargeHandle_calcplusone()==null) || 
             (this.MSChargeHandle_calcplusone!=null &&
              this.MSChargeHandle_calcplusone.equals(other.getMSChargeHandle_calcplusone()))) &&
            ((this.MSChargeHandle_calccharge==null && other.getMSChargeHandle_calccharge()==null) || 
             (this.MSChargeHandle_calccharge!=null &&
              this.MSChargeHandle_calccharge.equals(other.getMSChargeHandle_calccharge()))) &&
            ((this.MSChargeHandle_mincharge==null && other.getMSChargeHandle_mincharge()==null) || 
             (this.MSChargeHandle_mincharge!=null &&
              this.MSChargeHandle_mincharge.equals(other.getMSChargeHandle_mincharge()))) &&
            ((this.MSChargeHandle_maxcharge==null && other.getMSChargeHandle_maxcharge()==null) || 
             (this.MSChargeHandle_maxcharge!=null &&
              this.MSChargeHandle_maxcharge.equals(other.getMSChargeHandle_maxcharge()))) &&
            ((this.MSChargeHandle_considermult==null && other.getMSChargeHandle_considermult()==null) || 
             (this.MSChargeHandle_considermult!=null &&
              this.MSChargeHandle_considermult.equals(other.getMSChargeHandle_considermult()))) &&
            ((this.MSChargeHandle_plusone==null && other.getMSChargeHandle_plusone()==null) || 
             (this.MSChargeHandle_plusone!=null &&
              this.MSChargeHandle_plusone.equals(other.getMSChargeHandle_plusone())));
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
        if (getMSChargeHandle_calcplusone() != null) {
            _hashCode += getMSChargeHandle_calcplusone().hashCode();
        }
        if (getMSChargeHandle_calccharge() != null) {
            _hashCode += getMSChargeHandle_calccharge().hashCode();
        }
        if (getMSChargeHandle_mincharge() != null) {
            _hashCode += getMSChargeHandle_mincharge().hashCode();
        }
        if (getMSChargeHandle_maxcharge() != null) {
            _hashCode += getMSChargeHandle_maxcharge().hashCode();
        }
        if (getMSChargeHandle_considermult() != null) {
            _hashCode += getMSChargeHandle_considermult().hashCode();
        }
        if (getMSChargeHandle_plusone() != null) {
            _hashCode += getMSChargeHandle_plusone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSChargeHandleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSChargeHandleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSChargeHandle_calcplusone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSChargeHandle_calcplusone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSChargeHandle_calcplusoneType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSChargeHandle_calccharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSChargeHandle_calccharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSChargeHandle_calcchargeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSChargeHandle_mincharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSChargeHandle_mincharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSChargeHandle_maxcharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSChargeHandle_maxcharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSChargeHandle_considermult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSChargeHandle_considermult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSChargeHandle_plusone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSChargeHandle_plusone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
