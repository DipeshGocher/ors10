package com.rays.common;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Dip")
public class DipeshCtl extends BaseCtl<DipeshForm, DipeshDTO, DipeshServiceInt> {

}
