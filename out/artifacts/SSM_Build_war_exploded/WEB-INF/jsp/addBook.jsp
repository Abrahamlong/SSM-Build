<%--
  Created by IntelliJ IDEA.
  User: A80024
  Date: 2020/10/13
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>新增书籍</title>

    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>新增书籍</small>
                    </h1>
                </div>
            </div>
        </div>
        <%--<form action="${pageContext.request.contextPath}/book/addBook" method="post">
            书籍名称：<input type="text" name="bookName"><br><br><br>
            书籍数量：<input type="text" name="bookCounts"><br><br><br>
            书籍详情：<input type="text" name="detail"><br><br><br>
            <input type="submit" value="添加">
        </form>--%>
        <form action="${pageContext.request.contextPath}/book/addBook" method="post">
            <div class="form-group">
                <label for="bookName">书籍名称:</label>
                <input type="text" name="bookName" class="form-control" id="bookName" >
            </div>
            <div class="form-group">
                <label for="bookCounts">书籍数量:</label>
                <input type="text" name="bookCounts" class="form-control" id="bookCounts" >
            </div>
            <div class="form-group">
                <label for="detail">书籍描述:</label>
                <input type="text" name="detail" class="form-control" id="detail" >
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary ">提交</button>
            </div>

        </form>
    </div>
</body>
</html>
