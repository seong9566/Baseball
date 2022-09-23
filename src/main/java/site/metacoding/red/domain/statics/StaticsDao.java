package site.metacoding.red.domain.statics;

import java.util.List;

import site.metacoding.red.web.dto.response.statics.StaticsDto;

public interface StaticsDao {
	public List<StaticsDto> findAll();
}
