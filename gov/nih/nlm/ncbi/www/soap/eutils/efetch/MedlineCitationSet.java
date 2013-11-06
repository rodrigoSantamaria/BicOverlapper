/**
 * MedlineCitationSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineCitationSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationType[] medlineCitation;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeleteCitationType deleteCitation;

    public MedlineCitationSet() {
    }

    public MedlineCitationSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationType[] medlineCitation,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeleteCitationType deleteCitation) {
           this.medlineCitation = medlineCitation;
           this.deleteCitation = deleteCitation;
    }


    /**
     * Gets the medlineCitation value for this MedlineCitationSet.
     * 
     * @return medlineCitation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationType[] getMedlineCitation() {
        return medlineCitation;
    }


    /**
     * Sets the medlineCitation value for this MedlineCitationSet.
     * 
     * @param medlineCitation
     */
    public void setMedlineCitation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationType[] medlineCitation) {
        this.medlineCitation = medlineCitation;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationType getMedlineCitation(int i) {
        return this.medlineCitation[i];
    }

    public void setMedlineCitation(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineCitationType _value) {
        this.medlineCitation[i] = _value;
    }


    /**
     * Gets the deleteCitation value for this MedlineCitationSet.
     * 
     * @return deleteCitation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeleteCitationType getDeleteCitation() {
        return deleteCitation;
    }


    /**
     * Sets the deleteCitation value for this MedlineCitationSet.
     * 
     * @param deleteCitation
     */
    public void setDeleteCitation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeleteCitationType deleteCitation) {
        this.deleteCitation = deleteCitation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineCitationSet)) return false;
        MedlineCitationSet other = (MedlineCitationSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlineCitation==null && other.getMedlineCitation()==null) || 
             (this.medlineCitation!=null &&
              java.util.Arrays.equals(this.medlineCitation, other.getMedlineCitation()))) &&
            ((this.deleteCitation==null && other.getDeleteCitation()==null) || 
             (this.deleteCitation!=null &&
              this.deleteCitation.equals(other.getDeleteCitation())));
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
        if (getMedlineCitation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMedlineCitation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMedlineCitation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeleteCitation() != null) {
            _hashCode += getDeleteCitation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedlineCitationSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">MedlineCitationSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineCitation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MedlineCitation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MedlineCitationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteCitation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DeleteCitation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DeleteCitationType"));
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
