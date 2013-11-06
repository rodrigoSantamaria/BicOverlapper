/**
 * PssmFinalData_scoresType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PssmFinalData_scoresType  implements java.io.Serializable {
    private java.lang.String[] pssmFinalData_scores_E;

    public PssmFinalData_scoresType() {
    }

    public PssmFinalData_scoresType(
           java.lang.String[] pssmFinalData_scores_E) {
           this.pssmFinalData_scores_E = pssmFinalData_scores_E;
    }


    /**
     * Gets the pssmFinalData_scores_E value for this PssmFinalData_scoresType.
     * 
     * @return pssmFinalData_scores_E
     */
    public java.lang.String[] getPssmFinalData_scores_E() {
        return pssmFinalData_scores_E;
    }


    /**
     * Sets the pssmFinalData_scores_E value for this PssmFinalData_scoresType.
     * 
     * @param pssmFinalData_scores_E
     */
    public void setPssmFinalData_scores_E(java.lang.String[] pssmFinalData_scores_E) {
        this.pssmFinalData_scores_E = pssmFinalData_scores_E;
    }

    public java.lang.String getPssmFinalData_scores_E(int i) {
        return this.pssmFinalData_scores_E[i];
    }

    public void setPssmFinalData_scores_E(int i, java.lang.String _value) {
        this.pssmFinalData_scores_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssmFinalData_scoresType)) return false;
        PssmFinalData_scoresType other = (PssmFinalData_scoresType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssmFinalData_scores_E==null && other.getPssmFinalData_scores_E()==null) || 
             (this.pssmFinalData_scores_E!=null &&
              java.util.Arrays.equals(this.pssmFinalData_scores_E, other.getPssmFinalData_scores_E())));
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
        if (getPssmFinalData_scores_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPssmFinalData_scores_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPssmFinalData_scores_E(), i);
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
        new org.apache.axis.description.TypeDesc(PssmFinalData_scoresType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmFinalData_scoresType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmFinalData_scores_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmFinalData_scores_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmFinalData_scores_E"));
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
