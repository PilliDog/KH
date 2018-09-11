/**
 * 공부하자
 * https://programmingsummaries.tistory.com/64
 * http://jeong-pro.tistory.com/69
 * http://mainia.tistory.com/631
 * https://code.i-harness.com/ko-kr/q/15303a 	//close
 * https://stackoverflow.com/questions/1388602/do-i-need-to-close-both-filereader-and-bufferedreader 	//close
 */
package ncs.test1;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class StreamTest {

	public static void main(String[] args) {
		
		 try{
			 	//파일 객체를 생성
			 	File file = new File("D:\\KH\\NCS\\src\\ncs\\test1\\Sample.txt");
			 	//파일 입력 스트림
	            FileReader filereader = new FileReader(file);
	            //버퍼 스트림
	            BufferedReader bufReader = new BufferedReader(filereader);
	            
	            String line;
	            
	            //Reads a line of text. 
	            //A line is considered to be terminated by any oneof a line feed ('\n)
	            //>> readLine은 줄단위로 읽는다(버퍼), 줄 개행은 읽지 않음
	            while((line = bufReader.readLine()) != null){
	                System.out.println(line);
	            }
	            
	            //버퍼의 내용을 강제로 출력함 >> flush, close는 auto-flush
	            //핸들의 의미를 찾아보자
	            bufReader.close();
	        }catch (FileNotFoundException e) {
	        }catch(IOException e){
	            System.out.println(e);
	        }
	}

}
