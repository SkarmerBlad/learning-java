public class Libro{
  
  //variabili d'istanza
  private int annoPubblicazione;
  private double costoLibro;
  private String nomeAutore;
  private String titoloLibro;
  private String genereLibro;

  //costruttore
  public Libro(String titoloLibro, String nomeAutore, int annoPubblicazione, double costoLibro){
    this.annoPubblicazione = annoPubblicazione;
    this.nomeAutore = nomeAutore;
    this.costoLibro = costoLibro;
    this.titoloLibro = titoloLibro;
    this.genereLibro = genereLibro;
  }

  //metodi getter
  public String getTitolo(){
    return this.titoloLibro;
  }

  public String getAutore(){
    return this.nomeAutore;
  }

  public int getAnno(){
    return this.annoPubblicazione;
  }

  public double getCosto(){
    return this.costoLibro;
  }

  public String getGenere(){
    return this.genereLibro
  }

  public void stampaInformazioni(){
    System.out.println("Titolo: " + this.titoloLibro);
  }
}
