/**
 * ESearchRequestMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.esearch;

public class ESearchRequestMS  implements java.io.Serializable {
    private java.lang.String db;

    private java.lang.String term;

    private java.lang.String webEnv;

    private java.lang.String query_key;

    private java.lang.String usehistory;

    private java.lang.String tool;

    private java.lang.String email;

    private java.lang.String field;

    private java.lang.String reldate;

    private java.lang.String mindate;

    private java.lang.String maxdate;

    private java.lang.String datetype;

    private java.lang.String retstart;

    private java.lang.String retmax;

    private java.lang.String rettype;

    private java.lang.String sort;

    public ESearchRequestMS() {
    }

    public ESearchRequestMS(
           java.lang.String db,
           java.lang.String term,
           java.lang.String webEnv,
           java.lang.String query_key,
           java.lang.String usehistory,
           java.lang.String tool,
           java.lang.String email,
           java.lang.String field,
           java.lang.String reldate,
           java.lang.String mindate,
           java.lang.String maxdate,
           java.lang.String datetype,
           java.lang.String retstart,
           java.lang.String retmax,
           java.lang.String rettype,
           java.lang.String sort) {
           this.db = db;
           this.term = term;
           this.webEnv = webEnv;
           this.query_key = query_key;
           this.usehistory = usehistory;
           this.tool = tool;
           this.email = email;
           this.field = field;
           this.reldate = reldate;
           this.mindate = mindate;
           this.maxdate = maxdate;
           this.datetype = datetype;
           this.retstart = retstart;
           this.retmax = retmax;
           this.rettype = rettype;
           this.sort = sort;
    }


    /**
     * Gets the db value for this ESearchRequestMS.
     * 
     * @return db
     */
    public java.lang.String getDb() {
        return db;
    }


    /**
     * Sets the db value for this ESearchRequestMS.
     * 
     * @param db
     */
    public void setDb(java.lang.String db) {
        this.db = db;
    }


    /**
     * Gets the term value for this ESearchRequestMS.
     * 
     * @return term
     */
    public java.lang.String getTerm() {
        return term;
    }


    /**
     * Sets the term value for this ESearchRequestMS.
     * 
     * @param term
     */
    public void setTerm(java.lang.String term) {
        this.term = term;
    }


    /**
     * Gets the webEnv value for this ESearchRequestMS.
     * 
     * @return webEnv
     */
    public java.lang.String getWebEnv() {
        return webEnv;
    }


    /**
     * Sets the webEnv value for this ESearchRequestMS.
     * 
     * @param webEnv
     */
    public void setWebEnv(java.lang.String webEnv) {
        this.webEnv = webEnv;
    }


    /**
     * Gets the query_key value for this ESearchRequestMS.
     * 
     * @return query_key
     */
    public java.lang.String getQuery_key() {
        return query_key;
    }


    /**
     * Sets the query_key value for this ESearchRequestMS.
     * 
     * @param query_key
     */
    public void setQuery_key(java.lang.String query_key) {
        this.query_key = query_key;
    }


    /**
     * Gets the usehistory value for this ESearchRequestMS.
     * 
     * @return usehistory
     */
    public java.lang.String getUsehistory() {
        return usehistory;
    }


    /**
     * Sets the usehistory value for this ESearchRequestMS.
     * 
     * @param usehistory
     */
    public void setUsehistory(java.lang.String usehistory) {
        this.usehistory = usehistory;
    }


    /**
     * Gets the tool value for this ESearchRequestMS.
     * 
     * @return tool
     */
    public java.lang.String getTool() {
        return tool;
    }


    /**
     * Sets the tool value for this ESearchRequestMS.
     * 
     * @param tool
     */
    public void setTool(java.lang.String tool) {
        this.tool = tool;
    }


    /**
     * Gets the email value for this ESearchRequestMS.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ESearchRequestMS.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the field value for this ESearchRequestMS.
     * 
     * @return field
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this ESearchRequestMS.
     * 
     * @param field
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the reldate value for this ESearchRequestMS.
     * 
     * @return reldate
     */
    public java.lang.String getReldate() {
        return reldate;
    }


    /**
     * Sets the reldate value for this ESearchRequestMS.
     * 
     * @param reldate
     */
    public void setReldate(java.lang.String reldate) {
        this.reldate = reldate;
    }


    /**
     * Gets the mindate value for this ESearchRequestMS.
     * 
     * @return mindate
     */
    public java.lang.String getMindate() {
        return mindate;
    }


    /**
     * Sets the mindate value for this ESearchRequestMS.
     * 
     * @param mindate
     */
    public void setMindate(java.lang.String mindate) {
        this.mindate = mindate;
    }


    /**
     * Gets the maxdate value for this ESearchRequestMS.
     * 
     * @return maxdate
     */
    public java.lang.String getMaxdate() {
        return maxdate;
    }


    /**
     * Sets the maxdate value for this ESearchRequestMS.
     * 
     * @param maxdate
     */
    public void setMaxdate(java.lang.String maxdate) {
        this.maxdate = maxdate;
    }


    /**
     * Gets the datetype value for this ESearchRequestMS.
     * 
     * @return datetype
     */
    public java.lang.String getDatetype() {
        return datetype;
    }


    /**
     * Sets the datetype value for this ESearchRequestMS.
     * 
     * @param datetype
     */
    public void setDatetype(java.lang.String datetype) {
        this.datetype = datetype;
    }


    /**
     * Gets the retstart value for this ESearchRequestMS.
     * 
     * @return retstart
     */
    public java.lang.String getRetstart() {
        return retstart;
    }


    /**
     * Sets the retstart value for this ESearchRequestMS.
     * 
     * @param retstart
     */
    public void setRetstart(java.lang.String retstart) {
        this.retstart = retstart;
    }


    /**
     * Gets the retmax value for this ESearchRequestMS.
     * 
     * @return retmax
     */
    public java.lang.String getRetmax() {
        return retmax;
    }


    /**
     * Sets the retmax value for this ESearchRequestMS.
     * 
     * @param retmax
     */
    public void setRetmax(java.lang.String retmax) {
        this.retmax = retmax;
    }


    /**
     * Gets the rettype value for this ESearchRequestMS.
     * 
     * @return rettype
     */
    public java.lang.String getRettype() {
        return rettype;
    }


    /**
     * Sets the rettype value for this ESearchRequestMS.
     * 
     * @param rettype
     */
    public void setRettype(java.lang.String rettype) {
        this.rettype = rettype;
    }


    /**
     * Gets the sort value for this ESearchRequestMS.
     * 
     * @return sort
     */
    public java.lang.String getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this ESearchRequestMS.
     * 
     * @param sort
     */
    public void setSort(java.lang.String sort) {
        this.sort = sort;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ESearchRequestMS)) return false;
        ESearchRequestMS other = (ESearchRequestMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.db==null && other.getDb()==null) || 
             (this.db!=null &&
              this.db.equals(other.getDb()))) &&
            ((this.term==null && other.getTerm()==null) || 
             (this.term!=null &&
              this.term.equals(other.getTerm()))) &&
            ((this.webEnv==null && other.getWebEnv()==null) || 
             (this.webEnv!=null &&
              this.webEnv.equals(other.getWebEnv()))) &&
            ((this.query_key==null && other.getQuery_key()==null) || 
             (this.query_key!=null &&
              this.query_key.equals(other.getQuery_key()))) &&
            ((this.usehistory==null && other.getUsehistory()==null) || 
             (this.usehistory!=null &&
              this.usehistory.equals(other.getUsehistory()))) &&
            ((this.tool==null && other.getTool()==null) || 
             (this.tool!=null &&
              this.tool.equals(other.getTool()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.reldate==null && other.getReldate()==null) || 
             (this.reldate!=null &&
              this.reldate.equals(other.getReldate()))) &&
            ((this.mindate==null && other.getMindate()==null) || 
             (this.mindate!=null &&
              this.mindate.equals(other.getMindate()))) &&
            ((this.maxdate==null && other.getMaxdate()==null) || 
             (this.maxdate!=null &&
              this.maxdate.equals(other.getMaxdate()))) &&
            ((this.datetype==null && other.getDatetype()==null) || 
             (this.datetype!=null &&
              this.datetype.equals(other.getDatetype()))) &&
            ((this.retstart==null && other.getRetstart()==null) || 
             (this.retstart!=null &&
              this.retstart.equals(other.getRetstart()))) &&
            ((this.retmax==null && other.getRetmax()==null) || 
             (this.retmax!=null &&
              this.retmax.equals(other.getRetmax()))) &&
            ((this.rettype==null && other.getRettype()==null) || 
             (this.rettype!=null &&
              this.rettype.equals(other.getRettype()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort())));
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
        if (getDb() != null) {
            _hashCode += getDb().hashCode();
        }
        if (getTerm() != null) {
            _hashCode += getTerm().hashCode();
        }
        if (getWebEnv() != null) {
            _hashCode += getWebEnv().hashCode();
        }
        if (getQuery_key() != null) {
            _hashCode += getQuery_key().hashCode();
        }
        if (getUsehistory() != null) {
            _hashCode += getUsehistory().hashCode();
        }
        if (getTool() != null) {
            _hashCode += getTool().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getReldate() != null) {
            _hashCode += getReldate().hashCode();
        }
        if (getMindate() != null) {
            _hashCode += getMindate().hashCode();
        }
        if (getMaxdate() != null) {
            _hashCode += getMaxdate().hashCode();
        }
        if (getDatetype() != null) {
            _hashCode += getDatetype().hashCode();
        }
        if (getRetstart() != null) {
            _hashCode += getRetstart().hashCode();
        }
        if (getRetmax() != null) {
            _hashCode += getRetmax().hashCode();
        }
        if (getRettype() != null) {
            _hashCode += getRettype().hashCode();
        }
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ESearchRequestMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", ">eSearchRequestMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("term");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webEnv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "WebEnv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "query_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usehistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "usehistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tool");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "tool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reldate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "reldate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mindate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "mindate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "maxdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datetype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "datetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retstart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "retstart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retmax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "retmax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rettype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "rettype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "sort"));
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
