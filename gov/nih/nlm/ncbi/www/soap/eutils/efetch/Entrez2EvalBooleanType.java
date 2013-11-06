/**
 * Entrez2EvalBooleanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2EvalBooleanType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBoolean_returnUIDsType entrez2EvalBoolean_returnUIDs;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBoolean_returnParseType entrez2EvalBoolean_returnParse;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBoolean_queryType entrez2EvalBoolean_query;

    public Entrez2EvalBooleanType() {
    }

    public Entrez2EvalBooleanType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBoolean_returnUIDsType entrez2EvalBoolean_returnUIDs,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBoolean_returnParseType entrez2EvalBoolean_returnParse,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBoolean_queryType entrez2EvalBoolean_query) {
           this.entrez2EvalBoolean_returnUIDs = entrez2EvalBoolean_returnUIDs;
           this.entrez2EvalBoolean_returnParse = entrez2EvalBoolean_returnParse;
           this.entrez2EvalBoolean_query = entrez2EvalBoolean_query;
    }


    /**
     * Gets the entrez2EvalBoolean_returnUIDs value for this Entrez2EvalBooleanType.
     * 
     * @return entrez2EvalBoolean_returnUIDs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBoolean_returnUIDsType getEntrez2EvalBoolean_returnUIDs() {
        return entrez2EvalBoolean_returnUIDs;
    }


    /**
     * Sets the entrez2EvalBoolean_returnUIDs value for this Entrez2EvalBooleanType.
     * 
     * @param entrez2EvalBoolean_returnUIDs
     */
    public void setEntrez2EvalBoolean_returnUIDs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBoolean_returnUIDsType entrez2EvalBoolean_returnUIDs) {
        this.entrez2EvalBoolean_returnUIDs = entrez2EvalBoolean_returnUIDs;
    }


    /**
     * Gets the entrez2EvalBoolean_returnParse value for this Entrez2EvalBooleanType.
     * 
     * @return entrez2EvalBoolean_returnParse
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBoolean_returnParseType getEntrez2EvalBoolean_returnParse() {
        return entrez2EvalBoolean_returnParse;
    }


    /**
     * Sets the entrez2EvalBoolean_returnParse value for this Entrez2EvalBooleanType.
     * 
     * @param entrez2EvalBoolean_returnParse
     */
    public void setEntrez2EvalBoolean_returnParse(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBoolean_returnParseType entrez2EvalBoolean_returnParse) {
        this.entrez2EvalBoolean_returnParse = entrez2EvalBoolean_returnParse;
    }


    /**
     * Gets the entrez2EvalBoolean_query value for this Entrez2EvalBooleanType.
     * 
     * @return entrez2EvalBoolean_query
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBoolean_queryType getEntrez2EvalBoolean_query() {
        return entrez2EvalBoolean_query;
    }


    /**
     * Sets the entrez2EvalBoolean_query value for this Entrez2EvalBooleanType.
     * 
     * @param entrez2EvalBoolean_query
     */
    public void setEntrez2EvalBoolean_query(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2EvalBoolean_queryType entrez2EvalBoolean_query) {
        this.entrez2EvalBoolean_query = entrez2EvalBoolean_query;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2EvalBooleanType)) return false;
        Entrez2EvalBooleanType other = (Entrez2EvalBooleanType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2EvalBoolean_returnUIDs==null && other.getEntrez2EvalBoolean_returnUIDs()==null) || 
             (this.entrez2EvalBoolean_returnUIDs!=null &&
              this.entrez2EvalBoolean_returnUIDs.equals(other.getEntrez2EvalBoolean_returnUIDs()))) &&
            ((this.entrez2EvalBoolean_returnParse==null && other.getEntrez2EvalBoolean_returnParse()==null) || 
             (this.entrez2EvalBoolean_returnParse!=null &&
              this.entrez2EvalBoolean_returnParse.equals(other.getEntrez2EvalBoolean_returnParse()))) &&
            ((this.entrez2EvalBoolean_query==null && other.getEntrez2EvalBoolean_query()==null) || 
             (this.entrez2EvalBoolean_query!=null &&
              this.entrez2EvalBoolean_query.equals(other.getEntrez2EvalBoolean_query())));
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
        if (getEntrez2EvalBoolean_returnUIDs() != null) {
            _hashCode += getEntrez2EvalBoolean_returnUIDs().hashCode();
        }
        if (getEntrez2EvalBoolean_returnParse() != null) {
            _hashCode += getEntrez2EvalBoolean_returnParse().hashCode();
        }
        if (getEntrez2EvalBoolean_query() != null) {
            _hashCode += getEntrez2EvalBoolean_query().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2EvalBooleanType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-eval-booleanType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2EvalBoolean_returnUIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-eval-boolean_return-UIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-eval-boolean_return-UIDsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2EvalBoolean_returnParse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-eval-boolean_return-parse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-eval-boolean_return-parseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2EvalBoolean_query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-eval-boolean_query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-eval-boolean_queryType"));
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
