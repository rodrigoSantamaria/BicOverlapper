/**
 * LinkSet_weightsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class LinkSet_weightsType  implements java.io.Serializable {
    private java.lang.String[] linkSet_weights_E;

    public LinkSet_weightsType() {
    }

    public LinkSet_weightsType(
           java.lang.String[] linkSet_weights_E) {
           this.linkSet_weights_E = linkSet_weights_E;
    }


    /**
     * Gets the linkSet_weights_E value for this LinkSet_weightsType.
     * 
     * @return linkSet_weights_E
     */
    public java.lang.String[] getLinkSet_weights_E() {
        return linkSet_weights_E;
    }


    /**
     * Sets the linkSet_weights_E value for this LinkSet_weightsType.
     * 
     * @param linkSet_weights_E
     */
    public void setLinkSet_weights_E(java.lang.String[] linkSet_weights_E) {
        this.linkSet_weights_E = linkSet_weights_E;
    }

    public java.lang.String getLinkSet_weights_E(int i) {
        return this.linkSet_weights_E[i];
    }

    public void setLinkSet_weights_E(int i, java.lang.String _value) {
        this.linkSet_weights_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkSet_weightsType)) return false;
        LinkSet_weightsType other = (LinkSet_weightsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.linkSet_weights_E==null && other.getLinkSet_weights_E()==null) || 
             (this.linkSet_weights_E!=null &&
              java.util.Arrays.equals(this.linkSet_weights_E, other.getLinkSet_weights_E())));
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
        if (getLinkSet_weights_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkSet_weights_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkSet_weights_E(), i);
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
        new org.apache.axis.description.TypeDesc(LinkSet_weightsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Link-set_weightsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkSet_weights_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Link-set_weights_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Link-set_weights_E"));
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
