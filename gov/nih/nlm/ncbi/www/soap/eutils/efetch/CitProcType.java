/**
 * CitProcType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CitProcType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProc_bookType citProc_book;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProc_meetType citProc_meet;

    public CitProcType() {
    }

    public CitProcType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProc_bookType citProc_book,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProc_meetType citProc_meet) {
           this.citProc_book = citProc_book;
           this.citProc_meet = citProc_meet;
    }


    /**
     * Gets the citProc_book value for this CitProcType.
     * 
     * @return citProc_book
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProc_bookType getCitProc_book() {
        return citProc_book;
    }


    /**
     * Sets the citProc_book value for this CitProcType.
     * 
     * @param citProc_book
     */
    public void setCitProc_book(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProc_bookType citProc_book) {
        this.citProc_book = citProc_book;
    }


    /**
     * Gets the citProc_meet value for this CitProcType.
     * 
     * @return citProc_meet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProc_meetType getCitProc_meet() {
        return citProc_meet;
    }


    /**
     * Sets the citProc_meet value for this CitProcType.
     * 
     * @param citProc_meet
     */
    public void setCitProc_meet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitProc_meetType citProc_meet) {
        this.citProc_meet = citProc_meet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CitProcType)) return false;
        CitProcType other = (CitProcType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citProc_book==null && other.getCitProc_book()==null) || 
             (this.citProc_book!=null &&
              this.citProc_book.equals(other.getCitProc_book()))) &&
            ((this.citProc_meet==null && other.getCitProc_meet()==null) || 
             (this.citProc_meet!=null &&
              this.citProc_meet.equals(other.getCitProc_meet())));
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
        if (getCitProc_book() != null) {
            _hashCode += getCitProc_book().hashCode();
        }
        if (getCitProc_meet() != null) {
            _hashCode += getCitProc_meet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CitProcType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-procType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citProc_book");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-proc_book"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-proc_bookType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citProc_meet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-proc_meet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-proc_meetType"));
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
