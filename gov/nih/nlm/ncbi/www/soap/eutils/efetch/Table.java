/**
 * Table.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Table  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Col[] col;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Colgroup[] colgroup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Thead thead;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tfoot tfoot;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tbody[] tbody;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tr[] tr;

    private org.apache.axis.types.IDRef alternateFormOf;  // attribute

    private java.lang.String contentType;  // attribute

    private org.apache.axis.types.Id id;  // attribute

    private java.lang.String summary;  // attribute

    private java.lang.String width;  // attribute

    private java.lang.String border;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableFrame frame;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableRules rules;  // attribute

    private java.lang.String cellspacing;  // attribute

    private java.lang.String cellpadding;  // attribute

    public Table() {
    }

    public Table(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Col[] col,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Colgroup[] colgroup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Thead thead,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tfoot tfoot,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tbody[] tbody,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tr[] tr,
           org.apache.axis.types.IDRef alternateFormOf,
           java.lang.String contentType,
           org.apache.axis.types.Id id,
           java.lang.String summary,
           java.lang.String width,
           java.lang.String border,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableFrame frame,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableRules rules,
           java.lang.String cellspacing,
           java.lang.String cellpadding) {
           this.col = col;
           this.colgroup = colgroup;
           this.thead = thead;
           this.tfoot = tfoot;
           this.tbody = tbody;
           this.tr = tr;
           this.alternateFormOf = alternateFormOf;
           this.contentType = contentType;
           this.id = id;
           this.summary = summary;
           this.width = width;
           this.border = border;
           this.frame = frame;
           this.rules = rules;
           this.cellspacing = cellspacing;
           this.cellpadding = cellpadding;
    }


    /**
     * Gets the col value for this Table.
     * 
     * @return col
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Col[] getCol() {
        return col;
    }


    /**
     * Sets the col value for this Table.
     * 
     * @param col
     */
    public void setCol(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Col[] col) {
        this.col = col;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Col getCol(int i) {
        return this.col[i];
    }

    public void setCol(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Col _value) {
        this.col[i] = _value;
    }


    /**
     * Gets the colgroup value for this Table.
     * 
     * @return colgroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Colgroup[] getColgroup() {
        return colgroup;
    }


    /**
     * Sets the colgroup value for this Table.
     * 
     * @param colgroup
     */
    public void setColgroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Colgroup[] colgroup) {
        this.colgroup = colgroup;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Colgroup getColgroup(int i) {
        return this.colgroup[i];
    }

    public void setColgroup(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Colgroup _value) {
        this.colgroup[i] = _value;
    }


    /**
     * Gets the thead value for this Table.
     * 
     * @return thead
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Thead getThead() {
        return thead;
    }


    /**
     * Sets the thead value for this Table.
     * 
     * @param thead
     */
    public void setThead(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Thead thead) {
        this.thead = thead;
    }


    /**
     * Gets the tfoot value for this Table.
     * 
     * @return tfoot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tfoot getTfoot() {
        return tfoot;
    }


    /**
     * Sets the tfoot value for this Table.
     * 
     * @param tfoot
     */
    public void setTfoot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tfoot tfoot) {
        this.tfoot = tfoot;
    }


    /**
     * Gets the tbody value for this Table.
     * 
     * @return tbody
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tbody[] getTbody() {
        return tbody;
    }


    /**
     * Sets the tbody value for this Table.
     * 
     * @param tbody
     */
    public void setTbody(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tbody[] tbody) {
        this.tbody = tbody;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tbody getTbody(int i) {
        return this.tbody[i];
    }

    public void setTbody(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tbody _value) {
        this.tbody[i] = _value;
    }


    /**
     * Gets the tr value for this Table.
     * 
     * @return tr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tr[] getTr() {
        return tr;
    }


    /**
     * Sets the tr value for this Table.
     * 
     * @param tr
     */
    public void setTr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tr[] tr) {
        this.tr = tr;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tr getTr(int i) {
        return this.tr[i];
    }

    public void setTr(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Tr _value) {
        this.tr[i] = _value;
    }


    /**
     * Gets the alternateFormOf value for this Table.
     * 
     * @return alternateFormOf
     */
    public org.apache.axis.types.IDRef getAlternateFormOf() {
        return alternateFormOf;
    }


    /**
     * Sets the alternateFormOf value for this Table.
     * 
     * @param alternateFormOf
     */
    public void setAlternateFormOf(org.apache.axis.types.IDRef alternateFormOf) {
        this.alternateFormOf = alternateFormOf;
    }


    /**
     * Gets the contentType value for this Table.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this Table.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the id value for this Table.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this Table.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the summary value for this Table.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this Table.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }


    /**
     * Gets the width value for this Table.
     * 
     * @return width
     */
    public java.lang.String getWidth() {
        return width;
    }


    /**
     * Sets the width value for this Table.
     * 
     * @param width
     */
    public void setWidth(java.lang.String width) {
        this.width = width;
    }


    /**
     * Gets the border value for this Table.
     * 
     * @return border
     */
    public java.lang.String getBorder() {
        return border;
    }


    /**
     * Sets the border value for this Table.
     * 
     * @param border
     */
    public void setBorder(java.lang.String border) {
        this.border = border;
    }


    /**
     * Gets the frame value for this Table.
     * 
     * @return frame
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableFrame getFrame() {
        return frame;
    }


    /**
     * Sets the frame value for this Table.
     * 
     * @param frame
     */
    public void setFrame(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableFrame frame) {
        this.frame = frame;
    }


    /**
     * Gets the rules value for this Table.
     * 
     * @return rules
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableRules getRules() {
        return rules;
    }


    /**
     * Sets the rules value for this Table.
     * 
     * @param rules
     */
    public void setRules(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableRules rules) {
        this.rules = rules;
    }


    /**
     * Gets the cellspacing value for this Table.
     * 
     * @return cellspacing
     */
    public java.lang.String getCellspacing() {
        return cellspacing;
    }


    /**
     * Sets the cellspacing value for this Table.
     * 
     * @param cellspacing
     */
    public void setCellspacing(java.lang.String cellspacing) {
        this.cellspacing = cellspacing;
    }


    /**
     * Gets the cellpadding value for this Table.
     * 
     * @return cellpadding
     */
    public java.lang.String getCellpadding() {
        return cellpadding;
    }


    /**
     * Sets the cellpadding value for this Table.
     * 
     * @param cellpadding
     */
    public void setCellpadding(java.lang.String cellpadding) {
        this.cellpadding = cellpadding;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Table)) return false;
        Table other = (Table) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.col==null && other.getCol()==null) || 
             (this.col!=null &&
              java.util.Arrays.equals(this.col, other.getCol()))) &&
            ((this.colgroup==null && other.getColgroup()==null) || 
             (this.colgroup!=null &&
              java.util.Arrays.equals(this.colgroup, other.getColgroup()))) &&
            ((this.thead==null && other.getThead()==null) || 
             (this.thead!=null &&
              this.thead.equals(other.getThead()))) &&
            ((this.tfoot==null && other.getTfoot()==null) || 
             (this.tfoot!=null &&
              this.tfoot.equals(other.getTfoot()))) &&
            ((this.tbody==null && other.getTbody()==null) || 
             (this.tbody!=null &&
              java.util.Arrays.equals(this.tbody, other.getTbody()))) &&
            ((this.tr==null && other.getTr()==null) || 
             (this.tr!=null &&
              java.util.Arrays.equals(this.tr, other.getTr()))) &&
            ((this.alternateFormOf==null && other.getAlternateFormOf()==null) || 
             (this.alternateFormOf!=null &&
              this.alternateFormOf.equals(other.getAlternateFormOf()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth()))) &&
            ((this.border==null && other.getBorder()==null) || 
             (this.border!=null &&
              this.border.equals(other.getBorder()))) &&
            ((this.frame==null && other.getFrame()==null) || 
             (this.frame!=null &&
              this.frame.equals(other.getFrame()))) &&
            ((this.rules==null && other.getRules()==null) || 
             (this.rules!=null &&
              this.rules.equals(other.getRules()))) &&
            ((this.cellspacing==null && other.getCellspacing()==null) || 
             (this.cellspacing!=null &&
              this.cellspacing.equals(other.getCellspacing()))) &&
            ((this.cellpadding==null && other.getCellpadding()==null) || 
             (this.cellpadding!=null &&
              this.cellpadding.equals(other.getCellpadding())));
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
        if (getCol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCol());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCol(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getColgroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColgroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColgroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThead() != null) {
            _hashCode += getThead().hashCode();
        }
        if (getTfoot() != null) {
            _hashCode += getTfoot().hashCode();
        }
        if (getTbody() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTbody());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTbody(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlternateFormOf() != null) {
            _hashCode += getAlternateFormOf().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        if (getBorder() != null) {
            _hashCode += getBorder().hashCode();
        }
        if (getFrame() != null) {
            _hashCode += getFrame().hashCode();
        }
        if (getRules() != null) {
            _hashCode += getRules().hashCode();
        }
        if (getCellspacing() != null) {
            _hashCode += getCellspacing().hashCode();
        }
        if (getCellpadding() != null) {
            _hashCode += getCellpadding().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Table.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">table"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("alternateFormOf");
        attrField.setXmlName(new javax.xml.namespace.QName("", "alternate-form-of"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "IDREF"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("contentType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "content-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("summary");
        attrField.setXmlName(new javax.xml.namespace.QName("", "summary"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("width");
        attrField.setXmlName(new javax.xml.namespace.QName("", "width"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("border");
        attrField.setXmlName(new javax.xml.namespace.QName("", "border"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("frame");
        attrField.setXmlName(new javax.xml.namespace.QName("", "frame"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>table>frame"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rules");
        attrField.setXmlName(new javax.xml.namespace.QName("", "rules"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>table>rules"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cellspacing");
        attrField.setXmlName(new javax.xml.namespace.QName("", "cellspacing"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cellpadding");
        attrField.setXmlName(new javax.xml.namespace.QName("", "cellpadding"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("col");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "col"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "col"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "colgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "colgroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "thead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">thead"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tfoot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "tfoot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">tfoot"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tbody");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "tbody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "tbody"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "tr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "tr"));
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
