/**
 * InterResidueBondType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class InterResidueBondType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBond_atomId1Type interResidueBond_atomId1;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBond_atomId2Type interResidueBond_atomId2;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBond_bondOrderType interResidueBond_bondOrder;

    public InterResidueBondType() {
    }

    public InterResidueBondType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBond_atomId1Type interResidueBond_atomId1,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBond_atomId2Type interResidueBond_atomId2,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBond_bondOrderType interResidueBond_bondOrder) {
           this.interResidueBond_atomId1 = interResidueBond_atomId1;
           this.interResidueBond_atomId2 = interResidueBond_atomId2;
           this.interResidueBond_bondOrder = interResidueBond_bondOrder;
    }


    /**
     * Gets the interResidueBond_atomId1 value for this InterResidueBondType.
     * 
     * @return interResidueBond_atomId1
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBond_atomId1Type getInterResidueBond_atomId1() {
        return interResidueBond_atomId1;
    }


    /**
     * Sets the interResidueBond_atomId1 value for this InterResidueBondType.
     * 
     * @param interResidueBond_atomId1
     */
    public void setInterResidueBond_atomId1(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBond_atomId1Type interResidueBond_atomId1) {
        this.interResidueBond_atomId1 = interResidueBond_atomId1;
    }


    /**
     * Gets the interResidueBond_atomId2 value for this InterResidueBondType.
     * 
     * @return interResidueBond_atomId2
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBond_atomId2Type getInterResidueBond_atomId2() {
        return interResidueBond_atomId2;
    }


    /**
     * Sets the interResidueBond_atomId2 value for this InterResidueBondType.
     * 
     * @param interResidueBond_atomId2
     */
    public void setInterResidueBond_atomId2(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBond_atomId2Type interResidueBond_atomId2) {
        this.interResidueBond_atomId2 = interResidueBond_atomId2;
    }


    /**
     * Gets the interResidueBond_bondOrder value for this InterResidueBondType.
     * 
     * @return interResidueBond_bondOrder
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBond_bondOrderType getInterResidueBond_bondOrder() {
        return interResidueBond_bondOrder;
    }


    /**
     * Sets the interResidueBond_bondOrder value for this InterResidueBondType.
     * 
     * @param interResidueBond_bondOrder
     */
    public void setInterResidueBond_bondOrder(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBond_bondOrderType interResidueBond_bondOrder) {
        this.interResidueBond_bondOrder = interResidueBond_bondOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterResidueBondType)) return false;
        InterResidueBondType other = (InterResidueBondType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.interResidueBond_atomId1==null && other.getInterResidueBond_atomId1()==null) || 
             (this.interResidueBond_atomId1!=null &&
              this.interResidueBond_atomId1.equals(other.getInterResidueBond_atomId1()))) &&
            ((this.interResidueBond_atomId2==null && other.getInterResidueBond_atomId2()==null) || 
             (this.interResidueBond_atomId2!=null &&
              this.interResidueBond_atomId2.equals(other.getInterResidueBond_atomId2()))) &&
            ((this.interResidueBond_bondOrder==null && other.getInterResidueBond_bondOrder()==null) || 
             (this.interResidueBond_bondOrder!=null &&
              this.interResidueBond_bondOrder.equals(other.getInterResidueBond_bondOrder())));
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
        if (getInterResidueBond_atomId1() != null) {
            _hashCode += getInterResidueBond_atomId1().hashCode();
        }
        if (getInterResidueBond_atomId2() != null) {
            _hashCode += getInterResidueBond_atomId2().hashCode();
        }
        if (getInterResidueBond_bondOrder() != null) {
            _hashCode += getInterResidueBond_bondOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterResidueBondType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Inter-residue-bondType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interResidueBond_atomId1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Inter-residue-bond_atom-id-1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Inter-residue-bond_atom-id-1Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interResidueBond_atomId2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Inter-residue-bond_atom-id-2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Inter-residue-bond_atom-id-2Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interResidueBond_bondOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Inter-residue-bond_bond-order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Inter-residue-bond_bond-orderType"));
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
