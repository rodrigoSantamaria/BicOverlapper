/**
 * AuthorComment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AuthorComment  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.P[] p;

    public AuthorComment() {
    }

    public AuthorComment(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.P[] p) {
           this.title = title;
           this.p = p;
    }


    /**
     * Gets the title value for this AuthorComment.
     * 
     * @return title
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title getTitle() {
        return title;
    }


    /**
     * Sets the title value for this AuthorComment.
     * 
     * @param title
     */
    public void setTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title) {
        this.title = title;
    }


    /**
     * Gets the p value for this AuthorComment.
     * 
     * @return p
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.P[] getP() {
        return p;
    }


    /**
     * Sets the p value for this AuthorComment.
     * 
     * @param p
     */
    public void setP(gov.nih.nlm.ncbi.www.soap.eutils.efetch.P[] p) {
        this.p = p;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.P getP(int i) {
        return this.p[i];
    }

    public void setP(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.P _value) {
        this.p[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthorComment)) return false;
        AuthorComment other = (AuthorComment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.p==null && other.getP()==null) || 
             (this.p!=null &&
              java.util.Arrays.equals(this.p, other.getP())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getP(), i);
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
        new org.apache.axis.description.TypeDesc(AuthorComment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">author-comment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "p"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "p"));
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
