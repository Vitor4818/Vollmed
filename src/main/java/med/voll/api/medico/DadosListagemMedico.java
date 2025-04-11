package med.voll.api.medico;

public record DadosListagemMedico(String nome, String email, String crm, Especialidade especialidade) {

    //Construtor necessário para a conversão do DTO para um Objeto do tipo Médico
    public DadosListagemMedico(Medico medico){
        this(medico.getNome(),
                medico.getEmail(),
                medico.getCrm(),
                medico.getEspecialidade());
    }
}
