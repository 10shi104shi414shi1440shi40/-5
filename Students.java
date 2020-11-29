import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Students {
    String name;
    String banji;
    String xingbie;
    String zuoye;
    Students (String a,String b,String c,String d){
        this.name = a;
        this.banji = b;
        this.xingbie = c;
        this.zuoye = d;

        //处理作业
        char[] chars = zuoye.toCharArray();
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            s.append(chars[i]);
            if (i%7==6 && i%14!=13) {
                s.append("，");
            }
            if (i%14==13) {
                s.append("。\n");
            }
        }
        String f = "姓名："+name+" 班级："+banji+" 性别："+xingbie+"\n作业：\n"+s;
        try{
            File file = new File("D:\\作业","A.txt");
            //如果没有文件创建新文件
            if(!file.exists()){
                file.createNewFile();
            }
            //true = append file
            FileWriter fileWritter = new FileWriter(file);
            fileWritter.write(f);
            fileWritter.close();
            System.out.println("文件写入成功");
            System.out.println("结果为：\n"+f);
        }catch(IOException e){
            System.out.println("文件打开失败");
        }
    }
}
