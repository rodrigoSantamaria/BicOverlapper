/**
 * Entrez2InfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2InfoType  implements java.io.Serializable {
    private java.lang.String entrez2Info_dbCount;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Info_buildDateType entrez2Info_buildDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Info_dbInfoType entrez2Info_dbInfo;

    public Entrez2InfoType() {
    }

    public Entrez2InfoType(
           java.lang.String entrez2Info_dbCount,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Info_buildDateType entrez2Info_buildDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Info_dbInfoType entrez2Info_dbInfo) {
           this.entrez2Info_dbCount = entrez2Info_dbCount;
           this.entrez2Info_buildDate = entrez2Info_buildDate;
           this.entrez2Info_dbInfo = entrez2Info_dbInfo;
    }


    /**
     * Gets the entrez2Info_dbCount value for this Entrez2InfoType.
     * 
     * @return entrez2Info_dbCount
     */
    public java.lang.String getEntrez2Info_dbCount() {
        return entrez2Info_dbCount;
    }


    /**
     * Sets the entrez2Info_dbCount value for this Entrez2InfoType.
     * 
     * @param entrez2Info_dbCount
     */
    public void setEntrez2Info_dbCount(java.lang.String entrez2Info_dbCount) {
        this.entrez2Info_dbCount = entrez2Info_dbCount;
    }


    /**
     * Gets the entrez2Info_buildDate value for this Entrez2InfoType.
     * 
     * @return entrez2Info_buildDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Info_buildDateType getEntrez2Info_buildDate() {
        return entrez2Info_buildDate;
    }


    /**
     * Sets the entrez2Info_buildDate value for this Entrez2InfoType.
     * 
     * @param entrez2Info_buildDate
     */
    public void setEntrez2Info_buildDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Info_buildDateType entrez2Info_buildDate) {
        this.entrez2Info_buildDate = entrez2Info_buildDate;
    }


    /**
     * Gets the entrez2Info_dbInfo value for this Entrez2InfoType.
     * 
     * @return entrez2Info_dbInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Info_dbInfoType getEntrez2Info_dbInfo() {
        return entrez2Info_dbInfo;
    }


    /**
     * Sets the entrez2Info_dbInfo value for this Entrez2InfoType.
     * 
     * @param entrez2Info_dbInfo
     */
    public void setEntrez2Info_dbInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Info_dbInfoType entrez2Info_dbInfo) {
        this.entrez2Info_dbInfo = entrez2Info_dbInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2InfoType)) return false;
        Entrez2InfoType other = (Entrez2InfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2Info_dbCount==null && other.getEntrez2Info_dbCount()==null) || 
             (this.entrez2Info_dbCount!=null &&
              this.entrez2Info_dbCount.equals(other.getEntrez2Info_dbCount()))) &&
            ((this.entrez2Info_buildDate==null && other.getEntrez2Info_buildDate()==null) || 
             (this.entrez2Info_buildDate!=null &&
              this.entrez2Info_buildDate.equals(other.getEntrez2Info_buildDate()))) &&
            ((this.entrez2Info_dbInfo==null && other.getEntrez2Info_dbInfo()==null) || 
             (this.entrez2Info_dbInfo!=null &&
              this.entrez2Info_dbInfo.equals(other.getEntrez2Info_dbInfo())));
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
        if (getEntrez2Info_dbCount() != null) {
            _hashCode += getEntrez2Info_dbCount().hashCode();
        }
        if (getEntrez2Info_buildDate() != null) {
            _hashCode += getEntrez2Info_buildDate().hashCode();
        }
        if (getEntrez2Info_dbInfo() != null) {
            _hashCode += getEntrez2Info_dbInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2InfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Info_dbCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-info_db-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Info_buildDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-info_build-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-info_build-dateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Info_dbInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-info_db-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-info_db-infoType"));
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
