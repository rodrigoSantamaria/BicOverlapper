/**
 * PubSet_procType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubSet_procType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProcType[] citProc;

    public PubSet_procType() {
    }

    public PubSet_procType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProcType[] citProc) {
           this.citProc = citProc;
    }


    /**
     * Gets the citProc value for this PubSet_procType.
     * 
     * @return citProc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProcType[] getCitProc() {
        return citProc;
    }


    /**
     * Sets the citProc value for this PubSet_procType.
     * 
     * @param citProc
     */
    public void setCitProc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProcType[] citProc) {
        this.citProc = citProc;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProcType getCitProc(int i) {
        return this.citProc[i];
    }

    public void setCitProc(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProcType _value) {
        this.citProc[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubSet_procType)) return false;
        PubSet_procType other = (PubSet_procType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citProc==null && other.getCitProc()==null) || 
             (this.citProc!=null &&
              java.util.Arrays.equals(this.citProc, other.getCitProc())));
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
        if (getCitProc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCitProc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCitProc(), i);
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
        new org.apache.axis.description.TypeDesc(PubSet_procType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_procType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citProc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-proc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-procType"));
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
