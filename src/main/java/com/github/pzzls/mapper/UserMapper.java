package com.github.pzzls.mapper;

import com.github.pzzls.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Copyright (C) 2017 mosl, Inc.
 * <p>内容摘要： </p>
 * <p>其他说明： </p>
 *
 * @author <a> href="mailto:moshenglei@icloud.com">mosl</a>
 * @since 2017/2/16 下午3:53
 */
public interface UserMapper {

    @Select("SELECT * FROM sys_users WHERE id = #{userId}")
    User getUser(@Param("userId") int userId);

}
