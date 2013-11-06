/**
 * IdLinkSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.elink;

public class IdLinkSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType[] linkInfo;

    public IdLinkSetType() {
    }

    public IdLinkSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType[] linkInfo) {
           this.linkInfo = linkInfo;
    }


    /**
     * Gets the linkInfo value for this IdLinkSetType.
     * 
     * @return linkInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType[] getLinkInfo() {
        return linkInfo;
    }


    /**
     * Sets the linkInfo value for this IdLinkSetType.
     * 
     * @param linkInfo
     */
    public void setLinkInfo(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType[] linkInfo) {
        this.linkInfo = linkInfo;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType getLinkInfo(int i) {
        return this.linkInfo[i];
    }

    public void setLinkInfo(int i, gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkInfoType _value) {
        this.linkInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdLinkSetType)) return false;
        IdLinkSetType other = (IdLinkSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.linkInfo==null && other.getLinkInfo()==null) || 
             (this.linkInfo!=null &&
              java.util.Arrays.equals(this.linkInfo, other.getLinkInfo())));
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
        if (getLinkInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkInfo(), i);
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
        new org.apache.axis.description.TypeDesc(IdLinkSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "IdLinkSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "LinkInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "LinkInfoType"));
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
