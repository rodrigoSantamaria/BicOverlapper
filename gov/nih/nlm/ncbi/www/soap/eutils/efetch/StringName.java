/**
 * StringName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class StringName  implements java.io.Serializable, org.apache.axis.encoding.MixedContentType {
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

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GivenNames givenNames;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Prefix prefix;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Surname surname;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Suffix suffix;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x;

    private org.apache.axis.message.MessageElement [] _any;  // attribute

    public StringName() {
    }

    public StringName(
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
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GivenNames givenNames,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Prefix prefix,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Surname surname,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Suffix suffix,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x,
           org.apache.axis.message.MessageElement [] _any) {
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
           this.givenNames = givenNames;
           this.prefix = prefix;
           this.surname = surname;
           this.suffix = suffix;
           this.x = x;
           this._any = _any;
    }


    /**
     * Gets the email value for this StringName.
     * 
     * @return email
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email getEmail() {
        return email;
    }


    /**
     * Sets the email value for this StringName.
     * 
     * @param email
     */
    public void setEmail(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email) {
        this.email = email;
    }


    /**
     * Gets the extLink value for this StringName.
     * 
     * @return extLink
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink getExtLink() {
        return extLink;
    }


    /**
     * Sets the extLink value for this StringName.
     * 
     * @param extLink
     */
    public void setExtLink(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink) {
        this.extLink = extLink;
    }


    /**
     * Gets the uri value for this StringName.
     * 
     * @return uri
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this StringName.
     * 
     * @param uri
     */
    public void setUri(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri) {
        this.uri = uri;
    }


    /**
     * Gets the inlineSupplementaryMaterial value for this StringName.
     * 
     * @return inlineSupplementaryMaterial
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineSupplementaryMaterial getInlineSupplementaryMaterial() {
        return inlineSupplementaryMaterial;
    }


    /**
     * Sets the inlineSupplementaryMaterial value for this StringName.
     * 
     * @param inlineSupplementaryMaterial
     */
    public void setInlineSupplementaryMaterial(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineSupplementaryMaterial inlineSupplementaryMaterial) {
        this.inlineSupplementaryMaterial = inlineSupplementaryMaterial;
    }


    /**
     * Gets the relatedArticle value for this StringName.
     * 
     * @return relatedArticle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle getRelatedArticle() {
        return relatedArticle;
    }


    /**
     * Sets the relatedArticle value for this StringName.
     * 
     * @param relatedArticle
     */
    public void setRelatedArticle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RelatedArticle relatedArticle) {
        this.relatedArticle = relatedArticle;
    }


    /**
     * Gets the font value for this StringName.
     * 
     * @return font
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Font getFont() {
        return font;
    }


    /**
     * Sets the font value for this StringName.
     * 
     * @param font
     */
    public void setFont(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Font font) {
        this.font = font;
    }


    /**
     * Gets the hr value for this StringName.
     * 
     * @return hr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hr getHr() {
        return hr;
    }


    /**
     * Sets the hr value for this StringName.
     * 
     * @param hr
     */
    public void setHr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Hr hr) {
        this.hr = hr;
    }


    /**
     * Gets the bold value for this StringName.
     * 
     * @return bold
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bold getBold() {
        return bold;
    }


    /**
     * Sets the bold value for this StringName.
     * 
     * @param bold
     */
    public void setBold(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Bold bold) {
        this.bold = bold;
    }


    /**
     * Gets the italic value for this StringName.
     * 
     * @return italic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Italic getItalic() {
        return italic;
    }


    /**
     * Sets the italic value for this StringName.
     * 
     * @param italic
     */
    public void setItalic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Italic italic) {
        this.italic = italic;
    }


    /**
     * Gets the monospace value for this StringName.
     * 
     * @return monospace
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Monospace getMonospace() {
        return monospace;
    }


    /**
     * Sets the monospace value for this StringName.
     * 
     * @param monospace
     */
    public void setMonospace(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Monospace monospace) {
        this.monospace = monospace;
    }


    /**
     * Gets the overline value for this StringName.
     * 
     * @return overline
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Overline getOverline() {
        return overline;
    }


    /**
     * Sets the overline value for this StringName.
     * 
     * @param overline
     */
    public void setOverline(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Overline overline) {
        this.overline = overline;
    }


    /**
     * Gets the overlineStart value for this StringName.
     * 
     * @return overlineStart
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineStart getOverlineStart() {
        return overlineStart;
    }


    /**
     * Sets the overlineStart value for this StringName.
     * 
     * @param overlineStart
     */
    public void setOverlineStart(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineStart overlineStart) {
        this.overlineStart = overlineStart;
    }


    /**
     * Gets the overlineEnd value for this StringName.
     * 
     * @return overlineEnd
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineEnd getOverlineEnd() {
        return overlineEnd;
    }


    /**
     * Sets the overlineEnd value for this StringName.
     * 
     * @param overlineEnd
     */
    public void setOverlineEnd(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OverlineEnd overlineEnd) {
        this.overlineEnd = overlineEnd;
    }


    /**
     * Gets the sc value for this StringName.
     * 
     * @return sc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sc getSc() {
        return sc;
    }


    /**
     * Sets the sc value for this StringName.
     * 
     * @param sc
     */
    public void setSc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sc sc) {
        this.sc = sc;
    }


    /**
     * Gets the strike value for this StringName.
     * 
     * @return strike
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Strike getStrike() {
        return strike;
    }


    /**
     * Sets the strike value for this StringName.
     * 
     * @param strike
     */
    public void setStrike(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Strike strike) {
        this.strike = strike;
    }


    /**
     * Gets the underline value for this StringName.
     * 
     * @return underline
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Underline getUnderline() {
        return underline;
    }


    /**
     * Sets the underline value for this StringName.
     * 
     * @param underline
     */
    public void setUnderline(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Underline underline) {
        this.underline = underline;
    }


    /**
     * Gets the underlineStart value for this StringName.
     * 
     * @return underlineStart
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineStart getUnderlineStart() {
        return underlineStart;
    }


    /**
     * Sets the underlineStart value for this StringName.
     * 
     * @param underlineStart
     */
    public void setUnderlineStart(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineStart underlineStart) {
        this.underlineStart = underlineStart;
    }


    /**
     * Gets the underlineEnd value for this StringName.
     * 
     * @return underlineEnd
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineEnd getUnderlineEnd() {
        return underlineEnd;
    }


    /**
     * Sets the underlineEnd value for this StringName.
     * 
     * @param underlineEnd
     */
    public void setUnderlineEnd(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UnderlineEnd underlineEnd) {
        this.underlineEnd = underlineEnd;
    }


    /**
     * Gets the inlineGraphic value for this StringName.
     * 
     * @return inlineGraphic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic getInlineGraphic() {
        return inlineGraphic;
    }


    /**
     * Sets the inlineGraphic value for this StringName.
     * 
     * @param inlineGraphic
     */
    public void setInlineGraphic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic inlineGraphic) {
        this.inlineGraphic = inlineGraphic;
    }


    /**
     * Gets the privateChar value for this StringName.
     * 
     * @return privateChar
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrivateChar getPrivateChar() {
        return privateChar;
    }


    /**
     * Sets the privateChar value for this StringName.
     * 
     * @param privateChar
     */
    public void setPrivateChar(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrivateChar privateChar) {
        this.privateChar = privateChar;
    }


    /**
     * Gets the inlineFormula value for this StringName.
     * 
     * @return inlineFormula
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineFormula getInlineFormula() {
        return inlineFormula;
    }


    /**
     * Sets the inlineFormula value for this StringName.
     * 
     * @param inlineFormula
     */
    public void setInlineFormula(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineFormula inlineFormula) {
        this.inlineFormula = inlineFormula;
    }


    /**
     * Gets the texMath value for this StringName.
     * 
     * @return texMath
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath getTexMath() {
        return texMath;
    }


    /**
     * Sets the texMath value for this StringName.
     * 
     * @param texMath
     */
    public void setTexMath(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TexMath texMath) {
        this.texMath = texMath;
    }


    /**
     * Gets the abbrev value for this StringName.
     * 
     * @return abbrev
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Abbrev getAbbrev() {
        return abbrev;
    }


    /**
     * Sets the abbrev value for this StringName.
     * 
     * @param abbrev
     */
    public void setAbbrev(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Abbrev abbrev) {
        this.abbrev = abbrev;
    }


    /**
     * Gets the namedContent value for this StringName.
     * 
     * @return namedContent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NamedContent getNamedContent() {
        return namedContent;
    }


    /**
     * Sets the namedContent value for this StringName.
     * 
     * @param namedContent
     */
    public void setNamedContent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NamedContent namedContent) {
        this.namedContent = namedContent;
    }


    /**
     * Gets the fn value for this StringName.
     * 
     * @return fn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn getFn() {
        return fn;
    }


    /**
     * Sets the fn value for this StringName.
     * 
     * @param fn
     */
    public void setFn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn) {
        this.fn = fn;
    }


    /**
     * Gets the target value for this StringName.
     * 
     * @return target
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Target getTarget() {
        return target;
    }


    /**
     * Sets the target value for this StringName.
     * 
     * @param target
     */
    public void setTarget(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Target target) {
        this.target = target;
    }


    /**
     * Gets the xref value for this StringName.
     * 
     * @return xref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref getXref() {
        return xref;
    }


    /**
     * Sets the xref value for this StringName.
     * 
     * @param xref
     */
    public void setXref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Xref xref) {
        this.xref = xref;
    }


    /**
     * Gets the sub value for this StringName.
     * 
     * @return sub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sub getSub() {
        return sub;
    }


    /**
     * Sets the sub value for this StringName.
     * 
     * @param sub
     */
    public void setSub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sub sub) {
        this.sub = sub;
    }


    /**
     * Gets the sup value for this StringName.
     * 
     * @return sup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sup getSup() {
        return sup;
    }


    /**
     * Sets the sup value for this StringName.
     * 
     * @param sup
     */
    public void setSup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Sup sup) {
        this.sup = sup;
    }


    /**
     * Gets the givenNames value for this StringName.
     * 
     * @return givenNames
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GivenNames getGivenNames() {
        return givenNames;
    }


    /**
     * Sets the givenNames value for this StringName.
     * 
     * @param givenNames
     */
    public void setGivenNames(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GivenNames givenNames) {
        this.givenNames = givenNames;
    }


    /**
     * Gets the prefix value for this StringName.
     * 
     * @return prefix
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Prefix getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this StringName.
     * 
     * @param prefix
     */
    public void setPrefix(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Prefix prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the surname value for this StringName.
     * 
     * @return surname
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Surname getSurname() {
        return surname;
    }


    /**
     * Sets the surname value for this StringName.
     * 
     * @param surname
     */
    public void setSurname(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Surname surname) {
        this.surname = surname;
    }


    /**
     * Gets the suffix value for this StringName.
     * 
     * @return suffix
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Suffix getSuffix() {
        return suffix;
    }


    /**
     * Sets the suffix value for this StringName.
     * 
     * @param suffix
     */
    public void setSuffix(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Suffix suffix) {
        this.suffix = suffix;
    }


    /**
     * Gets the x value for this StringName.
     * 
     * @return x
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.X getX() {
        return x;
    }


    /**
     * Sets the x value for this StringName.
     * 
     * @param x
     */
    public void setX(gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x) {
        this.x = x;
    }


    /**
     * Gets the _any value for this StringName.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this StringName.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StringName)) return false;
        StringName other = (StringName) obj;
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
            ((this.givenNames==null && other.getGivenNames()==null) || 
             (this.givenNames!=null &&
              this.givenNames.equals(other.getGivenNames()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.surname==null && other.getSurname()==null) || 
             (this.surname!=null &&
              this.surname.equals(other.getSurname()))) &&
            ((this.suffix==null && other.getSuffix()==null) || 
             (this.suffix!=null &&
              this.suffix.equals(other.getSuffix()))) &&
            ((this.x==null && other.getX()==null) || 
             (this.x!=null &&
              this.x.equals(other.getX()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getGivenNames() != null) {
            _hashCode += getGivenNames().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getSurname() != null) {
            _hashCode += getSurname().hashCode();
        }
        if (getSuffix() != null) {
            _hashCode += getSuffix().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StringName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">string-name"));
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
        elemField.setFieldName("givenNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "given-names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">given-names"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">prefix"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "surname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">surname"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "suffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">suffix"));
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
