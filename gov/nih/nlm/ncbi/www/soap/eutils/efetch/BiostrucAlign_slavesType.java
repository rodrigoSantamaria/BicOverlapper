/**
 * BiostrucAlign_slavesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucAlign_slavesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucType[] biostruc;

    public BiostrucAlign_slavesType() {
    }

    public BiostrucAlign_slavesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucType[] biostruc) {
           this.biostruc = biostruc;
    }


    /**
     * Gets the biostruc value for this BiostrucAlign_slavesType.
     * 
     * @return biostruc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucType[] getBiostruc() {
        return biostruc;
    }


    /**
     * Sets the biostruc value for this BiostrucAlign_slavesType.
     * 
     * @param biostruc
     */
    public void setBiostruc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucType[] biostruc) {
        this.biostruc = biostruc;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucType getBiostruc(int i) {
        return this.biostruc[i];
    }

    public void setBiostruc(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucType _value) {
        this.biostruc[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucAlign_slavesType)) return false;
        BiostrucAlign_slavesType other = (BiostrucAlign_slavesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostruc==null && other.getBiostruc()==null) || 
             (this.biostruc!=null &&
              java.util.Arrays.equals(this.biostruc, other.getBiostruc())));
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
        if (getBiostruc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBiostruc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBiostruc(), i);
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
        new org.apache.axis.description.TypeDesc(BiostrucAlign_slavesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-align_slavesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostruc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BiostrucType"));
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
