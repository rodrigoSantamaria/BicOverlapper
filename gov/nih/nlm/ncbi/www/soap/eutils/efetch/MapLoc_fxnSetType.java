/**
 * MapLoc_fxnSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MapLoc_fxnSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FxnSetType[] fxnSet;

    public MapLoc_fxnSetType() {
    }

    public MapLoc_fxnSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FxnSetType[] fxnSet) {
           this.fxnSet = fxnSet;
    }


    /**
     * Gets the fxnSet value for this MapLoc_fxnSetType.
     * 
     * @return fxnSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FxnSetType[] getFxnSet() {
        return fxnSet;
    }


    /**
     * Sets the fxnSet value for this MapLoc_fxnSetType.
     * 
     * @param fxnSet
     */
    public void setFxnSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FxnSetType[] fxnSet) {
        this.fxnSet = fxnSet;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FxnSetType getFxnSet(int i) {
        return this.fxnSet[i];
    }

    public void setFxnSet(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.FxnSetType _value) {
        this.fxnSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapLoc_fxnSetType)) return false;
        MapLoc_fxnSetType other = (MapLoc_fxnSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fxnSet==null && other.getFxnSet()==null) || 
             (this.fxnSet!=null &&
              java.util.Arrays.equals(this.fxnSet, other.getFxnSet())));
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
        if (getFxnSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxnSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxnSet(), i);
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
        new org.apache.axis.description.TypeDesc(MapLoc_fxnSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_fxnSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxnSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FxnSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FxnSetType"));
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
