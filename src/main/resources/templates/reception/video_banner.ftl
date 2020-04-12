<div style="width:200px;height:400px;float:left;">
	<ul class="left_banner" id="left_banner">
		<li class="act">前沿/区块链/人工智能</li>
		<li>前端/小程序/JS</li>
		<li>后端/Java/Python</li>
		<li>移动/Android/IOS</li>
		<li>数据库/MySQL/Oracle</li>
	</ul>
</div>
<#list tecTypeVOList as tecTypeVO>
	<div class="tab">
		<div style="width:940px;height:200px;margin:0;">
			<h5 style="color:red;padding:10px;">${tecTypeVO.typeName}</h5><hr>
			<ul class="tec_category">
				<#list tecTypeVO.videoTypeVOs as videoTypeList>
					<a style="color:#000;" href="/EmpGuid/study/showVideosByType?typeId=${videoTypeList.id}"><li style="cursor:pointer;">${videoTypeList.typeName}</li></a>
				</#list>
			</ul>
		</div>
		<div style="width:940px;height:200px;background-color:#F0F0F0;">
			<div class="col-md-12 column" style="margin:40px auto;overflow:hidden;">
				<#list tecTypeVO.videoTypeVOs as videoTypeRandom2>
					<#list videoTypeRandom2.videoVOs as videoRandom2>
						<div class="col-md-6 column" style="height:150px;">
							<div class="media">
								 <a href="/EmpGuid/study/showVideoDetails?id=${videoRandom2.id}" class="pull-left"><img width="90" height="90" src="/EmpGuid/upload/${videoRandom2.image}" class="media-object" alt='' /></a>
								<div class="media-body">
									<h5 class="media-heading"><strong>${videoRandom2.title}</strong></h5>
									<h6 style="text-indent:2em;line-height:18px;">${videoRandom2.description}</h6>
								</div>
							</div>
						</div>
					</#list>
				</#list>	
			</div>
		</div>
	</div>
</#list>