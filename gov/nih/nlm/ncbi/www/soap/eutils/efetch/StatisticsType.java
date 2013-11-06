/**
 * StatisticsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class StatisticsType  implements java.io.Serializable {
    private java.lang.String statistics_dbNum;

    private java.lang.String statistics_dbLen;

    private java.lang.String statistics_hspLen;

    private java.lang.String statistics_effSpace;

    private java.lang.String statistics_kappa;

    private java.lang.String statistics_lambda;

    private java.lang.String statistics_entropy;

    public StatisticsType() {
    }

    public StatisticsType(
           java.lang.String statistics_dbNum,
           java.lang.String statistics_dbLen,
           java.lang.String statistics_hspLen,
           java.lang.String statistics_effSpace,
           java.lang.String statistics_kappa,
           java.lang.String statistics_lambda,
           java.lang.String statistics_entropy) {
           this.statistics_dbNum = statistics_dbNum;
           this.statistics_dbLen = statistics_dbLen;
           this.statistics_hspLen = statistics_hspLen;
           this.statistics_effSpace = statistics_effSpace;
           this.statistics_kappa = statistics_kappa;
           this.statistics_lambda = statistics_lambda;
           this.statistics_entropy = statistics_entropy;
    }


    /**
     * Gets the statistics_dbNum value for this StatisticsType.
     * 
     * @return statistics_dbNum
     */
    public java.lang.String getStatistics_dbNum() {
        return statistics_dbNum;
    }


    /**
     * Sets the statistics_dbNum value for this StatisticsType.
     * 
     * @param statistics_dbNum
     */
    public void setStatistics_dbNum(java.lang.String statistics_dbNum) {
        this.statistics_dbNum = statistics_dbNum;
    }


    /**
     * Gets the statistics_dbLen value for this StatisticsType.
     * 
     * @return statistics_dbLen
     */
    public java.lang.String getStatistics_dbLen() {
        return statistics_dbLen;
    }


    /**
     * Sets the statistics_dbLen value for this StatisticsType.
     * 
     * @param statistics_dbLen
     */
    public void setStatistics_dbLen(java.lang.String statistics_dbLen) {
        this.statistics_dbLen = statistics_dbLen;
    }


    /**
     * Gets the statistics_hspLen value for this StatisticsType.
     * 
     * @return statistics_hspLen
     */
    public java.lang.String getStatistics_hspLen() {
        return statistics_hspLen;
    }


    /**
     * Sets the statistics_hspLen value for this StatisticsType.
     * 
     * @param statistics_hspLen
     */
    public void setStatistics_hspLen(java.lang.String statistics_hspLen) {
        this.statistics_hspLen = statistics_hspLen;
    }


    /**
     * Gets the statistics_effSpace value for this StatisticsType.
     * 
     * @return statistics_effSpace
     */
    public java.lang.String getStatistics_effSpace() {
        return statistics_effSpace;
    }


    /**
     * Sets the statistics_effSpace value for this StatisticsType.
     * 
     * @param statistics_effSpace
     */
    public void setStatistics_effSpace(java.lang.String statistics_effSpace) {
        this.statistics_effSpace = statistics_effSpace;
    }


    /**
     * Gets the statistics_kappa value for this StatisticsType.
     * 
     * @return statistics_kappa
     */
    public java.lang.String getStatistics_kappa() {
        return statistics_kappa;
    }


    /**
     * Sets the statistics_kappa value for this StatisticsType.
     * 
     * @param statistics_kappa
     */
    public void setStatistics_kappa(java.lang.String statistics_kappa) {
        this.statistics_kappa = statistics_kappa;
    }


    /**
     * Gets the statistics_lambda value for this StatisticsType.
     * 
     * @return statistics_lambda
     */
    public java.lang.String getStatistics_lambda() {
        return statistics_lambda;
    }


    /**
     * Sets the statistics_lambda value for this StatisticsType.
     * 
     * @param statistics_lambda
     */
    public void setStatistics_lambda(java.lang.String statistics_lambda) {
        this.statistics_lambda = statistics_lambda;
    }


    /**
     * Gets the statistics_entropy value for this StatisticsType.
     * 
     * @return statistics_entropy
     */
    public java.lang.String getStatistics_entropy() {
        return statistics_entropy;
    }


    /**
     * Sets the statistics_entropy value for this StatisticsType.
     * 
     * @param statistics_entropy
     */
    public void setStatistics_entropy(java.lang.String statistics_entropy) {
        this.statistics_entropy = statistics_entropy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatisticsType)) return false;
        StatisticsType other = (StatisticsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statistics_dbNum==null && other.getStatistics_dbNum()==null) || 
             (this.statistics_dbNum!=null &&
              this.statistics_dbNum.equals(other.getStatistics_dbNum()))) &&
            ((this.statistics_dbLen==null && other.getStatistics_dbLen()==null) || 
             (this.statistics_dbLen!=null &&
              this.statistics_dbLen.equals(other.getStatistics_dbLen()))) &&
            ((this.statistics_hspLen==null && other.getStatistics_hspLen()==null) || 
             (this.statistics_hspLen!=null &&
              this.statistics_hspLen.equals(other.getStatistics_hspLen()))) &&
            ((this.statistics_effSpace==null && other.getStatistics_effSpace()==null) || 
             (this.statistics_effSpace!=null &&
              this.statistics_effSpace.equals(other.getStatistics_effSpace()))) &&
            ((this.statistics_kappa==null && other.getStatistics_kappa()==null) || 
             (this.statistics_kappa!=null &&
              this.statistics_kappa.equals(other.getStatistics_kappa()))) &&
            ((this.statistics_lambda==null && other.getStatistics_lambda()==null) || 
             (this.statistics_lambda!=null &&
              this.statistics_lambda.equals(other.getStatistics_lambda()))) &&
            ((this.statistics_entropy==null && other.getStatistics_entropy()==null) || 
             (this.statistics_entropy!=null &&
              this.statistics_entropy.equals(other.getStatistics_entropy())));
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
        if (getStatistics_dbNum() != null) {
            _hashCode += getStatistics_dbNum().hashCode();
        }
        if (getStatistics_dbLen() != null) {
            _hashCode += getStatistics_dbLen().hashCode();
        }
        if (getStatistics_hspLen() != null) {
            _hashCode += getStatistics_hspLen().hashCode();
        }
        if (getStatistics_effSpace() != null) {
            _hashCode += getStatistics_effSpace().hashCode();
        }
        if (getStatistics_kappa() != null) {
            _hashCode += getStatistics_kappa().hashCode();
        }
        if (getStatistics_lambda() != null) {
            _hashCode += getStatistics_lambda().hashCode();
        }
        if (getStatistics_entropy() != null) {
            _hashCode += getStatistics_entropy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatisticsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "StatisticsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistics_dbNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Statistics_db-num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistics_dbLen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Statistics_db-len"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistics_hspLen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Statistics_hsp-len"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistics_effSpace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Statistics_eff-space"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistics_kappa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Statistics_kappa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistics_lambda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Statistics_lambda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistics_entropy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Statistics_entropy"));
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
