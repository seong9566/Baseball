<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container mt-3">
	<h2>포지션별 팀의 야구 선수 페이지</h2>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>포지션</th>
				<th>롯데</th>
				<th>두산</th>
				<th>KT위즈</th>
			</tr>
		</thead>

		<tbody>
				<tr>
					<c:forEach var="stat" items="${stats}">
						<tr>
							<td>${stat.position}</td>
							<td>${stat.doosan}</td>
							<td>${stat.nc}</td>
							<td>${stat.lotte}</td>
						</tr>
					</c:forEach>
				</tr>
		</tbody>
	</table>
</div>
<script>
function btnTeamDelete(id,obj){
	//해당 행 삭제
	let tr = $(obj).parent().parent();
	
	let data = {
			id : id
	}
	console.log(data);
	$.ajax("/deleteTeam",{
		type: "DELETE",
		data: data,
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		dataType: "JSON" 
	}).done((res)=>{
		if(res.code == 1){
		console.log(res);
		tr.remove();
		alert("성공");
		}
		else{
		alert("실패");
		}
	});
}
</script>
<%@ include file="../layout/footer.jsp"%>