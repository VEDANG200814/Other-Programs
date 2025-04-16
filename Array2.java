class Array2{
    public static void main(String[] args) {
        int r=5,c=4;
        char a[][]=new char[r][c];
        int fr=0,fc=0,lr=r-1,lc=c-1;
        int count=1;
        while(count<=r*c){
            for (int i=fc;i<lc;i++)
            a[fr][i]=(char)(64+count++);
            for(int j=fr;j<lr;j++)
            a[j][lc]=(char)(64+count++);
            for(int k=lc;k>=fc;k--)
            a[lr][k]=(char)(64+count++);
            for(int l=lr-1;l>fr;l--)
            a[l][fc]=(char)(64+count++);
            fr++;
            fc++;
            lr--;
            lc--;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}