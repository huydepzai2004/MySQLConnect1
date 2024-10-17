<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách hãng xe</title>
</head>
<body>
    <h1>Danh sách hãng xe:</h1>
    <p>
        <c:forEach var="car" items="${cars}">
            ${car}<c:if test="${!car.equals(cars[cars.size() - 1])}">, </c:if>
        </c:forEach>
    </p>
</body>
</html>