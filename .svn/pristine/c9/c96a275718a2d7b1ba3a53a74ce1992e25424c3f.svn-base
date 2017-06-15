<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%-- 分页处理部份,开启一个新的查询时，请调用JS函数 resetPaging()重新初始化页信息,主页面需要有doQuery(newSql)来实现查询		--%> 
<c:if test="${not empty pageInfo}">
  <input type="hidden" id="pageNum" name="pageNum" value="${pageInfo.pageNum}" />
	<input type="hidden" id="totalCount" name="totalCount" value="${pageInfo.totalCount}" />
	<div id="pageDiv" style="font-size:12px;text-align:center;margin-top:10px;">
		<span id="firstBtn" style="color:blue;cursor:pointer" onClick="firstPage()">首页</span>
		<span id="prevBtn" style="color:blue;cursor:pointer" onClick="prevPage()">上一页</span>
		<span id="nextBtn" style="color:blue;cursor:pointer" onClick="nextPage()">下一页</span>
		<span id="lastBtn" style="color:blue;cursor:pointer" onClick="lastPage()">末页</span>
		第<input type="text" id="gotoPageNum" style="width:25px"value="${pageInfo.pageNum}" />页
		<span style="color:blue;cursor:pointer" onClick="skip2Page($('#gotoPageNum').val())">跳转</span>
		共${pageInfo.totalCount}条数据，第${pageInfo.pageNum}/${pageInfo.pageCount}页
		 每页显示数据：<select id="pageSize" name="pageSize" onchange="gotoPage(1)">
		 	<option <c:if test="${pageInfo.pageSize == 10}">selected </c:if> >10</option>
		 	<option <c:if test="${pageInfo.pageSize == 20}">selected </c:if> >20</option>
		 	<option <c:if test="${pageInfo.pageSize == 50}">selected </c:if> >50</option>
		 	<option <c:if test="${pageInfo.pageSize == 100}">selected </c:if> >100</option>
		 	<option <c:if test="${pageInfo.pageSize == 200}">selected </c:if> >200</option>
		 	<option <c:if test="${pageInfo.pageSize == 500}">selected </c:if> >500</option>
		 	</select>
		</div>
<script type="text/javascript">
	var currentPageNum=${pageInfo.pageNum}; 
	function resetPaging(){
			$("#totalCount").val("-1");
			$("#pageNum").val("1");
	}
	function firstPage(){ 
		if(currentPageNum!=1)
			gotoPage(1) ;
	}
	function nextPage(){
		if(${pageInfo.totalCount}==0) 
			return;		
		var pageSize=parseInt ($("#pageSize").val());
		var lastNum=${pageInfo.totalCount}/pageSize ;
		if(currentPageNum<lastNum)
			gotoPage(currentPageNum+1) ;
	}
	function prevPage(){ 
		if(currentPageNum>1)
			gotoPage(currentPageNum-1) ;
	}
	function lastPage(){
		if(${pageInfo.totalCount}==0)
			return;		
		var pageSize=parseInt ($("#pageSize").val());
		var lastNum=${pageInfo.totalCount}/pageSize ;
		if(currentPageNum<lastNum)
			gotoPage(Math.ceil(lastNum)) ;
	}
	function gotoPage(num){
		$("#pageNum").val(num);
		doQuery(false) ;
	}

	function skip2Page(num){
		if(${pageInfo.totalCount}==0) 
			return;		
		var pageSize=parseInt ($("#pageSize").val());
		var lastNum=${pageInfo.totalCount}/pageSize ;
		lastNum=Math.ceil(lastNum) ;
		var skip=parseInt(num); 
		if(skip==currentPageNum)
			return;
		if(skip<=lastNum && skip>0)
			gotoPage(skip);
		else
			alert("没有第"+num+"页!");
	}
	function changBtnMode(){
		var pageSize=parseInt ($("#pageSize").val());
		var lastNum=${pageInfo.totalCount}/pageSize ;
		lastNum=Math.ceil(lastNum) ;
		if(${pageInfo.totalCount}==0 || lastNum<=1){ 
			$("#firstBtn").css("color","black");
			$("#prevBtn").css("color","black");
			$("#nextBtn").css("color","black"); 
			$("#lastBtn").css("color","black");
			return;
		} 					
		if(currentPageNum==1){
			$("#firstBtn").css("color","black");
			$("#prevBtn").css("color","black");
		}
		if(currentPageNum==lastNum){
			$("#nextBtn").css("color","black"); 
			$("#lastBtn").css("color","black");
		}		
	}
	changBtnMode();
</script>			
</c:if>	
