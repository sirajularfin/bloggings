package com.blog.files.entities;

public class Message {

    private String content;
    private String iconType;
    private String cssClass;

    public Message(String content, String iconType, String cssClass) {
	super();
	this.content = content;
	this.iconType = iconType;
	this.cssClass = cssClass;
    }

    public String getContent() {
	return content;
    }

    public void setContent(String content) {
	this.content = content;
    }

    public String getIconType() {
	return iconType;
    }

    public void setIconType(String iconType) {
	this.iconType = iconType;
    }

    public String getCssClass() {
	return cssClass;
    }

    public void setCssClass(String cssClass) {
	this.cssClass = cssClass;
    }

}
