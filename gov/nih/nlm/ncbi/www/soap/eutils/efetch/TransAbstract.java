/**
 * TransAbstract.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TransAbstract  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label;

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

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sec[] sec;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes notes;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FnGroup fnGroup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Glossary glossary;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RefList refList;

    private java.lang.String abstractType;  // attribute

    public TransAbstract() {
    }

    public TransAbstract(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label,
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
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sec[] sec,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes notes,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FnGroup fnGroup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Glossary glossary,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RefList refList,
           java.lang.String abstractType) {
           this.label = label;
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
           this.sec = sec;
           this.notes = notes;
           this.fnGroup = fnGroup;
           this.glossary = glossary;
           this.refList = refList;
           this.abstractType = abstractType;
    }


    /**
     * Gets the label value for this TransAbstract.
     * 
     * @return label
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label getLabel() {
        return label;
    }


    /**
     * Sets the label value for this TransAbstract.
     * 
     * @param label
     */
    public void setLabel(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label) {
        this.label = label;
    }


    /**
     * Gets the title value for this TransAbstract.
     * 
     * @return title
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title getTitle() {
        return title;
    }


    /**
     * Sets the title value for this TransAbstract.
     * 
     * @param title
     */
    public void setTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title) {
        this.title = title;
    }


    /**
     * Gets the array value for this TransAbstract.
     * 
     * @return array
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Array getArray() {
        return array;
    }


    /**
     * Sets the array value for this TransAbstract.
     * 
     * @param array
     */
    public void setArray(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Array array) {
        this.array = array;
    }


    /**
     * Gets the boxedText value for this TransAbstract.
     * 
     * @return boxedText
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BoxedText getBoxedText() {
        return boxedText;
    }


    /**
     * Sets the boxedText value for this TransAbstract.
     * 
     * @param boxedText
     */
    public void setBoxedText(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BoxedText boxedText) {
        this.boxedText = boxedText;
    }


    /**
     * Gets the chemStruct value for this TransAbstract.
     * 
     * @return chemStruct
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStruct getChemStruct() {
        return chemStruct;
    }


    /**
     * Sets the chemStruct value for this TransAbstract.
     * 
     * @param chemStruct
     */
    public void setChemStruct(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStruct chemStruct) {
        this.chemStruct = chemStruct;
    }


    /**
     * Gets the chemStructWrapper value for this TransAbstract.
     * 
     * @return chemStructWrapper
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStructWrapper getChemStructWrapper() {
        return chemStructWrapper;
    }


    /**
     * Sets the chemStructWrapper value for this TransAbstract.
     * 
     * @param chemStructWrapper
     */
    public void setChemStructWrapper(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStructWrapper chemStructWrapper) {
        this.chemStructWrapper = chemStructWrapper;
    }


    /**
     * Gets the fig value for this TransAbstract.
     * 
     * @return fig
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fig getFig() {
        return fig;
    }


    /**
     * Sets the fig value for this TransAbstract.
     * 
     * @param fig
     */
    public void setFig(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fig fig) {
        this.fig = fig;
    }


    /**
     * Gets the figGroup value for this TransAbstract.
     * 
     * @return figGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FigGroup getFigGroup() {
        return figGroup;
    }


    /**
     * Sets the figGroup value for this TransAbstract.
     * 
     * @param figGroup
     */
    public void setFigGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FigGroup figGroup) {
        this.figGroup = figGroup;
    }


    /**
     * Gets the graphic value for this TransAbstract.
     * 
     * @return graphic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Graphic getGraphic() {
        return graphic;
    }


    /**
     * Sets the graphic value for this TransAbstract.
     * 
     * @param graphic
     */
    public void setGraphic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Graphic graphic) {
        this.graphic = graphic;
    }


    /**
     * Gets the media value for this TransAbstract.
     * 
     * @return media
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Media getMedia() {
        return media;
    }


    /**
     * Sets the media value for this TransAbstract.
     * 
     * @param media
     */
    public void setMedia(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Media media) {
        this.media = media;
    }


    /**
     * Gets the preformat value for this TransAbstract.
     * 
     * @return preformat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Preformat getPreformat() {
        return preformat;
    }


    /**
     * Sets the preformat value for this TransAbstract.
     * 
     * @param preformat
     */
    public void setPreformat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Preformat preformat) {
        this.preformat = preformat;
    }


    /**
     * Gets the supplementaryMaterial value for this TransAbstract.
     * 
     * @return supplementaryMaterial
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SupplementaryMaterial getSupplementaryMaterial() {
        return supplementaryMaterial;
    }


    /**
     * Sets the supplementaryMaterial value for this TransAbstract.
     * 
     * @param supplementaryMaterial
     */
    public void setSupplementaryMaterial(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SupplementaryMaterial supplementaryMaterial) {
        this.supplementaryMaterial = supplementaryMaterial;
    }


    /**
     * Gets the tableWrap value for this TransAbstract.
     * 
     * @return tableWrap
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap getTableWrap() {
        return tableWrap;
    }


    /**
     * Sets the tableWrap value for this TransAbstract.
     * 
     * @param tableWrap
     */
    public void setTableWrap(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap tableWrap) {
        this.tableWrap = tableWrap;
    }


    /**
     * Gets the tableWrapGroup value for this TransAbstract.
     * 
     * @return tableWrapGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapGroup getTableWrapGroup() {
        return tableWrapGroup;
    }


    /**
     * Sets the tableWrapGroup value for this TransAbstract.
     * 
     * @param tableWrapGroup
     */
    public void setTableWrapGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapGroup tableWrapGroup) {
        this.tableWrapGroup = tableWrapGroup;
    }


    /**
     * Gets the dispFormula value for this TransAbstract.
     * 
     * @return dispFormula
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispFormula getDispFormula() {
        return dispFormula;
    }


    /**
     * Sets the dispFormula value for this TransAbstract.
     * 
     * @param dispFormula
     */
    public void setDispFormula(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispFormula dispFormula) {
        this.dispFormula = dispFormula;
    }


    /**
     * Gets the p value for this TransAbstract.
     * 
     * @return p
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.P getP() {
        return p;
    }


    /**
     * Sets the p value for this TransAbstract.
     * 
     * @param p
     */
    public void setP(gov.nih.nlm.ncbi.www.soap.eutils.efetch.P p) {
        this.p = p;
    }


    /**
     * Gets the defList value for this TransAbstract.
     * 
     * @return defList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList getDefList() {
        return defList;
    }


    /**
     * Sets the defList value for this TransAbstract.
     * 
     * @param defList
     */
    public void setDefList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList defList) {
        this.defList = defList;
    }


    /**
     * Gets the list value for this TransAbstract.
     * 
     * @return list
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.List getList() {
        return list;
    }


    /**
     * Sets the list value for this TransAbstract.
     * 
     * @param list
     */
    public void setList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.List list) {
        this.list = list;
    }


    /**
     * Gets the texMath value for this TransAbstract.
     * 
     * @return texMath
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath getTexMath() {
        return texMath;
    }


    /**
     * Sets the texMath value for this TransAbstract.
     * 
     * @param texMath
     */
    public void setTexMath(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath texMath) {
        this.texMath = texMath;
    }


    /**
     * Gets the relatedArticle value for this TransAbstract.
     * 
     * @return relatedArticle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle getRelatedArticle() {
        return relatedArticle;
    }


    /**
     * Sets the relatedArticle value for this TransAbstract.
     * 
     * @param relatedArticle
     */
    public void setRelatedArticle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle relatedArticle) {
        this.relatedArticle = relatedArticle;
    }


    /**
     * Gets the ack value for this TransAbstract.
     * 
     * @return ack
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack getAck() {
        return ack;
    }


    /**
     * Sets the ack value for this TransAbstract.
     * 
     * @param ack
     */
    public void setAck(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack ack) {
        this.ack = ack;
    }


    /**
     * Gets the dispQuote value for this TransAbstract.
     * 
     * @return dispQuote
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote getDispQuote() {
        return dispQuote;
    }


    /**
     * Sets the dispQuote value for this TransAbstract.
     * 
     * @param dispQuote
     */
    public void setDispQuote(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote dispQuote) {
        this.dispQuote = dispQuote;
    }


    /**
     * Gets the speech value for this TransAbstract.
     * 
     * @return speech
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech getSpeech() {
        return speech;
    }


    /**
     * Sets the speech value for this TransAbstract.
     * 
     * @param speech
     */
    public void setSpeech(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech speech) {
        this.speech = speech;
    }


    /**
     * Gets the statement value for this TransAbstract.
     * 
     * @return statement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement getStatement() {
        return statement;
    }


    /**
     * Sets the statement value for this TransAbstract.
     * 
     * @param statement
     */
    public void setStatement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement statement) {
        this.statement = statement;
    }


    /**
     * Gets the verseGroup value for this TransAbstract.
     * 
     * @return verseGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup getVerseGroup() {
        return verseGroup;
    }


    /**
     * Sets the verseGroup value for this TransAbstract.
     * 
     * @param verseGroup
     */
    public void setVerseGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup verseGroup) {
        this.verseGroup = verseGroup;
    }


    /**
     * Gets the sec value for this TransAbstract.
     * 
     * @return sec
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sec[] getSec() {
        return sec;
    }


    /**
     * Sets the sec value for this TransAbstract.
     * 
     * @param sec
     */
    public void setSec(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sec[] sec) {
        this.sec = sec;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sec getSec(int i) {
        return this.sec[i];
    }

    public void setSec(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sec _value) {
        this.sec[i] = _value;
    }


    /**
     * Gets the notes value for this TransAbstract.
     * 
     * @return notes
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this TransAbstract.
     * 
     * @param notes
     */
    public void setNotes(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Notes notes) {
        this.notes = notes;
    }


    /**
     * Gets the fnGroup value for this TransAbstract.
     * 
     * @return fnGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FnGroup getFnGroup() {
        return fnGroup;
    }


    /**
     * Sets the fnGroup value for this TransAbstract.
     * 
     * @param fnGroup
     */
    public void setFnGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FnGroup fnGroup) {
        this.fnGroup = fnGroup;
    }


    /**
     * Gets the glossary value for this TransAbstract.
     * 
     * @return glossary
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Glossary getGlossary() {
        return glossary;
    }


    /**
     * Sets the glossary value for this TransAbstract.
     * 
     * @param glossary
     */
    public void setGlossary(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Glossary glossary) {
        this.glossary = glossary;
    }


    /**
     * Gets the refList value for this TransAbstract.
     * 
     * @return refList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RefList getRefList() {
        return refList;
    }


    /**
     * Sets the refList value for this TransAbstract.
     * 
     * @param refList
     */
    public void setRefList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RefList refList) {
        this.refList = refList;
    }


    /**
     * Gets the abstractType value for this TransAbstract.
     * 
     * @return abstractType
     */
    public java.lang.String getAbstractType() {
        return abstractType;
    }


    /**
     * Sets the abstractType value for this TransAbstract.
     * 
     * @param abstractType
     */
    public void setAbstractType(java.lang.String abstractType) {
        this.abstractType = abstractType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransAbstract)) return false;
        TransAbstract other = (TransAbstract) obj;
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
            ((this.sec==null && other.getSec()==null) || 
             (this.sec!=null &&
              java.util.Arrays.equals(this.sec, other.getSec()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.fnGroup==null && other.getFnGroup()==null) || 
             (this.fnGroup!=null &&
              this.fnGroup.equals(other.getFnGroup()))) &&
            ((this.glossary==null && other.getGlossary()==null) || 
             (this.glossary!=null &&
              this.glossary.equals(other.getGlossary()))) &&
            ((this.refList==null && other.getRefList()==null) || 
             (this.refList!=null &&
              this.refList.equals(other.getRefList()))) &&
            ((this.abstractType==null && other.getAbstractType()==null) || 
             (this.abstractType!=null &&
              this.abstractType.equals(other.getAbstractType())));
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
        if (getSec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
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
        if (getAbstractType() != null) {
            _hashCode += getAbstractType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransAbstract.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">trans-abstract"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("abstractType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "abstract-type"));
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
        elemField.setFieldName("sec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "sec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "sec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">notes"));
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
