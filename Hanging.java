class Hanging{
    public static void main(String[] args) {
        int i,j,c=0,a=4;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(i+c+" ");
                c+=a;
                a--;
            }
            System.out.println();
            c=0;
            a=4;
        }
    }
}