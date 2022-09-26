package site.metacoding.red.domain.expulsion;

import java.util.List;

import site.metacoding.red.web.dto.response.expulsion.ExpulsionDto;

public interface ExpulsionDao {
	public void insert(Expulsion expulsion);
	public List<ExpulsionDto> findAll();
}
