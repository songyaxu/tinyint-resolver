# tinyint-resolver

#### 介绍
Mybatis-Generator 中 byte转int的类型转换器

#### 使用
配置文件指定以下内容

本项目已经同步到maven中央仓库 


```
<dependency>
    <groupId>com.us-forever</groupId>
    <artifactId>tinyint-resolver</artifactId>
    <version>1.0</version>
</dependency>
```


``` xml
<javaTypeResolver type="org.songyaxu.util.TinyIntResolver">
    <property name="forceBigDecimals" value="false"/>
</javaTypeResolver>
```
#### maven配置
``` xml
<plugin>
    <groupId>org.mybatis.generator</groupId>
    <artifactId>mybatis-generator-maven-plugin</artifactId>
    <version>1.3.5</version>
    <configuration>
        <configurationFile>src/test/resources/generatorConfig.xml</configurationFile>
        <overwrite>true</overwrite>
    </configuration>
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>${mysql-connector-java.version}</version>
        </dependency>
        <dependency>
            <groupId>com.us-forever</groupId>
            <artifactId>tinyint-resolver</artifactId>
            <version>1.0</version>
        </dependency>
    </dependencies>
</plugin>
```
