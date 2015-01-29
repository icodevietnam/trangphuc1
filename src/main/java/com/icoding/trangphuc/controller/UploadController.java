package com.icoding.trangphuc.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.Iterator;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.icoding.trangphuc.dto.UploadFile;

/**
 * @author MrTuanTu
 *
 */

@Controller
@RequestMapping("/file")
public class UploadController {

	UploadFile uploadFile;

	public UploadController() {
		uploadFile = new UploadFile();
	}

	@RequestMapping(value = "/get/{value}", method = RequestMethod.GET)
	public void get(HttpServletResponse response, @PathVariable String value) {
		try {
			response.setContentType(uploadFile.type);
			response.setContentLength(uploadFile.length);
			FileCopyUtils.copy(uploadFile.bytes, response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public @ResponseBody String upload(MultipartHttpServletRequest request,
			HttpServletResponse response) {
		Iterator<String> itr = request.getFileNames();
		MultipartFile mpf = request.getFile(itr.next());
		System.out.println(mpf.getOriginalFilename() + " uploaded!");
		try {
			uploadFile.length = mpf.getBytes().length;
			uploadFile.bytes = mpf.getBytes();
			uploadFile.type = mpf.getContentType();
			uploadFile.name = mpf.getOriginalFilename();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "<img src='http://localhost:8080/trangphuc1/file/upload"+Calendar.getInstance().getTimeInMillis()+"' />";
	}
}
