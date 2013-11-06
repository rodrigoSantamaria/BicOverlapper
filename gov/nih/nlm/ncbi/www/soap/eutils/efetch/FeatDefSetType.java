/**
 * FeatDefSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class FeatDefSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefType[] featDef;

    public FeatDefSetType() {
    }

    public FeatDefSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefType[] featDef) {
           this.featDef = featDef;
    }


    /**
     * Gets the featDef value for this FeatDefSetType.
     * 
     * @return featDef
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefType[] getFeatDef() {
        return featDef;
    }


    /**
     * Sets the featDef value for this FeatDefSetType.
     * 
     * @param featDef
     */
    public void setFeatDef(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefType[] featDef) {
        this.featDef = featDef;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefType getFeatDef(int i) {
        return this.featDef[i];
    }

    public void setFeatDef(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.FeatDefType _value) {
        this.featDef[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatDefSetType)) return false;
        FeatDefSetType other = (FeatDefSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featDef==null && other.getFeatDef()==null) || 
             (this.featDef!=null &&
              java.util.Arrays.equals(this.featDef, other.getFeatDef())));
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
        if (getFeatDef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatDef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatDef(), i);
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
        new org.apache.axis.description.TypeDesc(FeatDefSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDefSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featDef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FeatDefType"));
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
