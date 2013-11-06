/**
 * ID2SSeqAnnotPlaceInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqAnnotPlaceInfoType  implements java.io.Serializable {
    private java.lang.String ID2SSeqAnnotPlaceInfo_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotPlaceInfo_bioseqsType ID2SSeqAnnotPlaceInfo_bioseqs;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotPlaceInfo_bioseqSetsType ID2SSeqAnnotPlaceInfo_bioseqSets;

    public ID2SSeqAnnotPlaceInfoType() {
    }

    public ID2SSeqAnnotPlaceInfoType(
           java.lang.String ID2SSeqAnnotPlaceInfo_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotPlaceInfo_bioseqsType ID2SSeqAnnotPlaceInfo_bioseqs,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotPlaceInfo_bioseqSetsType ID2SSeqAnnotPlaceInfo_bioseqSets) {
           this.ID2SSeqAnnotPlaceInfo_name = ID2SSeqAnnotPlaceInfo_name;
           this.ID2SSeqAnnotPlaceInfo_bioseqs = ID2SSeqAnnotPlaceInfo_bioseqs;
           this.ID2SSeqAnnotPlaceInfo_bioseqSets = ID2SSeqAnnotPlaceInfo_bioseqSets;
    }


    /**
     * Gets the ID2SSeqAnnotPlaceInfo_name value for this ID2SSeqAnnotPlaceInfoType.
     * 
     * @return ID2SSeqAnnotPlaceInfo_name
     */
    public java.lang.String getID2SSeqAnnotPlaceInfo_name() {
        return ID2SSeqAnnotPlaceInfo_name;
    }


    /**
     * Sets the ID2SSeqAnnotPlaceInfo_name value for this ID2SSeqAnnotPlaceInfoType.
     * 
     * @param ID2SSeqAnnotPlaceInfo_name
     */
    public void setID2SSeqAnnotPlaceInfo_name(java.lang.String ID2SSeqAnnotPlaceInfo_name) {
        this.ID2SSeqAnnotPlaceInfo_name = ID2SSeqAnnotPlaceInfo_name;
    }


    /**
     * Gets the ID2SSeqAnnotPlaceInfo_bioseqs value for this ID2SSeqAnnotPlaceInfoType.
     * 
     * @return ID2SSeqAnnotPlaceInfo_bioseqs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotPlaceInfo_bioseqsType getID2SSeqAnnotPlaceInfo_bioseqs() {
        return ID2SSeqAnnotPlaceInfo_bioseqs;
    }


    /**
     * Sets the ID2SSeqAnnotPlaceInfo_bioseqs value for this ID2SSeqAnnotPlaceInfoType.
     * 
     * @param ID2SSeqAnnotPlaceInfo_bioseqs
     */
    public void setID2SSeqAnnotPlaceInfo_bioseqs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotPlaceInfo_bioseqsType ID2SSeqAnnotPlaceInfo_bioseqs) {
        this.ID2SSeqAnnotPlaceInfo_bioseqs = ID2SSeqAnnotPlaceInfo_bioseqs;
    }


    /**
     * Gets the ID2SSeqAnnotPlaceInfo_bioseqSets value for this ID2SSeqAnnotPlaceInfoType.
     * 
     * @return ID2SSeqAnnotPlaceInfo_bioseqSets
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotPlaceInfo_bioseqSetsType getID2SSeqAnnotPlaceInfo_bioseqSets() {
        return ID2SSeqAnnotPlaceInfo_bioseqSets;
    }


    /**
     * Sets the ID2SSeqAnnotPlaceInfo_bioseqSets value for this ID2SSeqAnnotPlaceInfoType.
     * 
     * @param ID2SSeqAnnotPlaceInfo_bioseqSets
     */
    public void setID2SSeqAnnotPlaceInfo_bioseqSets(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotPlaceInfo_bioseqSetsType ID2SSeqAnnotPlaceInfo_bioseqSets) {
        this.ID2SSeqAnnotPlaceInfo_bioseqSets = ID2SSeqAnnotPlaceInfo_bioseqSets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqAnnotPlaceInfoType)) return false;
        ID2SSeqAnnotPlaceInfoType other = (ID2SSeqAnnotPlaceInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqAnnotPlaceInfo_name==null && other.getID2SSeqAnnotPlaceInfo_name()==null) || 
             (this.ID2SSeqAnnotPlaceInfo_name!=null &&
              this.ID2SSeqAnnotPlaceInfo_name.equals(other.getID2SSeqAnnotPlaceInfo_name()))) &&
            ((this.ID2SSeqAnnotPlaceInfo_bioseqs==null && other.getID2SSeqAnnotPlaceInfo_bioseqs()==null) || 
             (this.ID2SSeqAnnotPlaceInfo_bioseqs!=null &&
              this.ID2SSeqAnnotPlaceInfo_bioseqs.equals(other.getID2SSeqAnnotPlaceInfo_bioseqs()))) &&
            ((this.ID2SSeqAnnotPlaceInfo_bioseqSets==null && other.getID2SSeqAnnotPlaceInfo_bioseqSets()==null) || 
             (this.ID2SSeqAnnotPlaceInfo_bioseqSets!=null &&
              this.ID2SSeqAnnotPlaceInfo_bioseqSets.equals(other.getID2SSeqAnnotPlaceInfo_bioseqSets())));
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
        if (getID2SSeqAnnotPlaceInfo_name() != null) {
            _hashCode += getID2SSeqAnnotPlaceInfo_name().hashCode();
        }
        if (getID2SSeqAnnotPlaceInfo_bioseqs() != null) {
            _hashCode += getID2SSeqAnnotPlaceInfo_bioseqs().hashCode();
        }
        if (getID2SSeqAnnotPlaceInfo_bioseqSets() != null) {
            _hashCode += getID2SSeqAnnotPlaceInfo_bioseqSets().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSeqAnnotPlaceInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-place-InfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqAnnotPlaceInfo_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-place-Info_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqAnnotPlaceInfo_bioseqs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-place-Info_bioseqs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-place-Info_bioseqsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqAnnotPlaceInfo_bioseqSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-place-Info_bioseq-sets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-place-Info_bioseq-setsType"));
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
