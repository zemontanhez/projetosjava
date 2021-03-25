public class Placar {
    public String timeCasa;
    public String timeVis;
    public int golCasa;
    public int golVis;

    public Placar(){
        this.timeCasa = "Time da Casa";
        this.timeVis = "Time Visitante";
        this.golCasa = 0;
        this.golVis = 0;
    }

    public Placar(String timeCasa,String timeVis){
        this.timeCasa = timeCasa;
        this.timeVis = timeVis;
        this.golCasa = 0;
        this.golVis = 0;
    }

    public Placar(String timeCasa,int golCasa,String timeVis,int golVis){
        this.timeCasa = timeCasa;
        this.timeVis = timeVis;
        this.golCasa = golCasa;
        this.golVis = golVis;
    }
}

