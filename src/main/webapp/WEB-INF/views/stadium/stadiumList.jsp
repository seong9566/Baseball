<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container mt-3">
	<h2>경기장 목록 보기</h2>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>경기장</th>
				<th>지역</th>
				<th>개장일</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="stadium" items="${stadiumList}">
				<tr>
					<td>${stadium.id}</td>
					<td>${stadium.name}</td>
					<td>${stadium.toarea}</td>
					<td>${stadium.createdAt}</td>
					<td><a href="/stardiumUpdateForm/${stardium.id}/${stardium.name}"><i class="fa fa-wrench"></i></a></td>
					<td><button id = "btnStadiumDelete" type="button"  class="btn btn-outline-danger">삭제버튼</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<script>
$("#btnStadiumDelete").click(()=>{
	let id = $("#id").val();
	console.log(id);
	
	$.ajax("/stadiumForm/delete",{
		type: "DELETE",
		dataType: "JSON",// 응답 타입
	}).done((res)=>{
		if(res.code ==1){
			alert("삭제 성공");
			//location.reload();
		}
		else{
			alert("삭제 실패");
		}
	});
});
</script>
<%@ include file="../layout/footer.jsp"%>