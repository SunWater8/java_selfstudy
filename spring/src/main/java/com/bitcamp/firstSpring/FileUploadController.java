package com.bitcamp.firstSpring;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	@Autowired
	private FileUploadService service;
	
	final String UPLOAD_URI = "/uploadfile";
	
	@RequestMapping("upload/uploadForm")
	public String getUploadForm() {
		return "/upload/uploadForm";
	}
	
	//파라미터로 업로드한 파일 처리하기
	@RequestMapping("upload/upload1")
	public String upload1(
			@RequestParam("sno") String sno,
			@RequestParam("sname") String sname,
			@RequestParam("report") MultipartFile report,
			Model model,
			
			HttpServletRequest request
			) throws IllegalStateException, IOException {
		
		model.addAttribute("sno", sno);
		model.addAttribute("sname", sname);
		model.addAttribute("report", report.getOriginalFilename());
		
		saveFile(request, report);
		
		service.fileUpload();
		return "/upload/upload";
	}
	
	//파일 저장하는 메소드
	private void saveFile(HttpServletRequest request, MultipartFile file) throws IllegalStateException, IOException {
		//저장경로 만들기
		String saveDir = request.getSession().getServletContext().getRealPath(UPLOAD_URI);
		//새로 저장할 파일 만들기
		File newFile = new File(saveDir, file.getOriginalFilename());
		//파일 저장하기
		file.transferTo(newFile);
	}
	
	
	
}
