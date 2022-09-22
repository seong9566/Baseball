package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;
import site.metacoding.red.web.dto.resquest.team.InsertTeamDto;
@RequiredArgsConstructor
@Service
public class TeamService {
	
	private final TeamDao teamDao;
	
	public void 팀등록(InsertTeamDto insertTeamDto) {
		teamDao.insert(insertTeamDto.toEntity());
	}
	
	public void 팀삭제(Integer id) {
		teamDao.deleteById(id);
	}
	
	public List<Team> 팀목록보기() {
		List<Team> teamList = teamDao.findAll();
		return teamList;
	}
	
	public Team 팀목록한건보기(Integer id) {
		Team teamPS = teamDao.findById(id);
		return teamPS;
	}
	
	//팀 수정은 x

}
