/**
 * SeqAnnotType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqAnnotType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_idType seqAnnot_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_dbType seqAnnot_db;

    private java.lang.String seqAnnot_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_descType seqAnnot_desc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_dataType seqAnnot_data;

    public SeqAnnotType() {
    }

    public SeqAnnotType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_idType seqAnnot_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_dbType seqAnnot_db,
           java.lang.String seqAnnot_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_descType seqAnnot_desc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_dataType seqAnnot_data) {
           this.seqAnnot_id = seqAnnot_id;
           this.seqAnnot_db = seqAnnot_db;
           this.seqAnnot_name = seqAnnot_name;
           this.seqAnnot_desc = seqAnnot_desc;
           this.seqAnnot_data = seqAnnot_data;
    }


    /**
     * Gets the seqAnnot_id value for this SeqAnnotType.
     * 
     * @return seqAnnot_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_idType getSeqAnnot_id() {
        return seqAnnot_id;
    }


    /**
     * Sets the seqAnnot_id value for this SeqAnnotType.
     * 
     * @param seqAnnot_id
     */
    public void setSeqAnnot_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_idType seqAnnot_id) {
        this.seqAnnot_id = seqAnnot_id;
    }


    /**
     * Gets the seqAnnot_db value for this SeqAnnotType.
     * 
     * @return seqAnnot_db
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_dbType getSeqAnnot_db() {
        return seqAnnot_db;
    }


    /**
     * Sets the seqAnnot_db value for this SeqAnnotType.
     * 
     * @param seqAnnot_db
     */
    public void setSeqAnnot_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_dbType seqAnnot_db) {
        this.seqAnnot_db = seqAnnot_db;
    }


    /**
     * Gets the seqAnnot_name value for this SeqAnnotType.
     * 
     * @return seqAnnot_name
     */
    public java.lang.String getSeqAnnot_name() {
        return seqAnnot_name;
    }


    /**
     * Sets the seqAnnot_name value for this SeqAnnotType.
     * 
     * @param seqAnnot_name
     */
    public void setSeqAnnot_name(java.lang.String seqAnnot_name) {
        this.seqAnnot_name = seqAnnot_name;
    }


    /**
     * Gets the seqAnnot_desc value for this SeqAnnotType.
     * 
     * @return seqAnnot_desc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_descType getSeqAnnot_desc() {
        return seqAnnot_desc;
    }


    /**
     * Sets the seqAnnot_desc value for this SeqAnnotType.
     * 
     * @param seqAnnot_desc
     */
    public void setSeqAnnot_desc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_descType seqAnnot_desc) {
        this.seqAnnot_desc = seqAnnot_desc;
    }


    /**
     * Gets the seqAnnot_data value for this SeqAnnotType.
     * 
     * @return seqAnnot_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_dataType getSeqAnnot_data() {
        return seqAnnot_data;
    }


    /**
     * Sets the seqAnnot_data value for this SeqAnnotType.
     * 
     * @param seqAnnot_data
     */
    public void setSeqAnnot_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnot_dataType seqAnnot_data) {
        this.seqAnnot_data = seqAnnot_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqAnnotType)) return false;
        SeqAnnotType other = (SeqAnnotType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqAnnot_id==null && other.getSeqAnnot_id()==null) || 
             (this.seqAnnot_id!=null &&
              this.seqAnnot_id.equals(other.getSeqAnnot_id()))) &&
            ((this.seqAnnot_db==null && other.getSeqAnnot_db()==null) || 
             (this.seqAnnot_db!=null &&
              this.seqAnnot_db.equals(other.getSeqAnnot_db()))) &&
            ((this.seqAnnot_name==null && other.getSeqAnnot_name()==null) || 
             (this.seqAnnot_name!=null &&
              this.seqAnnot_name.equals(other.getSeqAnnot_name()))) &&
            ((this.seqAnnot_desc==null && other.getSeqAnnot_desc()==null) || 
             (this.seqAnnot_desc!=null &&
              this.seqAnnot_desc.equals(other.getSeqAnnot_desc()))) &&
            ((this.seqAnnot_data==null && other.getSeqAnnot_data()==null) || 
             (this.seqAnnot_data!=null &&
              this.seqAnnot_data.equals(other.getSeqAnnot_data())));
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
        if (getSeqAnnot_id() != null) {
            _hashCode += getSeqAnnot_id().hashCode();
        }
        if (getSeqAnnot_db() != null) {
            _hashCode += getSeqAnnot_db().hashCode();
        }
        if (getSeqAnnot_name() != null) {
            _hashCode += getSeqAnnot_name().hashCode();
        }
        if (getSeqAnnot_desc() != null) {
            _hashCode += getSeqAnnot_desc().hashCode();
        }
        if (getSeqAnnot_data() != null) {
            _hashCode += getSeqAnnot_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqAnnotType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annotType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAnnot_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAnnot_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_dbType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAnnot_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAnnot_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_descType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAnnot_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_dataType"));
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
