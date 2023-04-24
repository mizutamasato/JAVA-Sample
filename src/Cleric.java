import java.util.Random;

public class Cleric {
	String name = "僧侶";
	int HP = 50;
	final int maxHp = 50;
	int MP = 10;
	final int maxMp = 10;

    public void selfaid() {
	   this.MP -= 5; 
	   this.HP += this.maxHp;
    }
    public int pray(int sec) {
    	int recover = new Random().nextInt(3) + sec;
    	int recoverActual = Math.min(this.maxMp - this.MP, recover);
    	this.MP += recoverActual;
    	return recoverActual;
    }
}
