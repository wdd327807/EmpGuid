<!DOCTYPE HTML>
<html>
	<#include "header.ftl">
<body>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<#include "nav.ftl">
			<div class="carousel slide" id="carousel-845940" data-ride="carousel" data-interval="5000">
				<ol class="carousel-indicators">
					<li data-slide-to="0" data-target="#carousel-845940">
					</li>
					<li data-slide-to="1" data-target="#carousel-845940" class="active">
					</li>
					<li data-slide-to="2" data-target="#carousel-845940">
					</li>
				</ol>
				<div class="carousel-inner" id="anno_banner">
					<#list annoImgList as annoImg>
						<div class="item">
							<img style="width:100%;height:300px;" alt="" src="/EmpGuid/upload/${annoImg.image}" />
						</div>
					</#list>
				</div> <a class="left carousel-control" href="#carousel-845940" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-845940" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
			<div class="row clearfix pad" style="border:1px solid #dfdfdf;">
				<div class="col-md-8 column" style="padding:0px">
					<div class="tabbable" id="tabs-447149">
						<ul class="nav nav-tabs"  style="font-size:16px;">
							<li class="active">
								 <a href="#panel-913032" data-toggle="tab" style="color:#000;">招聘公告</a>
							</li>
							<li>
								 <a href="#panel-799133" data-toggle="tab" style="color:#000;">实习岗位</a>
							</li>
							<li>
								 <a href="#panel-799134" data-toggle="tab" style="color:#000;">企业招聘</a>
							</li>
							<li>
								 <a href="#panel-799135" data-toggle="tab" style="color:#000;">校园招聘</a>
							</li>
							<li>
								 <a href="#panel-799136" data-toggle="tab" style="color:#000;">招聘简章</a>
							</li>
						</ul>
						<div class="tab-content">
							<div class="tab-pane active" id="panel-913032">
								<div class="panel panel-default">
									<div class="panel-body" style="padding:20px;height:356px;" style="overflow:hidden;">
										<table class="table table-hover table-striped">
											<tbody style="font-size:14px;">
												<#list announcementList as announcement>
													<#if announcement.recruidId==1>
														<tr style="cursor: pointer;" onclick="location.href='/EmpGuid/recruit/recruitDetails?recruitName=招聘公告&id='+${announcement.id};">
															<td>${announcement.name}</td>
															<td style="text-align:right;">${announcement.date?string('yyyy-MM-dd')}</td>
														</tr>
													</#if>
												</#list>
											</tbody>
										</table>
									</div>
									<div class="panel-footer" style="height:55px;">
										<a href="/EmpGuid/recruit/more?recruidId=1&recruitName=招聘公告" class="more" style="font-size:14px;">More</a>
									</div>
								</div>
							</div>
							<div class="tab-pane" id="panel-799133">
								<div class="panel panel-default">
									<div class="panel-body" style="padding:20px;height:356px;">
										<table class="table table-hover table-striped">
											<tbody style="font-size:14px;">
												<#list announcementList as announcement>
													<#if announcement.recruidId==2>
														<tr style="cursor: pointer;" onclick="location.href='/EmpGuid/recruit/recruitDetails?recruitName=实习岗位&id='+${announcement.id};">
															<td>${announcement.name}</td>
															<td style="text-align:right;">${announcement.date?string('yyyy-MM-dd')}</td>
														</tr>
													</#if>
												</#list>
											</tbody>
										</table>
									</div>
									<div class="panel-footer" style="height:55px;">
										<a href="/EmpGuid/recruit/more?recruidId=2&recruitName=实习岗位" class="more">More</a>
									</div>
								</div>
							</div>
							<div class="tab-pane" id="panel-799134">
								<div class="panel panel-default">
									<div class="panel-body" style="padding:20px;height:356px;">
										<table class="table table-hover table-striped">
											<tbody style="font-size:14px;">
												<#list announcementList as announcement>
													<#if announcement.recruidId==3>
														<tr style="cursor: pointer;" onclick="location.href='/EmpGuid/recruit/recruitDetails?recruitName=企业招聘&id='+${announcement.id};">
															<td>${announcement.name}</td>
															<td style="text-align:right;">${announcement.date?string('yyyy-MM-dd')}</td>
														</tr>
													</#if>
												</#list>
											</tbody>
										</table>
									</div>
									<div class="panel-footer" style="height:55px;">
										<a href="/EmpGuid/recruit/more?recruidId=3&recruitName=企业招聘" class="more">More</a>
									</div>
								</div>
							</div>
							<div class="tab-pane" id="panel-799135">
								<div class="panel panel-default">
									<div class="panel-body" style="padding:20px;height:356px;">
										<table class="table table-hover table-striped">
											<tbody style="font-size:14px;">
												<#list announcementList as announcement>
													<#if announcement.recruidId==4>
														<tr style="cursor: pointer;" onclick="location.href='/EmpGuid/recruit/recruitDetails?recruitName=校园招聘&id='+${announcement.id};">
															<td>${announcement.name}</td>
															<td style="text-align:right;">${announcement.date?string('yyyy-MM-dd')}</td>
														</tr>
													</#if>
												</#list>
											</tbody>
										</table>
									</div>
									<div class="panel-footer" style="height:55px;">
										<a href="/EmpGuid/recruit/more?recruidId=4&recruitName=校园招聘" class="more">More</a>
									</div>
								</div>
							</div>
							<div class="tab-pane" id="panel-799136">
								<div class="panel panel-default">
									<div class="panel-body" style="padding:20px;height:356px;">
										<table class="table table-hover table-striped">
											<tbody style="font-size:14px;">
												<#list announcementList as announcement>
													<#if announcement.recruidId=5>
														<tr style="cursor: pointer;" onclick="location.href='/EmpGuid/recruit/recruitDetails?recruitName=招聘简章&id='+${announcement.id};">
															<td>${announcement.name}</td>
															<td style="text-align:right;">${announcement.date?string('yyyy-MM-dd')}</td>
														</tr>
													</#if>
												</#list>
											</tbody>
										</table>
									</div>
									<div class="panel-footer" style="height:55px;">
										<a href="/EmpGuid/recruit/more?recruidId=5&recruitName=招聘简章" class="more">More</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4 column" style="padding:0px">
					<div class="list-group" style="width:391px;">
						<a class="list-group-item active" style="font-size:16px"><img style="margin-top:-4px" width="16px" height="16px" alt="120x120" src="https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1553582202&di=66e657704a4877cd1ab38b6613c01893&src=http://pic.51yuansu.com/pic3/cover/02/80/87/5a4df52111c0c_610.jpg" />&nbsp日历</a>
						<div class="list-group-item" style="padding:0px">
							<div id="cc" class="easyui-calendar" style="width:390px;height:413px;"></div> 
						</div>
					</div> 
				</div>
			</div>
		</div>
		<div class="col-md-8 column" style="margin-top:20px;border:1px solid #dfdfdf;height:485px;padding:0px">
			<nav class="navbar navbar-default" role="navigation" >
				<div class="navbar-header">
					 <span class="navbar-brand" style="font-size:16px">校园宣讲会</span>
				</div>
			</nav>
			<div class="panel panel-default">
				<div class="panel-body" style="padding:20px;height:359px;">
					<table class="table table-hover table-striped">
						<tbody style="font-size:14px;">
							<#list generalList as general>
								<tr style="cursor: pointer;" onclick="location.href='/EmpGuid/recruit/generalDetails?id='+${general.id};">
									<td>${general.title}</td>
									<td style="text-align:right;">${general.date?string('yyyy-MM-dd')}</td>
								</tr>
							</#list>
						</tbody>
					</table>
				</div>
				<div class="panel-footer" style="height:55px;">
					<a href="/EmpGuid/recruit/generalMore" class="general_more" style="font-size:14px;">More</a>
				</div>
			</div>
		</div>
		<div class="col-md-4 column" style="margin-top:20px;border:1px solid #dfdfdf;height:485px;padding:0px">
			<div class="carousel slide" id="carousel-623013" data-ride="carousel" data-interval="5000">
				<ol class="carousel-indicators">
					<li data-slide-to="0" data-target="#carousel-623013">
					</li>
					<li data-slide-to="1" data-target="#carousel-623013" class="active">
					</li>
					<li data-slide-to="2" data-target="#carousel-623013">
					</li>
				</ol>
				<div class="carousel-inner" id="gen_banner">
					<#list genImgList as genImg>
						<div class="item">
							<img alt="" style="height:485px;width:100%;" src="/EmpGuid/upload/${genImg.image}" />
						</div>
					</#list>
				</div> <a class="left carousel-control" href="#carousel-623013" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-623013" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
	</div>
</div>
<#include "footer.ftl">
<#include "login_form.ftl">
<script type="text/javascript" src="/EmpGuid/js/index.js"></script>
</body>
</html>