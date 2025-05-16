public class Data {
    
    // Atributos
    private int dia;
    private int mes;
    private int ano; 

    // Construtor com validação de data
    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida!"); // Atribuindo data padrão: 1/1/2000
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

     // Método para validar a data
    private boolean validarData(int dia, int mes, int ano) {
        // Verifica meses válidos
        if (mes < 1 || mes > 12) {
            return false;
        }

        // Verifica dias válidos
        if (dia < 1 || dia > 31) {
            return false;
        }

        // Verifica meses com 30 dias
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        }

        // Verifica mês de fevereiro
        if (mes == 2) {
            if (bissexto(ano)) {
                if (dia > 29) return false;
            } else {
                if (dia > 28) return false;
            }
        }
        return true; // Se todos os testes passarem, a data é válida
    }

    // Método para verificar se o ano é bissexto
    private boolean bissexto(int ano) {
        return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
    }
    
    // Getters e Setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para verificar se o ano é bissexto
    public boolean verificaAnoBissexto() {
        return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
    }

    // Método para verificar se a data é maior ou igual a outra data
    public boolean maiorOuIgualQue(Data outraData) {
        if (this.ano > outraData.ano) {
            return true;
        } else if (this.ano == outraData.ano) {
            if (this.mes > outraData.mes) {
                return true;
            } else if (this.mes == outraData.mes) {
                return this.dia >= outraData.dia;
            }
        }
        return false;
    }

    // Método toString para exibir a data no formato dd/mm/aaaa
     @Override
    public String toString() {
    return dia + "/" + mes + "/" + ano;
    }

}
