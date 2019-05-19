package com.heaven.bean;

import java.util.Date;

public class Notes {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notes.id
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notes.title
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notes.author
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notes.date
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notes.content
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notes.id
     *
     * @return the value of notes.id
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notes.id
     *
     * @param id the value for notes.id
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notes.title
     *
     * @return the value of notes.title
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notes.title
     *
     * @param title the value for notes.title
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notes.author
     *
     * @return the value of notes.author
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notes.author
     *
     * @param author the value for notes.author
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notes.date
     *
     * @return the value of notes.date
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notes.date
     *
     * @param date the value for notes.date
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notes.content
     *
     * @return the value of notes.content
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notes.content
     *
     * @param content the value for notes.content
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

	@Override
	public String toString() {
		return "Notes [id=" + id + ", title=" + title + ", author=" + author + ", date=" + date + ", content=" + content
				+ "]";
	}
    
}