/**
 * ESpellResultMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.espell;

public class ESpellResultMS  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultType eSpellResult;

    public ESpellResultMS() {
    }

    public ESpellResultMS(
           gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultType eSpellResult) {
           this.eSpellResult = eSpellResult;
    }


    /**
     * Gets the eSpellResult value for this ESpellResultMS.
     * 
     * @return eSpellResult
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultType getESpellResult() {
        return eSpellResult;
    }


    /**
     * Sets the eSpellResult value for this ESpellResultMS.
     * 
     * @param eSpellResult
     */
    public void setESpellResult(gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultType eSpellResult) {
        this.eSpellResult = eSpellResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ESpellResultMS)) return false;
        ESpellResultMS other = (ESpellResultMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eSpellResult==null && other.getESpellResult()==null) || 
             (this.eSpellResult!=null &&
              this.eSpellResult.equals(other.getESpellResult())));
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
        if (getESpellResult() != null) {
            _hashCode += getESpellResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ESpellResultMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", ">eSpellResultMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESpellResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "eSpellResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "eSpellResultType"));
        elemField.setMinOccurs(0);
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
