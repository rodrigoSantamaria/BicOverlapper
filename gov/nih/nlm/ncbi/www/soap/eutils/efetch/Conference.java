/**
 * Conference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Conference  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfDate confDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfName confName;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfNum confNum;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfLoc confLoc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfSponsor confSponsor;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfTheme confTheme;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfAcronym confAcronym;

    public Conference() {
    }

    public Conference(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfDate confDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfName confName,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfNum confNum,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfLoc confLoc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfSponsor confSponsor,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfTheme confTheme,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfAcronym confAcronym) {
           this.confDate = confDate;
           this.confName = confName;
           this.confNum = confNum;
           this.confLoc = confLoc;
           this.confSponsor = confSponsor;
           this.confTheme = confTheme;
           this.confAcronym = confAcronym;
    }


    /**
     * Gets the confDate value for this Conference.
     * 
     * @return confDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfDate getConfDate() {
        return confDate;
    }


    /**
     * Sets the confDate value for this Conference.
     * 
     * @param confDate
     */
    public void setConfDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfDate confDate) {
        this.confDate = confDate;
    }


    /**
     * Gets the confName value for this Conference.
     * 
     * @return confName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfName getConfName() {
        return confName;
    }


    /**
     * Sets the confName value for this Conference.
     * 
     * @param confName
     */
    public void setConfName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfName confName) {
        this.confName = confName;
    }


    /**
     * Gets the confNum value for this Conference.
     * 
     * @return confNum
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfNum getConfNum() {
        return confNum;
    }


    /**
     * Sets the confNum value for this Conference.
     * 
     * @param confNum
     */
    public void setConfNum(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfNum confNum) {
        this.confNum = confNum;
    }


    /**
     * Gets the confLoc value for this Conference.
     * 
     * @return confLoc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfLoc getConfLoc() {
        return confLoc;
    }


    /**
     * Sets the confLoc value for this Conference.
     * 
     * @param confLoc
     */
    public void setConfLoc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfLoc confLoc) {
        this.confLoc = confLoc;
    }


    /**
     * Gets the confSponsor value for this Conference.
     * 
     * @return confSponsor
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfSponsor getConfSponsor() {
        return confSponsor;
    }


    /**
     * Sets the confSponsor value for this Conference.
     * 
     * @param confSponsor
     */
    public void setConfSponsor(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfSponsor confSponsor) {
        this.confSponsor = confSponsor;
    }


    /**
     * Gets the confTheme value for this Conference.
     * 
     * @return confTheme
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfTheme getConfTheme() {
        return confTheme;
    }


    /**
     * Sets the confTheme value for this Conference.
     * 
     * @param confTheme
     */
    public void setConfTheme(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfTheme confTheme) {
        this.confTheme = confTheme;
    }


    /**
     * Gets the confAcronym value for this Conference.
     * 
     * @return confAcronym
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfAcronym getConfAcronym() {
        return confAcronym;
    }


    /**
     * Sets the confAcronym value for this Conference.
     * 
     * @param confAcronym
     */
    public void setConfAcronym(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfAcronym confAcronym) {
        this.confAcronym = confAcronym;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Conference)) return false;
        Conference other = (Conference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.confDate==null && other.getConfDate()==null) || 
             (this.confDate!=null &&
              this.confDate.equals(other.getConfDate()))) &&
            ((this.confName==null && other.getConfName()==null) || 
             (this.confName!=null &&
              this.confName.equals(other.getConfName()))) &&
            ((this.confNum==null && other.getConfNum()==null) || 
             (this.confNum!=null &&
              this.confNum.equals(other.getConfNum()))) &&
            ((this.confLoc==null && other.getConfLoc()==null) || 
             (this.confLoc!=null &&
              this.confLoc.equals(other.getConfLoc()))) &&
            ((this.confSponsor==null && other.getConfSponsor()==null) || 
             (this.confSponsor!=null &&
              this.confSponsor.equals(other.getConfSponsor()))) &&
            ((this.confTheme==null && other.getConfTheme()==null) || 
             (this.confTheme!=null &&
              this.confTheme.equals(other.getConfTheme()))) &&
            ((this.confAcronym==null && other.getConfAcronym()==null) || 
             (this.confAcronym!=null &&
              this.confAcronym.equals(other.getConfAcronym())));
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
        if (getConfDate() != null) {
            _hashCode += getConfDate().hashCode();
        }
        if (getConfName() != null) {
            _hashCode += getConfName().hashCode();
        }
        if (getConfNum() != null) {
            _hashCode += getConfNum().hashCode();
        }
        if (getConfLoc() != null) {
            _hashCode += getConfLoc().hashCode();
        }
        if (getConfSponsor() != null) {
            _hashCode += getConfSponsor().hashCode();
        }
        if (getConfTheme() != null) {
            _hashCode += getConfTheme().hashCode();
        }
        if (getConfAcronym() != null) {
            _hashCode += getConfAcronym().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Conference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">conference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "conf-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">conf-date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "conf-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">conf-name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "conf-num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">conf-num"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confLoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "conf-loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">conf-loc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confSponsor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "conf-sponsor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">conf-sponsor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confTheme");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "conf-theme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">conf-theme"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confAcronym");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "conf-acronym"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">conf-acronym"));
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
