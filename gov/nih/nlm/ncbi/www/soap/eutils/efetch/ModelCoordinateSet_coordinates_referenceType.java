/**
 * ModelCoordinateSet_coordinates_referenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModelCoordinateSet_coordinates_referenceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignmentType chemGraphAlignment;

    public ModelCoordinateSet_coordinates_referenceType() {
    }

    public ModelCoordinateSet_coordinates_referenceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignmentType chemGraphAlignment) {
           this.chemGraphAlignment = chemGraphAlignment;
    }


    /**
     * Gets the chemGraphAlignment value for this ModelCoordinateSet_coordinates_referenceType.
     * 
     * @return chemGraphAlignment
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignmentType getChemGraphAlignment() {
        return chemGraphAlignment;
    }


    /**
     * Sets the chemGraphAlignment value for this ModelCoordinateSet_coordinates_referenceType.
     * 
     * @param chemGraphAlignment
     */
    public void setChemGraphAlignment(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphAlignmentType chemGraphAlignment) {
        this.chemGraphAlignment = chemGraphAlignment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModelCoordinateSet_coordinates_referenceType)) return false;
        ModelCoordinateSet_coordinates_referenceType other = (ModelCoordinateSet_coordinates_referenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chemGraphAlignment==null && other.getChemGraphAlignment()==null) || 
             (this.chemGraphAlignment!=null &&
              this.chemGraphAlignment.equals(other.getChemGraphAlignment())));
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
        if (getChemGraphAlignment() != null) {
            _hashCode += getChemGraphAlignment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModelCoordinateSet_coordinates_referenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-coordinate-set_coordinates_referenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemGraphAlignment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-alignmentType"));
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
