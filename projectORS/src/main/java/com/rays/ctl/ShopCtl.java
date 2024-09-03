package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ShopDTO;
import com.rays.form.ShopForm;
import com.rays.service.ShopServiceInt;

@RestController
@RequestMapping(value  = "Shop")
public class ShopCtl extends BaseCtl<ShopForm, ShopDTO, ShopServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Zara");
		map.put(2, "H&M");
		map.put(3, "Zudio");
		map.put(4, "Levis");
		map.put(5, "Redtape");

		res.addResult("brand", map);

		return res;

	}
}