<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container mt-3">
	<form>
		<h2>팀 등록 페이지</h2>
		<div class="input-group mb-5">
			<select id = "stadiumId" class = "form-select" name="stadiumId">
				<c:forEach var="stadium" items="${stadium}">
					<option value="${stadium.id}">${stadium.name}</option>
				</c:forEach>
			</select> 팀 이름 : <input id="teamName"type="text" class="form-control"/>
	</form>
	<button id="btnSaveTeam" type="button" class="btn btn-outline-success">등록</button>
</div>


<script>
	$("#btnSaveTeam").click(()=>{
		let data ={
				teamName : $("#teamName").val(),
				stadiumId : $("#stadiumId").val()
				
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
				location.href = "/teamList";
			}
			else{
				alert("등록 실패 ");
			}
		});
	});
</script>
<%@ include file="../layout/footer.jsp"%>