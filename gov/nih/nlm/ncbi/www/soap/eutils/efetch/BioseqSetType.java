/**
 * BioseqSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BioseqSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_idType bioseqSet_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_collType bioseqSet_coll;

    private java.lang.String bioseqSet_level;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_classType bioseqSet_class;

    private java.lang.String bioseqSet_release;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_dateType bioseqSet_date;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_descrType bioseqSet_descr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_seqSetType bioseqSet_seqSet;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_annotType bioseqSet_annot;

    public BioseqSetType() {
    }

    public BioseqSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_idType bioseqSet_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_collType bioseqSet_coll,
           java.lang.String bioseqSet_level,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_classType bioseqSet_class,
           java.lang.String bioseqSet_release,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_dateType bioseqSet_date,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_descrType bioseqSet_descr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_seqSetType bioseqSet_seqSet,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_annotType bioseqSet_annot) {
           this.bioseqSet_id = bioseqSet_id;
           this.bioseqSet_coll = bioseqSet_coll;
           this.bioseqSet_level = bioseqSet_level;
           this.bioseqSet_class = bioseqSet_class;
           this.bioseqSet_release = bioseqSet_release;
           this.bioseqSet_date = bioseqSet_date;
           this.bioseqSet_descr = bioseqSet_descr;
           this.bioseqSet_seqSet = bioseqSet_seqSet;
           this.bioseqSet_annot = bioseqSet_annot;
    }


    /**
     * Gets the bioseqSet_id value for this BioseqSetType.
     * 
     * @return bioseqSet_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_idType getBioseqSet_id() {
        return bioseqSet_id;
    }


    /**
     * Sets the bioseqSet_id value for this BioseqSetType.
     * 
     * @param bioseqSet_id
     */
    public void setBioseqSet_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_idType bioseqSet_id) {
        this.bioseqSet_id = bioseqSet_id;
    }


    /**
     * Gets the bioseqSet_coll value for this BioseqSetType.
     * 
     * @return bioseqSet_coll
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_collType getBioseqSet_coll() {
        return bioseqSet_coll;
    }


    /**
     * Sets the bioseqSet_coll value for this BioseqSetType.
     * 
     * @param bioseqSet_coll
     */
    public void setBioseqSet_coll(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_collType bioseqSet_coll) {
        this.bioseqSet_coll = bioseqSet_coll;
    }


    /**
     * Gets the bioseqSet_level value for this BioseqSetType.
     * 
     * @return bioseqSet_level
     */
    public java.lang.String getBioseqSet_level() {
        return bioseqSet_level;
    }


    /**
     * Sets the bioseqSet_level value for this BioseqSetType.
     * 
     * @param bioseqSet_level
     */
    public void setBioseqSet_level(java.lang.String bioseqSet_level) {
        this.bioseqSet_level = bioseqSet_level;
    }


    /**
     * Gets the bioseqSet_class value for this BioseqSetType.
     * 
     * @return bioseqSet_class
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_classType getBioseqSet_class() {
        return bioseqSet_class;
    }


    /**
     * Sets the bioseqSet_class value for this BioseqSetType.
     * 
     * @param bioseqSet_class
     */
    public void setBioseqSet_class(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_classType bioseqSet_class) {
        this.bioseqSet_class = bioseqSet_class;
    }


    /**
     * Gets the bioseqSet_release value for this BioseqSetType.
     * 
     * @return bioseqSet_release
     */
    public java.lang.String getBioseqSet_release() {
        return bioseqSet_release;
    }


    /**
     * Sets the bioseqSet_release value for this BioseqSetType.
     * 
     * @param bioseqSet_release
     */
    public void setBioseqSet_release(java.lang.String bioseqSet_release) {
        this.bioseqSet_release = bioseqSet_release;
    }


    /**
     * Gets the bioseqSet_date value for this BioseqSetType.
     * 
     * @return bioseqSet_date
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_dateType getBioseqSet_date() {
        return bioseqSet_date;
    }


    /**
     * Sets the bioseqSet_date value for this BioseqSetType.
     * 
     * @param bioseqSet_date
     */
    public void setBioseqSet_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_dateType bioseqSet_date) {
        this.bioseqSet_date = bioseqSet_date;
    }


    /**
     * Gets the bioseqSet_descr value for this BioseqSetType.
     * 
     * @return bioseqSet_descr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_descrType getBioseqSet_descr() {
        return bioseqSet_descr;
    }


    /**
     * Sets the bioseqSet_descr value for this BioseqSetType.
     * 
     * @param bioseqSet_descr
     */
    public void setBioseqSet_descr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_descrType bioseqSet_descr) {
        this.bioseqSet_descr = bioseqSet_descr;
    }


    /**
     * Gets the bioseqSet_seqSet value for this BioseqSetType.
     * 
     * @return bioseqSet_seqSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_seqSetType getBioseqSet_seqSet() {
        return bioseqSet_seqSet;
    }


    /**
     * Sets the bioseqSet_seqSet value for this BioseqSetType.
     * 
     * @param bioseqSet_seqSet
     */
    public void setBioseqSet_seqSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_seqSetType bioseqSet_seqSet) {
        this.bioseqSet_seqSet = bioseqSet_seqSet;
    }


    /**
     * Gets the bioseqSet_annot value for this BioseqSetType.
     * 
     * @return bioseqSet_annot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_annotType getBioseqSet_annot() {
        return bioseqSet_annot;
    }


    /**
     * Sets the bioseqSet_annot value for this BioseqSetType.
     * 
     * @param bioseqSet_annot
     */
    public void setBioseqSet_annot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSet_annotType bioseqSet_annot) {
        this.bioseqSet_annot = bioseqSet_annot;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BioseqSetType)) return false;
        BioseqSetType other = (BioseqSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bioseqSet_id==null && other.getBioseqSet_id()==null) || 
             (this.bioseqSet_id!=null &&
              this.bioseqSet_id.equals(other.getBioseqSet_id()))) &&
            ((this.bioseqSet_coll==null && other.getBioseqSet_coll()==null) || 
             (this.bioseqSet_coll!=null &&
              this.bioseqSet_coll.equals(other.getBioseqSet_coll()))) &&
            ((this.bioseqSet_level==null && other.getBioseqSet_level()==null) || 
             (this.bioseqSet_level!=null &&
              this.bioseqSet_level.equals(other.getBioseqSet_level()))) &&
            ((this.bioseqSet_class==null && other.getBioseqSet_class()==null) || 
             (this.bioseqSet_class!=null &&
              this.bioseqSet_class.equals(other.getBioseqSet_class()))) &&
            ((this.bioseqSet_release==null && other.getBioseqSet_release()==null) || 
             (this.bioseqSet_release!=null &&
              this.bioseqSet_release.equals(other.getBioseqSet_release()))) &&
            ((this.bioseqSet_date==null && other.getBioseqSet_date()==null) || 
             (this.bioseqSet_date!=null &&
              this.bioseqSet_date.equals(other.getBioseqSet_date()))) &&
            ((this.bioseqSet_descr==null && other.getBioseqSet_descr()==null) || 
             (this.bioseqSet_descr!=null &&
              this.bioseqSet_descr.equals(other.getBioseqSet_descr()))) &&
            ((this.bioseqSet_seqSet==null && other.getBioseqSet_seqSet()==null) || 
             (this.bioseqSet_seqSet!=null &&
              this.bioseqSet_seqSet.equals(other.getBioseqSet_seqSet()))) &&
            ((this.bioseqSet_annot==null && other.getBioseqSet_annot()==null) || 
             (this.bioseqSet_annot!=null &&
              this.bioseqSet_annot.equals(other.getBioseqSet_annot())));
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
        if (getBioseqSet_id() != null) {
            _hashCode += getBioseqSet_id().hashCode();
        }
        if (getBioseqSet_coll() != null) {
            _hashCode += getBioseqSet_coll().hashCode();
        }
        if (getBioseqSet_level() != null) {
            _hashCode += getBioseqSet_level().hashCode();
        }
        if (getBioseqSet_class() != null) {
            _hashCode += getBioseqSet_class().hashCode();
        }
        if (getBioseqSet_release() != null) {
            _hashCode += getBioseqSet_release().hashCode();
        }
        if (getBioseqSet_date() != null) {
            _hashCode += getBioseqSet_date().hashCode();
        }
        if (getBioseqSet_descr() != null) {
            _hashCode += getBioseqSet_descr().hashCode();
        }
        if (getBioseqSet_seqSet() != null) {
            _hashCode += getBioseqSet_seqSet().hashCode();
        }
        if (getBioseqSet_annot() != null) {
            _hashCode += getBioseqSet_annot().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BioseqSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-setType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseqSet_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseqSet_coll");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_coll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_collType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseqSet_level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseqSet_class");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_classType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseqSet_release");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_release"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseqSet_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseqSet_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_descrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseqSet_seqSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_seq-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_seq-setType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseqSet_annot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_annot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set_annotType"));
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
