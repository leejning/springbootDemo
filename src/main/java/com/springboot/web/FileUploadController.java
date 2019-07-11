package com.springboot.web;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@RestController
@CrossOrigin
public class FileUploadController {
	
	@RequestMapping("/image")
	@ResponseBody
	public String uploadPicture(HttpServletRequest req) throws IllegalStateException, IOException {
		MultipartHttpServletRequest request = (MultipartHttpServletRequest)req;
		MultipartFile file = request.getFile("file");
//		String path = req.getSession().getServletContext().getRealPath("images");
		String originalFilename = file.getOriginalFilename();
		int index = originalFilename.lastIndexOf(".");
		String end = originalFilename.substring(index,originalFilename.length());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMddhhmmss");
		String str = sdf.format(new Date());
		String fileName=str+end;
//		file.transferTo(new File(path +"/"+ fileName));
		
		
		return "/images/"+ fileName;
	}
}
