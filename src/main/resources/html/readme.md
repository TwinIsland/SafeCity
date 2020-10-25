## 模板
[template](template)文件里里面有模板自带的属性及元素用法

## 规则
> 每个html文件

**header:**
```html
   <head>
       <!-- basic -->
       <meta charset="utf-8">
       <meta http-equiv="X-UA-Compatible" content="IE=edge">
       <!-- mobile metas -->
       <meta name="viewport" content="width=device-width, initial-scale=1">
       <meta name="viewport" content="initial-scale=1, maximum-scale=1">
       <!-- site metas -->
       <title>城市园林病虫害防治管理系统 CPPMS</title>
       <meta name="keywords" content="">
       <meta name="description" content="">
       <meta name="author" content="">
       <!-- bootstrap css -->
       <link rel="stylesheet" href="css/bootstrap.min.css">
       <!-- style css -->
       <link rel="stylesheet" href="css/style.css">
       <!-- Responsive-->
       <link rel="stylesheet" href="css/responsive.css">
       <!-- fevicon -->
       <link rel="icon" href="images/icon.png" type="image/gif" />
       <!-- Scrollbar Custom CSS -->
       <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
       <!-- Tweaks for older IEs-->
       <!--[if lt IE 9]>
       <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
       <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
    </head>
```
**body:**
```html
<!-- loader 模组，目前有bug，加上后加载速度变慢
      <div class="loader_bg">
         <div class="loader"><img src="images/loading.gif" alt="" /></div>
      </div>
-->
      <!-- end loader -->
      <!-- header -->
      <header>
         <!-- header inner -->
         <div class="container-fluid">
            <div class="row">
               <div class="col-lg-3 logo_section">
                  <div class="full">
                     <div class="center-desk">
                        <div class="logo"> <a href="index.html"><img src="images/logo.png" alt="#"></a> </div>
                     </div>
                  </div>
               </div>
               <div class="col-lg-9">
                  <div class="menu-area">
                     <div class="limit-box">
                        <nav class="main-menu">
                           <ul class="menu-area-main">
                              <li class="active">
                                 <a href="index.html">首页</a>
                              </li>
                              <li>
                                 <a href="event.html">灾情检索</a>
                              </li>
                              <li>
                                 <a href="chara.html">人员检索</a>
                              </li>
                              <li>
                                 <a href="info.html">资料检索</a> <!--虫/鼠害...害信息查询-->
                              </li>
                              <!--登录后隐藏-->
                              <li id="login">
                                 <a href="login.html">登录</a>
                              </li>
                              <!--登录后隐藏-->
                              <li id="register">
                                 <a href="register.html">注册</a>
                              </li>
                              <!--未登录时隐藏-->
                              <li id="logout">
                                 <a href="#">登出</a>
                              </li>
                              <!--未登录时隐藏-->
                              <li id="dashboard">
                                 <a href="dashboard.html">仪表盘</a>
                              </li>
                           </ul>
                        </nav>
                     </div>
                  </div>
               </div>
            </div>
         </div>
         <!-- end header inner -->
      </header>
```
**footer + script引入:**
```html
      <div class="cpy">
         <div class="container">
            <div class="row">
               <div class="col-md-12">
                  <p>Copyright © 2020 Design by JMG 20200722 Group 2</p>
               </div>
            </div>
         </div>
      </div>
      <!-- end footer -->
      <!-- Javascript files-->
      <script src="js/jquery.min.js"></script>
      <script src="js/popper.min.js"></script>
      <script src="js/bootstrap.bundle.min.js"></script>
      <script src="js/jquery-3.0.0.min.js"></script>
      <script src="js/plugin.js"></script>
      <!-- Scrollbar Js Files -->
      <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
      <script src="js/custom.js"></script>
```
