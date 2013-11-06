/**
 * RMReply_mapsFromBuildsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RMReply_mapsFromBuildsType  implements java.io.Serializable {
    private java.lang.String[] RMReply_mapsFromBuilds_E;

    public RMReply_mapsFromBuildsType() {
    }

    public RMReply_mapsFromBuildsType(
           java.lang.String[] RMReply_mapsFromBuilds_E) {
           this.RMReply_mapsFromBuilds_E = RMReply_mapsFromBuilds_E;
    }


    /**
     * Gets the RMReply_mapsFromBuilds_E value for this RMReply_mapsFromBuildsType.
     * 
     * @return RMReply_mapsFromBuilds_E
     */
    public java.lang.String[] getRMReply_mapsFromBuilds_E() {
        return RMReply_mapsFromBuilds_E;
    }


    /**
     * Sets the RMReply_mapsFromBuilds_E value for this RMReply_mapsFromBuildsType.
     * 
     * @param RMReply_mapsFromBuilds_E
     */
    public void setRMReply_mapsFromBuilds_E(java.lang.String[] RMReply_mapsFromBuilds_E) {
        this.RMReply_mapsFromBuilds_E = RMReply_mapsFromBuilds_E;
    }

    public java.lang.String getRMReply_mapsFromBuilds_E(int i) {
        return this.RMReply_mapsFromBuilds_E[i];
    }

    public void setRMReply_mapsFromBuilds_E(int i, java.lang.String _value) {
        this.RMReply_mapsFromBuilds_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RMReply_mapsFromBuildsType)) return false;
        RMReply_mapsFromBuildsType other = (RMReply_mapsFromBuildsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RMReply_mapsFromBuilds_E==null && other.getRMReply_mapsFromBuilds_E()==null) || 
             (this.RMReply_mapsFromBuilds_E!=null &&
              java.util.Arrays.equals(this.RMReply_mapsFromBuilds_E, other.getRMReply_mapsFromBuilds_E())));
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
        if (getRMReply_mapsFromBuilds_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRMReply_mapsFromBuilds_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRMReply_mapsFromBuilds_E(), i);
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
        new org.apache.axis.description.TypeDesc(RMReply_mapsFromBuildsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMReply_maps-from-buildsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMReply_mapsFromBuilds_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMReply_maps-from-builds_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RMReply_maps-from-builds_E"));
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
