package com.rays.common;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

@Repository
public class DipeshhDAOImpl extends BaseDAOImpl<DipeshDTO> implements DipeshDaoInt {

	@Override
	protected List<Predicate> getWhereClause(DipeshDTO dto, CriteriaBuilder builder, Root<DipeshDTO> qRoot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<DipeshDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
