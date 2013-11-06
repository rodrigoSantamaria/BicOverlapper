/**
 * Blast4QueueSearchRequest_subjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4QueueSearchRequest_subjectType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4SubjectType blast4Subject;

    public Blast4QueueSearchRequest_subjectType() {
    }

    public Blast4QueueSearchRequest_subjectType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4SubjectType blast4Subject) {
           this.blast4Subject = blast4Subject;
    }


    /**
     * Gets the blast4Subject value for this Blast4QueueSearchRequest_subjectType.
     * 
     * @return blast4Subject
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4SubjectType getBlast4Subject() {
        return blast4Subject;
    }


    /**
     * Sets the blast4Subject value for this Blast4QueueSearchRequest_subjectType.
     * 
     * @param blast4Subject
     */
    public void setBlast4Subject(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4SubjectType blast4Subject) {
        this.blast4Subject = blast4Subject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4QueueSearchRequest_subjectType)) return false;
        Blast4QueueSearchRequest_subjectType other = (Blast4QueueSearchRequest_subjectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Subject==null && other.getBlast4Subject()==null) || 
             (this.blast4Subject!=null &&
              this.blast4Subject.equals(other.getBlast4Subject())));
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
        if (getBlast4Subject() != null) {
            _hashCode += getBlast4Subject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4QueueSearchRequest_subjectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queue-search-request_subjectType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-subjectType"));
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
