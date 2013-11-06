/**
 * Front.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Front  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalMeta journalMeta;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleMeta articleMeta;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList defList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.List list;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes notes;

    public Front() {
    }

    public Front(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalMeta journalMeta,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleMeta articleMeta,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList defList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.List list,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes notes) {
           this.journalMeta = journalMeta;
           this.articleMeta = articleMeta;
           this.defList = defList;
           this.list = list;
           this.notes = notes;
    }


    /**
     * Gets the journalMeta value for this Front.
     * 
     * @return journalMeta
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalMeta getJournalMeta() {
        return journalMeta;
    }


    /**
     * Sets the journalMeta value for this Front.
     * 
     * @param journalMeta
     */
    public void setJournalMeta(gov.nih.nlm.ncbi.www.soap.eutils.efetch.JournalMeta journalMeta) {
        this.journalMeta = journalMeta;
    }


    /**
     * Gets the articleMeta value for this Front.
     * 
     * @return articleMeta
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleMeta getArticleMeta() {
        return articleMeta;
    }


    /**
     * Sets the articleMeta value for this Front.
     * 
     * @param articleMeta
     */
    public void setArticleMeta(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleMeta articleMeta) {
        this.articleMeta = articleMeta;
    }


    /**
     * Gets the defList value for this Front.
     * 
     * @return defList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList getDefList() {
        return defList;
    }


    /**
     * Sets the defList value for this Front.
     * 
     * @param defList
     */
    public void setDefList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList defList) {
        this.defList = defList;
    }


    /**
     * Gets the list value for this Front.
     * 
     * @return list
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.List getList() {
        return list;
    }


    /**
     * Sets the list value for this Front.
     * 
     * @param list
     */
    public void setList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.List list) {
        this.list = list;
    }


    /**
     * Gets the notes value for this Front.
     * 
     * @return notes
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Front.
     * 
     * @param notes
     */
    public void setNotes(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes notes) {
        this.notes = notes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Front)) return false;
        Front other = (Front) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.journalMeta==null && other.getJournalMeta()==null) || 
             (this.journalMeta!=null &&
              this.journalMeta.equals(other.getJournalMeta()))) &&
            ((this.articleMeta==null && other.getArticleMeta()==null) || 
             (this.articleMeta!=null &&
              this.articleMeta.equals(other.getArticleMeta()))) &&
            ((this.defList==null && other.getDefList()==null) || 
             (this.defList!=null &&
              this.defList.equals(other.getDefList()))) &&
            ((this.list==null && other.getList()==null) || 
             (this.list!=null &&
              this.list.equals(other.getList()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes())));
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
        if (getJournalMeta() != null) {
            _hashCode += getJournalMeta().hashCode();
        }
        if (getArticleMeta() != null) {
            _hashCode += getArticleMeta().hashCode();
        }
        if (getDefList() != null) {
            _hashCode += getDefList().hashCode();
        }
        if (getList() != null) {
            _hashCode += getList().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Front.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">front"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalMeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "journal-meta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">journal-meta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleMeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "article-meta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">article-meta"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "def-list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">def-list"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("list");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">list"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">notes"));
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
