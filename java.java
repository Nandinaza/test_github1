import java.io.IOException;
public class java{
       public static void main (String[] args)throws IOException {
              System.out.println("hello world");
              main.test();
              
              teman teman1 = new teman("muo");
              teman1.show((byte)0);
              //ini saya tamba
              
              ProcessBuilder pb = new ProcessBuilder();
              pb.command("cd ..");
              Process pro = pb.start();
              //String result = read(pro);
       }
}
class main{
       int a = 50;
       static void test(){
              int indek[] = new int[10];
              try {
                     System.out.println(indek[99]);
              } catch(Exception e) {
                     System.out.println(e);
              }
              
//ini multiline
       }
}