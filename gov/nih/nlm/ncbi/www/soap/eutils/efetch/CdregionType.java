/**
 * CdregionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CdregionType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_orfType cdregion_orf;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_frameType cdregion_frame;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_conflictType cdregion_conflict;

    private java.lang.String cdregion_gaps;

    private java.lang.String cdregion_mismatch;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_codeType cdregion_code;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_codeBreakType cdregion_codeBreak;

    private java.lang.String cdregion_stops;

    public CdregionType() {
    }

    public CdregionType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_orfType cdregion_orf,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_frameType cdregion_frame,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_conflictType cdregion_conflict,
           java.lang.String cdregion_gaps,
           java.lang.String cdregion_mismatch,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_codeType cdregion_code,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_codeBreakType cdregion_codeBreak,
           java.lang.String cdregion_stops) {
           this.cdregion_orf = cdregion_orf;
           this.cdregion_frame = cdregion_frame;
           this.cdregion_conflict = cdregion_conflict;
           this.cdregion_gaps = cdregion_gaps;
           this.cdregion_mismatch = cdregion_mismatch;
           this.cdregion_code = cdregion_code;
           this.cdregion_codeBreak = cdregion_codeBreak;
           this.cdregion_stops = cdregion_stops;
    }


    /**
     * Gets the cdregion_orf value for this CdregionType.
     * 
     * @return cdregion_orf
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_orfType getCdregion_orf() {
        return cdregion_orf;
    }


    /**
     * Sets the cdregion_orf value for this CdregionType.
     * 
     * @param cdregion_orf
     */
    public void setCdregion_orf(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_orfType cdregion_orf) {
        this.cdregion_orf = cdregion_orf;
    }


    /**
     * Gets the cdregion_frame value for this CdregionType.
     * 
     * @return cdregion_frame
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_frameType getCdregion_frame() {
        return cdregion_frame;
    }


    /**
     * Sets the cdregion_frame value for this CdregionType.
     * 
     * @param cdregion_frame
     */
    public void setCdregion_frame(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_frameType cdregion_frame) {
        this.cdregion_frame = cdregion_frame;
    }


    /**
     * Gets the cdregion_conflict value for this CdregionType.
     * 
     * @return cdregion_conflict
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_conflictType getCdregion_conflict() {
        return cdregion_conflict;
    }


    /**
     * Sets the cdregion_conflict value for this CdregionType.
     * 
     * @param cdregion_conflict
     */
    public void setCdregion_conflict(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_conflictType cdregion_conflict) {
        this.cdregion_conflict = cdregion_conflict;
    }


    /**
     * Gets the cdregion_gaps value for this CdregionType.
     * 
     * @return cdregion_gaps
     */
    public java.lang.String getCdregion_gaps() {
        return cdregion_gaps;
    }


    /**
     * Sets the cdregion_gaps value for this CdregionType.
     * 
     * @param cdregion_gaps
     */
    public void setCdregion_gaps(java.lang.String cdregion_gaps) {
        this.cdregion_gaps = cdregion_gaps;
    }


    /**
     * Gets the cdregion_mismatch value for this CdregionType.
     * 
     * @return cdregion_mismatch
     */
    public java.lang.String getCdregion_mismatch() {
        return cdregion_mismatch;
    }


    /**
     * Sets the cdregion_mismatch value for this CdregionType.
     * 
     * @param cdregion_mismatch
     */
    public void setCdregion_mismatch(java.lang.String cdregion_mismatch) {
        this.cdregion_mismatch = cdregion_mismatch;
    }


    /**
     * Gets the cdregion_code value for this CdregionType.
     * 
     * @return cdregion_code
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_codeType getCdregion_code() {
        return cdregion_code;
    }


    /**
     * Sets the cdregion_code value for this CdregionType.
     * 
     * @param cdregion_code
     */
    public void setCdregion_code(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_codeType cdregion_code) {
        this.cdregion_code = cdregion_code;
    }


    /**
     * Gets the cdregion_codeBreak value for this CdregionType.
     * 
     * @return cdregion_codeBreak
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_codeBreakType getCdregion_codeBreak() {
        return cdregion_codeBreak;
    }


    /**
     * Sets the cdregion_codeBreak value for this CdregionType.
     * 
     * @param cdregion_codeBreak
     */
    public void setCdregion_codeBreak(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdregion_codeBreakType cdregion_codeBreak) {
        this.cdregion_codeBreak = cdregion_codeBreak;
    }


    /**
     * Gets the cdregion_stops value for this CdregionType.
     * 
     * @return cdregion_stops
     */
    public java.lang.String getCdregion_stops() {
        return cdregion_stops;
    }


    /**
     * Sets the cdregion_stops value for this CdregionType.
     * 
     * @param cdregion_stops
     */
    public void setCdregion_stops(java.lang.String cdregion_stops) {
        this.cdregion_stops = cdregion_stops;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CdregionType)) return false;
        CdregionType other = (CdregionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdregion_orf==null && other.getCdregion_orf()==null) || 
             (this.cdregion_orf!=null &&
              this.cdregion_orf.equals(other.getCdregion_orf()))) &&
            ((this.cdregion_frame==null && other.getCdregion_frame()==null) || 
             (this.cdregion_frame!=null &&
              this.cdregion_frame.equals(other.getCdregion_frame()))) &&
            ((this.cdregion_conflict==null && other.getCdregion_conflict()==null) || 
             (this.cdregion_conflict!=null &&
              this.cdregion_conflict.equals(other.getCdregion_conflict()))) &&
            ((this.cdregion_gaps==null && other.getCdregion_gaps()==null) || 
             (this.cdregion_gaps!=null &&
              this.cdregion_gaps.equals(other.getCdregion_gaps()))) &&
            ((this.cdregion_mismatch==null && other.getCdregion_mismatch()==null) || 
             (this.cdregion_mismatch!=null &&
              this.cdregion_mismatch.equals(other.getCdregion_mismatch()))) &&
            ((this.cdregion_code==null && other.getCdregion_code()==null) || 
             (this.cdregion_code!=null &&
              this.cdregion_code.equals(other.getCdregion_code()))) &&
            ((this.cdregion_codeBreak==null && other.getCdregion_codeBreak()==null) || 
             (this.cdregion_codeBreak!=null &&
              this.cdregion_codeBreak.equals(other.getCdregion_codeBreak()))) &&
            ((this.cdregion_stops==null && other.getCdregion_stops()==null) || 
             (this.cdregion_stops!=null &&
              this.cdregion_stops.equals(other.getCdregion_stops())));
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
        if (getCdregion_orf() != null) {
            _hashCode += getCdregion_orf().hashCode();
        }
        if (getCdregion_frame() != null) {
            _hashCode += getCdregion_frame().hashCode();
        }
        if (getCdregion_conflict() != null) {
            _hashCode += getCdregion_conflict().hashCode();
        }
        if (getCdregion_gaps() != null) {
            _hashCode += getCdregion_gaps().hashCode();
        }
        if (getCdregion_mismatch() != null) {
            _hashCode += getCdregion_mismatch().hashCode();
        }
        if (getCdregion_code() != null) {
            _hashCode += getCdregion_code().hashCode();
        }
        if (getCdregion_codeBreak() != null) {
            _hashCode += getCdregion_codeBreak().hashCode();
        }
        if (getCdregion_stops() != null) {
            _hashCode += getCdregion_stops().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CdregionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CdregionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdregion_orf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_orf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_orfType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdregion_frame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_frame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_frameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdregion_conflict");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_conflict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_conflictType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdregion_gaps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_gaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdregion_mismatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_mismatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdregion_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_codeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdregion_codeBreak");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_code-break"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_code-breakType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdregion_stops");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_stops"));
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
