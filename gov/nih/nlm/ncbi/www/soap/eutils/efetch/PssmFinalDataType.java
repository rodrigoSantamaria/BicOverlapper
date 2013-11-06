/**
 * PssmFinalDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PssmFinalDataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmFinalData_scoresType pssmFinalData_scores;

    private java.lang.String pssmFinalData_lambda;

    private java.lang.String pssmFinalData_kappa;

    private java.lang.String pssmFinalData_h;

    private java.lang.String pssmFinalData_scalingFactor;

    public PssmFinalDataType() {
    }

    public PssmFinalDataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmFinalData_scoresType pssmFinalData_scores,
           java.lang.String pssmFinalData_lambda,
           java.lang.String pssmFinalData_kappa,
           java.lang.String pssmFinalData_h,
           java.lang.String pssmFinalData_scalingFactor) {
           this.pssmFinalData_scores = pssmFinalData_scores;
           this.pssmFinalData_lambda = pssmFinalData_lambda;
           this.pssmFinalData_kappa = pssmFinalData_kappa;
           this.pssmFinalData_h = pssmFinalData_h;
           this.pssmFinalData_scalingFactor = pssmFinalData_scalingFactor;
    }


    /**
     * Gets the pssmFinalData_scores value for this PssmFinalDataType.
     * 
     * @return pssmFinalData_scores
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmFinalData_scoresType getPssmFinalData_scores() {
        return pssmFinalData_scores;
    }


    /**
     * Sets the pssmFinalData_scores value for this PssmFinalDataType.
     * 
     * @param pssmFinalData_scores
     */
    public void setPssmFinalData_scores(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmFinalData_scoresType pssmFinalData_scores) {
        this.pssmFinalData_scores = pssmFinalData_scores;
    }


    /**
     * Gets the pssmFinalData_lambda value for this PssmFinalDataType.
     * 
     * @return pssmFinalData_lambda
     */
    public java.lang.String getPssmFinalData_lambda() {
        return pssmFinalData_lambda;
    }


    /**
     * Sets the pssmFinalData_lambda value for this PssmFinalDataType.
     * 
     * @param pssmFinalData_lambda
     */
    public void setPssmFinalData_lambda(java.lang.String pssmFinalData_lambda) {
        this.pssmFinalData_lambda = pssmFinalData_lambda;
    }


    /**
     * Gets the pssmFinalData_kappa value for this PssmFinalDataType.
     * 
     * @return pssmFinalData_kappa
     */
    public java.lang.String getPssmFinalData_kappa() {
        return pssmFinalData_kappa;
    }


    /**
     * Sets the pssmFinalData_kappa value for this PssmFinalDataType.
     * 
     * @param pssmFinalData_kappa
     */
    public void setPssmFinalData_kappa(java.lang.String pssmFinalData_kappa) {
        this.pssmFinalData_kappa = pssmFinalData_kappa;
    }


    /**
     * Gets the pssmFinalData_h value for this PssmFinalDataType.
     * 
     * @return pssmFinalData_h
     */
    public java.lang.String getPssmFinalData_h() {
        return pssmFinalData_h;
    }


    /**
     * Sets the pssmFinalData_h value for this PssmFinalDataType.
     * 
     * @param pssmFinalData_h
     */
    public void setPssmFinalData_h(java.lang.String pssmFinalData_h) {
        this.pssmFinalData_h = pssmFinalData_h;
    }


    /**
     * Gets the pssmFinalData_scalingFactor value for this PssmFinalDataType.
     * 
     * @return pssmFinalData_scalingFactor
     */
    public java.lang.String getPssmFinalData_scalingFactor() {
        return pssmFinalData_scalingFactor;
    }


    /**
     * Sets the pssmFinalData_scalingFactor value for this PssmFinalDataType.
     * 
     * @param pssmFinalData_scalingFactor
     */
    public void setPssmFinalData_scalingFactor(java.lang.String pssmFinalData_scalingFactor) {
        this.pssmFinalData_scalingFactor = pssmFinalData_scalingFactor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssmFinalDataType)) return false;
        PssmFinalDataType other = (PssmFinalDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssmFinalData_scores==null && other.getPssmFinalData_scores()==null) || 
             (this.pssmFinalData_scores!=null &&
              this.pssmFinalData_scores.equals(other.getPssmFinalData_scores()))) &&
            ((this.pssmFinalData_lambda==null && other.getPssmFinalData_lambda()==null) || 
             (this.pssmFinalData_lambda!=null &&
              this.pssmFinalData_lambda.equals(other.getPssmFinalData_lambda()))) &&
            ((this.pssmFinalData_kappa==null && other.getPssmFinalData_kappa()==null) || 
             (this.pssmFinalData_kappa!=null &&
              this.pssmFinalData_kappa.equals(other.getPssmFinalData_kappa()))) &&
            ((this.pssmFinalData_h==null && other.getPssmFinalData_h()==null) || 
             (this.pssmFinalData_h!=null &&
              this.pssmFinalData_h.equals(other.getPssmFinalData_h()))) &&
            ((this.pssmFinalData_scalingFactor==null && other.getPssmFinalData_scalingFactor()==null) || 
             (this.pssmFinalData_scalingFactor!=null &&
              this.pssmFinalData_scalingFactor.equals(other.getPssmFinalData_scalingFactor())));
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
        if (getPssmFinalData_scores() != null) {
            _hashCode += getPssmFinalData_scores().hashCode();
        }
        if (getPssmFinalData_lambda() != null) {
            _hashCode += getPssmFinalData_lambda().hashCode();
        }
        if (getPssmFinalData_kappa() != null) {
            _hashCode += getPssmFinalData_kappa().hashCode();
        }
        if (getPssmFinalData_h() != null) {
            _hashCode += getPssmFinalData_h().hashCode();
        }
        if (getPssmFinalData_scalingFactor() != null) {
            _hashCode += getPssmFinalData_scalingFactor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssmFinalDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmFinalDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmFinalData_scores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmFinalData_scores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmFinalData_scoresType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmFinalData_lambda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmFinalData_lambda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmFinalData_kappa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmFinalData_kappa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmFinalData_h");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmFinalData_h"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmFinalData_scalingFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmFinalData_scalingFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
