/**
 * SequenceTreeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SequenceTreeType  implements java.io.Serializable {
    private java.lang.String sequenceTree_cdAccession;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTree_algorithmType sequenceTree_algorithm;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTree_isAnnotatedType sequenceTree_isAnnotated;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTree_rootType sequenceTree_root;

    public SequenceTreeType() {
    }

    public SequenceTreeType(
           java.lang.String sequenceTree_cdAccession,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTree_algorithmType sequenceTree_algorithm,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTree_isAnnotatedType sequenceTree_isAnnotated,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTree_rootType sequenceTree_root) {
           this.sequenceTree_cdAccession = sequenceTree_cdAccession;
           this.sequenceTree_algorithm = sequenceTree_algorithm;
           this.sequenceTree_isAnnotated = sequenceTree_isAnnotated;
           this.sequenceTree_root = sequenceTree_root;
    }


    /**
     * Gets the sequenceTree_cdAccession value for this SequenceTreeType.
     * 
     * @return sequenceTree_cdAccession
     */
    public java.lang.String getSequenceTree_cdAccession() {
        return sequenceTree_cdAccession;
    }


    /**
     * Sets the sequenceTree_cdAccession value for this SequenceTreeType.
     * 
     * @param sequenceTree_cdAccession
     */
    public void setSequenceTree_cdAccession(java.lang.String sequenceTree_cdAccession) {
        this.sequenceTree_cdAccession = sequenceTree_cdAccession;
    }


    /**
     * Gets the sequenceTree_algorithm value for this SequenceTreeType.
     * 
     * @return sequenceTree_algorithm
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTree_algorithmType getSequenceTree_algorithm() {
        return sequenceTree_algorithm;
    }


    /**
     * Sets the sequenceTree_algorithm value for this SequenceTreeType.
     * 
     * @param sequenceTree_algorithm
     */
    public void setSequenceTree_algorithm(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTree_algorithmType sequenceTree_algorithm) {
        this.sequenceTree_algorithm = sequenceTree_algorithm;
    }


    /**
     * Gets the sequenceTree_isAnnotated value for this SequenceTreeType.
     * 
     * @return sequenceTree_isAnnotated
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTree_isAnnotatedType getSequenceTree_isAnnotated() {
        return sequenceTree_isAnnotated;
    }


    /**
     * Sets the sequenceTree_isAnnotated value for this SequenceTreeType.
     * 
     * @param sequenceTree_isAnnotated
     */
    public void setSequenceTree_isAnnotated(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTree_isAnnotatedType sequenceTree_isAnnotated) {
        this.sequenceTree_isAnnotated = sequenceTree_isAnnotated;
    }


    /**
     * Gets the sequenceTree_root value for this SequenceTreeType.
     * 
     * @return sequenceTree_root
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTree_rootType getSequenceTree_root() {
        return sequenceTree_root;
    }


    /**
     * Sets the sequenceTree_root value for this SequenceTreeType.
     * 
     * @param sequenceTree_root
     */
    public void setSequenceTree_root(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTree_rootType sequenceTree_root) {
        this.sequenceTree_root = sequenceTree_root;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SequenceTreeType)) return false;
        SequenceTreeType other = (SequenceTreeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sequenceTree_cdAccession==null && other.getSequenceTree_cdAccession()==null) || 
             (this.sequenceTree_cdAccession!=null &&
              this.sequenceTree_cdAccession.equals(other.getSequenceTree_cdAccession()))) &&
            ((this.sequenceTree_algorithm==null && other.getSequenceTree_algorithm()==null) || 
             (this.sequenceTree_algorithm!=null &&
              this.sequenceTree_algorithm.equals(other.getSequenceTree_algorithm()))) &&
            ((this.sequenceTree_isAnnotated==null && other.getSequenceTree_isAnnotated()==null) || 
             (this.sequenceTree_isAnnotated!=null &&
              this.sequenceTree_isAnnotated.equals(other.getSequenceTree_isAnnotated()))) &&
            ((this.sequenceTree_root==null && other.getSequenceTree_root()==null) || 
             (this.sequenceTree_root!=null &&
              this.sequenceTree_root.equals(other.getSequenceTree_root())));
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
        if (getSequenceTree_cdAccession() != null) {
            _hashCode += getSequenceTree_cdAccession().hashCode();
        }
        if (getSequenceTree_algorithm() != null) {
            _hashCode += getSequenceTree_algorithm().hashCode();
        }
        if (getSequenceTree_isAnnotated() != null) {
            _hashCode += getSequenceTree_isAnnotated().hashCode();
        }
        if (getSequenceTree_root() != null) {
            _hashCode += getSequenceTree_root().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SequenceTreeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sequence-treeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceTree_cdAccession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sequence-tree_cdAccession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceTree_algorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sequence-tree_algorithm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sequence-tree_algorithmType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceTree_isAnnotated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sequence-tree_isAnnotated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sequence-tree_isAnnotatedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceTree_root");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sequence-tree_root"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sequence-tree_rootType"));
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
