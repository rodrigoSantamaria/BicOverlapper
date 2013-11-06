/**
 * GrantType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GrantType  implements java.io.Serializable {
    private java.lang.String grantID;

    private java.lang.String acronym;

    private java.lang.String agency;

    public GrantType() {
    }

    public GrantType(
           java.lang.String grantID,
           java.lang.String acronym,
           java.lang.String agency) {
           this.grantID = grantID;
           this.acronym = acronym;
           this.agency = agency;
    }


    /**
     * Gets the grantID value for this GrantType.
     * 
     * @return grantID
     */
    public java.lang.String getGrantID() {
        return grantID;
    }


    /**
     * Sets the grantID value for this GrantType.
     * 
     * @param grantID
     */
    public void setGrantID(java.lang.String grantID) {
        this.grantID = grantID;
    }


    /**
     * Gets the acronym value for this GrantType.
     * 
     * @return acronym
     */
    public java.lang.String getAcronym() {
        return acronym;
    }


    /**
     * Sets the acronym value for this GrantType.
     * 
     * @param acronym
     */
    public void setAcronym(java.lang.String acronym) {
        this.acronym = acronym;
    }


    /**
     * Gets the agency value for this GrantType.
     * 
     * @return agency
     */
    public java.lang.String getAgency() {
        return agency;
    }


    /**
     * Sets the agency value for this GrantType.
     * 
     * @param agency
     */
    public void setAgency(java.lang.String agency) {
        this.agency = agency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GrantType)) return false;
        GrantType other = (GrantType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grantID==null && other.getGrantID()==null) || 
             (this.grantID!=null &&
              this.grantID.equals(other.getGrantID()))) &&
            ((this.acronym==null && other.getAcronym()==null) || 
             (this.acronym!=null &&
              this.acronym.equals(other.getAcronym()))) &&
            ((this.agency==null && other.getAgency()==null) || 
             (this.agency!=null &&
              this.agency.equals(other.getAgency())));
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
        if (getGrantID() != null) {
            _hashCode += getGrantID().hashCode();
        }
        if (getAcronym() != null) {
            _hashCode += getAcronym().hashCode();
        }
        if (getAgency() != null) {
            _hashCode += getAgency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GrantType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GrantType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GrantID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acronym");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Acronym"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Agency"));
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
