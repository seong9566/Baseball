package site.metacoding.red.web.dto.response.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TeamDto {
	private Integer no;
	private Integer id;
	private String stadiumName;
	private String teamName;
	private Timestamp createdAt;
}
