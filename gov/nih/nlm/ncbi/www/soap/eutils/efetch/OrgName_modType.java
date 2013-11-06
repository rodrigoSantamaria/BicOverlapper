/**
 * OrgName_modType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OrgName_modType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgModType[] orgMod;

    public OrgName_modType() {
    }

    public OrgName_modType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgModType[] orgMod) {
           this.orgMod = orgMod;
    }


    /**
     * Gets the orgMod value for this OrgName_modType.
     * 
     * @return orgMod
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgModType[] getOrgMod() {
        return orgMod;
    }


    /**
     * Sets the orgMod value for this OrgName_modType.
     * 
     * @param orgMod
     */
    public void setOrgMod(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgModType[] orgMod) {
        this.orgMod = orgMod;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgModType getOrgMod(int i) {
        return this.orgMod[i];
    }

    public void setOrgMod(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.OrgModType _value) {
        this.orgMod[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrgName_modType)) return false;
        OrgName_modType other = (OrgName_modType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgMod==null && other.getOrgMod()==null) || 
             (this.orgMod!=null &&
              java.util.Arrays.equals(this.orgMod, other.getOrgMod())));
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
        if (getOrgMod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrgMod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrgMod(), i);
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
        new org.apache.axis.description.TypeDesc(OrgName_modType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_modType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgMod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgMod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgModType"));
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
