package ks49team01.admin.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
	// 파일경로
@RequestMapping("/admin/FinalBranchAgreement")
public class FinalBranchAgreementService {
	// 메소드 명
	@GetMapping("/addfinalbranchagreement")
	public String addfinalbranchagreement(Model model) {
		
		log.info("최종 가맹점 계약 등록");
		
		model.addAttribute("title", "최종 가맹점 계약 등록");
		
		// 연결 클래스 파일/경로
		return "admin/final_branch_agreement/add_final_branch_agreement";
	}

	
	@GetMapping("/modifyfinalbranchagreement")
	public String modifybranchrecruitannouncement(Model model) {
		
		log.info("최종 가맹점 계약 수정");
		
		model.addAttribute("title", "최종 가맹점 계약 수정");
		
		return "admin/final_branch_agreement/modify_final_branch_agreement";
	}
	
	
	@GetMapping("/removefinalbranchagreement")
	public String removefinalbranchagreement(Model model) {
		
		log.info("최종 가맹점 계약 삭제");
		
		model.addAttribute("title", "최종 가맹점 계약 삭제");
		
		return "admin/final_branch_agreement/remove_final_branch_agreement";
	}
	
	
	@GetMapping("/getfinalbranchagreement")
	public String getfinalbranchagreement(Model model) {
		
		log.info("최종 가맹점 계약 조회");
		
		model.addAttribute("title", "최종 가맹점 계약 조회");
		
		return "admin/final_branch_agreement/get_final_branch_agreement";
	}
	
}
