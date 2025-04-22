package med.voll.api.controller;


import med.voll.api.paciente.DadosListagemPacientes;
import med.voll.api.paciente.DadosPaciente;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.pacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteControler {

    @Autowired
    private pacienteRepository repository;

    @PostMapping
    public void cadastrarPaciente(@RequestBody DadosPaciente dados){
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagemPacientes> listarPacientes(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPacientes::new);
    }

}
