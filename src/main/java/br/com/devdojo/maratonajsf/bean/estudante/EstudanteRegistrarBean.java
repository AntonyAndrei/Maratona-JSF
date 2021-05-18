package br.com.devdojo.maratonajsf.bean.estudante;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by Antony Andrei on 17/05/2021.
 */

@Named
public class EstudanteRegistrarBean implements Serializable{
    private Estudante estudante = new Estudante();

    public Estudante getEstudante() {
        return estudante;
    }

    private String[] nomesArray= {"DevDojo", "Antony", "Andrei"};
    private List<String> nomesList = asList("Fulano", "Silva", "Fuzildo");
    private Set<String> nomesSet = new HashSet<>(asList("Goku", "Vegeta", "Beerus"));
    private Map<String, String> nomesMap = new HashMap<>();

    {
        nomesMap.put("Goku" , "O mais Forte");
        nomesMap.put("One Piece" , "O mais longo");
        nomesMap.put("Naruto" , "Filler apenas");

    }

    public void executar(){
        System.out.println("Fazendo uma busca no BD");
        System.out.println("Processando os Dados");
        System.out.println("Exibindo os dados");
    }

    public void executar(String parametro){
        System.out.println("Fazendo uma busca no BD com o PARAMETRO: " + parametro);
        System.out.println("Processando os Dados");
        System.out.println("Exibindo os dados");
    }

    public String executarRetorno(String parametro){
        return "Quem eh o lindao? " + parametro;
    }

    public String irParaIndex2(){
        return "index2?faces-redirect=true";
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}