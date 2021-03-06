package com.heaven.dao;

import com.heaven.bean.Notes;
import com.heaven.bean.NotesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    long countByExample(NotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    int deleteByExample(NotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    int insert(Notes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    int insertSelective(Notes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    List<Notes> selectByExampleWithBLOBs(NotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    List<Notes> selectByExample(NotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    Notes selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    int updateByExampleSelective(@Param("record") Notes record, @Param("example") NotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Notes record, @Param("example") NotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    int updateByExample(@Param("record") Notes record, @Param("example") NotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    int updateByPrimaryKeySelective(Notes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Notes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notes
     *
     * @mbg.generated Thu May 09 23:50:36 CST 2019
     */
    int updateByPrimaryKey(Notes record);
}