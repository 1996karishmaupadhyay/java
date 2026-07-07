public class ImmutableClasses {
    public static void main(String[] args){
    College college = new College("XYZ College", "123 Main St");
    StudentDemo s1=new StudentDemo(22,"aarzu",college);
    s1.getCollege().cname="ABC College";
    System.out.println(s1.getAge());
    System.out.println(s1.getName());
    System.out.println(s1.getCollege().getCName());
    System.out.println(s1.getCollege().getAddress());
    }
  
    }

    
     final class StudentDemo{
        private final int age;
        private final String name;
        private final College college;

        StudentDemo(int age,String name,College college){
            this.age=age;
            this.name=name;
            this.college=college;
        }

        public int getAge(){
            return age;
        }

        public String getName(){
            return name;
        }

        public College getCollege(){
            return college;
        }
    }


    // class StudentErr extends StudentDemo{
       
    // }



    class College{
        String cname;
        String address;
        College(String name,String address){
            this.cname=name;
            this.address=address;
        }

        public String getCName(){
            return cname;
        }
        public String getAddress(){
            return address;
        }
       
    }