/**
 * BiostrucAnnotSet_featuresType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucAnnotSet_featuresType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetType[] biostrucFeatureSet;

    public BiostrucAnnotSet_featuresType() {
    }

    public BiostrucAnnotSet_featuresType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetType[] biostrucFeatureSet) {
           this.biostrucFeatureSet = biostrucFeatureSet;
    }


    /**
     * Gets the biostrucFeatureSet value for this BiostrucAnnotSet_featuresType.
     * 
     * @return biostrucFeatureSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetType[] getBiostrucFeatureSet() {
        return biostrucFeatureSet;
    }


    /**
     * Sets the biostrucFeatureSet value for this BiostrucAnnotSet_featuresType.
     * 
     * @param biostrucFeatureSet
     */
    public void setBiostrucFeatureSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetType[] biostrucFeatureSet) {
        this.biostrucFeatureSet = biostrucFeatureSet;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetType getBiostrucFeatureSet(int i) {
        return this.biostrucFeatureSet[i];
    }

    public void setBiostrucFeatureSet(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucFeatureSetType _value) {
        this.biostrucFeatureSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucAnnotSet_featuresType)) return false;
        BiostrucAnnotSet_featuresType other = (BiostrucAnnotSet_featuresType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucFeatureSet==null && other.getBiostrucFeatureSet()==null) || 
             (this.biostrucFeatureSet!=null &&
              java.util.Arrays.equals(this.biostrucFeatureSet, other.getBiostrucFeatureSet())));
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
        if (getBiostrucFeatureSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBiostrucFeatureSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBiostrucFeatureSet(), i);
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
        new org.apache.axis.description.TypeDesc(BiostrucAnnotSet_featuresType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-annot-set_featuresType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucFeatureSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-feature-setType"));
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
