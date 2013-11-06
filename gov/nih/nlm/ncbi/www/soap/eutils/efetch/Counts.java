/**
 * Counts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Counts  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FigCount figCount;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableCount tableCount;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.EquationCount equationCount;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RefCount refCount;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PageCount pageCount;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.WordCount wordCount;

    public Counts() {
    }

    public Counts(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FigCount figCount,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableCount tableCount,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.EquationCount equationCount,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RefCount refCount,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PageCount pageCount,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.WordCount wordCount) {
           this.figCount = figCount;
           this.tableCount = tableCount;
           this.equationCount = equationCount;
           this.refCount = refCount;
           this.pageCount = pageCount;
           this.wordCount = wordCount;
    }


    /**
     * Gets the figCount value for this Counts.
     * 
     * @return figCount
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FigCount getFigCount() {
        return figCount;
    }


    /**
     * Sets the figCount value for this Counts.
     * 
     * @param figCount
     */
    public void setFigCount(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FigCount figCount) {
        this.figCount = figCount;
    }


    /**
     * Gets the tableCount value for this Counts.
     * 
     * @return tableCount
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableCount getTableCount() {
        return tableCount;
    }


    /**
     * Sets the tableCount value for this Counts.
     * 
     * @param tableCount
     */
    public void setTableCount(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableCount tableCount) {
        this.tableCount = tableCount;
    }


    /**
     * Gets the equationCount value for this Counts.
     * 
     * @return equationCount
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EquationCount getEquationCount() {
        return equationCount;
    }


    /**
     * Sets the equationCount value for this Counts.
     * 
     * @param equationCount
     */
    public void setEquationCount(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EquationCount equationCount) {
        this.equationCount = equationCount;
    }


    /**
     * Gets the refCount value for this Counts.
     * 
     * @return refCount
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RefCount getRefCount() {
        return refCount;
    }


    /**
     * Sets the refCount value for this Counts.
     * 
     * @param refCount
     */
    public void setRefCount(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RefCount refCount) {
        this.refCount = refCount;
    }


    /**
     * Gets the pageCount value for this Counts.
     * 
     * @return pageCount
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PageCount getPageCount() {
        return pageCount;
    }


    /**
     * Sets the pageCount value for this Counts.
     * 
     * @param pageCount
     */
    public void setPageCount(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PageCount pageCount) {
        this.pageCount = pageCount;
    }


    /**
     * Gets the wordCount value for this Counts.
     * 
     * @return wordCount
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.WordCount getWordCount() {
        return wordCount;
    }


    /**
     * Sets the wordCount value for this Counts.
     * 
     * @param wordCount
     */
    public void setWordCount(gov.nih.nlm.ncbi.www.soap.eutils.efetch.WordCount wordCount) {
        this.wordCount = wordCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Counts)) return false;
        Counts other = (Counts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.figCount==null && other.getFigCount()==null) || 
             (this.figCount!=null &&
              this.figCount.equals(other.getFigCount()))) &&
            ((this.tableCount==null && other.getTableCount()==null) || 
             (this.tableCount!=null &&
              this.tableCount.equals(other.getTableCount()))) &&
            ((this.equationCount==null && other.getEquationCount()==null) || 
             (this.equationCount!=null &&
              this.equationCount.equals(other.getEquationCount()))) &&
            ((this.refCount==null && other.getRefCount()==null) || 
             (this.refCount!=null &&
              this.refCount.equals(other.getRefCount()))) &&
            ((this.pageCount==null && other.getPageCount()==null) || 
             (this.pageCount!=null &&
              this.pageCount.equals(other.getPageCount()))) &&
            ((this.wordCount==null && other.getWordCount()==null) || 
             (this.wordCount!=null &&
              this.wordCount.equals(other.getWordCount())));
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
        if (getFigCount() != null) {
            _hashCode += getFigCount().hashCode();
        }
        if (getTableCount() != null) {
            _hashCode += getTableCount().hashCode();
        }
        if (getEquationCount() != null) {
            _hashCode += getEquationCount().hashCode();
        }
        if (getRefCount() != null) {
            _hashCode += getRefCount().hashCode();
        }
        if (getPageCount() != null) {
            _hashCode += getPageCount().hashCode();
        }
        if (getWordCount() != null) {
            _hashCode += getWordCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Counts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">counts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("figCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "fig-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">fig-count"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "table-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">table-count"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equationCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "equation-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">equation-count"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ref-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ref-count"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "page-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">page-count"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "word-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">word-count"));
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
