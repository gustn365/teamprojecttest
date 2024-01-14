package ks49team01.admin.dto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
	// 파일경로
@RequestMapping("/admin/branchEvaluation")
public class BranchEvaluation {
	// 메소드 명
	@GetMapping("/branchevaluationquestions")
	public String branchevaluationquestions(Model model) {
		
		log.info("");
		
		model.addAttribute("title", "");
		
		// 연결 클래스 파일/경로
		return "admin/branch_evaluation";
	}
	@GetMapping("/branchevaluationscoringcriteria")
	public String branchevaluationscoringcriteria(Model model) {
		
		log.info("");
		
		model.addAttribute("title", "");
		
		// 연결 클래스 파일/경로
		return "admin/branch_evaluation";
	}
	@GetMapping("/branchevaluationresponseandgrade")
	public String branchevaluationresponseandgrade(Model model) {
		
		log.info("");
		
		model.addAttribute("title", "");
		
		// 연결 클래스 파일/경로
		return "admin/branch_evaluation";
	}
	@GetMapping("/branchfinaldecisiontotalsumevaluation")
	public String branchfinaldecisiontotalsumevaluation(Model model) {
		
		log.info("");
		
		model.addAttribute("title", "");
		
		// 연결 클래스 파일/경로
		return "admin/branch_evaluation";
	}
	
}
