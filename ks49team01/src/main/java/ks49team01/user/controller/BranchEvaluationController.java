package ks49team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
	// 파일경로
@RequestMapping("/user/branchEvaluation")
public class BranchEvaluationController {
	// 메소드 명
	@GetMapping("/getbranchevaluationquestions")
	public String getbranchevaluationquestions(Model model) {
		
		log.info("본사 1차 가맹 평가 질문 조회");
		
		model.addAttribute("title", "본사 1차 가맹 평가 질문 조회");
		
		// 연결 클래스 파일/경로
		return "user/branch_evaluation/get_branch_evaluation_questions";
	}

	
	@GetMapping("/getbranchevaluationscoringcriteria")
	public String getbranchevaluationscoringcriteria(Model model) {
		
		log.info("본사 1차 가맹 평가 채점 기준 조회");
		
		model.addAttribute("title", "본사 1차 가맹 평가 채점 기준 조회	");
		
		return "user/branch_evaluation/get_branch_evaluation_scoring_criteria";
	}
	
	
	@GetMapping("/getbranchevaluationresponseandgrade")
	public String getbranchevaluationresponseandgrade(Model model) {
		
		log.info("가맹신청시 1차 평가 답변 및 채점 조회");
		
		model.addAttribute("title", "가맹신청시 1차 평가 답변 및 채점 조회");
		
		return "user/branch_evaluation/get_branch_evaluation_response_and_grade";
	}
	
	
	@GetMapping("/gettotalbranchapplyevaluation")
	public String gettotalbranchapplyevaluation(Model model) {
		
		log.info("1차 가맹 신청 평가 총합계 조회");
		
		model.addAttribute("title", "1차 가맹 신청 평가 총합계 조회");
		
		return "user/branch_evaluation/get_total_branch_apply_evaluation";
	}
	
	@GetMapping("/getbranchfinaldecisiontotalsumevaluation")
	public String getbranchfinaldecisiontotalsumevaluation(Model model) {
		
		log.info("1차 평가 총합계 기준으로최종 합격여부 결정 조회");
		
		model.addAttribute("title", "1차 평가 총합계 기준으로최종 합격여부 결정 조회");
		
		// 연결 클래스 파일/경로
		return "user/branch_evaluation/get_branch_final_decision_total_sum_evaluation";
	}

}
