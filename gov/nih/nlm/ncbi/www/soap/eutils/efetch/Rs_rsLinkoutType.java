/**
 * Rs_rsLinkoutType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Rs_rsLinkoutType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsLinkoutType[] rsLinkout;

    public Rs_rsLinkoutType() {
    }

    public Rs_rsLinkoutType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsLinkoutType[] rsLinkout) {
           this.rsLinkout = rsLinkout;
    }


    /**
     * Gets the rsLinkout value for this Rs_rsLinkoutType.
     * 
     * @return rsLinkout
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsLinkoutType[] getRsLinkout() {
        return rsLinkout;
    }


    /**
     * Sets the rsLinkout value for this Rs_rsLinkoutType.
     * 
     * @param rsLinkout
     */
    public void setRsLinkout(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsLinkoutType[] rsLinkout) {
        this.rsLinkout = rsLinkout;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsLinkoutType getRsLinkout(int i) {
        return this.rsLinkout[i];
    }

    public void setRsLinkout(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsLinkoutType _value) {
        this.rsLinkout[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rs_rsLinkoutType)) return false;
        Rs_rsLinkoutType other = (Rs_rsLinkoutType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rsLinkout==null && other.getRsLinkout()==null) || 
             (this.rsLinkout!=null &&
              java.util.Arrays.equals(this.rsLinkout, other.getRsLinkout())));
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
        if (getRsLinkout() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsLinkout());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsLinkout(), i);
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
        new org.apache.axis.description.TypeDesc(Rs_rsLinkoutType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_rsLinkoutType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsLinkout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsLinkout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsLinkoutType"));
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
