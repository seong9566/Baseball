package site.metacoding.red.web.dto.resquest.player;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.player.Player;

@Setter
@Getter

public class InsertPlayerDto {
	private String name;
	private Integer teamId;
	private String position;
	
	public Player toEntity() {
		Player player = new Player(this.name, this.teamId,this.position);
		return player;
	}
}
