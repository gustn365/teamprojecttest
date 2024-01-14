package ks49team01.admin.dto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
	// 파일경로
@RequestMapping("/admin/FinalBranchAgreement")
public class FinalBranchAgreement {
	// 메소드 명
	@GetMapping("/finalbranchagreement")
	public String finalbranchagreement(Model model) {
		
		log.info("");
		
		model.addAttribute("title", "");
		
		// 연결 클래스 파일/경로
		return "admin/final_branch_agreement";
	}

}
