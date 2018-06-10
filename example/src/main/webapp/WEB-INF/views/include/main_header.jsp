<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--main_header.jsp--%>
<%-- Main Header --%>
<header class="main-header">

    <%-- Logo --%>
    <a href="/" class="logo">
        <%-- mini logo for sidebar mini 50x50 pixels --%>
        <span class="logo-mini"><b>중</b>고</span>
        <%-- logo for regular state and mobile devices --%>
        <span class="logo-lg">중고나라</span>
    </a>

    <%-- Header Navbar --%>
    <nav class="navbar navbar-static-top" role="navigation">
        <%-- Sidebar toggle button--%>
        <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>
        <%-- Navbar Right Menu --%>
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <%-- User Account Menu --%>
                <li class="dropdown user user-menu">
                    <%-- Menu Toggle Button --%>
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <%-- The user image in the navbar--%>
                        <img src="/dist/img/default-user-image.jpg" class="user-image" alt="User Image">
                        <%-- hidden-xs hides the username on small devices so only the image appears. --%>
                        <span class="hidden-xs">Guest</span>
                    </a>
                    <ul class="dropdown-menu">
                        <%-- The user image in the menu --%>
                        <li class="user-header">
                            <img src="/dist/img/default-user-image.jpg" class="img-circle" alt="User Image">

                            <p>
                                Guest
                                <small>Member since Nov. 2012</small>
                            </p>
                        </li>
                        <%-- Menu Body --%>
                        <li class="user-body">
                            <div class="row">
                                <div class="col-xs-4 text-center">
                                    <a href="#">Followers</a>
                                </div>
                                <div class="col-xs-4 text-center">
                                    <a href="#">Sales</a>
                                </div>
                                <div class="col-xs-4 text-center">
                                    <a href="#">Friends</a>
                                </div>
                            </div>
                            <%-- /.row --%>
                        </li>
                        <%-- Menu Footer--%>
                        <li class="user-footer">
                            <div class="pull-left">
                                <a href="${path}/user/register" class="btn btn-default btn-flat"><i class="fa fa-user-plus"></i> 회원가입</a>
                            </div>
                            <div class="pull-right">
                                <a href="${path}/user/login" class="btn btn-default btn-flat"><i class="fa fa-sign-in"></i> 로그인</a>
                            </div>
                        </li>
                    </ul>
                </li>
                <%-- Control Sidebar Toggle Button --%>
            </ul>
        </div>
    </nav>
</header>