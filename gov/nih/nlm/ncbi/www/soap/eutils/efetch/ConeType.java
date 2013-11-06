/**
 * ConeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ConeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cone_axisTopType cone_axisTop;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cone_axisBottomType cone_axisBottom;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cone_radiusBottomType cone_radiusBottom;

    public ConeType() {
    }

    public ConeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cone_axisTopType cone_axisTop,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cone_axisBottomType cone_axisBottom,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cone_radiusBottomType cone_radiusBottom) {
           this.cone_axisTop = cone_axisTop;
           this.cone_axisBottom = cone_axisBottom;
           this.cone_radiusBottom = cone_radiusBottom;
    }


    /**
     * Gets the cone_axisTop value for this ConeType.
     * 
     * @return cone_axisTop
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cone_axisTopType getCone_axisTop() {
        return cone_axisTop;
    }


    /**
     * Sets the cone_axisTop value for this ConeType.
     * 
     * @param cone_axisTop
     */
    public void setCone_axisTop(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cone_axisTopType cone_axisTop) {
        this.cone_axisTop = cone_axisTop;
    }


    /**
     * Gets the cone_axisBottom value for this ConeType.
     * 
     * @return cone_axisBottom
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cone_axisBottomType getCone_axisBottom() {
        return cone_axisBottom;
    }


    /**
     * Sets the cone_axisBottom value for this ConeType.
     * 
     * @param cone_axisBottom
     */
    public void setCone_axisBottom(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cone_axisBottomType cone_axisBottom) {
        this.cone_axisBottom = cone_axisBottom;
    }


    /**
     * Gets the cone_radiusBottom value for this ConeType.
     * 
     * @return cone_radiusBottom
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cone_radiusBottomType getCone_radiusBottom() {
        return cone_radiusBottom;
    }


    /**
     * Sets the cone_radiusBottom value for this ConeType.
     * 
     * @param cone_radiusBottom
     */
    public void setCone_radiusBottom(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cone_radiusBottomType cone_radiusBottom) {
        this.cone_radiusBottom = cone_radiusBottom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConeType)) return false;
        ConeType other = (ConeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cone_axisTop==null && other.getCone_axisTop()==null) || 
             (this.cone_axisTop!=null &&
              this.cone_axisTop.equals(other.getCone_axisTop()))) &&
            ((this.cone_axisBottom==null && other.getCone_axisBottom()==null) || 
             (this.cone_axisBottom!=null &&
              this.cone_axisBottom.equals(other.getCone_axisBottom()))) &&
            ((this.cone_radiusBottom==null && other.getCone_radiusBottom()==null) || 
             (this.cone_radiusBottom!=null &&
              this.cone_radiusBottom.equals(other.getCone_radiusBottom())));
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
        if (getCone_axisTop() != null) {
            _hashCode += getCone_axisTop().hashCode();
        }
        if (getCone_axisBottom() != null) {
            _hashCode += getCone_axisBottom().hashCode();
        }
        if (getCone_radiusBottom() != null) {
            _hashCode += getCone_radiusBottom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ConeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cone_axisTop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cone_axis-top"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cone_axis-topType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cone_axisBottom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cone_axis-bottom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cone_axis-bottomType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cone_radiusBottom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cone_radius-bottom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cone_radius-bottomType"));
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
