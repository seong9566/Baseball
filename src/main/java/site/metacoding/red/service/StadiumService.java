package site.metacoding.red.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.stadium.StadiumDao;
import site.metacoding.red.web.dto.resquest.stadium.InsertStadiumDto;
import site.metacoding.red.web.dto.resquest.stadium.UpdateStadiumDto;

@RequiredArgsConstructor
@Service
public class StadiumService {
	
	private final StadiumDao stadiumDao;
	
	public void 경기장등록(InsertStadiumDto insertStadiumDto) {
		stadiumDao.insert(insertStadiumDto.toEntity());
	}
	
	public void 경기장삭제(Integer id) {
		stadiumDao.deleteById(id);
	}
	
	public void 경기장수정(Integer id, UpdateStadiumDto updateStadiumDto) {
		// 영속화
		Stadium stadium =  stadiumDao.findById(id);
		// 필요 부분 업데이트
		stadium.update(updateStadiumDto);
		
		// 전체 업데이트
		stadiumDao.update(stadium);
	}
	
	public Stadium 경기장하나만보기(Integer id) {
		return stadiumDao.findById(id);
	}
	
	public List<Stadium> 경기장목록보기() {
		List<Stadium> stadiums = stadiumDao.findAll();
		return stadiums;
	}
}
