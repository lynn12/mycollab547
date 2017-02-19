/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.user.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.user.domain.Group;
import com.mycollab.module.user.domain.GroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface GroupMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    long countByExample(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    int deleteByExample(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    int insert(Group record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    int insertSelective(Group record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    List<Group> selectByExampleWithBLOBs(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    List<Group> selectByExample(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    Group selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    int updateByExampleSelective(@Param("record") Group record, @Param("example") GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    int updateByExampleWithBLOBs(@Param("record") Group record, @Param("example") GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    int updateByExample(@Param("record") Group record, @Param("example") GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    int updateByPrimaryKeySelective(Group record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    int updateByPrimaryKeyWithBLOBs(Group record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    int updateByPrimaryKey(Group record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    Integer insertAndReturnKey(Group value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Sun Dec 25 21:29:52 ICT 2016
     */
    void massUpdateWithSession(@Param("record") Group record, @Param("primaryKeys") List primaryKeys);
}