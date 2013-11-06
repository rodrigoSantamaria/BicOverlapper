/**
 * RelatedArticle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RelatedArticle  implements java.io.Serializable, org.apache.axis.encoding.MixedContentType {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineSupplementaryMaterial inlineSupplementaryMaterial;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle relatedArticle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Font font;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hr hr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch._break _break;

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

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AccessDate accessDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotation annotation;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleTitle articleTitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Collab collab;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Comment comment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfDate confDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfLoc confLoc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfName confName;

    private java.lang.String day;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Edition edition;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElocationId elocationId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal etal;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fpage fpage;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Gov gov;

    private java.lang.String isbn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issn issn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issue issue;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IssueId issueId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IssueTitle issueTitle;

    private java.lang.String lpage;

    private java.lang.String month;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Name name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectId objectId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PageCount pageCount;

    private java.lang.String pageRange;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Patent patent;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonGroup personGroup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubId pubId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherLoc publisherLoc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherName publisherName;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Role role;

    private java.lang.String season;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Series series;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Source source;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Std std;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringName stringName;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Supplement supplement;

    private java.lang.String timeStamp;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransSource transSource;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransTitle transTitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Volume volume;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.VolumeId volumeId;

    private java.lang.String year;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Target target;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref xref;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sub sub;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sup sup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x;

    private org.apache.axis.message.MessageElement [] _any;  // attribute

    private org.apache.axis.types.Id id;  // attribute

    private org.apache.axis.types.IDRef alternateFormOf;  // attribute

    private java.lang.String relatedArticleType;  // attribute

    private java.lang.String extLinkType;  // attribute

    private java.lang.String vol;  // attribute

    private java.lang.String page;  // attribute

    private java.lang.String issue2;  // attribute

    private java.lang.String journalId;  // attribute

    private java.lang.String journalIdType;  // attribute

    public RelatedArticle() {
    }

    public RelatedArticle(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineSupplementaryMaterial inlineSupplementaryMaterial,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle relatedArticle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Font font,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hr hr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch._break _break,
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
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AccessDate accessDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotation annotation,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleTitle articleTitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Collab collab,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Comment comment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfDate confDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfLoc confLoc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfName confName,
           java.lang.String day,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Edition edition,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElocationId elocationId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal etal,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fpage fpage,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Gov gov,
           java.lang.String isbn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issn issn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issue issue,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IssueId issueId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IssueTitle issueTitle,
           java.lang.String lpage,
           java.lang.String month,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Name name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectId objectId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PageCount pageCount,
           java.lang.String pageRange,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Patent patent,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonGroup personGroup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubId pubId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherLoc publisherLoc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherName publisherName,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Role role,
           java.lang.String season,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Series series,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Source source,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Std std,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringName stringName,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Supplement supplement,
           java.lang.String timeStamp,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransSource transSource,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransTitle transTitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Volume volume,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.VolumeId volumeId,
           java.lang.String year,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Target target,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref xref,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sub sub,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sup sup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x,
           org.apache.axis.message.MessageElement [] _any,
           org.apache.axis.types.Id id,
           org.apache.axis.types.IDRef alternateFormOf,
           java.lang.String relatedArticleType,
           java.lang.String extLinkType,
           java.lang.String vol,
           java.lang.String page,
           java.lang.String issue2,
           java.lang.String journalId,
           java.lang.String journalIdType) {
           this.inlineSupplementaryMaterial = inlineSupplementaryMaterial;
           this.relatedArticle = relatedArticle;
           this.font = font;
           this.hr = hr;
           this._break = _break;
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
           this.accessDate = accessDate;
           this.annotation = annotation;
           this.articleTitle = articleTitle;
           this.collab = collab;
           this.comment = comment;
           this.confDate = confDate;
           this.confLoc = confLoc;
           this.confName = confName;
           this.day = day;
           this.edition = edition;
           this.email = email;
           this.elocationId = elocationId;
           this.etal = etal;
           this.extLink = extLink;
           this.fpage = fpage;
           this.gov = gov;
           this.isbn = isbn;
           this.issn = issn;
           this.issue = issue;
           this.issueId = issueId;
           this.issueTitle = issueTitle;
           this.lpage = lpage;
           this.month = month;
           this.name = name;
           this.objectId = objectId;
           this.pageCount = pageCount;
           this.pageRange = pageRange;
           this.patent = patent;
           this.personGroup = personGroup;
           this.pubId = pubId;
           this.publisherLoc = publisherLoc;
           this.publisherName = publisherName;
           this.role = role;
           this.season = season;
           this.series = series;
           this.source = source;
           this.std = std;
           this.stringName = stringName;
           this.supplement = supplement;
           this.timeStamp = timeStamp;
           this.transSource = transSource;
           this.transTitle = transTitle;
           this.uri = uri;
           this.volume = volume;
           this.volumeId = volumeId;
           this.year = year;
           this.fn = fn;
           this.target = target;
           this.xref = xref;
           this.sub = sub;
           this.sup = sup;
           this.x = x;
           this._any = _any;
           this.id = id;
           this.alternateFormOf = alternateFormOf;
           this.relatedArticleType = relatedArticleType;
           this.extLinkType = extLinkType;
           this.vol = vol;
           this.page = page;
           this.issue2 = issue2;
           this.journalId = journalId;
           this.journalIdType = journalIdType;
    }


    /**
     * Gets the inlineSupplementaryMaterial value for this RelatedArticle.
     * 
     * @return inlineSupplementaryMaterial
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineSupplementaryMaterial getInlineSupplementaryMaterial() {
        return inlineSupplementaryMaterial;
    }


    /**
     * Sets the inlineSupplementaryMaterial value for this RelatedArticle.
     * 
     * @param inlineSupplementaryMaterial
     */
    public void setInlineSupplementaryMaterial(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineSupplementaryMaterial inlineSupplementaryMaterial) {
        this.inlineSupplementaryMaterial = inlineSupplementaryMaterial;
    }


    /**
     * Gets the relatedArticle value for this RelatedArticle.
     * 
     * @return relatedArticle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle getRelatedArticle() {
        return relatedArticle;
    }


    /**
     * Sets the relatedArticle value for this RelatedArticle.
     * 
     * @param relatedArticle
     */
    public void setRelatedArticle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle relatedArticle) {
        this.relatedArticle = relatedArticle;
    }


    /**
     * Gets the font value for this RelatedArticle.
     * 
     * @return font
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Font getFont() {
        return font;
    }


    /**
     * Sets the font value for this RelatedArticle.
     * 
     * @param font
     */
    public void setFont(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Font font) {
        this.font = font;
    }


    /**
     * Gets the hr value for this RelatedArticle.
     * 
     * @return hr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hr getHr() {
        return hr;
    }


    /**
     * Sets the hr value for this RelatedArticle.
     * 
     * @param hr
     */
    public void setHr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hr hr) {
        this.hr = hr;
    }


    /**
     * Gets the _break value for this RelatedArticle.
     * 
     * @return _break
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch._break get_break() {
        return _break;
    }


    /**
     * Sets the _break value for this RelatedArticle.
     * 
     * @param _break
     */
    public void set_break(gov.nih.nlm.ncbi.www.soap.eutils.efetch._break _break) {
        this._break = _break;
    }


    /**
     * Gets the bold value for this RelatedArticle.
     * 
     * @return bold
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bold getBold() {
        return bold;
    }


    /**
     * Sets the bold value for this RelatedArticle.
     * 
     * @param bold
     */
    public void setBold(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bold bold) {
        this.bold = bold;
    }


    /**
     * Gets the italic value for this RelatedArticle.
     * 
     * @return italic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Italic getItalic() {
        return italic;
    }


    /**
     * Sets the italic value for this RelatedArticle.
     * 
     * @param italic
     */
    public void setItalic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Italic italic) {
        this.italic = italic;
    }


    /**
     * Gets the monospace value for this RelatedArticle.
     * 
     * @return monospace
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Monospace getMonospace() {
        return monospace;
    }


    /**
     * Sets the monospace value for this RelatedArticle.
     * 
     * @param monospace
     */
    public void setMonospace(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Monospace monospace) {
        this.monospace = monospace;
    }


    /**
     * Gets the overline value for this RelatedArticle.
     * 
     * @return overline
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Overline getOverline() {
        return overline;
    }


    /**
     * Sets the overline value for this RelatedArticle.
     * 
     * @param overline
     */
    public void setOverline(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Overline overline) {
        this.overline = overline;
    }


    /**
     * Gets the overlineStart value for this RelatedArticle.
     * 
     * @return overlineStart
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineStart getOverlineStart() {
        return overlineStart;
    }


    /**
     * Sets the overlineStart value for this RelatedArticle.
     * 
     * @param overlineStart
     */
    public void setOverlineStart(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineStart overlineStart) {
        this.overlineStart = overlineStart;
    }


    /**
     * Gets the overlineEnd value for this RelatedArticle.
     * 
     * @return overlineEnd
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineEnd getOverlineEnd() {
        return overlineEnd;
    }


    /**
     * Sets the overlineEnd value for this RelatedArticle.
     * 
     * @param overlineEnd
     */
    public void setOverlineEnd(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineEnd overlineEnd) {
        this.overlineEnd = overlineEnd;
    }


    /**
     * Gets the sc value for this RelatedArticle.
     * 
     * @return sc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sc getSc() {
        return sc;
    }


    /**
     * Sets the sc value for this RelatedArticle.
     * 
     * @param sc
     */
    public void setSc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sc sc) {
        this.sc = sc;
    }


    /**
     * Gets the strike value for this RelatedArticle.
     * 
     * @return strike
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Strike getStrike() {
        return strike;
    }


    /**
     * Sets the strike value for this RelatedArticle.
     * 
     * @param strike
     */
    public void setStrike(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Strike strike) {
        this.strike = strike;
    }


    /**
     * Gets the underline value for this RelatedArticle.
     * 
     * @return underline
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Underline getUnderline() {
        return underline;
    }


    /**
     * Sets the underline value for this RelatedArticle.
     * 
     * @param underline
     */
    public void setUnderline(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Underline underline) {
        this.underline = underline;
    }


    /**
     * Gets the underlineStart value for this RelatedArticle.
     * 
     * @return underlineStart
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineStart getUnderlineStart() {
        return underlineStart;
    }


    /**
     * Sets the underlineStart value for this RelatedArticle.
     * 
     * @param underlineStart
     */
    public void setUnderlineStart(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineStart underlineStart) {
        this.underlineStart = underlineStart;
    }


    /**
     * Gets the underlineEnd value for this RelatedArticle.
     * 
     * @return underlineEnd
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineEnd getUnderlineEnd() {
        return underlineEnd;
    }


    /**
     * Sets the underlineEnd value for this RelatedArticle.
     * 
     * @param underlineEnd
     */
    public void setUnderlineEnd(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineEnd underlineEnd) {
        this.underlineEnd = underlineEnd;
    }


    /**
     * Gets the inlineGraphic value for this RelatedArticle.
     * 
     * @return inlineGraphic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic getInlineGraphic() {
        return inlineGraphic;
    }


    /**
     * Sets the inlineGraphic value for this RelatedArticle.
     * 
     * @param inlineGraphic
     */
    public void setInlineGraphic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic inlineGraphic) {
        this.inlineGraphic = inlineGraphic;
    }


    /**
     * Gets the privateChar value for this RelatedArticle.
     * 
     * @return privateChar
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrivateChar getPrivateChar() {
        return privateChar;
    }


    /**
     * Sets the privateChar value for this RelatedArticle.
     * 
     * @param privateChar
     */
    public void setPrivateChar(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrivateChar privateChar) {
        this.privateChar = privateChar;
    }


    /**
     * Gets the inlineFormula value for this RelatedArticle.
     * 
     * @return inlineFormula
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineFormula getInlineFormula() {
        return inlineFormula;
    }


    /**
     * Sets the inlineFormula value for this RelatedArticle.
     * 
     * @param inlineFormula
     */
    public void setInlineFormula(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineFormula inlineFormula) {
        this.inlineFormula = inlineFormula;
    }


    /**
     * Gets the texMath value for this RelatedArticle.
     * 
     * @return texMath
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath getTexMath() {
        return texMath;
    }


    /**
     * Sets the texMath value for this RelatedArticle.
     * 
     * @param texMath
     */
    public void setTexMath(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath texMath) {
        this.texMath = texMath;
    }


    /**
     * Gets the abbrev value for this RelatedArticle.
     * 
     * @return abbrev
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Abbrev getAbbrev() {
        return abbrev;
    }


    /**
     * Sets the abbrev value for this RelatedArticle.
     * 
     * @param abbrev
     */
    public void setAbbrev(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Abbrev abbrev) {
        this.abbrev = abbrev;
    }


    /**
     * Gets the namedContent value for this RelatedArticle.
     * 
     * @return namedContent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NamedContent getNamedContent() {
        return namedContent;
    }


    /**
     * Sets the namedContent value for this RelatedArticle.
     * 
     * @param namedContent
     */
    public void setNamedContent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NamedContent namedContent) {
        this.namedContent = namedContent;
    }


    /**
     * Gets the accessDate value for this RelatedArticle.
     * 
     * @return accessDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AccessDate getAccessDate() {
        return accessDate;
    }


    /**
     * Sets the accessDate value for this RelatedArticle.
     * 
     * @param accessDate
     */
    public void setAccessDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AccessDate accessDate) {
        this.accessDate = accessDate;
    }


    /**
     * Gets the annotation value for this RelatedArticle.
     * 
     * @return annotation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotation getAnnotation() {
        return annotation;
    }


    /**
     * Sets the annotation value for this RelatedArticle.
     * 
     * @param annotation
     */
    public void setAnnotation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Annotation annotation) {
        this.annotation = annotation;
    }


    /**
     * Gets the articleTitle value for this RelatedArticle.
     * 
     * @return articleTitle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleTitle getArticleTitle() {
        return articleTitle;
    }


    /**
     * Sets the articleTitle value for this RelatedArticle.
     * 
     * @param articleTitle
     */
    public void setArticleTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleTitle articleTitle) {
        this.articleTitle = articleTitle;
    }


    /**
     * Gets the collab value for this RelatedArticle.
     * 
     * @return collab
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Collab getCollab() {
        return collab;
    }


    /**
     * Sets the collab value for this RelatedArticle.
     * 
     * @param collab
     */
    public void setCollab(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Collab collab) {
        this.collab = collab;
    }


    /**
     * Gets the comment value for this RelatedArticle.
     * 
     * @return comment
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Comment getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this RelatedArticle.
     * 
     * @param comment
     */
    public void setComment(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Comment comment) {
        this.comment = comment;
    }


    /**
     * Gets the confDate value for this RelatedArticle.
     * 
     * @return confDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfDate getConfDate() {
        return confDate;
    }


    /**
     * Sets the confDate value for this RelatedArticle.
     * 
     * @param confDate
     */
    public void setConfDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfDate confDate) {
        this.confDate = confDate;
    }


    /**
     * Gets the confLoc value for this RelatedArticle.
     * 
     * @return confLoc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfLoc getConfLoc() {
        return confLoc;
    }


    /**
     * Sets the confLoc value for this RelatedArticle.
     * 
     * @param confLoc
     */
    public void setConfLoc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfLoc confLoc) {
        this.confLoc = confLoc;
    }


    /**
     * Gets the confName value for this RelatedArticle.
     * 
     * @return confName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfName getConfName() {
        return confName;
    }


    /**
     * Sets the confName value for this RelatedArticle.
     * 
     * @param confName
     */
    public void setConfName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ConfName confName) {
        this.confName = confName;
    }


    /**
     * Gets the day value for this RelatedArticle.
     * 
     * @return day
     */
    public java.lang.String getDay() {
        return day;
    }


    /**
     * Sets the day value for this RelatedArticle.
     * 
     * @param day
     */
    public void setDay(java.lang.String day) {
        this.day = day;
    }


    /**
     * Gets the edition value for this RelatedArticle.
     * 
     * @return edition
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Edition getEdition() {
        return edition;
    }


    /**
     * Sets the edition value for this RelatedArticle.
     * 
     * @param edition
     */
    public void setEdition(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Edition edition) {
        this.edition = edition;
    }


    /**
     * Gets the email value for this RelatedArticle.
     * 
     * @return email
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email getEmail() {
        return email;
    }


    /**
     * Sets the email value for this RelatedArticle.
     * 
     * @param email
     */
    public void setEmail(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email) {
        this.email = email;
    }


    /**
     * Gets the elocationId value for this RelatedArticle.
     * 
     * @return elocationId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElocationId getElocationId() {
        return elocationId;
    }


    /**
     * Sets the elocationId value for this RelatedArticle.
     * 
     * @param elocationId
     */
    public void setElocationId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ElocationId elocationId) {
        this.elocationId = elocationId;
    }


    /**
     * Gets the etal value for this RelatedArticle.
     * 
     * @return etal
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal getEtal() {
        return etal;
    }


    /**
     * Sets the etal value for this RelatedArticle.
     * 
     * @param etal
     */
    public void setEtal(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Etal etal) {
        this.etal = etal;
    }


    /**
     * Gets the extLink value for this RelatedArticle.
     * 
     * @return extLink
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink getExtLink() {
        return extLink;
    }


    /**
     * Sets the extLink value for this RelatedArticle.
     * 
     * @param extLink
     */
    public void setExtLink(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink) {
        this.extLink = extLink;
    }


    /**
     * Gets the fpage value for this RelatedArticle.
     * 
     * @return fpage
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fpage getFpage() {
        return fpage;
    }


    /**
     * Sets the fpage value for this RelatedArticle.
     * 
     * @param fpage
     */
    public void setFpage(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fpage fpage) {
        this.fpage = fpage;
    }


    /**
     * Gets the gov value for this RelatedArticle.
     * 
     * @return gov
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Gov getGov() {
        return gov;
    }


    /**
     * Sets the gov value for this RelatedArticle.
     * 
     * @param gov
     */
    public void setGov(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Gov gov) {
        this.gov = gov;
    }


    /**
     * Gets the isbn value for this RelatedArticle.
     * 
     * @return isbn
     */
    public java.lang.String getIsbn() {
        return isbn;
    }


    /**
     * Sets the isbn value for this RelatedArticle.
     * 
     * @param isbn
     */
    public void setIsbn(java.lang.String isbn) {
        this.isbn = isbn;
    }


    /**
     * Gets the issn value for this RelatedArticle.
     * 
     * @return issn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issn getIssn() {
        return issn;
    }


    /**
     * Sets the issn value for this RelatedArticle.
     * 
     * @param issn
     */
    public void setIssn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issn issn) {
        this.issn = issn;
    }


    /**
     * Gets the issue value for this RelatedArticle.
     * 
     * @return issue
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issue getIssue() {
        return issue;
    }


    /**
     * Sets the issue value for this RelatedArticle.
     * 
     * @param issue
     */
    public void setIssue(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Issue issue) {
        this.issue = issue;
    }


    /**
     * Gets the issueId value for this RelatedArticle.
     * 
     * @return issueId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IssueId getIssueId() {
        return issueId;
    }


    /**
     * Sets the issueId value for this RelatedArticle.
     * 
     * @param issueId
     */
    public void setIssueId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IssueId issueId) {
        this.issueId = issueId;
    }


    /**
     * Gets the issueTitle value for this RelatedArticle.
     * 
     * @return issueTitle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IssueTitle getIssueTitle() {
        return issueTitle;
    }


    /**
     * Sets the issueTitle value for this RelatedArticle.
     * 
     * @param issueTitle
     */
    public void setIssueTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IssueTitle issueTitle) {
        this.issueTitle = issueTitle;
    }


    /**
     * Gets the lpage value for this RelatedArticle.
     * 
     * @return lpage
     */
    public java.lang.String getLpage() {
        return lpage;
    }


    /**
     * Sets the lpage value for this RelatedArticle.
     * 
     * @param lpage
     */
    public void setLpage(java.lang.String lpage) {
        this.lpage = lpage;
    }


    /**
     * Gets the month value for this RelatedArticle.
     * 
     * @return month
     */
    public java.lang.String getMonth() {
        return month;
    }


    /**
     * Sets the month value for this RelatedArticle.
     * 
     * @param month
     */
    public void setMonth(java.lang.String month) {
        this.month = month;
    }


    /**
     * Gets the name value for this RelatedArticle.
     * 
     * @return name
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Name getName() {
        return name;
    }


    /**
     * Sets the name value for this RelatedArticle.
     * 
     * @param name
     */
    public void setName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Name name) {
        this.name = name;
    }


    /**
     * Gets the objectId value for this RelatedArticle.
     * 
     * @return objectId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectId getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this RelatedArticle.
     * 
     * @param objectId
     */
    public void setObjectId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectId objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the pageCount value for this RelatedArticle.
     * 
     * @return pageCount
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PageCount getPageCount() {
        return pageCount;
    }


    /**
     * Sets the pageCount value for this RelatedArticle.
     * 
     * @param pageCount
     */
    public void setPageCount(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PageCount pageCount) {
        this.pageCount = pageCount;
    }


    /**
     * Gets the pageRange value for this RelatedArticle.
     * 
     * @return pageRange
     */
    public java.lang.String getPageRange() {
        return pageRange;
    }


    /**
     * Sets the pageRange value for this RelatedArticle.
     * 
     * @param pageRange
     */
    public void setPageRange(java.lang.String pageRange) {
        this.pageRange = pageRange;
    }


    /**
     * Gets the patent value for this RelatedArticle.
     * 
     * @return patent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Patent getPatent() {
        return patent;
    }


    /**
     * Sets the patent value for this RelatedArticle.
     * 
     * @param patent
     */
    public void setPatent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Patent patent) {
        this.patent = patent;
    }


    /**
     * Gets the personGroup value for this RelatedArticle.
     * 
     * @return personGroup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonGroup getPersonGroup() {
        return personGroup;
    }


    /**
     * Sets the personGroup value for this RelatedArticle.
     * 
     * @param personGroup
     */
    public void setPersonGroup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonGroup personGroup) {
        this.personGroup = personGroup;
    }


    /**
     * Gets the pubId value for this RelatedArticle.
     * 
     * @return pubId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubId getPubId() {
        return pubId;
    }


    /**
     * Sets the pubId value for this RelatedArticle.
     * 
     * @param pubId
     */
    public void setPubId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubId pubId) {
        this.pubId = pubId;
    }


    /**
     * Gets the publisherLoc value for this RelatedArticle.
     * 
     * @return publisherLoc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherLoc getPublisherLoc() {
        return publisherLoc;
    }


    /**
     * Sets the publisherLoc value for this RelatedArticle.
     * 
     * @param publisherLoc
     */
    public void setPublisherLoc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherLoc publisherLoc) {
        this.publisherLoc = publisherLoc;
    }


    /**
     * Gets the publisherName value for this RelatedArticle.
     * 
     * @return publisherName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherName getPublisherName() {
        return publisherName;
    }


    /**
     * Sets the publisherName value for this RelatedArticle.
     * 
     * @param publisherName
     */
    public void setPublisherName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherName publisherName) {
        this.publisherName = publisherName;
    }


    /**
     * Gets the role value for this RelatedArticle.
     * 
     * @return role
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Role getRole() {
        return role;
    }


    /**
     * Sets the role value for this RelatedArticle.
     * 
     * @param role
     */
    public void setRole(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Role role) {
        this.role = role;
    }


    /**
     * Gets the season value for this RelatedArticle.
     * 
     * @return season
     */
    public java.lang.String getSeason() {
        return season;
    }


    /**
     * Sets the season value for this RelatedArticle.
     * 
     * @param season
     */
    public void setSeason(java.lang.String season) {
        this.season = season;
    }


    /**
     * Gets the series value for this RelatedArticle.
     * 
     * @return series
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Series getSeries() {
        return series;
    }


    /**
     * Sets the series value for this RelatedArticle.
     * 
     * @param series
     */
    public void setSeries(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Series series) {
        this.series = series;
    }


    /**
     * Gets the source value for this RelatedArticle.
     * 
     * @return source
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Source getSource() {
        return source;
    }


    /**
     * Sets the source value for this RelatedArticle.
     * 
     * @param source
     */
    public void setSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Source source) {
        this.source = source;
    }


    /**
     * Gets the std value for this RelatedArticle.
     * 
     * @return std
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Std getStd() {
        return std;
    }


    /**
     * Sets the std value for this RelatedArticle.
     * 
     * @param std
     */
    public void setStd(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Std std) {
        this.std = std;
    }


    /**
     * Gets the stringName value for this RelatedArticle.
     * 
     * @return stringName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringName getStringName() {
        return stringName;
    }


    /**
     * Sets the stringName value for this RelatedArticle.
     * 
     * @param stringName
     */
    public void setStringName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringName stringName) {
        this.stringName = stringName;
    }


    /**
     * Gets the supplement value for this RelatedArticle.
     * 
     * @return supplement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Supplement getSupplement() {
        return supplement;
    }


    /**
     * Sets the supplement value for this RelatedArticle.
     * 
     * @param supplement
     */
    public void setSupplement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Supplement supplement) {
        this.supplement = supplement;
    }


    /**
     * Gets the timeStamp value for this RelatedArticle.
     * 
     * @return timeStamp
     */
    public java.lang.String getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this RelatedArticle.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.lang.String timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the transSource value for this RelatedArticle.
     * 
     * @return transSource
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransSource getTransSource() {
        return transSource;
    }


    /**
     * Sets the transSource value for this RelatedArticle.
     * 
     * @param transSource
     */
    public void setTransSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransSource transSource) {
        this.transSource = transSource;
    }


    /**
     * Gets the transTitle value for this RelatedArticle.
     * 
     * @return transTitle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransTitle getTransTitle() {
        return transTitle;
    }


    /**
     * Sets the transTitle value for this RelatedArticle.
     * 
     * @param transTitle
     */
    public void setTransTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TransTitle transTitle) {
        this.transTitle = transTitle;
    }


    /**
     * Gets the uri value for this RelatedArticle.
     * 
     * @return uri
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this RelatedArticle.
     * 
     * @param uri
     */
    public void setUri(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri) {
        this.uri = uri;
    }


    /**
     * Gets the volume value for this RelatedArticle.
     * 
     * @return volume
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Volume getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this RelatedArticle.
     * 
     * @param volume
     */
    public void setVolume(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Volume volume) {
        this.volume = volume;
    }


    /**
     * Gets the volumeId value for this RelatedArticle.
     * 
     * @return volumeId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.VolumeId getVolumeId() {
        return volumeId;
    }


    /**
     * Sets the volumeId value for this RelatedArticle.
     * 
     * @param volumeId
     */
    public void setVolumeId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.VolumeId volumeId) {
        this.volumeId = volumeId;
    }


    /**
     * Gets the year value for this RelatedArticle.
     * 
     * @return year
     */
    public java.lang.String getYear() {
        return year;
    }


    /**
     * Sets the year value for this RelatedArticle.
     * 
     * @param year
     */
    public void setYear(java.lang.String year) {
        this.year = year;
    }


    /**
     * Gets the fn value for this RelatedArticle.
     * 
     * @return fn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn getFn() {
        return fn;
    }


    /**
     * Sets the fn value for this RelatedArticle.
     * 
     * @param fn
     */
    public void setFn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn) {
        this.fn = fn;
    }


    /**
     * Gets the target value for this RelatedArticle.
     * 
     * @return target
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Target getTarget() {
        return target;
    }


    /**
     * Sets the target value for this RelatedArticle.
     * 
     * @param target
     */
    public void setTarget(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Target target) {
        this.target = target;
    }


    /**
     * Gets the xref value for this RelatedArticle.
     * 
     * @return xref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref getXref() {
        return xref;
    }


    /**
     * Sets the xref value for this RelatedArticle.
     * 
     * @param xref
     */
    public void setXref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref xref) {
        this.xref = xref;
    }


    /**
     * Gets the sub value for this RelatedArticle.
     * 
     * @return sub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sub getSub() {
        return sub;
    }


    /**
     * Sets the sub value for this RelatedArticle.
     * 
     * @param sub
     */
    public void setSub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sub sub) {
        this.sub = sub;
    }


    /**
     * Gets the sup value for this RelatedArticle.
     * 
     * @return sup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sup getSup() {
        return sup;
    }


    /**
     * Sets the sup value for this RelatedArticle.
     * 
     * @param sup
     */
    public void setSup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sup sup) {
        this.sup = sup;
    }


    /**
     * Gets the x value for this RelatedArticle.
     * 
     * @return x
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.X getX() {
        return x;
    }


    /**
     * Sets the x value for this RelatedArticle.
     * 
     * @param x
     */
    public void setX(gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x) {
        this.x = x;
    }


    /**
     * Gets the _any value for this RelatedArticle.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this RelatedArticle.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the id value for this RelatedArticle.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this RelatedArticle.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the alternateFormOf value for this RelatedArticle.
     * 
     * @return alternateFormOf
     */
    public org.apache.axis.types.IDRef getAlternateFormOf() {
        return alternateFormOf;
    }


    /**
     * Sets the alternateFormOf value for this RelatedArticle.
     * 
     * @param alternateFormOf
     */
    public void setAlternateFormOf(org.apache.axis.types.IDRef alternateFormOf) {
        this.alternateFormOf = alternateFormOf;
    }


    /**
     * Gets the relatedArticleType value for this RelatedArticle.
     * 
     * @return relatedArticleType
     */
    public java.lang.String getRelatedArticleType() {
        return relatedArticleType;
    }


    /**
     * Sets the relatedArticleType value for this RelatedArticle.
     * 
     * @param relatedArticleType
     */
    public void setRelatedArticleType(java.lang.String relatedArticleType) {
        this.relatedArticleType = relatedArticleType;
    }


    /**
     * Gets the extLinkType value for this RelatedArticle.
     * 
     * @return extLinkType
     */
    public java.lang.String getExtLinkType() {
        return extLinkType;
    }


    /**
     * Sets the extLinkType value for this RelatedArticle.
     * 
     * @param extLinkType
     */
    public void setExtLinkType(java.lang.String extLinkType) {
        this.extLinkType = extLinkType;
    }


    /**
     * Gets the vol value for this RelatedArticle.
     * 
     * @return vol
     */
    public java.lang.String getVol() {
        return vol;
    }


    /**
     * Sets the vol value for this RelatedArticle.
     * 
     * @param vol
     */
    public void setVol(java.lang.String vol) {
        this.vol = vol;
    }


    /**
     * Gets the page value for this RelatedArticle.
     * 
     * @return page
     */
    public java.lang.String getPage() {
        return page;
    }


    /**
     * Sets the page value for this RelatedArticle.
     * 
     * @param page
     */
    public void setPage(java.lang.String page) {
        this.page = page;
    }


    /**
     * Gets the issue2 value for this RelatedArticle.
     * 
     * @return issue2
     */
    public java.lang.String getIssue2() {
        return issue2;
    }


    /**
     * Sets the issue2 value for this RelatedArticle.
     * 
     * @param issue2
     */
    public void setIssue2(java.lang.String issue2) {
        this.issue2 = issue2;
    }


    /**
     * Gets the journalId value for this RelatedArticle.
     * 
     * @return journalId
     */
    public java.lang.String getJournalId() {
        return journalId;
    }


    /**
     * Sets the journalId value for this RelatedArticle.
     * 
     * @param journalId
     */
    public void setJournalId(java.lang.String journalId) {
        this.journalId = journalId;
    }


    /**
     * Gets the journalIdType value for this RelatedArticle.
     * 
     * @return journalIdType
     */
    public java.lang.String getJournalIdType() {
        return journalIdType;
    }


    /**
     * Sets the journalIdType value for this RelatedArticle.
     * 
     * @param journalIdType
     */
    public void setJournalIdType(java.lang.String journalIdType) {
        this.journalIdType = journalIdType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelatedArticle)) return false;
        RelatedArticle other = (RelatedArticle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
            ((this._break==null && other.get_break()==null) || 
             (this._break!=null &&
              this._break.equals(other.get_break()))) &&
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
            ((this.accessDate==null && other.getAccessDate()==null) || 
             (this.accessDate!=null &&
              this.accessDate.equals(other.getAccessDate()))) &&
            ((this.annotation==null && other.getAnnotation()==null) || 
             (this.annotation!=null &&
              this.annotation.equals(other.getAnnotation()))) &&
            ((this.articleTitle==null && other.getArticleTitle()==null) || 
             (this.articleTitle!=null &&
              this.articleTitle.equals(other.getArticleTitle()))) &&
            ((this.collab==null && other.getCollab()==null) || 
             (this.collab!=null &&
              this.collab.equals(other.getCollab()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.confDate==null && other.getConfDate()==null) || 
             (this.confDate!=null &&
              this.confDate.equals(other.getConfDate()))) &&
            ((this.confLoc==null && other.getConfLoc()==null) || 
             (this.confLoc!=null &&
              this.confLoc.equals(other.getConfLoc()))) &&
            ((this.confName==null && other.getConfName()==null) || 
             (this.confName!=null &&
              this.confName.equals(other.getConfName()))) &&
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.edition==null && other.getEdition()==null) || 
             (this.edition!=null &&
              this.edition.equals(other.getEdition()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.elocationId==null && other.getElocationId()==null) || 
             (this.elocationId!=null &&
              this.elocationId.equals(other.getElocationId()))) &&
            ((this.etal==null && other.getEtal()==null) || 
             (this.etal!=null &&
              this.etal.equals(other.getEtal()))) &&
            ((this.extLink==null && other.getExtLink()==null) || 
             (this.extLink!=null &&
              this.extLink.equals(other.getExtLink()))) &&
            ((this.fpage==null && other.getFpage()==null) || 
             (this.fpage!=null &&
              this.fpage.equals(other.getFpage()))) &&
            ((this.gov==null && other.getGov()==null) || 
             (this.gov!=null &&
              this.gov.equals(other.getGov()))) &&
            ((this.isbn==null && other.getIsbn()==null) || 
             (this.isbn!=null &&
              this.isbn.equals(other.getIsbn()))) &&
            ((this.issn==null && other.getIssn()==null) || 
             (this.issn!=null &&
              this.issn.equals(other.getIssn()))) &&
            ((this.issue==null && other.getIssue()==null) || 
             (this.issue!=null &&
              this.issue.equals(other.getIssue()))) &&
            ((this.issueId==null && other.getIssueId()==null) || 
             (this.issueId!=null &&
              this.issueId.equals(other.getIssueId()))) &&
            ((this.issueTitle==null && other.getIssueTitle()==null) || 
             (this.issueTitle!=null &&
              this.issueTitle.equals(other.getIssueTitle()))) &&
            ((this.lpage==null && other.getLpage()==null) || 
             (this.lpage!=null &&
              this.lpage.equals(other.getLpage()))) &&
            ((this.month==null && other.getMonth()==null) || 
             (this.month!=null &&
              this.month.equals(other.getMonth()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              this.objectId.equals(other.getObjectId()))) &&
            ((this.pageCount==null && other.getPageCount()==null) || 
             (this.pageCount!=null &&
              this.pageCount.equals(other.getPageCount()))) &&
            ((this.pageRange==null && other.getPageRange()==null) || 
             (this.pageRange!=null &&
              this.pageRange.equals(other.getPageRange()))) &&
            ((this.patent==null && other.getPatent()==null) || 
             (this.patent!=null &&
              this.patent.equals(other.getPatent()))) &&
            ((this.personGroup==null && other.getPersonGroup()==null) || 
             (this.personGroup!=null &&
              this.personGroup.equals(other.getPersonGroup()))) &&
            ((this.pubId==null && other.getPubId()==null) || 
             (this.pubId!=null &&
              this.pubId.equals(other.getPubId()))) &&
            ((this.publisherLoc==null && other.getPublisherLoc()==null) || 
             (this.publisherLoc!=null &&
              this.publisherLoc.equals(other.getPublisherLoc()))) &&
            ((this.publisherName==null && other.getPublisherName()==null) || 
             (this.publisherName!=null &&
              this.publisherName.equals(other.getPublisherName()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.season==null && other.getSeason()==null) || 
             (this.season!=null &&
              this.season.equals(other.getSeason()))) &&
            ((this.series==null && other.getSeries()==null) || 
             (this.series!=null &&
              this.series.equals(other.getSeries()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.std==null && other.getStd()==null) || 
             (this.std!=null &&
              this.std.equals(other.getStd()))) &&
            ((this.stringName==null && other.getStringName()==null) || 
             (this.stringName!=null &&
              this.stringName.equals(other.getStringName()))) &&
            ((this.supplement==null && other.getSupplement()==null) || 
             (this.supplement!=null &&
              this.supplement.equals(other.getSupplement()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.transSource==null && other.getTransSource()==null) || 
             (this.transSource!=null &&
              this.transSource.equals(other.getTransSource()))) &&
            ((this.transTitle==null && other.getTransTitle()==null) || 
             (this.transTitle!=null &&
              this.transTitle.equals(other.getTransTitle()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.volumeId==null && other.getVolumeId()==null) || 
             (this.volumeId!=null &&
              this.volumeId.equals(other.getVolumeId()))) &&
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
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
            ((this.x==null && other.getX()==null) || 
             (this.x!=null &&
              this.x.equals(other.getX()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.alternateFormOf==null && other.getAlternateFormOf()==null) || 
             (this.alternateFormOf!=null &&
              this.alternateFormOf.equals(other.getAlternateFormOf()))) &&
            ((this.relatedArticleType==null && other.getRelatedArticleType()==null) || 
             (this.relatedArticleType!=null &&
              this.relatedArticleType.equals(other.getRelatedArticleType()))) &&
            ((this.extLinkType==null && other.getExtLinkType()==null) || 
             (this.extLinkType!=null &&
              this.extLinkType.equals(other.getExtLinkType()))) &&
            ((this.vol==null && other.getVol()==null) || 
             (this.vol!=null &&
              this.vol.equals(other.getVol()))) &&
            ((this.page==null && other.getPage()==null) || 
             (this.page!=null &&
              this.page.equals(other.getPage()))) &&
            ((this.issue2==null && other.getIssue2()==null) || 
             (this.issue2!=null &&
              this.issue2.equals(other.getIssue2()))) &&
            ((this.journalId==null && other.getJournalId()==null) || 
             (this.journalId!=null &&
              this.journalId.equals(other.getJournalId()))) &&
            ((this.journalIdType==null && other.getJournalIdType()==null) || 
             (this.journalIdType!=null &&
              this.journalIdType.equals(other.getJournalIdType())));
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
        if (get_break() != null) {
            _hashCode += get_break().hashCode();
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
        if (getAccessDate() != null) {
            _hashCode += getAccessDate().hashCode();
        }
        if (getAnnotation() != null) {
            _hashCode += getAnnotation().hashCode();
        }
        if (getArticleTitle() != null) {
            _hashCode += getArticleTitle().hashCode();
        }
        if (getCollab() != null) {
            _hashCode += getCollab().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getConfDate() != null) {
            _hashCode += getConfDate().hashCode();
        }
        if (getConfLoc() != null) {
            _hashCode += getConfLoc().hashCode();
        }
        if (getConfName() != null) {
            _hashCode += getConfName().hashCode();
        }
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getEdition() != null) {
            _hashCode += getEdition().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getElocationId() != null) {
            _hashCode += getElocationId().hashCode();
        }
        if (getEtal() != null) {
            _hashCode += getEtal().hashCode();
        }
        if (getExtLink() != null) {
            _hashCode += getExtLink().hashCode();
        }
        if (getFpage() != null) {
            _hashCode += getFpage().hashCode();
        }
        if (getGov() != null) {
            _hashCode += getGov().hashCode();
        }
        if (getIsbn() != null) {
            _hashCode += getIsbn().hashCode();
        }
        if (getIssn() != null) {
            _hashCode += getIssn().hashCode();
        }
        if (getIssue() != null) {
            _hashCode += getIssue().hashCode();
        }
        if (getIssueId() != null) {
            _hashCode += getIssueId().hashCode();
        }
        if (getIssueTitle() != null) {
            _hashCode += getIssueTitle().hashCode();
        }
        if (getLpage() != null) {
            _hashCode += getLpage().hashCode();
        }
        if (getMonth() != null) {
            _hashCode += getMonth().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getObjectId() != null) {
            _hashCode += getObjectId().hashCode();
        }
        if (getPageCount() != null) {
            _hashCode += getPageCount().hashCode();
        }
        if (getPageRange() != null) {
            _hashCode += getPageRange().hashCode();
        }
        if (getPatent() != null) {
            _hashCode += getPatent().hashCode();
        }
        if (getPersonGroup() != null) {
            _hashCode += getPersonGroup().hashCode();
        }
        if (getPubId() != null) {
            _hashCode += getPubId().hashCode();
        }
        if (getPublisherLoc() != null) {
            _hashCode += getPublisherLoc().hashCode();
        }
        if (getPublisherName() != null) {
            _hashCode += getPublisherName().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getSeason() != null) {
            _hashCode += getSeason().hashCode();
        }
        if (getSeries() != null) {
            _hashCode += getSeries().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getStd() != null) {
            _hashCode += getStd().hashCode();
        }
        if (getStringName() != null) {
            _hashCode += getStringName().hashCode();
        }
        if (getSupplement() != null) {
            _hashCode += getSupplement().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getTransSource() != null) {
            _hashCode += getTransSource().hashCode();
        }
        if (getTransTitle() != null) {
            _hashCode += getTransTitle().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getVolumeId() != null) {
            _hashCode += getVolumeId().hashCode();
        }
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
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
        if (getX() != null) {
            _hashCode += getX().hashCode();
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
        if (getAlternateFormOf() != null) {
            _hashCode += getAlternateFormOf().hashCode();
        }
        if (getRelatedArticleType() != null) {
            _hashCode += getRelatedArticleType().hashCode();
        }
        if (getExtLinkType() != null) {
            _hashCode += getExtLinkType().hashCode();
        }
        if (getVol() != null) {
            _hashCode += getVol().hashCode();
        }
        if (getPage() != null) {
            _hashCode += getPage().hashCode();
        }
        if (getIssue2() != null) {
            _hashCode += getIssue2().hashCode();
        }
        if (getJournalId() != null) {
            _hashCode += getJournalId().hashCode();
        }
        if (getJournalIdType() != null) {
            _hashCode += getJournalIdType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelatedArticle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">related-article"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("alternateFormOf");
        attrField.setXmlName(new javax.xml.namespace.QName("", "alternate-form-of"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "IDREF"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("relatedArticleType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "related-article-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("extLinkType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ext-link-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("vol");
        attrField.setXmlName(new javax.xml.namespace.QName("", "vol"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("page");
        attrField.setXmlName(new javax.xml.namespace.QName("", "page"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("issue");
        attrField.setXmlName(new javax.xml.namespace.QName("", "issue"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("journalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "journal-id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("journalIdType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "journal-id-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("_break");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "break"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">break"));
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
        elemField.setFieldName("accessDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "access-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">access-date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "annotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">annotation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "article-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">article-title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "collab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">collab"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">comment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "conf-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">conf-date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confLoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "conf-loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">conf-loc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "conf-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">conf-name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "edition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">edition"));
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
        elemField.setFieldName("elocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "elocation-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">elocation-id"));
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
        elemField.setFieldName("fpage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "fpage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">fpage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gov");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "gov"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">gov"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isbn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "isbn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "issn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">issn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">issue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "issue-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">issue-id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "issue-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">issue-title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lpage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "lpage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "object-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">object-id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "page-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">page-count"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "page-range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "patent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">patent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "person-group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">person-group"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "pub-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">pub-id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherLoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "publisher-loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">publisher-loc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "publisher-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">publisher-name"));
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
        elemField.setFieldName("season");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "season"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("series");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "series"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">series"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">source"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("std");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "std"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">std"));
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
        elemField.setFieldName("supplement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "supplement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">supplement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "time-stamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "trans-source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">trans-source"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "trans-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">trans-title"));
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
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">volume"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "volume-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">volume-id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
