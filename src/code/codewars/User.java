package code.codewars;

public class User {

    int rank;
    int progress;

    public User() {
        rank = -8;
        progress = 0;
    }

    public User(int rank, int progress){


        this.rank = rank;
        this.progress = progress;
    }

    public void incProgress(int activity) {
        this.progress += (activity - this.rank) * (activity - this.rank) * 10;
        if (rank<8) {
            while (this.progress >= 100) {
                this.rank++;
                this.progress -= 100;
                if(this.rank==8) break;
                if(this.rank==0) this.rank++;
            }
        }
    }

}

class Main{
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.rank); // => -8);
        System.out.println(user.progress); // => 0);
        user.incProgress(-7);
        System.out.println(user.progress); // => 10);
        user.incProgress(-5); // will add 90 progress);
        System.out.println(user.progress); // => 0 // progress is now zero);
        System.out.println(user.rank); // => -7 // rank was upgraded to -7);
        user.incProgress(8);
        user.incProgress(8);
        user.incProgress(8);
        System.out.println(user.rank);
        System.out.println(user.progress);
    }
}
