# maven-scafflod

这是一个maven脚手架，采用最常用的子模块设计架构。

## module

- user
- util

## feature

- 在父工程中声明公共依赖，以及声明子模块允许使用的依赖
- 子模块继承公共依赖，并按需使用父模块中允许使用的依赖
- user模块引用本地公共工具模块util
