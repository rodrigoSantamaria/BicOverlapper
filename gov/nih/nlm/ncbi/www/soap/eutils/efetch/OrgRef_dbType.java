/**
 * OrgRef_dbType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OrgRef_dbType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DbtagType[] dbtag;

    public OrgRef_dbType() {
    }

    public OrgRef_dbType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DbtagType[] dbtag) {
           this.dbtag = dbtag;
    }


    /**
     * Gets the dbtag value for this OrgRef_dbType.
     * 
     * @return dbtag
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DbtagType[] getDbtag() {
        return dbtag;
    }


    /**
     * Sets the dbtag value for this OrgRef_dbType.
     * 
     * @param dbtag
     */
    public void setDbtag(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DbtagType[] dbtag) {
        this.dbtag = dbtag;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DbtagType getDbtag(int i) {
        return this.dbtag[i];
    }

    public void setDbtag(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.DbtagType _value) {
        this.dbtag[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrgRef_dbType)) return false;
        OrgRef_dbType other = (OrgRef_dbType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dbtag==null && other.getDbtag()==null) || 
             (this.dbtag!=null &&
              java.util.Arrays.equals(this.dbtag, other.getDbtag())));
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
        if (getDbtag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDbtag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDbtag(), i);
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
        new org.apache.axis.description.TypeDesc(OrgRef_dbType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Org-ref_dbType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbtag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dbtag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DbtagType"));
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
