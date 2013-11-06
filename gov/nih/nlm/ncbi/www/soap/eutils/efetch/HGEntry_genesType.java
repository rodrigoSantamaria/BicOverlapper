/**
 * HGEntry_genesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGEntry_genesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGeneType[] HGGene;

    public HGEntry_genesType() {
    }

    public HGEntry_genesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGeneType[] HGGene) {
           this.HGGene = HGGene;
    }


    /**
     * Gets the HGGene value for this HGEntry_genesType.
     * 
     * @return HGGene
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGeneType[] getHGGene() {
        return HGGene;
    }


    /**
     * Sets the HGGene value for this HGEntry_genesType.
     * 
     * @param HGGene
     */
    public void setHGGene(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGeneType[] HGGene) {
        this.HGGene = HGGene;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGeneType getHGGene(int i) {
        return this.HGGene[i];
    }

    public void setHGGene(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGeneType _value) {
        this.HGGene[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGEntry_genesType)) return false;
        HGEntry_genesType other = (HGEntry_genesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGGene==null && other.getHGGene()==null) || 
             (this.HGGene!=null &&
              java.util.Arrays.equals(this.HGGene, other.getHGGene())));
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
        if (getHGGene() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHGGene());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHGGene(), i);
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
        new org.apache.axis.description.TypeDesc(HGEntry_genesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry_genesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-GeneType"));
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
