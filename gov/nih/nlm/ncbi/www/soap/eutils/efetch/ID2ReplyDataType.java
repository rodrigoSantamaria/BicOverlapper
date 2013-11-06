/**
 * ID2ReplyDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2ReplyDataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataTypeType ID2ReplyData_dataType;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataFormatType ID2ReplyData_dataFormat;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataCompressionType ID2ReplyData_dataCompression;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataType ID2ReplyData_data;

    public ID2ReplyDataType() {
    }

    public ID2ReplyDataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataTypeType ID2ReplyData_dataType,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataFormatType ID2ReplyData_dataFormat,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataCompressionType ID2ReplyData_dataCompression,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataType ID2ReplyData_data) {
           this.ID2ReplyData_dataType = ID2ReplyData_dataType;
           this.ID2ReplyData_dataFormat = ID2ReplyData_dataFormat;
           this.ID2ReplyData_dataCompression = ID2ReplyData_dataCompression;
           this.ID2ReplyData_data = ID2ReplyData_data;
    }


    /**
     * Gets the ID2ReplyData_dataType value for this ID2ReplyDataType.
     * 
     * @return ID2ReplyData_dataType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataTypeType getID2ReplyData_dataType() {
        return ID2ReplyData_dataType;
    }


    /**
     * Sets the ID2ReplyData_dataType value for this ID2ReplyDataType.
     * 
     * @param ID2ReplyData_dataType
     */
    public void setID2ReplyData_dataType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataTypeType ID2ReplyData_dataType) {
        this.ID2ReplyData_dataType = ID2ReplyData_dataType;
    }


    /**
     * Gets the ID2ReplyData_dataFormat value for this ID2ReplyDataType.
     * 
     * @return ID2ReplyData_dataFormat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataFormatType getID2ReplyData_dataFormat() {
        return ID2ReplyData_dataFormat;
    }


    /**
     * Sets the ID2ReplyData_dataFormat value for this ID2ReplyDataType.
     * 
     * @param ID2ReplyData_dataFormat
     */
    public void setID2ReplyData_dataFormat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataFormatType ID2ReplyData_dataFormat) {
        this.ID2ReplyData_dataFormat = ID2ReplyData_dataFormat;
    }


    /**
     * Gets the ID2ReplyData_dataCompression value for this ID2ReplyDataType.
     * 
     * @return ID2ReplyData_dataCompression
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataCompressionType getID2ReplyData_dataCompression() {
        return ID2ReplyData_dataCompression;
    }


    /**
     * Sets the ID2ReplyData_dataCompression value for this ID2ReplyDataType.
     * 
     * @param ID2ReplyData_dataCompression
     */
    public void setID2ReplyData_dataCompression(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataCompressionType ID2ReplyData_dataCompression) {
        this.ID2ReplyData_dataCompression = ID2ReplyData_dataCompression;
    }


    /**
     * Gets the ID2ReplyData_data value for this ID2ReplyDataType.
     * 
     * @return ID2ReplyData_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataType getID2ReplyData_data() {
        return ID2ReplyData_data;
    }


    /**
     * Sets the ID2ReplyData_data value for this ID2ReplyDataType.
     * 
     * @param ID2ReplyData_data
     */
    public void setID2ReplyData_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyData_dataType ID2ReplyData_data) {
        this.ID2ReplyData_data = ID2ReplyData_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2ReplyDataType)) return false;
        ID2ReplyDataType other = (ID2ReplyDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyData_dataType==null && other.getID2ReplyData_dataType()==null) || 
             (this.ID2ReplyData_dataType!=null &&
              this.ID2ReplyData_dataType.equals(other.getID2ReplyData_dataType()))) &&
            ((this.ID2ReplyData_dataFormat==null && other.getID2ReplyData_dataFormat()==null) || 
             (this.ID2ReplyData_dataFormat!=null &&
              this.ID2ReplyData_dataFormat.equals(other.getID2ReplyData_dataFormat()))) &&
            ((this.ID2ReplyData_dataCompression==null && other.getID2ReplyData_dataCompression()==null) || 
             (this.ID2ReplyData_dataCompression!=null &&
              this.ID2ReplyData_dataCompression.equals(other.getID2ReplyData_dataCompression()))) &&
            ((this.ID2ReplyData_data==null && other.getID2ReplyData_data()==null) || 
             (this.ID2ReplyData_data!=null &&
              this.ID2ReplyData_data.equals(other.getID2ReplyData_data())));
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
        if (getID2ReplyData_dataType() != null) {
            _hashCode += getID2ReplyData_dataType().hashCode();
        }
        if (getID2ReplyData_dataFormat() != null) {
            _hashCode += getID2ReplyData_dataFormat().hashCode();
        }
        if (getID2ReplyData_dataCompression() != null) {
            _hashCode += getID2ReplyData_dataCompression().hashCode();
        }
        if (getID2ReplyData_data() != null) {
            _hashCode += getID2ReplyData_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2ReplyDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-DataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyData_dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Data_data-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Data_data-typeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyData_dataFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Data_data-format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Data_data-formatType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyData_dataCompression");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Data_data-compression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Data_data-compressionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyData_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Data_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Data_dataType"));
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
