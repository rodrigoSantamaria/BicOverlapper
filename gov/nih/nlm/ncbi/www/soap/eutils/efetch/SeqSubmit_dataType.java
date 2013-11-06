/**
 * SeqSubmit_dataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqSubmit_dataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_data_entrysType seqSubmit_data_entrys;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_data_annotsType seqSubmit_data_annots;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_data_deleteType seqSubmit_data_delete;

    public SeqSubmit_dataType() {
    }

    public SeqSubmit_dataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_data_entrysType seqSubmit_data_entrys,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_data_annotsType seqSubmit_data_annots,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_data_deleteType seqSubmit_data_delete) {
           this.seqSubmit_data_entrys = seqSubmit_data_entrys;
           this.seqSubmit_data_annots = seqSubmit_data_annots;
           this.seqSubmit_data_delete = seqSubmit_data_delete;
    }


    /**
     * Gets the seqSubmit_data_entrys value for this SeqSubmit_dataType.
     * 
     * @return seqSubmit_data_entrys
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_data_entrysType getSeqSubmit_data_entrys() {
        return seqSubmit_data_entrys;
    }


    /**
     * Sets the seqSubmit_data_entrys value for this SeqSubmit_dataType.
     * 
     * @param seqSubmit_data_entrys
     */
    public void setSeqSubmit_data_entrys(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_data_entrysType seqSubmit_data_entrys) {
        this.seqSubmit_data_entrys = seqSubmit_data_entrys;
    }


    /**
     * Gets the seqSubmit_data_annots value for this SeqSubmit_dataType.
     * 
     * @return seqSubmit_data_annots
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_data_annotsType getSeqSubmit_data_annots() {
        return seqSubmit_data_annots;
    }


    /**
     * Sets the seqSubmit_data_annots value for this SeqSubmit_dataType.
     * 
     * @param seqSubmit_data_annots
     */
    public void setSeqSubmit_data_annots(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_data_annotsType seqSubmit_data_annots) {
        this.seqSubmit_data_annots = seqSubmit_data_annots;
    }


    /**
     * Gets the seqSubmit_data_delete value for this SeqSubmit_dataType.
     * 
     * @return seqSubmit_data_delete
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_data_deleteType getSeqSubmit_data_delete() {
        return seqSubmit_data_delete;
    }


    /**
     * Sets the seqSubmit_data_delete value for this SeqSubmit_dataType.
     * 
     * @param seqSubmit_data_delete
     */
    public void setSeqSubmit_data_delete(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqSubmit_data_deleteType seqSubmit_data_delete) {
        this.seqSubmit_data_delete = seqSubmit_data_delete;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqSubmit_dataType)) return false;
        SeqSubmit_dataType other = (SeqSubmit_dataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqSubmit_data_entrys==null && other.getSeqSubmit_data_entrys()==null) || 
             (this.seqSubmit_data_entrys!=null &&
              this.seqSubmit_data_entrys.equals(other.getSeqSubmit_data_entrys()))) &&
            ((this.seqSubmit_data_annots==null && other.getSeqSubmit_data_annots()==null) || 
             (this.seqSubmit_data_annots!=null &&
              this.seqSubmit_data_annots.equals(other.getSeqSubmit_data_annots()))) &&
            ((this.seqSubmit_data_delete==null && other.getSeqSubmit_data_delete()==null) || 
             (this.seqSubmit_data_delete!=null &&
              this.seqSubmit_data_delete.equals(other.getSeqSubmit_data_delete())));
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
        if (getSeqSubmit_data_entrys() != null) {
            _hashCode += getSeqSubmit_data_entrys().hashCode();
        }
        if (getSeqSubmit_data_annots() != null) {
            _hashCode += getSeqSubmit_data_annots().hashCode();
        }
        if (getSeqSubmit_data_delete() != null) {
            _hashCode += getSeqSubmit_data_delete().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqSubmit_dataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-submit_dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqSubmit_data_entrys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-submit_data_entrys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-submit_data_entrysType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqSubmit_data_annots");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-submit_data_annots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-submit_data_annotsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqSubmit_data_delete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-submit_data_delete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-submit_data_deleteType"));
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
