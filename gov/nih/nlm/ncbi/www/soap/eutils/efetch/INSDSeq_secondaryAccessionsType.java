/**
 * INSDSeq_secondaryAccessionsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class INSDSeq_secondaryAccessionsType  implements java.io.Serializable {
    private java.lang.String[] INSDSecondaryAccn;

    public INSDSeq_secondaryAccessionsType() {
    }

    public INSDSeq_secondaryAccessionsType(
           java.lang.String[] INSDSecondaryAccn) {
           this.INSDSecondaryAccn = INSDSecondaryAccn;
    }


    /**
     * Gets the INSDSecondaryAccn value for this INSDSeq_secondaryAccessionsType.
     * 
     * @return INSDSecondaryAccn
     */
    public java.lang.String[] getINSDSecondaryAccn() {
        return INSDSecondaryAccn;
    }


    /**
     * Sets the INSDSecondaryAccn value for this INSDSeq_secondaryAccessionsType.
     * 
     * @param INSDSecondaryAccn
     */
    public void setINSDSecondaryAccn(java.lang.String[] INSDSecondaryAccn) {
        this.INSDSecondaryAccn = INSDSecondaryAccn;
    }

    public java.lang.String getINSDSecondaryAccn(int i) {
        return this.INSDSecondaryAccn[i];
    }

    public void setINSDSecondaryAccn(int i, java.lang.String _value) {
        this.INSDSecondaryAccn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSDSeq_secondaryAccessionsType)) return false;
        INSDSeq_secondaryAccessionsType other = (INSDSeq_secondaryAccessionsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSDSecondaryAccn==null && other.getINSDSecondaryAccn()==null) || 
             (this.INSDSecondaryAccn!=null &&
              java.util.Arrays.equals(this.INSDSecondaryAccn, other.getINSDSecondaryAccn())));
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
        if (getINSDSecondaryAccn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getINSDSecondaryAccn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getINSDSecondaryAccn(), i);
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
        new org.apache.axis.description.TypeDesc(INSDSeq_secondaryAccessionsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq_secondary-accessionsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSecondaryAccn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSecondary-accn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSecondary-accn"));
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
