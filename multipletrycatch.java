class multipletrycatch{
    public static void main(String args[]){
        try{
            System.out.println(args[1]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Argument index out of bounds");
        }
        try{
            int x=0;
        int y=10;
        int z=y/x;
        System.out.println(z);
        }
        catch(ArithmeticException a){
            System.out.println("Arithmatic exception zero division");
        }        
    }
}