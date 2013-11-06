/**
 * BiostrucFeatureSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucFeatureSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSet_idType biostrucFeatureSet_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSet_descrType biostrucFeatureSet_descr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSet_featuresType biostrucFeatureSet_features;

    public BiostrucFeatureSetType() {
    }

    public BiostrucFeatureSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSet_idType biostrucFeatureSet_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSet_descrType biostrucFeatureSet_descr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSet_featuresType biostrucFeatureSet_features) {
           this.biostrucFeatureSet_id = biostrucFeatureSet_id;
           this.biostrucFeatureSet_descr = biostrucFeatureSet_descr;
           this.biostrucFeatureSet_features = biostrucFeatureSet_features;
    }


    /**
     * Gets the biostrucFeatureSet_id value for this BiostrucFeatureSetType.
     * 
     * @return biostrucFeatureSet_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSet_idType getBiostrucFeatureSet_id() {
        return biostrucFeatureSet_id;
    }


    /**
     * Sets the biostrucFeatureSet_id value for this BiostrucFeatureSetType.
     * 
     * @param biostrucFeatureSet_id
     */
    public void setBiostrucFeatureSet_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSet_idType biostrucFeatureSet_id) {
        this.biostrucFeatureSet_id = biostrucFeatureSet_id;
    }


    /**
     * Gets the biostrucFeatureSet_descr value for this BiostrucFeatureSetType.
     * 
     * @return biostrucFeatureSet_descr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSet_descrType getBiostrucFeatureSet_descr() {
        return biostrucFeatureSet_descr;
    }


    /**
     * Sets the biostrucFeatureSet_descr value for this BiostrucFeatureSetType.
     * 
     * @param biostrucFeatureSet_descr
     */
    public void setBiostrucFeatureSet_descr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSet_descrType biostrucFeatureSet_descr) {
        this.biostrucFeatureSet_descr = biostrucFeatureSet_descr;
    }


    /**
     * Gets the biostrucFeatureSet_features value for this BiostrucFeatureSetType.
     * 
     * @return biostrucFeatureSet_features
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSet_featuresType getBiostrucFeatureSet_features() {
        return biostrucFeatureSet_features;
    }


    /**
     * Sets the biostrucFeatureSet_features value for this BiostrucFeatureSetType.
     * 
     * @param biostrucFeatureSet_features
     */
    public void setBiostrucFeatureSet_features(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSet_featuresType biostrucFeatureSet_features) {
        this.biostrucFeatureSet_features = biostrucFeatureSet_features;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucFeatureSetType)) return false;
        BiostrucFeatureSetType other = (BiostrucFeatureSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucFeatureSet_id==null && other.getBiostrucFeatureSet_id()==null) || 
             (this.biostrucFeatureSet_id!=null &&
              this.biostrucFeatureSet_id.equals(other.getBiostrucFeatureSet_id()))) &&
            ((this.biostrucFeatureSet_descr==null && other.getBiostrucFeatureSet_descr()==null) || 
             (this.biostrucFeatureSet_descr!=null &&
              this.biostrucFeatureSet_descr.equals(other.getBiostrucFeatureSet_descr()))) &&
            ((this.biostrucFeatureSet_features==null && other.getBiostrucFeatureSet_features()==null) || 
             (this.biostrucFeatureSet_features!=null &&
              this.biostrucFeatureSet_features.equals(other.getBiostrucFeatureSet_features())));
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
        if (getBiostrucFeatureSet_id() != null) {
            _hashCode += getBiostrucFeatureSet_id().hashCode();
        }
        if (getBiostrucFeatureSet_descr() != null) {
            _hashCode += getBiostrucFeatureSet_descr().hashCode();
        }
        if (getBiostrucFeatureSet_features() != null) {
            _hashCode += getBiostrucFeatureSet_features().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucFeatureSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-setType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeatureSet_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeatureSet_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set_descrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeatureSet_features");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set_features"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set_featuresType"));
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
