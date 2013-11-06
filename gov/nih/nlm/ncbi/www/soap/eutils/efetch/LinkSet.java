/**
 * LinkSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class LinkSet  implements java.io.Serializable {
    private java.lang.String linkSet_num;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.LinkSet_uidsType linkSet_uids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.LinkSet_weightsType linkSet_weights;

    public LinkSet() {
    }

    public LinkSet(
           java.lang.String linkSet_num,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.LinkSet_uidsType linkSet_uids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.LinkSet_weightsType linkSet_weights) {
           this.linkSet_num = linkSet_num;
           this.linkSet_uids = linkSet_uids;
           this.linkSet_weights = linkSet_weights;
    }


    /**
     * Gets the linkSet_num value for this LinkSet.
     * 
     * @return linkSet_num
     */
    public java.lang.String getLinkSet_num() {
        return linkSet_num;
    }


    /**
     * Sets the linkSet_num value for this LinkSet.
     * 
     * @param linkSet_num
     */
    public void setLinkSet_num(java.lang.String linkSet_num) {
        this.linkSet_num = linkSet_num;
    }


    /**
     * Gets the linkSet_uids value for this LinkSet.
     * 
     * @return linkSet_uids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.LinkSet_uidsType getLinkSet_uids() {
        return linkSet_uids;
    }


    /**
     * Sets the linkSet_uids value for this LinkSet.
     * 
     * @param linkSet_uids
     */
    public void setLinkSet_uids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.LinkSet_uidsType linkSet_uids) {
        this.linkSet_uids = linkSet_uids;
    }


    /**
     * Gets the linkSet_weights value for this LinkSet.
     * 
     * @return linkSet_weights
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.LinkSet_weightsType getLinkSet_weights() {
        return linkSet_weights;
    }


    /**
     * Sets the linkSet_weights value for this LinkSet.
     * 
     * @param linkSet_weights
     */
    public void setLinkSet_weights(gov.nih.nlm.ncbi.www.soap.eutils.efetch.LinkSet_weightsType linkSet_weights) {
        this.linkSet_weights = linkSet_weights;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkSet)) return false;
        LinkSet other = (LinkSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.linkSet_num==null && other.getLinkSet_num()==null) || 
             (this.linkSet_num!=null &&
              this.linkSet_num.equals(other.getLinkSet_num()))) &&
            ((this.linkSet_uids==null && other.getLinkSet_uids()==null) || 
             (this.linkSet_uids!=null &&
              this.linkSet_uids.equals(other.getLinkSet_uids()))) &&
            ((this.linkSet_weights==null && other.getLinkSet_weights()==null) || 
             (this.linkSet_weights!=null &&
              this.linkSet_weights.equals(other.getLinkSet_weights())));
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
        if (getLinkSet_num() != null) {
            _hashCode += getLinkSet_num().hashCode();
        }
        if (getLinkSet_uids() != null) {
            _hashCode += getLinkSet_uids().hashCode();
        }
        if (getLinkSet_weights() != null) {
            _hashCode += getLinkSet_weights().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LinkSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Link-set"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkSet_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Link-set_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkSet_uids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Link-set_uids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Link-set_uidsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkSet_weights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Link-set_weights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Link-set_weightsType"));
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
