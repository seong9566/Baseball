package site.metacoding.red.web.dto.response.expulsion;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExpulsionDto {
	//퇴출 사유 목록 페이지에 필요한 데이터들 DTO
	private Integer id;
	private Integer no;
	private String teamName;
	private String playerName;
	private String position;
	private String reason;
	private Timestamp createdAt;
	
}
