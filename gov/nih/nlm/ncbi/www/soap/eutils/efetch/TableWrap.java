/**
 * TableWrap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TableWrap  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectId[] objectId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Caption caption;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltText altText;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.LongDesc longDesc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote dispQuote;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech speech;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement statement;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup verseGroup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList defList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.List list;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStruct chemStruct;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Graphic graphic;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Media media;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Preformat preformat;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Table table;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapFoot tableWrapFoot;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib attrib;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions permissions;

    private org.apache.axis.types.Id id;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapPosition position;  // attribute

    private java.lang.String contentType;  // attribute

    public TableWrap() {
    }

    public TableWrap(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectId[] objectId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Caption caption,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltText altText,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.LongDesc longDesc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote dispQuote,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech speech,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement statement,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup verseGroup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList defList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.List list,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStruct chemStruct,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Graphic graphic,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Media media,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Preformat preformat,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Table table,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapFoot tableWrapFoot,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib attrib,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions permissions,
           org.apache.axis.types.Id id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapPosition position,
           java.lang.String contentType) {
           this.objectId = objectId;
           this.label = label;
           this.caption = caption;
           this.altText = altText;
           this.longDesc = longDesc;
           this.email = email;
           this.extLink = extLink;
           this.uri = uri;
           this.dispQuote = dispQuote;
           this.speech = speech;
           this.statement = statement;
           this.verseGroup = verseGroup;
           this.defList = defList;
           this.list = list;
           this.chemStruct = chemStruct;
           this.graphic = graphic;
           this.media = media;
           this.preformat = preformat;
           this.table = table;
           this.tableWrapFoot = tableWrapFoot;
           this.attrib = attrib;
           this.copyrightStatement = copyrightStatement;
           this.permissions = permissions;
           this.id = id;
           this.position = position;
           this.contentType = contentType;
    }


    /**
     * Gets the objectId value for this TableWrap.
     * 
     * @return objectId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectId[] getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this TableWrap.
     * 
     * @param objectId
     */
    public void setObjectId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectId[] objectId) {
        this.objectId = objectId;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectId getObjectId(int i) {
        return this.objectId[i];
    }

    public void setObjectId(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectId _value) {
        this.objectId[i] = _value;
    }


    /**
     * Gets the label value for this TableWrap.
     * 
     * @return label
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label getLabel() {
        return label;
    }


    /**
     * Sets the label value for this TableWrap.
     * 
     * @param label
     */
    public void setLabel(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label) {
        this.label = label;
    }


    /**
     * Gets the caption value for this TableWrap.
     * 
     * @return caption
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Caption getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this TableWrap.
     * 
     * @param caption
     */
    public void setCaption(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Caption caption) {
        this.caption = caption;
    }


    /**
     * Gets the altText value for this TableWrap.
     * 
     * @return altText
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltText getAltText() {
        return altText;
    }


    /**
     * Sets the altText value for this TableWrap.
     * 
     * @param altText
     */
    public void setAltText(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltText altText) {
        this.altText = altText;
    }


    /**
     * Gets the longDesc value for this TableWrap.
     * 
     * @return longDesc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.LongDesc getLongDesc() {
        return longDesc;
    }


    /**
     * Sets the longDesc value for this TableWrap.
     * 
     * @param longDesc
     */
    public void setLongDesc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.LongDesc longDesc) {
        this.longDesc = longDesc;
    }


    /**
     * Gets the email value for this TableWrap.
     * 
     * @return email
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email getEmail() {
        return email;
    }


    /**
     * Sets the email value for this TableWrap.
     * 
     * @param email
     */
    public void setEmail(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email) {
        this.email = email;
    }


    /**
     * Gets the extLink value for this TableWrap.
     * 
     * @return extLink
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink getExtLink() {
        return extLink;
    }


    /**
     * Sets the extLink value for this TableWrap.
     * 
     * @param extLink
     */
    public void setExtLink(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink) {
        this.extLink = extLink;
    }


    /**
     * Gets the uri value for this TableWrap.
     * 
     * @return uri
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this TableWrap.
     * 
     * @param uri
     */
    public void setUri(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri) {
        this.uri = uri;
    }


    /**
     * Gets the dispQuote value for this TableWrap.
     * 
     * @return dispQuote
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote getDispQuote() {
        return dispQuote;
    }


    /**
     * Sets the dispQuote value for this TableWrap.
     * 
     * @param dispQuote
     */
    public void setDispQuote(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote dispQuote) {
        this.dispQuote = dispQuote;
    }


    /**
     * Gets the speech value for this TableWrap.
     * 
     * @return speech
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech getSpeech() {
        return speech;
    }


    /**
     * Sets the speech value for this TableWrap.
     * 
     * @param speech
     */
    public void setSpeech(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech speech) {
        this.speech = speech;
    }


    /**
     * Gets the statement value for this TableWrap.
     * 
     * @return statement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement getStatement() {
        return statement;
    }


    /**
     * Sets the statement value for this TableWrap.
     * 
     * @param statement
     */
    public void setStatement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement statement) {
        this.statement = statement;
    }


    /**
     * Gets the verseGroup value for this TableWrap.
     * 
     * @return verseGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup getVerseGroup() {
        return verseGroup;
    }


    /**
     * Sets the verseGroup value for this TableWrap.
     * 
     * @param verseGroup
     */
    public void setVerseGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup verseGroup) {
        this.verseGroup = verseGroup;
    }


    /**
     * Gets the defList value for this TableWrap.
     * 
     * @return defList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList getDefList() {
        return defList;
    }


    /**
     * Sets the defList value for this TableWrap.
     * 
     * @param defList
     */
    public void setDefList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList defList) {
        this.defList = defList;
    }


    /**
     * Gets the list value for this TableWrap.
     * 
     * @return list
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.List getList() {
        return list;
    }


    /**
     * Sets the list value for this TableWrap.
     * 
     * @param list
     */
    public void setList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.List list) {
        this.list = list;
    }


    /**
     * Gets the chemStruct value for this TableWrap.
     * 
     * @return chemStruct
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStruct getChemStruct() {
        return chemStruct;
    }


    /**
     * Sets the chemStruct value for this TableWrap.
     * 
     * @param chemStruct
     */
    public void setChemStruct(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStruct chemStruct) {
        this.chemStruct = chemStruct;
    }


    /**
     * Gets the graphic value for this TableWrap.
     * 
     * @return graphic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Graphic getGraphic() {
        return graphic;
    }


    /**
     * Sets the graphic value for this TableWrap.
     * 
     * @param graphic
     */
    public void setGraphic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Graphic graphic) {
        this.graphic = graphic;
    }


    /**
     * Gets the media value for this TableWrap.
     * 
     * @return media
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Media getMedia() {
        return media;
    }


    /**
     * Sets the media value for this TableWrap.
     * 
     * @param media
     */
    public void setMedia(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Media media) {
        this.media = media;
    }


    /**
     * Gets the preformat value for this TableWrap.
     * 
     * @return preformat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Preformat getPreformat() {
        return preformat;
    }


    /**
     * Sets the preformat value for this TableWrap.
     * 
     * @param preformat
     */
    public void setPreformat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Preformat preformat) {
        this.preformat = preformat;
    }


    /**
     * Gets the table value for this TableWrap.
     * 
     * @return table
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Table getTable() {
        return table;
    }


    /**
     * Sets the table value for this TableWrap.
     * 
     * @param table
     */
    public void setTable(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Table table) {
        this.table = table;
    }


    /**
     * Gets the tableWrapFoot value for this TableWrap.
     * 
     * @return tableWrapFoot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapFoot getTableWrapFoot() {
        return tableWrapFoot;
    }


    /**
     * Sets the tableWrapFoot value for this TableWrap.
     * 
     * @param tableWrapFoot
     */
    public void setTableWrapFoot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapFoot tableWrapFoot) {
        this.tableWrapFoot = tableWrapFoot;
    }


    /**
     * Gets the attrib value for this TableWrap.
     * 
     * @return attrib
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib getAttrib() {
        return attrib;
    }


    /**
     * Sets the attrib value for this TableWrap.
     * 
     * @param attrib
     */
    public void setAttrib(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib attrib) {
        this.attrib = attrib;
    }


    /**
     * Gets the copyrightStatement value for this TableWrap.
     * 
     * @return copyrightStatement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement getCopyrightStatement() {
        return copyrightStatement;
    }


    /**
     * Sets the copyrightStatement value for this TableWrap.
     * 
     * @param copyrightStatement
     */
    public void setCopyrightStatement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement) {
        this.copyrightStatement = copyrightStatement;
    }


    /**
     * Gets the permissions value for this TableWrap.
     * 
     * @return permissions
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this TableWrap.
     * 
     * @param permissions
     */
    public void setPermissions(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets the id value for this TableWrap.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this TableWrap.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the position value for this TableWrap.
     * 
     * @return position
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapPosition getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TableWrap.
     * 
     * @param position
     */
    public void setPosition(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapPosition position) {
        this.position = position;
    }


    /**
     * Gets the contentType value for this TableWrap.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this TableWrap.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TableWrap)) return false;
        TableWrap other = (TableWrap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              java.util.Arrays.equals(this.objectId, other.getObjectId()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.caption==null && other.getCaption()==null) || 
             (this.caption!=null &&
              this.caption.equals(other.getCaption()))) &&
            ((this.altText==null && other.getAltText()==null) || 
             (this.altText!=null &&
              this.altText.equals(other.getAltText()))) &&
            ((this.longDesc==null && other.getLongDesc()==null) || 
             (this.longDesc!=null &&
              this.longDesc.equals(other.getLongDesc()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.extLink==null && other.getExtLink()==null) || 
             (this.extLink!=null &&
              this.extLink.equals(other.getExtLink()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri()))) &&
            ((this.dispQuote==null && other.getDispQuote()==null) || 
             (this.dispQuote!=null &&
              this.dispQuote.equals(other.getDispQuote()))) &&
            ((this.speech==null && other.getSpeech()==null) || 
             (this.speech!=null &&
              this.speech.equals(other.getSpeech()))) &&
            ((this.statement==null && other.getStatement()==null) || 
             (this.statement!=null &&
              this.statement.equals(other.getStatement()))) &&
            ((this.verseGroup==null && other.getVerseGroup()==null) || 
             (this.verseGroup!=null &&
              this.verseGroup.equals(other.getVerseGroup()))) &&
            ((this.defList==null && other.getDefList()==null) || 
             (this.defList!=null &&
              this.defList.equals(other.getDefList()))) &&
            ((this.list==null && other.getList()==null) || 
             (this.list!=null &&
              this.list.equals(other.getList()))) &&
            ((this.chemStruct==null && other.getChemStruct()==null) || 
             (this.chemStruct!=null &&
              this.chemStruct.equals(other.getChemStruct()))) &&
            ((this.graphic==null && other.getGraphic()==null) || 
             (this.graphic!=null &&
              this.graphic.equals(other.getGraphic()))) &&
            ((this.media==null && other.getMedia()==null) || 
             (this.media!=null &&
              this.media.equals(other.getMedia()))) &&
            ((this.preformat==null && other.getPreformat()==null) || 
             (this.preformat!=null &&
              this.preformat.equals(other.getPreformat()))) &&
            ((this.table==null && other.getTable()==null) || 
             (this.table!=null &&
              this.table.equals(other.getTable()))) &&
            ((this.tableWrapFoot==null && other.getTableWrapFoot()==null) || 
             (this.tableWrapFoot!=null &&
              this.tableWrapFoot.equals(other.getTableWrapFoot()))) &&
            ((this.attrib==null && other.getAttrib()==null) || 
             (this.attrib!=null &&
              this.attrib.equals(other.getAttrib()))) &&
            ((this.copyrightStatement==null && other.getCopyrightStatement()==null) || 
             (this.copyrightStatement!=null &&
              this.copyrightStatement.equals(other.getCopyrightStatement()))) &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              this.permissions.equals(other.getPermissions()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType())));
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
        if (getObjectId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjectId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjectId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getCaption() != null) {
            _hashCode += getCaption().hashCode();
        }
        if (getAltText() != null) {
            _hashCode += getAltText().hashCode();
        }
        if (getLongDesc() != null) {
            _hashCode += getLongDesc().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getExtLink() != null) {
            _hashCode += getExtLink().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        if (getDispQuote() != null) {
            _hashCode += getDispQuote().hashCode();
        }
        if (getSpeech() != null) {
            _hashCode += getSpeech().hashCode();
        }
        if (getStatement() != null) {
            _hashCode += getStatement().hashCode();
        }
        if (getVerseGroup() != null) {
            _hashCode += getVerseGroup().hashCode();
        }
        if (getDefList() != null) {
            _hashCode += getDefList().hashCode();
        }
        if (getList() != null) {
            _hashCode += getList().hashCode();
        }
        if (getChemStruct() != null) {
            _hashCode += getChemStruct().hashCode();
        }
        if (getGraphic() != null) {
            _hashCode += getGraphic().hashCode();
        }
        if (getMedia() != null) {
            _hashCode += getMedia().hashCode();
        }
        if (getPreformat() != null) {
            _hashCode += getPreformat().hashCode();
        }
        if (getTable() != null) {
            _hashCode += getTable().hashCode();
        }
        if (getTableWrapFoot() != null) {
            _hashCode += getTableWrapFoot().hashCode();
        }
        if (getAttrib() != null) {
            _hashCode += getAttrib().hashCode();
        }
        if (getCopyrightStatement() != null) {
            _hashCode += getCopyrightStatement().hashCode();
        }
        if (getPermissions() != null) {
            _hashCode += getPermissions().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TableWrap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">table-wrap"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("position");
        attrField.setXmlName(new javax.xml.namespace.QName("", "position"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>table-wrap>position"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("contentType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "content-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "object-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "object-id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">label"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">caption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "alt-text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">alt-text"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "long-desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">long-desc"));
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
        elemField.setFieldName("extLink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ext-link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ext-link"));
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
        elemField.setFieldName("dispQuote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "disp-quote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">disp-quote"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speech");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "speech"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">speech"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "statement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">statement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verseGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "verse-group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">verse-group"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("chemStruct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "chem-struct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">chem-struct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "graphic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">graphic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("media");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "media"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">media"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preformat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "preformat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">preformat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("table");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "table"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">table"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableWrapFoot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "table-wrap-foot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">table-wrap-foot"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "attrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">attrib"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyrightStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "copyright-statement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">copyright-statement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">permissions"));
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
