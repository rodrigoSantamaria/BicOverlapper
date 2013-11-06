/**
 * ContribGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ContribGroup  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Contrib[] contrib;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Address address;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Aff aff;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorComment authorComment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bio bio;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal etal;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OnBehalfOf onBehalfOf;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Role role;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref xref;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x;

    public ContribGroup() {
    }

    public ContribGroup(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Contrib[] contrib,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Address address,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Aff aff,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorComment authorComment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bio bio,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal etal,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OnBehalfOf onBehalfOf,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Role role,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref xref,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x) {
           this.contrib = contrib;
           this.address = address;
           this.aff = aff;
           this.authorComment = authorComment;
           this.bio = bio;
           this.email = email;
           this.etal = etal;
           this.extLink = extLink;
           this.fn = fn;
           this.onBehalfOf = onBehalfOf;
           this.role = role;
           this.uri = uri;
           this.xref = xref;
           this.x = x;
    }


    /**
     * Gets the contrib value for this ContribGroup.
     * 
     * @return contrib
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Contrib[] getContrib() {
        return contrib;
    }


    /**
     * Sets the contrib value for this ContribGroup.
     * 
     * @param contrib
     */
    public void setContrib(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Contrib[] contrib) {
        this.contrib = contrib;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Contrib getContrib(int i) {
        return this.contrib[i];
    }

    public void setContrib(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Contrib _value) {
        this.contrib[i] = _value;
    }


    /**
     * Gets the address value for this ContribGroup.
     * 
     * @return address
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ContribGroup.
     * 
     * @param address
     */
    public void setAddress(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Address address) {
        this.address = address;
    }


    /**
     * Gets the aff value for this ContribGroup.
     * 
     * @return aff
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Aff getAff() {
        return aff;
    }


    /**
     * Sets the aff value for this ContribGroup.
     * 
     * @param aff
     */
    public void setAff(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Aff aff) {
        this.aff = aff;
    }


    /**
     * Gets the authorComment value for this ContribGroup.
     * 
     * @return authorComment
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorComment getAuthorComment() {
        return authorComment;
    }


    /**
     * Sets the authorComment value for this ContribGroup.
     * 
     * @param authorComment
     */
    public void setAuthorComment(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorComment authorComment) {
        this.authorComment = authorComment;
    }


    /**
     * Gets the bio value for this ContribGroup.
     * 
     * @return bio
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bio getBio() {
        return bio;
    }


    /**
     * Sets the bio value for this ContribGroup.
     * 
     * @param bio
     */
    public void setBio(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bio bio) {
        this.bio = bio;
    }


    /**
     * Gets the email value for this ContribGroup.
     * 
     * @return email
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ContribGroup.
     * 
     * @param email
     */
    public void setEmail(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email) {
        this.email = email;
    }


    /**
     * Gets the etal value for this ContribGroup.
     * 
     * @return etal
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal getEtal() {
        return etal;
    }


    /**
     * Sets the etal value for this ContribGroup.
     * 
     * @param etal
     */
    public void setEtal(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal etal) {
        this.etal = etal;
    }


    /**
     * Gets the extLink value for this ContribGroup.
     * 
     * @return extLink
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink getExtLink() {
        return extLink;
    }


    /**
     * Sets the extLink value for this ContribGroup.
     * 
     * @param extLink
     */
    public void setExtLink(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink) {
        this.extLink = extLink;
    }


    /**
     * Gets the fn value for this ContribGroup.
     * 
     * @return fn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn getFn() {
        return fn;
    }


    /**
     * Sets the fn value for this ContribGroup.
     * 
     * @param fn
     */
    public void setFn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn) {
        this.fn = fn;
    }


    /**
     * Gets the onBehalfOf value for this ContribGroup.
     * 
     * @return onBehalfOf
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OnBehalfOf getOnBehalfOf() {
        return onBehalfOf;
    }


    /**
     * Sets the onBehalfOf value for this ContribGroup.
     * 
     * @param onBehalfOf
     */
    public void setOnBehalfOf(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OnBehalfOf onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
    }


    /**
     * Gets the role value for this ContribGroup.
     * 
     * @return role
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Role getRole() {
        return role;
    }


    /**
     * Sets the role value for this ContribGroup.
     * 
     * @param role
     */
    public void setRole(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Role role) {
        this.role = role;
    }


    /**
     * Gets the uri value for this ContribGroup.
     * 
     * @return uri
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this ContribGroup.
     * 
     * @param uri
     */
    public void setUri(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri) {
        this.uri = uri;
    }


    /**
     * Gets the xref value for this ContribGroup.
     * 
     * @return xref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref getXref() {
        return xref;
    }


    /**
     * Sets the xref value for this ContribGroup.
     * 
     * @param xref
     */
    public void setXref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref xref) {
        this.xref = xref;
    }


    /**
     * Gets the x value for this ContribGroup.
     * 
     * @return x
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.X getX() {
        return x;
    }


    /**
     * Sets the x value for this ContribGroup.
     * 
     * @param x
     */
    public void setX(gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x) {
        this.x = x;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContribGroup)) return false;
        ContribGroup other = (ContribGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contrib==null && other.getContrib()==null) || 
             (this.contrib!=null &&
              java.util.Arrays.equals(this.contrib, other.getContrib()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.aff==null && other.getAff()==null) || 
             (this.aff!=null &&
              this.aff.equals(other.getAff()))) &&
            ((this.authorComment==null && other.getAuthorComment()==null) || 
             (this.authorComment!=null &&
              this.authorComment.equals(other.getAuthorComment()))) &&
            ((this.bio==null && other.getBio()==null) || 
             (this.bio!=null &&
              this.bio.equals(other.getBio()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.etal==null && other.getEtal()==null) || 
             (this.etal!=null &&
              this.etal.equals(other.getEtal()))) &&
            ((this.extLink==null && other.getExtLink()==null) || 
             (this.extLink!=null &&
              this.extLink.equals(other.getExtLink()))) &&
            ((this.fn==null && other.getFn()==null) || 
             (this.fn!=null &&
              this.fn.equals(other.getFn()))) &&
            ((this.onBehalfOf==null && other.getOnBehalfOf()==null) || 
             (this.onBehalfOf!=null &&
              this.onBehalfOf.equals(other.getOnBehalfOf()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri()))) &&
            ((this.xref==null && other.getXref()==null) || 
             (this.xref!=null &&
              this.xref.equals(other.getXref()))) &&
            ((this.x==null && other.getX()==null) || 
             (this.x!=null &&
              this.x.equals(other.getX())));
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
        if (getContrib() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContrib());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContrib(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAff() != null) {
            _hashCode += getAff().hashCode();
        }
        if (getAuthorComment() != null) {
            _hashCode += getAuthorComment().hashCode();
        }
        if (getBio() != null) {
            _hashCode += getBio().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEtal() != null) {
            _hashCode += getEtal().hashCode();
        }
        if (getExtLink() != null) {
            _hashCode += getExtLink().hashCode();
        }
        if (getFn() != null) {
            _hashCode += getFn().hashCode();
        }
        if (getOnBehalfOf() != null) {
            _hashCode += getOnBehalfOf().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        if (getXref() != null) {
            _hashCode += getXref().hashCode();
        }
        if (getX() != null) {
            _hashCode += getX().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContribGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">contrib-group"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "contrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "contrib"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "aff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">aff"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "author-comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">author-comment"));
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">email"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "etal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">etal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extLink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ext-link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ext-link"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "fn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">fn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onBehalfOf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "on-behalf-of"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">on-behalf-of"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">role"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "uri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">uri"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "xref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">xref"));
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
