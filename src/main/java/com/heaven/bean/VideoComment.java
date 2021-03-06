package com.heaven.bean;

import java.util.Date;

public class VideoComment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_comment.id
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_comment.content
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_comment.date
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_comment.username
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_comment.video_id
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    private Integer videoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_comment.user_id
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_comment.id
     *
     * @return the value of video_comment.id
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_comment.id
     *
     * @param id the value for video_comment.id
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_comment.content
     *
     * @return the value of video_comment.content
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_comment.content
     *
     * @param content the value for video_comment.content
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_comment.date
     *
     * @return the value of video_comment.date
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_comment.date
     *
     * @param date the value for video_comment.date
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_comment.username
     *
     * @return the value of video_comment.username
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_comment.username
     *
     * @param username the value for video_comment.username
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_comment.video_id
     *
     * @return the value of video_comment.video_id
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    public Integer getVideoId() {
        return videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_comment.video_id
     *
     * @param videoId the value for video_comment.video_id
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_comment.user_id
     *
     * @return the value of video_comment.user_id
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_comment.user_id
     *
     * @param userId the value for video_comment.user_id
     *
     * @mbg.generated Wed May 22 21:49:27 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

	@Override
	public String toString() {
		return "VideoComment [id=" + id + ", content=" + content + ", date=" + date + ", username=" + username
				+ ", videoId=" + videoId + ", userId=" + userId + "]";
	}
    
}