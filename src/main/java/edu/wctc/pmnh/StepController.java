package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/steps")
public class StepController {

    @RequestMapping("/step-1")
    public String showStep1() {
        return "pages/step-1";
    }

    @RequestMapping("/step-2")
    public String showStep2() {
        return "pages/step-2";
    }

    @RequestMapping("/step-3")
    public String showStep3() {
        return "pages/step-3";
    }

}
