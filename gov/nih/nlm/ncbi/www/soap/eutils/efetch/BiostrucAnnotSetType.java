/**
 * BiostrucAnnotSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucAnnotSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSet_idType biostrucAnnotSet_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSet_descrType biostrucAnnotSet_descr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSet_featuresType biostrucAnnotSet_features;

    public BiostrucAnnotSetType() {
    }

    public BiostrucAnnotSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSet_idType biostrucAnnotSet_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSet_descrType biostrucAnnotSet_descr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSet_featuresType biostrucAnnotSet_features) {
           this.biostrucAnnotSet_id = biostrucAnnotSet_id;
           this.biostrucAnnotSet_descr = biostrucAnnotSet_descr;
           this.biostrucAnnotSet_features = biostrucAnnotSet_features;
    }


    /**
     * Gets the biostrucAnnotSet_id value for this BiostrucAnnotSetType.
     * 
     * @return biostrucAnnotSet_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSet_idType getBiostrucAnnotSet_id() {
        return biostrucAnnotSet_id;
    }


    /**
     * Sets the biostrucAnnotSet_id value for this BiostrucAnnotSetType.
     * 
     * @param biostrucAnnotSet_id
     */
    public void setBiostrucAnnotSet_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSet_idType biostrucAnnotSet_id) {
        this.biostrucAnnotSet_id = biostrucAnnotSet_id;
    }


    /**
     * Gets the biostrucAnnotSet_descr value for this BiostrucAnnotSetType.
     * 
     * @return biostrucAnnotSet_descr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSet_descrType getBiostrucAnnotSet_descr() {
        return biostrucAnnotSet_descr;
    }


    /**
     * Sets the biostrucAnnotSet_descr value for this BiostrucAnnotSetType.
     * 
     * @param biostrucAnnotSet_descr
     */
    public void setBiostrucAnnotSet_descr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSet_descrType biostrucAnnotSet_descr) {
        this.biostrucAnnotSet_descr = biostrucAnnotSet_descr;
    }


    /**
     * Gets the biostrucAnnotSet_features value for this BiostrucAnnotSetType.
     * 
     * @return biostrucAnnotSet_features
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSet_featuresType getBiostrucAnnotSet_features() {
        return biostrucAnnotSet_features;
    }


    /**
     * Sets the biostrucAnnotSet_features value for this BiostrucAnnotSetType.
     * 
     * @param biostrucAnnotSet_features
     */
    public void setBiostrucAnnotSet_features(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAnnotSet_featuresType biostrucAnnotSet_features) {
        this.biostrucAnnotSet_features = biostrucAnnotSet_features;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucAnnotSetType)) return false;
        BiostrucAnnotSetType other = (BiostrucAnnotSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucAnnotSet_id==null && other.getBiostrucAnnotSet_id()==null) || 
             (this.biostrucAnnotSet_id!=null &&
              this.biostrucAnnotSet_id.equals(other.getBiostrucAnnotSet_id()))) &&
            ((this.biostrucAnnotSet_descr==null && other.getBiostrucAnnotSet_descr()==null) || 
             (this.biostrucAnnotSet_descr!=null &&
              this.biostrucAnnotSet_descr.equals(other.getBiostrucAnnotSet_descr()))) &&
            ((this.biostrucAnnotSet_features==null && other.getBiostrucAnnotSet_features()==null) || 
             (this.biostrucAnnotSet_features!=null &&
              this.biostrucAnnotSet_features.equals(other.getBiostrucAnnotSet_features())));
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
        if (getBiostrucAnnotSet_id() != null) {
            _hashCode += getBiostrucAnnotSet_id().hashCode();
        }
        if (getBiostrucAnnotSet_descr() != null) {
            _hashCode += getBiostrucAnnotSet_descr().hashCode();
        }
        if (getBiostrucAnnotSet_features() != null) {
            _hashCode += getBiostrucAnnotSet_features().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucAnnotSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-annot-setType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucAnnotSet_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-annot-set_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-annot-set_idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucAnnotSet_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-annot-set_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-annot-set_descrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucAnnotSet_features");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-annot-set_features"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-annot-set_featuresType"));
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
