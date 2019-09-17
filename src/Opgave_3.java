public class Opgave_3 {
    public static void main(String[] args) {
        //Test case hvor sidste værdi er midterst
        //Input: a = 6, b = 10, c = 8
        //Forventet output: 8

        //input
        int a = 6;
        int b = 10;
        int c = 8;

        //forventet output
        int output = midterst(a, b, c);

        if (output == 8){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }


        //Test case hvor midterste værdi er midterst
        //Input: a = 3, b = 7, c = 2
        //Forventet output 3

        //Test case hvor midterste værdi er midterst
        //Input: a = 10, b = 25, c = 50
        //Forventet output = 25
    }
}
