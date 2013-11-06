/**
 * IterationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class IterationType  implements java.io.Serializable {
    private java.lang.String iteration_iterNum;

    private java.lang.String iteration_queryID;

    private java.lang.String iteration_queryDef;

    private java.lang.String iteration_queryLen;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Iteration_hitsType iteration_hits;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Iteration_statType iteration_stat;

    private java.lang.String iteration_message;

    public IterationType() {
    }

    public IterationType(
           java.lang.String iteration_iterNum,
           java.lang.String iteration_queryID,
           java.lang.String iteration_queryDef,
           java.lang.String iteration_queryLen,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Iteration_hitsType iteration_hits,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Iteration_statType iteration_stat,
           java.lang.String iteration_message) {
           this.iteration_iterNum = iteration_iterNum;
           this.iteration_queryID = iteration_queryID;
           this.iteration_queryDef = iteration_queryDef;
           this.iteration_queryLen = iteration_queryLen;
           this.iteration_hits = iteration_hits;
           this.iteration_stat = iteration_stat;
           this.iteration_message = iteration_message;
    }


    /**
     * Gets the iteration_iterNum value for this IterationType.
     * 
     * @return iteration_iterNum
     */
    public java.lang.String getIteration_iterNum() {
        return iteration_iterNum;
    }


    /**
     * Sets the iteration_iterNum value for this IterationType.
     * 
     * @param iteration_iterNum
     */
    public void setIteration_iterNum(java.lang.String iteration_iterNum) {
        this.iteration_iterNum = iteration_iterNum;
    }


    /**
     * Gets the iteration_queryID value for this IterationType.
     * 
     * @return iteration_queryID
     */
    public java.lang.String getIteration_queryID() {
        return iteration_queryID;
    }


    /**
     * Sets the iteration_queryID value for this IterationType.
     * 
     * @param iteration_queryID
     */
    public void setIteration_queryID(java.lang.String iteration_queryID) {
        this.iteration_queryID = iteration_queryID;
    }


    /**
     * Gets the iteration_queryDef value for this IterationType.
     * 
     * @return iteration_queryDef
     */
    public java.lang.String getIteration_queryDef() {
        return iteration_queryDef;
    }


    /**
     * Sets the iteration_queryDef value for this IterationType.
     * 
     * @param iteration_queryDef
     */
    public void setIteration_queryDef(java.lang.String iteration_queryDef) {
        this.iteration_queryDef = iteration_queryDef;
    }


    /**
     * Gets the iteration_queryLen value for this IterationType.
     * 
     * @return iteration_queryLen
     */
    public java.lang.String getIteration_queryLen() {
        return iteration_queryLen;
    }


    /**
     * Sets the iteration_queryLen value for this IterationType.
     * 
     * @param iteration_queryLen
     */
    public void setIteration_queryLen(java.lang.String iteration_queryLen) {
        this.iteration_queryLen = iteration_queryLen;
    }


    /**
     * Gets the iteration_hits value for this IterationType.
     * 
     * @return iteration_hits
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Iteration_hitsType getIteration_hits() {
        return iteration_hits;
    }


    /**
     * Sets the iteration_hits value for this IterationType.
     * 
     * @param iteration_hits
     */
    public void setIteration_hits(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Iteration_hitsType iteration_hits) {
        this.iteration_hits = iteration_hits;
    }


    /**
     * Gets the iteration_stat value for this IterationType.
     * 
     * @return iteration_stat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Iteration_statType getIteration_stat() {
        return iteration_stat;
    }


    /**
     * Sets the iteration_stat value for this IterationType.
     * 
     * @param iteration_stat
     */
    public void setIteration_stat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Iteration_statType iteration_stat) {
        this.iteration_stat = iteration_stat;
    }


    /**
     * Gets the iteration_message value for this IterationType.
     * 
     * @return iteration_message
     */
    public java.lang.String getIteration_message() {
        return iteration_message;
    }


    /**
     * Sets the iteration_message value for this IterationType.
     * 
     * @param iteration_message
     */
    public void setIteration_message(java.lang.String iteration_message) {
        this.iteration_message = iteration_message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IterationType)) return false;
        IterationType other = (IterationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.iteration_iterNum==null && other.getIteration_iterNum()==null) || 
             (this.iteration_iterNum!=null &&
              this.iteration_iterNum.equals(other.getIteration_iterNum()))) &&
            ((this.iteration_queryID==null && other.getIteration_queryID()==null) || 
             (this.iteration_queryID!=null &&
              this.iteration_queryID.equals(other.getIteration_queryID()))) &&
            ((this.iteration_queryDef==null && other.getIteration_queryDef()==null) || 
             (this.iteration_queryDef!=null &&
              this.iteration_queryDef.equals(other.getIteration_queryDef()))) &&
            ((this.iteration_queryLen==null && other.getIteration_queryLen()==null) || 
             (this.iteration_queryLen!=null &&
              this.iteration_queryLen.equals(other.getIteration_queryLen()))) &&
            ((this.iteration_hits==null && other.getIteration_hits()==null) || 
             (this.iteration_hits!=null &&
              this.iteration_hits.equals(other.getIteration_hits()))) &&
            ((this.iteration_stat==null && other.getIteration_stat()==null) || 
             (this.iteration_stat!=null &&
              this.iteration_stat.equals(other.getIteration_stat()))) &&
            ((this.iteration_message==null && other.getIteration_message()==null) || 
             (this.iteration_message!=null &&
              this.iteration_message.equals(other.getIteration_message())));
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
        if (getIteration_iterNum() != null) {
            _hashCode += getIteration_iterNum().hashCode();
        }
        if (getIteration_queryID() != null) {
            _hashCode += getIteration_queryID().hashCode();
        }
        if (getIteration_queryDef() != null) {
            _hashCode += getIteration_queryDef().hashCode();
        }
        if (getIteration_queryLen() != null) {
            _hashCode += getIteration_queryLen().hashCode();
        }
        if (getIteration_hits() != null) {
            _hashCode += getIteration_hits().hashCode();
        }
        if (getIteration_stat() != null) {
            _hashCode += getIteration_stat().hashCode();
        }
        if (getIteration_message() != null) {
            _hashCode += getIteration_message().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IterationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "IterationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration_iterNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Iteration_iter-num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration_queryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Iteration_query-ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration_queryDef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Iteration_query-def"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration_queryLen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Iteration_query-len"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration_hits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Iteration_hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Iteration_hitsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration_stat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Iteration_stat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Iteration_statType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration_message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Iteration_message"));
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
