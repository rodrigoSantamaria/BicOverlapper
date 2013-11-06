/**
 * ID2SSplitInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSplitInfo  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSplitInfo_bioseqsInfoType ID2SSplitInfo_bioseqsInfo;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSplitInfo_chunksType ID2SSplitInfo_chunks;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSplitInfo_skeletonType ID2SSplitInfo_skeleton;

    public ID2SSplitInfo() {
    }

    public ID2SSplitInfo(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSplitInfo_bioseqsInfoType ID2SSplitInfo_bioseqsInfo,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSplitInfo_chunksType ID2SSplitInfo_chunks,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSplitInfo_skeletonType ID2SSplitInfo_skeleton) {
           this.ID2SSplitInfo_bioseqsInfo = ID2SSplitInfo_bioseqsInfo;
           this.ID2SSplitInfo_chunks = ID2SSplitInfo_chunks;
           this.ID2SSplitInfo_skeleton = ID2SSplitInfo_skeleton;
    }


    /**
     * Gets the ID2SSplitInfo_bioseqsInfo value for this ID2SSplitInfo.
     * 
     * @return ID2SSplitInfo_bioseqsInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSplitInfo_bioseqsInfoType getID2SSplitInfo_bioseqsInfo() {
        return ID2SSplitInfo_bioseqsInfo;
    }


    /**
     * Sets the ID2SSplitInfo_bioseqsInfo value for this ID2SSplitInfo.
     * 
     * @param ID2SSplitInfo_bioseqsInfo
     */
    public void setID2SSplitInfo_bioseqsInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSplitInfo_bioseqsInfoType ID2SSplitInfo_bioseqsInfo) {
        this.ID2SSplitInfo_bioseqsInfo = ID2SSplitInfo_bioseqsInfo;
    }


    /**
     * Gets the ID2SSplitInfo_chunks value for this ID2SSplitInfo.
     * 
     * @return ID2SSplitInfo_chunks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSplitInfo_chunksType getID2SSplitInfo_chunks() {
        return ID2SSplitInfo_chunks;
    }


    /**
     * Sets the ID2SSplitInfo_chunks value for this ID2SSplitInfo.
     * 
     * @param ID2SSplitInfo_chunks
     */
    public void setID2SSplitInfo_chunks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSplitInfo_chunksType ID2SSplitInfo_chunks) {
        this.ID2SSplitInfo_chunks = ID2SSplitInfo_chunks;
    }


    /**
     * Gets the ID2SSplitInfo_skeleton value for this ID2SSplitInfo.
     * 
     * @return ID2SSplitInfo_skeleton
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSplitInfo_skeletonType getID2SSplitInfo_skeleton() {
        return ID2SSplitInfo_skeleton;
    }


    /**
     * Sets the ID2SSplitInfo_skeleton value for this ID2SSplitInfo.
     * 
     * @param ID2SSplitInfo_skeleton
     */
    public void setID2SSplitInfo_skeleton(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSplitInfo_skeletonType ID2SSplitInfo_skeleton) {
        this.ID2SSplitInfo_skeleton = ID2SSplitInfo_skeleton;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSplitInfo)) return false;
        ID2SSplitInfo other = (ID2SSplitInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSplitInfo_bioseqsInfo==null && other.getID2SSplitInfo_bioseqsInfo()==null) || 
             (this.ID2SSplitInfo_bioseqsInfo!=null &&
              this.ID2SSplitInfo_bioseqsInfo.equals(other.getID2SSplitInfo_bioseqsInfo()))) &&
            ((this.ID2SSplitInfo_chunks==null && other.getID2SSplitInfo_chunks()==null) || 
             (this.ID2SSplitInfo_chunks!=null &&
              this.ID2SSplitInfo_chunks.equals(other.getID2SSplitInfo_chunks()))) &&
            ((this.ID2SSplitInfo_skeleton==null && other.getID2SSplitInfo_skeleton()==null) || 
             (this.ID2SSplitInfo_skeleton!=null &&
              this.ID2SSplitInfo_skeleton.equals(other.getID2SSplitInfo_skeleton())));
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
        if (getID2SSplitInfo_bioseqsInfo() != null) {
            _hashCode += getID2SSplitInfo_bioseqsInfo().hashCode();
        }
        if (getID2SSplitInfo_chunks() != null) {
            _hashCode += getID2SSplitInfo_chunks().hashCode();
        }
        if (getID2SSplitInfo_skeleton() != null) {
            _hashCode += getID2SSplitInfo_skeleton().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSplitInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2S-Split-Info"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSplitInfo_bioseqsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Split-Info_bioseqs-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Split-Info_bioseqs-infoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSplitInfo_chunks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Split-Info_chunks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Split-Info_chunksType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSplitInfo_skeleton");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Split-Info_skeleton"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Split-Info_skeletonType"));
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
