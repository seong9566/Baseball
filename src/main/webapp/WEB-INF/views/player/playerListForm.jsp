<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container mt-3">
	<h2>선수 목록 보기 페이지</h2>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>팀이름</th>
				<th>포지션</th>
				<th>선수이름</th>
				<th>등록일</th>
				<th>퇴출</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="playerList" items="${playerList}">
				<tr>
					<td>${playerList.no}</td>
					<td>${playerList.teamName}</td>
					<td>${playerList.position}</td>
					<td>${playerList.name}</td>
					<td>${playerList.createdAt}</td>
					<td><button onclick="btndeletePlayer(${playerList.id},this);" class="fa fa-minus">삭제</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<script>
function btndeleteStadium(id,obj){
	//해당 행 삭제
	let tr = $(obj).parent().parent();
	
	let data = {
			id : id
	}
	console.log(data);
	$.ajax("/stadiumList/delete",{
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