<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head><title>Spring Pizza</title></head>
  
  <body>
		<h2>Delivery Unavailable</h2>
		
		<p>The address is outside of our delivery area. The order
		may still be taken for carry-out.</p>
		
		<![CDATA[
        <a href="${flowExecutionUrl}&_eventId=accept">Continue, I will pick up the order.</a>
        <a href="${flowExecutionUrl}&_eventId=cancel">Never mind.</a>
        ]]>
  </body>
</html>