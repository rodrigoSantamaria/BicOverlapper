/**
 * MSModHit_modtypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSModHit_modtypeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModType MSMod;

    public MSModHit_modtypeType() {
    }

    public MSModHit_modtypeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModType MSMod) {
           this.MSMod = MSMod;
    }


    /**
     * Gets the MSMod value for this MSModHit_modtypeType.
     * 
     * @return MSMod
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModType getMSMod() {
        return MSMod;
    }


    /**
     * Sets the MSMod value for this MSModHit_modtypeType.
     * 
     * @param MSMod
     */
    public void setMSMod(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModType MSMod) {
        this.MSMod = MSMod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSModHit_modtypeType)) return false;
        MSModHit_modtypeType other = (MSModHit_modtypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSMod==null && other.getMSMod()==null) || 
             (this.MSMod!=null &&
              this.MSMod.equals(other.getMSMod())));
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
        if (getMSMod() != null) {
            _hashCode += getMSMod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSModHit_modtypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModHit_modtypeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSMod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSMod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModType"));
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
