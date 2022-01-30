import meta.rule.符合规则;
import meta.rule.违反规则;

import java.util.Scanner;

@违反规则(value = "1.1", how = "测试类不能在项目类中引用")
public class 类1 /*extends 测试类1*/{
    @符合规则("支持公共类的psvm")
    public static void main(String[] args) {
        @符合规则("使用import引入类名到局部变量的声明")
        Scanner in = new Scanner(System.in);
    }
}
