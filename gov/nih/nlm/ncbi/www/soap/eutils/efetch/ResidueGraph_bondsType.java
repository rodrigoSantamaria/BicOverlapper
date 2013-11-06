/**
 * ResidueGraph_bondsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResidueGraph_bondsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBondType[] intraResidueBond;

    public ResidueGraph_bondsType() {
    }

    public ResidueGraph_bondsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBondType[] intraResidueBond) {
           this.intraResidueBond = intraResidueBond;
    }


    /**
     * Gets the intraResidueBond value for this ResidueGraph_bondsType.
     * 
     * @return intraResidueBond
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBondType[] getIntraResidueBond() {
        return intraResidueBond;
    }


    /**
     * Sets the intraResidueBond value for this ResidueGraph_bondsType.
     * 
     * @param intraResidueBond
     */
    public void setIntraResidueBond(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBondType[] intraResidueBond) {
        this.intraResidueBond = intraResidueBond;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBondType getIntraResidueBond(int i) {
        return this.intraResidueBond[i];
    }

    public void setIntraResidueBond(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntraResidueBondType _value) {
        this.intraResidueBond[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResidueGraph_bondsType)) return false;
        ResidueGraph_bondsType other = (ResidueGraph_bondsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intraResidueBond==null && other.getIntraResidueBond()==null) || 
             (this.intraResidueBond!=null &&
              java.util.Arrays.equals(this.intraResidueBond, other.getIntraResidueBond())));
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
        if (getIntraResidueBond() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntraResidueBond());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntraResidueBond(), i);
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
        new org.apache.axis.description.TypeDesc(ResidueGraph_bondsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph_bondsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intraResidueBond");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Intra-residue-bond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Intra-residue-bondType"));
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
