/**
 * Cn3DObjectLocation_structureIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DObjectLocation_structureIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucIdType biostrucId;

    public Cn3DObjectLocation_structureIdType() {
    }

    public Cn3DObjectLocation_structureIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucIdType biostrucId) {
           this.biostrucId = biostrucId;
    }


    /**
     * Gets the biostrucId value for this Cn3DObjectLocation_structureIdType.
     * 
     * @return biostrucId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucIdType getBiostrucId() {
        return biostrucId;
    }


    /**
     * Sets the biostrucId value for this Cn3DObjectLocation_structureIdType.
     * 
     * @param biostrucId
     */
    public void setBiostrucId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucIdType biostrucId) {
        this.biostrucId = biostrucId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DObjectLocation_structureIdType)) return false;
        Cn3DObjectLocation_structureIdType other = (Cn3DObjectLocation_structureIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucId==null && other.getBiostrucId()==null) || 
             (this.biostrucId!=null &&
              this.biostrucId.equals(other.getBiostrucId())));
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
        if (getBiostrucId() != null) {
            _hashCode += getBiostrucId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DObjectLocation_structureIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-object-location_structure-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-idType"));
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
