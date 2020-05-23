package org.karthikps.bookdata.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "BookItems")
@EntityListeners(AuditingEntityListener.class)
public class BookDataItems implements Serializable {
	
	private String kind;
	
	@Id
	private String Id;
	private String Etag;
	private String SelfLink;
	private String Title;
	private String Subtitle;
	
	@Column
    @ElementCollection(targetClass=String.class)
	private List<String> Authors = null;
	
	private String Publisher;
	private String PublishedDate;
	private String Description;
	private Integer PageCount;
	private String PrintType;
	
	@Column
    @ElementCollection(targetClass=String.class)
	private List<String> Categories = null;
	
	private Integer AverageRating;
	private Integer RatingsCount;
	private String ContentVersion;
	private String Language;
	private String PreviewLink;
	private String InfoLink;
	private String CanonicalVolumeLink;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getEtag() {
		return Etag;
	}
	public void setEtag(String etag) {
		Etag = etag;
	}
	public String getSelfLink() {
		return SelfLink;
	}
	public void setSelfLink(String selfLink) {
		SelfLink = selfLink;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getSubtitle() {
		return Subtitle;
	}
	public void setSubtitle(String subtitle) {
		Subtitle = subtitle;
	}
	public List<String> getAuthors() {
		return Authors;
	}
	public void setAuthors(List<String> authors) {
		this.Authors = authors;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public String getPublishedDate() {
		return PublishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		PublishedDate = publishedDate;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Integer getPageCount() {
		return PageCount;
	}
	public void setPageCount(Integer pageCount) {
		PageCount = pageCount;
	}
	public String getPrintType() {
		return PrintType;
	}
	public void setPrintType(String printType) {
		PrintType = printType;
	}
	public List<String> getCategories() {
		return Categories;
	}
	public void setCategories(List<String> categories) {
		Categories = categories;
	}
	public Integer getAverageRating() {
		return AverageRating;
	}
	public void setAverageRating(Integer averageRating) {
		AverageRating = averageRating;
	}
	public Integer getRatingsCount() {
		return RatingsCount;
	}
	public void setRatingsCount(Integer ratingsCount) {
		RatingsCount = ratingsCount;
	}
	public String getContentVersion() {
		return ContentVersion;
	}
	public void setContentVersion(String contentVersion) {
		ContentVersion = contentVersion;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getPreviewLink() {
		return PreviewLink;
	}
	public void setPreviewLink(String previewLink) {
		PreviewLink = previewLink;
	}
	public String getInfoLink() {
		return InfoLink;
	}
	public void setInfoLink(String infoLink) {
		InfoLink = infoLink;
	}
	public String getCanonicalVolumeLink() {
		return CanonicalVolumeLink;
	}
	public void setCanonicalVolumeLink(String canonicalVolumeLink) {
		CanonicalVolumeLink = canonicalVolumeLink;
	}
	
}