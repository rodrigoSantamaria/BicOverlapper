/**
 * ID2SChunk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SChunk  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunk_dataType ID2SChunk_data;

    public ID2SChunk() {
    }

    public ID2SChunk(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunk_dataType ID2SChunk_data) {
           this.ID2SChunk_data = ID2SChunk_data;
    }


    /**
     * Gets the ID2SChunk_data value for this ID2SChunk.
     * 
     * @return ID2SChunk_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunk_dataType getID2SChunk_data() {
        return ID2SChunk_data;
    }


    /**
     * Sets the ID2SChunk_data value for this ID2SChunk.
     * 
     * @param ID2SChunk_data
     */
    public void setID2SChunk_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunk_dataType ID2SChunk_data) {
        this.ID2SChunk_data = ID2SChunk_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SChunk)) return false;
        ID2SChunk other = (ID2SChunk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SChunk_data==null && other.getID2SChunk_data()==null) || 
             (this.ID2SChunk_data!=null &&
              this.ID2SChunk_data.equals(other.getID2SChunk_data())));
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
        if (getID2SChunk_data() != null) {
            _hashCode += getID2SChunk_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SChunk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2S-Chunk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SChunk_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk_dataType"));
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
