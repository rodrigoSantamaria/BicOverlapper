/**
 * MedlineMeshType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineMeshType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMesh_mpType medlineMesh_mp;

    private java.lang.String medlineMesh_term;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMesh_qualType medlineMesh_qual;

    public MedlineMeshType() {
    }

    public MedlineMeshType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMesh_mpType medlineMesh_mp,
           java.lang.String medlineMesh_term,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMesh_qualType medlineMesh_qual) {
           this.medlineMesh_mp = medlineMesh_mp;
           this.medlineMesh_term = medlineMesh_term;
           this.medlineMesh_qual = medlineMesh_qual;
    }


    /**
     * Gets the medlineMesh_mp value for this MedlineMeshType.
     * 
     * @return medlineMesh_mp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMesh_mpType getMedlineMesh_mp() {
        return medlineMesh_mp;
    }


    /**
     * Sets the medlineMesh_mp value for this MedlineMeshType.
     * 
     * @param medlineMesh_mp
     */
    public void setMedlineMesh_mp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMesh_mpType medlineMesh_mp) {
        this.medlineMesh_mp = medlineMesh_mp;
    }


    /**
     * Gets the medlineMesh_term value for this MedlineMeshType.
     * 
     * @return medlineMesh_term
     */
    public java.lang.String getMedlineMesh_term() {
        return medlineMesh_term;
    }


    /**
     * Sets the medlineMesh_term value for this MedlineMeshType.
     * 
     * @param medlineMesh_term
     */
    public void setMedlineMesh_term(java.lang.String medlineMesh_term) {
        this.medlineMesh_term = medlineMesh_term;
    }


    /**
     * Gets the medlineMesh_qual value for this MedlineMeshType.
     * 
     * @return medlineMesh_qual
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMesh_qualType getMedlineMesh_qual() {
        return medlineMesh_qual;
    }


    /**
     * Sets the medlineMesh_qual value for this MedlineMeshType.
     * 
     * @param medlineMesh_qual
     */
    public void setMedlineMesh_qual(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineMesh_qualType medlineMesh_qual) {
        this.medlineMesh_qual = medlineMesh_qual;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineMeshType)) return false;
        MedlineMeshType other = (MedlineMeshType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlineMesh_mp==null && other.getMedlineMesh_mp()==null) || 
             (this.medlineMesh_mp!=null &&
              this.medlineMesh_mp.equals(other.getMedlineMesh_mp()))) &&
            ((this.medlineMesh_term==null && other.getMedlineMesh_term()==null) || 
             (this.medlineMesh_term!=null &&
              this.medlineMesh_term.equals(other.getMedlineMesh_term()))) &&
            ((this.medlineMesh_qual==null && other.getMedlineMesh_qual()==null) || 
             (this.medlineMesh_qual!=null &&
              this.medlineMesh_qual.equals(other.getMedlineMesh_qual())));
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
        if (getMedlineMesh_mp() != null) {
            _hashCode += getMedlineMesh_mp().hashCode();
        }
        if (getMedlineMesh_term() != null) {
            _hashCode += getMedlineMesh_term().hashCode();
        }
        if (getMedlineMesh_qual() != null) {
            _hashCode += getMedlineMesh_qual().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedlineMeshType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-meshType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineMesh_mp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-mesh_mp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-mesh_mpType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineMesh_term");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-mesh_term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineMesh_qual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-mesh_qual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-mesh_qualType"));
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
