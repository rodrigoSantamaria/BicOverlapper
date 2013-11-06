/**
 * CddTreeSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddTreeSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTreeType[] cddTree;

    public CddTreeSet() {
    }

    public CddTreeSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTreeType[] cddTree) {
           this.cddTree = cddTree;
    }


    /**
     * Gets the cddTree value for this CddTreeSet.
     * 
     * @return cddTree
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTreeType[] getCddTree() {
        return cddTree;
    }


    /**
     * Sets the cddTree value for this CddTreeSet.
     * 
     * @param cddTree
     */
    public void setCddTree(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTreeType[] cddTree) {
        this.cddTree = cddTree;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTreeType getCddTree(int i) {
        return this.cddTree[i];
    }

    public void setCddTree(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddTreeType _value) {
        this.cddTree[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddTreeSet)) return false;
        CddTreeSet other = (CddTreeSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddTree==null && other.getCddTree()==null) || 
             (this.cddTree!=null &&
              java.util.Arrays.equals(this.cddTree, other.getCddTree())));
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
        if (getCddTree() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCddTree());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCddTree(), i);
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
        new org.apache.axis.description.TypeDesc(CddTreeSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Cdd-tree-set"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddTree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-tree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-treeType"));
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
