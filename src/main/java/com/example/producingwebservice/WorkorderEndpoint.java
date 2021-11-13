package com.example.producingwebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetWorkorderRequest;
import io.spring.guides.gs_producing_web_service.GetWorkorderResponse;

import io.spring.guides.gs_producing_web_service.GetCcbcaseRequest;
import io.spring.guides.gs_producing_web_service.GetCcbcaseResponse;

@Endpoint
public class WorkorderEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private WorkorderRepository workorderRepository;

	@Autowired
	public WorkorderEndpoint(WorkorderRepository workorderRepository) {
		this.workorderRepository = workorderRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getWorkorderRequest")
	@ResponsePayload
	public GetWorkorderResponse getCountry(@RequestPayload GetWorkorderRequest request) {
		GetWorkorderResponse response = new GetWorkorderResponse();
		response.setWorkorder(workorderRepository.findWorkorder(request.getWonum()));
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCcbcaseRequest")
	@ResponsePayload
	public GetCcbcaseResponse getCcbcase(@RequestPayload GetCcbcaseRequest request) {
		GetCcbcaseResponse response = new GetCcbcaseResponse();
		response.setCcbcase(workorderRepository.findCcbcase(request.getWonum()));
		return response;
	}
}
