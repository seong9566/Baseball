package site.metacoding.red.web.dto.response.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StadiumDto {
	private Integer id;
	private String name;
	private String toarea;
	private Timestamp createdAt;
}
