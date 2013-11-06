/**
 * AuthList_namesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AuthList_namesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_names_stdType authList_names_std;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_names_mlType authList_names_ml;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_names_strType authList_names_str;

    public AuthList_namesType() {
    }

    public AuthList_namesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_names_stdType authList_names_std,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_names_mlType authList_names_ml,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_names_strType authList_names_str) {
           this.authList_names_std = authList_names_std;
           this.authList_names_ml = authList_names_ml;
           this.authList_names_str = authList_names_str;
    }


    /**
     * Gets the authList_names_std value for this AuthList_namesType.
     * 
     * @return authList_names_std
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_names_stdType getAuthList_names_std() {
        return authList_names_std;
    }


    /**
     * Sets the authList_names_std value for this AuthList_namesType.
     * 
     * @param authList_names_std
     */
    public void setAuthList_names_std(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_names_stdType authList_names_std) {
        this.authList_names_std = authList_names_std;
    }


    /**
     * Gets the authList_names_ml value for this AuthList_namesType.
     * 
     * @return authList_names_ml
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_names_mlType getAuthList_names_ml() {
        return authList_names_ml;
    }


    /**
     * Sets the authList_names_ml value for this AuthList_namesType.
     * 
     * @param authList_names_ml
     */
    public void setAuthList_names_ml(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_names_mlType authList_names_ml) {
        this.authList_names_ml = authList_names_ml;
    }


    /**
     * Gets the authList_names_str value for this AuthList_namesType.
     * 
     * @return authList_names_str
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_names_strType getAuthList_names_str() {
        return authList_names_str;
    }


    /**
     * Sets the authList_names_str value for this AuthList_namesType.
     * 
     * @param authList_names_str
     */
    public void setAuthList_names_str(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_names_strType authList_names_str) {
        this.authList_names_str = authList_names_str;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthList_namesType)) return false;
        AuthList_namesType other = (AuthList_namesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authList_names_std==null && other.getAuthList_names_std()==null) || 
             (this.authList_names_std!=null &&
              this.authList_names_std.equals(other.getAuthList_names_std()))) &&
            ((this.authList_names_ml==null && other.getAuthList_names_ml()==null) || 
             (this.authList_names_ml!=null &&
              this.authList_names_ml.equals(other.getAuthList_names_ml()))) &&
            ((this.authList_names_str==null && other.getAuthList_names_str()==null) || 
             (this.authList_names_str!=null &&
              this.authList_names_str.equals(other.getAuthList_names_str())));
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
        if (getAuthList_names_std() != null) {
            _hashCode += getAuthList_names_std().hashCode();
        }
        if (getAuthList_names_ml() != null) {
            _hashCode += getAuthList_names_ml().hashCode();
        }
        if (getAuthList_names_str() != null) {
            _hashCode += getAuthList_names_str().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthList_namesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_namesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authList_names_std");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_names_std"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_names_stdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authList_names_ml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_names_ml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_names_mlType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authList_names_str");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_names_str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_names_strType"));
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
