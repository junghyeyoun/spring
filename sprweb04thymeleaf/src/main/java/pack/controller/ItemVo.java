package pack.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ItemVo {
	private String id,name;
	private int price;
	private LocalDate regDate;
}
