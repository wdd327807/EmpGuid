package com.heaven.dao;

import com.heaven.bean.VideoType;
import com.heaven.bean.VideoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Sun May 19 21:08:04 CST 2019
     */
    long countByExample(VideoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Sun May 19 21:08:04 CST 2019
     */
    int deleteByExample(VideoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Sun May 19 21:08:04 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Sun May 19 21:08:04 CST 2019
     */
    int insert(VideoType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Sun May 19 21:08:04 CST 2019
     */
    int insertSelective(VideoType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Sun May 19 21:08:04 CST 2019
     */
    List<VideoType> selectByExample(VideoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Sun May 19 21:08:04 CST 2019
     */
    VideoType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Sun May 19 21:08:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") VideoType record, @Param("example") VideoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Sun May 19 21:08:04 CST 2019
     */
    int updateByExample(@Param("record") VideoType record, @Param("example") VideoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Sun May 19 21:08:04 CST 2019
     */
    int updateByPrimaryKeySelective(VideoType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Sun May 19 21:08:04 CST 2019
     */
    int updateByPrimaryKey(VideoType record);
}