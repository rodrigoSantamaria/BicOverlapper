/**
 * ID2SSeqDescrInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqDescrInfoType  implements java.io.Serializable {
    private java.lang.String ID2SSeqDescrInfo_typeMask;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqDescrInfo_bioseqsType ID2SSeqDescrInfo_bioseqs;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqDescrInfo_bioseqSetsType ID2SSeqDescrInfo_bioseqSets;

    public ID2SSeqDescrInfoType() {
    }

    public ID2SSeqDescrInfoType(
           java.lang.String ID2SSeqDescrInfo_typeMask,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqDescrInfo_bioseqsType ID2SSeqDescrInfo_bioseqs,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqDescrInfo_bioseqSetsType ID2SSeqDescrInfo_bioseqSets) {
           this.ID2SSeqDescrInfo_typeMask = ID2SSeqDescrInfo_typeMask;
           this.ID2SSeqDescrInfo_bioseqs = ID2SSeqDescrInfo_bioseqs;
           this.ID2SSeqDescrInfo_bioseqSets = ID2SSeqDescrInfo_bioseqSets;
    }


    /**
     * Gets the ID2SSeqDescrInfo_typeMask value for this ID2SSeqDescrInfoType.
     * 
     * @return ID2SSeqDescrInfo_typeMask
     */
    public java.lang.String getID2SSeqDescrInfo_typeMask() {
        return ID2SSeqDescrInfo_typeMask;
    }


    /**
     * Sets the ID2SSeqDescrInfo_typeMask value for this ID2SSeqDescrInfoType.
     * 
     * @param ID2SSeqDescrInfo_typeMask
     */
    public void setID2SSeqDescrInfo_typeMask(java.lang.String ID2SSeqDescrInfo_typeMask) {
        this.ID2SSeqDescrInfo_typeMask = ID2SSeqDescrInfo_typeMask;
    }


    /**
     * Gets the ID2SSeqDescrInfo_bioseqs value for this ID2SSeqDescrInfoType.
     * 
     * @return ID2SSeqDescrInfo_bioseqs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqDescrInfo_bioseqsType getID2SSeqDescrInfo_bioseqs() {
        return ID2SSeqDescrInfo_bioseqs;
    }


    /**
     * Sets the ID2SSeqDescrInfo_bioseqs value for this ID2SSeqDescrInfoType.
     * 
     * @param ID2SSeqDescrInfo_bioseqs
     */
    public void setID2SSeqDescrInfo_bioseqs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqDescrInfo_bioseqsType ID2SSeqDescrInfo_bioseqs) {
        this.ID2SSeqDescrInfo_bioseqs = ID2SSeqDescrInfo_bioseqs;
    }


    /**
     * Gets the ID2SSeqDescrInfo_bioseqSets value for this ID2SSeqDescrInfoType.
     * 
     * @return ID2SSeqDescrInfo_bioseqSets
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqDescrInfo_bioseqSetsType getID2SSeqDescrInfo_bioseqSets() {
        return ID2SSeqDescrInfo_bioseqSets;
    }


    /**
     * Sets the ID2SSeqDescrInfo_bioseqSets value for this ID2SSeqDescrInfoType.
     * 
     * @param ID2SSeqDescrInfo_bioseqSets
     */
    public void setID2SSeqDescrInfo_bioseqSets(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqDescrInfo_bioseqSetsType ID2SSeqDescrInfo_bioseqSets) {
        this.ID2SSeqDescrInfo_bioseqSets = ID2SSeqDescrInfo_bioseqSets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqDescrInfoType)) return false;
        ID2SSeqDescrInfoType other = (ID2SSeqDescrInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqDescrInfo_typeMask==null && other.getID2SSeqDescrInfo_typeMask()==null) || 
             (this.ID2SSeqDescrInfo_typeMask!=null &&
              this.ID2SSeqDescrInfo_typeMask.equals(other.getID2SSeqDescrInfo_typeMask()))) &&
            ((this.ID2SSeqDescrInfo_bioseqs==null && other.getID2SSeqDescrInfo_bioseqs()==null) || 
             (this.ID2SSeqDescrInfo_bioseqs!=null &&
              this.ID2SSeqDescrInfo_bioseqs.equals(other.getID2SSeqDescrInfo_bioseqs()))) &&
            ((this.ID2SSeqDescrInfo_bioseqSets==null && other.getID2SSeqDescrInfo_bioseqSets()==null) || 
             (this.ID2SSeqDescrInfo_bioseqSets!=null &&
              this.ID2SSeqDescrInfo_bioseqSets.equals(other.getID2SSeqDescrInfo_bioseqSets())));
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
        if (getID2SSeqDescrInfo_typeMask() != null) {
            _hashCode += getID2SSeqDescrInfo_typeMask().hashCode();
        }
        if (getID2SSeqDescrInfo_bioseqs() != null) {
            _hashCode += getID2SSeqDescrInfo_bioseqs().hashCode();
        }
        if (getID2SSeqDescrInfo_bioseqSets() != null) {
            _hashCode += getID2SSeqDescrInfo_bioseqSets().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSeqDescrInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-descr-InfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqDescrInfo_typeMask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-descr-Info_type-mask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqDescrInfo_bioseqs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-descr-Info_bioseqs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-descr-Info_bioseqsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqDescrInfo_bioseqSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-descr-Info_bioseq-sets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-descr-Info_bioseq-setsType"));
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
