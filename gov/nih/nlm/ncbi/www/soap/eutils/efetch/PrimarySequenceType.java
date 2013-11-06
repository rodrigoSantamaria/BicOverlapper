/**
 * PrimarySequenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PrimarySequenceType  implements java.io.Serializable {
    private java.lang.String primarySequence_dbSnpBuild;

    private java.lang.String primarySequence_gi;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequence_sourceType primarySequence_source;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequence_mapLocType primarySequence_mapLoc;

    public PrimarySequenceType() {
    }

    public PrimarySequenceType(
           java.lang.String primarySequence_dbSnpBuild,
           java.lang.String primarySequence_gi,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequence_sourceType primarySequence_source,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequence_mapLocType primarySequence_mapLoc) {
           this.primarySequence_dbSnpBuild = primarySequence_dbSnpBuild;
           this.primarySequence_gi = primarySequence_gi;
           this.primarySequence_source = primarySequence_source;
           this.primarySequence_mapLoc = primarySequence_mapLoc;
    }


    /**
     * Gets the primarySequence_dbSnpBuild value for this PrimarySequenceType.
     * 
     * @return primarySequence_dbSnpBuild
     */
    public java.lang.String getPrimarySequence_dbSnpBuild() {
        return primarySequence_dbSnpBuild;
    }


    /**
     * Sets the primarySequence_dbSnpBuild value for this PrimarySequenceType.
     * 
     * @param primarySequence_dbSnpBuild
     */
    public void setPrimarySequence_dbSnpBuild(java.lang.String primarySequence_dbSnpBuild) {
        this.primarySequence_dbSnpBuild = primarySequence_dbSnpBuild;
    }


    /**
     * Gets the primarySequence_gi value for this PrimarySequenceType.
     * 
     * @return primarySequence_gi
     */
    public java.lang.String getPrimarySequence_gi() {
        return primarySequence_gi;
    }


    /**
     * Sets the primarySequence_gi value for this PrimarySequenceType.
     * 
     * @param primarySequence_gi
     */
    public void setPrimarySequence_gi(java.lang.String primarySequence_gi) {
        this.primarySequence_gi = primarySequence_gi;
    }


    /**
     * Gets the primarySequence_source value for this PrimarySequenceType.
     * 
     * @return primarySequence_source
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequence_sourceType getPrimarySequence_source() {
        return primarySequence_source;
    }


    /**
     * Sets the primarySequence_source value for this PrimarySequenceType.
     * 
     * @param primarySequence_source
     */
    public void setPrimarySequence_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequence_sourceType primarySequence_source) {
        this.primarySequence_source = primarySequence_source;
    }


    /**
     * Gets the primarySequence_mapLoc value for this PrimarySequenceType.
     * 
     * @return primarySequence_mapLoc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequence_mapLocType getPrimarySequence_mapLoc() {
        return primarySequence_mapLoc;
    }


    /**
     * Sets the primarySequence_mapLoc value for this PrimarySequenceType.
     * 
     * @param primarySequence_mapLoc
     */
    public void setPrimarySequence_mapLoc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrimarySequence_mapLocType primarySequence_mapLoc) {
        this.primarySequence_mapLoc = primarySequence_mapLoc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrimarySequenceType)) return false;
        PrimarySequenceType other = (PrimarySequenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primarySequence_dbSnpBuild==null && other.getPrimarySequence_dbSnpBuild()==null) || 
             (this.primarySequence_dbSnpBuild!=null &&
              this.primarySequence_dbSnpBuild.equals(other.getPrimarySequence_dbSnpBuild()))) &&
            ((this.primarySequence_gi==null && other.getPrimarySequence_gi()==null) || 
             (this.primarySequence_gi!=null &&
              this.primarySequence_gi.equals(other.getPrimarySequence_gi()))) &&
            ((this.primarySequence_source==null && other.getPrimarySequence_source()==null) || 
             (this.primarySequence_source!=null &&
              this.primarySequence_source.equals(other.getPrimarySequence_source()))) &&
            ((this.primarySequence_mapLoc==null && other.getPrimarySequence_mapLoc()==null) || 
             (this.primarySequence_mapLoc!=null &&
              this.primarySequence_mapLoc.equals(other.getPrimarySequence_mapLoc())));
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
        if (getPrimarySequence_dbSnpBuild() != null) {
            _hashCode += getPrimarySequence_dbSnpBuild().hashCode();
        }
        if (getPrimarySequence_gi() != null) {
            _hashCode += getPrimarySequence_gi().hashCode();
        }
        if (getPrimarySequence_source() != null) {
            _hashCode += getPrimarySequence_source().hashCode();
        }
        if (getPrimarySequence_mapLoc() != null) {
            _hashCode += getPrimarySequence_mapLoc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrimarySequenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrimarySequenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySequence_dbSnpBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrimarySequence_dbSnpBuild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySequence_gi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrimarySequence_gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySequence_source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrimarySequence_source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrimarySequence_sourceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySequence_mapLoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrimarySequence_mapLoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrimarySequence_mapLocType"));
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
