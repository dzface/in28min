
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>
            To do list
        </title>
    </head>
    <body>
        <div>Welcome ${name}</div>
        <div>Your to do list</div>
        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>description</th>
                    <th>target date</th>
                    <th>done</th>
                </tr>

            </thead>
            <tbody>
                <c:forEach items="${list}" var = "item">
                <tr>
                <td>${item.id}</td>
                <td>${item.description}</td>
                <td>${item.targetDate}</td>
                <td>${item.done}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>