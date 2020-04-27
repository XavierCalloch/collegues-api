package dev.collegues.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.collegues.repository.CollegueRepository;

@RestController
@RequestMapping("/collegues")
public class CollegueController {

	private CollegueRepository collegueRepository;

	/**
	 * Constructeur
	 * 
	 * @param collegueRepository
	 */
	public CollegueController(CollegueRepository collegueRepository) {
		super();
		this.collegueRepository = collegueRepository;
	}

	// GET /collegues?nom=X
//	@RequestMapping(method = RequestMethod.GET)
//	public ResponseEntity<List<String>> findColleguesByNom(@RequestParam String nom) {
//		return;
//	}

}
