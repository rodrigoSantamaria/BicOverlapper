/**
 * ID2SSequencePieceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSequencePieceType  implements java.io.Serializable {
    private java.lang.String ID2SSequencePiece_start;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSequencePiece_dataType ID2SSequencePiece_data;

    public ID2SSequencePieceType() {
    }

    public ID2SSequencePieceType(
           java.lang.String ID2SSequencePiece_start,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSequencePiece_dataType ID2SSequencePiece_data) {
           this.ID2SSequencePiece_start = ID2SSequencePiece_start;
           this.ID2SSequencePiece_data = ID2SSequencePiece_data;
    }


    /**
     * Gets the ID2SSequencePiece_start value for this ID2SSequencePieceType.
     * 
     * @return ID2SSequencePiece_start
     */
    public java.lang.String getID2SSequencePiece_start() {
        return ID2SSequencePiece_start;
    }


    /**
     * Sets the ID2SSequencePiece_start value for this ID2SSequencePieceType.
     * 
     * @param ID2SSequencePiece_start
     */
    public void setID2SSequencePiece_start(java.lang.String ID2SSequencePiece_start) {
        this.ID2SSequencePiece_start = ID2SSequencePiece_start;
    }


    /**
     * Gets the ID2SSequencePiece_data value for this ID2SSequencePieceType.
     * 
     * @return ID2SSequencePiece_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSequencePiece_dataType getID2SSequencePiece_data() {
        return ID2SSequencePiece_data;
    }


    /**
     * Sets the ID2SSequencePiece_data value for this ID2SSequencePieceType.
     * 
     * @param ID2SSequencePiece_data
     */
    public void setID2SSequencePiece_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSequencePiece_dataType ID2SSequencePiece_data) {
        this.ID2SSequencePiece_data = ID2SSequencePiece_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSequencePieceType)) return false;
        ID2SSequencePieceType other = (ID2SSequencePieceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSequencePiece_start==null && other.getID2SSequencePiece_start()==null) || 
             (this.ID2SSequencePiece_start!=null &&
              this.ID2SSequencePiece_start.equals(other.getID2SSequencePiece_start()))) &&
            ((this.ID2SSequencePiece_data==null && other.getID2SSequencePiece_data()==null) || 
             (this.ID2SSequencePiece_data!=null &&
              this.ID2SSequencePiece_data.equals(other.getID2SSequencePiece_data())));
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
        if (getID2SSequencePiece_start() != null) {
            _hashCode += getID2SSequencePiece_start().hashCode();
        }
        if (getID2SSequencePiece_data() != null) {
            _hashCode += getID2SSequencePiece_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSequencePieceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Sequence-PieceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSequencePiece_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Sequence-Piece_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSequencePiece_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Sequence-Piece_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Sequence-Piece_dataType"));
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
