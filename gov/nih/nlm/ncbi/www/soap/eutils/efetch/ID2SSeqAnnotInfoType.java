/**
 * ID2SSeqAnnotInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqAnnotInfoType  implements java.io.Serializable {
    private java.lang.String ID2SSeqAnnotInfo_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_align ID2SSeqAnnotInfo_align;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_graph ID2SSeqAnnotInfo_graph;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_featType ID2SSeqAnnotInfo_feat;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_seqLocType ID2SSeqAnnotInfo_seqLoc;

    public ID2SSeqAnnotInfoType() {
    }

    public ID2SSeqAnnotInfoType(
           java.lang.String ID2SSeqAnnotInfo_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_align ID2SSeqAnnotInfo_align,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_graph ID2SSeqAnnotInfo_graph,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_featType ID2SSeqAnnotInfo_feat,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_seqLocType ID2SSeqAnnotInfo_seqLoc) {
           this.ID2SSeqAnnotInfo_name = ID2SSeqAnnotInfo_name;
           this.ID2SSeqAnnotInfo_align = ID2SSeqAnnotInfo_align;
           this.ID2SSeqAnnotInfo_graph = ID2SSeqAnnotInfo_graph;
           this.ID2SSeqAnnotInfo_feat = ID2SSeqAnnotInfo_feat;
           this.ID2SSeqAnnotInfo_seqLoc = ID2SSeqAnnotInfo_seqLoc;
    }


    /**
     * Gets the ID2SSeqAnnotInfo_name value for this ID2SSeqAnnotInfoType.
     * 
     * @return ID2SSeqAnnotInfo_name
     */
    public java.lang.String getID2SSeqAnnotInfo_name() {
        return ID2SSeqAnnotInfo_name;
    }


    /**
     * Sets the ID2SSeqAnnotInfo_name value for this ID2SSeqAnnotInfoType.
     * 
     * @param ID2SSeqAnnotInfo_name
     */
    public void setID2SSeqAnnotInfo_name(java.lang.String ID2SSeqAnnotInfo_name) {
        this.ID2SSeqAnnotInfo_name = ID2SSeqAnnotInfo_name;
    }


    /**
     * Gets the ID2SSeqAnnotInfo_align value for this ID2SSeqAnnotInfoType.
     * 
     * @return ID2SSeqAnnotInfo_align
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_align getID2SSeqAnnotInfo_align() {
        return ID2SSeqAnnotInfo_align;
    }


    /**
     * Sets the ID2SSeqAnnotInfo_align value for this ID2SSeqAnnotInfoType.
     * 
     * @param ID2SSeqAnnotInfo_align
     */
    public void setID2SSeqAnnotInfo_align(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_align ID2SSeqAnnotInfo_align) {
        this.ID2SSeqAnnotInfo_align = ID2SSeqAnnotInfo_align;
    }


    /**
     * Gets the ID2SSeqAnnotInfo_graph value for this ID2SSeqAnnotInfoType.
     * 
     * @return ID2SSeqAnnotInfo_graph
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_graph getID2SSeqAnnotInfo_graph() {
        return ID2SSeqAnnotInfo_graph;
    }


    /**
     * Sets the ID2SSeqAnnotInfo_graph value for this ID2SSeqAnnotInfoType.
     * 
     * @param ID2SSeqAnnotInfo_graph
     */
    public void setID2SSeqAnnotInfo_graph(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_graph ID2SSeqAnnotInfo_graph) {
        this.ID2SSeqAnnotInfo_graph = ID2SSeqAnnotInfo_graph;
    }


    /**
     * Gets the ID2SSeqAnnotInfo_feat value for this ID2SSeqAnnotInfoType.
     * 
     * @return ID2SSeqAnnotInfo_feat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_featType getID2SSeqAnnotInfo_feat() {
        return ID2SSeqAnnotInfo_feat;
    }


    /**
     * Sets the ID2SSeqAnnotInfo_feat value for this ID2SSeqAnnotInfoType.
     * 
     * @param ID2SSeqAnnotInfo_feat
     */
    public void setID2SSeqAnnotInfo_feat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_featType ID2SSeqAnnotInfo_feat) {
        this.ID2SSeqAnnotInfo_feat = ID2SSeqAnnotInfo_feat;
    }


    /**
     * Gets the ID2SSeqAnnotInfo_seqLoc value for this ID2SSeqAnnotInfoType.
     * 
     * @return ID2SSeqAnnotInfo_seqLoc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_seqLocType getID2SSeqAnnotInfo_seqLoc() {
        return ID2SSeqAnnotInfo_seqLoc;
    }


    /**
     * Sets the ID2SSeqAnnotInfo_seqLoc value for this ID2SSeqAnnotInfoType.
     * 
     * @param ID2SSeqAnnotInfo_seqLoc
     */
    public void setID2SSeqAnnotInfo_seqLoc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfo_seqLocType ID2SSeqAnnotInfo_seqLoc) {
        this.ID2SSeqAnnotInfo_seqLoc = ID2SSeqAnnotInfo_seqLoc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqAnnotInfoType)) return false;
        ID2SSeqAnnotInfoType other = (ID2SSeqAnnotInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqAnnotInfo_name==null && other.getID2SSeqAnnotInfo_name()==null) || 
             (this.ID2SSeqAnnotInfo_name!=null &&
              this.ID2SSeqAnnotInfo_name.equals(other.getID2SSeqAnnotInfo_name()))) &&
            ((this.ID2SSeqAnnotInfo_align==null && other.getID2SSeqAnnotInfo_align()==null) || 
             (this.ID2SSeqAnnotInfo_align!=null &&
              this.ID2SSeqAnnotInfo_align.equals(other.getID2SSeqAnnotInfo_align()))) &&
            ((this.ID2SSeqAnnotInfo_graph==null && other.getID2SSeqAnnotInfo_graph()==null) || 
             (this.ID2SSeqAnnotInfo_graph!=null &&
              this.ID2SSeqAnnotInfo_graph.equals(other.getID2SSeqAnnotInfo_graph()))) &&
            ((this.ID2SSeqAnnotInfo_feat==null && other.getID2SSeqAnnotInfo_feat()==null) || 
             (this.ID2SSeqAnnotInfo_feat!=null &&
              this.ID2SSeqAnnotInfo_feat.equals(other.getID2SSeqAnnotInfo_feat()))) &&
            ((this.ID2SSeqAnnotInfo_seqLoc==null && other.getID2SSeqAnnotInfo_seqLoc()==null) || 
             (this.ID2SSeqAnnotInfo_seqLoc!=null &&
              this.ID2SSeqAnnotInfo_seqLoc.equals(other.getID2SSeqAnnotInfo_seqLoc())));
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
        if (getID2SSeqAnnotInfo_name() != null) {
            _hashCode += getID2SSeqAnnotInfo_name().hashCode();
        }
        if (getID2SSeqAnnotInfo_align() != null) {
            _hashCode += getID2SSeqAnnotInfo_align().hashCode();
        }
        if (getID2SSeqAnnotInfo_graph() != null) {
            _hashCode += getID2SSeqAnnotInfo_graph().hashCode();
        }
        if (getID2SSeqAnnotInfo_feat() != null) {
            _hashCode += getID2SSeqAnnotInfo_feat().hashCode();
        }
        if (getID2SSeqAnnotInfo_seqLoc() != null) {
            _hashCode += getID2SSeqAnnotInfo_seqLoc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSeqAnnotInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-InfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqAnnotInfo_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-Info_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqAnnotInfo_align");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-Info_align"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2S-Seq-annot-Info_align"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqAnnotInfo_graph");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-Info_graph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2S-Seq-annot-Info_graph"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqAnnotInfo_feat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-Info_feat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-Info_featType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqAnnotInfo_seqLoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-Info_seq-loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-Info_seq-locType"));
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
