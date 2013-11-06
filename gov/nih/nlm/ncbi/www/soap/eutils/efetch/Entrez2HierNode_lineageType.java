/**
 * Entrez2HierNode_lineageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2HierNode_lineageType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermType[] entrez2Term;

    public Entrez2HierNode_lineageType() {
    }

    public Entrez2HierNode_lineageType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermType[] entrez2Term) {
           this.entrez2Term = entrez2Term;
    }


    /**
     * Gets the entrez2Term value for this Entrez2HierNode_lineageType.
     * 
     * @return entrez2Term
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermType[] getEntrez2Term() {
        return entrez2Term;
    }


    /**
     * Sets the entrez2Term value for this Entrez2HierNode_lineageType.
     * 
     * @param entrez2Term
     */
    public void setEntrez2Term(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermType[] entrez2Term) {
        this.entrez2Term = entrez2Term;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermType getEntrez2Term(int i) {
        return this.entrez2Term[i];
    }

    public void setEntrez2Term(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermType _value) {
        this.entrez2Term[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2HierNode_lineageType)) return false;
        Entrez2HierNode_lineageType other = (Entrez2HierNode_lineageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2Term==null && other.getEntrez2Term()==null) || 
             (this.entrez2Term!=null &&
              java.util.Arrays.equals(this.entrez2Term, other.getEntrez2Term())));
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
        if (getEntrez2Term() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntrez2Term());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntrez2Term(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2HierNode_lineageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-hier-node_lineageType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Term");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-termType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
