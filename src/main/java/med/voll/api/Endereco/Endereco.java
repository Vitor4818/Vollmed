package med.voll.api.Endereco;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.medico.DadosEndereco;

//Classe que representa um endereço e será incorporada em outras entidades com @Embedded
@AllArgsConstructor    //  Criando construtos parametrizado
@Getter               //   Criando metodos getters
@NoArgsConstructor (access = AccessLevel.PUBLIC)   //    Criando construtor sem parametros
@Embeddable
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;


    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }


    public Endereco() {
    }
}
