package br.com.bancoamazonia.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.amazoniafw.web.servlet.responsehandlers.ActionResponse;
import br.com.amazoniafw.web.servlet.responsehandlers.controller.ControllerResponse;

@Controller
@RequestMapping
public class InitController {

	@Autowired
	private ControllerResponse response;

	@GetMapping("/")
	public ActionResponse init() {
		return response.view("index");
	}
	@GetMapping("cadastro-de-criminoso")
	public ActionResponse cadastroDeCriminoso() {
		return response.view("cadastro-de-criminoso");
	}
	
}
