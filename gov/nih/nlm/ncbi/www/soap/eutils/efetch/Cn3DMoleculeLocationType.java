/**
 * Cn3DMoleculeLocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DMoleculeLocationType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocation_moleculeIdType cn3DMoleculeLocation_moleculeId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocation_residuesType cn3DMoleculeLocation_residues;

    public Cn3DMoleculeLocationType() {
    }

    public Cn3DMoleculeLocationType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocation_moleculeIdType cn3DMoleculeLocation_moleculeId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocation_residuesType cn3DMoleculeLocation_residues) {
           this.cn3DMoleculeLocation_moleculeId = cn3DMoleculeLocation_moleculeId;
           this.cn3DMoleculeLocation_residues = cn3DMoleculeLocation_residues;
    }


    /**
     * Gets the cn3DMoleculeLocation_moleculeId value for this Cn3DMoleculeLocationType.
     * 
     * @return cn3DMoleculeLocation_moleculeId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocation_moleculeIdType getCn3DMoleculeLocation_moleculeId() {
        return cn3DMoleculeLocation_moleculeId;
    }


    /**
     * Sets the cn3DMoleculeLocation_moleculeId value for this Cn3DMoleculeLocationType.
     * 
     * @param cn3DMoleculeLocation_moleculeId
     */
    public void setCn3DMoleculeLocation_moleculeId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocation_moleculeIdType cn3DMoleculeLocation_moleculeId) {
        this.cn3DMoleculeLocation_moleculeId = cn3DMoleculeLocation_moleculeId;
    }


    /**
     * Gets the cn3DMoleculeLocation_residues value for this Cn3DMoleculeLocationType.
     * 
     * @return cn3DMoleculeLocation_residues
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocation_residuesType getCn3DMoleculeLocation_residues() {
        return cn3DMoleculeLocation_residues;
    }


    /**
     * Sets the cn3DMoleculeLocation_residues value for this Cn3DMoleculeLocationType.
     * 
     * @param cn3DMoleculeLocation_residues
     */
    public void setCn3DMoleculeLocation_residues(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocation_residuesType cn3DMoleculeLocation_residues) {
        this.cn3DMoleculeLocation_residues = cn3DMoleculeLocation_residues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DMoleculeLocationType)) return false;
        Cn3DMoleculeLocationType other = (Cn3DMoleculeLocationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DMoleculeLocation_moleculeId==null && other.getCn3DMoleculeLocation_moleculeId()==null) || 
             (this.cn3DMoleculeLocation_moleculeId!=null &&
              this.cn3DMoleculeLocation_moleculeId.equals(other.getCn3DMoleculeLocation_moleculeId()))) &&
            ((this.cn3DMoleculeLocation_residues==null && other.getCn3DMoleculeLocation_residues()==null) || 
             (this.cn3DMoleculeLocation_residues!=null &&
              this.cn3DMoleculeLocation_residues.equals(other.getCn3DMoleculeLocation_residues())));
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
        if (getCn3DMoleculeLocation_moleculeId() != null) {
            _hashCode += getCn3DMoleculeLocation_moleculeId().hashCode();
        }
        if (getCn3DMoleculeLocation_residues() != null) {
            _hashCode += getCn3DMoleculeLocation_residues().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DMoleculeLocationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-molecule-locationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DMoleculeLocation_moleculeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-molecule-location_molecule-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-molecule-location_molecule-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DMoleculeLocation_residues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-molecule-location_residues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-molecule-location_residuesType"));
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
