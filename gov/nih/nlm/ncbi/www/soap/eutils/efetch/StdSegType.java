/**
 * StdSegType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class StdSegType  implements java.io.Serializable {
    private java.lang.String stdSeg_dim;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSeg_idsType stdSeg_ids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSeg_locType stdSeg_loc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSeg_scoresType stdSeg_scores;

    public StdSegType() {
    }

    public StdSegType(
           java.lang.String stdSeg_dim,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSeg_idsType stdSeg_ids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSeg_locType stdSeg_loc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSeg_scoresType stdSeg_scores) {
           this.stdSeg_dim = stdSeg_dim;
           this.stdSeg_ids = stdSeg_ids;
           this.stdSeg_loc = stdSeg_loc;
           this.stdSeg_scores = stdSeg_scores;
    }


    /**
     * Gets the stdSeg_dim value for this StdSegType.
     * 
     * @return stdSeg_dim
     */
    public java.lang.String getStdSeg_dim() {
        return stdSeg_dim;
    }


    /**
     * Sets the stdSeg_dim value for this StdSegType.
     * 
     * @param stdSeg_dim
     */
    public void setStdSeg_dim(java.lang.String stdSeg_dim) {
        this.stdSeg_dim = stdSeg_dim;
    }


    /**
     * Gets the stdSeg_ids value for this StdSegType.
     * 
     * @return stdSeg_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSeg_idsType getStdSeg_ids() {
        return stdSeg_ids;
    }


    /**
     * Sets the stdSeg_ids value for this StdSegType.
     * 
     * @param stdSeg_ids
     */
    public void setStdSeg_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSeg_idsType stdSeg_ids) {
        this.stdSeg_ids = stdSeg_ids;
    }


    /**
     * Gets the stdSeg_loc value for this StdSegType.
     * 
     * @return stdSeg_loc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSeg_locType getStdSeg_loc() {
        return stdSeg_loc;
    }


    /**
     * Sets the stdSeg_loc value for this StdSegType.
     * 
     * @param stdSeg_loc
     */
    public void setStdSeg_loc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSeg_locType stdSeg_loc) {
        this.stdSeg_loc = stdSeg_loc;
    }


    /**
     * Gets the stdSeg_scores value for this StdSegType.
     * 
     * @return stdSeg_scores
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSeg_scoresType getStdSeg_scores() {
        return stdSeg_scores;
    }


    /**
     * Sets the stdSeg_scores value for this StdSegType.
     * 
     * @param stdSeg_scores
     */
    public void setStdSeg_scores(gov.nih.nlm.ncbi.www.soap.eutils.efetch.StdSeg_scoresType stdSeg_scores) {
        this.stdSeg_scores = stdSeg_scores;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StdSegType)) return false;
        StdSegType other = (StdSegType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stdSeg_dim==null && other.getStdSeg_dim()==null) || 
             (this.stdSeg_dim!=null &&
              this.stdSeg_dim.equals(other.getStdSeg_dim()))) &&
            ((this.stdSeg_ids==null && other.getStdSeg_ids()==null) || 
             (this.stdSeg_ids!=null &&
              this.stdSeg_ids.equals(other.getStdSeg_ids()))) &&
            ((this.stdSeg_loc==null && other.getStdSeg_loc()==null) || 
             (this.stdSeg_loc!=null &&
              this.stdSeg_loc.equals(other.getStdSeg_loc()))) &&
            ((this.stdSeg_scores==null && other.getStdSeg_scores()==null) || 
             (this.stdSeg_scores!=null &&
              this.stdSeg_scores.equals(other.getStdSeg_scores())));
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
        if (getStdSeg_dim() != null) {
            _hashCode += getStdSeg_dim().hashCode();
        }
        if (getStdSeg_ids() != null) {
            _hashCode += getStdSeg_ids().hashCode();
        }
        if (getStdSeg_loc() != null) {
            _hashCode += getStdSeg_loc().hashCode();
        }
        if (getStdSeg_scores() != null) {
            _hashCode += getStdSeg_scores().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StdSegType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Std-segType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stdSeg_dim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Std-seg_dim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stdSeg_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Std-seg_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Std-seg_idsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stdSeg_loc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Std-seg_loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Std-seg_locType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stdSeg_scores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Std-seg_scores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Std-seg_scoresType"));
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
