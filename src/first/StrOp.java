

package first;


public class StrOp {
     
    public String value;
    public StrOp(String S)
    {
        this.value=S;
    }
     
    public char [] StrToArr()
    {
        char [] C =new char[value.length()];
        for(int i = 0 ; i< C.length;i++)
        {
            C[i] = value.charAt(i);
        }
        return C;
    }
    
}
