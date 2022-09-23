<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container mt-3">
	<h2>팀 목록 보기</h2>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>경기장 이름</th>
				<th>팀 이름</th>
				<th>창단일</th>
				<th>삭제</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="team" items="${teamList}">
				<tr>
					<td>${team.no}</td>
					<td>${team.stadiumName}</td>
					<td>${team.teamName}</td>
					<td>${team.createdAt}</td>
					<td><button onclick="btnTeamDelete(${team.id},this);" class="fa fa-minus">삭제</button></td>
				</tr>
			</c:forEach>
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