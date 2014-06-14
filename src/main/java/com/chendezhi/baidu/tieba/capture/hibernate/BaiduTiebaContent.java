package com.chendezhi.baidu.tieba.capture.hibernate;

// Generated 2014-6-14 2:03:37 by Hibernate Tools 3.4.0.CR1

/**
 * BaiduTiebaContent generated by hbm2java
 */
public class BaiduTiebaContent implements java.io.Serializable {

	private BaiduTiebaContentId id;
	private String imgUrl;
	private boolean isDownload;

	public BaiduTiebaContent() {
	}

	public BaiduTiebaContent(BaiduTiebaContentId id, String imgUrl,
			boolean isDownload) {
		this.id = id;
		this.imgUrl = imgUrl;
		this.isDownload = isDownload;
	}

	public BaiduTiebaContentId getId() {
		return this.id;
	}

	public void setId(BaiduTiebaContentId id) {
		this.id = id;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public boolean isIsDownload() {
		return this.isDownload;
	}

	public void setIsDownload(boolean isDownload) {
		this.isDownload = isDownload;
	}

}
