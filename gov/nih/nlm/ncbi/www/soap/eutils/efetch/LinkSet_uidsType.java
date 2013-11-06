/**
 * LinkSet_uidsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class LinkSet_uidsType  implements java.io.Serializable {
    private java.lang.String[] linkSet_uids_E;

    public LinkSet_uidsType() {
    }

    public LinkSet_uidsType(
           java.lang.String[] linkSet_uids_E) {
           this.linkSet_uids_E = linkSet_uids_E;
    }


    /**
     * Gets the linkSet_uids_E value for this LinkSet_uidsType.
     * 
     * @return linkSet_uids_E
     */
    public java.lang.String[] getLinkSet_uids_E() {
        return linkSet_uids_E;
    }


    /**
     * Sets the linkSet_uids_E value for this LinkSet_uidsType.
     * 
     * @param linkSet_uids_E
     */
    public void setLinkSet_uids_E(java.lang.String[] linkSet_uids_E) {
        this.linkSet_uids_E = linkSet_uids_E;
    }

    public java.lang.String getLinkSet_uids_E(int i) {
        return this.linkSet_uids_E[i];
    }

    public void setLinkSet_uids_E(int i, java.lang.String _value) {
        this.linkSet_uids_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkSet_uidsType)) return false;
        LinkSet_uidsType other = (LinkSet_uidsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.linkSet_uids_E==null && other.getLinkSet_uids_E()==null) || 
             (this.linkSet_uids_E!=null &&
              java.util.Arrays.equals(this.linkSet_uids_E, other.getLinkSet_uids_E())));
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
        if (getLinkSet_uids_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkSet_uids_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkSet_uids_E(), i);
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
        new org.apache.axis.description.TypeDesc(LinkSet_uidsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Link-set_uidsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkSet_uids_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Link-set_uids_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Link-set_uids_E"));
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
