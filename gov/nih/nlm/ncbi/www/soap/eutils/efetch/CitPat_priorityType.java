/**
 * CitPat_priorityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CitPat_priorityType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentPriorityType[] patentPriority;

    public CitPat_priorityType() {
    }

    public CitPat_priorityType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentPriorityType[] patentPriority) {
           this.patentPriority = patentPriority;
    }


    /**
     * Gets the patentPriority value for this CitPat_priorityType.
     * 
     * @return patentPriority
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentPriorityType[] getPatentPriority() {
        return patentPriority;
    }


    /**
     * Sets the patentPriority value for this CitPat_priorityType.
     * 
     * @param patentPriority
     */
    public void setPatentPriority(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentPriorityType[] patentPriority) {
        this.patentPriority = patentPriority;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentPriorityType getPatentPriority(int i) {
        return this.patentPriority[i];
    }

    public void setPatentPriority(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PatentPriorityType _value) {
        this.patentPriority[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CitPat_priorityType)) return false;
        CitPat_priorityType other = (CitPat_priorityType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.patentPriority==null && other.getPatentPriority()==null) || 
             (this.patentPriority!=null &&
              java.util.Arrays.equals(this.patentPriority, other.getPatentPriority())));
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
        if (getPatentPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPatentPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPatentPriority(), i);
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
        new org.apache.axis.description.TypeDesc(CitPat_priorityType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-pat_priorityType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patentPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Patent-priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Patent-priorityType"));
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
