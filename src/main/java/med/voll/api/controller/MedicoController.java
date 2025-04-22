package med.voll.api.controller;


import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.DadosListagemMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {



    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarMedico(@RequestBody @Valid  DadosCadastroMedico dados){
        // Covertendo o DTO para um Objeto do tipo Medico, e salvando no banco de dados
        repository.save(new Medico(dados));

    }

        //Não é necessario o uso de @Transactional pois estamos apenas listando os dados do banco de dados
    //   @GetMapping
    //   public List<DadosListagemMedico> listarMedico(){   //recebe um DTO como parametros e retorna uma lista
    //     return repository.findAll().stream().map(DadosListagemMedico::new).toList(); //Converte o DTO para Objetos do tipo Medico
    //   }

    //Criando metodo GET com paginação
    @GetMapping
    public Page<DadosListagemMedico> listarMedico(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){  // Recebe classe Pageable para a paginação
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }




}
