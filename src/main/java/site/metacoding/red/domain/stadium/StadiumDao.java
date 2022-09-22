package site.metacoding.red.domain.stadium;

import java.util.List;

import site.metacoding.red.web.dto.resquest.stadium.InsertStadiumDto;

public interface StadiumDao {
	public void insert(Stadium stadium);
	public List<Stadium> findAll();
	public Stadium findById(Integer id);
	public void update(Stadium stadium);
	public void deleteById(Integer id);

}
