<%@ taglib  uri="/struts-tags" prefix="s"%>  
<%@ taglib uri="/struts-dojo-tags" prefix="d"%>  

<html>
<head>  
<STYLE type="text/css">  
.errorMessage{color:red;}  
</STYLE>  
<d:head/>
</head>  
<body>
<marquee>Tugas Sorting by Steven Gunanto and Johan Prasetio</marquee>  

<s:form action="sorting">  
<s:label value="1.Bubble Sort"/>
<s:label value="2.Insertion Sort"/>
<s:label value="3.Quick Sort"/>
<s:label value="4.Select Sort"/>
<s:radio list="{'ribuan','sepuluh-ribuan','ratus-ribuan','jutaan','sepuluhjuta'}" name="tempat" value="'ribuan'"></s:radio> 
<s:textfield name="tipeSorting" label="Nomer"></s:textfield>    
<d:submit validate="true" value="Sort">
</d:submit>
  
</s:form>  	

</body>
</html>

