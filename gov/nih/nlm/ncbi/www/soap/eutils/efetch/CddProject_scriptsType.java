/**
 * CddProject_scriptsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddProject_scriptsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddScriptType[] cddScript;

    public CddProject_scriptsType() {
    }

    public CddProject_scriptsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddScriptType[] cddScript) {
           this.cddScript = cddScript;
    }


    /**
     * Gets the cddScript value for this CddProject_scriptsType.
     * 
     * @return cddScript
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddScriptType[] getCddScript() {
        return cddScript;
    }


    /**
     * Sets the cddScript value for this CddProject_scriptsType.
     * 
     * @param cddScript
     */
    public void setCddScript(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddScriptType[] cddScript) {
        this.cddScript = cddScript;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddScriptType getCddScript(int i) {
        return this.cddScript[i];
    }

    public void setCddScript(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddScriptType _value) {
        this.cddScript[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddProject_scriptsType)) return false;
        CddProject_scriptsType other = (CddProject_scriptsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddScript==null && other.getCddScript()==null) || 
             (this.cddScript!=null &&
              java.util.Arrays.equals(this.cddScript, other.getCddScript())));
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
        if (getCddScript() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCddScript());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCddScript(), i);
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
        new org.apache.axis.description.TypeDesc(CddProject_scriptsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Project_scriptsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddScript");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-Script"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-ScriptType"));
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
