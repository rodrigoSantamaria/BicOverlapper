/**
 * ID2SSeqAssemblyInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqAssemblyInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAssemblyInfo_bioseqsType ID2SSeqAssemblyInfo_bioseqs;

    public ID2SSeqAssemblyInfoType() {
    }

    public ID2SSeqAssemblyInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAssemblyInfo_bioseqsType ID2SSeqAssemblyInfo_bioseqs) {
           this.ID2SSeqAssemblyInfo_bioseqs = ID2SSeqAssemblyInfo_bioseqs;
    }


    /**
     * Gets the ID2SSeqAssemblyInfo_bioseqs value for this ID2SSeqAssemblyInfoType.
     * 
     * @return ID2SSeqAssemblyInfo_bioseqs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAssemblyInfo_bioseqsType getID2SSeqAssemblyInfo_bioseqs() {
        return ID2SSeqAssemblyInfo_bioseqs;
    }


    /**
     * Sets the ID2SSeqAssemblyInfo_bioseqs value for this ID2SSeqAssemblyInfoType.
     * 
     * @param ID2SSeqAssemblyInfo_bioseqs
     */
    public void setID2SSeqAssemblyInfo_bioseqs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAssemblyInfo_bioseqsType ID2SSeqAssemblyInfo_bioseqs) {
        this.ID2SSeqAssemblyInfo_bioseqs = ID2SSeqAssemblyInfo_bioseqs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqAssemblyInfoType)) return false;
        ID2SSeqAssemblyInfoType other = (ID2SSeqAssemblyInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqAssemblyInfo_bioseqs==null && other.getID2SSeqAssemblyInfo_bioseqs()==null) || 
             (this.ID2SSeqAssemblyInfo_bioseqs!=null &&
              this.ID2SSeqAssemblyInfo_bioseqs.equals(other.getID2SSeqAssemblyInfo_bioseqs())));
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
        if (getID2SSeqAssemblyInfo_bioseqs() != null) {
            _hashCode += getID2SSeqAssemblyInfo_bioseqs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSeqAssemblyInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-assembly-InfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqAssemblyInfo_bioseqs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-assembly-Info_bioseqs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-assembly-Info_bioseqsType"));
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
