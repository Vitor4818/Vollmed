package med.voll.api.controller;


import med.voll.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void cadastrarMedico(@RequestBody DadosCadastroMedico dados){
        System.out.println(dados.nome());
    }

      // public ResponseEntity<Medico> create(@RequestBody Medico medico){
     //   System.out.println(medico);
    //    return ResponseEntity.status(201).body(medico);
   // }
}
