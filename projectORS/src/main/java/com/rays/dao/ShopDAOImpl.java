package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ShopDTO;

@Repository
public class ShopDAOImpl extends BaseDAOImpl<ShopDTO> implements ShopDAOInt {

	@Override
	protected List<Predicate> getWhereClause(ShopDTO dto, CriteriaBuilder builder, Root<ShopDTO> qRoot) {
		
		List<Predicate> whereCondition  = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getCatagory())) {
			whereCondition.add(builder.like(qRoot.get("catagory"), dto.getCatagory() + "%"));
		}
		
		if (!isZeroNumber(dto.getPrice())) {
			whereCondition.add(builder.equal(qRoot.get("price"), dto.getPrice()));
		}
			if(isNotNull(dto.getMfd())) {
				whereCondition.add(builder.equal(qRoot.get("mfd"), dto.getMfd()));
			}
			
			if(!isEmptyString(dto.getSize())) {
				whereCondition.add(builder.like(qRoot.get("size"), dto.getSize() + "%"));
			}
			if(!isEmptyString(dto.getBrand())) {
				whereCondition.add(builder.like(qRoot.get("brand"), dto.getBrand() + "%"));
			}
		
		return whereCondition;
	}

	@Override
	public Class<ShopDTO> getDTOClass() {
		return ShopDTO.class;
	}

}
