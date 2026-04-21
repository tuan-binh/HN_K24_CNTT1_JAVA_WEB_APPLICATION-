package org.example.ss12.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.ss12.dtos.PersonDTO;
import org.example.ss12.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor // Tiêm thông qua constructors
public class HomeController {
    private final PersonService personService;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("persons", personService.findAll());
        return "home";
    }

    // 1. Hiển thị form
    @GetMapping("/add")
    public String viewAdd(Model model) {
        model.addAttribute(
                "personDTO",
                new PersonDTO()
        );
        return "form";
    }

    // 2. Submit form (Lấy dữ liệu từ html form)
    @PostMapping("/handle-submit")
    public String handleSubmit(
            @Valid @ModelAttribute(name = "personDTO") PersonDTO personDTO,
            BindingResult result,
            Model model
    ) {
        // Nếu lỗi
        if (result.hasErrors()) {
            model.addAttribute("personDTO", personDTO);
            return "form";
        }

        // Nếu thành công
        personService.addPerson(personDTO);

        return "redirect:/";
    }


}
