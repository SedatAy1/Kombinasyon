import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int i, f, k, n, r, fark;

        Scanner scanner=new Scanner(System.in);
        System.out.println("C(n,r) kombinasyonu hesaplamak için: ");
        System.out.print("n değerini giriniz: ");
        n=scanner.nextInt();
        System.out.print("r değerini giriniz");
        r=scanner.nextInt();
        int totaln=1;
        int totalr=2;
        int totalfark=1;
        fark=(n-r);
        for (i=1; i<=n; i++){
            totaln=totaln*i;
        }for (k=1; k<=r; k++){
            totalr=totalr*k;
        }for (f=1; f<=fark; f++){
            totalfark=totalfark*f;
        }

int formul=totaln/(totalr*totalfark)     ;
        System.out.println("C("+n+","+r+")= "+formul);

    }
}
