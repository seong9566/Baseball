package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.service.PlayerService;
import site.metacoding.red.service.TeamService;
import site.metacoding.red.web.dto.response.CMRespDto;
import site.metacoding.red.web.dto.response.player.PlayerDto;
import site.metacoding.red.web.dto.resquest.player.InsertPlayerDto;

@Controller
@RequiredArgsConstructor
public class PlayerController {
	private final PlayerService playerService;
	private final TeamService teamService;
	
	@GetMapping("/playerSaveForm")
	public String playerSaveForm(Model model) {
		model.addAttribute("team", teamService.팀목록가져가기());
		return "player/playerSaveForm";
	}
	@PostMapping("/playerSave")
	public @ResponseBody CMRespDto<?> playSave(InsertPlayerDto insertPlayerDto) {
		playerService.선수등록(insertPlayerDto);
		return new CMRespDto<>(1, "선수등록성공", null);
	}
	
	@GetMapping("/playerList")
	public String playerList(Model model){
		List<PlayerDto> playerList=playerService.선수목록보기();
		model.addAttribute("playerList", playerList);
		return "player/playerListForm";
	}
	
	@DeleteMapping("/deletePlayer")
	public @ResponseBody CMRespDto<?> deletePlayer(Integer id){
		playerService.선수퇴출(id);
		return new CMRespDto<>(1,"삭제 성공", null);
				
	}
	
	
}
