/**
 * ResidueGraphPntr_biostrucType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResidueGraphPntr_biostrucType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphPntrType biostrucGraphPntr;

    public ResidueGraphPntr_biostrucType() {
    }

    public ResidueGraphPntr_biostrucType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphPntrType biostrucGraphPntr) {
           this.biostrucGraphPntr = biostrucGraphPntr;
    }


    /**
     * Gets the biostrucGraphPntr value for this ResidueGraphPntr_biostrucType.
     * 
     * @return biostrucGraphPntr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphPntrType getBiostrucGraphPntr() {
        return biostrucGraphPntr;
    }


    /**
     * Sets the biostrucGraphPntr value for this ResidueGraphPntr_biostrucType.
     * 
     * @param biostrucGraphPntr
     */
    public void setBiostrucGraphPntr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphPntrType biostrucGraphPntr) {
        this.biostrucGraphPntr = biostrucGraphPntr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResidueGraphPntr_biostrucType)) return false;
        ResidueGraphPntr_biostrucType other = (ResidueGraphPntr_biostrucType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucGraphPntr==null && other.getBiostrucGraphPntr()==null) || 
             (this.biostrucGraphPntr!=null &&
              this.biostrucGraphPntr.equals(other.getBiostrucGraphPntr())));
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
        if (getBiostrucGraphPntr() != null) {
            _hashCode += getBiostrucGraphPntr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResidueGraphPntr_biostrucType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph-pntr_biostrucType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucGraphPntr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph-pntr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph-pntrType"));
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
