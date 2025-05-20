import java.util.Scanner;

public class DSHOCSINH {
    private HOCSINH ds[];
    private int n;

    public void nhapDs(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ds = new HOCSINH[n];
        for (int i = 0 ; i < n ;i++){
            ds[i] = new HOCSINH();
            ds[i].input();
        }
    }
    public void xuatDs(){
        for (HOCSINH i : ds){
            i.output();
        }
    }

    public void sapXep(){
        for (int i = 0 ; i < n - 1 ; i++){
            for(int j = i +1 ; j < n ;j++ ){
                if(ds[i].getGpa() > ds[j].getGpa()){
                    float tmp = ds[i].getGpa();
                    ds[i].setGpa(ds[j].getGpa());
                    ds[j].setGpa(tmp);
                }
            }

        }
        xuatDs();
    }
}