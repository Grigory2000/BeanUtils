/**
 * Created by Григорий on 20.12.2016.
 */

public class Main {
    public static void main(String[] args) {
        Person User1 = new Person("User1", 72, false, 156);
        Person User2 = new Person("User2", 22, true, 200);

        BeanUtils.assign(User2,User1);

        System.out.println(User2.toString());
        System.out.println(User1.toString());
    }
}
