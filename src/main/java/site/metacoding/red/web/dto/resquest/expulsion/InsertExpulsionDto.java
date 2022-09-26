package site.metacoding.red.web.dto.resquest.expulsion;

import site.metacoding.red.domain.expulsion.Expulsion;

public class InsertExpulsionDto {
	private String reason;
	private Integer playerId;
	
	public Expulsion toEntity() {
		Expulsion expulsion = new Expulsion(this.playerId,this.reason);
		return expulsion;
	}
}
