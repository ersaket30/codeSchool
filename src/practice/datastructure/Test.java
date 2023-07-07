package practice.datastructure;


public class Test {

   private static Test test = null;

   private Test(){

   }

   public static Test getTest(){
       if(test == null){
           synchronized(Test.class) {
               if(test == null)
                    test = new Test();
           }
       }
       return test;
   }

}
