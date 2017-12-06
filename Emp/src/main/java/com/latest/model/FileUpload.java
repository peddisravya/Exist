package com.latest.model;

import org.springframework.web.multipart.MultipartFile;

public class FileUpload {
	private long id;
	private String fileName;
	private MultipartFile fileContent;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public MultipartFile getData() {
		return fileContent;
	}

	public void setData(MultipartFile fileContent) {
		this.fileContent = fileContent;
	}

}
