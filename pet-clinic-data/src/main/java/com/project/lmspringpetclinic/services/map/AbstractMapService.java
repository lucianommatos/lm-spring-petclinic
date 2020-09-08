package com.project.lmspringpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.management.RuntimeErrorException;

import com.project.lmspringpetclinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity> {

	protected Map<Long, T> map = new HashMap<>();

	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	public T findById(Long id) {
		return map.get(id);
	}

	public T save(T object) {
		if (object != null) {
			if (object.getId() == null) {
				object.setId(getNextId());
			}

			map.put(object.getId(), object);
		} else {
			throw new RuntimeErrorException(null,"Object cannot be null");
		}

		return object;
	}

	public void deleteById(Long id) {
		map.remove(id);
	}

	public void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

	private Long getNextId() {		
		return map.size() > 0 ? Collections.max(map.keySet()) + 1 : 1;
	}

}
