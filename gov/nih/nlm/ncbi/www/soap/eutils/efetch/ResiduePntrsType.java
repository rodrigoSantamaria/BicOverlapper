/**
 * ResiduePntrsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResiduePntrsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResiduePntrs_explicitType residuePntrs_explicit;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResiduePntrs_intervalType residuePntrs_interval;

    public ResiduePntrsType() {
    }

    public ResiduePntrsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResiduePntrs_explicitType residuePntrs_explicit,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResiduePntrs_intervalType residuePntrs_interval) {
           this.residuePntrs_explicit = residuePntrs_explicit;
           this.residuePntrs_interval = residuePntrs_interval;
    }


    /**
     * Gets the residuePntrs_explicit value for this ResiduePntrsType.
     * 
     * @return residuePntrs_explicit
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResiduePntrs_explicitType getResiduePntrs_explicit() {
        return residuePntrs_explicit;
    }


    /**
     * Sets the residuePntrs_explicit value for this ResiduePntrsType.
     * 
     * @param residuePntrs_explicit
     */
    public void setResiduePntrs_explicit(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResiduePntrs_explicitType residuePntrs_explicit) {
        this.residuePntrs_explicit = residuePntrs_explicit;
    }


    /**
     * Gets the residuePntrs_interval value for this ResiduePntrsType.
     * 
     * @return residuePntrs_interval
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResiduePntrs_intervalType getResiduePntrs_interval() {
        return residuePntrs_interval;
    }


    /**
     * Sets the residuePntrs_interval value for this ResiduePntrsType.
     * 
     * @param residuePntrs_interval
     */
    public void setResiduePntrs_interval(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResiduePntrs_intervalType residuePntrs_interval) {
        this.residuePntrs_interval = residuePntrs_interval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResiduePntrsType)) return false;
        ResiduePntrsType other = (ResiduePntrsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.residuePntrs_explicit==null && other.getResiduePntrs_explicit()==null) || 
             (this.residuePntrs_explicit!=null &&
              this.residuePntrs_explicit.equals(other.getResiduePntrs_explicit()))) &&
            ((this.residuePntrs_interval==null && other.getResiduePntrs_interval()==null) || 
             (this.residuePntrs_interval!=null &&
              this.residuePntrs_interval.equals(other.getResiduePntrs_interval())));
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
        if (getResiduePntrs_explicit() != null) {
            _hashCode += getResiduePntrs_explicit().hashCode();
        }
        if (getResiduePntrs_interval() != null) {
            _hashCode += getResiduePntrs_interval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResiduePntrsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-pntrsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residuePntrs_explicit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-pntrs_explicit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-pntrs_explicitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residuePntrs_interval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-pntrs_interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-pntrs_intervalType"));
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
