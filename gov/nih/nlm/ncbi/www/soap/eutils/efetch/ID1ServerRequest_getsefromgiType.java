/**
 * ID1ServerRequest_getsefromgiType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID1ServerRequest_getsefromgiType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerMaxcomplexType ID1ServerMaxcomplex;

    public ID1ServerRequest_getsefromgiType() {
    }

    public ID1ServerRequest_getsefromgiType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerMaxcomplexType ID1ServerMaxcomplex) {
           this.ID1ServerMaxcomplex = ID1ServerMaxcomplex;
    }


    /**
     * Gets the ID1ServerMaxcomplex value for this ID1ServerRequest_getsefromgiType.
     * 
     * @return ID1ServerMaxcomplex
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerMaxcomplexType getID1ServerMaxcomplex() {
        return ID1ServerMaxcomplex;
    }


    /**
     * Sets the ID1ServerMaxcomplex value for this ID1ServerRequest_getsefromgiType.
     * 
     * @param ID1ServerMaxcomplex
     */
    public void setID1ServerMaxcomplex(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerMaxcomplexType ID1ServerMaxcomplex) {
        this.ID1ServerMaxcomplex = ID1ServerMaxcomplex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID1ServerRequest_getsefromgiType)) return false;
        ID1ServerRequest_getsefromgiType other = (ID1ServerRequest_getsefromgiType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID1ServerMaxcomplex==null && other.getID1ServerMaxcomplex()==null) || 
             (this.ID1ServerMaxcomplex!=null &&
              this.ID1ServerMaxcomplex.equals(other.getID1ServerMaxcomplex())));
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
        if (getID1ServerMaxcomplex() != null) {
            _hashCode += getID1ServerMaxcomplex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID1ServerRequest_getsefromgiType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-request_getsefromgiType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID1ServerMaxcomplex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-maxcomplex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-maxcomplexType"));
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
