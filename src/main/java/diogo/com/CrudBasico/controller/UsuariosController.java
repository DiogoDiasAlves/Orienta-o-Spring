package diogo.com.CrudBasico.controller;

import diogo.com.CrudBasico.entities.Usuarios;
import diogo.com.CrudBasico.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api") // Agrupa os endpoints
public class UsuariosController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping("/")
    public String usuario() {
        return "Seja bem-vindo";
    }

    @GetMapping("/usuarios")
    public List<Usuarios> selecionar() {
        return usuariosRepository.findAll();
    }

    @GetMapping("/usuarios/{codigo}")
    public Usuarios selecionarPeloCodigo(@PathVariable int codigo) {
        return usuariosRepository.findByCodigo(codigo);
    }

    @GetMapping("/usuarios/contador")
    public long contador() {
        return usuariosRepository.count();
    }

    @PutMapping("/usuarios")
    public Usuarios editar(@RequestBody Usuarios obj) {
        return usuariosRepository.save(obj);
    }

    @PostMapping("/usuarios")
    public Usuarios cadastrar(@RequestBody Usuarios obj) {
        return usuariosRepository.save(obj);
    }

    @DeleteMapping("/usuarios/{codigo}")
    public void remover(@PathVariable int codigo) {
        Usuarios obj = selecionarPeloCodigo(codigo);
        usuariosRepository.delete(obj);
    }

    @GetMapping("/usuarios/ordenarNomes")
    public List<Usuarios> ordenarNomes() {
        return usuariosRepository.findByOrderByNome();
    }
}
