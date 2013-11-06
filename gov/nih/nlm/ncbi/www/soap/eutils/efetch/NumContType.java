/**
 * NumContType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NumContType  implements java.io.Serializable {
    private java.lang.String numCont_refnum;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumCont_hasZeroType numCont_hasZero;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumCont_ascendingType numCont_ascending;

    public NumContType() {
    }

    public NumContType(
           java.lang.String numCont_refnum,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumCont_hasZeroType numCont_hasZero,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumCont_ascendingType numCont_ascending) {
           this.numCont_refnum = numCont_refnum;
           this.numCont_hasZero = numCont_hasZero;
           this.numCont_ascending = numCont_ascending;
    }


    /**
     * Gets the numCont_refnum value for this NumContType.
     * 
     * @return numCont_refnum
     */
    public java.lang.String getNumCont_refnum() {
        return numCont_refnum;
    }


    /**
     * Sets the numCont_refnum value for this NumContType.
     * 
     * @param numCont_refnum
     */
    public void setNumCont_refnum(java.lang.String numCont_refnum) {
        this.numCont_refnum = numCont_refnum;
    }


    /**
     * Gets the numCont_hasZero value for this NumContType.
     * 
     * @return numCont_hasZero
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumCont_hasZeroType getNumCont_hasZero() {
        return numCont_hasZero;
    }


    /**
     * Sets the numCont_hasZero value for this NumContType.
     * 
     * @param numCont_hasZero
     */
    public void setNumCont_hasZero(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumCont_hasZeroType numCont_hasZero) {
        this.numCont_hasZero = numCont_hasZero;
    }


    /**
     * Gets the numCont_ascending value for this NumContType.
     * 
     * @return numCont_ascending
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumCont_ascendingType getNumCont_ascending() {
        return numCont_ascending;
    }


    /**
     * Sets the numCont_ascending value for this NumContType.
     * 
     * @param numCont_ascending
     */
    public void setNumCont_ascending(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumCont_ascendingType numCont_ascending) {
        this.numCont_ascending = numCont_ascending;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumContType)) return false;
        NumContType other = (NumContType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numCont_refnum==null && other.getNumCont_refnum()==null) || 
             (this.numCont_refnum!=null &&
              this.numCont_refnum.equals(other.getNumCont_refnum()))) &&
            ((this.numCont_hasZero==null && other.getNumCont_hasZero()==null) || 
             (this.numCont_hasZero!=null &&
              this.numCont_hasZero.equals(other.getNumCont_hasZero()))) &&
            ((this.numCont_ascending==null && other.getNumCont_ascending()==null) || 
             (this.numCont_ascending!=null &&
              this.numCont_ascending.equals(other.getNumCont_ascending())));
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
        if (getNumCont_refnum() != null) {
            _hashCode += getNumCont_refnum().hashCode();
        }
        if (getNumCont_hasZero() != null) {
            _hashCode += getNumCont_hasZero().hashCode();
        }
        if (getNumCont_ascending() != null) {
            _hashCode += getNumCont_ascending().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumContType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-contType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCont_refnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-cont_refnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCont_hasZero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-cont_has-zero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-cont_has-zeroType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCont_ascending");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-cont_ascending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-cont_ascendingType"));
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
