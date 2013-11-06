/**
 * Cn3DObjectLocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DObjectLocationType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocation_structureIdType cn3DObjectLocation_structureId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocation_residuesType cn3DObjectLocation_residues;

    public Cn3DObjectLocationType() {
    }

    public Cn3DObjectLocationType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocation_structureIdType cn3DObjectLocation_structureId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocation_residuesType cn3DObjectLocation_residues) {
           this.cn3DObjectLocation_structureId = cn3DObjectLocation_structureId;
           this.cn3DObjectLocation_residues = cn3DObjectLocation_residues;
    }


    /**
     * Gets the cn3DObjectLocation_structureId value for this Cn3DObjectLocationType.
     * 
     * @return cn3DObjectLocation_structureId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocation_structureIdType getCn3DObjectLocation_structureId() {
        return cn3DObjectLocation_structureId;
    }


    /**
     * Sets the cn3DObjectLocation_structureId value for this Cn3DObjectLocationType.
     * 
     * @param cn3DObjectLocation_structureId
     */
    public void setCn3DObjectLocation_structureId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocation_structureIdType cn3DObjectLocation_structureId) {
        this.cn3DObjectLocation_structureId = cn3DObjectLocation_structureId;
    }


    /**
     * Gets the cn3DObjectLocation_residues value for this Cn3DObjectLocationType.
     * 
     * @return cn3DObjectLocation_residues
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocation_residuesType getCn3DObjectLocation_residues() {
        return cn3DObjectLocation_residues;
    }


    /**
     * Sets the cn3DObjectLocation_residues value for this Cn3DObjectLocationType.
     * 
     * @param cn3DObjectLocation_residues
     */
    public void setCn3DObjectLocation_residues(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DObjectLocation_residuesType cn3DObjectLocation_residues) {
        this.cn3DObjectLocation_residues = cn3DObjectLocation_residues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DObjectLocationType)) return false;
        Cn3DObjectLocationType other = (Cn3DObjectLocationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DObjectLocation_structureId==null && other.getCn3DObjectLocation_structureId()==null) || 
             (this.cn3DObjectLocation_structureId!=null &&
              this.cn3DObjectLocation_structureId.equals(other.getCn3DObjectLocation_structureId()))) &&
            ((this.cn3DObjectLocation_residues==null && other.getCn3DObjectLocation_residues()==null) || 
             (this.cn3DObjectLocation_residues!=null &&
              this.cn3DObjectLocation_residues.equals(other.getCn3DObjectLocation_residues())));
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
        if (getCn3DObjectLocation_structureId() != null) {
            _hashCode += getCn3DObjectLocation_structureId().hashCode();
        }
        if (getCn3DObjectLocation_residues() != null) {
            _hashCode += getCn3DObjectLocation_residues().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DObjectLocationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-object-locationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DObjectLocation_structureId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-object-location_structure-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-object-location_structure-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DObjectLocation_residues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-object-location_residues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-object-location_residuesType"));
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
