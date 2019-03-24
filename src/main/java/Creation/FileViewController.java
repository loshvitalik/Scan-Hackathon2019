package Creation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;


@Controller
public class FileViewController {

    @RequestMapping(value="/view", method= RequestMethod.GET)
    public
    String provideUploadInfo(Model model) {
        File folder = new File("src\\main\\resources\\static\\public\\files\\");
        model.addAttribute("files", folder.listFiles());
        return "home";
    }
}