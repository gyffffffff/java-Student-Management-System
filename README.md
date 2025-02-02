# Java Web全栈开发：学生管理系统

## 技术栈
- **前端**: Vue.js
- **后端**: Spring Boot
- **持久层**: MyBatis
- **数据库**: Oracle
- **认证**: JWT (JSON Web Token)

## 项目概述(文件组成)
**该项目是我在2023年实习期间开发的单体架构下的学生管理系统。系统主要功能包括用户登录注册、权限管理、课程管理等。**  
1. **stu.zip：在idea中编写的所有java代码 (安装插件：MybatisX)**
2. **stu_table创建.zip：在Oracle数据库中创建表格的sql语句**
3. **vue.zip：在vscode中编写的所有vue框架代码 (前端)**

### 主要功能模块
- **登录注册与验证码**
  - 用户可以通过注册页面进行账号注册，并通过验证码验证。
  - 注册时设置权限：
    - 开头数字为1：学生
    - 开头数字为2：root
    - 开头数字为3：老师
  - 数据库中的`stu_table`已预先注册了部分用户（包括部分学生、老师和2个root用户）。

- **不同权限下的功能**
  - **学生权限**：
    - 选课、查看课程、学院及对应老师信息。
  - **教师权限**：
    - 查看学院、老师及学生信息，并对课程进行增删改查操作。
  - **Root权限**：
    - 对所有数据进行增删改查操作。

## 学习资源推荐
在开始这个项目之前，建议先学习以下视频教程，以帮助你更好地理解相关技术栈：

1. **Oracle数据库精讲**
   - [黑马程序员Oracle数据库精讲](https://www.bilibili.com/video/BV1KJ411h7NH/?spm_id_from=333.1387.favlist.content.click&vd_source=827d9840a5531e9c9eef6c36f1ecdfb5)
   - 从零开始学习Oracle数据库，掌握其基本操作与高级特性。

2. **JavaWeb开发全流程**
   - [黑马程序员JavaWeb开发教程](https://www.bilibili.com/video/BV1m84y1w7Tb/?spm_id_from=333.1387.favlist.content.click&vd_source=827d9840a5531e9c9eef6c36f1ecdfb5)
   - 全面介绍JavaWeb开发流程，适合企业级应用开发。

3. **Vue基础入门到实战项目**
   - [前端最新Vue2+Vue3基础入门到实战项目全套教程](https://www.bilibili.com/video/BV1HV4y1a7n4/?spm_id_from=333.1387.favlist.content.click&vd_source=827d9840a5531e9c9eef6c36f1ecdfb5)
   - 涵盖Vue2和Vue3的基础知识以及实际项目开发案例。

