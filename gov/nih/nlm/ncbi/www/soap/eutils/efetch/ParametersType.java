/**
 * ParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ParametersType  implements java.io.Serializable {
    private java.lang.String parameters_matrix;

    private java.lang.String parameters_expect;

    private java.lang.String parameters_include;

    private java.lang.String parameters_scMatch;

    private java.lang.String parameters_scMismatch;

    private java.lang.String parameters_gapOpen;

    private java.lang.String parameters_gapExtend;

    private java.lang.String parameters_filter;

    private java.lang.String parameters_pattern;

    private java.lang.String parameters_entrezQuery;

    public ParametersType() {
    }

    public ParametersType(
           java.lang.String parameters_matrix,
           java.lang.String parameters_expect,
           java.lang.String parameters_include,
           java.lang.String parameters_scMatch,
           java.lang.String parameters_scMismatch,
           java.lang.String parameters_gapOpen,
           java.lang.String parameters_gapExtend,
           java.lang.String parameters_filter,
           java.lang.String parameters_pattern,
           java.lang.String parameters_entrezQuery) {
           this.parameters_matrix = parameters_matrix;
           this.parameters_expect = parameters_expect;
           this.parameters_include = parameters_include;
           this.parameters_scMatch = parameters_scMatch;
           this.parameters_scMismatch = parameters_scMismatch;
           this.parameters_gapOpen = parameters_gapOpen;
           this.parameters_gapExtend = parameters_gapExtend;
           this.parameters_filter = parameters_filter;
           this.parameters_pattern = parameters_pattern;
           this.parameters_entrezQuery = parameters_entrezQuery;
    }


    /**
     * Gets the parameters_matrix value for this ParametersType.
     * 
     * @return parameters_matrix
     */
    public java.lang.String getParameters_matrix() {
        return parameters_matrix;
    }


    /**
     * Sets the parameters_matrix value for this ParametersType.
     * 
     * @param parameters_matrix
     */
    public void setParameters_matrix(java.lang.String parameters_matrix) {
        this.parameters_matrix = parameters_matrix;
    }


    /**
     * Gets the parameters_expect value for this ParametersType.
     * 
     * @return parameters_expect
     */
    public java.lang.String getParameters_expect() {
        return parameters_expect;
    }


    /**
     * Sets the parameters_expect value for this ParametersType.
     * 
     * @param parameters_expect
     */
    public void setParameters_expect(java.lang.String parameters_expect) {
        this.parameters_expect = parameters_expect;
    }


    /**
     * Gets the parameters_include value for this ParametersType.
     * 
     * @return parameters_include
     */
    public java.lang.String getParameters_include() {
        return parameters_include;
    }


    /**
     * Sets the parameters_include value for this ParametersType.
     * 
     * @param parameters_include
     */
    public void setParameters_include(java.lang.String parameters_include) {
        this.parameters_include = parameters_include;
    }


    /**
     * Gets the parameters_scMatch value for this ParametersType.
     * 
     * @return parameters_scMatch
     */
    public java.lang.String getParameters_scMatch() {
        return parameters_scMatch;
    }


    /**
     * Sets the parameters_scMatch value for this ParametersType.
     * 
     * @param parameters_scMatch
     */
    public void setParameters_scMatch(java.lang.String parameters_scMatch) {
        this.parameters_scMatch = parameters_scMatch;
    }


    /**
     * Gets the parameters_scMismatch value for this ParametersType.
     * 
     * @return parameters_scMismatch
     */
    public java.lang.String getParameters_scMismatch() {
        return parameters_scMismatch;
    }


    /**
     * Sets the parameters_scMismatch value for this ParametersType.
     * 
     * @param parameters_scMismatch
     */
    public void setParameters_scMismatch(java.lang.String parameters_scMismatch) {
        this.parameters_scMismatch = parameters_scMismatch;
    }


    /**
     * Gets the parameters_gapOpen value for this ParametersType.
     * 
     * @return parameters_gapOpen
     */
    public java.lang.String getParameters_gapOpen() {
        return parameters_gapOpen;
    }


    /**
     * Sets the parameters_gapOpen value for this ParametersType.
     * 
     * @param parameters_gapOpen
     */
    public void setParameters_gapOpen(java.lang.String parameters_gapOpen) {
        this.parameters_gapOpen = parameters_gapOpen;
    }


    /**
     * Gets the parameters_gapExtend value for this ParametersType.
     * 
     * @return parameters_gapExtend
     */
    public java.lang.String getParameters_gapExtend() {
        return parameters_gapExtend;
    }


    /**
     * Sets the parameters_gapExtend value for this ParametersType.
     * 
     * @param parameters_gapExtend
     */
    public void setParameters_gapExtend(java.lang.String parameters_gapExtend) {
        this.parameters_gapExtend = parameters_gapExtend;
    }


    /**
     * Gets the parameters_filter value for this ParametersType.
     * 
     * @return parameters_filter
     */
    public java.lang.String getParameters_filter() {
        return parameters_filter;
    }


    /**
     * Sets the parameters_filter value for this ParametersType.
     * 
     * @param parameters_filter
     */
    public void setParameters_filter(java.lang.String parameters_filter) {
        this.parameters_filter = parameters_filter;
    }


    /**
     * Gets the parameters_pattern value for this ParametersType.
     * 
     * @return parameters_pattern
     */
    public java.lang.String getParameters_pattern() {
        return parameters_pattern;
    }


    /**
     * Sets the parameters_pattern value for this ParametersType.
     * 
     * @param parameters_pattern
     */
    public void setParameters_pattern(java.lang.String parameters_pattern) {
        this.parameters_pattern = parameters_pattern;
    }


    /**
     * Gets the parameters_entrezQuery value for this ParametersType.
     * 
     * @return parameters_entrezQuery
     */
    public java.lang.String getParameters_entrezQuery() {
        return parameters_entrezQuery;
    }


    /**
     * Sets the parameters_entrezQuery value for this ParametersType.
     * 
     * @param parameters_entrezQuery
     */
    public void setParameters_entrezQuery(java.lang.String parameters_entrezQuery) {
        this.parameters_entrezQuery = parameters_entrezQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametersType)) return false;
        ParametersType other = (ParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parameters_matrix==null && other.getParameters_matrix()==null) || 
             (this.parameters_matrix!=null &&
              this.parameters_matrix.equals(other.getParameters_matrix()))) &&
            ((this.parameters_expect==null && other.getParameters_expect()==null) || 
             (this.parameters_expect!=null &&
              this.parameters_expect.equals(other.getParameters_expect()))) &&
            ((this.parameters_include==null && other.getParameters_include()==null) || 
             (this.parameters_include!=null &&
              this.parameters_include.equals(other.getParameters_include()))) &&
            ((this.parameters_scMatch==null && other.getParameters_scMatch()==null) || 
             (this.parameters_scMatch!=null &&
              this.parameters_scMatch.equals(other.getParameters_scMatch()))) &&
            ((this.parameters_scMismatch==null && other.getParameters_scMismatch()==null) || 
             (this.parameters_scMismatch!=null &&
              this.parameters_scMismatch.equals(other.getParameters_scMismatch()))) &&
            ((this.parameters_gapOpen==null && other.getParameters_gapOpen()==null) || 
             (this.parameters_gapOpen!=null &&
              this.parameters_gapOpen.equals(other.getParameters_gapOpen()))) &&
            ((this.parameters_gapExtend==null && other.getParameters_gapExtend()==null) || 
             (this.parameters_gapExtend!=null &&
              this.parameters_gapExtend.equals(other.getParameters_gapExtend()))) &&
            ((this.parameters_filter==null && other.getParameters_filter()==null) || 
             (this.parameters_filter!=null &&
              this.parameters_filter.equals(other.getParameters_filter()))) &&
            ((this.parameters_pattern==null && other.getParameters_pattern()==null) || 
             (this.parameters_pattern!=null &&
              this.parameters_pattern.equals(other.getParameters_pattern()))) &&
            ((this.parameters_entrezQuery==null && other.getParameters_entrezQuery()==null) || 
             (this.parameters_entrezQuery!=null &&
              this.parameters_entrezQuery.equals(other.getParameters_entrezQuery())));
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
        if (getParameters_matrix() != null) {
            _hashCode += getParameters_matrix().hashCode();
        }
        if (getParameters_expect() != null) {
            _hashCode += getParameters_expect().hashCode();
        }
        if (getParameters_include() != null) {
            _hashCode += getParameters_include().hashCode();
        }
        if (getParameters_scMatch() != null) {
            _hashCode += getParameters_scMatch().hashCode();
        }
        if (getParameters_scMismatch() != null) {
            _hashCode += getParameters_scMismatch().hashCode();
        }
        if (getParameters_gapOpen() != null) {
            _hashCode += getParameters_gapOpen().hashCode();
        }
        if (getParameters_gapExtend() != null) {
            _hashCode += getParameters_gapExtend().hashCode();
        }
        if (getParameters_filter() != null) {
            _hashCode += getParameters_filter().hashCode();
        }
        if (getParameters_pattern() != null) {
            _hashCode += getParameters_pattern().hashCode();
        }
        if (getParameters_entrezQuery() != null) {
            _hashCode += getParameters_entrezQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters_matrix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Parameters_matrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters_expect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Parameters_expect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters_include");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Parameters_include"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters_scMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Parameters_sc-match"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters_scMismatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Parameters_sc-mismatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters_gapOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Parameters_gap-open"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters_gapExtend");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Parameters_gap-extend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Parameters_filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters_pattern");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Parameters_pattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters_entrezQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Parameters_entrez-query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
