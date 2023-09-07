package pack.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class SangpumBean { // formbean 
	private int su, dan; 
	private String sang;
}
