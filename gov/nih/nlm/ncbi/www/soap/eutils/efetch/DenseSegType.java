/**
 * DenseSegType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DenseSegType  implements java.io.Serializable {
    private java.lang.String denseSeg_dim;

    private java.lang.String denseSeg_numseg;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_idsType denseSeg_ids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_startsType denseSeg_starts;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_lensType denseSeg_lens;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_strandsType denseSeg_strands;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_scoresType denseSeg_scores;

    public DenseSegType() {
    }

    public DenseSegType(
           java.lang.String denseSeg_dim,
           java.lang.String denseSeg_numseg,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_idsType denseSeg_ids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_startsType denseSeg_starts,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_lensType denseSeg_lens,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_strandsType denseSeg_strands,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_scoresType denseSeg_scores) {
           this.denseSeg_dim = denseSeg_dim;
           this.denseSeg_numseg = denseSeg_numseg;
           this.denseSeg_ids = denseSeg_ids;
           this.denseSeg_starts = denseSeg_starts;
           this.denseSeg_lens = denseSeg_lens;
           this.denseSeg_strands = denseSeg_strands;
           this.denseSeg_scores = denseSeg_scores;
    }


    /**
     * Gets the denseSeg_dim value for this DenseSegType.
     * 
     * @return denseSeg_dim
     */
    public java.lang.String getDenseSeg_dim() {
        return denseSeg_dim;
    }


    /**
     * Sets the denseSeg_dim value for this DenseSegType.
     * 
     * @param denseSeg_dim
     */
    public void setDenseSeg_dim(java.lang.String denseSeg_dim) {
        this.denseSeg_dim = denseSeg_dim;
    }


    /**
     * Gets the denseSeg_numseg value for this DenseSegType.
     * 
     * @return denseSeg_numseg
     */
    public java.lang.String getDenseSeg_numseg() {
        return denseSeg_numseg;
    }


    /**
     * Sets the denseSeg_numseg value for this DenseSegType.
     * 
     * @param denseSeg_numseg
     */
    public void setDenseSeg_numseg(java.lang.String denseSeg_numseg) {
        this.denseSeg_numseg = denseSeg_numseg;
    }


    /**
     * Gets the denseSeg_ids value for this DenseSegType.
     * 
     * @return denseSeg_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_idsType getDenseSeg_ids() {
        return denseSeg_ids;
    }


    /**
     * Sets the denseSeg_ids value for this DenseSegType.
     * 
     * @param denseSeg_ids
     */
    public void setDenseSeg_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_idsType denseSeg_ids) {
        this.denseSeg_ids = denseSeg_ids;
    }


    /**
     * Gets the denseSeg_starts value for this DenseSegType.
     * 
     * @return denseSeg_starts
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_startsType getDenseSeg_starts() {
        return denseSeg_starts;
    }


    /**
     * Sets the denseSeg_starts value for this DenseSegType.
     * 
     * @param denseSeg_starts
     */
    public void setDenseSeg_starts(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_startsType denseSeg_starts) {
        this.denseSeg_starts = denseSeg_starts;
    }


    /**
     * Gets the denseSeg_lens value for this DenseSegType.
     * 
     * @return denseSeg_lens
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_lensType getDenseSeg_lens() {
        return denseSeg_lens;
    }


    /**
     * Sets the denseSeg_lens value for this DenseSegType.
     * 
     * @param denseSeg_lens
     */
    public void setDenseSeg_lens(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_lensType denseSeg_lens) {
        this.denseSeg_lens = denseSeg_lens;
    }


    /**
     * Gets the denseSeg_strands value for this DenseSegType.
     * 
     * @return denseSeg_strands
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_strandsType getDenseSeg_strands() {
        return denseSeg_strands;
    }


    /**
     * Sets the denseSeg_strands value for this DenseSegType.
     * 
     * @param denseSeg_strands
     */
    public void setDenseSeg_strands(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_strandsType denseSeg_strands) {
        this.denseSeg_strands = denseSeg_strands;
    }


    /**
     * Gets the denseSeg_scores value for this DenseSegType.
     * 
     * @return denseSeg_scores
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_scoresType getDenseSeg_scores() {
        return denseSeg_scores;
    }


    /**
     * Sets the denseSeg_scores value for this DenseSegType.
     * 
     * @param denseSeg_scores
     */
    public void setDenseSeg_scores(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseSeg_scoresType denseSeg_scores) {
        this.denseSeg_scores = denseSeg_scores;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DenseSegType)) return false;
        DenseSegType other = (DenseSegType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.denseSeg_dim==null && other.getDenseSeg_dim()==null) || 
             (this.denseSeg_dim!=null &&
              this.denseSeg_dim.equals(other.getDenseSeg_dim()))) &&
            ((this.denseSeg_numseg==null && other.getDenseSeg_numseg()==null) || 
             (this.denseSeg_numseg!=null &&
              this.denseSeg_numseg.equals(other.getDenseSeg_numseg()))) &&
            ((this.denseSeg_ids==null && other.getDenseSeg_ids()==null) || 
             (this.denseSeg_ids!=null &&
              this.denseSeg_ids.equals(other.getDenseSeg_ids()))) &&
            ((this.denseSeg_starts==null && other.getDenseSeg_starts()==null) || 
             (this.denseSeg_starts!=null &&
              this.denseSeg_starts.equals(other.getDenseSeg_starts()))) &&
            ((this.denseSeg_lens==null && other.getDenseSeg_lens()==null) || 
             (this.denseSeg_lens!=null &&
              this.denseSeg_lens.equals(other.getDenseSeg_lens()))) &&
            ((this.denseSeg_strands==null && other.getDenseSeg_strands()==null) || 
             (this.denseSeg_strands!=null &&
              this.denseSeg_strands.equals(other.getDenseSeg_strands()))) &&
            ((this.denseSeg_scores==null && other.getDenseSeg_scores()==null) || 
             (this.denseSeg_scores!=null &&
              this.denseSeg_scores.equals(other.getDenseSeg_scores())));
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
        if (getDenseSeg_dim() != null) {
            _hashCode += getDenseSeg_dim().hashCode();
        }
        if (getDenseSeg_numseg() != null) {
            _hashCode += getDenseSeg_numseg().hashCode();
        }
        if (getDenseSeg_ids() != null) {
            _hashCode += getDenseSeg_ids().hashCode();
        }
        if (getDenseSeg_starts() != null) {
            _hashCode += getDenseSeg_starts().hashCode();
        }
        if (getDenseSeg_lens() != null) {
            _hashCode += getDenseSeg_lens().hashCode();
        }
        if (getDenseSeg_strands() != null) {
            _hashCode += getDenseSeg_strands().hashCode();
        }
        if (getDenseSeg_scores() != null) {
            _hashCode += getDenseSeg_scores().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DenseSegType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-segType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseSeg_dim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_dim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseSeg_numseg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_numseg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseSeg_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_idsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseSeg_starts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_starts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_startsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseSeg_lens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_lens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_lensType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseSeg_strands");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_strands"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_strandsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseSeg_scores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_scores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_scoresType"));
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
