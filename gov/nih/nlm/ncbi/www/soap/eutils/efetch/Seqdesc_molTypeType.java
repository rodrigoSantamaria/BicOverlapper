/**
 * Seqdesc_molTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Seqdesc_molTypeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GIBBMolType GIBBMol;

    public Seqdesc_molTypeType() {
    }

    public Seqdesc_molTypeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GIBBMolType GIBBMol) {
           this.GIBBMol = GIBBMol;
    }


    /**
     * Gets the GIBBMol value for this Seqdesc_molTypeType.
     * 
     * @return GIBBMol
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GIBBMolType getGIBBMol() {
        return GIBBMol;
    }


    /**
     * Sets the GIBBMol value for this Seqdesc_molTypeType.
     * 
     * @param GIBBMol
     */
    public void setGIBBMol(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GIBBMolType GIBBMol) {
        this.GIBBMol = GIBBMol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Seqdesc_molTypeType)) return false;
        Seqdesc_molTypeType other = (Seqdesc_molTypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GIBBMol==null && other.getGIBBMol()==null) || 
             (this.GIBBMol!=null &&
              this.GIBBMol.equals(other.getGIBBMol())));
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
        if (getGIBBMol() != null) {
            _hashCode += getGIBBMol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Seqdesc_molTypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_mol-typeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GIBBMol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GIBB-mol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GIBB-molType"));
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
