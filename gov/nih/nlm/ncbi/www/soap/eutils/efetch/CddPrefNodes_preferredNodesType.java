/**
 * CddPrefNodes_preferredNodesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddPrefNodes_preferredNodesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRefSetType cddOrgRefSet;

    public CddPrefNodes_preferredNodesType() {
    }

    public CddPrefNodes_preferredNodesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRefSetType cddOrgRefSet) {
           this.cddOrgRefSet = cddOrgRefSet;
    }


    /**
     * Gets the cddOrgRefSet value for this CddPrefNodes_preferredNodesType.
     * 
     * @return cddOrgRefSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRefSetType getCddOrgRefSet() {
        return cddOrgRefSet;
    }


    /**
     * Sets the cddOrgRefSet value for this CddPrefNodes_preferredNodesType.
     * 
     * @param cddOrgRefSet
     */
    public void setCddOrgRefSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddOrgRefSetType cddOrgRefSet) {
        this.cddOrgRefSet = cddOrgRefSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddPrefNodes_preferredNodesType)) return false;
        CddPrefNodes_preferredNodesType other = (CddPrefNodes_preferredNodesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddOrgRefSet==null && other.getCddOrgRefSet()==null) || 
             (this.cddOrgRefSet!=null &&
              this.cddOrgRefSet.equals(other.getCddOrgRefSet())));
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
        if (getCddOrgRefSet() != null) {
            _hashCode += getCddOrgRefSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddPrefNodes_preferredNodesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-nodes_preferred-nodesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddOrgRefSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-org-ref-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-org-ref-setType"));
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
