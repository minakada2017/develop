package org.mtcd.service;

import java.util.ArrayList;
import java.util.List;

import org.mtcd.data.ApiRetBean;
import org.mtcd.data.MaterialBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MtcdInsertController {
	@RequestMapping(value="/webapi ")
	public List<String>  dataInsert(@RequestBody MaterialBean bean) {
		List<String> rb = new ArrayList<String>();
		
		rb.add("001");
		rb.add("AAAAA");
		
		return rb;
	}
	
	private boolean insertTbl() {
		boolean retInfo = false;

		// TODO ここにテーブル登録処理を書きます
		return retInfo;
			
	}
}
