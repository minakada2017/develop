package org.mtcd.service;

import java.util.ArrayList;
import java.util.List;

import org.mtcd.data.MaterialBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MtcdInsertController {
	@RequestMapping(value="/webapi ")
	public List<String>  dataInsert(@RequestBody MaterialBean bean) {
		List<String> rb = new ArrayList<String>();
		
		rb.add("001");
		rb.add("AAAAA");
		
		return rb;
	}
	
}
