<%@page import="java.util.concurrent.TimeUnit"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  

<s:set scope="request" var="waktu" value="time"/> 

<%
	java.lang.Long time = (java.lang.Long) request.getAttribute("waktu");
%>

<s:include value="index.jsp"></s:include>  

<center>
<table>
  <tr>
    <th>Hasil</th>
    <th>Satuan</th>
  </tr>
  <tr>
    <td> <s:property value="time"></s:property></td>
    <td>NanoSeconds</td>
  </tr>
  <tr>
    <td><% out.print(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS)); %></td>
    <td>MilliSeconds</td>
  </tr>
  <tr>
    <td><% out.print(TimeUnit.SECONDS.convert(time, TimeUnit.NANOSECONDS)); %></td>
    <td>Seconds</td>
  </tr>
</table>
</center>