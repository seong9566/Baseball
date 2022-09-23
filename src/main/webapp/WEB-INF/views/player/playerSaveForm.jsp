<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container mt-3">
	<form>
		<h2>선수 등록 페이지</h2>
		<div class="input-group mb-5">
			<select class = "form-select" name="team">
				<c:forEach var="team" items="${team}">
					<option value="${team.id}">${team.name}</option>
				</c:forEach>
			</select> 
			선수 포지션 : <input id="position"type="text" name="name" class="form-control"/>
			선수 이름 : <input id="name"type="text" name="name" class="form-control"/>
	</form>
</div>
	<button id="btnSaveTeam" type="button" class="btn btn-outline-success">등록</button>
<script>
	$("#btnSaveTeam").click(()=>{
		let data ={
				teamName : $("#teamName").val(),
		};
		console.log(data);
		$.ajax("/team",{
			type: "POST",
			dataType: "JSON",// 응답 타입
			data: JSON.stringify(data),// 전달 타입 
			headers: { 
				"Content-Type" : "application/json; charset=utf-8"
			}
		}).done((res)=>{
			if(res.code ==1){
				alert("등록 성공");
			//	location.href = "/teamList";
			}
			else{
				alert("등록 실패 ");
			}
		});
	});
</script>
<%@ include file="../layout/footer.jsp"%>