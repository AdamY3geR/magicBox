
public class Magicbox
{
    public static void main(String[] args)
    {
        int [][]box= {{1,10,4},
                      {8,5,2},
                      {6,0,9}};
        int rowvalue = row(box);
        int colvalue = col(box);
    }
    public static int row(int[][] box)
    {
        int num = 0, num1=0, num2=0, num3=0, num4=0, num5=0, finalnum=0;
        for (int r = 0; r  < box.length; r++)
        {
            for (int c = 0; c < box[r].length; c++)
            {
                if (r == 0)
                {
                    num = num + box[r][c];
                    num3 = num;
                }
                else if (r == 1)
                {
                    num1= num1 +box[r][c];
                    num4 = num1;
                }
                else if (r==2)
                {
                    num2= num2+box[r][c];
                    num5 = num2;
                }
            }
        }
        finalnum=num3+num4+num5;
        return finalnum;
    }
    public static void col(int[][] box)
    {
        int num=0, num1=0, num2=0;
        for (int c1 = 0; c1 < box[0].length; c1++)
        {
            for (int r1 = 0; r1 < box[0].length; r1++)
            {
                if (c1 == 0)
                {
                    num = num+box[r1][c1];
                }
                else if (c1 == 1)
                {
                    num1 = num1+box[r1][c1];
                }
                else if (c1 == 2)
                {
                    num2 = num2+box[r1][c1];
                }
            }
        }
    }
}