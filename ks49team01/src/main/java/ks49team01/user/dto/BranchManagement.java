package ks49team01.user.dto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
	// 파일경로
@RequestMapping("/user/branchManagement")
public class BranchManagement {
	// 메소드 명
	@GetMapping("/branchmanagement")
	public String branchmanagement(Model model) {
		
		log.info("");
		
		model.addAttribute("title", "");
		
		// 연결 클래스 파일/경로
		return "user/branch_management";
	}
	
}
