/**
 * NameStdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NameStdType  implements java.io.Serializable {
    private java.lang.String nameStd_last;

    private java.lang.String nameStd_first;

    private java.lang.String nameStd_middle;

    private java.lang.String nameStd_full;

    private java.lang.String nameStd_initials;

    private java.lang.String nameStd_suffix;

    private java.lang.String nameStd_title;

    public NameStdType() {
    }

    public NameStdType(
           java.lang.String nameStd_last,
           java.lang.String nameStd_first,
           java.lang.String nameStd_middle,
           java.lang.String nameStd_full,
           java.lang.String nameStd_initials,
           java.lang.String nameStd_suffix,
           java.lang.String nameStd_title) {
           this.nameStd_last = nameStd_last;
           this.nameStd_first = nameStd_first;
           this.nameStd_middle = nameStd_middle;
           this.nameStd_full = nameStd_full;
           this.nameStd_initials = nameStd_initials;
           this.nameStd_suffix = nameStd_suffix;
           this.nameStd_title = nameStd_title;
    }


    /**
     * Gets the nameStd_last value for this NameStdType.
     * 
     * @return nameStd_last
     */
    public java.lang.String getNameStd_last() {
        return nameStd_last;
    }


    /**
     * Sets the nameStd_last value for this NameStdType.
     * 
     * @param nameStd_last
     */
    public void setNameStd_last(java.lang.String nameStd_last) {
        this.nameStd_last = nameStd_last;
    }


    /**
     * Gets the nameStd_first value for this NameStdType.
     * 
     * @return nameStd_first
     */
    public java.lang.String getNameStd_first() {
        return nameStd_first;
    }


    /**
     * Sets the nameStd_first value for this NameStdType.
     * 
     * @param nameStd_first
     */
    public void setNameStd_first(java.lang.String nameStd_first) {
        this.nameStd_first = nameStd_first;
    }


    /**
     * Gets the nameStd_middle value for this NameStdType.
     * 
     * @return nameStd_middle
     */
    public java.lang.String getNameStd_middle() {
        return nameStd_middle;
    }


    /**
     * Sets the nameStd_middle value for this NameStdType.
     * 
     * @param nameStd_middle
     */
    public void setNameStd_middle(java.lang.String nameStd_middle) {
        this.nameStd_middle = nameStd_middle;
    }


    /**
     * Gets the nameStd_full value for this NameStdType.
     * 
     * @return nameStd_full
     */
    public java.lang.String getNameStd_full() {
        return nameStd_full;
    }


    /**
     * Sets the nameStd_full value for this NameStdType.
     * 
     * @param nameStd_full
     */
    public void setNameStd_full(java.lang.String nameStd_full) {
        this.nameStd_full = nameStd_full;
    }


    /**
     * Gets the nameStd_initials value for this NameStdType.
     * 
     * @return nameStd_initials
     */
    public java.lang.String getNameStd_initials() {
        return nameStd_initials;
    }


    /**
     * Sets the nameStd_initials value for this NameStdType.
     * 
     * @param nameStd_initials
     */
    public void setNameStd_initials(java.lang.String nameStd_initials) {
        this.nameStd_initials = nameStd_initials;
    }


    /**
     * Gets the nameStd_suffix value for this NameStdType.
     * 
     * @return nameStd_suffix
     */
    public java.lang.String getNameStd_suffix() {
        return nameStd_suffix;
    }


    /**
     * Sets the nameStd_suffix value for this NameStdType.
     * 
     * @param nameStd_suffix
     */
    public void setNameStd_suffix(java.lang.String nameStd_suffix) {
        this.nameStd_suffix = nameStd_suffix;
    }


    /**
     * Gets the nameStd_title value for this NameStdType.
     * 
     * @return nameStd_title
     */
    public java.lang.String getNameStd_title() {
        return nameStd_title;
    }


    /**
     * Sets the nameStd_title value for this NameStdType.
     * 
     * @param nameStd_title
     */
    public void setNameStd_title(java.lang.String nameStd_title) {
        this.nameStd_title = nameStd_title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameStdType)) return false;
        NameStdType other = (NameStdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nameStd_last==null && other.getNameStd_last()==null) || 
             (this.nameStd_last!=null &&
              this.nameStd_last.equals(other.getNameStd_last()))) &&
            ((this.nameStd_first==null && other.getNameStd_first()==null) || 
             (this.nameStd_first!=null &&
              this.nameStd_first.equals(other.getNameStd_first()))) &&
            ((this.nameStd_middle==null && other.getNameStd_middle()==null) || 
             (this.nameStd_middle!=null &&
              this.nameStd_middle.equals(other.getNameStd_middle()))) &&
            ((this.nameStd_full==null && other.getNameStd_full()==null) || 
             (this.nameStd_full!=null &&
              this.nameStd_full.equals(other.getNameStd_full()))) &&
            ((this.nameStd_initials==null && other.getNameStd_initials()==null) || 
             (this.nameStd_initials!=null &&
              this.nameStd_initials.equals(other.getNameStd_initials()))) &&
            ((this.nameStd_suffix==null && other.getNameStd_suffix()==null) || 
             (this.nameStd_suffix!=null &&
              this.nameStd_suffix.equals(other.getNameStd_suffix()))) &&
            ((this.nameStd_title==null && other.getNameStd_title()==null) || 
             (this.nameStd_title!=null &&
              this.nameStd_title.equals(other.getNameStd_title())));
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
        if (getNameStd_last() != null) {
            _hashCode += getNameStd_last().hashCode();
        }
        if (getNameStd_first() != null) {
            _hashCode += getNameStd_first().hashCode();
        }
        if (getNameStd_middle() != null) {
            _hashCode += getNameStd_middle().hashCode();
        }
        if (getNameStd_full() != null) {
            _hashCode += getNameStd_full().hashCode();
        }
        if (getNameStd_initials() != null) {
            _hashCode += getNameStd_initials().hashCode();
        }
        if (getNameStd_suffix() != null) {
            _hashCode += getNameStd_suffix().hashCode();
        }
        if (getNameStd_title() != null) {
            _hashCode += getNameStd_title().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameStdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Name-stdType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameStd_last");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Name-std_last"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameStd_first");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Name-std_first"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameStd_middle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Name-std_middle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameStd_full");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Name-std_full"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameStd_initials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Name-std_initials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameStd_suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Name-std_suffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameStd_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Name-std_title"));
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
