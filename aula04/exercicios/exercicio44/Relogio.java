package exercicios.exercicio44;

public class Relogio {
    private int hr, min, seg;
    boolean flag;

    public Relogio(int hr, int min, int seg) {
        setHr(hr);
        setMin(min);
        setSeg(seg);
    }

    public void setHr(int novaHr) {
        if (novaHr >= 0 && novaHr < 24) {
            hr = novaHr;
        } else {
            flag = true;
        }
    }

    public void setMin(int novoMin) {
        if (novoMin >= 0 && novoMin < 60) {
            min = novoMin;
        } else {
            flag = true;
        }
    }

    public void setSeg(int novoSeg) {
        if (novoSeg >= 0 && novoSeg < 60) {
            seg = novoSeg;
        } else {
            flag = true;
        }
    }

    public void exibirHora() {
        if (flag) {
            System.out.println("Forneça valores válidos");
        } else {
            System.out.printf("%02d:%02d:%02d", hr, min, seg);
        }
    }
}
