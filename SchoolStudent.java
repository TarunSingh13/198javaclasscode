package Abstract;

class SchoolStudent extends Student{
    @Override
    void attendclass(String name) {
        System.out.println(name + " attends class at ground floor");
    }
    @Override
    void giveExam(String name) {
        System.out.println(name + " you have to give pen paper base exam");
    }
}
