package struction_composite_pattner.code.college;

public class CollegeClient {

    public static void main(String[] args) {

        SecondLevelCollege college = getInfoCollege("清华大学");
        SecondLevelCollege college2 = getArchitectureCollege("清华大学");

        FirstLevelCollege university = new FirstLevelCollege("清华大学");
        university.add(college);
        university.add(college2);
        university.print();

        System.out.println();
        SecondLevelCollege college3 = getInfoCollege("北京大学");
        SecondLevelCollege college4 = getArchitectureCollege("北京大学");

        FirstLevelCollege university2 = new FirstLevelCollege("北京大学");
        university2.add(college3);
        university2.add(college4);

        university2.print();

    }

    private static SecondLevelCollege getInfoCollege(String universityName) {
        FourthLevelCollege class1 = new FourthLevelCollege(universityName + "-信息学院-计算机系-1201");
        FourthLevelCollege class2 = new FourthLevelCollege(universityName + "-信息学院-计算机系-1202");
        FourthLevelCollege class3 = new FourthLevelCollege(universityName + "-信息学院-计算机系-1203");

        ThirdLevelCollege department = new ThirdLevelCollege(universityName + "-信息学院-计算机系");
        department.add(class1);
        department.add(class2);
        department.add(class3);

        FourthLevelCollege class4 = new FourthLevelCollege(universityName + "-信息学院-信息管理系-1201");
        FourthLevelCollege class5 = new FourthLevelCollege(universityName + "-信息学院-信息管理系-1202");
        FourthLevelCollege class6 = new FourthLevelCollege(universityName + "-信息学院-信息管理系-1203");

        ThirdLevelCollege department2 = new ThirdLevelCollege(universityName + "-信息学院-信息管理系");
        department2.add(class4);
        department2.add(class5);
        department2.add(class6);

        SecondLevelCollege college = new SecondLevelCollege(universityName + "-信息学院");
        college.add(department);
        college.add(department2);
        return college;
    }

    private static SecondLevelCollege getArchitectureCollege(String universityName) {
        FourthLevelCollege class1 = new FourthLevelCollege(universityName + "-建筑学院-土木工程系-1201");
        FourthLevelCollege class2 = new FourthLevelCollege(universityName + "-建筑学院-土木工程系-1202");
        FourthLevelCollege class3 = new FourthLevelCollege(universityName + "-建筑学院-土木工程系-1203");

        ThirdLevelCollege department = new ThirdLevelCollege(universityName + "-建筑学院-土木工程系");
        department.add(class1);
        department.add(class2);
        department.add(class3);

        FourthLevelCollege class4 = new FourthLevelCollege(universityName + "-建筑学院-建筑环境与能源应用工程-1201");
        FourthLevelCollege class5 = new FourthLevelCollege(universityName + "-建筑学院-建筑环境与能源应用工程-1202");
        FourthLevelCollege class6 = new FourthLevelCollege(universityName + "-建筑学院-建筑环境与能源应用工程-1203");

        ThirdLevelCollege department2 = new ThirdLevelCollege(universityName + "-建筑学院-建筑环境与能源应用工程");
        department2.add(class4);
        department2.add(class5);
        department2.add(class6);

        SecondLevelCollege college = new SecondLevelCollege(universityName + "-建筑学院");
        college.add(department);
        college.add(department2);
        return college;
    }
}
