package xyz.mofangserver.sasys.main;

import xyz.mofangserver.sasys.fuctions.*;
import xyz.mofangserver.sasys.template.*;
import java.util.Scanner;

/**
 * @author z_yu
 * @version 0.6
 * @serial SASYS(SchoolAdminSystem)
 * @since 0.1
 */
public final class Main {
	public static Student[] stuArr = new Student[99999];
	public static Teacher[] teaArr = new Teacher[99999];
	public static Administrators[] admArr = new Administrators[99999];
	public static int chose1;

	@SuppressWarnings({ "static-access" })
	public final static void main(String[] args) {
		String Equals;
		@SuppressWarnings("resource")
		Scanner setIn = new Scanner(System.in);
		EmptyPlaceholder phr = new EmptyPlaceholder();
		Admin a = new Admin();
		AdministratorsAdmin c1 = new AdministratorsAdmin();
		TeacherAdmin c2 = new TeacherAdmin();
		GetNowTime time = new GetNowTime();
		System.out.println("#########################################################");
		System.out.println("#####=========##############|#######|####||#######||#####");
		System.out.println("#############/###############|#####|#####||#######||#####");
		System.out.println("############/#################|###|######||#######||#####");
		System.out.println("##########/#####################||#######||#######||#####");
		System.out.println("########/#######################||#######||#######||#####");
		System.out.println("#######/########################||#######||=======||#####");
		System.out.println("#####=========#####=======######||################||#####");
		System.out.println("#########################################################");
		System.out.println("#####################################################2020");
		System.out.println("Loading SASYS(SchoolAdminSystem)......");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		while (true) {
			phr.printPlaceholder(2);
			System.out.println("========学校管理系统========");
			System.out.println("现在时间:" + time.Date());
			System.out.println("1:进入学生管理系统");
			System.out.println("2:进入教师管理系统");
			System.out.println("3:进入管理人员管理系统");
			System.out.println("4:管理模板开关");
			System.out.println("666:退出系统");
			System.out.println("请输入选择的功能编号:");
			if (setIn.hasNextInt()) {
				chose1 = setIn.nextInt();
			} else {
				System.err.println("非法输入!请检查!");
			}
			switch (chose1) {
			case 1:
				while (true) {
					phr.printPlaceholder(2);
					System.out.println("==========学生管理系统==========");
					System.out.println("1:添加一个学生");
					System.out.println("2:查找一个学生");
					System.out.println("3:根据编号更新学生的基本信息");
					System.out.println("4:根据编号删除学生");
					System.out.println("5:根据编号输入学生的各门成绩");
					System.out.println("6:根据某门成绩进行排序");
					System.out.println("7:根据总分进行排序");
					System.out.println("8:打印学生信息");
					System.out.println("9:打印学生成绩报告");
					System.out.println("666:返回上级菜单");
					System.out.println("你要执行的功能:");
					Equals = setIn.next();
					if (Equals.equals("1")) {
						Admin a1 = new Admin();
						@SuppressWarnings("resource")
						Scanner getTargetType = new Scanner(System.in);
						@SuppressWarnings("resource")
						Scanner getInfo = new Scanner(System.in);
						System.out.println("执行添加学生操作");
						System.out.println("可用模板有:\tStudent");
						System.out.println("输入创建对象所使用的模板:\t");
						String targetType = getTargetType.next();
						switch (targetType) {
						case "Student":
							if (Student.getIsEnabled() == true) {
								System.out.println("请输入学生的姓名");
								String name = getInfo.next();
								System.out.println("请输入学生的年龄");
								int age = getInfo.nextInt();
								System.out.println("请输入学生的性别");
								char gender = getInfo.next().charAt(0);
								System.out.println("请输入学生的入学日期");
								String enterdate = getInfo.next();
								System.out.println("请输入学生的学籍号");
								int educatenum = getInfo.nextInt();
								a1.addTargetS(name, age, gender, enterdate, educatenum, stuArr);
							} else {
								System.err.println("模板已经禁用!");
							}
							break;
						}
					} else if (Equals.equals("2")) {
						System.out.println("查找模块");
						System.out.println("请输入学生的编号:");
						int on = setIn.nextInt();
						a.findTarget(on, stuArr);
					} else if (Equals.equals("3")) {
						System.out.println("执行更新学生的基本信息");
						System.out.println("请输入学生的编号：");
						int on = setIn.nextInt();
						if (a.exist(on, stuArr[on])) {
							System.out.println("请输入学生的姓名：");
							String name = setIn.next();
							System.out.println("请输入学生的年龄:");
							int age = setIn.nextInt();
							System.out.println("请输入学生的性别");
							char gender = setIn.next().charAt(0);
							System.out.println("请输入学生的入学日期");
							String enterdate = setIn.next();
							System.out.println("请输入学生的学籍号");
							int educatenum = setIn.nextInt();
							a.replaceStuInfo(on, name, age, gender, enterdate, educatenum, stuArr);
						} else {
							System.err.println("学生不存在!");
						}
					} else if (Equals.equals("4")) {
						System.out.println("执行删除操作");
						System.out.println("请输入学生的编号:");
						int on = setIn.nextInt();
						a.deleteStu(on, stuArr);
					} else if (Equals.equals("5")) {
						System.out.println("执行设置学生成绩操作");
						System.out.println("请输入学生的编号:");
						int on = setIn.nextInt();
						a.inputMarks(on, stuArr);
					} else if (Equals.equals("6")) {
						System.out.println("执行根据某科目成绩进行排序操作");
						System.out.println("语文(1) 数学(2) 英语(3) 物理(4) 化学(5) 历史(6) 政治(7)");
						System.out.println("请指定科目:");
						int chosesubj = setIn.nextInt();
						a.setSort(chosesubj, stuArr);
					} else if (Equals.contentEquals("7")) {
						System.out.println("执行按照总分排序操作");
						a.setSumSort(stuArr);
					} else if (Equals.contentEquals("666")) {
						phr.printPlaceholder(true);
						System.out.println("您已经退出学生管理系统!");
						break;
					} else if (Equals.equals("8")) {
						System.out.println("执行打印学生信息操作");
						System.out.println("请输入学生编号");
						if (setIn.hasNextInt()) {
							int NoNum = setIn.nextInt();
							PrintInfo a2 = new PrintInfo();
							a2.printInfo(NoNum, stuArr);
						} else {
							System.out.println("非法输入!请检查!");
						}
					} else if (Equals.equals("9")) {
						System.out.println("执行打印学生成绩操作");
						System.out.println("请输入学生编号");
						if (setIn.hasNextInt()) {
							int NoNum = setIn.nextInt();
							PrintMarks a2 = new PrintMarks();
							a2.printMarks(NoNum, stuArr);
						} else {
							System.out.println("非法输入!请检查!");
						}
					}
				}
				break;
			case 2:
				while (true) {
					PrintInfo a3 = new PrintInfo();
					PrintMarks a4 = new PrintMarks();
					TeacherAdmin a2 = new TeacherAdmin();
					phr.printPlaceholder(2);
					System.out.println("==========教师管理系统==========");
					System.out.println("1:添加一个老师");
					System.out.println("2:查找一个老师");
					System.out.println("3:删除一个老师");
					System.out.println("4:设置一个老师的考核分");
					System.out.println("5:根据考核分排序");
					System.out.println("6:打印老师信息");
					System.out.println("7:打印老师考核分数");
					System.out.println("8:更新老师信息");
					System.out.println("9:设置老师所教学科");
					System.out.println("10:设置所负责的班级");
					System.out.println("666:返回上级菜单");
					System.out.println("你要执行的功能:");
					Equals = setIn.next();
					if (Equals.equals("1")) {
						@SuppressWarnings("resource")
						Scanner getInfo = new Scanner(System.in);
						@SuppressWarnings("resource")
						Scanner getTargetTyoe = new Scanner(System.in);
						System.out.println("可用模板有:\t" + "Teacher");
						System.out.println("请输入你要使用的模板:");
						String targettype = getTargetTyoe.next();
						switch (targettype) {
						case "Teacher":
							if (Teacher.getIsEnabled() == true) {
								System.out.println("进行添加教师操作");
								System.out.println("请输入教师的名字:");
								String namezj = getInfo.next();
								System.out.println("请输入教师的年龄:");
								int agezj = getInfo.nextInt();
								System.out.println("请输入教师的性别:");
								char genderzj = getInfo.next().charAt(0);
								System.out.println("请输入教师的入职时间:");
								String getProjDatezj = getInfo.next();
								a2.addTargetT(namezj, agezj, genderzj, getProjDatezj, teaArr);
							} else {
								System.err.println("模板已经禁用!");
							}
							break;
						}
					} else if (Equals.equals("2")) {
						System.out.println("执行查找教师的操作");
						System.out.println("请输入教师的编号");
						int No = setIn.nextInt();
						a2.findTarget(No, teaArr);
					} else if (Equals.equals("3")) {
						System.out.println("执行删除教师的操作");
						System.out.println("请输入教师的编号");
						int No = setIn.nextInt();
						a2.deleteTea(No, teaArr);
					} else if (Equals.contentEquals("4")) {
						System.out.println("执行设置老师考核分操作");
						System.out.println("请输入教师的编号");
						int No = setIn.nextInt();
						a2.inputkhMarks(No, teaArr);
					} else if (Equals.equals("5")) {
						System.out.println("执行根据考核分排序操作");
						a2.setKHMarkSort(teaArr);
					} else if (Equals.equals("6")) {
						System.out.println("执行打印教师信息操作");
						System.out.println("请输入教师的编号");
						int No = setIn.nextInt();
						a3.printTeaInfo(No, teaArr);
					} else if (Equals.equals("7")) {
						System.out.println("执行打印考核分操作");
						System.out.println("请输入教师的编号");
						int No = setIn.nextInt();
						a4.printTeaKHMarks(No, teaArr);
					} else if (Equals.equals("666")) {
						phr.printPlaceholder(true);
						System.out.println("您已退出教师管理系统!");
						break;
					} else if (Equals.equals("8")) {
						System.out.println("进行更新教师信息操作");
						System.out.println("请输入教师的编号：");
						int Nozj = setIn.nextInt();
						if (c2.exist(Nozj, teaArr[Nozj])) {
							System.out.println("请输入教师的名字:");
							String namezj = setIn.next();
							System.out.println("请输入教师的年龄:");
							int agezj = setIn.nextInt();
							System.out.println("请输入教师的性别:");
							char genderzj = setIn.next().charAt(0);
							System.out.println("请输入教师的入职时间:");
							String getProjDatezj = setIn.next();
							a2.replaceTeaInfo(Nozj, namezj, agezj, genderzj, getProjDatezj, teaArr);
						} else {
							System.err.println("教师不存在!");
						}
					} else if (Equals.equals("9")) {
						System.out.println("请输入教师的编号：");
						int Nozj = setIn.nextInt();
						System.out.println("请输入教师的所教科目");
						String Projzj = setIn.next();
						TeacherAdmin a5 = new TeacherAdmin();
						a5.setTeaProj(Nozj, Projzj, teaArr);
					} else if (Equals.equals("10")) {
						System.out.println("请输入教师的编号：");
						int Nozj = setIn.nextInt();
						System.out.println("请输入教师的所教班级");
						String classProjzj = setIn.next();
						TeacherAdmin a5 = new TeacherAdmin();
						a5.setTeaclassProj(Nozj, classProjzj, teaArr);
					}
				}
				break;
			case 3:
				while (true) {
					AdministratorsAdmin ad1 = new AdministratorsAdmin();
					phr.printPlaceholder(2);
					System.out.println("==========管理人员管理系统==========");
					System.out.println("1:添加一个管理人员");
					System.out.println("2:查找一个管理人员");
					System.out.println("3:删除一个管理人员");
					System.out.println("4:更新一个管理人员信息");
					System.out.println("5:设置管理人员职位");
					System.out.println("6:设置管理班级");
					System.out.println("7：打印管理人员信息");
					System.out.println("666:返回上级菜单");
					Equals = setIn.next();
					if (Equals.equals("1")) {
						System.out.println("可用模板有:\t" + "Administrator");
						System.out.println("请输入你要使用的模板:");
						String targettype = setIn.next();
						switch (targettype) {
						case "Administrator":
							if (Administrators.getIsEnabled()) {
								System.out.println("进行添加管理人员操作");
								System.out.println("请输入管理人员的名字:");
								String namezj = setIn.next();
								System.out.println("请输入管理人员的年龄:");
								int agezj = setIn.nextInt();
								System.out.println("请输入管理人员的性别:");
								char genderzj = setIn.next().charAt(0);
								System.out.println("请输入管理人员的入职时间:");
								String getProjDatezj = setIn.next();
								ad1.addTargetA(namezj, agezj, genderzj, getProjDatezj, admArr);
							} else {
								System.err.println("模板已经禁用!");
							}
							break;
						}
					} else if (Equals.equals("2")) {
						System.out.println("执行查找管理人员的操作");
						System.out.println("请输入管理人员的编号");
						int No = setIn.nextInt();
						ad1.findTarget(No, admArr);
					} else if (Equals.equals("3")) {
						System.out.println("执行删除管理人员的操作");
						System.out.println("请输入管理人员的编号");
						int No = setIn.nextInt();
						ad1.deleteAdm(No, admArr);
					} else if (Equals.equals("4")) {
						System.out.println("进行更新管理人员信息操作");
						System.out.println("请输入管理人员的编号：");
						int Nozj = setIn.nextInt();
						if (c1.exist(Nozj, admArr[Nozj])) {
							System.out.println("请输入管理人员的名字:");
							String namezj = setIn.next();
							System.out.println("请输入管理人员的年龄:");
							int agezj = setIn.nextInt();
							System.out.println("请输入管理人员的性别:");
							char genderzj = setIn.next().charAt(0);
							System.out.println("请输入管理人员的入职时间:");
							String getJobDatezj = setIn.next();
							ad1.replaceAdmInfo(Nozj, namezj, agezj, genderzj, getJobDatezj, admArr);
						} else {
							System.err.println("管理人员不存在!");
						}
					} else if (Equals.equals("5")) {
						System.out.println("请输入管理人员的编号：");
						int Nozj = setIn.nextInt();
						System.out.println("请输入管理人员的职务:");
						String Jobzj = setIn.next();
						ad1.setAdmJob(Nozj, Jobzj, admArr);
					} else if (Equals.equals("6")) {
						System.out.println("请输入管理人员的编号：");
						int Nozj = setIn.nextInt();
						System.out.println("请输入管理人员所管理的班级:");
						String adminClassesezj = setIn.next();
						ad1.setAdminClasses(Nozj, adminClassesezj, admArr);
					} else if (Equals.equals("666")) {
						phr.printPlaceholder(true);
						System.out.println("您已退出管理人员系统!");
						break;
					} else if (Equals.equals("7")) {
						System.out.println("请输入管理人员的编号：");
						int Nozj = setIn.nextInt();
						PrintInfo ad2 = new PrintInfo();
						ad2.printAdmInfo(Nozj, admArr);
					} else {
						System.err.println("输入错误!请检查!");
					}
				}
				break;
			case 4:
				while (true) {
					Student b = new Student();
					Teacher b1 = new Teacher();
					Administrators b2 = new Administrators();
					phr.printPlaceholder(2);
					System.out.println("==========模板管理==========");
					System.out.println("1:查看模板启用情况");
					System.out.println("2:设置模板启动情况");
					System.out.println("666:返回上级菜单");
					Equals = setIn.next();
					if (Equals.equals("1")) {
						System.out.println("现在模板启用状况(true -- 启用 , false -- 禁用)");
						System.out.println("Student:" + b.getIsEnabled());
						System.out.println("Teacher:" + b1.getIsEnabled());
						System.out.println("Administrators:" + b2.getIsEnabled());
					} else if (Equals.equals("2")) {
						System.out.println("可用模板有:\tStudent\tTeacher\tAdministrators");
						System.out.println("请输入要设置的模板名字");
						String templname = setIn.next();
						if (templname.equals("Student")) {
							System.out.println("请输入布尔值(true -- 启用 , false -- 禁用)");
							if (setIn.hasNextBoolean()) {
								boolean setenabled = setIn.nextBoolean();
								b.setIsEnabled(setenabled);
								System.out.println("成功!");
							} else {
								System.err.println("非法输入!请检查!");
							}
						} else if (templname.equals("Teacher")) {
							System.out.println("请输入布尔值(true -- 启用 , false -- 禁用)");
							if (setIn.hasNextBoolean()) {
								boolean setenabled = setIn.nextBoolean();
								b1.setIsEnabled(setenabled);
								System.out.println("成功!");
							} else {
								System.err.println("非法输入!请检查!");
							}
						} else if (templname.equals("Administrators")) {
							System.out.println("请输入布尔值(true -- 启用 , false -- 禁用)");
							if (setIn.hasNextBoolean()) {
								boolean setenabled = setIn.nextBoolean();
								b2.setIsEnabled(setenabled);
								System.out.println("成功!");
							} else {
								System.err.println("非法输入!请检查!");
							}
						}
					} else if (Equals.equals("666")) {
						phr.printPlaceholder(true);
						System.out.println("您已经退出模板管理!");
						break;
					}
				}
				break;
			case 666:
				phr.printPlaceholder(true);
				System.out.println("您已退出学校管理系统!");
				System.exit(0);
			}
		}
	}
}
