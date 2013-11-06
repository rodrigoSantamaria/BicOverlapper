/**
 * CitArt_fromType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CitArt_fromType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_from_journalType citArt_from_journal;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_from_bookType citArt_from_book;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_from_procType citArt_from_proc;

    public CitArt_fromType() {
    }

    public CitArt_fromType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_from_journalType citArt_from_journal,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_from_bookType citArt_from_book,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_from_procType citArt_from_proc) {
           this.citArt_from_journal = citArt_from_journal;
           this.citArt_from_book = citArt_from_book;
           this.citArt_from_proc = citArt_from_proc;
    }


    /**
     * Gets the citArt_from_journal value for this CitArt_fromType.
     * 
     * @return citArt_from_journal
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_from_journalType getCitArt_from_journal() {
        return citArt_from_journal;
    }


    /**
     * Sets the citArt_from_journal value for this CitArt_fromType.
     * 
     * @param citArt_from_journal
     */
    public void setCitArt_from_journal(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_from_journalType citArt_from_journal) {
        this.citArt_from_journal = citArt_from_journal;
    }


    /**
     * Gets the citArt_from_book value for this CitArt_fromType.
     * 
     * @return citArt_from_book
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_from_bookType getCitArt_from_book() {
        return citArt_from_book;
    }


    /**
     * Sets the citArt_from_book value for this CitArt_fromType.
     * 
     * @param citArt_from_book
     */
    public void setCitArt_from_book(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_from_bookType citArt_from_book) {
        this.citArt_from_book = citArt_from_book;
    }


    /**
     * Gets the citArt_from_proc value for this CitArt_fromType.
     * 
     * @return citArt_from_proc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_from_procType getCitArt_from_proc() {
        return citArt_from_proc;
    }


    /**
     * Sets the citArt_from_proc value for this CitArt_fromType.
     * 
     * @param citArt_from_proc
     */
    public void setCitArt_from_proc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_from_procType citArt_from_proc) {
        this.citArt_from_proc = citArt_from_proc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CitArt_fromType)) return false;
        CitArt_fromType other = (CitArt_fromType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citArt_from_journal==null && other.getCitArt_from_journal()==null) || 
             (this.citArt_from_journal!=null &&
              this.citArt_from_journal.equals(other.getCitArt_from_journal()))) &&
            ((this.citArt_from_book==null && other.getCitArt_from_book()==null) || 
             (this.citArt_from_book!=null &&
              this.citArt_from_book.equals(other.getCitArt_from_book()))) &&
            ((this.citArt_from_proc==null && other.getCitArt_from_proc()==null) || 
             (this.citArt_from_proc!=null &&
              this.citArt_from_proc.equals(other.getCitArt_from_proc())));
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
        if (getCitArt_from_journal() != null) {
            _hashCode += getCitArt_from_journal().hashCode();
        }
        if (getCitArt_from_book() != null) {
            _hashCode += getCitArt_from_book().hashCode();
        }
        if (getCitArt_from_proc() != null) {
            _hashCode += getCitArt_from_proc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CitArt_fromType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_fromType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citArt_from_journal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_from_journal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_from_journalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citArt_from_book");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_from_book"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_from_bookType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citArt_from_proc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_from_proc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_from_procType"));
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
