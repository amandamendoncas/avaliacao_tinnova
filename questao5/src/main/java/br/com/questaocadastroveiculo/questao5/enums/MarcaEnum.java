package br.com.questaocadastroveiculo.questao5.enums;

public enum MarcaEnum {
    TOYOTA("toyota"),
    VOLKSWAGEN("volkswagen"),
    HYUNDAI("hyundai"),
	FORD("ford"),
	HONDA("honda"),
	NISSAN("nissan"),
	CHEVROLET("chevrolet"),
	KIA("kia"),
	MERCEDES_BENZ("mercedes-benz"),
	BMW("bmw"),
	FIAT("fiat");
	 

    private String descricao;

    MarcaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public static MarcaEnum fromString(String text) {
        for (MarcaEnum marca: MarcaEnum.values()) {
            if (marca.descricao.equalsIgnoreCase(text)) {
                return marca;
            }
        }
        throw new IllegalArgumentException(text);
    }

}
