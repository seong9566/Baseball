package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.StadiumService;
import site.metacoding.red.service.TeamService;
import site.metacoding.red.web.dto.response.CMRespDto;
import site.metacoding.red.web.dto.response.team.TeamDto;
import site.metacoding.red.web.dto.resquest.team.InsertTeamDto;

@RequiredArgsConstructor
@Controller
public class TeamController {

	private final TeamService teamService;
	private final StadiumService stadiumService;
	//팀 등록하기
	@GetMapping("/teamSaveForm")
	public String teamSaveForm(Model model) {
		model.addAttribute("stadium",stadiumService.경기장목록보기());
		return "team/teamSaveForm";
	}
	@PostMapping("/team")
	public @ResponseBody CMRespDto<?> insertTeam(@RequestBody InsertTeamDto insertTeamDto){
		teamService.팀등록(insertTeamDto);
		return new CMRespDto<>(1, "팀 등록 성공", null);
	}
	
	@DeleteMapping("/deleteTeam")
	public @ResponseBody CMRespDto<?> deleteTeam(Integer id){
		teamService.팀삭제(id);
		return new CMRespDto<>(1,"삭제 성공", null);
	}
	
	@GetMapping("/teamList")
	public String teamAll(Model model) {
		List<TeamDto> teamList = teamService.팀목록보기();
		model.addAttribute("teamList",teamList);
		return "team/teamList";
	}
	
}
