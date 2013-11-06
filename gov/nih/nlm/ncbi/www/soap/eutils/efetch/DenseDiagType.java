/**
 * DenseDiagType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DenseDiagType  implements java.io.Serializable {
    private java.lang.String denseDiag_dim;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_idsType denseDiag_ids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_startsType denseDiag_starts;

    private java.lang.String denseDiag_len;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_strandsType denseDiag_strands;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_scoresType denseDiag_scores;

    public DenseDiagType() {
    }

    public DenseDiagType(
           java.lang.String denseDiag_dim,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_idsType denseDiag_ids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_startsType denseDiag_starts,
           java.lang.String denseDiag_len,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_strandsType denseDiag_strands,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_scoresType denseDiag_scores) {
           this.denseDiag_dim = denseDiag_dim;
           this.denseDiag_ids = denseDiag_ids;
           this.denseDiag_starts = denseDiag_starts;
           this.denseDiag_len = denseDiag_len;
           this.denseDiag_strands = denseDiag_strands;
           this.denseDiag_scores = denseDiag_scores;
    }


    /**
     * Gets the denseDiag_dim value for this DenseDiagType.
     * 
     * @return denseDiag_dim
     */
    public java.lang.String getDenseDiag_dim() {
        return denseDiag_dim;
    }


    /**
     * Sets the denseDiag_dim value for this DenseDiagType.
     * 
     * @param denseDiag_dim
     */
    public void setDenseDiag_dim(java.lang.String denseDiag_dim) {
        this.denseDiag_dim = denseDiag_dim;
    }


    /**
     * Gets the denseDiag_ids value for this DenseDiagType.
     * 
     * @return denseDiag_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_idsType getDenseDiag_ids() {
        return denseDiag_ids;
    }


    /**
     * Sets the denseDiag_ids value for this DenseDiagType.
     * 
     * @param denseDiag_ids
     */
    public void setDenseDiag_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_idsType denseDiag_ids) {
        this.denseDiag_ids = denseDiag_ids;
    }


    /**
     * Gets the denseDiag_starts value for this DenseDiagType.
     * 
     * @return denseDiag_starts
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_startsType getDenseDiag_starts() {
        return denseDiag_starts;
    }


    /**
     * Sets the denseDiag_starts value for this DenseDiagType.
     * 
     * @param denseDiag_starts
     */
    public void setDenseDiag_starts(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_startsType denseDiag_starts) {
        this.denseDiag_starts = denseDiag_starts;
    }


    /**
     * Gets the denseDiag_len value for this DenseDiagType.
     * 
     * @return denseDiag_len
     */
    public java.lang.String getDenseDiag_len() {
        return denseDiag_len;
    }


    /**
     * Sets the denseDiag_len value for this DenseDiagType.
     * 
     * @param denseDiag_len
     */
    public void setDenseDiag_len(java.lang.String denseDiag_len) {
        this.denseDiag_len = denseDiag_len;
    }


    /**
     * Gets the denseDiag_strands value for this DenseDiagType.
     * 
     * @return denseDiag_strands
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_strandsType getDenseDiag_strands() {
        return denseDiag_strands;
    }


    /**
     * Sets the denseDiag_strands value for this DenseDiagType.
     * 
     * @param denseDiag_strands
     */
    public void setDenseDiag_strands(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_strandsType denseDiag_strands) {
        this.denseDiag_strands = denseDiag_strands;
    }


    /**
     * Gets the denseDiag_scores value for this DenseDiagType.
     * 
     * @return denseDiag_scores
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_scoresType getDenseDiag_scores() {
        return denseDiag_scores;
    }


    /**
     * Sets the denseDiag_scores value for this DenseDiagType.
     * 
     * @param denseDiag_scores
     */
    public void setDenseDiag_scores(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DenseDiag_scoresType denseDiag_scores) {
        this.denseDiag_scores = denseDiag_scores;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DenseDiagType)) return false;
        DenseDiagType other = (DenseDiagType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.denseDiag_dim==null && other.getDenseDiag_dim()==null) || 
             (this.denseDiag_dim!=null &&
              this.denseDiag_dim.equals(other.getDenseDiag_dim()))) &&
            ((this.denseDiag_ids==null && other.getDenseDiag_ids()==null) || 
             (this.denseDiag_ids!=null &&
              this.denseDiag_ids.equals(other.getDenseDiag_ids()))) &&
            ((this.denseDiag_starts==null && other.getDenseDiag_starts()==null) || 
             (this.denseDiag_starts!=null &&
              this.denseDiag_starts.equals(other.getDenseDiag_starts()))) &&
            ((this.denseDiag_len==null && other.getDenseDiag_len()==null) || 
             (this.denseDiag_len!=null &&
              this.denseDiag_len.equals(other.getDenseDiag_len()))) &&
            ((this.denseDiag_strands==null && other.getDenseDiag_strands()==null) || 
             (this.denseDiag_strands!=null &&
              this.denseDiag_strands.equals(other.getDenseDiag_strands()))) &&
            ((this.denseDiag_scores==null && other.getDenseDiag_scores()==null) || 
             (this.denseDiag_scores!=null &&
              this.denseDiag_scores.equals(other.getDenseDiag_scores())));
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
        if (getDenseDiag_dim() != null) {
            _hashCode += getDenseDiag_dim().hashCode();
        }
        if (getDenseDiag_ids() != null) {
            _hashCode += getDenseDiag_ids().hashCode();
        }
        if (getDenseDiag_starts() != null) {
            _hashCode += getDenseDiag_starts().hashCode();
        }
        if (getDenseDiag_len() != null) {
            _hashCode += getDenseDiag_len().hashCode();
        }
        if (getDenseDiag_strands() != null) {
            _hashCode += getDenseDiag_strands().hashCode();
        }
        if (getDenseDiag_scores() != null) {
            _hashCode += getDenseDiag_scores().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DenseDiagType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diagType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseDiag_dim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag_dim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseDiag_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag_idsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseDiag_starts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag_starts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag_startsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseDiag_len");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag_len"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseDiag_strands");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag_strands"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag_strandsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseDiag_scores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag_scores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-diag_scoresType"));
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
