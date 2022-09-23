package site.metacoding.red.web.dto.response.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PlayerDto {
	private Integer id;
	private String name;
	private String teamName;
	private String position;
	private Timestamp createdAt;
	private Integer no;
	
	
}
