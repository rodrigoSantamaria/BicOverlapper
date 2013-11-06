/**
 * ID2RequestPacket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestPacket  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestType[] ID2Request;

    public ID2RequestPacket() {
    }

    public ID2RequestPacket(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestType[] ID2Request) {
           this.ID2Request = ID2Request;
    }


    /**
     * Gets the ID2Request value for this ID2RequestPacket.
     * 
     * @return ID2Request
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestType[] getID2Request() {
        return ID2Request;
    }


    /**
     * Sets the ID2Request value for this ID2RequestPacket.
     * 
     * @param ID2Request
     */
    public void setID2Request(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestType[] ID2Request) {
        this.ID2Request = ID2Request;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestType getID2Request(int i) {
        return this.ID2Request[i];
    }

    public void setID2Request(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestType _value) {
        this.ID2Request[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2RequestPacket)) return false;
        ID2RequestPacket other = (ID2RequestPacket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2Request==null && other.getID2Request()==null) || 
             (this.ID2Request!=null &&
              java.util.Arrays.equals(this.ID2Request, other.getID2Request())));
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
        if (getID2Request() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2Request());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2Request(), i);
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
        new org.apache.axis.description.TypeDesc(ID2RequestPacket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2-Request-Packet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-RequestType"));
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
