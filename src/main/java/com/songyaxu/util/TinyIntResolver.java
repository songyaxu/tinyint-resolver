package com.songyaxu.util;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

/**
 * @author yaxuSong
 * @version 1.0
 * @description
 * @date 2023/4/4 18:14
 */
public class TinyIntResolver extends JavaTypeResolverDefaultImpl {

    public TinyIntResolver() {
        super();
        typeMap.put(-6, new JavaTypeResolverDefaultImpl.JdbcTypeInformation("TINYINT", new FullyQualifiedJavaType(Integer.class.getName()))); // 当类型为TINYINT时，则生成的Java类型为Integer
    }

    public static void main(String[] args) {
        TinyIntResolver tinyIntResolver = new TinyIntResolver();

    }
}
