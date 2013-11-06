/**
 * Cn3DObjectLocation_residuesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DObjectLocation_residuesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocationType[] cn3DMoleculeLocation;

    public Cn3DObjectLocation_residuesType() {
    }

    public Cn3DObjectLocation_residuesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocationType[] cn3DMoleculeLocation) {
           this.cn3DMoleculeLocation = cn3DMoleculeLocation;
    }


    /**
     * Gets the cn3DMoleculeLocation value for this Cn3DObjectLocation_residuesType.
     * 
     * @return cn3DMoleculeLocation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocationType[] getCn3DMoleculeLocation() {
        return cn3DMoleculeLocation;
    }


    /**
     * Sets the cn3DMoleculeLocation value for this Cn3DObjectLocation_residuesType.
     * 
     * @param cn3DMoleculeLocation
     */
    public void setCn3DMoleculeLocation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocationType[] cn3DMoleculeLocation) {
        this.cn3DMoleculeLocation = cn3DMoleculeLocation;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocationType getCn3DMoleculeLocation(int i) {
        return this.cn3DMoleculeLocation[i];
    }

    public void setCn3DMoleculeLocation(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DMoleculeLocationType _value) {
        this.cn3DMoleculeLocation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DObjectLocation_residuesType)) return false;
        Cn3DObjectLocation_residuesType other = (Cn3DObjectLocation_residuesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DMoleculeLocation==null && other.getCn3DMoleculeLocation()==null) || 
             (this.cn3DMoleculeLocation!=null &&
              java.util.Arrays.equals(this.cn3DMoleculeLocation, other.getCn3DMoleculeLocation())));
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
        if (getCn3DMoleculeLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCn3DMoleculeLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCn3DMoleculeLocation(), i);
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
        new org.apache.axis.description.TypeDesc(Cn3DObjectLocation_residuesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-object-location_residuesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DMoleculeLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-molecule-location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-molecule-locationType"));
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
