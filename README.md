# SpringBoot+MybatisPlus多数据源配置

## pom.xml

需要在pom中加入多数据源动态切换的依赖
```xml
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>dynamic-datasource-spring-boot-starter</artifactId>
            <version>${dynamic-datasource.version}</version>
        </dependency>
```

## yml文件

```java
spring:
  datasource:
    dynamic:
      # 设置默认的数据源或者数据源组,默认值即为master,此处表示默认数据源为major数据源
      primary: major
      # 设置严格模式,默认false不启动. 启动后在未匹配到指定数据源时候会抛出异常,不启动则使用默认数据源.
      strict: false
      datasource:
        # 数据源1 自定义名字
        major:
          driver-class-name: com.mysql.cj.jdbc.Driver
          username: root
          password: root123
          url: jdbc:mysql://localhost:3306/multipile-data-source1?autoReconnect=true&allowMultiQueries=true&useUnicode=true&characterEncoding=UTF8&useSSL=false&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai
          type: com.zaxxer.hikari.HikariDataSource
        # 数据源2 自定义名字
        secondary:
          driver-class-name: com.mysql.cj.jdbc.Driver
          username: root
          password: root123
          url: jdbc:mysql://localhost:3306/multipile-data-source2?autoReconnect=true&allowMultiQueries=true&useUnicode=true&characterEncoding=UTF8&useSSL=false&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai
          type: com.zaxxer.hikari.HikariDataSource
      hikari:
        minimum-idle: 10
        connection-timeout: 2000
        maximum-pool-size: 20
        auto-commit: true
        data-source-properties:
          cachePrepStmts: true
          prepStmtCacheSize: 250
          prepStmtCacheSqlLimit: 2048
          useServerPrepStmts: true
        max-lifetime: 570000
        idle-timeout: 500000
```

## @DS注解
@DS注解既可以用在类上，也可以用在方法上，方法上的优先级大于类上的优先级。

@DS("major")表示yml文件中配置的数据源1 major

@DS("secondary")表示yml文件中配置的数据源2 secondary

本项目参考文档[https://zhuanlan.zhihu.com/p/344986030]
