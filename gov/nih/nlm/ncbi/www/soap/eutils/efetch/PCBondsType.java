/**
 * PCBondsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCBondsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBonds_aid1Type PCBonds_aid1;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBonds_aid2Type PCBonds_aid2;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBonds_orderType PCBonds_order;

    public PCBondsType() {
    }

    public PCBondsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBonds_aid1Type PCBonds_aid1,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBonds_aid2Type PCBonds_aid2,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBonds_orderType PCBonds_order) {
           this.PCBonds_aid1 = PCBonds_aid1;
           this.PCBonds_aid2 = PCBonds_aid2;
           this.PCBonds_order = PCBonds_order;
    }


    /**
     * Gets the PCBonds_aid1 value for this PCBondsType.
     * 
     * @return PCBonds_aid1
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBonds_aid1Type getPCBonds_aid1() {
        return PCBonds_aid1;
    }


    /**
     * Sets the PCBonds_aid1 value for this PCBondsType.
     * 
     * @param PCBonds_aid1
     */
    public void setPCBonds_aid1(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBonds_aid1Type PCBonds_aid1) {
        this.PCBonds_aid1 = PCBonds_aid1;
    }


    /**
     * Gets the PCBonds_aid2 value for this PCBondsType.
     * 
     * @return PCBonds_aid2
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBonds_aid2Type getPCBonds_aid2() {
        return PCBonds_aid2;
    }


    /**
     * Sets the PCBonds_aid2 value for this PCBondsType.
     * 
     * @param PCBonds_aid2
     */
    public void setPCBonds_aid2(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBonds_aid2Type PCBonds_aid2) {
        this.PCBonds_aid2 = PCBonds_aid2;
    }


    /**
     * Gets the PCBonds_order value for this PCBondsType.
     * 
     * @return PCBonds_order
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBonds_orderType getPCBonds_order() {
        return PCBonds_order;
    }


    /**
     * Sets the PCBonds_order value for this PCBondsType.
     * 
     * @param PCBonds_order
     */
    public void setPCBonds_order(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCBonds_orderType PCBonds_order) {
        this.PCBonds_order = PCBonds_order;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCBondsType)) return false;
        PCBondsType other = (PCBondsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCBonds_aid1==null && other.getPCBonds_aid1()==null) || 
             (this.PCBonds_aid1!=null &&
              this.PCBonds_aid1.equals(other.getPCBonds_aid1()))) &&
            ((this.PCBonds_aid2==null && other.getPCBonds_aid2()==null) || 
             (this.PCBonds_aid2!=null &&
              this.PCBonds_aid2.equals(other.getPCBonds_aid2()))) &&
            ((this.PCBonds_order==null && other.getPCBonds_order()==null) || 
             (this.PCBonds_order!=null &&
              this.PCBonds_order.equals(other.getPCBonds_order())));
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
        if (getPCBonds_aid1() != null) {
            _hashCode += getPCBonds_aid1().hashCode();
        }
        if (getPCBonds_aid2() != null) {
            _hashCode += getPCBonds_aid2().hashCode();
        }
        if (getPCBonds_order() != null) {
            _hashCode += getPCBonds_order().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCBondsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-BondsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCBonds_aid1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Bonds_aid1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Bonds_aid1Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCBonds_aid2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Bonds_aid2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Bonds_aid2Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCBonds_order");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Bonds_order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Bonds_orderType"));
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
