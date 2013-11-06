/**
 * TriangleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TriangleType  implements java.io.Serializable {
    private java.lang.String triangle_nelements;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Triangle_scoresType triangle_scores;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Triangle_divRanksType triangle_divRanks;

    public TriangleType() {
    }

    public TriangleType(
           java.lang.String triangle_nelements,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Triangle_scoresType triangle_scores,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Triangle_divRanksType triangle_divRanks) {
           this.triangle_nelements = triangle_nelements;
           this.triangle_scores = triangle_scores;
           this.triangle_divRanks = triangle_divRanks;
    }


    /**
     * Gets the triangle_nelements value for this TriangleType.
     * 
     * @return triangle_nelements
     */
    public java.lang.String getTriangle_nelements() {
        return triangle_nelements;
    }


    /**
     * Sets the triangle_nelements value for this TriangleType.
     * 
     * @param triangle_nelements
     */
    public void setTriangle_nelements(java.lang.String triangle_nelements) {
        this.triangle_nelements = triangle_nelements;
    }


    /**
     * Gets the triangle_scores value for this TriangleType.
     * 
     * @return triangle_scores
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Triangle_scoresType getTriangle_scores() {
        return triangle_scores;
    }


    /**
     * Sets the triangle_scores value for this TriangleType.
     * 
     * @param triangle_scores
     */
    public void setTriangle_scores(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Triangle_scoresType triangle_scores) {
        this.triangle_scores = triangle_scores;
    }


    /**
     * Gets the triangle_divRanks value for this TriangleType.
     * 
     * @return triangle_divRanks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Triangle_divRanksType getTriangle_divRanks() {
        return triangle_divRanks;
    }


    /**
     * Sets the triangle_divRanks value for this TriangleType.
     * 
     * @param triangle_divRanks
     */
    public void setTriangle_divRanks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Triangle_divRanksType triangle_divRanks) {
        this.triangle_divRanks = triangle_divRanks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriangleType)) return false;
        TriangleType other = (TriangleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.triangle_nelements==null && other.getTriangle_nelements()==null) || 
             (this.triangle_nelements!=null &&
              this.triangle_nelements.equals(other.getTriangle_nelements()))) &&
            ((this.triangle_scores==null && other.getTriangle_scores()==null) || 
             (this.triangle_scores!=null &&
              this.triangle_scores.equals(other.getTriangle_scores()))) &&
            ((this.triangle_divRanks==null && other.getTriangle_divRanks()==null) || 
             (this.triangle_divRanks!=null &&
              this.triangle_divRanks.equals(other.getTriangle_divRanks())));
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
        if (getTriangle_nelements() != null) {
            _hashCode += getTriangle_nelements().hashCode();
        }
        if (getTriangle_scores() != null) {
            _hashCode += getTriangle_scores().hashCode();
        }
        if (getTriangle_divRanks() != null) {
            _hashCode += getTriangle_divRanks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TriangleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TriangleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triangle_nelements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Triangle_nelements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triangle_scores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Triangle_scores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Triangle_scoresType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triangle_divRanks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Triangle_div-ranks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Triangle_div-ranksType"));
        elemField.setMinOccurs(0);
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
