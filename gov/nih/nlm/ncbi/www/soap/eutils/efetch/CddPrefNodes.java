/**
 * CddPrefNodes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddPrefNodes  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_preferredNodesType cddPrefNodes_preferredNodes;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_modelOrganismsType cddPrefNodes_modelOrganisms;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_optionalNodesType cddPrefNodes_optionalNodes;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_descriptionType cddPrefNodes_description;

    public CddPrefNodes() {
    }

    public CddPrefNodes(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_preferredNodesType cddPrefNodes_preferredNodes,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_modelOrganismsType cddPrefNodes_modelOrganisms,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_optionalNodesType cddPrefNodes_optionalNodes,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_descriptionType cddPrefNodes_description) {
           this.cddPrefNodes_preferredNodes = cddPrefNodes_preferredNodes;
           this.cddPrefNodes_modelOrganisms = cddPrefNodes_modelOrganisms;
           this.cddPrefNodes_optionalNodes = cddPrefNodes_optionalNodes;
           this.cddPrefNodes_description = cddPrefNodes_description;
    }


    /**
     * Gets the cddPrefNodes_preferredNodes value for this CddPrefNodes.
     * 
     * @return cddPrefNodes_preferredNodes
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_preferredNodesType getCddPrefNodes_preferredNodes() {
        return cddPrefNodes_preferredNodes;
    }


    /**
     * Sets the cddPrefNodes_preferredNodes value for this CddPrefNodes.
     * 
     * @param cddPrefNodes_preferredNodes
     */
    public void setCddPrefNodes_preferredNodes(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_preferredNodesType cddPrefNodes_preferredNodes) {
        this.cddPrefNodes_preferredNodes = cddPrefNodes_preferredNodes;
    }


    /**
     * Gets the cddPrefNodes_modelOrganisms value for this CddPrefNodes.
     * 
     * @return cddPrefNodes_modelOrganisms
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_modelOrganismsType getCddPrefNodes_modelOrganisms() {
        return cddPrefNodes_modelOrganisms;
    }


    /**
     * Sets the cddPrefNodes_modelOrganisms value for this CddPrefNodes.
     * 
     * @param cddPrefNodes_modelOrganisms
     */
    public void setCddPrefNodes_modelOrganisms(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_modelOrganismsType cddPrefNodes_modelOrganisms) {
        this.cddPrefNodes_modelOrganisms = cddPrefNodes_modelOrganisms;
    }


    /**
     * Gets the cddPrefNodes_optionalNodes value for this CddPrefNodes.
     * 
     * @return cddPrefNodes_optionalNodes
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_optionalNodesType getCddPrefNodes_optionalNodes() {
        return cddPrefNodes_optionalNodes;
    }


    /**
     * Sets the cddPrefNodes_optionalNodes value for this CddPrefNodes.
     * 
     * @param cddPrefNodes_optionalNodes
     */
    public void setCddPrefNodes_optionalNodes(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_optionalNodesType cddPrefNodes_optionalNodes) {
        this.cddPrefNodes_optionalNodes = cddPrefNodes_optionalNodes;
    }


    /**
     * Gets the cddPrefNodes_description value for this CddPrefNodes.
     * 
     * @return cddPrefNodes_description
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_descriptionType getCddPrefNodes_description() {
        return cddPrefNodes_description;
    }


    /**
     * Sets the cddPrefNodes_description value for this CddPrefNodes.
     * 
     * @param cddPrefNodes_description
     */
    public void setCddPrefNodes_description(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodes_descriptionType cddPrefNodes_description) {
        this.cddPrefNodes_description = cddPrefNodes_description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddPrefNodes)) return false;
        CddPrefNodes other = (CddPrefNodes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddPrefNodes_preferredNodes==null && other.getCddPrefNodes_preferredNodes()==null) || 
             (this.cddPrefNodes_preferredNodes!=null &&
              this.cddPrefNodes_preferredNodes.equals(other.getCddPrefNodes_preferredNodes()))) &&
            ((this.cddPrefNodes_modelOrganisms==null && other.getCddPrefNodes_modelOrganisms()==null) || 
             (this.cddPrefNodes_modelOrganisms!=null &&
              this.cddPrefNodes_modelOrganisms.equals(other.getCddPrefNodes_modelOrganisms()))) &&
            ((this.cddPrefNodes_optionalNodes==null && other.getCddPrefNodes_optionalNodes()==null) || 
             (this.cddPrefNodes_optionalNodes!=null &&
              this.cddPrefNodes_optionalNodes.equals(other.getCddPrefNodes_optionalNodes()))) &&
            ((this.cddPrefNodes_description==null && other.getCddPrefNodes_description()==null) || 
             (this.cddPrefNodes_description!=null &&
              this.cddPrefNodes_description.equals(other.getCddPrefNodes_description())));
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
        if (getCddPrefNodes_preferredNodes() != null) {
            _hashCode += getCddPrefNodes_preferredNodes().hashCode();
        }
        if (getCddPrefNodes_modelOrganisms() != null) {
            _hashCode += getCddPrefNodes_modelOrganisms().hashCode();
        }
        if (getCddPrefNodes_optionalNodes() != null) {
            _hashCode += getCddPrefNodes_optionalNodes().hashCode();
        }
        if (getCddPrefNodes_description() != null) {
            _hashCode += getCddPrefNodes_description().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddPrefNodes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Cdd-pref-nodes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddPrefNodes_preferredNodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-nodes_preferred-nodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-nodes_preferred-nodesType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddPrefNodes_modelOrganisms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-nodes_model-organisms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-nodes_model-organismsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddPrefNodes_optionalNodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-nodes_optional-nodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-nodes_optional-nodesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddPrefNodes_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-nodes_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-nodes_descriptionType"));
        elemField.setMinOccurs(0);
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
