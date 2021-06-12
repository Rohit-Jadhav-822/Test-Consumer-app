package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty("status")
	String status;
	
	@JsonProperty("status-code")
	Integer statusCode;
	
	@JsonProperty("version")
	String version;
	
	@JsonProperty("last-modified")
	String lastModified;
	
	@JsonProperty("access")
	String access;
	
	@JsonProperty("total")
	Integer total;
	
	@JsonProperty("limit")
	Integer limit;
	
	@JsonProperty("offset")
	Integer offset;
	
	
	@JsonProperty("data")
	List<Data> dataList;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getLastModified() {
		return lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public List<Data> getDataList() {
		return dataList;
	}

	public void setDataList(List<Data> dataList) {
		this.dataList = dataList;
	}
	
	
	
}
