/**
 * Entrez2LinkSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2LinkSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkSet_idsType entrez2LinkSet_ids;

    private java.lang.String entrez2LinkSet_dataSize;

    private java.lang.String entrez2LinkSet_data;

    public Entrez2LinkSetType() {
    }

    public Entrez2LinkSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkSet_idsType entrez2LinkSet_ids,
           java.lang.String entrez2LinkSet_dataSize,
           java.lang.String entrez2LinkSet_data) {
           this.entrez2LinkSet_ids = entrez2LinkSet_ids;
           this.entrez2LinkSet_dataSize = entrez2LinkSet_dataSize;
           this.entrez2LinkSet_data = entrez2LinkSet_data;
    }


    /**
     * Gets the entrez2LinkSet_ids value for this Entrez2LinkSetType.
     * 
     * @return entrez2LinkSet_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkSet_idsType getEntrez2LinkSet_ids() {
        return entrez2LinkSet_ids;
    }


    /**
     * Sets the entrez2LinkSet_ids value for this Entrez2LinkSetType.
     * 
     * @param entrez2LinkSet_ids
     */
    public void setEntrez2LinkSet_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkSet_idsType entrez2LinkSet_ids) {
        this.entrez2LinkSet_ids = entrez2LinkSet_ids;
    }


    /**
     * Gets the entrez2LinkSet_dataSize value for this Entrez2LinkSetType.
     * 
     * @return entrez2LinkSet_dataSize
     */
    public java.lang.String getEntrez2LinkSet_dataSize() {
        return entrez2LinkSet_dataSize;
    }


    /**
     * Sets the entrez2LinkSet_dataSize value for this Entrez2LinkSetType.
     * 
     * @param entrez2LinkSet_dataSize
     */
    public void setEntrez2LinkSet_dataSize(java.lang.String entrez2LinkSet_dataSize) {
        this.entrez2LinkSet_dataSize = entrez2LinkSet_dataSize;
    }


    /**
     * Gets the entrez2LinkSet_data value for this Entrez2LinkSetType.
     * 
     * @return entrez2LinkSet_data
     */
    public java.lang.String getEntrez2LinkSet_data() {
        return entrez2LinkSet_data;
    }


    /**
     * Sets the entrez2LinkSet_data value for this Entrez2LinkSetType.
     * 
     * @param entrez2LinkSet_data
     */
    public void setEntrez2LinkSet_data(java.lang.String entrez2LinkSet_data) {
        this.entrez2LinkSet_data = entrez2LinkSet_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2LinkSetType)) return false;
        Entrez2LinkSetType other = (Entrez2LinkSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2LinkSet_ids==null && other.getEntrez2LinkSet_ids()==null) || 
             (this.entrez2LinkSet_ids!=null &&
              this.entrez2LinkSet_ids.equals(other.getEntrez2LinkSet_ids()))) &&
            ((this.entrez2LinkSet_dataSize==null && other.getEntrez2LinkSet_dataSize()==null) || 
             (this.entrez2LinkSet_dataSize!=null &&
              this.entrez2LinkSet_dataSize.equals(other.getEntrez2LinkSet_dataSize()))) &&
            ((this.entrez2LinkSet_data==null && other.getEntrez2LinkSet_data()==null) || 
             (this.entrez2LinkSet_data!=null &&
              this.entrez2LinkSet_data.equals(other.getEntrez2LinkSet_data())));
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
        if (getEntrez2LinkSet_ids() != null) {
            _hashCode += getEntrez2LinkSet_ids().hashCode();
        }
        if (getEntrez2LinkSet_dataSize() != null) {
            _hashCode += getEntrez2LinkSet_dataSize().hashCode();
        }
        if (getEntrez2LinkSet_data() != null) {
            _hashCode += getEntrez2LinkSet_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2LinkSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-setType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkSet_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-set_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-set_idsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkSet_dataSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-set_data-size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkSet_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-set_data"));
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
