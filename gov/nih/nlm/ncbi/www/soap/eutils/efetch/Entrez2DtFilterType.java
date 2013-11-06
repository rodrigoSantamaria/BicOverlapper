/**
 * Entrez2DtFilterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2DtFilterType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilter_beginDateType entrez2DtFilter_beginDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilter_endDateType entrez2DtFilter_endDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilter_typeDateType entrez2DtFilter_typeDate;

    public Entrez2DtFilterType() {
    }

    public Entrez2DtFilterType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilter_beginDateType entrez2DtFilter_beginDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilter_endDateType entrez2DtFilter_endDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilter_typeDateType entrez2DtFilter_typeDate) {
           this.entrez2DtFilter_beginDate = entrez2DtFilter_beginDate;
           this.entrez2DtFilter_endDate = entrez2DtFilter_endDate;
           this.entrez2DtFilter_typeDate = entrez2DtFilter_typeDate;
    }


    /**
     * Gets the entrez2DtFilter_beginDate value for this Entrez2DtFilterType.
     * 
     * @return entrez2DtFilter_beginDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilter_beginDateType getEntrez2DtFilter_beginDate() {
        return entrez2DtFilter_beginDate;
    }


    /**
     * Sets the entrez2DtFilter_beginDate value for this Entrez2DtFilterType.
     * 
     * @param entrez2DtFilter_beginDate
     */
    public void setEntrez2DtFilter_beginDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilter_beginDateType entrez2DtFilter_beginDate) {
        this.entrez2DtFilter_beginDate = entrez2DtFilter_beginDate;
    }


    /**
     * Gets the entrez2DtFilter_endDate value for this Entrez2DtFilterType.
     * 
     * @return entrez2DtFilter_endDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilter_endDateType getEntrez2DtFilter_endDate() {
        return entrez2DtFilter_endDate;
    }


    /**
     * Sets the entrez2DtFilter_endDate value for this Entrez2DtFilterType.
     * 
     * @param entrez2DtFilter_endDate
     */
    public void setEntrez2DtFilter_endDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilter_endDateType entrez2DtFilter_endDate) {
        this.entrez2DtFilter_endDate = entrez2DtFilter_endDate;
    }


    /**
     * Gets the entrez2DtFilter_typeDate value for this Entrez2DtFilterType.
     * 
     * @return entrez2DtFilter_typeDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilter_typeDateType getEntrez2DtFilter_typeDate() {
        return entrez2DtFilter_typeDate;
    }


    /**
     * Sets the entrez2DtFilter_typeDate value for this Entrez2DtFilterType.
     * 
     * @param entrez2DtFilter_typeDate
     */
    public void setEntrez2DtFilter_typeDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DtFilter_typeDateType entrez2DtFilter_typeDate) {
        this.entrez2DtFilter_typeDate = entrez2DtFilter_typeDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2DtFilterType)) return false;
        Entrez2DtFilterType other = (Entrez2DtFilterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2DtFilter_beginDate==null && other.getEntrez2DtFilter_beginDate()==null) || 
             (this.entrez2DtFilter_beginDate!=null &&
              this.entrez2DtFilter_beginDate.equals(other.getEntrez2DtFilter_beginDate()))) &&
            ((this.entrez2DtFilter_endDate==null && other.getEntrez2DtFilter_endDate()==null) || 
             (this.entrez2DtFilter_endDate!=null &&
              this.entrez2DtFilter_endDate.equals(other.getEntrez2DtFilter_endDate()))) &&
            ((this.entrez2DtFilter_typeDate==null && other.getEntrez2DtFilter_typeDate()==null) || 
             (this.entrez2DtFilter_typeDate!=null &&
              this.entrez2DtFilter_typeDate.equals(other.getEntrez2DtFilter_typeDate())));
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
        if (getEntrez2DtFilter_beginDate() != null) {
            _hashCode += getEntrez2DtFilter_beginDate().hashCode();
        }
        if (getEntrez2DtFilter_endDate() != null) {
            _hashCode += getEntrez2DtFilter_endDate().hashCode();
        }
        if (getEntrez2DtFilter_typeDate() != null) {
            _hashCode += getEntrez2DtFilter_typeDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2DtFilterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-dt-filterType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DtFilter_beginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-dt-filter_begin-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-dt-filter_begin-dateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DtFilter_endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-dt-filter_end-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-dt-filter_end-dateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DtFilter_typeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-dt-filter_type-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-dt-filter_type-dateType"));
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
