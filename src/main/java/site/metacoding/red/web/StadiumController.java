package site.metacoding.red.web;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.service.StadiumService;
import site.metacoding.red.web.dto.response.CMRespDto;
import site.metacoding.red.web.dto.resquest.stadium.InsertStadiumDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {

	private final StadiumService stadiumService;

	// SaveForm으로 이동 
	@GetMapping("/stadiumSaveForm")
	public String stadiumSaveForm() {
		return "stadium/stadiumSaveForm";
	}
	@PostMapping("/stadium")
	public @ResponseBody CMRespDto<?> insertStadium(@RequestBody InsertStadiumDto insertStadiumDto) {
		stadiumService.경기장등록(insertStadiumDto);
		return new CMRespDto<>(1, "등록 성공", null);
	}
	
	// 목록보기 or 메인페이지 역할
	@GetMapping({"/","/stadiumList"})
	public String getStadiumList(Model model) {
		List<Stadium> stadiumList = stadiumService.경기장목록보기();
		model.addAttribute("stadiumList", stadiumList);
		return "stadium/stadiumList";
	}

	@DeleteMapping("/stadiumList/delete")
	public @ResponseBody CMRespDto<?> deleteStadium(Integer id){
		stadiumService.경기장삭제(id);
		return new CMRespDto<>(1,"삭제완료", null);
	}
	
	@GetMapping("/stadium/updateForm")
	public String updateStadium() {
		return "stadium/updateForm";
	}
}
