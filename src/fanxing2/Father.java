package fanxing2;

/**
 *泛型父类
 * 我理解的泛型继承 泛型类同其他的类一样可以被继承,在泛型类的定义过程中类型的指定通过在类名后面加<T>来指定.
 * 通过子类是否继承泛型分为保留和不保留 保留分为完全保留和部分保留  完全保留是子类全部继承父类的泛型还可以添加自己
 * 定义的泛型 反正是子类继承的泛型类型一定要比父类多
 */

public abstract class Father<T1,T2> {
    T1 age;
    public void test(T2 name) {

    }

}

//保留
//不保留  是否保留还是看设计 因为如果你在继承的时候父类已经确定了 <E> 那这个E必须实现,剩下的可以按需实现,也就是子类继承父类的时候
//只能多不能少
class C1<T1,T2> extends Father<T1,T2>{
    @Override
    public void test(T2 name) {

    }
} //保留
class C2<T2> extends Father<Integer,T2>{} //部分保留
class C3 extends Father<Integer,String>{}  //不保留 指定具体 泛型只能用于组合类型 composite 类型
class C4 extends Father{} //不保留 没有类型(这尼玛就是擦除) 在这里类似于<Object,Object>