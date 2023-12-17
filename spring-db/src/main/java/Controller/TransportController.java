package Controller;


import com.sun.jdi.connect.Transport;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;

@Controller
@RequiredArgsConstructor
public class TransportController {
    private final TransportService transportService;
    @GetMapping(path = "/transport")
    public @ResponseBody List<Transport> getAllTransport() {
        return TransportService.findAll();
    }
}

