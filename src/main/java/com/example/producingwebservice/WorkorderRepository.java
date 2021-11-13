package com.example.producingwebservice;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Workorder;
import io.spring.guides.gs_producing_web_service.Ccbcase;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class WorkorderRepository {
	private static final Map<String, Workorder> workorders = new HashMap<>();
	private static final Map<String, Ccbcase> ccbcases = new HashMap<>();

	@PostConstruct
	public void initData() {
		Workorder wo = new Workorder();
		wo.setWonum("DD1111");
		wo.setWoid(1111);
		wo.setSiteid("ADDA");
		workorders.put(wo.getWonum(), wo);

		wo = new Workorder();
		wo.setWonum("DD2222");
		wo.setWoid(2222);
		wo.setSiteid("ADDB");
		workorders.put(wo.getWonum(), wo);

		wo = new Workorder();
		wo.setWonum("DD3333");
		wo.setWoid(3333);
		wo.setSiteid("ADDC");
		workorders.put(wo.getWonum(), wo);

		Ccbcase ccbcase = new Ccbcase();
		ccbcase.setWonum("DD2222");
		ccbcase.setLang("ENG");
		ccbcase.setCaseid("2222");
		ccbcases.put(ccbcase.getCaseid(),ccbcase);



	}

	public Workorder findWorkorder(String wonum) {
		Assert.notNull(wonum, "The workorder's wonum must not be null");
		return workorders.get(wonum);
	}

	public Ccbcase findCcbcase(String wonum) {
		Assert.notNull(wonum, "The Ccbcase's wonum  must not be null");
		return ccbcases.get(wonum);
	}
}
