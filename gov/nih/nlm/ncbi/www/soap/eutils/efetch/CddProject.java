/**
 * CddProject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddProject  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_cdsType cddProject_cds;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_cdcolorType cddProject_cdcolor;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_viewersType cddProject_viewers;

    private java.lang.String cddProject_log;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_scriptsType cddProject_scripts;

    public CddProject() {
    }

    public CddProject(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_cdsType cddProject_cds,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_cdcolorType cddProject_cdcolor,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_viewersType cddProject_viewers,
           java.lang.String cddProject_log,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_scriptsType cddProject_scripts) {
           this.cddProject_cds = cddProject_cds;
           this.cddProject_cdcolor = cddProject_cdcolor;
           this.cddProject_viewers = cddProject_viewers;
           this.cddProject_log = cddProject_log;
           this.cddProject_scripts = cddProject_scripts;
    }


    /**
     * Gets the cddProject_cds value for this CddProject.
     * 
     * @return cddProject_cds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_cdsType getCddProject_cds() {
        return cddProject_cds;
    }


    /**
     * Sets the cddProject_cds value for this CddProject.
     * 
     * @param cddProject_cds
     */
    public void setCddProject_cds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_cdsType cddProject_cds) {
        this.cddProject_cds = cddProject_cds;
    }


    /**
     * Gets the cddProject_cdcolor value for this CddProject.
     * 
     * @return cddProject_cdcolor
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_cdcolorType getCddProject_cdcolor() {
        return cddProject_cdcolor;
    }


    /**
     * Sets the cddProject_cdcolor value for this CddProject.
     * 
     * @param cddProject_cdcolor
     */
    public void setCddProject_cdcolor(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_cdcolorType cddProject_cdcolor) {
        this.cddProject_cdcolor = cddProject_cdcolor;
    }


    /**
     * Gets the cddProject_viewers value for this CddProject.
     * 
     * @return cddProject_viewers
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_viewersType getCddProject_viewers() {
        return cddProject_viewers;
    }


    /**
     * Sets the cddProject_viewers value for this CddProject.
     * 
     * @param cddProject_viewers
     */
    public void setCddProject_viewers(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_viewersType cddProject_viewers) {
        this.cddProject_viewers = cddProject_viewers;
    }


    /**
     * Gets the cddProject_log value for this CddProject.
     * 
     * @return cddProject_log
     */
    public java.lang.String getCddProject_log() {
        return cddProject_log;
    }


    /**
     * Sets the cddProject_log value for this CddProject.
     * 
     * @param cddProject_log
     */
    public void setCddProject_log(java.lang.String cddProject_log) {
        this.cddProject_log = cddProject_log;
    }


    /**
     * Gets the cddProject_scripts value for this CddProject.
     * 
     * @return cddProject_scripts
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_scriptsType getCddProject_scripts() {
        return cddProject_scripts;
    }


    /**
     * Sets the cddProject_scripts value for this CddProject.
     * 
     * @param cddProject_scripts
     */
    public void setCddProject_scripts(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddProject_scriptsType cddProject_scripts) {
        this.cddProject_scripts = cddProject_scripts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddProject)) return false;
        CddProject other = (CddProject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddProject_cds==null && other.getCddProject_cds()==null) || 
             (this.cddProject_cds!=null &&
              this.cddProject_cds.equals(other.getCddProject_cds()))) &&
            ((this.cddProject_cdcolor==null && other.getCddProject_cdcolor()==null) || 
             (this.cddProject_cdcolor!=null &&
              this.cddProject_cdcolor.equals(other.getCddProject_cdcolor()))) &&
            ((this.cddProject_viewers==null && other.getCddProject_viewers()==null) || 
             (this.cddProject_viewers!=null &&
              this.cddProject_viewers.equals(other.getCddProject_viewers()))) &&
            ((this.cddProject_log==null && other.getCddProject_log()==null) || 
             (this.cddProject_log!=null &&
              this.cddProject_log.equals(other.getCddProject_log()))) &&
            ((this.cddProject_scripts==null && other.getCddProject_scripts()==null) || 
             (this.cddProject_scripts!=null &&
              this.cddProject_scripts.equals(other.getCddProject_scripts())));
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
        if (getCddProject_cds() != null) {
            _hashCode += getCddProject_cds().hashCode();
        }
        if (getCddProject_cdcolor() != null) {
            _hashCode += getCddProject_cdcolor().hashCode();
        }
        if (getCddProject_viewers() != null) {
            _hashCode += getCddProject_viewers().hashCode();
        }
        if (getCddProject_log() != null) {
            _hashCode += getCddProject_log().hashCode();
        }
        if (getCddProject_scripts() != null) {
            _hashCode += getCddProject_scripts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddProject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Cdd-Project"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddProject_cds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Project_cds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Project_cdsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddProject_cdcolor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Project_cdcolor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Project_cdcolorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddProject_viewers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Project_viewers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Project_viewersType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddProject_log");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Project_log"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddProject_scripts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Project_scripts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Project_scriptsType"));
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
