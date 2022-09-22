package site.metacoding.red.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class CMRespDto<T>{
	private Integer code; // 1 , -1
	private String msg; //실패, 성공,
	private T data; // 데이터 리턴 타입 
 
}
