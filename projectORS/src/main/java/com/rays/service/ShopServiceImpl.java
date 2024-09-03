package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ShopDAOInt;
import com.rays.dto.ShopDTO;

@Service
@Transactional
public class ShopServiceImpl extends BaseServiceImpl<ShopDTO, ShopDAOInt> implements ShopServiceInt{

	
}
