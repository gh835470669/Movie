<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%-- 提示信息 --%>  
<div id="tipsDialog" >
<div style="border:1px solid #4e7dcc;width:280px;font-size:12px;background-color:#ebebeb;">
		<div style="margin-left:50px;_margin-left:25px;margin-top:15px;">
			<div style="float:left;"><img src="images/loading.gif" width="28" height="28"></div>
			<div style="float:left;margin-top:5px;margin-left:5px;">正在执行查询，请稍候。。。</div>
			<div style="clear:both"></div>
		</div>
	  <p style="margin-left:120px;_margin-left:60px;margin-top:10px;margin-bottom:10px;">
	    <input type="button" id="closeTipsBt" onClick="closeTipsDialog()" value="关闭" />
	  </p>
</div>
</div>
				
<script type="text/javascript">		
	$(function() {
		initTipsDialog();
	});	
	function initTipsDialog() {
		$('#tipsDialog').dialog({
			width: 305,
			height: 140,
			autoOpen: false,
			draggable: true,
			resizable: true,
			title: '提示信息',
			modal: true ,
			overlay: { opacity: 0.5, background: "black" }
		});	
	};		
	function openTipsDialog() {
		$('#tipsDialog').dialog('open');
	}
	
	function closeTipsDialog(){
		$('#tipsDialog').dialog('close');
	}	
</script>