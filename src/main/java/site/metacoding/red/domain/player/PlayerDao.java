package site.metacoding.red.domain.player;

import java.util.List;

import site.metacoding.red.web.dto.response.player.PlayerDto;


public interface PlayerDao {
	public void insert(Player player);
	public List<Player> findAll();
	public Player findById(Integer id);
	public void update(Player player);
	public void deleteById(Integer id);
	public List<PlayerDto>findAllJoin();
}
