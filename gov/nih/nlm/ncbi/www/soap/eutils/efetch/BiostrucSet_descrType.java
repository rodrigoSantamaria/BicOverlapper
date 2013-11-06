/**
 * BiostrucSet_descrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucSet_descrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescrType[] biostrucDescr;

    public BiostrucSet_descrType() {
    }

    public BiostrucSet_descrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescrType[] biostrucDescr) {
           this.biostrucDescr = biostrucDescr;
    }


    /**
     * Gets the biostrucDescr value for this BiostrucSet_descrType.
     * 
     * @return biostrucDescr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescrType[] getBiostrucDescr() {
        return biostrucDescr;
    }


    /**
     * Sets the biostrucDescr value for this BiostrucSet_descrType.
     * 
     * @param biostrucDescr
     */
    public void setBiostrucDescr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescrType[] biostrucDescr) {
        this.biostrucDescr = biostrucDescr;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescrType getBiostrucDescr(int i) {
        return this.biostrucDescr[i];
    }

    public void setBiostrucDescr(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucDescrType _value) {
        this.biostrucDescr[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucSet_descrType)) return false;
        BiostrucSet_descrType other = (BiostrucSet_descrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucDescr==null && other.getBiostrucDescr()==null) || 
             (this.biostrucDescr!=null &&
              java.util.Arrays.equals(this.biostrucDescr, other.getBiostrucDescr())));
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
        if (getBiostrucDescr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBiostrucDescr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBiostrucDescr(), i);
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
        new org.apache.axis.description.TypeDesc(BiostrucSet_descrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-set_descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-descrType"));
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
