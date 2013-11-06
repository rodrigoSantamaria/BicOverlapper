/**
 * BiostrucFeatureSet_descrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucFeatureSet_descrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetDescrType[] biostrucFeatureSetDescr;

    public BiostrucFeatureSet_descrType() {
    }

    public BiostrucFeatureSet_descrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetDescrType[] biostrucFeatureSetDescr) {
           this.biostrucFeatureSetDescr = biostrucFeatureSetDescr;
    }


    /**
     * Gets the biostrucFeatureSetDescr value for this BiostrucFeatureSet_descrType.
     * 
     * @return biostrucFeatureSetDescr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetDescrType[] getBiostrucFeatureSetDescr() {
        return biostrucFeatureSetDescr;
    }


    /**
     * Sets the biostrucFeatureSetDescr value for this BiostrucFeatureSet_descrType.
     * 
     * @param biostrucFeatureSetDescr
     */
    public void setBiostrucFeatureSetDescr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetDescrType[] biostrucFeatureSetDescr) {
        this.biostrucFeatureSetDescr = biostrucFeatureSetDescr;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetDescrType getBiostrucFeatureSetDescr(int i) {
        return this.biostrucFeatureSetDescr[i];
    }

    public void setBiostrucFeatureSetDescr(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetDescrType _value) {
        this.biostrucFeatureSetDescr[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucFeatureSet_descrType)) return false;
        BiostrucFeatureSet_descrType other = (BiostrucFeatureSet_descrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucFeatureSetDescr==null && other.getBiostrucFeatureSetDescr()==null) || 
             (this.biostrucFeatureSetDescr!=null &&
              java.util.Arrays.equals(this.biostrucFeatureSetDescr, other.getBiostrucFeatureSetDescr())));
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
        if (getBiostrucFeatureSetDescr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBiostrucFeatureSetDescr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBiostrucFeatureSetDescr(), i);
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
        new org.apache.axis.description.TypeDesc(BiostrucFeatureSet_descrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set_descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeatureSetDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set-descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set-descrType"));
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
