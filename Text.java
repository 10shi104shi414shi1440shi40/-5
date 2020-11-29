import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
public class Text {
    public static void main(String args[]){
        String g="汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行....\n"+
                "\n";
        Students a = new Students("赵","计1","男",g);
        System.out.println("请输入要查询出现次数的词：");
        Scanner scan1 = new Scanner(System.in);
        String read1 = scan1.next();
        try{
            File file = new File("D:\\作业","B.txt");
            //如果没有文件创建新文件
            if(!file.exists()){
                file.createNewFile();
            }
            //true = append file
            FileWriter fw1 = new FileWriter(file);
            fw1.write(read1);
            fw1.close();
        }
        catch(IOException e){
            System.out.println("文件打开失败");
        }
        File file2 = new File("D:\\作业","A.txt");
        int count = 0;
        char[] char2 = g.toCharArray();
        for (int i=0; i < char2.length; i++) {
            if (read1.indexOf(char2[i])>=0) {
                count++;
            }
        }
        String g2 = "词”"+read1+"”出现了"+count+"次";
        System.out.println (g2);
        try {
            Writer fw3 = new FileWriter(file2,true);
            fw3.write("\n"+g2);
            fw3.flush();
            fw3.close();
            System.out.println("已将答案写入文本");
        }
        catch(IOException e){
            System.out.println("读取文件失败");
        }
    }
}
