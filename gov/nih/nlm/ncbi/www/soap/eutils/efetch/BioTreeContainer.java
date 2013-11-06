/**
 * BioTreeContainer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BioTreeContainer  implements java.io.Serializable {
    private java.lang.String bioTreeContainer_treetype;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioTreeContainer_fdictType bioTreeContainer_fdict;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioTreeContainer_nodesType bioTreeContainer_nodes;

    public BioTreeContainer() {
    }

    public BioTreeContainer(
           java.lang.String bioTreeContainer_treetype,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioTreeContainer_fdictType bioTreeContainer_fdict,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioTreeContainer_nodesType bioTreeContainer_nodes) {
           this.bioTreeContainer_treetype = bioTreeContainer_treetype;
           this.bioTreeContainer_fdict = bioTreeContainer_fdict;
           this.bioTreeContainer_nodes = bioTreeContainer_nodes;
    }


    /**
     * Gets the bioTreeContainer_treetype value for this BioTreeContainer.
     * 
     * @return bioTreeContainer_treetype
     */
    public java.lang.String getBioTreeContainer_treetype() {
        return bioTreeContainer_treetype;
    }


    /**
     * Sets the bioTreeContainer_treetype value for this BioTreeContainer.
     * 
     * @param bioTreeContainer_treetype
     */
    public void setBioTreeContainer_treetype(java.lang.String bioTreeContainer_treetype) {
        this.bioTreeContainer_treetype = bioTreeContainer_treetype;
    }


    /**
     * Gets the bioTreeContainer_fdict value for this BioTreeContainer.
     * 
     * @return bioTreeContainer_fdict
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioTreeContainer_fdictType getBioTreeContainer_fdict() {
        return bioTreeContainer_fdict;
    }


    /**
     * Sets the bioTreeContainer_fdict value for this BioTreeContainer.
     * 
     * @param bioTreeContainer_fdict
     */
    public void setBioTreeContainer_fdict(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioTreeContainer_fdictType bioTreeContainer_fdict) {
        this.bioTreeContainer_fdict = bioTreeContainer_fdict;
    }


    /**
     * Gets the bioTreeContainer_nodes value for this BioTreeContainer.
     * 
     * @return bioTreeContainer_nodes
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioTreeContainer_nodesType getBioTreeContainer_nodes() {
        return bioTreeContainer_nodes;
    }


    /**
     * Sets the bioTreeContainer_nodes value for this BioTreeContainer.
     * 
     * @param bioTreeContainer_nodes
     */
    public void setBioTreeContainer_nodes(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioTreeContainer_nodesType bioTreeContainer_nodes) {
        this.bioTreeContainer_nodes = bioTreeContainer_nodes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BioTreeContainer)) return false;
        BioTreeContainer other = (BioTreeContainer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bioTreeContainer_treetype==null && other.getBioTreeContainer_treetype()==null) || 
             (this.bioTreeContainer_treetype!=null &&
              this.bioTreeContainer_treetype.equals(other.getBioTreeContainer_treetype()))) &&
            ((this.bioTreeContainer_fdict==null && other.getBioTreeContainer_fdict()==null) || 
             (this.bioTreeContainer_fdict!=null &&
              this.bioTreeContainer_fdict.equals(other.getBioTreeContainer_fdict()))) &&
            ((this.bioTreeContainer_nodes==null && other.getBioTreeContainer_nodes()==null) || 
             (this.bioTreeContainer_nodes!=null &&
              this.bioTreeContainer_nodes.equals(other.getBioTreeContainer_nodes())));
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
        if (getBioTreeContainer_treetype() != null) {
            _hashCode += getBioTreeContainer_treetype().hashCode();
        }
        if (getBioTreeContainer_fdict() != null) {
            _hashCode += getBioTreeContainer_fdict().hashCode();
        }
        if (getBioTreeContainer_nodes() != null) {
            _hashCode += getBioTreeContainer_nodes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BioTreeContainer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">BioTreeContainer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioTreeContainer_treetype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioTreeContainer_treetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioTreeContainer_fdict");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioTreeContainer_fdict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioTreeContainer_fdictType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioTreeContainer_nodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioTreeContainer_nodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioTreeContainer_nodesType"));
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
