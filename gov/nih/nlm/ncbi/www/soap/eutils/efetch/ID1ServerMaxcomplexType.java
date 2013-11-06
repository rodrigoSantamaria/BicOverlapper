/**
 * ID1ServerMaxcomplexType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID1ServerMaxcomplexType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerMaxcomplex_maxplexType ID1ServerMaxcomplex_maxplex;

    private java.lang.String ID1ServerMaxcomplex_gi;

    private java.lang.String ID1ServerMaxcomplex_ent;

    private java.lang.String ID1ServerMaxcomplex_sat;

    public ID1ServerMaxcomplexType() {
    }

    public ID1ServerMaxcomplexType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerMaxcomplex_maxplexType ID1ServerMaxcomplex_maxplex,
           java.lang.String ID1ServerMaxcomplex_gi,
           java.lang.String ID1ServerMaxcomplex_ent,
           java.lang.String ID1ServerMaxcomplex_sat) {
           this.ID1ServerMaxcomplex_maxplex = ID1ServerMaxcomplex_maxplex;
           this.ID1ServerMaxcomplex_gi = ID1ServerMaxcomplex_gi;
           this.ID1ServerMaxcomplex_ent = ID1ServerMaxcomplex_ent;
           this.ID1ServerMaxcomplex_sat = ID1ServerMaxcomplex_sat;
    }


    /**
     * Gets the ID1ServerMaxcomplex_maxplex value for this ID1ServerMaxcomplexType.
     * 
     * @return ID1ServerMaxcomplex_maxplex
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerMaxcomplex_maxplexType getID1ServerMaxcomplex_maxplex() {
        return ID1ServerMaxcomplex_maxplex;
    }


    /**
     * Sets the ID1ServerMaxcomplex_maxplex value for this ID1ServerMaxcomplexType.
     * 
     * @param ID1ServerMaxcomplex_maxplex
     */
    public void setID1ServerMaxcomplex_maxplex(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1ServerMaxcomplex_maxplexType ID1ServerMaxcomplex_maxplex) {
        this.ID1ServerMaxcomplex_maxplex = ID1ServerMaxcomplex_maxplex;
    }


    /**
     * Gets the ID1ServerMaxcomplex_gi value for this ID1ServerMaxcomplexType.
     * 
     * @return ID1ServerMaxcomplex_gi
     */
    public java.lang.String getID1ServerMaxcomplex_gi() {
        return ID1ServerMaxcomplex_gi;
    }


    /**
     * Sets the ID1ServerMaxcomplex_gi value for this ID1ServerMaxcomplexType.
     * 
     * @param ID1ServerMaxcomplex_gi
     */
    public void setID1ServerMaxcomplex_gi(java.lang.String ID1ServerMaxcomplex_gi) {
        this.ID1ServerMaxcomplex_gi = ID1ServerMaxcomplex_gi;
    }


    /**
     * Gets the ID1ServerMaxcomplex_ent value for this ID1ServerMaxcomplexType.
     * 
     * @return ID1ServerMaxcomplex_ent
     */
    public java.lang.String getID1ServerMaxcomplex_ent() {
        return ID1ServerMaxcomplex_ent;
    }


    /**
     * Sets the ID1ServerMaxcomplex_ent value for this ID1ServerMaxcomplexType.
     * 
     * @param ID1ServerMaxcomplex_ent
     */
    public void setID1ServerMaxcomplex_ent(java.lang.String ID1ServerMaxcomplex_ent) {
        this.ID1ServerMaxcomplex_ent = ID1ServerMaxcomplex_ent;
    }


    /**
     * Gets the ID1ServerMaxcomplex_sat value for this ID1ServerMaxcomplexType.
     * 
     * @return ID1ServerMaxcomplex_sat
     */
    public java.lang.String getID1ServerMaxcomplex_sat() {
        return ID1ServerMaxcomplex_sat;
    }


    /**
     * Sets the ID1ServerMaxcomplex_sat value for this ID1ServerMaxcomplexType.
     * 
     * @param ID1ServerMaxcomplex_sat
     */
    public void setID1ServerMaxcomplex_sat(java.lang.String ID1ServerMaxcomplex_sat) {
        this.ID1ServerMaxcomplex_sat = ID1ServerMaxcomplex_sat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID1ServerMaxcomplexType)) return false;
        ID1ServerMaxcomplexType other = (ID1ServerMaxcomplexType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID1ServerMaxcomplex_maxplex==null && other.getID1ServerMaxcomplex_maxplex()==null) || 
             (this.ID1ServerMaxcomplex_maxplex!=null &&
              this.ID1ServerMaxcomplex_maxplex.equals(other.getID1ServerMaxcomplex_maxplex()))) &&
            ((this.ID1ServerMaxcomplex_gi==null && other.getID1ServerMaxcomplex_gi()==null) || 
             (this.ID1ServerMaxcomplex_gi!=null &&
              this.ID1ServerMaxcomplex_gi.equals(other.getID1ServerMaxcomplex_gi()))) &&
            ((this.ID1ServerMaxcomplex_ent==null && other.getID1ServerMaxcomplex_ent()==null) || 
             (this.ID1ServerMaxcomplex_ent!=null &&
              this.ID1ServerMaxcomplex_ent.equals(other.getID1ServerMaxcomplex_ent()))) &&
            ((this.ID1ServerMaxcomplex_sat==null && other.getID1ServerMaxcomplex_sat()==null) || 
             (this.ID1ServerMaxcomplex_sat!=null &&
              this.ID1ServerMaxcomplex_sat.equals(other.getID1ServerMaxcomplex_sat())));
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
        if (getID1ServerMaxcomplex_maxplex() != null) {
            _hashCode += getID1ServerMaxcomplex_maxplex().hashCode();
        }
        if (getID1ServerMaxcomplex_gi() != null) {
            _hashCode += getID1ServerMaxcomplex_gi().hashCode();
        }
        if (getID1ServerMaxcomplex_ent() != null) {
            _hashCode += getID1ServerMaxcomplex_ent().hashCode();
        }
        if (getID1ServerMaxcomplex_sat() != null) {
            _hashCode += getID1ServerMaxcomplex_sat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID1ServerMaxcomplexType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-maxcomplexType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID1ServerMaxcomplex_maxplex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-maxcomplex_maxplex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-maxcomplex_maxplexType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID1ServerMaxcomplex_gi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-maxcomplex_gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID1ServerMaxcomplex_ent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-maxcomplex_ent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID1ServerMaxcomplex_sat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-maxcomplex_sat"));
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
