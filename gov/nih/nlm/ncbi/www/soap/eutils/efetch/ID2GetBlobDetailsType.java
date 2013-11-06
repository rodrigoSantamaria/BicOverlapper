/**
 * ID2GetBlobDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2GetBlobDetailsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2GetBlobDetails_locationType ID2GetBlobDetails_location;

    private java.lang.String ID2GetBlobDetails_seqClassLevel;

    private java.lang.String ID2GetBlobDetails_descrLevel;

    private java.lang.String ID2GetBlobDetails_descrTypeMask;

    private java.lang.String ID2GetBlobDetails_annotTypeMask;

    private java.lang.String ID2GetBlobDetails_featTypeMask;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2GetBlobDetails_sequenceLevelType ID2GetBlobDetails_sequenceLevel;

    public ID2GetBlobDetailsType() {
    }

    public ID2GetBlobDetailsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2GetBlobDetails_locationType ID2GetBlobDetails_location,
           java.lang.String ID2GetBlobDetails_seqClassLevel,
           java.lang.String ID2GetBlobDetails_descrLevel,
           java.lang.String ID2GetBlobDetails_descrTypeMask,
           java.lang.String ID2GetBlobDetails_annotTypeMask,
           java.lang.String ID2GetBlobDetails_featTypeMask,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2GetBlobDetails_sequenceLevelType ID2GetBlobDetails_sequenceLevel) {
           this.ID2GetBlobDetails_location = ID2GetBlobDetails_location;
           this.ID2GetBlobDetails_seqClassLevel = ID2GetBlobDetails_seqClassLevel;
           this.ID2GetBlobDetails_descrLevel = ID2GetBlobDetails_descrLevel;
           this.ID2GetBlobDetails_descrTypeMask = ID2GetBlobDetails_descrTypeMask;
           this.ID2GetBlobDetails_annotTypeMask = ID2GetBlobDetails_annotTypeMask;
           this.ID2GetBlobDetails_featTypeMask = ID2GetBlobDetails_featTypeMask;
           this.ID2GetBlobDetails_sequenceLevel = ID2GetBlobDetails_sequenceLevel;
    }


    /**
     * Gets the ID2GetBlobDetails_location value for this ID2GetBlobDetailsType.
     * 
     * @return ID2GetBlobDetails_location
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2GetBlobDetails_locationType getID2GetBlobDetails_location() {
        return ID2GetBlobDetails_location;
    }


    /**
     * Sets the ID2GetBlobDetails_location value for this ID2GetBlobDetailsType.
     * 
     * @param ID2GetBlobDetails_location
     */
    public void setID2GetBlobDetails_location(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2GetBlobDetails_locationType ID2GetBlobDetails_location) {
        this.ID2GetBlobDetails_location = ID2GetBlobDetails_location;
    }


    /**
     * Gets the ID2GetBlobDetails_seqClassLevel value for this ID2GetBlobDetailsType.
     * 
     * @return ID2GetBlobDetails_seqClassLevel
     */
    public java.lang.String getID2GetBlobDetails_seqClassLevel() {
        return ID2GetBlobDetails_seqClassLevel;
    }


    /**
     * Sets the ID2GetBlobDetails_seqClassLevel value for this ID2GetBlobDetailsType.
     * 
     * @param ID2GetBlobDetails_seqClassLevel
     */
    public void setID2GetBlobDetails_seqClassLevel(java.lang.String ID2GetBlobDetails_seqClassLevel) {
        this.ID2GetBlobDetails_seqClassLevel = ID2GetBlobDetails_seqClassLevel;
    }


    /**
     * Gets the ID2GetBlobDetails_descrLevel value for this ID2GetBlobDetailsType.
     * 
     * @return ID2GetBlobDetails_descrLevel
     */
    public java.lang.String getID2GetBlobDetails_descrLevel() {
        return ID2GetBlobDetails_descrLevel;
    }


    /**
     * Sets the ID2GetBlobDetails_descrLevel value for this ID2GetBlobDetailsType.
     * 
     * @param ID2GetBlobDetails_descrLevel
     */
    public void setID2GetBlobDetails_descrLevel(java.lang.String ID2GetBlobDetails_descrLevel) {
        this.ID2GetBlobDetails_descrLevel = ID2GetBlobDetails_descrLevel;
    }


    /**
     * Gets the ID2GetBlobDetails_descrTypeMask value for this ID2GetBlobDetailsType.
     * 
     * @return ID2GetBlobDetails_descrTypeMask
     */
    public java.lang.String getID2GetBlobDetails_descrTypeMask() {
        return ID2GetBlobDetails_descrTypeMask;
    }


    /**
     * Sets the ID2GetBlobDetails_descrTypeMask value for this ID2GetBlobDetailsType.
     * 
     * @param ID2GetBlobDetails_descrTypeMask
     */
    public void setID2GetBlobDetails_descrTypeMask(java.lang.String ID2GetBlobDetails_descrTypeMask) {
        this.ID2GetBlobDetails_descrTypeMask = ID2GetBlobDetails_descrTypeMask;
    }


    /**
     * Gets the ID2GetBlobDetails_annotTypeMask value for this ID2GetBlobDetailsType.
     * 
     * @return ID2GetBlobDetails_annotTypeMask
     */
    public java.lang.String getID2GetBlobDetails_annotTypeMask() {
        return ID2GetBlobDetails_annotTypeMask;
    }


    /**
     * Sets the ID2GetBlobDetails_annotTypeMask value for this ID2GetBlobDetailsType.
     * 
     * @param ID2GetBlobDetails_annotTypeMask
     */
    public void setID2GetBlobDetails_annotTypeMask(java.lang.String ID2GetBlobDetails_annotTypeMask) {
        this.ID2GetBlobDetails_annotTypeMask = ID2GetBlobDetails_annotTypeMask;
    }


    /**
     * Gets the ID2GetBlobDetails_featTypeMask value for this ID2GetBlobDetailsType.
     * 
     * @return ID2GetBlobDetails_featTypeMask
     */
    public java.lang.String getID2GetBlobDetails_featTypeMask() {
        return ID2GetBlobDetails_featTypeMask;
    }


    /**
     * Sets the ID2GetBlobDetails_featTypeMask value for this ID2GetBlobDetailsType.
     * 
     * @param ID2GetBlobDetails_featTypeMask
     */
    public void setID2GetBlobDetails_featTypeMask(java.lang.String ID2GetBlobDetails_featTypeMask) {
        this.ID2GetBlobDetails_featTypeMask = ID2GetBlobDetails_featTypeMask;
    }


    /**
     * Gets the ID2GetBlobDetails_sequenceLevel value for this ID2GetBlobDetailsType.
     * 
     * @return ID2GetBlobDetails_sequenceLevel
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2GetBlobDetails_sequenceLevelType getID2GetBlobDetails_sequenceLevel() {
        return ID2GetBlobDetails_sequenceLevel;
    }


    /**
     * Sets the ID2GetBlobDetails_sequenceLevel value for this ID2GetBlobDetailsType.
     * 
     * @param ID2GetBlobDetails_sequenceLevel
     */
    public void setID2GetBlobDetails_sequenceLevel(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2GetBlobDetails_sequenceLevelType ID2GetBlobDetails_sequenceLevel) {
        this.ID2GetBlobDetails_sequenceLevel = ID2GetBlobDetails_sequenceLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2GetBlobDetailsType)) return false;
        ID2GetBlobDetailsType other = (ID2GetBlobDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2GetBlobDetails_location==null && other.getID2GetBlobDetails_location()==null) || 
             (this.ID2GetBlobDetails_location!=null &&
              this.ID2GetBlobDetails_location.equals(other.getID2GetBlobDetails_location()))) &&
            ((this.ID2GetBlobDetails_seqClassLevel==null && other.getID2GetBlobDetails_seqClassLevel()==null) || 
             (this.ID2GetBlobDetails_seqClassLevel!=null &&
              this.ID2GetBlobDetails_seqClassLevel.equals(other.getID2GetBlobDetails_seqClassLevel()))) &&
            ((this.ID2GetBlobDetails_descrLevel==null && other.getID2GetBlobDetails_descrLevel()==null) || 
             (this.ID2GetBlobDetails_descrLevel!=null &&
              this.ID2GetBlobDetails_descrLevel.equals(other.getID2GetBlobDetails_descrLevel()))) &&
            ((this.ID2GetBlobDetails_descrTypeMask==null && other.getID2GetBlobDetails_descrTypeMask()==null) || 
             (this.ID2GetBlobDetails_descrTypeMask!=null &&
              this.ID2GetBlobDetails_descrTypeMask.equals(other.getID2GetBlobDetails_descrTypeMask()))) &&
            ((this.ID2GetBlobDetails_annotTypeMask==null && other.getID2GetBlobDetails_annotTypeMask()==null) || 
             (this.ID2GetBlobDetails_annotTypeMask!=null &&
              this.ID2GetBlobDetails_annotTypeMask.equals(other.getID2GetBlobDetails_annotTypeMask()))) &&
            ((this.ID2GetBlobDetails_featTypeMask==null && other.getID2GetBlobDetails_featTypeMask()==null) || 
             (this.ID2GetBlobDetails_featTypeMask!=null &&
              this.ID2GetBlobDetails_featTypeMask.equals(other.getID2GetBlobDetails_featTypeMask()))) &&
            ((this.ID2GetBlobDetails_sequenceLevel==null && other.getID2GetBlobDetails_sequenceLevel()==null) || 
             (this.ID2GetBlobDetails_sequenceLevel!=null &&
              this.ID2GetBlobDetails_sequenceLevel.equals(other.getID2GetBlobDetails_sequenceLevel())));
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
        if (getID2GetBlobDetails_location() != null) {
            _hashCode += getID2GetBlobDetails_location().hashCode();
        }
        if (getID2GetBlobDetails_seqClassLevel() != null) {
            _hashCode += getID2GetBlobDetails_seqClassLevel().hashCode();
        }
        if (getID2GetBlobDetails_descrLevel() != null) {
            _hashCode += getID2GetBlobDetails_descrLevel().hashCode();
        }
        if (getID2GetBlobDetails_descrTypeMask() != null) {
            _hashCode += getID2GetBlobDetails_descrTypeMask().hashCode();
        }
        if (getID2GetBlobDetails_annotTypeMask() != null) {
            _hashCode += getID2GetBlobDetails_annotTypeMask().hashCode();
        }
        if (getID2GetBlobDetails_featTypeMask() != null) {
            _hashCode += getID2GetBlobDetails_featTypeMask().hashCode();
        }
        if (getID2GetBlobDetails_sequenceLevel() != null) {
            _hashCode += getID2GetBlobDetails_sequenceLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2GetBlobDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Get-Blob-DetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2GetBlobDetails_location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Get-Blob-Details_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Get-Blob-Details_locationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2GetBlobDetails_seqClassLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Get-Blob-Details_seq-class-level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2GetBlobDetails_descrLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Get-Blob-Details_descr-level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2GetBlobDetails_descrTypeMask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Get-Blob-Details_descr-type-mask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2GetBlobDetails_annotTypeMask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Get-Blob-Details_annot-type-mask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2GetBlobDetails_featTypeMask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Get-Blob-Details_feat-type-mask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2GetBlobDetails_sequenceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Get-Blob-Details_sequence-level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Get-Blob-Details_sequence-levelType"));
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
