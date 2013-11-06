/**
 * SeqAlignType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqAlignType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_typeType seqAlign_type;

    private java.lang.String seqAlign_dim;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_scoreType seqAlign_score;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segsType seqAlign_segs;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_boundsType seqAlign_bounds;

    public SeqAlignType() {
    }

    public SeqAlignType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_typeType seqAlign_type,
           java.lang.String seqAlign_dim,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_scoreType seqAlign_score,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segsType seqAlign_segs,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_boundsType seqAlign_bounds) {
           this.seqAlign_type = seqAlign_type;
           this.seqAlign_dim = seqAlign_dim;
           this.seqAlign_score = seqAlign_score;
           this.seqAlign_segs = seqAlign_segs;
           this.seqAlign_bounds = seqAlign_bounds;
    }


    /**
     * Gets the seqAlign_type value for this SeqAlignType.
     * 
     * @return seqAlign_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_typeType getSeqAlign_type() {
        return seqAlign_type;
    }


    /**
     * Sets the seqAlign_type value for this SeqAlignType.
     * 
     * @param seqAlign_type
     */
    public void setSeqAlign_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_typeType seqAlign_type) {
        this.seqAlign_type = seqAlign_type;
    }


    /**
     * Gets the seqAlign_dim value for this SeqAlignType.
     * 
     * @return seqAlign_dim
     */
    public java.lang.String getSeqAlign_dim() {
        return seqAlign_dim;
    }


    /**
     * Sets the seqAlign_dim value for this SeqAlignType.
     * 
     * @param seqAlign_dim
     */
    public void setSeqAlign_dim(java.lang.String seqAlign_dim) {
        this.seqAlign_dim = seqAlign_dim;
    }


    /**
     * Gets the seqAlign_score value for this SeqAlignType.
     * 
     * @return seqAlign_score
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_scoreType getSeqAlign_score() {
        return seqAlign_score;
    }


    /**
     * Sets the seqAlign_score value for this SeqAlignType.
     * 
     * @param seqAlign_score
     */
    public void setSeqAlign_score(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_scoreType seqAlign_score) {
        this.seqAlign_score = seqAlign_score;
    }


    /**
     * Gets the seqAlign_segs value for this SeqAlignType.
     * 
     * @return seqAlign_segs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segsType getSeqAlign_segs() {
        return seqAlign_segs;
    }


    /**
     * Sets the seqAlign_segs value for this SeqAlignType.
     * 
     * @param seqAlign_segs
     */
    public void setSeqAlign_segs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_segsType seqAlign_segs) {
        this.seqAlign_segs = seqAlign_segs;
    }


    /**
     * Gets the seqAlign_bounds value for this SeqAlignType.
     * 
     * @return seqAlign_bounds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_boundsType getSeqAlign_bounds() {
        return seqAlign_bounds;
    }


    /**
     * Sets the seqAlign_bounds value for this SeqAlignType.
     * 
     * @param seqAlign_bounds
     */
    public void setSeqAlign_bounds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlign_boundsType seqAlign_bounds) {
        this.seqAlign_bounds = seqAlign_bounds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqAlignType)) return false;
        SeqAlignType other = (SeqAlignType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqAlign_type==null && other.getSeqAlign_type()==null) || 
             (this.seqAlign_type!=null &&
              this.seqAlign_type.equals(other.getSeqAlign_type()))) &&
            ((this.seqAlign_dim==null && other.getSeqAlign_dim()==null) || 
             (this.seqAlign_dim!=null &&
              this.seqAlign_dim.equals(other.getSeqAlign_dim()))) &&
            ((this.seqAlign_score==null && other.getSeqAlign_score()==null) || 
             (this.seqAlign_score!=null &&
              this.seqAlign_score.equals(other.getSeqAlign_score()))) &&
            ((this.seqAlign_segs==null && other.getSeqAlign_segs()==null) || 
             (this.seqAlign_segs!=null &&
              this.seqAlign_segs.equals(other.getSeqAlign_segs()))) &&
            ((this.seqAlign_bounds==null && other.getSeqAlign_bounds()==null) || 
             (this.seqAlign_bounds!=null &&
              this.seqAlign_bounds.equals(other.getSeqAlign_bounds())));
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
        if (getSeqAlign_type() != null) {
            _hashCode += getSeqAlign_type().hashCode();
        }
        if (getSeqAlign_dim() != null) {
            _hashCode += getSeqAlign_dim().hashCode();
        }
        if (getSeqAlign_score() != null) {
            _hashCode += getSeqAlign_score().hashCode();
        }
        if (getSeqAlign_segs() != null) {
            _hashCode += getSeqAlign_segs().hashCode();
        }
        if (getSeqAlign_bounds() != null) {
            _hashCode += getSeqAlign_bounds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqAlignType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-alignType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAlign_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAlign_dim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_dim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAlign_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_scoreType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAlign_segs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_segsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAlign_bounds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_bounds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align_boundsType"));
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
