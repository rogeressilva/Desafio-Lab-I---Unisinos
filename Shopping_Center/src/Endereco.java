public class Endereco {
    
    // Atributos    
    private String rua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    // Construtor para receber os atributos
    public Endereco(String rua, String cidade, String estado, String pais, String cep, String numero, String complemento) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    // Getters e Setters
    public String getRua() {
        return rua;
    }

    public void setRua(String nomeDaRua) {
        this.rua = nomeDaRua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    // Método toString para exibir a endereço completo
     @Override
    public String toString() {
    return "Endereço: " + rua + ", " + numero + ", " + complemento + ", " + cidade + ", " + estado + ", " + pais + ", CEP: " + cep;
    }
}
