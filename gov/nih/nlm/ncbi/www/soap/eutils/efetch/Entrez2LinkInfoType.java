/**
 * Entrez2LinkInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2LinkInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfo_linkNameType entrez2LinkInfo_linkName;

    private java.lang.String entrez2LinkInfo_linkMenu;

    private java.lang.String entrez2LinkInfo_linkDescr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfo_dbToType entrez2LinkInfo_dbTo;

    private java.lang.String entrez2LinkInfo_dataSize;

    public Entrez2LinkInfoType() {
    }

    public Entrez2LinkInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfo_linkNameType entrez2LinkInfo_linkName,
           java.lang.String entrez2LinkInfo_linkMenu,
           java.lang.String entrez2LinkInfo_linkDescr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfo_dbToType entrez2LinkInfo_dbTo,
           java.lang.String entrez2LinkInfo_dataSize) {
           this.entrez2LinkInfo_linkName = entrez2LinkInfo_linkName;
           this.entrez2LinkInfo_linkMenu = entrez2LinkInfo_linkMenu;
           this.entrez2LinkInfo_linkDescr = entrez2LinkInfo_linkDescr;
           this.entrez2LinkInfo_dbTo = entrez2LinkInfo_dbTo;
           this.entrez2LinkInfo_dataSize = entrez2LinkInfo_dataSize;
    }


    /**
     * Gets the entrez2LinkInfo_linkName value for this Entrez2LinkInfoType.
     * 
     * @return entrez2LinkInfo_linkName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfo_linkNameType getEntrez2LinkInfo_linkName() {
        return entrez2LinkInfo_linkName;
    }


    /**
     * Sets the entrez2LinkInfo_linkName value for this Entrez2LinkInfoType.
     * 
     * @param entrez2LinkInfo_linkName
     */
    public void setEntrez2LinkInfo_linkName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfo_linkNameType entrez2LinkInfo_linkName) {
        this.entrez2LinkInfo_linkName = entrez2LinkInfo_linkName;
    }


    /**
     * Gets the entrez2LinkInfo_linkMenu value for this Entrez2LinkInfoType.
     * 
     * @return entrez2LinkInfo_linkMenu
     */
    public java.lang.String getEntrez2LinkInfo_linkMenu() {
        return entrez2LinkInfo_linkMenu;
    }


    /**
     * Sets the entrez2LinkInfo_linkMenu value for this Entrez2LinkInfoType.
     * 
     * @param entrez2LinkInfo_linkMenu
     */
    public void setEntrez2LinkInfo_linkMenu(java.lang.String entrez2LinkInfo_linkMenu) {
        this.entrez2LinkInfo_linkMenu = entrez2LinkInfo_linkMenu;
    }


    /**
     * Gets the entrez2LinkInfo_linkDescr value for this Entrez2LinkInfoType.
     * 
     * @return entrez2LinkInfo_linkDescr
     */
    public java.lang.String getEntrez2LinkInfo_linkDescr() {
        return entrez2LinkInfo_linkDescr;
    }


    /**
     * Sets the entrez2LinkInfo_linkDescr value for this Entrez2LinkInfoType.
     * 
     * @param entrez2LinkInfo_linkDescr
     */
    public void setEntrez2LinkInfo_linkDescr(java.lang.String entrez2LinkInfo_linkDescr) {
        this.entrez2LinkInfo_linkDescr = entrez2LinkInfo_linkDescr;
    }


    /**
     * Gets the entrez2LinkInfo_dbTo value for this Entrez2LinkInfoType.
     * 
     * @return entrez2LinkInfo_dbTo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfo_dbToType getEntrez2LinkInfo_dbTo() {
        return entrez2LinkInfo_dbTo;
    }


    /**
     * Sets the entrez2LinkInfo_dbTo value for this Entrez2LinkInfoType.
     * 
     * @param entrez2LinkInfo_dbTo
     */
    public void setEntrez2LinkInfo_dbTo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkInfo_dbToType entrez2LinkInfo_dbTo) {
        this.entrez2LinkInfo_dbTo = entrez2LinkInfo_dbTo;
    }


    /**
     * Gets the entrez2LinkInfo_dataSize value for this Entrez2LinkInfoType.
     * 
     * @return entrez2LinkInfo_dataSize
     */
    public java.lang.String getEntrez2LinkInfo_dataSize() {
        return entrez2LinkInfo_dataSize;
    }


    /**
     * Sets the entrez2LinkInfo_dataSize value for this Entrez2LinkInfoType.
     * 
     * @param entrez2LinkInfo_dataSize
     */
    public void setEntrez2LinkInfo_dataSize(java.lang.String entrez2LinkInfo_dataSize) {
        this.entrez2LinkInfo_dataSize = entrez2LinkInfo_dataSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2LinkInfoType)) return false;
        Entrez2LinkInfoType other = (Entrez2LinkInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2LinkInfo_linkName==null && other.getEntrez2LinkInfo_linkName()==null) || 
             (this.entrez2LinkInfo_linkName!=null &&
              this.entrez2LinkInfo_linkName.equals(other.getEntrez2LinkInfo_linkName()))) &&
            ((this.entrez2LinkInfo_linkMenu==null && other.getEntrez2LinkInfo_linkMenu()==null) || 
             (this.entrez2LinkInfo_linkMenu!=null &&
              this.entrez2LinkInfo_linkMenu.equals(other.getEntrez2LinkInfo_linkMenu()))) &&
            ((this.entrez2LinkInfo_linkDescr==null && other.getEntrez2LinkInfo_linkDescr()==null) || 
             (this.entrez2LinkInfo_linkDescr!=null &&
              this.entrez2LinkInfo_linkDescr.equals(other.getEntrez2LinkInfo_linkDescr()))) &&
            ((this.entrez2LinkInfo_dbTo==null && other.getEntrez2LinkInfo_dbTo()==null) || 
             (this.entrez2LinkInfo_dbTo!=null &&
              this.entrez2LinkInfo_dbTo.equals(other.getEntrez2LinkInfo_dbTo()))) &&
            ((this.entrez2LinkInfo_dataSize==null && other.getEntrez2LinkInfo_dataSize()==null) || 
             (this.entrez2LinkInfo_dataSize!=null &&
              this.entrez2LinkInfo_dataSize.equals(other.getEntrez2LinkInfo_dataSize())));
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
        if (getEntrez2LinkInfo_linkName() != null) {
            _hashCode += getEntrez2LinkInfo_linkName().hashCode();
        }
        if (getEntrez2LinkInfo_linkMenu() != null) {
            _hashCode += getEntrez2LinkInfo_linkMenu().hashCode();
        }
        if (getEntrez2LinkInfo_linkDescr() != null) {
            _hashCode += getEntrez2LinkInfo_linkDescr().hashCode();
        }
        if (getEntrez2LinkInfo_dbTo() != null) {
            _hashCode += getEntrez2LinkInfo_dbTo().hashCode();
        }
        if (getEntrez2LinkInfo_dataSize() != null) {
            _hashCode += getEntrez2LinkInfo_dataSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2LinkInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkInfo_linkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-info_link-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-info_link-nameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkInfo_linkMenu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-info_link-menu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkInfo_linkDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-info_link-descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkInfo_dbTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-info_db-to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-info_db-toType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkInfo_dataSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-info_data-size"));
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
