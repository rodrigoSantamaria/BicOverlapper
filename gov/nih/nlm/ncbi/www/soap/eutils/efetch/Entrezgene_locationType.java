/**
 * Entrezgene_locationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrezgene_locationType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapsType[] maps;

    public Entrezgene_locationType() {
    }

    public Entrezgene_locationType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapsType[] maps) {
           this.maps = maps;
    }


    /**
     * Gets the maps value for this Entrezgene_locationType.
     * 
     * @return maps
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapsType[] getMaps() {
        return maps;
    }


    /**
     * Sets the maps value for this Entrezgene_locationType.
     * 
     * @param maps
     */
    public void setMaps(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapsType[] maps) {
        this.maps = maps;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapsType getMaps(int i) {
        return this.maps[i];
    }

    public void setMaps(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapsType _value) {
        this.maps[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrezgene_locationType)) return false;
        Entrezgene_locationType other = (Entrezgene_locationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maps==null && other.getMaps()==null) || 
             (this.maps!=null &&
              java.util.Arrays.equals(this.maps, other.getMaps())));
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
        if (getMaps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaps(), i);
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
        new org.apache.axis.description.TypeDesc(Entrezgene_locationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrezgene_locationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Maps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapsType"));
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
