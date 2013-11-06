/**
 * P.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class P  implements java.io.Serializable, org.apache.axis.encoding.MixedContentType {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineSupplementaryMaterial inlineSupplementaryMaterial;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle relatedArticle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Font font;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hr hr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bold bold;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Italic italic;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Monospace monospace;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Overline overline;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineStart overlineStart;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineEnd overlineEnd;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sc sc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Strike strike;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Underline underline;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineStart underlineStart;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineEnd underlineEnd;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic inlineGraphic;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrivateChar privateChar;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineFormula inlineFormula;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath texMath;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Abbrev abbrev;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NamedContent namedContent;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Target target;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref xref;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sub sub;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sup sup;

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

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Citation citation;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList defList;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.List list;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack ack;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote dispQuote;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech speech;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement statement;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup verseGroup;

    private org.apache.axis.message.MessageElement [] _any;  // attribute

    private org.apache.axis.types.Id id;  // attribute

    private java.lang.String contentType;  // attribute

    public P() {
    }

    public P(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineSupplementaryMaterial inlineSupplementaryMaterial,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle relatedArticle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Font font,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hr hr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bold bold,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Italic italic,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Monospace monospace,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Overline overline,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineStart overlineStart,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineEnd overlineEnd,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sc sc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Strike strike,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Underline underline,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineStart underlineStart,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineEnd underlineEnd,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic inlineGraphic,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrivateChar privateChar,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineFormula inlineFormula,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath texMath,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Abbrev abbrev,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NamedContent namedContent,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Target target,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref xref,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sub sub,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sup sup,
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
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Citation citation,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList defList,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.List list,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack ack,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote dispQuote,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech speech,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement statement,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup verseGroup,
           org.apache.axis.message.MessageElement [] _any,
           org.apache.axis.types.Id id,
           java.lang.String contentType) {
           this.email = email;
           this.extLink = extLink;
           this.uri = uri;
           this.inlineSupplementaryMaterial = inlineSupplementaryMaterial;
           this.relatedArticle = relatedArticle;
           this.font = font;
           this.hr = hr;
           this.bold = bold;
           this.italic = italic;
           this.monospace = monospace;
           this.overline = overline;
           this.overlineStart = overlineStart;
           this.overlineEnd = overlineEnd;
           this.sc = sc;
           this.strike = strike;
           this.underline = underline;
           this.underlineStart = underlineStart;
           this.underlineEnd = underlineEnd;
           this.inlineGraphic = inlineGraphic;
           this.privateChar = privateChar;
           this.inlineFormula = inlineFormula;
           this.texMath = texMath;
           this.abbrev = abbrev;
           this.namedContent = namedContent;
           this.fn = fn;
           this.target = target;
           this.xref = xref;
           this.sub = sub;
           this.sup = sup;
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
           this.citation = citation;
           this.defList = defList;
           this.list = list;
           this.ack = ack;
           this.dispQuote = dispQuote;
           this.speech = speech;
           this.statement = statement;
           this.verseGroup = verseGroup;
           this._any = _any;
           this.id = id;
           this.contentType = contentType;
    }


    /**
     * Gets the email value for this P.
     * 
     * @return email
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email getEmail() {
        return email;
    }


    /**
     * Sets the email value for this P.
     * 
     * @param email
     */
    public void setEmail(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email) {
        this.email = email;
    }


    /**
     * Gets the extLink value for this P.
     * 
     * @return extLink
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink getExtLink() {
        return extLink;
    }


    /**
     * Sets the extLink value for this P.
     * 
     * @param extLink
     */
    public void setExtLink(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink) {
        this.extLink = extLink;
    }


    /**
     * Gets the uri value for this P.
     * 
     * @return uri
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this P.
     * 
     * @param uri
     */
    public void setUri(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri) {
        this.uri = uri;
    }


    /**
     * Gets the inlineSupplementaryMaterial value for this P.
     * 
     * @return inlineSupplementaryMaterial
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineSupplementaryMaterial getInlineSupplementaryMaterial() {
        return inlineSupplementaryMaterial;
    }


    /**
     * Sets the inlineSupplementaryMaterial value for this P.
     * 
     * @param inlineSupplementaryMaterial
     */
    public void setInlineSupplementaryMaterial(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineSupplementaryMaterial inlineSupplementaryMaterial) {
        this.inlineSupplementaryMaterial = inlineSupplementaryMaterial;
    }


    /**
     * Gets the relatedArticle value for this P.
     * 
     * @return relatedArticle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle getRelatedArticle() {
        return relatedArticle;
    }


    /**
     * Sets the relatedArticle value for this P.
     * 
     * @param relatedArticle
     */
    public void setRelatedArticle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle relatedArticle) {
        this.relatedArticle = relatedArticle;
    }


    /**
     * Gets the font value for this P.
     * 
     * @return font
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Font getFont() {
        return font;
    }


    /**
     * Sets the font value for this P.
     * 
     * @param font
     */
    public void setFont(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Font font) {
        this.font = font;
    }


    /**
     * Gets the hr value for this P.
     * 
     * @return hr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hr getHr() {
        return hr;
    }


    /**
     * Sets the hr value for this P.
     * 
     * @param hr
     */
    public void setHr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hr hr) {
        this.hr = hr;
    }


    /**
     * Gets the bold value for this P.
     * 
     * @return bold
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bold getBold() {
        return bold;
    }


    /**
     * Sets the bold value for this P.
     * 
     * @param bold
     */
    public void setBold(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bold bold) {
        this.bold = bold;
    }


    /**
     * Gets the italic value for this P.
     * 
     * @return italic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Italic getItalic() {
        return italic;
    }


    /**
     * Sets the italic value for this P.
     * 
     * @param italic
     */
    public void setItalic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Italic italic) {
        this.italic = italic;
    }


    /**
     * Gets the monospace value for this P.
     * 
     * @return monospace
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Monospace getMonospace() {
        return monospace;
    }


    /**
     * Sets the monospace value for this P.
     * 
     * @param monospace
     */
    public void setMonospace(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Monospace monospace) {
        this.monospace = monospace;
    }


    /**
     * Gets the overline value for this P.
     * 
     * @return overline
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Overline getOverline() {
        return overline;
    }


    /**
     * Sets the overline value for this P.
     * 
     * @param overline
     */
    public void setOverline(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Overline overline) {
        this.overline = overline;
    }


    /**
     * Gets the overlineStart value for this P.
     * 
     * @return overlineStart
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineStart getOverlineStart() {
        return overlineStart;
    }


    /**
     * Sets the overlineStart value for this P.
     * 
     * @param overlineStart
     */
    public void setOverlineStart(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineStart overlineStart) {
        this.overlineStart = overlineStart;
    }


    /**
     * Gets the overlineEnd value for this P.
     * 
     * @return overlineEnd
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineEnd getOverlineEnd() {
        return overlineEnd;
    }


    /**
     * Sets the overlineEnd value for this P.
     * 
     * @param overlineEnd
     */
    public void setOverlineEnd(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineEnd overlineEnd) {
        this.overlineEnd = overlineEnd;
    }


    /**
     * Gets the sc value for this P.
     * 
     * @return sc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sc getSc() {
        return sc;
    }


    /**
     * Sets the sc value for this P.
     * 
     * @param sc
     */
    public void setSc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sc sc) {
        this.sc = sc;
    }


    /**
     * Gets the strike value for this P.
     * 
     * @return strike
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Strike getStrike() {
        return strike;
    }


    /**
     * Sets the strike value for this P.
     * 
     * @param strike
     */
    public void setStrike(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Strike strike) {
        this.strike = strike;
    }


    /**
     * Gets the underline value for this P.
     * 
     * @return underline
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Underline getUnderline() {
        return underline;
    }


    /**
     * Sets the underline value for this P.
     * 
     * @param underline
     */
    public void setUnderline(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Underline underline) {
        this.underline = underline;
    }


    /**
     * Gets the underlineStart value for this P.
     * 
     * @return underlineStart
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineStart getUnderlineStart() {
        return underlineStart;
    }


    /**
     * Sets the underlineStart value for this P.
     * 
     * @param underlineStart
     */
    public void setUnderlineStart(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineStart underlineStart) {
        this.underlineStart = underlineStart;
    }


    /**
     * Gets the underlineEnd value for this P.
     * 
     * @return underlineEnd
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineEnd getUnderlineEnd() {
        return underlineEnd;
    }


    /**
     * Sets the underlineEnd value for this P.
     * 
     * @param underlineEnd
     */
    public void setUnderlineEnd(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineEnd underlineEnd) {
        this.underlineEnd = underlineEnd;
    }


    /**
     * Gets the inlineGraphic value for this P.
     * 
     * @return inlineGraphic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic getInlineGraphic() {
        return inlineGraphic;
    }


    /**
     * Sets the inlineGraphic value for this P.
     * 
     * @param inlineGraphic
     */
    public void setInlineGraphic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic inlineGraphic) {
        this.inlineGraphic = inlineGraphic;
    }


    /**
     * Gets the privateChar value for this P.
     * 
     * @return privateChar
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrivateChar getPrivateChar() {
        return privateChar;
    }


    /**
     * Sets the privateChar value for this P.
     * 
     * @param privateChar
     */
    public void setPrivateChar(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrivateChar privateChar) {
        this.privateChar = privateChar;
    }


    /**
     * Gets the inlineFormula value for this P.
     * 
     * @return inlineFormula
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineFormula getInlineFormula() {
        return inlineFormula;
    }


    /**
     * Sets the inlineFormula value for this P.
     * 
     * @param inlineFormula
     */
    public void setInlineFormula(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineFormula inlineFormula) {
        this.inlineFormula = inlineFormula;
    }


    /**
     * Gets the texMath value for this P.
     * 
     * @return texMath
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath getTexMath() {
        return texMath;
    }


    /**
     * Sets the texMath value for this P.
     * 
     * @param texMath
     */
    public void setTexMath(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath texMath) {
        this.texMath = texMath;
    }


    /**
     * Gets the abbrev value for this P.
     * 
     * @return abbrev
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Abbrev getAbbrev() {
        return abbrev;
    }


    /**
     * Sets the abbrev value for this P.
     * 
     * @param abbrev
     */
    public void setAbbrev(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Abbrev abbrev) {
        this.abbrev = abbrev;
    }


    /**
     * Gets the namedContent value for this P.
     * 
     * @return namedContent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NamedContent getNamedContent() {
        return namedContent;
    }


    /**
     * Sets the namedContent value for this P.
     * 
     * @param namedContent
     */
    public void setNamedContent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NamedContent namedContent) {
        this.namedContent = namedContent;
    }


    /**
     * Gets the fn value for this P.
     * 
     * @return fn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn getFn() {
        return fn;
    }


    /**
     * Sets the fn value for this P.
     * 
     * @param fn
     */
    public void setFn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn) {
        this.fn = fn;
    }


    /**
     * Gets the target value for this P.
     * 
     * @return target
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Target getTarget() {
        return target;
    }


    /**
     * Sets the target value for this P.
     * 
     * @param target
     */
    public void setTarget(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Target target) {
        this.target = target;
    }


    /**
     * Gets the xref value for this P.
     * 
     * @return xref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref getXref() {
        return xref;
    }


    /**
     * Sets the xref value for this P.
     * 
     * @param xref
     */
    public void setXref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref xref) {
        this.xref = xref;
    }


    /**
     * Gets the sub value for this P.
     * 
     * @return sub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sub getSub() {
        return sub;
    }


    /**
     * Sets the sub value for this P.
     * 
     * @param sub
     */
    public void setSub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sub sub) {
        this.sub = sub;
    }


    /**
     * Gets the sup value for this P.
     * 
     * @return sup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sup getSup() {
        return sup;
    }


    /**
     * Sets the sup value for this P.
     * 
     * @param sup
     */
    public void setSup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sup sup) {
        this.sup = sup;
    }


    /**
     * Gets the array value for this P.
     * 
     * @return array
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Array getArray() {
        return array;
    }


    /**
     * Sets the array value for this P.
     * 
     * @param array
     */
    public void setArray(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Array array) {
        this.array = array;
    }


    /**
     * Gets the boxedText value for this P.
     * 
     * @return boxedText
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BoxedText getBoxedText() {
        return boxedText;
    }


    /**
     * Sets the boxedText value for this P.
     * 
     * @param boxedText
     */
    public void setBoxedText(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BoxedText boxedText) {
        this.boxedText = boxedText;
    }


    /**
     * Gets the chemStruct value for this P.
     * 
     * @return chemStruct
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStruct getChemStruct() {
        return chemStruct;
    }


    /**
     * Sets the chemStruct value for this P.
     * 
     * @param chemStruct
     */
    public void setChemStruct(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStruct chemStruct) {
        this.chemStruct = chemStruct;
    }


    /**
     * Gets the chemStructWrapper value for this P.
     * 
     * @return chemStructWrapper
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStructWrapper getChemStructWrapper() {
        return chemStructWrapper;
    }


    /**
     * Sets the chemStructWrapper value for this P.
     * 
     * @param chemStructWrapper
     */
    public void setChemStructWrapper(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemStructWrapper chemStructWrapper) {
        this.chemStructWrapper = chemStructWrapper;
    }


    /**
     * Gets the fig value for this P.
     * 
     * @return fig
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fig getFig() {
        return fig;
    }


    /**
     * Sets the fig value for this P.
     * 
     * @param fig
     */
    public void setFig(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fig fig) {
        this.fig = fig;
    }


    /**
     * Gets the figGroup value for this P.
     * 
     * @return figGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FigGroup getFigGroup() {
        return figGroup;
    }


    /**
     * Sets the figGroup value for this P.
     * 
     * @param figGroup
     */
    public void setFigGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FigGroup figGroup) {
        this.figGroup = figGroup;
    }


    /**
     * Gets the graphic value for this P.
     * 
     * @return graphic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Graphic getGraphic() {
        return graphic;
    }


    /**
     * Sets the graphic value for this P.
     * 
     * @param graphic
     */
    public void setGraphic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Graphic graphic) {
        this.graphic = graphic;
    }


    /**
     * Gets the media value for this P.
     * 
     * @return media
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Media getMedia() {
        return media;
    }


    /**
     * Sets the media value for this P.
     * 
     * @param media
     */
    public void setMedia(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Media media) {
        this.media = media;
    }


    /**
     * Gets the preformat value for this P.
     * 
     * @return preformat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Preformat getPreformat() {
        return preformat;
    }


    /**
     * Sets the preformat value for this P.
     * 
     * @param preformat
     */
    public void setPreformat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Preformat preformat) {
        this.preformat = preformat;
    }


    /**
     * Gets the supplementaryMaterial value for this P.
     * 
     * @return supplementaryMaterial
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SupplementaryMaterial getSupplementaryMaterial() {
        return supplementaryMaterial;
    }


    /**
     * Sets the supplementaryMaterial value for this P.
     * 
     * @param supplementaryMaterial
     */
    public void setSupplementaryMaterial(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SupplementaryMaterial supplementaryMaterial) {
        this.supplementaryMaterial = supplementaryMaterial;
    }


    /**
     * Gets the tableWrap value for this P.
     * 
     * @return tableWrap
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap getTableWrap() {
        return tableWrap;
    }


    /**
     * Sets the tableWrap value for this P.
     * 
     * @param tableWrap
     */
    public void setTableWrap(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrap tableWrap) {
        this.tableWrap = tableWrap;
    }


    /**
     * Gets the tableWrapGroup value for this P.
     * 
     * @return tableWrapGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapGroup getTableWrapGroup() {
        return tableWrapGroup;
    }


    /**
     * Sets the tableWrapGroup value for this P.
     * 
     * @param tableWrapGroup
     */
    public void setTableWrapGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TableWrapGroup tableWrapGroup) {
        this.tableWrapGroup = tableWrapGroup;
    }


    /**
     * Gets the dispFormula value for this P.
     * 
     * @return dispFormula
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispFormula getDispFormula() {
        return dispFormula;
    }


    /**
     * Sets the dispFormula value for this P.
     * 
     * @param dispFormula
     */
    public void setDispFormula(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispFormula dispFormula) {
        this.dispFormula = dispFormula;
    }


    /**
     * Gets the citation value for this P.
     * 
     * @return citation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Citation getCitation() {
        return citation;
    }


    /**
     * Sets the citation value for this P.
     * 
     * @param citation
     */
    public void setCitation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Citation citation) {
        this.citation = citation;
    }


    /**
     * Gets the defList value for this P.
     * 
     * @return defList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList getDefList() {
        return defList;
    }


    /**
     * Sets the defList value for this P.
     * 
     * @param defList
     */
    public void setDefList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DefList defList) {
        this.defList = defList;
    }


    /**
     * Gets the list value for this P.
     * 
     * @return list
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.List getList() {
        return list;
    }


    /**
     * Sets the list value for this P.
     * 
     * @param list
     */
    public void setList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.List list) {
        this.list = list;
    }


    /**
     * Gets the ack value for this P.
     * 
     * @return ack
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack getAck() {
        return ack;
    }


    /**
     * Sets the ack value for this P.
     * 
     * @param ack
     */
    public void setAck(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Ack ack) {
        this.ack = ack;
    }


    /**
     * Gets the dispQuote value for this P.
     * 
     * @return dispQuote
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote getDispQuote() {
        return dispQuote;
    }


    /**
     * Sets the dispQuote value for this P.
     * 
     * @param dispQuote
     */
    public void setDispQuote(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DispQuote dispQuote) {
        this.dispQuote = dispQuote;
    }


    /**
     * Gets the speech value for this P.
     * 
     * @return speech
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech getSpeech() {
        return speech;
    }


    /**
     * Sets the speech value for this P.
     * 
     * @param speech
     */
    public void setSpeech(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Speech speech) {
        this.speech = speech;
    }


    /**
     * Gets the statement value for this P.
     * 
     * @return statement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement getStatement() {
        return statement;
    }


    /**
     * Sets the statement value for this P.
     * 
     * @param statement
     */
    public void setStatement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Statement statement) {
        this.statement = statement;
    }


    /**
     * Gets the verseGroup value for this P.
     * 
     * @return verseGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup getVerseGroup() {
        return verseGroup;
    }


    /**
     * Sets the verseGroup value for this P.
     * 
     * @param verseGroup
     */
    public void setVerseGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.VerseGroup verseGroup) {
        this.verseGroup = verseGroup;
    }


    /**
     * Gets the _any value for this P.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this P.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the id value for this P.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this P.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the contentType value for this P.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this P.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof P)) return false;
        P other = (P) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.extLink==null && other.getExtLink()==null) || 
             (this.extLink!=null &&
              this.extLink.equals(other.getExtLink()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri()))) &&
            ((this.inlineSupplementaryMaterial==null && other.getInlineSupplementaryMaterial()==null) || 
             (this.inlineSupplementaryMaterial!=null &&
              this.inlineSupplementaryMaterial.equals(other.getInlineSupplementaryMaterial()))) &&
            ((this.relatedArticle==null && other.getRelatedArticle()==null) || 
             (this.relatedArticle!=null &&
              this.relatedArticle.equals(other.getRelatedArticle()))) &&
            ((this.font==null && other.getFont()==null) || 
             (this.font!=null &&
              this.font.equals(other.getFont()))) &&
            ((this.hr==null && other.getHr()==null) || 
             (this.hr!=null &&
              this.hr.equals(other.getHr()))) &&
            ((this.bold==null && other.getBold()==null) || 
             (this.bold!=null &&
              this.bold.equals(other.getBold()))) &&
            ((this.italic==null && other.getItalic()==null) || 
             (this.italic!=null &&
              this.italic.equals(other.getItalic()))) &&
            ((this.monospace==null && other.getMonospace()==null) || 
             (this.monospace!=null &&
              this.monospace.equals(other.getMonospace()))) &&
            ((this.overline==null && other.getOverline()==null) || 
             (this.overline!=null &&
              this.overline.equals(other.getOverline()))) &&
            ((this.overlineStart==null && other.getOverlineStart()==null) || 
             (this.overlineStart!=null &&
              this.overlineStart.equals(other.getOverlineStart()))) &&
            ((this.overlineEnd==null && other.getOverlineEnd()==null) || 
             (this.overlineEnd!=null &&
              this.overlineEnd.equals(other.getOverlineEnd()))) &&
            ((this.sc==null && other.getSc()==null) || 
             (this.sc!=null &&
              this.sc.equals(other.getSc()))) &&
            ((this.strike==null && other.getStrike()==null) || 
             (this.strike!=null &&
              this.strike.equals(other.getStrike()))) &&
            ((this.underline==null && other.getUnderline()==null) || 
             (this.underline!=null &&
              this.underline.equals(other.getUnderline()))) &&
            ((this.underlineStart==null && other.getUnderlineStart()==null) || 
             (this.underlineStart!=null &&
              this.underlineStart.equals(other.getUnderlineStart()))) &&
            ((this.underlineEnd==null && other.getUnderlineEnd()==null) || 
             (this.underlineEnd!=null &&
              this.underlineEnd.equals(other.getUnderlineEnd()))) &&
            ((this.inlineGraphic==null && other.getInlineGraphic()==null) || 
             (this.inlineGraphic!=null &&
              this.inlineGraphic.equals(other.getInlineGraphic()))) &&
            ((this.privateChar==null && other.getPrivateChar()==null) || 
             (this.privateChar!=null &&
              this.privateChar.equals(other.getPrivateChar()))) &&
            ((this.inlineFormula==null && other.getInlineFormula()==null) || 
             (this.inlineFormula!=null &&
              this.inlineFormula.equals(other.getInlineFormula()))) &&
            ((this.texMath==null && other.getTexMath()==null) || 
             (this.texMath!=null &&
              this.texMath.equals(other.getTexMath()))) &&
            ((this.abbrev==null && other.getAbbrev()==null) || 
             (this.abbrev!=null &&
              this.abbrev.equals(other.getAbbrev()))) &&
            ((this.namedContent==null && other.getNamedContent()==null) || 
             (this.namedContent!=null &&
              this.namedContent.equals(other.getNamedContent()))) &&
            ((this.fn==null && other.getFn()==null) || 
             (this.fn!=null &&
              this.fn.equals(other.getFn()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.xref==null && other.getXref()==null) || 
             (this.xref!=null &&
              this.xref.equals(other.getXref()))) &&
            ((this.sub==null && other.getSub()==null) || 
             (this.sub!=null &&
              this.sub.equals(other.getSub()))) &&
            ((this.sup==null && other.getSup()==null) || 
             (this.sup!=null &&
              this.sup.equals(other.getSup()))) &&
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
            ((this.citation==null && other.getCitation()==null) || 
             (this.citation!=null &&
              this.citation.equals(other.getCitation()))) &&
            ((this.defList==null && other.getDefList()==null) || 
             (this.defList!=null &&
              this.defList.equals(other.getDefList()))) &&
            ((this.list==null && other.getList()==null) || 
             (this.list!=null &&
              this.list.equals(other.getList()))) &&
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
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getExtLink() != null) {
            _hashCode += getExtLink().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        if (getInlineSupplementaryMaterial() != null) {
            _hashCode += getInlineSupplementaryMaterial().hashCode();
        }
        if (getRelatedArticle() != null) {
            _hashCode += getRelatedArticle().hashCode();
        }
        if (getFont() != null) {
            _hashCode += getFont().hashCode();
        }
        if (getHr() != null) {
            _hashCode += getHr().hashCode();
        }
        if (getBold() != null) {
            _hashCode += getBold().hashCode();
        }
        if (getItalic() != null) {
            _hashCode += getItalic().hashCode();
        }
        if (getMonospace() != null) {
            _hashCode += getMonospace().hashCode();
        }
        if (getOverline() != null) {
            _hashCode += getOverline().hashCode();
        }
        if (getOverlineStart() != null) {
            _hashCode += getOverlineStart().hashCode();
        }
        if (getOverlineEnd() != null) {
            _hashCode += getOverlineEnd().hashCode();
        }
        if (getSc() != null) {
            _hashCode += getSc().hashCode();
        }
        if (getStrike() != null) {
            _hashCode += getStrike().hashCode();
        }
        if (getUnderline() != null) {
            _hashCode += getUnderline().hashCode();
        }
        if (getUnderlineStart() != null) {
            _hashCode += getUnderlineStart().hashCode();
        }
        if (getUnderlineEnd() != null) {
            _hashCode += getUnderlineEnd().hashCode();
        }
        if (getInlineGraphic() != null) {
            _hashCode += getInlineGraphic().hashCode();
        }
        if (getPrivateChar() != null) {
            _hashCode += getPrivateChar().hashCode();
        }
        if (getInlineFormula() != null) {
            _hashCode += getInlineFormula().hashCode();
        }
        if (getTexMath() != null) {
            _hashCode += getTexMath().hashCode();
        }
        if (getAbbrev() != null) {
            _hashCode += getAbbrev().hashCode();
        }
        if (getNamedContent() != null) {
            _hashCode += getNamedContent().hashCode();
        }
        if (getFn() != null) {
            _hashCode += getFn().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getXref() != null) {
            _hashCode += getXref().hashCode();
        }
        if (getSub() != null) {
            _hashCode += getSub().hashCode();
        }
        if (getSup() != null) {
            _hashCode += getSup().hashCode();
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
        if (getCitation() != null) {
            _hashCode += getCitation().hashCode();
        }
        if (getDefList() != null) {
            _hashCode += getDefList().hashCode();
        }
        if (getList() != null) {
            _hashCode += getList().hashCode();
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
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(P.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">p"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("contentType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "content-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("inlineSupplementaryMaterial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "inline-supplementary-material"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">inline-supplementary-material"));
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
        elemField.setFieldName("font");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "font"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">font"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "hr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">hr"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "bold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">bold"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("italic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "italic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">italic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monospace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "monospace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">monospace"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "overline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">overline"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overlineStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "overline-start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">overline-start"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overlineEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "overline-end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">overline-end"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "sc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">sc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strike");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "strike"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">strike"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("underline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "underline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">underline"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("underlineStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "underline-start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">underline-start"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("underlineEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "underline-end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">underline-end"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inlineGraphic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "inline-graphic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">inline-graphic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateChar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "private-char"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">private-char"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inlineFormula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "inline-formula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">inline-formula"));
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
        elemField.setFieldName("abbrev");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "abbrev"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">abbrev"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "named-content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">named-content"));
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
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">target"));
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
        elemField.setFieldName("sub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "sub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">sub"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "sup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">sup"));
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
        elemField.setFieldName("citation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "citation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">citation"));
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
