/**
 * CoreDef_blocksType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CoreDef_blocksType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreBlockType[] coreBlock;

    public CoreDef_blocksType() {
    }

    public CoreDef_blocksType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreBlockType[] coreBlock) {
           this.coreBlock = coreBlock;
    }


    /**
     * Gets the coreBlock value for this CoreDef_blocksType.
     * 
     * @return coreBlock
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreBlockType[] getCoreBlock() {
        return coreBlock;
    }


    /**
     * Sets the coreBlock value for this CoreDef_blocksType.
     * 
     * @param coreBlock
     */
    public void setCoreBlock(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreBlockType[] coreBlock) {
        this.coreBlock = coreBlock;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreBlockType getCoreBlock(int i) {
        return this.coreBlock[i];
    }

    public void setCoreBlock(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreBlockType _value) {
        this.coreBlock[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoreDef_blocksType)) return false;
        CoreDef_blocksType other = (CoreDef_blocksType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coreBlock==null && other.getCoreBlock()==null) || 
             (this.coreBlock!=null &&
              java.util.Arrays.equals(this.coreBlock, other.getCoreBlock())));
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
        if (getCoreBlock() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoreBlock());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoreBlock(), i);
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
        new org.apache.axis.description.TypeDesc(CoreDef_blocksType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreDef_blocksType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreBlockType"));
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
