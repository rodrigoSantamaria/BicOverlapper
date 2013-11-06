/**
 * ChemGraphAlignment_aligndataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ChemGraphAlignment_aligndataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignStatsType[] alignStats;

    public ChemGraphAlignment_aligndataType() {
    }

    public ChemGraphAlignment_aligndataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignStatsType[] alignStats) {
           this.alignStats = alignStats;
    }


    /**
     * Gets the alignStats value for this ChemGraphAlignment_aligndataType.
     * 
     * @return alignStats
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignStatsType[] getAlignStats() {
        return alignStats;
    }


    /**
     * Sets the alignStats value for this ChemGraphAlignment_aligndataType.
     * 
     * @param alignStats
     */
    public void setAlignStats(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignStatsType[] alignStats) {
        this.alignStats = alignStats;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignStatsType getAlignStats(int i) {
        return this.alignStats[i];
    }

    public void setAlignStats(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignStatsType _value) {
        this.alignStats[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChemGraphAlignment_aligndataType)) return false;
        ChemGraphAlignment_aligndataType other = (ChemGraphAlignment_aligndataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alignStats==null && other.getAlignStats()==null) || 
             (this.alignStats!=null &&
              java.util.Arrays.equals(this.alignStats, other.getAlignStats())));
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
        if (getAlignStats() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlignStats());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlignStats(), i);
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
        new org.apache.axis.description.TypeDesc(ChemGraphAlignment_aligndataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_aligndataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignStats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-statsType"));
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
