/**
 * SeqAlign_segsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqAlign_segsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_dendiagType seqAlign_segs_dendiag;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_densegType seqAlign_segs_denseg;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_stdType seqAlign_segs_std;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_packedType seqAlign_segs_packed;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_discType seqAlign_segs_disc;

    public SeqAlign_segsType() {
    }

    public SeqAlign_segsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_dendiagType seqAlign_segs_dendiag,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_densegType seqAlign_segs_denseg,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_stdType seqAlign_segs_std,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_packedType seqAlign_segs_packed,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_discType seqAlign_segs_disc) {
           this.seqAlign_segs_dendiag = seqAlign_segs_dendiag;
           this.seqAlign_segs_denseg = seqAlign_segs_denseg;
           this.seqAlign_segs_std = seqAlign_segs_std;
           this.seqAlign_segs_packed = seqAlign_segs_packed;
           this.seqAlign_segs_disc = seqAlign_segs_disc;
    }


    /**
     * Gets the seqAlign_segs_dendiag value for this SeqAlign_segsType.
     * 
     * @return seqAlign_segs_dendiag
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_dendiagType getSeqAlign_segs_dendiag() {
        return seqAlign_segs_dendiag;
    }


    /**
     * Sets the seqAlign_segs_dendiag value for this SeqAlign_segsType.
     * 
     * @param seqAlign_segs_dendiag
     */
    public void setSeqAlign_segs_dendiag(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_dendiagType seqAlign_segs_dendiag) {
        this.seqAlign_segs_dendiag = seqAlign_segs_dendiag;
    }


    /**
     * Gets the seqAlign_segs_denseg value for this SeqAlign_segsType.
     * 
     * @return seqAlign_segs_denseg
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_densegType getSeqAlign_segs_denseg() {
        return seqAlign_segs_denseg;
    }


    /**
     * Sets the seqAlign_segs_denseg value for this SeqAlign_segsType.
     * 
     * @param seqAlign_segs_denseg
     */
    public void setSeqAlign_segs_denseg(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_densegType seqAlign_segs_denseg) {
        this.seqAlign_segs_denseg = seqAlign_segs_denseg;
    }


    /**
     * Gets the seqAlign_segs_std value for this SeqAlign_segsType.
     * 
     * @return seqAlign_segs_std
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_stdType getSeqAlign_segs_std() {
        return seqAlign_segs_std;
    }


    /**
     * Sets the seqAlign_segs_std value for this SeqAlign_segsType.
     * 
     * @param seqAlign_segs_std
     */
    public void setSeqAlign_segs_std(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_stdType seqAlign_segs_std) {
        this.seqAlign_segs_std = seqAlign_segs_std;
    }


    /**
     * Gets the seqAlign_segs_packed value for this SeqAlign_segsType.
     * 
     * @return seqAlign_segs_packed
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_packedType getSeqAlign_segs_packed() {
        return seqAlign_segs_packed;
    }


    /**
     * Sets the seqAlign_segs_packed value for this SeqAlign_segsType.
     * 
     * @param seqAlign_segs_packed
     */
    public void setSeqAlign_segs_packed(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_packedType seqAlign_segs_packed) {
        this.seqAlign_segs_packed = seqAlign_segs_packed;
    }


    /**
     * Gets the seqAlign_segs_disc value for this SeqAlign_segsType.
     * 
     * @return seqAlign_segs_disc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_discType getSeqAlign_segs_disc() {
        return seqAlign_segs_disc;
    }


    /**
     * Sets the seqAlign_segs_disc value for this SeqAlign_segsType.
     * 
     * @param seqAlign_segs_disc
     */
    public void setSeqAlign_segs_disc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segs_discType seqAlign_segs_disc) {
        this.seqAlign_segs_disc = seqAlign_segs_disc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqAlign_segsType)) return false;
        SeqAlign_segsType other = (SeqAlign_segsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqAlign_segs_dendiag==null && other.getSeqAlign_segs_dendiag()==null) || 
             (this.seqAlign_segs_dendiag!=null &&
              this.seqAlign_segs_dendiag.equals(other.getSeqAlign_segs_dendiag()))) &&
            ((this.seqAlign_segs_denseg==null && other.getSeqAlign_segs_denseg()==null) || 
             (this.seqAlign_segs_denseg!=null &&
              this.seqAlign_segs_denseg.equals(other.getSeqAlign_segs_denseg()))) &&
            ((this.seqAlign_segs_std==null && other.getSeqAlign_segs_std()==null) || 
             (this.seqAlign_segs_std!=null &&
              this.seqAlign_segs_std.equals(other.getSeqAlign_segs_std()))) &&
            ((this.seqAlign_segs_packed==null && other.getSeqAlign_segs_packed()==null) || 
             (this.seqAlign_segs_packed!=null &&
              this.seqAlign_segs_packed.equals(other.getSeqAlign_segs_packed()))) &&
            ((this.seqAlign_segs_disc==null && other.getSeqAlign_segs_disc()==null) || 
             (this.seqAlign_segs_disc!=null &&
              this.seqAlign_segs_disc.equals(other.getSeqAlign_segs_disc())));
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
        if (getSeqAlign_segs_dendiag() != null) {
            _hashCode += getSeqAlign_segs_dendiag().hashCode();
        }
        if (getSeqAlign_segs_denseg() != null) {
            _hashCode += getSeqAlign_segs_denseg().hashCode();
        }
        if (getSeqAlign_segs_std() != null) {
            _hashCode += getSeqAlign_segs_std().hashCode();
        }
        if (getSeqAlign_segs_packed() != null) {
            _hashCode += getSeqAlign_segs_packed().hashCode();
        }
        if (getSeqAlign_segs_disc() != null) {
            _hashCode += getSeqAlign_segs_disc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqAlign_segsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAlign_segs_dendiag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs_dendiag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs_dendiagType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAlign_segs_denseg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs_denseg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs_densegType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAlign_segs_std");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs_std"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs_stdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAlign_segs_packed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs_packed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs_packedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAlign_segs_disc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs_disc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs_discType"));
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
