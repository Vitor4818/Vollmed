package med.voll.api.medico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.Endereco.Endereco;

//Criando classe de medicos, que irá representar a tabela de médicos no banco de dados
@Table(name = "medicos")
@Entity(name = "Medico")

@Getter //Usando lombok para criar metodos getters
@NoArgsConstructor //Criando construtor sem parametros com lombok
@AllArgsConstructor //Criando construtor com paramentros com lombok
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();;
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());

    }
}
