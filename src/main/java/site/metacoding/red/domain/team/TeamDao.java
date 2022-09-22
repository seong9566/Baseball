package site.metacoding.red.domain.team;

import java.util.List;

import site.metacoding.red.web.dto.resquest.team.InsertTeamDto;

public interface TeamDao {
	public void insert(Team team);
	public List<Team> findAll();
	public Team findById(Integer id);
	public void update(Team team);
	public void deleteById(Integer id);
}
