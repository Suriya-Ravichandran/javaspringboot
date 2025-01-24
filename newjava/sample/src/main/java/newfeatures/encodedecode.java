package newfeatures;
import java.util.Base64;
public class encodedecode {

	public static void main(String[] args) {
		Base64.Encoder encode=Base64.getUrlEncoder();
      String a=encode.encodeToString("https://www.livewirehub.com/".getBytes());
      System.out.println("Encoded Data:"+a);
      
      Base64.Decoder decode=Base64.getUrlDecoder();
      String b=new String(decode.decode(a));
      System.out.println("Decoded Data:"+b);


	}
}