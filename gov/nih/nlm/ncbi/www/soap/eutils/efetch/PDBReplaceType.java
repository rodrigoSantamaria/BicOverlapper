/**
 * PDBReplaceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PDBReplaceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBReplace_dateType PDBReplace_date;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBReplace_idsType PDBReplace_ids;

    public PDBReplaceType() {
    }

    public PDBReplaceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBReplace_dateType PDBReplace_date,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBReplace_idsType PDBReplace_ids) {
           this.PDBReplace_date = PDBReplace_date;
           this.PDBReplace_ids = PDBReplace_ids;
    }


    /**
     * Gets the PDBReplace_date value for this PDBReplaceType.
     * 
     * @return PDBReplace_date
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBReplace_dateType getPDBReplace_date() {
        return PDBReplace_date;
    }


    /**
     * Sets the PDBReplace_date value for this PDBReplaceType.
     * 
     * @param PDBReplace_date
     */
    public void setPDBReplace_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBReplace_dateType PDBReplace_date) {
        this.PDBReplace_date = PDBReplace_date;
    }


    /**
     * Gets the PDBReplace_ids value for this PDBReplaceType.
     * 
     * @return PDBReplace_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBReplace_idsType getPDBReplace_ids() {
        return PDBReplace_ids;
    }


    /**
     * Sets the PDBReplace_ids value for this PDBReplaceType.
     * 
     * @param PDBReplace_ids
     */
    public void setPDBReplace_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBReplace_idsType PDBReplace_ids) {
        this.PDBReplace_ids = PDBReplace_ids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PDBReplaceType)) return false;
        PDBReplaceType other = (PDBReplaceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PDBReplace_date==null && other.getPDBReplace_date()==null) || 
             (this.PDBReplace_date!=null &&
              this.PDBReplace_date.equals(other.getPDBReplace_date()))) &&
            ((this.PDBReplace_ids==null && other.getPDBReplace_ids()==null) || 
             (this.PDBReplace_ids!=null &&
              this.PDBReplace_ids.equals(other.getPDBReplace_ids())));
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
        if (getPDBReplace_date() != null) {
            _hashCode += getPDBReplace_date().hashCode();
        }
        if (getPDBReplace_ids() != null) {
            _hashCode += getPDBReplace_ids().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PDBReplaceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-replaceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBReplace_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-replace_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-replace_dateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBReplace_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-replace_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-replace_idsType"));
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
