/**
 * PackedSegType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PackedSegType  implements java.io.Serializable {
    private java.lang.String packedSeg_dim;

    private java.lang.String packedSeg_numseg;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_idsType packedSeg_ids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_startsType packedSeg_starts;

    private java.lang.String packedSeg_present;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_lensType packedSeg_lens;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_strandsType packedSeg_strands;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_scoresType packedSeg_scores;

    public PackedSegType() {
    }

    public PackedSegType(
           java.lang.String packedSeg_dim,
           java.lang.String packedSeg_numseg,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_idsType packedSeg_ids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_startsType packedSeg_starts,
           java.lang.String packedSeg_present,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_lensType packedSeg_lens,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_strandsType packedSeg_strands,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_scoresType packedSeg_scores) {
           this.packedSeg_dim = packedSeg_dim;
           this.packedSeg_numseg = packedSeg_numseg;
           this.packedSeg_ids = packedSeg_ids;
           this.packedSeg_starts = packedSeg_starts;
           this.packedSeg_present = packedSeg_present;
           this.packedSeg_lens = packedSeg_lens;
           this.packedSeg_strands = packedSeg_strands;
           this.packedSeg_scores = packedSeg_scores;
    }


    /**
     * Gets the packedSeg_dim value for this PackedSegType.
     * 
     * @return packedSeg_dim
     */
    public java.lang.String getPackedSeg_dim() {
        return packedSeg_dim;
    }


    /**
     * Sets the packedSeg_dim value for this PackedSegType.
     * 
     * @param packedSeg_dim
     */
    public void setPackedSeg_dim(java.lang.String packedSeg_dim) {
        this.packedSeg_dim = packedSeg_dim;
    }


    /**
     * Gets the packedSeg_numseg value for this PackedSegType.
     * 
     * @return packedSeg_numseg
     */
    public java.lang.String getPackedSeg_numseg() {
        return packedSeg_numseg;
    }


    /**
     * Sets the packedSeg_numseg value for this PackedSegType.
     * 
     * @param packedSeg_numseg
     */
    public void setPackedSeg_numseg(java.lang.String packedSeg_numseg) {
        this.packedSeg_numseg = packedSeg_numseg;
    }


    /**
     * Gets the packedSeg_ids value for this PackedSegType.
     * 
     * @return packedSeg_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_idsType getPackedSeg_ids() {
        return packedSeg_ids;
    }


    /**
     * Sets the packedSeg_ids value for this PackedSegType.
     * 
     * @param packedSeg_ids
     */
    public void setPackedSeg_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_idsType packedSeg_ids) {
        this.packedSeg_ids = packedSeg_ids;
    }


    /**
     * Gets the packedSeg_starts value for this PackedSegType.
     * 
     * @return packedSeg_starts
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_startsType getPackedSeg_starts() {
        return packedSeg_starts;
    }


    /**
     * Sets the packedSeg_starts value for this PackedSegType.
     * 
     * @param packedSeg_starts
     */
    public void setPackedSeg_starts(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_startsType packedSeg_starts) {
        this.packedSeg_starts = packedSeg_starts;
    }


    /**
     * Gets the packedSeg_present value for this PackedSegType.
     * 
     * @return packedSeg_present
     */
    public java.lang.String getPackedSeg_present() {
        return packedSeg_present;
    }


    /**
     * Sets the packedSeg_present value for this PackedSegType.
     * 
     * @param packedSeg_present
     */
    public void setPackedSeg_present(java.lang.String packedSeg_present) {
        this.packedSeg_present = packedSeg_present;
    }


    /**
     * Gets the packedSeg_lens value for this PackedSegType.
     * 
     * @return packedSeg_lens
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_lensType getPackedSeg_lens() {
        return packedSeg_lens;
    }


    /**
     * Sets the packedSeg_lens value for this PackedSegType.
     * 
     * @param packedSeg_lens
     */
    public void setPackedSeg_lens(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_lensType packedSeg_lens) {
        this.packedSeg_lens = packedSeg_lens;
    }


    /**
     * Gets the packedSeg_strands value for this PackedSegType.
     * 
     * @return packedSeg_strands
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_strandsType getPackedSeg_strands() {
        return packedSeg_strands;
    }


    /**
     * Sets the packedSeg_strands value for this PackedSegType.
     * 
     * @param packedSeg_strands
     */
    public void setPackedSeg_strands(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_strandsType packedSeg_strands) {
        this.packedSeg_strands = packedSeg_strands;
    }


    /**
     * Gets the packedSeg_scores value for this PackedSegType.
     * 
     * @return packedSeg_scores
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_scoresType getPackedSeg_scores() {
        return packedSeg_scores;
    }


    /**
     * Sets the packedSeg_scores value for this PackedSegType.
     * 
     * @param packedSeg_scores
     */
    public void setPackedSeg_scores(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeg_scoresType packedSeg_scores) {
        this.packedSeg_scores = packedSeg_scores;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackedSegType)) return false;
        PackedSegType other = (PackedSegType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packedSeg_dim==null && other.getPackedSeg_dim()==null) || 
             (this.packedSeg_dim!=null &&
              this.packedSeg_dim.equals(other.getPackedSeg_dim()))) &&
            ((this.packedSeg_numseg==null && other.getPackedSeg_numseg()==null) || 
             (this.packedSeg_numseg!=null &&
              this.packedSeg_numseg.equals(other.getPackedSeg_numseg()))) &&
            ((this.packedSeg_ids==null && other.getPackedSeg_ids()==null) || 
             (this.packedSeg_ids!=null &&
              this.packedSeg_ids.equals(other.getPackedSeg_ids()))) &&
            ((this.packedSeg_starts==null && other.getPackedSeg_starts()==null) || 
             (this.packedSeg_starts!=null &&
              this.packedSeg_starts.equals(other.getPackedSeg_starts()))) &&
            ((this.packedSeg_present==null && other.getPackedSeg_present()==null) || 
             (this.packedSeg_present!=null &&
              this.packedSeg_present.equals(other.getPackedSeg_present()))) &&
            ((this.packedSeg_lens==null && other.getPackedSeg_lens()==null) || 
             (this.packedSeg_lens!=null &&
              this.packedSeg_lens.equals(other.getPackedSeg_lens()))) &&
            ((this.packedSeg_strands==null && other.getPackedSeg_strands()==null) || 
             (this.packedSeg_strands!=null &&
              this.packedSeg_strands.equals(other.getPackedSeg_strands()))) &&
            ((this.packedSeg_scores==null && other.getPackedSeg_scores()==null) || 
             (this.packedSeg_scores!=null &&
              this.packedSeg_scores.equals(other.getPackedSeg_scores())));
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
        if (getPackedSeg_dim() != null) {
            _hashCode += getPackedSeg_dim().hashCode();
        }
        if (getPackedSeg_numseg() != null) {
            _hashCode += getPackedSeg_numseg().hashCode();
        }
        if (getPackedSeg_ids() != null) {
            _hashCode += getPackedSeg_ids().hashCode();
        }
        if (getPackedSeg_starts() != null) {
            _hashCode += getPackedSeg_starts().hashCode();
        }
        if (getPackedSeg_present() != null) {
            _hashCode += getPackedSeg_present().hashCode();
        }
        if (getPackedSeg_lens() != null) {
            _hashCode += getPackedSeg_lens().hashCode();
        }
        if (getPackedSeg_strands() != null) {
            _hashCode += getPackedSeg_strands().hashCode();
        }
        if (getPackedSeg_scores() != null) {
            _hashCode += getPackedSeg_scores().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackedSegType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-segType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeg_dim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_dim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeg_numseg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_numseg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeg_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_idsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeg_starts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_starts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_startsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeg_present");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_present"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeg_lens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_lens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_lensType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeg_strands");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_strands"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_strandsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeg_scores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_scores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_scoresType"));
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
