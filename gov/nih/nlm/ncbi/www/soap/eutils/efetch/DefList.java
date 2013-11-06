/**
 * DefList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DefList  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TermHead termHead;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefHead defHead;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefItem defItem;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList[] defList;

    private java.lang.String id;  // attribute

    private java.lang.String listType;  // attribute

    private java.lang.String prefixWord;  // attribute

    private java.lang.String listContent;  // attribute

    public DefList() {
    }

    public DefList(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TermHead termHead,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefHead defHead,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefItem defItem,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList[] defList,
           java.lang.String id,
           java.lang.String listType,
           java.lang.String prefixWord,
           java.lang.String listContent) {
           this.label = label;
           this.title = title;
           this.termHead = termHead;
           this.defHead = defHead;
           this.defItem = defItem;
           this.x = x;
           this.defList = defList;
           this.id = id;
           this.listType = listType;
           this.prefixWord = prefixWord;
           this.listContent = listContent;
    }


    /**
     * Gets the label value for this DefList.
     * 
     * @return label
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DefList.
     * 
     * @param label
     */
    public void setLabel(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label) {
        this.label = label;
    }


    /**
     * Gets the title value for this DefList.
     * 
     * @return title
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title getTitle() {
        return title;
    }


    /**
     * Sets the title value for this DefList.
     * 
     * @param title
     */
    public void setTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title) {
        this.title = title;
    }


    /**
     * Gets the termHead value for this DefList.
     * 
     * @return termHead
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TermHead getTermHead() {
        return termHead;
    }


    /**
     * Sets the termHead value for this DefList.
     * 
     * @param termHead
     */
    public void setTermHead(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TermHead termHead) {
        this.termHead = termHead;
    }


    /**
     * Gets the defHead value for this DefList.
     * 
     * @return defHead
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefHead getDefHead() {
        return defHead;
    }


    /**
     * Sets the defHead value for this DefList.
     * 
     * @param defHead
     */
    public void setDefHead(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefHead defHead) {
        this.defHead = defHead;
    }


    /**
     * Gets the defItem value for this DefList.
     * 
     * @return defItem
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefItem getDefItem() {
        return defItem;
    }


    /**
     * Sets the defItem value for this DefList.
     * 
     * @param defItem
     */
    public void setDefItem(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefItem defItem) {
        this.defItem = defItem;
    }


    /**
     * Gets the x value for this DefList.
     * 
     * @return x
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.X getX() {
        return x;
    }


    /**
     * Sets the x value for this DefList.
     * 
     * @param x
     */
    public void setX(gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x) {
        this.x = x;
    }


    /**
     * Gets the defList value for this DefList.
     * 
     * @return defList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList[] getDefList() {
        return defList;
    }


    /**
     * Sets the defList value for this DefList.
     * 
     * @param defList
     */
    public void setDefList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList[] defList) {
        this.defList = defList;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList getDefList(int i) {
        return this.defList[i];
    }

    public void setDefList(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList _value) {
        this.defList[i] = _value;
    }


    /**
     * Gets the id value for this DefList.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DefList.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the listType value for this DefList.
     * 
     * @return listType
     */
    public java.lang.String getListType() {
        return listType;
    }


    /**
     * Sets the listType value for this DefList.
     * 
     * @param listType
     */
    public void setListType(java.lang.String listType) {
        this.listType = listType;
    }


    /**
     * Gets the prefixWord value for this DefList.
     * 
     * @return prefixWord
     */
    public java.lang.String getPrefixWord() {
        return prefixWord;
    }


    /**
     * Sets the prefixWord value for this DefList.
     * 
     * @param prefixWord
     */
    public void setPrefixWord(java.lang.String prefixWord) {
        this.prefixWord = prefixWord;
    }


    /**
     * Gets the listContent value for this DefList.
     * 
     * @return listContent
     */
    public java.lang.String getListContent() {
        return listContent;
    }


    /**
     * Sets the listContent value for this DefList.
     * 
     * @param listContent
     */
    public void setListContent(java.lang.String listContent) {
        this.listContent = listContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefList)) return false;
        DefList other = (DefList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.termHead==null && other.getTermHead()==null) || 
             (this.termHead!=null &&
              this.termHead.equals(other.getTermHead()))) &&
            ((this.defHead==null && other.getDefHead()==null) || 
             (this.defHead!=null &&
              this.defHead.equals(other.getDefHead()))) &&
            ((this.defItem==null && other.getDefItem()==null) || 
             (this.defItem!=null &&
              this.defItem.equals(other.getDefItem()))) &&
            ((this.x==null && other.getX()==null) || 
             (this.x!=null &&
              this.x.equals(other.getX()))) &&
            ((this.defList==null && other.getDefList()==null) || 
             (this.defList!=null &&
              java.util.Arrays.equals(this.defList, other.getDefList()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.listType==null && other.getListType()==null) || 
             (this.listType!=null &&
              this.listType.equals(other.getListType()))) &&
            ((this.prefixWord==null && other.getPrefixWord()==null) || 
             (this.prefixWord!=null &&
              this.prefixWord.equals(other.getPrefixWord()))) &&
            ((this.listContent==null && other.getListContent()==null) || 
             (this.listContent!=null &&
              this.listContent.equals(other.getListContent())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTermHead() != null) {
            _hashCode += getTermHead().hashCode();
        }
        if (getDefHead() != null) {
            _hashCode += getDefHead().hashCode();
        }
        if (getDefItem() != null) {
            _hashCode += getDefItem().hashCode();
        }
        if (getX() != null) {
            _hashCode += getX().hashCode();
        }
        if (getDefList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getListType() != null) {
            _hashCode += getListType().hashCode();
        }
        if (getPrefixWord() != null) {
            _hashCode += getPrefixWord().hashCode();
        }
        if (getListContent() != null) {
            _hashCode += getListContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DefList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">def-list"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("listType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "list-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("prefixWord");
        attrField.setXmlName(new javax.xml.namespace.QName("", "prefix-word"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("listContent");
        attrField.setXmlName(new javax.xml.namespace.QName("", "list-content"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">label"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termHead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "term-head"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">term-head"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defHead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "def-head"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">def-head"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "def-item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">def-item"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">x"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "def-list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "def-list"));
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
