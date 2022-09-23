package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.statics.StaticsDao;
import site.metacoding.red.web.dto.response.statics.StaticsDto;

@RequiredArgsConstructor
@Service
public class StaticsService {
	private final StaticsDao staticsDao;
	
	public List<StaticsDto> staticAll(){
		List<StaticsDto> staticList = staticsDao.findAll();
		return staticList;
	}
}
