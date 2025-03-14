/**
 * ID2SSeqMapInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqMapInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLocType ID2SSeqLoc;

    public ID2SSeqMapInfoType() {
    }

    public ID2SSeqMapInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLocType ID2SSeqLoc) {
           this.ID2SSeqLoc = ID2SSeqLoc;
    }


    /**
     * Gets the ID2SSeqLoc value for this ID2SSeqMapInfoType.
     * 
     * @return ID2SSeqLoc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLocType getID2SSeqLoc() {
        return ID2SSeqLoc;
    }


    /**
     * Sets the ID2SSeqLoc value for this ID2SSeqMapInfoType.
     * 
     * @param ID2SSeqLoc
     */
    public void setID2SSeqLoc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqLocType ID2SSeqLoc) {
        this.ID2SSeqLoc = ID2SSeqLoc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqMapInfoType)) return false;
        ID2SSeqMapInfoType other = (ID2SSeqMapInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqLoc==null && other.getID2SSeqLoc()==null) || 
             (this.ID2SSeqLoc!=null &&
              this.ID2SSeqLoc.equals(other.getID2SSeqLoc())));
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
        if (getID2SSeqLoc() != null) {
            _hashCode += getID2SSeqLoc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSeqMapInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-map-InfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqLoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-locType"));
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
