/**
 * PssmParameters_constraintsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PssmParameters_constraintsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreDefType coreDef;

    public PssmParameters_constraintsType() {
    }

    public PssmParameters_constraintsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreDefType coreDef) {
           this.coreDef = coreDef;
    }


    /**
     * Gets the coreDef value for this PssmParameters_constraintsType.
     * 
     * @return coreDef
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreDefType getCoreDef() {
        return coreDef;
    }


    /**
     * Sets the coreDef value for this PssmParameters_constraintsType.
     * 
     * @param coreDef
     */
    public void setCoreDef(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreDefType coreDef) {
        this.coreDef = coreDef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssmParameters_constraintsType)) return false;
        PssmParameters_constraintsType other = (PssmParameters_constraintsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coreDef==null && other.getCoreDef()==null) || 
             (this.coreDef!=null &&
              this.coreDef.equals(other.getCoreDef())));
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
        if (getCoreDef() != null) {
            _hashCode += getCoreDef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssmParameters_constraintsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmParameters_constraintsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreDef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreDef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreDefType"));
        elemField.setNillable(false);
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
