/**
 * GBSeq_secondaryAccessionsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBSeq_secondaryAccessionsType  implements java.io.Serializable {
    private java.lang.String[] GBSecondaryAccn;

    public GBSeq_secondaryAccessionsType() {
    }

    public GBSeq_secondaryAccessionsType(
           java.lang.String[] GBSecondaryAccn) {
           this.GBSecondaryAccn = GBSecondaryAccn;
    }


    /**
     * Gets the GBSecondaryAccn value for this GBSeq_secondaryAccessionsType.
     * 
     * @return GBSecondaryAccn
     */
    public java.lang.String[] getGBSecondaryAccn() {
        return GBSecondaryAccn;
    }


    /**
     * Sets the GBSecondaryAccn value for this GBSeq_secondaryAccessionsType.
     * 
     * @param GBSecondaryAccn
     */
    public void setGBSecondaryAccn(java.lang.String[] GBSecondaryAccn) {
        this.GBSecondaryAccn = GBSecondaryAccn;
    }

    public java.lang.String getGBSecondaryAccn(int i) {
        return this.GBSecondaryAccn[i];
    }

    public void setGBSecondaryAccn(int i, java.lang.String _value) {
        this.GBSecondaryAccn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBSeq_secondaryAccessionsType)) return false;
        GBSeq_secondaryAccessionsType other = (GBSeq_secondaryAccessionsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBSecondaryAccn==null && other.getGBSecondaryAccn()==null) || 
             (this.GBSecondaryAccn!=null &&
              java.util.Arrays.equals(this.GBSecondaryAccn, other.getGBSecondaryAccn())));
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
        if (getGBSecondaryAccn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGBSecondaryAccn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGBSecondaryAccn(), i);
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
        new org.apache.axis.description.TypeDesc(GBSeq_secondaryAccessionsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq_secondary-accessionsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSecondaryAccn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSecondary-accn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSecondary-accn"));
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
