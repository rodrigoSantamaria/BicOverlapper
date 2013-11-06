/**
 * TransMatrixType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TransMatrixType  implements java.io.Serializable {
    private java.lang.String transMatrix_scaleFactor;

    private java.lang.String transMatrix_tran1;

    private java.lang.String transMatrix_tran2;

    private java.lang.String transMatrix_tran3;

    public TransMatrixType() {
    }

    public TransMatrixType(
           java.lang.String transMatrix_scaleFactor,
           java.lang.String transMatrix_tran1,
           java.lang.String transMatrix_tran2,
           java.lang.String transMatrix_tran3) {
           this.transMatrix_scaleFactor = transMatrix_scaleFactor;
           this.transMatrix_tran1 = transMatrix_tran1;
           this.transMatrix_tran2 = transMatrix_tran2;
           this.transMatrix_tran3 = transMatrix_tran3;
    }


    /**
     * Gets the transMatrix_scaleFactor value for this TransMatrixType.
     * 
     * @return transMatrix_scaleFactor
     */
    public java.lang.String getTransMatrix_scaleFactor() {
        return transMatrix_scaleFactor;
    }


    /**
     * Sets the transMatrix_scaleFactor value for this TransMatrixType.
     * 
     * @param transMatrix_scaleFactor
     */
    public void setTransMatrix_scaleFactor(java.lang.String transMatrix_scaleFactor) {
        this.transMatrix_scaleFactor = transMatrix_scaleFactor;
    }


    /**
     * Gets the transMatrix_tran1 value for this TransMatrixType.
     * 
     * @return transMatrix_tran1
     */
    public java.lang.String getTransMatrix_tran1() {
        return transMatrix_tran1;
    }


    /**
     * Sets the transMatrix_tran1 value for this TransMatrixType.
     * 
     * @param transMatrix_tran1
     */
    public void setTransMatrix_tran1(java.lang.String transMatrix_tran1) {
        this.transMatrix_tran1 = transMatrix_tran1;
    }


    /**
     * Gets the transMatrix_tran2 value for this TransMatrixType.
     * 
     * @return transMatrix_tran2
     */
    public java.lang.String getTransMatrix_tran2() {
        return transMatrix_tran2;
    }


    /**
     * Sets the transMatrix_tran2 value for this TransMatrixType.
     * 
     * @param transMatrix_tran2
     */
    public void setTransMatrix_tran2(java.lang.String transMatrix_tran2) {
        this.transMatrix_tran2 = transMatrix_tran2;
    }


    /**
     * Gets the transMatrix_tran3 value for this TransMatrixType.
     * 
     * @return transMatrix_tran3
     */
    public java.lang.String getTransMatrix_tran3() {
        return transMatrix_tran3;
    }


    /**
     * Sets the transMatrix_tran3 value for this TransMatrixType.
     * 
     * @param transMatrix_tran3
     */
    public void setTransMatrix_tran3(java.lang.String transMatrix_tran3) {
        this.transMatrix_tran3 = transMatrix_tran3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransMatrixType)) return false;
        TransMatrixType other = (TransMatrixType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transMatrix_scaleFactor==null && other.getTransMatrix_scaleFactor()==null) || 
             (this.transMatrix_scaleFactor!=null &&
              this.transMatrix_scaleFactor.equals(other.getTransMatrix_scaleFactor()))) &&
            ((this.transMatrix_tran1==null && other.getTransMatrix_tran1()==null) || 
             (this.transMatrix_tran1!=null &&
              this.transMatrix_tran1.equals(other.getTransMatrix_tran1()))) &&
            ((this.transMatrix_tran2==null && other.getTransMatrix_tran2()==null) || 
             (this.transMatrix_tran2!=null &&
              this.transMatrix_tran2.equals(other.getTransMatrix_tran2()))) &&
            ((this.transMatrix_tran3==null && other.getTransMatrix_tran3()==null) || 
             (this.transMatrix_tran3!=null &&
              this.transMatrix_tran3.equals(other.getTransMatrix_tran3())));
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
        if (getTransMatrix_scaleFactor() != null) {
            _hashCode += getTransMatrix_scaleFactor().hashCode();
        }
        if (getTransMatrix_tran1() != null) {
            _hashCode += getTransMatrix_tran1().hashCode();
        }
        if (getTransMatrix_tran2() != null) {
            _hashCode += getTransMatrix_tran2().hashCode();
        }
        if (getTransMatrix_tran3() != null) {
            _hashCode += getTransMatrix_tran3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransMatrixType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trans-matrixType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transMatrix_scaleFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trans-matrix_scale-factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transMatrix_tran1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trans-matrix_tran-1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transMatrix_tran2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trans-matrix_tran-2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transMatrix_tran3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trans-matrix_tran-3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
