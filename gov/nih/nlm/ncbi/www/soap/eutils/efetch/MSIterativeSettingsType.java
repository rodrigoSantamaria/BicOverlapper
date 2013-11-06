/**
 * MSIterativeSettingsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSIterativeSettingsType  implements java.io.Serializable {
    private java.lang.String MSIterativeSettings_researchthresh;

    private java.lang.String MSIterativeSettings_subsetthresh;

    private java.lang.String MSIterativeSettings_replacethresh;

    public MSIterativeSettingsType() {
    }

    public MSIterativeSettingsType(
           java.lang.String MSIterativeSettings_researchthresh,
           java.lang.String MSIterativeSettings_subsetthresh,
           java.lang.String MSIterativeSettings_replacethresh) {
           this.MSIterativeSettings_researchthresh = MSIterativeSettings_researchthresh;
           this.MSIterativeSettings_subsetthresh = MSIterativeSettings_subsetthresh;
           this.MSIterativeSettings_replacethresh = MSIterativeSettings_replacethresh;
    }


    /**
     * Gets the MSIterativeSettings_researchthresh value for this MSIterativeSettingsType.
     * 
     * @return MSIterativeSettings_researchthresh
     */
    public java.lang.String getMSIterativeSettings_researchthresh() {
        return MSIterativeSettings_researchthresh;
    }


    /**
     * Sets the MSIterativeSettings_researchthresh value for this MSIterativeSettingsType.
     * 
     * @param MSIterativeSettings_researchthresh
     */
    public void setMSIterativeSettings_researchthresh(java.lang.String MSIterativeSettings_researchthresh) {
        this.MSIterativeSettings_researchthresh = MSIterativeSettings_researchthresh;
    }


    /**
     * Gets the MSIterativeSettings_subsetthresh value for this MSIterativeSettingsType.
     * 
     * @return MSIterativeSettings_subsetthresh
     */
    public java.lang.String getMSIterativeSettings_subsetthresh() {
        return MSIterativeSettings_subsetthresh;
    }


    /**
     * Sets the MSIterativeSettings_subsetthresh value for this MSIterativeSettingsType.
     * 
     * @param MSIterativeSettings_subsetthresh
     */
    public void setMSIterativeSettings_subsetthresh(java.lang.String MSIterativeSettings_subsetthresh) {
        this.MSIterativeSettings_subsetthresh = MSIterativeSettings_subsetthresh;
    }


    /**
     * Gets the MSIterativeSettings_replacethresh value for this MSIterativeSettingsType.
     * 
     * @return MSIterativeSettings_replacethresh
     */
    public java.lang.String getMSIterativeSettings_replacethresh() {
        return MSIterativeSettings_replacethresh;
    }


    /**
     * Sets the MSIterativeSettings_replacethresh value for this MSIterativeSettingsType.
     * 
     * @param MSIterativeSettings_replacethresh
     */
    public void setMSIterativeSettings_replacethresh(java.lang.String MSIterativeSettings_replacethresh) {
        this.MSIterativeSettings_replacethresh = MSIterativeSettings_replacethresh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSIterativeSettingsType)) return false;
        MSIterativeSettingsType other = (MSIterativeSettingsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSIterativeSettings_researchthresh==null && other.getMSIterativeSettings_researchthresh()==null) || 
             (this.MSIterativeSettings_researchthresh!=null &&
              this.MSIterativeSettings_researchthresh.equals(other.getMSIterativeSettings_researchthresh()))) &&
            ((this.MSIterativeSettings_subsetthresh==null && other.getMSIterativeSettings_subsetthresh()==null) || 
             (this.MSIterativeSettings_subsetthresh!=null &&
              this.MSIterativeSettings_subsetthresh.equals(other.getMSIterativeSettings_subsetthresh()))) &&
            ((this.MSIterativeSettings_replacethresh==null && other.getMSIterativeSettings_replacethresh()==null) || 
             (this.MSIterativeSettings_replacethresh!=null &&
              this.MSIterativeSettings_replacethresh.equals(other.getMSIterativeSettings_replacethresh())));
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
        if (getMSIterativeSettings_researchthresh() != null) {
            _hashCode += getMSIterativeSettings_researchthresh().hashCode();
        }
        if (getMSIterativeSettings_subsetthresh() != null) {
            _hashCode += getMSIterativeSettings_subsetthresh().hashCode();
        }
        if (getMSIterativeSettings_replacethresh() != null) {
            _hashCode += getMSIterativeSettings_replacethresh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSIterativeSettingsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSIterativeSettingsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSIterativeSettings_researchthresh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSIterativeSettings_researchthresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSIterativeSettings_subsetthresh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSIterativeSettings_subsetthresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSIterativeSettings_replacethresh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSIterativeSettings_replacethresh"));
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
