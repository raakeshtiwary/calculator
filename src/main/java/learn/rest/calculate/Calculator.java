package learn.rest.calculate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	
	@GetMapping("/add/{left}/{right}")
	public Result add(@PathVariable(name = "left") int left, @PathVariable(name = "right") int right) {
		
		Result result = new Result();
		result.setLeft(left);
		result.setRight(right);
		result.setSum(left + right);
		
		return result;
	}
}
