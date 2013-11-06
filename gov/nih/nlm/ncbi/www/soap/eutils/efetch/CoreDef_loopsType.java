/**
 * CoreDef_loopsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CoreDef_loopsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.LoopConstraintType[] loopConstraint;

    public CoreDef_loopsType() {
    }

    public CoreDef_loopsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.LoopConstraintType[] loopConstraint) {
           this.loopConstraint = loopConstraint;
    }


    /**
     * Gets the loopConstraint value for this CoreDef_loopsType.
     * 
     * @return loopConstraint
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.LoopConstraintType[] getLoopConstraint() {
        return loopConstraint;
    }


    /**
     * Sets the loopConstraint value for this CoreDef_loopsType.
     * 
     * @param loopConstraint
     */
    public void setLoopConstraint(gov.nih.nlm.ncbi.www.soap.eutils.efetch.LoopConstraintType[] loopConstraint) {
        this.loopConstraint = loopConstraint;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.LoopConstraintType getLoopConstraint(int i) {
        return this.loopConstraint[i];
    }

    public void setLoopConstraint(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.LoopConstraintType _value) {
        this.loopConstraint[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoreDef_loopsType)) return false;
        CoreDef_loopsType other = (CoreDef_loopsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loopConstraint==null && other.getLoopConstraint()==null) || 
             (this.loopConstraint!=null &&
              java.util.Arrays.equals(this.loopConstraint, other.getLoopConstraint())));
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
        if (getLoopConstraint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoopConstraint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoopConstraint(), i);
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
        new org.apache.axis.description.TypeDesc(CoreDef_loopsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreDef_loopsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loopConstraint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "LoopConstraint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "LoopConstraintType"));
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
