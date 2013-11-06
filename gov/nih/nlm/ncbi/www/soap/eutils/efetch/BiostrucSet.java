/**
 * BiostrucSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSet_idType biostrucSet_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSet_descrType biostrucSet_descr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSet_biostrucsType biostrucSet_biostrucs;

    public BiostrucSet() {
    }

    public BiostrucSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSet_idType biostrucSet_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSet_descrType biostrucSet_descr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSet_biostrucsType biostrucSet_biostrucs) {
           this.biostrucSet_id = biostrucSet_id;
           this.biostrucSet_descr = biostrucSet_descr;
           this.biostrucSet_biostrucs = biostrucSet_biostrucs;
    }


    /**
     * Gets the biostrucSet_id value for this BiostrucSet.
     * 
     * @return biostrucSet_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSet_idType getBiostrucSet_id() {
        return biostrucSet_id;
    }


    /**
     * Sets the biostrucSet_id value for this BiostrucSet.
     * 
     * @param biostrucSet_id
     */
    public void setBiostrucSet_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSet_idType biostrucSet_id) {
        this.biostrucSet_id = biostrucSet_id;
    }


    /**
     * Gets the biostrucSet_descr value for this BiostrucSet.
     * 
     * @return biostrucSet_descr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSet_descrType getBiostrucSet_descr() {
        return biostrucSet_descr;
    }


    /**
     * Sets the biostrucSet_descr value for this BiostrucSet.
     * 
     * @param biostrucSet_descr
     */
    public void setBiostrucSet_descr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSet_descrType biostrucSet_descr) {
        this.biostrucSet_descr = biostrucSet_descr;
    }


    /**
     * Gets the biostrucSet_biostrucs value for this BiostrucSet.
     * 
     * @return biostrucSet_biostrucs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSet_biostrucsType getBiostrucSet_biostrucs() {
        return biostrucSet_biostrucs;
    }


    /**
     * Sets the biostrucSet_biostrucs value for this BiostrucSet.
     * 
     * @param biostrucSet_biostrucs
     */
    public void setBiostrucSet_biostrucs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSet_biostrucsType biostrucSet_biostrucs) {
        this.biostrucSet_biostrucs = biostrucSet_biostrucs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucSet)) return false;
        BiostrucSet other = (BiostrucSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucSet_id==null && other.getBiostrucSet_id()==null) || 
             (this.biostrucSet_id!=null &&
              this.biostrucSet_id.equals(other.getBiostrucSet_id()))) &&
            ((this.biostrucSet_descr==null && other.getBiostrucSet_descr()==null) || 
             (this.biostrucSet_descr!=null &&
              this.biostrucSet_descr.equals(other.getBiostrucSet_descr()))) &&
            ((this.biostrucSet_biostrucs==null && other.getBiostrucSet_biostrucs()==null) || 
             (this.biostrucSet_biostrucs!=null &&
              this.biostrucSet_biostrucs.equals(other.getBiostrucSet_biostrucs())));
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
        if (getBiostrucSet_id() != null) {
            _hashCode += getBiostrucSet_id().hashCode();
        }
        if (getBiostrucSet_descr() != null) {
            _hashCode += getBiostrucSet_descr().hashCode();
        }
        if (getBiostrucSet_biostrucs() != null) {
            _hashCode += getBiostrucSet_biostrucs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Biostruc-set"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSet_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-set_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-set_idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSet_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-set_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-set_descrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSet_biostrucs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-set_biostrucs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-set_biostrucsType"));
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
