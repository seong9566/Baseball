package site.metacoding.red.domain.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.red.web.dto.resquest.stadium.UpdateStadiumDto;

@NoArgsConstructor
@Getter
@Setter
public class Stadium {
	private Integer id;
	private String name;
	private String toarea;
	private Timestamp createdAt;
	
	public Stadium(String name, String toarea) {
		this.name = name;
		this.toarea = toarea;
	}
	
	public void update(UpdateStadiumDto updateStadiumDto) {
		this.name = updateStadiumDto.getName();
	}
	
	
}
