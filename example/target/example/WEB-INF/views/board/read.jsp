<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>

<html>

<%--head.jsp--%>
<%@ include file="../include/head.jsp" %>

<body class="hold-transition skin-blue sidebar-mini layout-boxed">
<div class="wrapper">

    <%--main_header.jsp--%>
    <%-- Main Header --%>
    <%@ include file="../include/main_header.jsp" %>

    <%--left_column.jsp--%>
    <%-- Left side column. contains the logo and sidebar --%>
    <%@ include file="../include/left_column.jsp" %>

    <%-- Content Wrapper. Contains page content --%>
    <div class="content-wrapper">
        <%-- Content Header (Page header) --%>
        <section class="content-header">
            <h1>
                중고 게시판
                <small>상품 조회</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 중고 게시판</a></li>
                <li class="active">상품 조회</li>
            </ol>
        </section>

        <%-- Main content --%>
        <section class="content container-fluid">

            <div class="col-lg-12">

                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h3 class="box-title">제목 : ${boardVO.title}</h3>
                        <ul class="list-inline pull-right">
                            <li><a href="#" class="link-black text-lg"><i class="fa fa-share margin-r-5"></i>게시글 공유</a></li>
                            <li><a href="#" class="link-black text-lg"><i class="fa fa-bookmark margin-r-5"></i>게시글 북마크</a></li>
                            <li><a href="#" class="link-black text-lg"><i class="fa fa-thumbs-o-up margin-r-5"></i>게시글 추천(0)</a></li>
                        </ul>
                    </div>
                    <div class="box-header with-border">
                        <h3 class="box-title">가격 : ${boardVO.price}</h3>
                    </div>
                    <div class="box-header with-border">
                        <h3 class="box-title">판매자 연락처 : ${boardVO.contact}</h3>
                    </div>
                    <form role="form" method="post">
                        <input type="hidden" name="bno" value="${boardVO.bno}">
                    </form>
                    <div class="box-body" style="height: 600px">
                        <p>
                            ${boardVO.content}
                        </p>
                    </div>
                    <div class="box-footer">
                        <div class="user-block">
                            <img class="img-circle img-bordered-sm" src="/dist/img/default-user-image.jpg" alt="user image">
                            <span class="username">
                                <a href="#">${boardVO.writer}</a>
                            </span>
                            <span class="description"><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardVO.regdate}"/></span>
                        </div>
                    </div>
                </div>

                <%--버튼 영역--%>
                <div>
                    <button type="submit" class="btn btn-primary listBtn"><i class="fa fa-list"></i> 목록</button>
                    <c:if test="${login.uid == boardVO.writer}">
                        <div class="pull-right">
                            <button type="submit" class="btn btn-warning modBtn"><i class="fa fa-edit"></i> 수정</button>
                            <button type="submit" class="btn btn-danger delBtn"><i class="fa fa-trash"></i> 삭제</button>
                        </div>
                    </c:if>
                </div>
                <br/>
            </div>

        </section>
        <%-- /.content --%>
    </div>
    <%-- /.content-wrapper --%>

    <%--main_footer.jsp--%>
    <%-- Main Footer --%>
    <%@ include file="../include/main_footer.jsp" %>

</div>
<%-- ./wrapper --%>

<%--plugin_js.jsp--%>
<%@ include file="../include/plugin_js.jsp" %>
<script>
    $(document).ready(function () {
        var formObj = $("form[role='form']");
        console.log(formObj);
        // 수정버튼 클릭시
        $(".modBtn").on("click", function () {
            formObj.attr("action", "/board/modify");
            formObj.attr("method", "get");
            formObj.submit();
        });
        // 삭제 버튼 클릭시
        $(".delBtn").on("click", function () {
            formObj.attr("action", "/board/remove");
            formObj.submit();
        });
        // 목록 버튼 클릭시
        $(".listBtn").on("click", function () {
            self.location = "/board/listAll";
        });
        // 수정완료시
        var result = "${msg}";
        if (result == "MODIFY") {
            alert("게시글이 수정되었습니다.");
        }
    })
</script>
</body>
</html>