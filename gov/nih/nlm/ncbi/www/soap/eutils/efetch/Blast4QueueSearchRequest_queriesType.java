/**
 * Blast4QueueSearchRequest_queriesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4QueueSearchRequest_queriesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4QueriesType blast4Queries;

    public Blast4QueueSearchRequest_queriesType() {
    }

    public Blast4QueueSearchRequest_queriesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4QueriesType blast4Queries) {
           this.blast4Queries = blast4Queries;
    }


    /**
     * Gets the blast4Queries value for this Blast4QueueSearchRequest_queriesType.
     * 
     * @return blast4Queries
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4QueriesType getBlast4Queries() {
        return blast4Queries;
    }


    /**
     * Sets the blast4Queries value for this Blast4QueueSearchRequest_queriesType.
     * 
     * @param blast4Queries
     */
    public void setBlast4Queries(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4QueriesType blast4Queries) {
        this.blast4Queries = blast4Queries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4QueueSearchRequest_queriesType)) return false;
        Blast4QueueSearchRequest_queriesType other = (Blast4QueueSearchRequest_queriesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Queries==null && other.getBlast4Queries()==null) || 
             (this.blast4Queries!=null &&
              this.blast4Queries.equals(other.getBlast4Queries())));
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
        if (getBlast4Queries() != null) {
            _hashCode += getBlast4Queries().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4QueueSearchRequest_queriesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queue-search-request_queriesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Queries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queriesType"));
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
