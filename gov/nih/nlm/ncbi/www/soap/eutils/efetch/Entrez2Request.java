/**
 * Entrez2Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2Request  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Request_requestType entrez2Request_request;

    private java.lang.String entrez2Request_version;

    private java.lang.String entrez2Request_tool;

    private java.lang.String entrez2Request_cookie;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Request_useHistoryType entrez2Request_useHistory;

    public Entrez2Request() {
    }

    public Entrez2Request(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Request_requestType entrez2Request_request,
           java.lang.String entrez2Request_version,
           java.lang.String entrez2Request_tool,
           java.lang.String entrez2Request_cookie,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Request_useHistoryType entrez2Request_useHistory) {
           this.entrez2Request_request = entrez2Request_request;
           this.entrez2Request_version = entrez2Request_version;
           this.entrez2Request_tool = entrez2Request_tool;
           this.entrez2Request_cookie = entrez2Request_cookie;
           this.entrez2Request_useHistory = entrez2Request_useHistory;
    }


    /**
     * Gets the entrez2Request_request value for this Entrez2Request.
     * 
     * @return entrez2Request_request
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Request_requestType getEntrez2Request_request() {
        return entrez2Request_request;
    }


    /**
     * Sets the entrez2Request_request value for this Entrez2Request.
     * 
     * @param entrez2Request_request
     */
    public void setEntrez2Request_request(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Request_requestType entrez2Request_request) {
        this.entrez2Request_request = entrez2Request_request;
    }


    /**
     * Gets the entrez2Request_version value for this Entrez2Request.
     * 
     * @return entrez2Request_version
     */
    public java.lang.String getEntrez2Request_version() {
        return entrez2Request_version;
    }


    /**
     * Sets the entrez2Request_version value for this Entrez2Request.
     * 
     * @param entrez2Request_version
     */
    public void setEntrez2Request_version(java.lang.String entrez2Request_version) {
        this.entrez2Request_version = entrez2Request_version;
    }


    /**
     * Gets the entrez2Request_tool value for this Entrez2Request.
     * 
     * @return entrez2Request_tool
     */
    public java.lang.String getEntrez2Request_tool() {
        return entrez2Request_tool;
    }


    /**
     * Sets the entrez2Request_tool value for this Entrez2Request.
     * 
     * @param entrez2Request_tool
     */
    public void setEntrez2Request_tool(java.lang.String entrez2Request_tool) {
        this.entrez2Request_tool = entrez2Request_tool;
    }


    /**
     * Gets the entrez2Request_cookie value for this Entrez2Request.
     * 
     * @return entrez2Request_cookie
     */
    public java.lang.String getEntrez2Request_cookie() {
        return entrez2Request_cookie;
    }


    /**
     * Sets the entrez2Request_cookie value for this Entrez2Request.
     * 
     * @param entrez2Request_cookie
     */
    public void setEntrez2Request_cookie(java.lang.String entrez2Request_cookie) {
        this.entrez2Request_cookie = entrez2Request_cookie;
    }


    /**
     * Gets the entrez2Request_useHistory value for this Entrez2Request.
     * 
     * @return entrez2Request_useHistory
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Request_useHistoryType getEntrez2Request_useHistory() {
        return entrez2Request_useHistory;
    }


    /**
     * Sets the entrez2Request_useHistory value for this Entrez2Request.
     * 
     * @param entrez2Request_useHistory
     */
    public void setEntrez2Request_useHistory(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Request_useHistoryType entrez2Request_useHistory) {
        this.entrez2Request_useHistory = entrez2Request_useHistory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2Request)) return false;
        Entrez2Request other = (Entrez2Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2Request_request==null && other.getEntrez2Request_request()==null) || 
             (this.entrez2Request_request!=null &&
              this.entrez2Request_request.equals(other.getEntrez2Request_request()))) &&
            ((this.entrez2Request_version==null && other.getEntrez2Request_version()==null) || 
             (this.entrez2Request_version!=null &&
              this.entrez2Request_version.equals(other.getEntrez2Request_version()))) &&
            ((this.entrez2Request_tool==null && other.getEntrez2Request_tool()==null) || 
             (this.entrez2Request_tool!=null &&
              this.entrez2Request_tool.equals(other.getEntrez2Request_tool()))) &&
            ((this.entrez2Request_cookie==null && other.getEntrez2Request_cookie()==null) || 
             (this.entrez2Request_cookie!=null &&
              this.entrez2Request_cookie.equals(other.getEntrez2Request_cookie()))) &&
            ((this.entrez2Request_useHistory==null && other.getEntrez2Request_useHistory()==null) || 
             (this.entrez2Request_useHistory!=null &&
              this.entrez2Request_useHistory.equals(other.getEntrez2Request_useHistory())));
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
        if (getEntrez2Request_request() != null) {
            _hashCode += getEntrez2Request_request().hashCode();
        }
        if (getEntrez2Request_version() != null) {
            _hashCode += getEntrez2Request_version().hashCode();
        }
        if (getEntrez2Request_tool() != null) {
            _hashCode += getEntrez2Request_tool().hashCode();
        }
        if (getEntrez2Request_cookie() != null) {
            _hashCode += getEntrez2Request_cookie().hashCode();
        }
        if (getEntrez2Request_useHistory() != null) {
            _hashCode += getEntrez2Request_useHistory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Entrez2-request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Request_request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-request_request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-request_requestType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Request_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-request_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Request_tool");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-request_tool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Request_cookie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-request_cookie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Request_useHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-request_use-history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-request_use-historyType"));
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
