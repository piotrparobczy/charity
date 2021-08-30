package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class IndexController {

    private final InstitutionRepository institutionRepository;

    public IndexController(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        List<Institution> institutionList = institutionRepository.findAll().stream().collect(Collectors.toList());
        model.addAttribute("institutions", institutionList);
        return "index";
    }

}
