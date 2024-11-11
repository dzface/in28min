<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title>Add to do lista</title>
    </head>
    <body>
        <div class="container">
            <h1>Enter Todo Details</h1>
            <form:form method="post" class="form" modelAttribute="todoList">
                Description : <form:input type="text" name="description" required="required" path="description"/><br>
                <form:input type="hidden" path="id"/>
                <form:input type="hidden" path="done"/>
                <input type="submit" class="btn btn-success"></input>

            </form:form>
        </div>
            <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
            <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>