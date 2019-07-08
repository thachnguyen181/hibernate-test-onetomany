package tma.com.service;

import java.util.List;
import java.util.Optional;

import tma.com.repository.Location;
import tma.com.model.LocationDTO;

public interface ILocationService {
	
	public List<LocationDTO> findAll();
	public LocationDTO findById(long id);
	public Location insert(LocationDTO locationDtp);
	public boolean update(LocationDTO locationDto);
	public void delete(long id);
}
