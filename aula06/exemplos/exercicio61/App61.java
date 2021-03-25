public class App61 {
    public static void main(String[] args) {
        Placar a = new Placar();
        Placar b = new Placar("Palmeiras","Santos");
        Placar c = new Placar("Palmeiras",0,"Santos",1);

        System.out.println("a: " + a.timeCasa + " " + a.golCasa + " X " + a.golVis + " " + a.timeVis);
        System.out.println("b: " + b.timeCasa + " " + b.golCasa + " X " + b.golVis + " " + b.timeVis);
        System.out.println("c: " + c.timeCasa + " " + c.golCasa + " X " + c.golVis + " " + c.timeVis);

    }    
}