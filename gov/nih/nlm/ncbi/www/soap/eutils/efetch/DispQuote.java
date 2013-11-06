/**
 * DispQuote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DispQuote  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Array array;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BoxedText boxedText;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStruct chemStruct;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStructWrapper chemStructWrapper;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fig fig;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FigGroup figGroup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Graphic graphic;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Media media;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Preformat preformat;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SupplementaryMaterial supplementaryMaterial;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap tableWrap;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapGroup tableWrapGroup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispFormula dispFormula;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.P p;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList defList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.List list;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath texMath;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle relatedArticle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack ack;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote dispQuote;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech speech;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement statement;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup verseGroup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib attrib;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions permissions;

    private org.apache.axis.types.Id id;  // attribute

    public DispQuote() {
    }

    public DispQuote(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Array array,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BoxedText boxedText,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStruct chemStruct,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStructWrapper chemStructWrapper,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fig fig,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FigGroup figGroup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Graphic graphic,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Media media,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Preformat preformat,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SupplementaryMaterial supplementaryMaterial,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap tableWrap,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapGroup tableWrapGroup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispFormula dispFormula,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.P p,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList defList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.List list,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath texMath,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle relatedArticle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack ack,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote dispQuote,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech speech,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement statement,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup verseGroup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib attrib,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions permissions,
           org.apache.axis.types.Id id) {
           this.title = title;
           this.array = array;
           this.boxedText = boxedText;
           this.chemStruct = chemStruct;
           this.chemStructWrapper = chemStructWrapper;
           this.fig = fig;
           this.figGroup = figGroup;
           this.graphic = graphic;
           this.media = media;
           this.preformat = preformat;
           this.supplementaryMaterial = supplementaryMaterial;
           this.tableWrap = tableWrap;
           this.tableWrapGroup = tableWrapGroup;
           this.dispFormula = dispFormula;
           this.p = p;
           this.defList = defList;
           this.list = list;
           this.texMath = texMath;
           this.relatedArticle = relatedArticle;
           this.ack = ack;
           this.dispQuote = dispQuote;
           this.speech = speech;
           this.statement = statement;
           this.verseGroup = verseGroup;
           this.attrib = attrib;
           this.copyrightStatement = copyrightStatement;
           this.permissions = permissions;
           this.id = id;
    }


    /**
     * Gets the title value for this DispQuote.
     * 
     * @return title
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title getTitle() {
        return title;
    }


    /**
     * Sets the title value for this DispQuote.
     * 
     * @param title
     */
    public void setTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title) {
        this.title = title;
    }


    /**
     * Gets the array value for this DispQuote.
     * 
     * @return array
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Array getArray() {
        return array;
    }


    /**
     * Sets the array value for this DispQuote.
     * 
     * @param array
     */
    public void setArray(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Array array) {
        this.array = array;
    }


    /**
     * Gets the boxedText value for this DispQuote.
     * 
     * @return boxedText
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BoxedText getBoxedText() {
        return boxedText;
    }


    /**
     * Sets the boxedText value for this DispQuote.
     * 
     * @param boxedText
     */
    public void setBoxedText(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BoxedText boxedText) {
        this.boxedText = boxedText;
    }


    /**
     * Gets the chemStruct value for this DispQuote.
     * 
     * @return chemStruct
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStruct getChemStruct() {
        return chemStruct;
    }


    /**
     * Sets the chemStruct value for this DispQuote.
     * 
     * @param chemStruct
     */
    public void setChemStruct(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStruct chemStruct) {
        this.chemStruct = chemStruct;
    }


    /**
     * Gets the chemStructWrapper value for this DispQuote.
     * 
     * @return chemStructWrapper
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStructWrapper getChemStructWrapper() {
        return chemStructWrapper;
    }


    /**
     * Sets the chemStructWrapper value for this DispQuote.
     * 
     * @param chemStructWrapper
     */
    public void setChemStructWrapper(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStructWrapper chemStructWrapper) {
        this.chemStructWrapper = chemStructWrapper;
    }


    /**
     * Gets the fig value for this DispQuote.
     * 
     * @return fig
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fig getFig() {
        return fig;
    }


    /**
     * Sets the fig value for this DispQuote.
     * 
     * @param fig
     */
    public void setFig(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fig fig) {
        this.fig = fig;
    }


    /**
     * Gets the figGroup value for this DispQuote.
     * 
     * @return figGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FigGroup getFigGroup() {
        return figGroup;
    }


    /**
     * Sets the figGroup value for this DispQuote.
     * 
     * @param figGroup
     */
    public void setFigGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FigGroup figGroup) {
        this.figGroup = figGroup;
    }


    /**
     * Gets the graphic value for this DispQuote.
     * 
     * @return graphic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Graphic getGraphic() {
        return graphic;
    }


    /**
     * Sets the graphic value for this DispQuote.
     * 
     * @param graphic
     */
    public void setGraphic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Graphic graphic) {
        this.graphic = graphic;
    }


    /**
     * Gets the media value for this DispQuote.
     * 
     * @return media
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Media getMedia() {
        return media;
    }


    /**
     * Sets the media value for this DispQuote.
     * 
     * @param media
     */
    public void setMedia(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Media media) {
        this.media = media;
    }


    /**
     * Gets the preformat value for this DispQuote.
     * 
     * @return preformat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Preformat getPreformat() {
        return preformat;
    }


    /**
     * Sets the preformat value for this DispQuote.
     * 
     * @param preformat
     */
    public void setPreformat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Preformat preformat) {
        this.preformat = preformat;
    }


    /**
     * Gets the supplementaryMaterial value for this DispQuote.
     * 
     * @return supplementaryMaterial
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SupplementaryMaterial getSupplementaryMaterial() {
        return supplementaryMaterial;
    }


    /**
     * Sets the supplementaryMaterial value for this DispQuote.
     * 
     * @param supplementaryMaterial
     */
    public void setSupplementaryMaterial(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SupplementaryMaterial supplementaryMaterial) {
        this.supplementaryMaterial = supplementaryMaterial;
    }


    /**
     * Gets the tableWrap value for this DispQuote.
     * 
     * @return tableWrap
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap getTableWrap() {
        return tableWrap;
    }


    /**
     * Sets the tableWrap value for this DispQuote.
     * 
     * @param tableWrap
     */
    public void setTableWrap(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap tableWrap) {
        this.tableWrap = tableWrap;
    }


    /**
     * Gets the tableWrapGroup value for this DispQuote.
     * 
     * @return tableWrapGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapGroup getTableWrapGroup() {
        return tableWrapGroup;
    }


    /**
     * Sets the tableWrapGroup value for this DispQuote.
     * 
     * @param tableWrapGroup
     */
    public void setTableWrapGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapGroup tableWrapGroup) {
        this.tableWrapGroup = tableWrapGroup;
    }


    /**
     * Gets the dispFormula value for this DispQuote.
     * 
     * @return dispFormula
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispFormula getDispFormula() {
        return dispFormula;
    }


    /**
     * Sets the dispFormula value for this DispQuote.
     * 
     * @param dispFormula
     */
    public void setDispFormula(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispFormula dispFormula) {
        this.dispFormula = dispFormula;
    }


    /**
     * Gets the p value for this DispQuote.
     * 
     * @return p
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.P getP() {
        return p;
    }


    /**
     * Sets the p value for this DispQuote.
     * 
     * @param p
     */
    public void setP(gov.nih.nlm.ncbi.www.soap.eutils.efetch.P p) {
        this.p = p;
    }


    /**
     * Gets the defList value for this DispQuote.
     * 
     * @return defList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList getDefList() {
        return defList;
    }


    /**
     * Sets the defList value for this DispQuote.
     * 
     * @param defList
     */
    public void setDefList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList defList) {
        this.defList = defList;
    }


    /**
     * Gets the list value for this DispQuote.
     * 
     * @return list
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.List getList() {
        return list;
    }


    /**
     * Sets the list value for this DispQuote.
     * 
     * @param list
     */
    public void setList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.List list) {
        this.list = list;
    }


    /**
     * Gets the texMath value for this DispQuote.
     * 
     * @return texMath
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath getTexMath() {
        return texMath;
    }


    /**
     * Sets the texMath value for this DispQuote.
     * 
     * @param texMath
     */
    public void setTexMath(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath texMath) {
        this.texMath = texMath;
    }


    /**
     * Gets the relatedArticle value for this DispQuote.
     * 
     * @return relatedArticle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle getRelatedArticle() {
        return relatedArticle;
    }


    /**
     * Sets the relatedArticle value for this DispQuote.
     * 
     * @param relatedArticle
     */
    public void setRelatedArticle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle relatedArticle) {
        this.relatedArticle = relatedArticle;
    }


    /**
     * Gets the ack value for this DispQuote.
     * 
     * @return ack
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack getAck() {
        return ack;
    }


    /**
     * Sets the ack value for this DispQuote.
     * 
     * @param ack
     */
    public void setAck(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack ack) {
        this.ack = ack;
    }


    /**
     * Gets the dispQuote value for this DispQuote.
     * 
     * @return dispQuote
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote getDispQuote() {
        return dispQuote;
    }


    /**
     * Sets the dispQuote value for this DispQuote.
     * 
     * @param dispQuote
     */
    public void setDispQuote(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote dispQuote) {
        this.dispQuote = dispQuote;
    }


    /**
     * Gets the speech value for this DispQuote.
     * 
     * @return speech
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech getSpeech() {
        return speech;
    }


    /**
     * Sets the speech value for this DispQuote.
     * 
     * @param speech
     */
    public void setSpeech(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech speech) {
        this.speech = speech;
    }


    /**
     * Gets the statement value for this DispQuote.
     * 
     * @return statement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement getStatement() {
        return statement;
    }


    /**
     * Sets the statement value for this DispQuote.
     * 
     * @param statement
     */
    public void setStatement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement statement) {
        this.statement = statement;
    }


    /**
     * Gets the verseGroup value for this DispQuote.
     * 
     * @return verseGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup getVerseGroup() {
        return verseGroup;
    }


    /**
     * Sets the verseGroup value for this DispQuote.
     * 
     * @param verseGroup
     */
    public void setVerseGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup verseGroup) {
        this.verseGroup = verseGroup;
    }


    /**
     * Gets the attrib value for this DispQuote.
     * 
     * @return attrib
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib getAttrib() {
        return attrib;
    }


    /**
     * Sets the attrib value for this DispQuote.
     * 
     * @param attrib
     */
    public void setAttrib(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Attrib attrib) {
        this.attrib = attrib;
    }


    /**
     * Gets the copyrightStatement value for this DispQuote.
     * 
     * @return copyrightStatement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement getCopyrightStatement() {
        return copyrightStatement;
    }


    /**
     * Sets the copyrightStatement value for this DispQuote.
     * 
     * @param copyrightStatement
     */
    public void setCopyrightStatement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement) {
        this.copyrightStatement = copyrightStatement;
    }


    /**
     * Gets the permissions value for this DispQuote.
     * 
     * @return permissions
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this DispQuote.
     * 
     * @param permissions
     */
    public void setPermissions(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Permissions permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets the id value for this DispQuote.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this DispQuote.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DispQuote)) return false;
        DispQuote other = (DispQuote) obj;
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
              this.title.equals(other.getTitle()))) &&
            ((this.array==null && other.getArray()==null) || 
             (this.array!=null &&
              this.array.equals(other.getArray()))) &&
            ((this.boxedText==null && other.getBoxedText()==null) || 
             (this.boxedText!=null &&
              this.boxedText.equals(other.getBoxedText()))) &&
            ((this.chemStruct==null && other.getChemStruct()==null) || 
             (this.chemStruct!=null &&
              this.chemStruct.equals(other.getChemStruct()))) &&
            ((this.chemStructWrapper==null && other.getChemStructWrapper()==null) || 
             (this.chemStructWrapper!=null &&
              this.chemStructWrapper.equals(other.getChemStructWrapper()))) &&
            ((this.fig==null && other.getFig()==null) || 
             (this.fig!=null &&
              this.fig.equals(other.getFig()))) &&
            ((this.figGroup==null && other.getFigGroup()==null) || 
             (this.figGroup!=null &&
              this.figGroup.equals(other.getFigGroup()))) &&
            ((this.graphic==null && other.getGraphic()==null) || 
             (this.graphic!=null &&
              this.graphic.equals(other.getGraphic()))) &&
            ((this.media==null && other.getMedia()==null) || 
             (this.media!=null &&
              this.media.equals(other.getMedia()))) &&
            ((this.preformat==null && other.getPreformat()==null) || 
             (this.preformat!=null &&
              this.preformat.equals(other.getPreformat()))) &&
            ((this.supplementaryMaterial==null && other.getSupplementaryMaterial()==null) || 
             (this.supplementaryMaterial!=null &&
              this.supplementaryMaterial.equals(other.getSupplementaryMaterial()))) &&
            ((this.tableWrap==null && other.getTableWrap()==null) || 
             (this.tableWrap!=null &&
              this.tableWrap.equals(other.getTableWrap()))) &&
            ((this.tableWrapGroup==null && other.getTableWrapGroup()==null) || 
             (this.tableWrapGroup!=null &&
              this.tableWrapGroup.equals(other.getTableWrapGroup()))) &&
            ((this.dispFormula==null && other.getDispFormula()==null) || 
             (this.dispFormula!=null &&
              this.dispFormula.equals(other.getDispFormula()))) &&
            ((this.p==null && other.getP()==null) || 
             (this.p!=null &&
              this.p.equals(other.getP()))) &&
            ((this.defList==null && other.getDefList()==null) || 
             (this.defList!=null &&
              this.defList.equals(other.getDefList()))) &&
            ((this.list==null && other.getList()==null) || 
             (this.list!=null &&
              this.list.equals(other.getList()))) &&
            ((this.texMath==null && other.getTexMath()==null) || 
             (this.texMath!=null &&
              this.texMath.equals(other.getTexMath()))) &&
            ((this.relatedArticle==null && other.getRelatedArticle()==null) || 
             (this.relatedArticle!=null &&
              this.relatedArticle.equals(other.getRelatedArticle()))) &&
            ((this.ack==null && other.getAck()==null) || 
             (this.ack!=null &&
              this.ack.equals(other.getAck()))) &&
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
              this.id.equals(other.getId())));
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
            _hashCode += getTitle().hashCode();
        }
        if (getArray() != null) {
            _hashCode += getArray().hashCode();
        }
        if (getBoxedText() != null) {
            _hashCode += getBoxedText().hashCode();
        }
        if (getChemStruct() != null) {
            _hashCode += getChemStruct().hashCode();
        }
        if (getChemStructWrapper() != null) {
            _hashCode += getChemStructWrapper().hashCode();
        }
        if (getFig() != null) {
            _hashCode += getFig().hashCode();
        }
        if (getFigGroup() != null) {
            _hashCode += getFigGroup().hashCode();
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
        if (getSupplementaryMaterial() != null) {
            _hashCode += getSupplementaryMaterial().hashCode();
        }
        if (getTableWrap() != null) {
            _hashCode += getTableWrap().hashCode();
        }
        if (getTableWrapGroup() != null) {
            _hashCode += getTableWrapGroup().hashCode();
        }
        if (getDispFormula() != null) {
            _hashCode += getDispFormula().hashCode();
        }
        if (getP() != null) {
            _hashCode += getP().hashCode();
        }
        if (getDefList() != null) {
            _hashCode += getDefList().hashCode();
        }
        if (getList() != null) {
            _hashCode += getList().hashCode();
        }
        if (getTexMath() != null) {
            _hashCode += getTexMath().hashCode();
        }
        if (getRelatedArticle() != null) {
            _hashCode += getRelatedArticle().hashCode();
        }
        if (getAck() != null) {
            _hashCode += getAck().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DispQuote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">disp-quote"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("array");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "array"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">array"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boxedText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "boxed-text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">boxed-text"));
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
        elemField.setFieldName("chemStructWrapper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "chem-struct-wrapper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">chem-struct-wrapper"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "fig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">fig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("figGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "fig-group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">fig-group"));
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
        elemField.setFieldName("supplementaryMaterial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "supplementary-material"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">supplementary-material"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableWrap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "table-wrap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">table-wrap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableWrapGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "table-wrap-group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">table-wrap-group"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispFormula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "disp-formula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">disp-formula"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "p"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">p"));
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
        elemField.setFieldName("texMath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "tex-math"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">tex-math"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedArticle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "related-article"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">related-article"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ack");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ack"));
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
