import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
Service service = new Service();

@GetMapping("/marcas")
    public String consultarMarcas();
}
@GetMapping("/modelos/{marcas}")
public String consultarModelos(@PathVariable int marca){
    return service.consultarModelos(marca);
}
@GetMapping("/anos/{marca}/{modelo}")
public String consultarAnos(@PathVariable int marca, @PathVariable int modelo){
    return service.consultarAnos(marca, modelo);
}



