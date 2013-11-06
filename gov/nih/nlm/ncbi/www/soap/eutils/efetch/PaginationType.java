/**
 * PaginationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PaginationType  implements java.io.Serializable {
    private java.lang.String startPage;

    private java.lang.String endPage;

    private java.lang.String medlinePgn;

    public PaginationType() {
    }

    public PaginationType(
           java.lang.String startPage,
           java.lang.String endPage,
           java.lang.String medlinePgn) {
           this.startPage = startPage;
           this.endPage = endPage;
           this.medlinePgn = medlinePgn;
    }


    /**
     * Gets the startPage value for this PaginationType.
     * 
     * @return startPage
     */
    public java.lang.String getStartPage() {
        return startPage;
    }


    /**
     * Sets the startPage value for this PaginationType.
     * 
     * @param startPage
     */
    public void setStartPage(java.lang.String startPage) {
        this.startPage = startPage;
    }


    /**
     * Gets the endPage value for this PaginationType.
     * 
     * @return endPage
     */
    public java.lang.String getEndPage() {
        return endPage;
    }


    /**
     * Sets the endPage value for this PaginationType.
     * 
     * @param endPage
     */
    public void setEndPage(java.lang.String endPage) {
        this.endPage = endPage;
    }


    /**
     * Gets the medlinePgn value for this PaginationType.
     * 
     * @return medlinePgn
     */
    public java.lang.String getMedlinePgn() {
        return medlinePgn;
    }


    /**
     * Sets the medlinePgn value for this PaginationType.
     * 
     * @param medlinePgn
     */
    public void setMedlinePgn(java.lang.String medlinePgn) {
        this.medlinePgn = medlinePgn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaginationType)) return false;
        PaginationType other = (PaginationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startPage==null && other.getStartPage()==null) || 
             (this.startPage!=null &&
              this.startPage.equals(other.getStartPage()))) &&
            ((this.endPage==null && other.getEndPage()==null) || 
             (this.endPage!=null &&
              this.endPage.equals(other.getEndPage()))) &&
            ((this.medlinePgn==null && other.getMedlinePgn()==null) || 
             (this.medlinePgn!=null &&
              this.medlinePgn.equals(other.getMedlinePgn())));
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
        if (getStartPage() != null) {
            _hashCode += getStartPage().hashCode();
        }
        if (getEndPage() != null) {
            _hashCode += getEndPage().hashCode();
        }
        if (getMedlinePgn() != null) {
            _hashCode += getMedlinePgn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaginationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PaginationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "StartPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EndPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlinePgn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MedlinePgn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
