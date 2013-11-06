/**
 * Entrez2LinkCountList_linksType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2LinkCountList_linksType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountType[] entrez2LinkCount;

    public Entrez2LinkCountList_linksType() {
    }

    public Entrez2LinkCountList_linksType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountType[] entrez2LinkCount) {
           this.entrez2LinkCount = entrez2LinkCount;
    }


    /**
     * Gets the entrez2LinkCount value for this Entrez2LinkCountList_linksType.
     * 
     * @return entrez2LinkCount
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountType[] getEntrez2LinkCount() {
        return entrez2LinkCount;
    }


    /**
     * Sets the entrez2LinkCount value for this Entrez2LinkCountList_linksType.
     * 
     * @param entrez2LinkCount
     */
    public void setEntrez2LinkCount(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountType[] entrez2LinkCount) {
        this.entrez2LinkCount = entrez2LinkCount;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountType getEntrez2LinkCount(int i) {
        return this.entrez2LinkCount[i];
    }

    public void setEntrez2LinkCount(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountType _value) {
        this.entrez2LinkCount[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2LinkCountList_linksType)) return false;
        Entrez2LinkCountList_linksType other = (Entrez2LinkCountList_linksType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2LinkCount==null && other.getEntrez2LinkCount()==null) || 
             (this.entrez2LinkCount!=null &&
              java.util.Arrays.equals(this.entrez2LinkCount, other.getEntrez2LinkCount())));
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
        if (getEntrez2LinkCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntrez2LinkCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntrez2LinkCount(), i);
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
        new org.apache.axis.description.TypeDesc(Entrez2LinkCountList_linksType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-count-list_linksType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-countType"));
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
