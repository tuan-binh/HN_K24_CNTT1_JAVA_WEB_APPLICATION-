package org.example.ss04.controller;

import org.example.ss04.model.Tool;
import org.example.ss04.repository.ToolRepository;
import org.example.ss04.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

// đánh dấu đây là nơi để điều hưỡng và nhận yêu cầu (req)
@Controller
// Đại diện cho từng yêu cầu nhỏ cho 1 nhóm
/**
 * Nhóm về đặt hàng
 *    - tạo hoá đơn
 *    - thanh toán
 *    - trừ tiền
 *    - trừ số lượng tồn kho (product)
 * */
@RequestMapping
public class ToolController {

    // Tiêm service vào đây
    private final ToolService toolService;
    private final ToolRepository toolRepository;

    @Autowired
    public ToolController(ToolService toolService, ToolRepository toolRepository) {
        this.toolService = toolService;
        this.toolRepository = toolRepository;
    }

    // bài toán cần trả về 1 danh sách dụng cụ
//    @RequestMapping(value = "",method = RequestMethod.GET) -- cách cũ
    @GetMapping // cách mới
    public String listTool(Model model) {

        List<Tool> tools = toolService.getAllTool();

        model.addAttribute("listTool", tools);

        return "list-tool";
    }

    // Tham số http://localhost:8080/search
    @GetMapping("/search")
    public String searchTool(
            @RequestParam(name = "name", defaultValue = "") String name,
            @RequestParam(name = "age", defaultValue = "") int age,
            Model model
    ) {
        System.out.println("Nội dung tìm kiếm: " + name);
        List<Tool> tools = toolRepository.search(name);

        model.addAttribute("listTool", tools);
        return "list-tool";
    }

    // Giá trị trên đường dẫn
    @GetMapping("/detail/{name}")
    public ModelAndView detail(
            @PathVariable(name = "name") String toolName,
            Model model,
            ModelMap modelMap
    ) {
        ModelAndView modelAndView = new ModelAndView("tool-detail");
        System.out.println("Gia tri tren duong dan: " + toolName);
//        model.addAttribute("nameTool", toolName);
        modelAndView.addObject("nameTool",toolName);
        return modelAndView;
    }

//    @GetMapping("/add-form")
//    public String addTool() {
//        return "list-tool";
//    }

}
