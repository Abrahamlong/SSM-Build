<%--
  Created by IntelliJ IDEA.
  User: A80024
  Date: 2020/10/13
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>

    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <%--前端传递隐藏域 Id--%>
        <input type="hidden" name="bookID" value="${book.bookID}">
        <div class="form-group">
            <label for="bookName">书籍名称:</label>
            <input type="text" name="bookName" class="form-control" id="bookName" value="${book.bookName}">
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量:</label>
            <input type="text" name="bookCounts" class="form-control" id="bookCounts" value="${book.bookCounts}">
        </div>
        <div class="form-group">
            <label for="detail">书籍描述:</label>
            <input type="text" name="detail" class="form-control" id="detail" value="${book.detail}">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary ">提交</button>
        </div>

    </form>
</div>
</body>
</html>
