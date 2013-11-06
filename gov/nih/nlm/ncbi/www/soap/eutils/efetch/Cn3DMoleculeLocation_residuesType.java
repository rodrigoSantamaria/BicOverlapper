/**
 * Cn3DMoleculeLocation_residuesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DMoleculeLocation_residuesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRangeType[] cn3DResidueRange;

    public Cn3DMoleculeLocation_residuesType() {
    }

    public Cn3DMoleculeLocation_residuesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRangeType[] cn3DResidueRange) {
           this.cn3DResidueRange = cn3DResidueRange;
    }


    /**
     * Gets the cn3DResidueRange value for this Cn3DMoleculeLocation_residuesType.
     * 
     * @return cn3DResidueRange
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRangeType[] getCn3DResidueRange() {
        return cn3DResidueRange;
    }


    /**
     * Sets the cn3DResidueRange value for this Cn3DMoleculeLocation_residuesType.
     * 
     * @param cn3DResidueRange
     */
    public void setCn3DResidueRange(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRangeType[] cn3DResidueRange) {
        this.cn3DResidueRange = cn3DResidueRange;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRangeType getCn3DResidueRange(int i) {
        return this.cn3DResidueRange[i];
    }

    public void setCn3DResidueRange(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DResidueRangeType _value) {
        this.cn3DResidueRange[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DMoleculeLocation_residuesType)) return false;
        Cn3DMoleculeLocation_residuesType other = (Cn3DMoleculeLocation_residuesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DResidueRange==null && other.getCn3DResidueRange()==null) || 
             (this.cn3DResidueRange!=null &&
              java.util.Arrays.equals(this.cn3DResidueRange, other.getCn3DResidueRange())));
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
        if (getCn3DResidueRange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCn3DResidueRange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCn3DResidueRange(), i);
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
        new org.apache.axis.description.TypeDesc(Cn3DMoleculeLocation_residuesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-molecule-location_residuesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DResidueRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-residue-range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-residue-rangeType"));
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
