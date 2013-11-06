/**
 * Blast4SubjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4SubjectType  implements java.io.Serializable {
    private java.lang.String blast4Subject_database;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Subject_sequencesType blast4Subject_sequences;

    public Blast4SubjectType() {
    }

    public Blast4SubjectType(
           java.lang.String blast4Subject_database,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Subject_sequencesType blast4Subject_sequences) {
           this.blast4Subject_database = blast4Subject_database;
           this.blast4Subject_sequences = blast4Subject_sequences;
    }


    /**
     * Gets the blast4Subject_database value for this Blast4SubjectType.
     * 
     * @return blast4Subject_database
     */
    public java.lang.String getBlast4Subject_database() {
        return blast4Subject_database;
    }


    /**
     * Sets the blast4Subject_database value for this Blast4SubjectType.
     * 
     * @param blast4Subject_database
     */
    public void setBlast4Subject_database(java.lang.String blast4Subject_database) {
        this.blast4Subject_database = blast4Subject_database;
    }


    /**
     * Gets the blast4Subject_sequences value for this Blast4SubjectType.
     * 
     * @return blast4Subject_sequences
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Subject_sequencesType getBlast4Subject_sequences() {
        return blast4Subject_sequences;
    }


    /**
     * Sets the blast4Subject_sequences value for this Blast4SubjectType.
     * 
     * @param blast4Subject_sequences
     */
    public void setBlast4Subject_sequences(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Subject_sequencesType blast4Subject_sequences) {
        this.blast4Subject_sequences = blast4Subject_sequences;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4SubjectType)) return false;
        Blast4SubjectType other = (Blast4SubjectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Subject_database==null && other.getBlast4Subject_database()==null) || 
             (this.blast4Subject_database!=null &&
              this.blast4Subject_database.equals(other.getBlast4Subject_database()))) &&
            ((this.blast4Subject_sequences==null && other.getBlast4Subject_sequences()==null) || 
             (this.blast4Subject_sequences!=null &&
              this.blast4Subject_sequences.equals(other.getBlast4Subject_sequences())));
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
        if (getBlast4Subject_database() != null) {
            _hashCode += getBlast4Subject_database().hashCode();
        }
        if (getBlast4Subject_sequences() != null) {
            _hashCode += getBlast4Subject_sequences().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4SubjectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-subjectType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Subject_database");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-subject_database"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Subject_sequences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-subject_sequences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-subject_sequencesType"));
        elemField.setMinOccurs(0);
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
