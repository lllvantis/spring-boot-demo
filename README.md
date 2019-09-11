# Spring Boot 使用示例

* domain, interface, service implementation 和 controller 拆分

    可以将接口通过 interface 更简单地暴露对外

* Properties-AutoConfiguration/Configuration 的使用

    AutoConfiguration 使用 Properties 拼装 Bean 并指定生效的条件 (如: `@ConditionalOnMissingBean` 等注解)
    在 AutoConfiguration 的基础上 再根据需要添加 Configuration 覆盖自动配置

