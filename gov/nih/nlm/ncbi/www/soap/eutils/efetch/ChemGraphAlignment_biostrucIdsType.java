/**
 * ChemGraphAlignment_biostrucIdsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ChemGraphAlignment_biostrucIdsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucIdType[] biostrucId;

    public ChemGraphAlignment_biostrucIdsType() {
    }

    public ChemGraphAlignment_biostrucIdsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucIdType[] biostrucId) {
           this.biostrucId = biostrucId;
    }


    /**
     * Gets the biostrucId value for this ChemGraphAlignment_biostrucIdsType.
     * 
     * @return biostrucId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucIdType[] getBiostrucId() {
        return biostrucId;
    }


    /**
     * Sets the biostrucId value for this ChemGraphAlignment_biostrucIdsType.
     * 
     * @param biostrucId
     */
    public void setBiostrucId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucIdType[] biostrucId) {
        this.biostrucId = biostrucId;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucIdType getBiostrucId(int i) {
        return this.biostrucId[i];
    }

    public void setBiostrucId(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucIdType _value) {
        this.biostrucId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChemGraphAlignment_biostrucIdsType)) return false;
        ChemGraphAlignment_biostrucIdsType other = (ChemGraphAlignment_biostrucIdsType) obj;
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
              java.util.Arrays.equals(this.biostrucId, other.getBiostrucId())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBiostrucId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBiostrucId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChemGraphAlignment_biostrucIdsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment_biostruc-idsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
