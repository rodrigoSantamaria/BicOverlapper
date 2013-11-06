/**
 * ResidueGraph_chiralCentersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResidueGraph_chiralCentersType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenterType[] chiralCenter;

    public ResidueGraph_chiralCentersType() {
    }

    public ResidueGraph_chiralCentersType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenterType[] chiralCenter) {
           this.chiralCenter = chiralCenter;
    }


    /**
     * Gets the chiralCenter value for this ResidueGraph_chiralCentersType.
     * 
     * @return chiralCenter
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenterType[] getChiralCenter() {
        return chiralCenter;
    }


    /**
     * Sets the chiralCenter value for this ResidueGraph_chiralCentersType.
     * 
     * @param chiralCenter
     */
    public void setChiralCenter(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenterType[] chiralCenter) {
        this.chiralCenter = chiralCenter;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenterType getChiralCenter(int i) {
        return this.chiralCenter[i];
    }

    public void setChiralCenter(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenterType _value) {
        this.chiralCenter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResidueGraph_chiralCentersType)) return false;
        ResidueGraph_chiralCentersType other = (ResidueGraph_chiralCentersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiralCenter==null && other.getChiralCenter()==null) || 
             (this.chiralCenter!=null &&
              java.util.Arrays.equals(this.chiralCenter, other.getChiralCenter())));
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
        if (getChiralCenter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChiralCenter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChiralCenter(), i);
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
        new org.apache.axis.description.TypeDesc(ResidueGraph_chiralCentersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph_chiral-centersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiralCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chiral-center"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chiral-centerType"));
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
