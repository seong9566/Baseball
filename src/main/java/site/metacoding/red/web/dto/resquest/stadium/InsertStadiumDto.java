package site.metacoding.red.web.dto.resquest.stadium;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.stadium.Stadium;

@Getter
@Setter
public class InsertStadiumDto {
	private String name;
	private String toarea;
	
	public Stadium toEntity() {
		Stadium stadium = new Stadium(this.name, this.toarea);
		return stadium;
	}
}
