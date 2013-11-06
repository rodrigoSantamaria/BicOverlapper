/**
 * Contrib.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Contrib  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Collab collab;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Name name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringName stringName;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Degrees degrees;

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

    private java.lang.String contribType;  // attribute

    private org.apache.axis.types.Id id;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContribCorresp corresp;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContribEqualContrib equalContrib;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContribDeceased deceased;  // attribute

    private org.apache.axis.types.IDRefs rid;  // attribute

    public Contrib() {
    }

    public Contrib(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Collab collab,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Name name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringName stringName,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Degrees degrees,
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
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x,
           java.lang.String contribType,
           org.apache.axis.types.Id id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContribCorresp corresp,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContribEqualContrib equalContrib,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContribDeceased deceased,
           org.apache.axis.types.IDRefs rid) {
           this.collab = collab;
           this.name = name;
           this.stringName = stringName;
           this.degrees = degrees;
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
           this.contribType = contribType;
           this.id = id;
           this.corresp = corresp;
           this.equalContrib = equalContrib;
           this.deceased = deceased;
           this.rid = rid;
    }


    /**
     * Gets the collab value for this Contrib.
     * 
     * @return collab
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Collab getCollab() {
        return collab;
    }


    /**
     * Sets the collab value for this Contrib.
     * 
     * @param collab
     */
    public void setCollab(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Collab collab) {
        this.collab = collab;
    }


    /**
     * Gets the name value for this Contrib.
     * 
     * @return name
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Name getName() {
        return name;
    }


    /**
     * Sets the name value for this Contrib.
     * 
     * @param name
     */
    public void setName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Name name) {
        this.name = name;
    }


    /**
     * Gets the stringName value for this Contrib.
     * 
     * @return stringName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringName getStringName() {
        return stringName;
    }


    /**
     * Sets the stringName value for this Contrib.
     * 
     * @param stringName
     */
    public void setStringName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringName stringName) {
        this.stringName = stringName;
    }


    /**
     * Gets the degrees value for this Contrib.
     * 
     * @return degrees
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Degrees getDegrees() {
        return degrees;
    }


    /**
     * Sets the degrees value for this Contrib.
     * 
     * @param degrees
     */
    public void setDegrees(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Degrees degrees) {
        this.degrees = degrees;
    }


    /**
     * Gets the address value for this Contrib.
     * 
     * @return address
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Contrib.
     * 
     * @param address
     */
    public void setAddress(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Address address) {
        this.address = address;
    }


    /**
     * Gets the aff value for this Contrib.
     * 
     * @return aff
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Aff getAff() {
        return aff;
    }


    /**
     * Sets the aff value for this Contrib.
     * 
     * @param aff
     */
    public void setAff(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Aff aff) {
        this.aff = aff;
    }


    /**
     * Gets the authorComment value for this Contrib.
     * 
     * @return authorComment
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorComment getAuthorComment() {
        return authorComment;
    }


    /**
     * Sets the authorComment value for this Contrib.
     * 
     * @param authorComment
     */
    public void setAuthorComment(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthorComment authorComment) {
        this.authorComment = authorComment;
    }


    /**
     * Gets the bio value for this Contrib.
     * 
     * @return bio
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bio getBio() {
        return bio;
    }


    /**
     * Sets the bio value for this Contrib.
     * 
     * @param bio
     */
    public void setBio(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bio bio) {
        this.bio = bio;
    }


    /**
     * Gets the email value for this Contrib.
     * 
     * @return email
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Contrib.
     * 
     * @param email
     */
    public void setEmail(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email) {
        this.email = email;
    }


    /**
     * Gets the etal value for this Contrib.
     * 
     * @return etal
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal getEtal() {
        return etal;
    }


    /**
     * Sets the etal value for this Contrib.
     * 
     * @param etal
     */
    public void setEtal(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal etal) {
        this.etal = etal;
    }


    /**
     * Gets the extLink value for this Contrib.
     * 
     * @return extLink
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink getExtLink() {
        return extLink;
    }


    /**
     * Sets the extLink value for this Contrib.
     * 
     * @param extLink
     */
    public void setExtLink(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink) {
        this.extLink = extLink;
    }


    /**
     * Gets the fn value for this Contrib.
     * 
     * @return fn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn getFn() {
        return fn;
    }


    /**
     * Sets the fn value for this Contrib.
     * 
     * @param fn
     */
    public void setFn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn) {
        this.fn = fn;
    }


    /**
     * Gets the onBehalfOf value for this Contrib.
     * 
     * @return onBehalfOf
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OnBehalfOf getOnBehalfOf() {
        return onBehalfOf;
    }


    /**
     * Sets the onBehalfOf value for this Contrib.
     * 
     * @param onBehalfOf
     */
    public void setOnBehalfOf(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OnBehalfOf onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
    }


    /**
     * Gets the role value for this Contrib.
     * 
     * @return role
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Role getRole() {
        return role;
    }


    /**
     * Sets the role value for this Contrib.
     * 
     * @param role
     */
    public void setRole(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Role role) {
        this.role = role;
    }


    /**
     * Gets the uri value for this Contrib.
     * 
     * @return uri
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this Contrib.
     * 
     * @param uri
     */
    public void setUri(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri) {
        this.uri = uri;
    }


    /**
     * Gets the xref value for this Contrib.
     * 
     * @return xref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref getXref() {
        return xref;
    }


    /**
     * Sets the xref value for this Contrib.
     * 
     * @param xref
     */
    public void setXref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref xref) {
        this.xref = xref;
    }


    /**
     * Gets the x value for this Contrib.
     * 
     * @return x
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.X getX() {
        return x;
    }


    /**
     * Sets the x value for this Contrib.
     * 
     * @param x
     */
    public void setX(gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x) {
        this.x = x;
    }


    /**
     * Gets the contribType value for this Contrib.
     * 
     * @return contribType
     */
    public java.lang.String getContribType() {
        return contribType;
    }


    /**
     * Sets the contribType value for this Contrib.
     * 
     * @param contribType
     */
    public void setContribType(java.lang.String contribType) {
        this.contribType = contribType;
    }


    /**
     * Gets the id value for this Contrib.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this Contrib.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the corresp value for this Contrib.
     * 
     * @return corresp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContribCorresp getCorresp() {
        return corresp;
    }


    /**
     * Sets the corresp value for this Contrib.
     * 
     * @param corresp
     */
    public void setCorresp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContribCorresp corresp) {
        this.corresp = corresp;
    }


    /**
     * Gets the equalContrib value for this Contrib.
     * 
     * @return equalContrib
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContribEqualContrib getEqualContrib() {
        return equalContrib;
    }


    /**
     * Sets the equalContrib value for this Contrib.
     * 
     * @param equalContrib
     */
    public void setEqualContrib(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContribEqualContrib equalContrib) {
        this.equalContrib = equalContrib;
    }


    /**
     * Gets the deceased value for this Contrib.
     * 
     * @return deceased
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContribDeceased getDeceased() {
        return deceased;
    }


    /**
     * Sets the deceased value for this Contrib.
     * 
     * @param deceased
     */
    public void setDeceased(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContribDeceased deceased) {
        this.deceased = deceased;
    }


    /**
     * Gets the rid value for this Contrib.
     * 
     * @return rid
     */
    public org.apache.axis.types.IDRefs getRid() {
        return rid;
    }


    /**
     * Sets the rid value for this Contrib.
     * 
     * @param rid
     */
    public void setRid(org.apache.axis.types.IDRefs rid) {
        this.rid = rid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contrib)) return false;
        Contrib other = (Contrib) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.collab==null && other.getCollab()==null) || 
             (this.collab!=null &&
              this.collab.equals(other.getCollab()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.stringName==null && other.getStringName()==null) || 
             (this.stringName!=null &&
              this.stringName.equals(other.getStringName()))) &&
            ((this.degrees==null && other.getDegrees()==null) || 
             (this.degrees!=null &&
              this.degrees.equals(other.getDegrees()))) &&
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
              this.x.equals(other.getX()))) &&
            ((this.contribType==null && other.getContribType()==null) || 
             (this.contribType!=null &&
              this.contribType.equals(other.getContribType()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.corresp==null && other.getCorresp()==null) || 
             (this.corresp!=null &&
              this.corresp.equals(other.getCorresp()))) &&
            ((this.equalContrib==null && other.getEqualContrib()==null) || 
             (this.equalContrib!=null &&
              this.equalContrib.equals(other.getEqualContrib()))) &&
            ((this.deceased==null && other.getDeceased()==null) || 
             (this.deceased!=null &&
              this.deceased.equals(other.getDeceased()))) &&
            ((this.rid==null && other.getRid()==null) || 
             (this.rid!=null &&
              this.rid.equals(other.getRid())));
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
        if (getCollab() != null) {
            _hashCode += getCollab().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStringName() != null) {
            _hashCode += getStringName().hashCode();
        }
        if (getDegrees() != null) {
            _hashCode += getDegrees().hashCode();
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
        if (getContribType() != null) {
            _hashCode += getContribType().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getCorresp() != null) {
            _hashCode += getCorresp().hashCode();
        }
        if (getEqualContrib() != null) {
            _hashCode += getEqualContrib().hashCode();
        }
        if (getDeceased() != null) {
            _hashCode += getDeceased().hashCode();
        }
        if (getRid() != null) {
            _hashCode += getRid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contrib.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">contrib"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("contribType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "contrib-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("corresp");
        attrField.setXmlName(new javax.xml.namespace.QName("", "corresp"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>contrib>corresp"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("equalContrib");
        attrField.setXmlName(new javax.xml.namespace.QName("", "equal-contrib"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>contrib>equal-contrib"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("deceased");
        attrField.setXmlName(new javax.xml.namespace.QName("", "deceased"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>contrib>deceased"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "rid"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "IDREFS"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "collab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">collab"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "string-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">string-name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("degrees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "degrees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">degrees"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
