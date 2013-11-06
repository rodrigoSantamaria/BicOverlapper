/**
 * ElectronicAccessListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ElectronicAccessListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElectronicAccessType[] electronicAccess;

    public ElectronicAccessListType() {
    }

    public ElectronicAccessListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElectronicAccessType[] electronicAccess) {
           this.electronicAccess = electronicAccess;
    }


    /**
     * Gets the electronicAccess value for this ElectronicAccessListType.
     * 
     * @return electronicAccess
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElectronicAccessType[] getElectronicAccess() {
        return electronicAccess;
    }


    /**
     * Sets the electronicAccess value for this ElectronicAccessListType.
     * 
     * @param electronicAccess
     */
    public void setElectronicAccess(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElectronicAccessType[] electronicAccess) {
        this.electronicAccess = electronicAccess;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElectronicAccessType getElectronicAccess(int i) {
        return this.electronicAccess[i];
    }

    public void setElectronicAccess(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElectronicAccessType _value) {
        this.electronicAccess[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicAccessListType)) return false;
        ElectronicAccessListType other = (ElectronicAccessListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.electronicAccess==null && other.getElectronicAccess()==null) || 
             (this.electronicAccess!=null &&
              java.util.Arrays.equals(this.electronicAccess, other.getElectronicAccess())));
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
        if (getElectronicAccess() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElectronicAccess());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElectronicAccess(), i);
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
        new org.apache.axis.description.TypeDesc(ElectronicAccessListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ElectronicAccessListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electronicAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ElectronicAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ElectronicAccessType"));
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
