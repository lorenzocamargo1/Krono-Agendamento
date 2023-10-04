package Model;

/**
 * Classe que representa um serviço.
 * Armazena informações sobre o serviço, como ID, descrição, peso da carga, cidades de origem e destino,
 * taxa por kg e preço por km.
 * 
 * Esta classe possui um construtor para inicialização e um método para calcular o valor do serviço.
 * Os IDs das cidades começam a partir de 1.
 * 
 * @author loren
 */
public class Servico {
    private int id; // Identificador único do serviço
    private String descricao; // Descrição do serviço
    private float valor; // Valor do serviço calculado
    private float taxaPorKgKronoLog = 1102; // Taxa por kg para o serviço KronoLog
    private float precoPorKmKronoLog = 2500; // Preço por km para o serviço KronoLog
    private float taxaPorKgKronoDrive = 15; // Taxa por kg para o serviço KronoDrive
    private float precoPorKmKronoDrive = 10; // Preço por km para o serviço KronoDrive
    private int pesoDaCargaEmKg; // Peso da carga em kg
    private int cidadeOrigem; // ID da cidade de origem
    private int cidadeDestino; // ID da cidade de destino
    private int kilosInt;
    private int valorOF;
    //Array de distâncias entre cidades
    private float[][] distancias = {
    {0, 430, 586, 1020, 858, 1617, 1850, 704},    // Cidade 1 (São Paulo)
    {430, 0, 434, 924, 1160, 1926, 2035, 1026},   // Cidade 2 (Rio de Janeiro)
    {586, 434, 0, 716, 624, 1118, 1310, 716},     // Cidade 3 (Belo Horizonte)
    {1020, 924, 716, 0, 173, 1453, 2062, 1450},   // Cidade 4 (Brasília)
    {858, 1160, 624, 173, 0, 1383, 1877, 837},    // Cidade 5 (Goiânia)
    {1617, 1926, 1118, 1453, 1383, 0, 879, 3330}, // Cidade 6 (Salvador)
    {1850, 2035, 1310, 2062, 1877, 879, 0, 3320}, // Cidade 7 (Recife)
    {704, 1026, 716, 1450, 837, 3330, 3320, 0}    // Cidade 8 (Curitiba)
    };

    /**
     * Construtor para inicializar um serviço com informações detalhadas.
     * 
     * @param descricao Descrição do serviço.
     * @param pesoDaCargaEmKg Peso da carga em kg.
     * @param cidadeOrigem ID da cidade de origem.
     * @param cidadeDestino ID da cidade de destino.
     */
    public Servico( String descricao, String pesoDaCargaEmKg, int cidadeOrigem, int cidadeDestino) {
        
        this.descricao = descricao;
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
    try {
        kilosInt = Integer.parseInt(pesoDaCargaEmKg);
    } catch (NumberFormatException e) {
        // Tratar erro de conversão, se necessário
        kilosInt = 0; // Ou defina um valor padrão
    }
        calcularValor(); // Calcula o valor do serviço ao inicializar
    }

    /**
     * Método privado para calcular o valor do serviço.
     */
    private void calcularValor() {
        if (cidadeOrigem >= 1 && cidadeOrigem <= distancias.length &&
        cidadeDestino >= 1 && cidadeDestino <= distancias[0].length) {
        float distanciaEmKm = distancias[cidadeOrigem - 1][cidadeDestino - 1];
        if (descricao.equals("KronoLog")) {
            this.valor = kilosInt * taxaPorKgKronoLog + distanciaEmKm * precoPorKmKronoLog;
        } else if (descricao.equals("KronoDrive")) {
            this.valor = kilosInt * taxaPorKgKronoDrive + distanciaEmKm * precoPorKmKronoDrive;
        }
      }
    }
    
    /**
     * Obtém o valor do serviço.
     * 
     * @return O valor do serviço.
     */
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getKilosInt() {
        return kilosInt;
    }

    public void setKilosInt(int kilosInt) {
        this.kilosInt = kilosInt;
    }

}
