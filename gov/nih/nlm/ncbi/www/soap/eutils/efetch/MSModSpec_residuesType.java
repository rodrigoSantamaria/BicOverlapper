/**
 * MSModSpec_residuesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSModSpec_residuesType  implements java.io.Serializable {
    private java.lang.String[] MSModSpec_residues_E;

    public MSModSpec_residuesType() {
    }

    public MSModSpec_residuesType(
           java.lang.String[] MSModSpec_residues_E) {
           this.MSModSpec_residues_E = MSModSpec_residues_E;
    }


    /**
     * Gets the MSModSpec_residues_E value for this MSModSpec_residuesType.
     * 
     * @return MSModSpec_residues_E
     */
    public java.lang.String[] getMSModSpec_residues_E() {
        return MSModSpec_residues_E;
    }


    /**
     * Sets the MSModSpec_residues_E value for this MSModSpec_residuesType.
     * 
     * @param MSModSpec_residues_E
     */
    public void setMSModSpec_residues_E(java.lang.String[] MSModSpec_residues_E) {
        this.MSModSpec_residues_E = MSModSpec_residues_E;
    }

    public java.lang.String getMSModSpec_residues_E(int i) {
        return this.MSModSpec_residues_E[i];
    }

    public void setMSModSpec_residues_E(int i, java.lang.String _value) {
        this.MSModSpec_residues_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSModSpec_residuesType)) return false;
        MSModSpec_residuesType other = (MSModSpec_residuesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSModSpec_residues_E==null && other.getMSModSpec_residues_E()==null) || 
             (this.MSModSpec_residues_E!=null &&
              java.util.Arrays.equals(this.MSModSpec_residues_E, other.getMSModSpec_residues_E())));
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
        if (getMSModSpec_residues_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSModSpec_residues_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSModSpec_residues_E(), i);
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
        new org.apache.axis.description.TypeDesc(MSModSpec_residuesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_residuesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModSpec_residues_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_residues_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_residues_E"));
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
