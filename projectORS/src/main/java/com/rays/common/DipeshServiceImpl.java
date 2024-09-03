package com.rays.common;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class DipeshServiceImpl extends BaseServiceImpl<DipeshDTO, DipeshDaoInt> implements DipeshServiceInt {

	
}
