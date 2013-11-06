/**
 * Entrez2GetLinksType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2GetLinksType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_uidsType entrez2GetLinks_uids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_linktypeType entrez2GetLinks_linktype;

    private java.lang.String entrez2GetLinks_maxUIDS;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_countOnlyType entrez2GetLinks_countOnly;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_parentsPersistType entrez2GetLinks_parentsPersist;

    public Entrez2GetLinksType() {
    }

    public Entrez2GetLinksType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_uidsType entrez2GetLinks_uids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_linktypeType entrez2GetLinks_linktype,
           java.lang.String entrez2GetLinks_maxUIDS,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_countOnlyType entrez2GetLinks_countOnly,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_parentsPersistType entrez2GetLinks_parentsPersist) {
           this.entrez2GetLinks_uids = entrez2GetLinks_uids;
           this.entrez2GetLinks_linktype = entrez2GetLinks_linktype;
           this.entrez2GetLinks_maxUIDS = entrez2GetLinks_maxUIDS;
           this.entrez2GetLinks_countOnly = entrez2GetLinks_countOnly;
           this.entrez2GetLinks_parentsPersist = entrez2GetLinks_parentsPersist;
    }


    /**
     * Gets the entrez2GetLinks_uids value for this Entrez2GetLinksType.
     * 
     * @return entrez2GetLinks_uids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_uidsType getEntrez2GetLinks_uids() {
        return entrez2GetLinks_uids;
    }


    /**
     * Sets the entrez2GetLinks_uids value for this Entrez2GetLinksType.
     * 
     * @param entrez2GetLinks_uids
     */
    public void setEntrez2GetLinks_uids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_uidsType entrez2GetLinks_uids) {
        this.entrez2GetLinks_uids = entrez2GetLinks_uids;
    }


    /**
     * Gets the entrez2GetLinks_linktype value for this Entrez2GetLinksType.
     * 
     * @return entrez2GetLinks_linktype
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_linktypeType getEntrez2GetLinks_linktype() {
        return entrez2GetLinks_linktype;
    }


    /**
     * Sets the entrez2GetLinks_linktype value for this Entrez2GetLinksType.
     * 
     * @param entrez2GetLinks_linktype
     */
    public void setEntrez2GetLinks_linktype(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_linktypeType entrez2GetLinks_linktype) {
        this.entrez2GetLinks_linktype = entrez2GetLinks_linktype;
    }


    /**
     * Gets the entrez2GetLinks_maxUIDS value for this Entrez2GetLinksType.
     * 
     * @return entrez2GetLinks_maxUIDS
     */
    public java.lang.String getEntrez2GetLinks_maxUIDS() {
        return entrez2GetLinks_maxUIDS;
    }


    /**
     * Sets the entrez2GetLinks_maxUIDS value for this Entrez2GetLinksType.
     * 
     * @param entrez2GetLinks_maxUIDS
     */
    public void setEntrez2GetLinks_maxUIDS(java.lang.String entrez2GetLinks_maxUIDS) {
        this.entrez2GetLinks_maxUIDS = entrez2GetLinks_maxUIDS;
    }


    /**
     * Gets the entrez2GetLinks_countOnly value for this Entrez2GetLinksType.
     * 
     * @return entrez2GetLinks_countOnly
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_countOnlyType getEntrez2GetLinks_countOnly() {
        return entrez2GetLinks_countOnly;
    }


    /**
     * Sets the entrez2GetLinks_countOnly value for this Entrez2GetLinksType.
     * 
     * @param entrez2GetLinks_countOnly
     */
    public void setEntrez2GetLinks_countOnly(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_countOnlyType entrez2GetLinks_countOnly) {
        this.entrez2GetLinks_countOnly = entrez2GetLinks_countOnly;
    }


    /**
     * Gets the entrez2GetLinks_parentsPersist value for this Entrez2GetLinksType.
     * 
     * @return entrez2GetLinks_parentsPersist
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_parentsPersistType getEntrez2GetLinks_parentsPersist() {
        return entrez2GetLinks_parentsPersist;
    }


    /**
     * Sets the entrez2GetLinks_parentsPersist value for this Entrez2GetLinksType.
     * 
     * @param entrez2GetLinks_parentsPersist
     */
    public void setEntrez2GetLinks_parentsPersist(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinks_parentsPersistType entrez2GetLinks_parentsPersist) {
        this.entrez2GetLinks_parentsPersist = entrez2GetLinks_parentsPersist;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2GetLinksType)) return false;
        Entrez2GetLinksType other = (Entrez2GetLinksType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2GetLinks_uids==null && other.getEntrez2GetLinks_uids()==null) || 
             (this.entrez2GetLinks_uids!=null &&
              this.entrez2GetLinks_uids.equals(other.getEntrez2GetLinks_uids()))) &&
            ((this.entrez2GetLinks_linktype==null && other.getEntrez2GetLinks_linktype()==null) || 
             (this.entrez2GetLinks_linktype!=null &&
              this.entrez2GetLinks_linktype.equals(other.getEntrez2GetLinks_linktype()))) &&
            ((this.entrez2GetLinks_maxUIDS==null && other.getEntrez2GetLinks_maxUIDS()==null) || 
             (this.entrez2GetLinks_maxUIDS!=null &&
              this.entrez2GetLinks_maxUIDS.equals(other.getEntrez2GetLinks_maxUIDS()))) &&
            ((this.entrez2GetLinks_countOnly==null && other.getEntrez2GetLinks_countOnly()==null) || 
             (this.entrez2GetLinks_countOnly!=null &&
              this.entrez2GetLinks_countOnly.equals(other.getEntrez2GetLinks_countOnly()))) &&
            ((this.entrez2GetLinks_parentsPersist==null && other.getEntrez2GetLinks_parentsPersist()==null) || 
             (this.entrez2GetLinks_parentsPersist!=null &&
              this.entrez2GetLinks_parentsPersist.equals(other.getEntrez2GetLinks_parentsPersist())));
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
        if (getEntrez2GetLinks_uids() != null) {
            _hashCode += getEntrez2GetLinks_uids().hashCode();
        }
        if (getEntrez2GetLinks_linktype() != null) {
            _hashCode += getEntrez2GetLinks_linktype().hashCode();
        }
        if (getEntrez2GetLinks_maxUIDS() != null) {
            _hashCode += getEntrez2GetLinks_maxUIDS().hashCode();
        }
        if (getEntrez2GetLinks_countOnly() != null) {
            _hashCode += getEntrez2GetLinks_countOnly().hashCode();
        }
        if (getEntrez2GetLinks_parentsPersist() != null) {
            _hashCode += getEntrez2GetLinks_parentsPersist().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2GetLinksType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-get-linksType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2GetLinks_uids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-get-links_uids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-get-links_uidsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2GetLinks_linktype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-get-links_linktype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-get-links_linktypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2GetLinks_maxUIDS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-get-links_max-UIDS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2GetLinks_countOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-get-links_count-only"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-get-links_count-onlyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2GetLinks_parentsPersist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-get-links_parents-persist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-get-links_parents-persistType"));
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
