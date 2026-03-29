class Solution {
    public boolean canBeEqual(String s1, String s2) {
        
        if(s1.equals(s2))
        {
            return true;
        }
        
        char c[]=s1.toCharArray();
        char c1=c[0];
        c[0]=c[2];
        c[2]=c1;
        String s=new String(c);
        if(s.equals(s2))
        {
            return true;
        }
       
        char c2=c[1];
        c[1]=c[3];
        c[3]=c2;
        String st=new String(c);
        if(st.equals(s2))
        {
            return true;
        }
        
        char z[]=s1.toCharArray();
        char z1=z[1];
        z[1]=z[3];
        z[3]=z1;
        String x=new String(z);
        System.out.print(x);
        if(x.equals(s2))
        {
            return true;
        }
        
        return false;
    }
}