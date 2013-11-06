/**
 * BlastOutput_mbstatType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BlastOutput_mbstatType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.StatisticsType statistics;

    public BlastOutput_mbstatType() {
    }

    public BlastOutput_mbstatType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.StatisticsType statistics) {
           this.statistics = statistics;
    }


    /**
     * Gets the statistics value for this BlastOutput_mbstatType.
     * 
     * @return statistics
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.StatisticsType getStatistics() {
        return statistics;
    }


    /**
     * Sets the statistics value for this BlastOutput_mbstatType.
     * 
     * @param statistics
     */
    public void setStatistics(gov.nih.nlm.ncbi.www.soap.eutils.efetch.StatisticsType statistics) {
        this.statistics = statistics;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BlastOutput_mbstatType)) return false;
        BlastOutput_mbstatType other = (BlastOutput_mbstatType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statistics==null && other.getStatistics()==null) || 
             (this.statistics!=null &&
              this.statistics.equals(other.getStatistics())));
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
        if (getStatistics() != null) {
            _hashCode += getStatistics().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BlastOutput_mbstatType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_mbstatType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistics");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Statistics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "StatisticsType"));
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
