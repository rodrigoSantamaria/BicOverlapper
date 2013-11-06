/**
 * Entrez2Limits_filterDateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2Limits_filterDateType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilterType entrez2DtFilter;

    public Entrez2Limits_filterDateType() {
    }

    public Entrez2Limits_filterDateType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilterType entrez2DtFilter) {
           this.entrez2DtFilter = entrez2DtFilter;
    }


    /**
     * Gets the entrez2DtFilter value for this Entrez2Limits_filterDateType.
     * 
     * @return entrez2DtFilter
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilterType getEntrez2DtFilter() {
        return entrez2DtFilter;
    }


    /**
     * Sets the entrez2DtFilter value for this Entrez2Limits_filterDateType.
     * 
     * @param entrez2DtFilter
     */
    public void setEntrez2DtFilter(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilterType entrez2DtFilter) {
        this.entrez2DtFilter = entrez2DtFilter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2Limits_filterDateType)) return false;
        Entrez2Limits_filterDateType other = (Entrez2Limits_filterDateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2DtFilter==null && other.getEntrez2DtFilter()==null) || 
             (this.entrez2DtFilter!=null &&
              this.entrez2DtFilter.equals(other.getEntrez2DtFilter())));
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
        if (getEntrez2DtFilter() != null) {
            _hashCode += getEntrez2DtFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2Limits_filterDateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-limits_filter-dateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DtFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-dt-filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-dt-filterType"));
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
