/**
 * SeqBondType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqBondType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqBond_aType seqBond_a;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqBond_bType seqBond_b;

    public SeqBondType() {
    }

    public SeqBondType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqBond_aType seqBond_a,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqBond_bType seqBond_b) {
           this.seqBond_a = seqBond_a;
           this.seqBond_b = seqBond_b;
    }


    /**
     * Gets the seqBond_a value for this SeqBondType.
     * 
     * @return seqBond_a
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqBond_aType getSeqBond_a() {
        return seqBond_a;
    }


    /**
     * Sets the seqBond_a value for this SeqBondType.
     * 
     * @param seqBond_a
     */
    public void setSeqBond_a(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqBond_aType seqBond_a) {
        this.seqBond_a = seqBond_a;
    }


    /**
     * Gets the seqBond_b value for this SeqBondType.
     * 
     * @return seqBond_b
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqBond_bType getSeqBond_b() {
        return seqBond_b;
    }


    /**
     * Sets the seqBond_b value for this SeqBondType.
     * 
     * @param seqBond_b
     */
    public void setSeqBond_b(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqBond_bType seqBond_b) {
        this.seqBond_b = seqBond_b;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqBondType)) return false;
        SeqBondType other = (SeqBondType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqBond_a==null && other.getSeqBond_a()==null) || 
             (this.seqBond_a!=null &&
              this.seqBond_a.equals(other.getSeqBond_a()))) &&
            ((this.seqBond_b==null && other.getSeqBond_b()==null) || 
             (this.seqBond_b!=null &&
              this.seqBond_b.equals(other.getSeqBond_b())));
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
        if (getSeqBond_a() != null) {
            _hashCode += getSeqBond_a().hashCode();
        }
        if (getSeqBond_b() != null) {
            _hashCode += getSeqBond_b().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqBondType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-bondType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqBond_a");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-bond_a"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-bond_aType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqBond_b");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-bond_b"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-bond_bType"));
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
