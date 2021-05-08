2021.5.7 11:15

使用IDEA搭建SpringBoot + MyBatis方式：

1.File -> New -> Project...

2.Spring lnitializr

3.Default -> Next -> Next

4.选择最基本的MySQL驱动和MyBatis框架 -> Next

5.Finish

6.把Application启动文件移动到最外层（如：com.example下）

7.在application.yml文件中配置：
    spring:
        datasource:
    MyBatis:

8.先创建domian包或者pojo包，创建对应数据库表的映射对象

9.创建dao包，创建dao接口

10.创建mapper文件夹，存放***Mapper.xml文件

11.可以在src\test包下直接测试dao接口是否正常运行

12.可以直接使用IDEA的Maven工具清理，编译，打包SpringBoot程序