
<div class="container" >
	<div class="row clearfix">
		<div class="col-md-12 column">
			<br>
			<nav class="navbar navbar-default" role="navigation" id="banner" style="width:800px;margin:0 auto;">
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="float:right;">
					<button class="btn btn-default btn-success" style="margin-top:8px;" onclick="openURL('添加信息', '/EmpGuid/manager/addGeneral')">添加</button>
				</div>
			</nav><br>
			<table class="table table-bordered table-hover" style="text-align:center;width:800px;margin:0 auto;">
				<thead>
					<tr>
						<th style="text-align:center;width:450px;">标题</th>
						<th style="text-align:center;width:150px;">来源</th>
						<th colspan="2" style="text-align:center;width:200px;">操作</th>
					</tr>
				</thead>
				<tbody>
					<#list generalList as general>
						<tr style="cursor:pointer;">
							<td>${general.title}</td>
							<td>${general.author}</td>
							<td onclick="openURL('修改信息', '/EmpGuid/manager/generDetail?id=${general.id}&page=${currentPage}')">
								<button type="button" class="btn btn-default btn-success">修改</button>
							</td>
							<td>
								<button type="button" class="btn btn-default btn-danger"  id="${general.id}" name="${currentPage}" onclick="confirm.call(this);">删除</button>
							</td>
						</tr>
					</#list>
				</tbody>
			</table>
		</div>
		<div class="col-md-12 column" style="text-align:center;">
			<ul class="pagination" style="text-align:center;">
				<#if currentPage lte 1>
					<li class=disabled><a>上一页</a></li>
				<#else>
					<li onclick="openURL('信息列表', '/EmpGuid/manager/generList?page=${currentPage-1}')"><a>上一页</a></li>
				</#if>
				<#list 1..totalPage as index>
					<#if currentPage==index>
						<li class=disabled><a>${index}</a></li>
					<#else>
						<li onclick="openURL('信息列表', '/EmpGuid/manager/generList?page=${index}')"><a>${index}</a></li>
					</#if>
				</#list>
				<#if currentPage gte totalPage>
					<li class="disabled"><a>下一页</a></li>
				<#else>
					<li onclick="openURL('信息列表', '/EmpGuid/manager/generList?page=${currentPage+1}')"><a>下一页</a></li>
				</#if>
			</ul>
		</div>
	</div>
</div>
<script>
	function confirm(){
		var oid = $(this).attr("id");
		var ocp = $(this).attr("name");
		var url = '/EmpGuid/manager/deleteGener?id='+oid+'&page='+ocp;
		$.messager.confirm('提示信息', '确定要删除吗？', function(r){
			if (r){
				openURL('信息列表', url)
				$.messager.alert('提示信息','删除成功！','info');
			}
		});
	}
</script>