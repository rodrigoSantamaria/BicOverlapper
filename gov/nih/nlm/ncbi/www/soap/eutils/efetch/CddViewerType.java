/**
 * CddViewerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddViewerType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddViewer_ctrlType cddViewer_ctrl;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddViewer_rectType cddViewer_rect;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddViewer_accessionsType cddViewer_accessions;

    public CddViewerType() {
    }

    public CddViewerType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddViewer_ctrlType cddViewer_ctrl,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddViewer_rectType cddViewer_rect,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddViewer_accessionsType cddViewer_accessions) {
           this.cddViewer_ctrl = cddViewer_ctrl;
           this.cddViewer_rect = cddViewer_rect;
           this.cddViewer_accessions = cddViewer_accessions;
    }


    /**
     * Gets the cddViewer_ctrl value for this CddViewerType.
     * 
     * @return cddViewer_ctrl
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddViewer_ctrlType getCddViewer_ctrl() {
        return cddViewer_ctrl;
    }


    /**
     * Sets the cddViewer_ctrl value for this CddViewerType.
     * 
     * @param cddViewer_ctrl
     */
    public void setCddViewer_ctrl(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddViewer_ctrlType cddViewer_ctrl) {
        this.cddViewer_ctrl = cddViewer_ctrl;
    }


    /**
     * Gets the cddViewer_rect value for this CddViewerType.
     * 
     * @return cddViewer_rect
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddViewer_rectType getCddViewer_rect() {
        return cddViewer_rect;
    }


    /**
     * Sets the cddViewer_rect value for this CddViewerType.
     * 
     * @param cddViewer_rect
     */
    public void setCddViewer_rect(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddViewer_rectType cddViewer_rect) {
        this.cddViewer_rect = cddViewer_rect;
    }


    /**
     * Gets the cddViewer_accessions value for this CddViewerType.
     * 
     * @return cddViewer_accessions
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddViewer_accessionsType getCddViewer_accessions() {
        return cddViewer_accessions;
    }


    /**
     * Sets the cddViewer_accessions value for this CddViewerType.
     * 
     * @param cddViewer_accessions
     */
    public void setCddViewer_accessions(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddViewer_accessionsType cddViewer_accessions) {
        this.cddViewer_accessions = cddViewer_accessions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddViewerType)) return false;
        CddViewerType other = (CddViewerType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddViewer_ctrl==null && other.getCddViewer_ctrl()==null) || 
             (this.cddViewer_ctrl!=null &&
              this.cddViewer_ctrl.equals(other.getCddViewer_ctrl()))) &&
            ((this.cddViewer_rect==null && other.getCddViewer_rect()==null) || 
             (this.cddViewer_rect!=null &&
              this.cddViewer_rect.equals(other.getCddViewer_rect()))) &&
            ((this.cddViewer_accessions==null && other.getCddViewer_accessions()==null) || 
             (this.cddViewer_accessions!=null &&
              this.cddViewer_accessions.equals(other.getCddViewer_accessions())));
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
        if (getCddViewer_ctrl() != null) {
            _hashCode += getCddViewer_ctrl().hashCode();
        }
        if (getCddViewer_rect() != null) {
            _hashCode += getCddViewer_rect().hashCode();
        }
        if (getCddViewer_accessions() != null) {
            _hashCode += getCddViewer_accessions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddViewerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-ViewerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddViewer_ctrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Viewer_ctrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Viewer_ctrlType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddViewer_rect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Viewer_rect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Viewer_rectType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddViewer_accessions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Viewer_accessions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Viewer_accessionsType"));
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
