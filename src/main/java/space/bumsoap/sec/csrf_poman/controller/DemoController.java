package space.bumsoap.sec.csrf_poman.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/demo")
	public String getDemo() {
		return "Get 호출됨";
	}

	@PostMapping("/demo")
	public String postDemo() {
		return "Post 호출됨";
	}
}
