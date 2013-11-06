/**
 * Back.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Back  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title[] title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack ack;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AppGroup appGroup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bio bio;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FnGroup fnGroup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Glossary glossary;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RefList refList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes notes;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sec sec;

    public Back() {
    }

    public Back(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title[] title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack ack,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AppGroup appGroup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bio bio,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FnGroup fnGroup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Glossary glossary,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RefList refList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes notes,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sec sec) {
           this.title = title;
           this.ack = ack;
           this.appGroup = appGroup;
           this.bio = bio;
           this.fnGroup = fnGroup;
           this.glossary = glossary;
           this.refList = refList;
           this.notes = notes;
           this.sec = sec;
    }


    /**
     * Gets the title value for this Back.
     * 
     * @return title
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Back.
     * 
     * @param title
     */
    public void setTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title[] title) {
        this.title = title;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title getTitle(int i) {
        return this.title[i];
    }

    public void setTitle(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title _value) {
        this.title[i] = _value;
    }


    /**
     * Gets the ack value for this Back.
     * 
     * @return ack
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack getAck() {
        return ack;
    }


    /**
     * Sets the ack value for this Back.
     * 
     * @param ack
     */
    public void setAck(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack ack) {
        this.ack = ack;
    }


    /**
     * Gets the appGroup value for this Back.
     * 
     * @return appGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AppGroup getAppGroup() {
        return appGroup;
    }


    /**
     * Sets the appGroup value for this Back.
     * 
     * @param appGroup
     */
    public void setAppGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AppGroup appGroup) {
        this.appGroup = appGroup;
    }


    /**
     * Gets the bio value for this Back.
     * 
     * @return bio
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bio getBio() {
        return bio;
    }


    /**
     * Sets the bio value for this Back.
     * 
     * @param bio
     */
    public void setBio(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bio bio) {
        this.bio = bio;
    }


    /**
     * Gets the fnGroup value for this Back.
     * 
     * @return fnGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FnGroup getFnGroup() {
        return fnGroup;
    }


    /**
     * Sets the fnGroup value for this Back.
     * 
     * @param fnGroup
     */
    public void setFnGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FnGroup fnGroup) {
        this.fnGroup = fnGroup;
    }


    /**
     * Gets the glossary value for this Back.
     * 
     * @return glossary
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Glossary getGlossary() {
        return glossary;
    }


    /**
     * Sets the glossary value for this Back.
     * 
     * @param glossary
     */
    public void setGlossary(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Glossary glossary) {
        this.glossary = glossary;
    }


    /**
     * Gets the refList value for this Back.
     * 
     * @return refList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RefList getRefList() {
        return refList;
    }


    /**
     * Sets the refList value for this Back.
     * 
     * @param refList
     */
    public void setRefList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RefList refList) {
        this.refList = refList;
    }


    /**
     * Gets the notes value for this Back.
     * 
     * @return notes
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Back.
     * 
     * @param notes
     */
    public void setNotes(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes notes) {
        this.notes = notes;
    }


    /**
     * Gets the sec value for this Back.
     * 
     * @return sec
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sec getSec() {
        return sec;
    }


    /**
     * Sets the sec value for this Back.
     * 
     * @param sec
     */
    public void setSec(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sec sec) {
        this.sec = sec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Back)) return false;
        Back other = (Back) obj;
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
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.ack==null && other.getAck()==null) || 
             (this.ack!=null &&
              this.ack.equals(other.getAck()))) &&
            ((this.appGroup==null && other.getAppGroup()==null) || 
             (this.appGroup!=null &&
              this.appGroup.equals(other.getAppGroup()))) &&
            ((this.bio==null && other.getBio()==null) || 
             (this.bio!=null &&
              this.bio.equals(other.getBio()))) &&
            ((this.fnGroup==null && other.getFnGroup()==null) || 
             (this.fnGroup!=null &&
              this.fnGroup.equals(other.getFnGroup()))) &&
            ((this.glossary==null && other.getGlossary()==null) || 
             (this.glossary!=null &&
              this.glossary.equals(other.getGlossary()))) &&
            ((this.refList==null && other.getRefList()==null) || 
             (this.refList!=null &&
              this.refList.equals(other.getRefList()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.sec==null && other.getSec()==null) || 
             (this.sec!=null &&
              this.sec.equals(other.getSec())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAck() != null) {
            _hashCode += getAck().hashCode();
        }
        if (getAppGroup() != null) {
            _hashCode += getAppGroup().hashCode();
        }
        if (getBio() != null) {
            _hashCode += getBio().hashCode();
        }
        if (getFnGroup() != null) {
            _hashCode += getFnGroup().hashCode();
        }
        if (getGlossary() != null) {
            _hashCode += getGlossary().hashCode();
        }
        if (getRefList() != null) {
            _hashCode += getRefList().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getSec() != null) {
            _hashCode += getSec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Back.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">back"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ack");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ack"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "app-group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">app-group"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "bio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">bio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fnGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "fn-group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">fn-group"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glossary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "glossary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">glossary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ref-list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ref-list"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "sec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">sec"));
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
