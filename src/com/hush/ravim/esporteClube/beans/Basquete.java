package com.hush.ravim.esporteClube.beans;

import java.time.LocalDate;

public class Basquete extends EsporteProfissional {

	public Basquete(String nome, byte jogadoresPorEquipe, String tipo, String equipamento, String local, LocalDate fundacao,
			String posicao, String estadio, String tecnicoPrincipal, String liga, String site, String apelido,
			String federacaoMaisAlta) {
		super(nome, jogadoresPorEquipe, tipo, equipamento, local, fundacao, posicao, estadio, tecnicoPrincipal, liga, site,
				apelido, federacaoMaisAlta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Basquete [getEstadio()=" + getEstadio() + ", getTecnicoPrincipal()=" + getTecnicoPrincipal()
		+ ", getLiga()=" + getLiga() + ", getSite()=" + getSite() + ", getApelido()=" + getApelido()
		+ ", getFederacaoMaisAlta()=" + getFederacaoMaisAlta() + ", getPosicao()=" + getPosicao()
		+ ", getNome()=" + getNome() + ", getJogadoresPorEquipe()=" + getJogadoresPorEquipe() + ", getTipo()="
		+ getTipo() + ", getEquipamento()=" + getEquipamento() + ", getLocal()=" + getLocal()
		+ ", getFundacao()=" + getFundacao() + ", getClass()=" + getClass() + "]";
	}


}
