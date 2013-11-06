/**
 * IntraResidueBondType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class IntraResidueBondType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBond_atomId1Type intraResidueBond_atomId1;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBond_atomId2Type intraResidueBond_atomId2;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBond_bondOrderType intraResidueBond_bondOrder;

    public IntraResidueBondType() {
    }

    public IntraResidueBondType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBond_atomId1Type intraResidueBond_atomId1,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBond_atomId2Type intraResidueBond_atomId2,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBond_bondOrderType intraResidueBond_bondOrder) {
           this.intraResidueBond_atomId1 = intraResidueBond_atomId1;
           this.intraResidueBond_atomId2 = intraResidueBond_atomId2;
           this.intraResidueBond_bondOrder = intraResidueBond_bondOrder;
    }


    /**
     * Gets the intraResidueBond_atomId1 value for this IntraResidueBondType.
     * 
     * @return intraResidueBond_atomId1
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBond_atomId1Type getIntraResidueBond_atomId1() {
        return intraResidueBond_atomId1;
    }


    /**
     * Sets the intraResidueBond_atomId1 value for this IntraResidueBondType.
     * 
     * @param intraResidueBond_atomId1
     */
    public void setIntraResidueBond_atomId1(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBond_atomId1Type intraResidueBond_atomId1) {
        this.intraResidueBond_atomId1 = intraResidueBond_atomId1;
    }


    /**
     * Gets the intraResidueBond_atomId2 value for this IntraResidueBondType.
     * 
     * @return intraResidueBond_atomId2
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBond_atomId2Type getIntraResidueBond_atomId2() {
        return intraResidueBond_atomId2;
    }


    /**
     * Sets the intraResidueBond_atomId2 value for this IntraResidueBondType.
     * 
     * @param intraResidueBond_atomId2
     */
    public void setIntraResidueBond_atomId2(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBond_atomId2Type intraResidueBond_atomId2) {
        this.intraResidueBond_atomId2 = intraResidueBond_atomId2;
    }


    /**
     * Gets the intraResidueBond_bondOrder value for this IntraResidueBondType.
     * 
     * @return intraResidueBond_bondOrder
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBond_bondOrderType getIntraResidueBond_bondOrder() {
        return intraResidueBond_bondOrder;
    }


    /**
     * Sets the intraResidueBond_bondOrder value for this IntraResidueBondType.
     * 
     * @param intraResidueBond_bondOrder
     */
    public void setIntraResidueBond_bondOrder(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBond_bondOrderType intraResidueBond_bondOrder) {
        this.intraResidueBond_bondOrder = intraResidueBond_bondOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntraResidueBondType)) return false;
        IntraResidueBondType other = (IntraResidueBondType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intraResidueBond_atomId1==null && other.getIntraResidueBond_atomId1()==null) || 
             (this.intraResidueBond_atomId1!=null &&
              this.intraResidueBond_atomId1.equals(other.getIntraResidueBond_atomId1()))) &&
            ((this.intraResidueBond_atomId2==null && other.getIntraResidueBond_atomId2()==null) || 
             (this.intraResidueBond_atomId2!=null &&
              this.intraResidueBond_atomId2.equals(other.getIntraResidueBond_atomId2()))) &&
            ((this.intraResidueBond_bondOrder==null && other.getIntraResidueBond_bondOrder()==null) || 
             (this.intraResidueBond_bondOrder!=null &&
              this.intraResidueBond_bondOrder.equals(other.getIntraResidueBond_bondOrder())));
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
        if (getIntraResidueBond_atomId1() != null) {
            _hashCode += getIntraResidueBond_atomId1().hashCode();
        }
        if (getIntraResidueBond_atomId2() != null) {
            _hashCode += getIntraResidueBond_atomId2().hashCode();
        }
        if (getIntraResidueBond_bondOrder() != null) {
            _hashCode += getIntraResidueBond_bondOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntraResidueBondType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Intra-residue-bondType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intraResidueBond_atomId1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Intra-residue-bond_atom-id-1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Intra-residue-bond_atom-id-1Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intraResidueBond_atomId2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Intra-residue-bond_atom-id-2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Intra-residue-bond_atom-id-2Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intraResidueBond_bondOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Intra-residue-bond_bond-order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Intra-residue-bond_bond-orderType"));
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
