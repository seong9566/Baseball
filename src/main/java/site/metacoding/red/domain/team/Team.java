package site.metacoding.red.domain.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Team {
	private Integer id;
	private Integer stadiumId;
	private String name;
	private Timestamp createdAt;
	
	public Team(Integer stadiumId, String name) {
		this.stadiumId = stadiumId;
		this.name = name;
	}
	
	
}
