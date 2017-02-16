package com.github.pzzls.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2017 mosl, Inc.
 * <p>内容摘要： </p>
 * <p>其他说明： </p>
 *
 * @author <a> href="mailto:moshenglei@icloud.com">mosl</a>
 * @since 2017/2/16 下午1:03
 */
public class MyRealm extends AuthorizingRealm {

    //认证方法
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String userId = (String) principals.getPrimaryPrincipal();
        List<String> permission = new ArrayList<String>();
        //模拟从数据库中取得的权限信息
        permission.add("user:query");
        permission.add("user:update");
        permission.add("user:commit");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permission);
        return info;
    }

    //授权方法
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userId = (String) token.getPrincipal();
        System.out.println(userId);
        //模拟从数据库取得的信息
        String password = "123456";
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userId, password, getName());
        return info;
    }
}
