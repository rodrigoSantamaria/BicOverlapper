/**
 * ResidueGraph_iupacCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResidueGraph_iupacCodeType  implements java.io.Serializable {
    private java.lang.String[] residueGraph_iupacCode_E;

    public ResidueGraph_iupacCodeType() {
    }

    public ResidueGraph_iupacCodeType(
           java.lang.String[] residueGraph_iupacCode_E) {
           this.residueGraph_iupacCode_E = residueGraph_iupacCode_E;
    }


    /**
     * Gets the residueGraph_iupacCode_E value for this ResidueGraph_iupacCodeType.
     * 
     * @return residueGraph_iupacCode_E
     */
    public java.lang.String[] getResidueGraph_iupacCode_E() {
        return residueGraph_iupacCode_E;
    }


    /**
     * Sets the residueGraph_iupacCode_E value for this ResidueGraph_iupacCodeType.
     * 
     * @param residueGraph_iupacCode_E
     */
    public void setResidueGraph_iupacCode_E(java.lang.String[] residueGraph_iupacCode_E) {
        this.residueGraph_iupacCode_E = residueGraph_iupacCode_E;
    }

    public java.lang.String getResidueGraph_iupacCode_E(int i) {
        return this.residueGraph_iupacCode_E[i];
    }

    public void setResidueGraph_iupacCode_E(int i, java.lang.String _value) {
        this.residueGraph_iupacCode_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResidueGraph_iupacCodeType)) return false;
        ResidueGraph_iupacCodeType other = (ResidueGraph_iupacCodeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.residueGraph_iupacCode_E==null && other.getResidueGraph_iupacCode_E()==null) || 
             (this.residueGraph_iupacCode_E!=null &&
              java.util.Arrays.equals(this.residueGraph_iupacCode_E, other.getResidueGraph_iupacCode_E())));
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
        if (getResidueGraph_iupacCode_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResidueGraph_iupacCode_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResidueGraph_iupacCode_E(), i);
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
        new org.apache.axis.description.TypeDesc(ResidueGraph_iupacCodeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph_iupac-codeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueGraph_iupacCode_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph_iupac-code_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph_iupac-code_E"));
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
