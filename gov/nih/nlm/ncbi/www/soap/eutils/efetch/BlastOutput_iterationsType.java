/**
 * BlastOutput_iterationsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BlastOutput_iterationsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IterationType[] iteration;

    public BlastOutput_iterationsType() {
    }

    public BlastOutput_iterationsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IterationType[] iteration) {
           this.iteration = iteration;
    }


    /**
     * Gets the iteration value for this BlastOutput_iterationsType.
     * 
     * @return iteration
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IterationType[] getIteration() {
        return iteration;
    }


    /**
     * Sets the iteration value for this BlastOutput_iterationsType.
     * 
     * @param iteration
     */
    public void setIteration(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IterationType[] iteration) {
        this.iteration = iteration;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IterationType getIteration(int i) {
        return this.iteration[i];
    }

    public void setIteration(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.IterationType _value) {
        this.iteration[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BlastOutput_iterationsType)) return false;
        BlastOutput_iterationsType other = (BlastOutput_iterationsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.iteration==null && other.getIteration()==null) || 
             (this.iteration!=null &&
              java.util.Arrays.equals(this.iteration, other.getIteration())));
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
        if (getIteration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIteration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIteration(), i);
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
        new org.apache.axis.description.TypeDesc(BlastOutput_iterationsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_iterationsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Iteration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "IterationType"));
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
