package com.usforever.util;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

/**
 * @author us-forever
 * @version 1.0
 * @description
 * @date 2023/4/4 18:14
 */
public class TinyIntResolver extends JavaTypeResolverDefaultImpl {

    public TinyIntResolver() {
        super();
        typeMap.put(-6, new JavaTypeResolverDefaultImpl.JdbcTypeInformation("TINYINT", new FullyQualifiedJavaType(Integer.class.getName())));
    }
}
