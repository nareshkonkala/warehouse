package com.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Document;
import com.app.service.IDocumentService;

@Controller
@RequestMapping("/docs")
public class DocumentController {
	@Autowired
	private IDocumentService service;
	
	@RequestMapping("/form")
	public String showForm(ModelMap map) {
		List<Object[]> obs=service.getFileIdAndNames();
		map.addAttribute("list",obs);
		
		return "DocumentFile";
	}
	
	@RequestMapping(value = "/upload" , method = RequestMethod.POST)
	public String uploadDoc(@RequestParam CommonsMultipartFile multipartFile) {
		
		if(multipartFile != null) {
			Document doc=new  Document();
			doc.setFileName(multipartFile.getOriginalFilename());
			doc.setFileData(multipartFile.getBytes());
			service.saveDocument(doc);
			System.out.println("Success");
		}
		
		return "redirect:form";
	}
	
	@RequestMapping("/download")
	public void downloadDoc(@RequestParam Integer fileId,HttpServletResponse res) {
		
		Document doc=service.getOneDocument(fileId);
		String fileName=doc.getFileName();
		byte[] fileData=doc.getFileData();
		
		res.addHeader("Content-Disposition", "attachment;filename="+fileName);
		
		try {
			FileCopyUtils.copy(fileData, res.getOutputStream());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
