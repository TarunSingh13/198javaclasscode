package Abstract;

abstract class Student {
    abstract void attendclass(String name);
    abstract void giveExam(String name);
    void Greeting(String name) {
        System.out.println(name + " , you are welcome !");
    }
}
