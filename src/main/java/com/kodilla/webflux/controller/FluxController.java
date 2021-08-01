package com.kodilla.webflux.controller;

import com.kodilla.webflux.domain.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class FluxController {

	@GetMapping(value = "/books")
	public Flux<BookDto> getStrings() {
		final BookDto b1 = new BookDto("author1", "book1");
		final BookDto b2 = new BookDto("author2", "book2");
		return Flux.just(b1, b2).log();
	}
}