package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.web.dto.response.player.PlayerDto;
import site.metacoding.red.web.dto.resquest.player.InsertPlayerDto;


@RequiredArgsConstructor
@Service
public class PlayerService {
	private final PlayerDao playerDao;
	
	public void 선수등록(InsertPlayerDto insertPlayerDto) {
		playerDao.insert(insertPlayerDto.toEntity());
	}
	
	public void 선수퇴출(Integer id) {
		playerDao.deleteById(id);
	}
	
	public List<PlayerDto> 선수목록보기() {
		List<PlayerDto> playerList = playerDao.findAllJoin();
		return playerList;
	}
	
	public Player 선수한명보기(Integer id) {
		return playerDao.findById(id);
	}
	
	//public void 선수수정() {}
	
}
