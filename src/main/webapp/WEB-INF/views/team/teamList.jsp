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
					<td>${team.id}</td>
					<td>${team.stadiumId}</td>
					<td>${team.name}</td>
					<td>${team.createdAt}</td>
					<td><button id = "btnTeamDelete" type="button"  class="btn btn-outline-danger">삭제버튼</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<script>
</script>
<%@ include file="../layout/footer.jsp"%>