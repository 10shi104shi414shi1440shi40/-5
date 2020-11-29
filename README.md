# -5
实验5
### 实验目的
掌握字符串String及其方法的使用
掌握文件的读取/写入方法
掌握异常处理结构

### 实验内容
在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。
文件A包括两部分内容：
一是学生的基本信息；
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：
每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
允许提供输入参数，统计古诗中某个字或词出现的次数
输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
考虑操作中可能出现的异常，在程序中设计异常处理程序

输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>

输出：
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
…………

### 核心代码
···
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
···
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
···

### 实验结果
![image](https://github.com/10shi104shi414shi1440shi40/-5/blob/main/e5f1cc38bcba65f1e2c4b81db23da6c.png)
![image](https://github.com/10shi104shi414shi1440shi40/-5/blob/main/c3aa6bc63e785026c98209926f7bb7d.png)
![image](https://github.com/10shi104shi414shi1440shi40/-5/blob/main/1e96337e7b5981a74fe91ce7dee899b.png)
### 实验感想
这次实验让我学会了如何创建读取写入输出文本文件，在核心代码中第一个代码将字符串覆盖文本文件中的内容，而第二块代码则是将字符串添加到文本文件末尾端，实现添加内容。本次实验让我对这些内容有了深刻的理解，并且提高了我对它们影用的能力。将理论知识用于实践才能提高。
