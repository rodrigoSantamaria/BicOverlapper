/**
 * ChiralCenterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ChiralCenterType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_cType chiralCenter_c;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_n1Type chiralCenter_n1;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_n2Type chiralCenter_n2;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_n3Type chiralCenter_n3;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_signType chiralCenter_sign;

    public ChiralCenterType() {
    }

    public ChiralCenterType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_cType chiralCenter_c,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_n1Type chiralCenter_n1,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_n2Type chiralCenter_n2,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_n3Type chiralCenter_n3,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_signType chiralCenter_sign) {
           this.chiralCenter_c = chiralCenter_c;
           this.chiralCenter_n1 = chiralCenter_n1;
           this.chiralCenter_n2 = chiralCenter_n2;
           this.chiralCenter_n3 = chiralCenter_n3;
           this.chiralCenter_sign = chiralCenter_sign;
    }


    /**
     * Gets the chiralCenter_c value for this ChiralCenterType.
     * 
     * @return chiralCenter_c
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_cType getChiralCenter_c() {
        return chiralCenter_c;
    }


    /**
     * Sets the chiralCenter_c value for this ChiralCenterType.
     * 
     * @param chiralCenter_c
     */
    public void setChiralCenter_c(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_cType chiralCenter_c) {
        this.chiralCenter_c = chiralCenter_c;
    }


    /**
     * Gets the chiralCenter_n1 value for this ChiralCenterType.
     * 
     * @return chiralCenter_n1
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_n1Type getChiralCenter_n1() {
        return chiralCenter_n1;
    }


    /**
     * Sets the chiralCenter_n1 value for this ChiralCenterType.
     * 
     * @param chiralCenter_n1
     */
    public void setChiralCenter_n1(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_n1Type chiralCenter_n1) {
        this.chiralCenter_n1 = chiralCenter_n1;
    }


    /**
     * Gets the chiralCenter_n2 value for this ChiralCenterType.
     * 
     * @return chiralCenter_n2
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_n2Type getChiralCenter_n2() {
        return chiralCenter_n2;
    }


    /**
     * Sets the chiralCenter_n2 value for this ChiralCenterType.
     * 
     * @param chiralCenter_n2
     */
    public void setChiralCenter_n2(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_n2Type chiralCenter_n2) {
        this.chiralCenter_n2 = chiralCenter_n2;
    }


    /**
     * Gets the chiralCenter_n3 value for this ChiralCenterType.
     * 
     * @return chiralCenter_n3
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_n3Type getChiralCenter_n3() {
        return chiralCenter_n3;
    }


    /**
     * Sets the chiralCenter_n3 value for this ChiralCenterType.
     * 
     * @param chiralCenter_n3
     */
    public void setChiralCenter_n3(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_n3Type chiralCenter_n3) {
        this.chiralCenter_n3 = chiralCenter_n3;
    }


    /**
     * Gets the chiralCenter_sign value for this ChiralCenterType.
     * 
     * @return chiralCenter_sign
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_signType getChiralCenter_sign() {
        return chiralCenter_sign;
    }


    /**
     * Sets the chiralCenter_sign value for this ChiralCenterType.
     * 
     * @param chiralCenter_sign
     */
    public void setChiralCenter_sign(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChiralCenter_signType chiralCenter_sign) {
        this.chiralCenter_sign = chiralCenter_sign;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChiralCenterType)) return false;
        ChiralCenterType other = (ChiralCenterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiralCenter_c==null && other.getChiralCenter_c()==null) || 
             (this.chiralCenter_c!=null &&
              this.chiralCenter_c.equals(other.getChiralCenter_c()))) &&
            ((this.chiralCenter_n1==null && other.getChiralCenter_n1()==null) || 
             (this.chiralCenter_n1!=null &&
              this.chiralCenter_n1.equals(other.getChiralCenter_n1()))) &&
            ((this.chiralCenter_n2==null && other.getChiralCenter_n2()==null) || 
             (this.chiralCenter_n2!=null &&
              this.chiralCenter_n2.equals(other.getChiralCenter_n2()))) &&
            ((this.chiralCenter_n3==null && other.getChiralCenter_n3()==null) || 
             (this.chiralCenter_n3!=null &&
              this.chiralCenter_n3.equals(other.getChiralCenter_n3()))) &&
            ((this.chiralCenter_sign==null && other.getChiralCenter_sign()==null) || 
             (this.chiralCenter_sign!=null &&
              this.chiralCenter_sign.equals(other.getChiralCenter_sign())));
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
        if (getChiralCenter_c() != null) {
            _hashCode += getChiralCenter_c().hashCode();
        }
        if (getChiralCenter_n1() != null) {
            _hashCode += getChiralCenter_n1().hashCode();
        }
        if (getChiralCenter_n2() != null) {
            _hashCode += getChiralCenter_n2().hashCode();
        }
        if (getChiralCenter_n3() != null) {
            _hashCode += getChiralCenter_n3().hashCode();
        }
        if (getChiralCenter_sign() != null) {
            _hashCode += getChiralCenter_sign().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChiralCenterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chiral-centerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiralCenter_c");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chiral-center_c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chiral-center_cType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiralCenter_n1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chiral-center_n1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chiral-center_n1Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiralCenter_n2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chiral-center_n2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chiral-center_n2Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiralCenter_n3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chiral-center_n3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chiral-center_n3Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiralCenter_sign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chiral-center_sign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chiral-center_signType"));
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
