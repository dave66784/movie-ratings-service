package com.example.movieratingsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/ratings")
@RestController
public class MovieRatingsController {
	@GetMapping("/{ratingId}")
	public String getMovie(@PathVariable("ratingId") String ratingId) {
		return "Movie Rating=" + ratingId;
	}

}
