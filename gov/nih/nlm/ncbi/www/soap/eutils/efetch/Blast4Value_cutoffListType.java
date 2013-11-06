/**
 * Blast4Value_cutoffListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Value_cutoffListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4CutoffType[] blast4Cutoff;

    public Blast4Value_cutoffListType() {
    }

    public Blast4Value_cutoffListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4CutoffType[] blast4Cutoff) {
           this.blast4Cutoff = blast4Cutoff;
    }


    /**
     * Gets the blast4Cutoff value for this Blast4Value_cutoffListType.
     * 
     * @return blast4Cutoff
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4CutoffType[] getBlast4Cutoff() {
        return blast4Cutoff;
    }


    /**
     * Sets the blast4Cutoff value for this Blast4Value_cutoffListType.
     * 
     * @param blast4Cutoff
     */
    public void setBlast4Cutoff(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4CutoffType[] blast4Cutoff) {
        this.blast4Cutoff = blast4Cutoff;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4CutoffType getBlast4Cutoff(int i) {
        return this.blast4Cutoff[i];
    }

    public void setBlast4Cutoff(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4CutoffType _value) {
        this.blast4Cutoff[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Value_cutoffListType)) return false;
        Blast4Value_cutoffListType other = (Blast4Value_cutoffListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Cutoff==null && other.getBlast4Cutoff()==null) || 
             (this.blast4Cutoff!=null &&
              java.util.Arrays.equals(this.blast4Cutoff, other.getBlast4Cutoff())));
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
        if (getBlast4Cutoff() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlast4Cutoff());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlast4Cutoff(), i);
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
        new org.apache.axis.description.TypeDesc(Blast4Value_cutoffListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-value_cutoff-listType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Cutoff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-cutoff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-cutoffType"));
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
