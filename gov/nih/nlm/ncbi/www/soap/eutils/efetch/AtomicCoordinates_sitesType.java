/**
 * AtomicCoordinates_sitesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AtomicCoordinates_sitesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePointsType modelSpacePoints;

    public AtomicCoordinates_sitesType() {
    }

    public AtomicCoordinates_sitesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePointsType modelSpacePoints) {
           this.modelSpacePoints = modelSpacePoints;
    }


    /**
     * Gets the modelSpacePoints value for this AtomicCoordinates_sitesType.
     * 
     * @return modelSpacePoints
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePointsType getModelSpacePoints() {
        return modelSpacePoints;
    }


    /**
     * Sets the modelSpacePoints value for this AtomicCoordinates_sitesType.
     * 
     * @param modelSpacePoints
     */
    public void setModelSpacePoints(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModelSpacePointsType modelSpacePoints) {
        this.modelSpacePoints = modelSpacePoints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtomicCoordinates_sitesType)) return false;
        AtomicCoordinates_sitesType other = (AtomicCoordinates_sitesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelSpacePoints==null && other.getModelSpacePoints()==null) || 
             (this.modelSpacePoints!=null &&
              this.modelSpacePoints.equals(other.getModelSpacePoints())));
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
        if (getModelSpacePoints() != null) {
            _hashCode += getModelSpacePoints().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtomicCoordinates_sitesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-coordinates_sitesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSpacePoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-points"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Model-space-pointsType"));
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
