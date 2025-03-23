package med.voll.api.controller;


import med.voll.api.paciente.DadosPaciente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteControler {

    @PostMapping
    public void cadastrarPaciente(@RequestBody DadosPaciente dados){
        System.out.println(dados);
    }

}
