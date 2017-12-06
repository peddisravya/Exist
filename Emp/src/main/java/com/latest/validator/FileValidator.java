package com.latest.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

import com.latest.model.FileUpload;

@Component
public class FileValidator implements Validator {
	String extensionType = "application/vnd.ms-excel";

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object object, Errors error) {
		FileUpload fileUpload = (FileUpload) object;
		MultipartFile multipartFile = fileUpload.getData();
		if (multipartFile.isEmpty()) {
			error.rejectValue("file", "Please select Any file");

		} else if (!extensionType.equalsIgnoreCase(multipartFile.getContentType())) {
			error.rejectValue("file", "invalid file type");
		}

		else if (multipartFile.getSize() > 100000) {
			error.rejectValue("file", "File Exceded Size");
		}

	}

}
