/**
 * AlignStatsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AlignStatsType  implements java.io.Serializable {
    private java.lang.String alignStats_descr;

    private java.lang.String alignStats_scaleFactor;

    private java.lang.String alignStats_vastScore;

    private java.lang.String alignStats_vastMlogp;

    private java.lang.String alignStats_alignRes;

    private java.lang.String alignStats_rmsd;

    private java.lang.String alignStats_blastScore;

    private java.lang.String alignStats_blastMlogp;

    private java.lang.String alignStats_otherScore;

    public AlignStatsType() {
    }

    public AlignStatsType(
           java.lang.String alignStats_descr,
           java.lang.String alignStats_scaleFactor,
           java.lang.String alignStats_vastScore,
           java.lang.String alignStats_vastMlogp,
           java.lang.String alignStats_alignRes,
           java.lang.String alignStats_rmsd,
           java.lang.String alignStats_blastScore,
           java.lang.String alignStats_blastMlogp,
           java.lang.String alignStats_otherScore) {
           this.alignStats_descr = alignStats_descr;
           this.alignStats_scaleFactor = alignStats_scaleFactor;
           this.alignStats_vastScore = alignStats_vastScore;
           this.alignStats_vastMlogp = alignStats_vastMlogp;
           this.alignStats_alignRes = alignStats_alignRes;
           this.alignStats_rmsd = alignStats_rmsd;
           this.alignStats_blastScore = alignStats_blastScore;
           this.alignStats_blastMlogp = alignStats_blastMlogp;
           this.alignStats_otherScore = alignStats_otherScore;
    }


    /**
     * Gets the alignStats_descr value for this AlignStatsType.
     * 
     * @return alignStats_descr
     */
    public java.lang.String getAlignStats_descr() {
        return alignStats_descr;
    }


    /**
     * Sets the alignStats_descr value for this AlignStatsType.
     * 
     * @param alignStats_descr
     */
    public void setAlignStats_descr(java.lang.String alignStats_descr) {
        this.alignStats_descr = alignStats_descr;
    }


    /**
     * Gets the alignStats_scaleFactor value for this AlignStatsType.
     * 
     * @return alignStats_scaleFactor
     */
    public java.lang.String getAlignStats_scaleFactor() {
        return alignStats_scaleFactor;
    }


    /**
     * Sets the alignStats_scaleFactor value for this AlignStatsType.
     * 
     * @param alignStats_scaleFactor
     */
    public void setAlignStats_scaleFactor(java.lang.String alignStats_scaleFactor) {
        this.alignStats_scaleFactor = alignStats_scaleFactor;
    }


    /**
     * Gets the alignStats_vastScore value for this AlignStatsType.
     * 
     * @return alignStats_vastScore
     */
    public java.lang.String getAlignStats_vastScore() {
        return alignStats_vastScore;
    }


    /**
     * Sets the alignStats_vastScore value for this AlignStatsType.
     * 
     * @param alignStats_vastScore
     */
    public void setAlignStats_vastScore(java.lang.String alignStats_vastScore) {
        this.alignStats_vastScore = alignStats_vastScore;
    }


    /**
     * Gets the alignStats_vastMlogp value for this AlignStatsType.
     * 
     * @return alignStats_vastMlogp
     */
    public java.lang.String getAlignStats_vastMlogp() {
        return alignStats_vastMlogp;
    }


    /**
     * Sets the alignStats_vastMlogp value for this AlignStatsType.
     * 
     * @param alignStats_vastMlogp
     */
    public void setAlignStats_vastMlogp(java.lang.String alignStats_vastMlogp) {
        this.alignStats_vastMlogp = alignStats_vastMlogp;
    }


    /**
     * Gets the alignStats_alignRes value for this AlignStatsType.
     * 
     * @return alignStats_alignRes
     */
    public java.lang.String getAlignStats_alignRes() {
        return alignStats_alignRes;
    }


    /**
     * Sets the alignStats_alignRes value for this AlignStatsType.
     * 
     * @param alignStats_alignRes
     */
    public void setAlignStats_alignRes(java.lang.String alignStats_alignRes) {
        this.alignStats_alignRes = alignStats_alignRes;
    }


    /**
     * Gets the alignStats_rmsd value for this AlignStatsType.
     * 
     * @return alignStats_rmsd
     */
    public java.lang.String getAlignStats_rmsd() {
        return alignStats_rmsd;
    }


    /**
     * Sets the alignStats_rmsd value for this AlignStatsType.
     * 
     * @param alignStats_rmsd
     */
    public void setAlignStats_rmsd(java.lang.String alignStats_rmsd) {
        this.alignStats_rmsd = alignStats_rmsd;
    }


    /**
     * Gets the alignStats_blastScore value for this AlignStatsType.
     * 
     * @return alignStats_blastScore
     */
    public java.lang.String getAlignStats_blastScore() {
        return alignStats_blastScore;
    }


    /**
     * Sets the alignStats_blastScore value for this AlignStatsType.
     * 
     * @param alignStats_blastScore
     */
    public void setAlignStats_blastScore(java.lang.String alignStats_blastScore) {
        this.alignStats_blastScore = alignStats_blastScore;
    }


    /**
     * Gets the alignStats_blastMlogp value for this AlignStatsType.
     * 
     * @return alignStats_blastMlogp
     */
    public java.lang.String getAlignStats_blastMlogp() {
        return alignStats_blastMlogp;
    }


    /**
     * Sets the alignStats_blastMlogp value for this AlignStatsType.
     * 
     * @param alignStats_blastMlogp
     */
    public void setAlignStats_blastMlogp(java.lang.String alignStats_blastMlogp) {
        this.alignStats_blastMlogp = alignStats_blastMlogp;
    }


    /**
     * Gets the alignStats_otherScore value for this AlignStatsType.
     * 
     * @return alignStats_otherScore
     */
    public java.lang.String getAlignStats_otherScore() {
        return alignStats_otherScore;
    }


    /**
     * Sets the alignStats_otherScore value for this AlignStatsType.
     * 
     * @param alignStats_otherScore
     */
    public void setAlignStats_otherScore(java.lang.String alignStats_otherScore) {
        this.alignStats_otherScore = alignStats_otherScore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlignStatsType)) return false;
        AlignStatsType other = (AlignStatsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alignStats_descr==null && other.getAlignStats_descr()==null) || 
             (this.alignStats_descr!=null &&
              this.alignStats_descr.equals(other.getAlignStats_descr()))) &&
            ((this.alignStats_scaleFactor==null && other.getAlignStats_scaleFactor()==null) || 
             (this.alignStats_scaleFactor!=null &&
              this.alignStats_scaleFactor.equals(other.getAlignStats_scaleFactor()))) &&
            ((this.alignStats_vastScore==null && other.getAlignStats_vastScore()==null) || 
             (this.alignStats_vastScore!=null &&
              this.alignStats_vastScore.equals(other.getAlignStats_vastScore()))) &&
            ((this.alignStats_vastMlogp==null && other.getAlignStats_vastMlogp()==null) || 
             (this.alignStats_vastMlogp!=null &&
              this.alignStats_vastMlogp.equals(other.getAlignStats_vastMlogp()))) &&
            ((this.alignStats_alignRes==null && other.getAlignStats_alignRes()==null) || 
             (this.alignStats_alignRes!=null &&
              this.alignStats_alignRes.equals(other.getAlignStats_alignRes()))) &&
            ((this.alignStats_rmsd==null && other.getAlignStats_rmsd()==null) || 
             (this.alignStats_rmsd!=null &&
              this.alignStats_rmsd.equals(other.getAlignStats_rmsd()))) &&
            ((this.alignStats_blastScore==null && other.getAlignStats_blastScore()==null) || 
             (this.alignStats_blastScore!=null &&
              this.alignStats_blastScore.equals(other.getAlignStats_blastScore()))) &&
            ((this.alignStats_blastMlogp==null && other.getAlignStats_blastMlogp()==null) || 
             (this.alignStats_blastMlogp!=null &&
              this.alignStats_blastMlogp.equals(other.getAlignStats_blastMlogp()))) &&
            ((this.alignStats_otherScore==null && other.getAlignStats_otherScore()==null) || 
             (this.alignStats_otherScore!=null &&
              this.alignStats_otherScore.equals(other.getAlignStats_otherScore())));
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
        if (getAlignStats_descr() != null) {
            _hashCode += getAlignStats_descr().hashCode();
        }
        if (getAlignStats_scaleFactor() != null) {
            _hashCode += getAlignStats_scaleFactor().hashCode();
        }
        if (getAlignStats_vastScore() != null) {
            _hashCode += getAlignStats_vastScore().hashCode();
        }
        if (getAlignStats_vastMlogp() != null) {
            _hashCode += getAlignStats_vastMlogp().hashCode();
        }
        if (getAlignStats_alignRes() != null) {
            _hashCode += getAlignStats_alignRes().hashCode();
        }
        if (getAlignStats_rmsd() != null) {
            _hashCode += getAlignStats_rmsd().hashCode();
        }
        if (getAlignStats_blastScore() != null) {
            _hashCode += getAlignStats_blastScore().hashCode();
        }
        if (getAlignStats_blastMlogp() != null) {
            _hashCode += getAlignStats_blastMlogp().hashCode();
        }
        if (getAlignStats_otherScore() != null) {
            _hashCode += getAlignStats_otherScore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlignStatsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-statsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignStats_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-stats_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignStats_scaleFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-stats_scale-factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignStats_vastScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-stats_vast-score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignStats_vastMlogp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-stats_vast-mlogp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignStats_alignRes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-stats_align-res"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignStats_rmsd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-stats_rmsd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignStats_blastScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-stats_blast-score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignStats_blastMlogp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-stats_blast-mlogp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignStats_otherScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-stats_other-score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
