class uncheckedexception{
    public static void main(String args[]){
        /*try{
            int x=0;
            int y=50/x;
            System.out.println("y= "+y);
        }
        catch(ArithmeticException e){
            System.out.println("Division zero");
        }
        System.out.println("after catch statement");*/
        try{
            for(int i=0;i<=args.length;i++)
            System.out.println(args[i]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            
        }
        System.out.println("Thank you");
    }
}
