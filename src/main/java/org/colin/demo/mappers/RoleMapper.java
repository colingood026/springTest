package org.colin.demo.mappers;

import java.util.List;

import org.colin.demo.model.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
	public List<Role> selectAll();
}
