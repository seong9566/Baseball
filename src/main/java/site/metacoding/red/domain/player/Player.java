package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {
	private Integer id;
	private String name;
	private Integer teamId;
	private String position;
	private Timestamp createdAt;
	
	public Player(String name, Integer teamId, String position) {
		this.name = name;
		this.teamId = teamId;
		this.position = position;
	}
	
}
