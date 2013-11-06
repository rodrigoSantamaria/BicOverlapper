/**
 * AlignAnnotType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AlignAnnotType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignAnnot_locationType alignAnnot_location;

    private java.lang.String alignAnnot_description;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignAnnot_evidenceType alignAnnot_evidence;

    public AlignAnnotType() {
    }

    public AlignAnnotType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignAnnot_locationType alignAnnot_location,
           java.lang.String alignAnnot_description,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignAnnot_evidenceType alignAnnot_evidence) {
           this.alignAnnot_location = alignAnnot_location;
           this.alignAnnot_description = alignAnnot_description;
           this.alignAnnot_evidence = alignAnnot_evidence;
    }


    /**
     * Gets the alignAnnot_location value for this AlignAnnotType.
     * 
     * @return alignAnnot_location
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignAnnot_locationType getAlignAnnot_location() {
        return alignAnnot_location;
    }


    /**
     * Sets the alignAnnot_location value for this AlignAnnotType.
     * 
     * @param alignAnnot_location
     */
    public void setAlignAnnot_location(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignAnnot_locationType alignAnnot_location) {
        this.alignAnnot_location = alignAnnot_location;
    }


    /**
     * Gets the alignAnnot_description value for this AlignAnnotType.
     * 
     * @return alignAnnot_description
     */
    public java.lang.String getAlignAnnot_description() {
        return alignAnnot_description;
    }


    /**
     * Sets the alignAnnot_description value for this AlignAnnotType.
     * 
     * @param alignAnnot_description
     */
    public void setAlignAnnot_description(java.lang.String alignAnnot_description) {
        this.alignAnnot_description = alignAnnot_description;
    }


    /**
     * Gets the alignAnnot_evidence value for this AlignAnnotType.
     * 
     * @return alignAnnot_evidence
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignAnnot_evidenceType getAlignAnnot_evidence() {
        return alignAnnot_evidence;
    }


    /**
     * Sets the alignAnnot_evidence value for this AlignAnnotType.
     * 
     * @param alignAnnot_evidence
     */
    public void setAlignAnnot_evidence(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AlignAnnot_evidenceType alignAnnot_evidence) {
        this.alignAnnot_evidence = alignAnnot_evidence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlignAnnotType)) return false;
        AlignAnnotType other = (AlignAnnotType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alignAnnot_location==null && other.getAlignAnnot_location()==null) || 
             (this.alignAnnot_location!=null &&
              this.alignAnnot_location.equals(other.getAlignAnnot_location()))) &&
            ((this.alignAnnot_description==null && other.getAlignAnnot_description()==null) || 
             (this.alignAnnot_description!=null &&
              this.alignAnnot_description.equals(other.getAlignAnnot_description()))) &&
            ((this.alignAnnot_evidence==null && other.getAlignAnnot_evidence()==null) || 
             (this.alignAnnot_evidence!=null &&
              this.alignAnnot_evidence.equals(other.getAlignAnnot_evidence())));
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
        if (getAlignAnnot_location() != null) {
            _hashCode += getAlignAnnot_location().hashCode();
        }
        if (getAlignAnnot_description() != null) {
            _hashCode += getAlignAnnot_description().hashCode();
        }
        if (getAlignAnnot_evidence() != null) {
            _hashCode += getAlignAnnot_evidence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlignAnnotType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-annotType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignAnnot_location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-annot_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-annot_locationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignAnnot_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-annot_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alignAnnot_evidence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-annot_evidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Align-annot_evidenceType"));
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
