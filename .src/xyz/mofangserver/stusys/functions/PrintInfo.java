package xyz.mofangserver.stusys.functions;

import xyz.mofangserver.stusys.main.*;
import xyz.mofangserver.stusys.template.*;

/**
 * @author z_yu
 * @version 0.1
 * @serial SASYS(StudentAdminSystem)
 * @since 0.1
 */
public class PrintInfo {
	@SuppressWarnings("static-access")
	public final void printInfo(int NoNum, Student[] arr) {
		Main a = new Main();
		Admin a1 = new Admin();
		if (a1.exist(NoNum, arr[NoNum])) {
			if (a.stuArr[NoNum].getName() != null && a.stuArr[NoNum].getAge() != 0
					&& a.stuArr[NoNum].getGender() != '\u0000' && a.stuArr[NoNum].getEnterDate() != null
					&& a.stuArr[NoNum].getEducatenum() != 0) {
				System.out.println("=====第" + NoNum + "号学生的信息=====");
				System.out.println("名字:\t" + a.stuArr[NoNum].getName());
				System.out.println("年龄:\t" + a.stuArr[NoNum].getAge());
				System.out.println("性别:\t" + a.stuArr[NoNum].getGender());
				System.out.println("入学时间:\t" + a.stuArr[NoNum].getEnterDate());
				System.out.println("学籍号:\t" + a.stuArr[NoNum].getEducatenum());
			} else {
				System.err.println("将要打印信息,编号为\t" + NoNum + "的学生信息不完整!请检查!");
			}
		} else {
			System.err.println("学生不存在!");
		}
	}

	@SuppressWarnings("static-access")
	public final void printTeaInfo(int NoNum, Teacher[] arr) {
		TeacherAdmin a1 = new TeacherAdmin();
		Main a = new Main();
		if (a1.exist(NoNum, arr[NoNum])) {
			if (a.teaArr[NoNum].getName() != null && a.teaArr[NoNum].getAge() != 0
					&& a.teaArr[NoNum].getGender() != '\u0000' && a.teaArr[NoNum].getGetProjDate() != null) {
				System.out.println("=====第" + NoNum + "号教师的信息=====");
				System.out.println("名字:\t" + a.teaArr[NoNum].getName());
				System.out.println("年龄:\t" + a.teaArr[NoNum].getAge());
				System.out.println("性别:\t" + a.teaArr[NoNum].getGender());
				System.out.println("入职时间:\t" + a.teaArr[NoNum].getGetProjDate());
				System.out.println("教学科目:\t" + a.teaArr[NoNum].getProj());
				System.out.println("教学班级:\t" + a.teaArr[NoNum].getClassProj());
			} else {
				System.err.println("将要打印信息,编号为\t" + NoNum + "的教师信息不完整!请检查!");
			}
		} else {
			System.err.println("教师不存在!");
		}
	}

	@SuppressWarnings("static-access")
	public final void printAdmInfo(int NoNum, Administrators[] arr) {
		AdministratorsAdmin a1 = new AdministratorsAdmin();
		Main a = new Main();
		if (a1.exist(NoNum, arr[NoNum])) {
			if (a.admArr[NoNum].getName() != null && a.admArr[NoNum].getAge() != 0
					&& a.admArr[NoNum].getGender() != '\u0000' && a.admArr[NoNum].getGetJobDate() != null) {
				System.out.println("=====第" + NoNum + "号管理人员的信息=====");
				System.out.println("名字:\t" + a.admArr[NoNum].getName());
				System.out.println("年龄:\t" + a.admArr[NoNum].getAge());
				System.out.println("性别:\t" + a.admArr[NoNum].getGender());
				System.out.println("入职时间:\t" + a.admArr[NoNum].getGetJobDate());
				System.out.println("职务:\t" + a.admArr[NoNum].getJob());
				System.out.println("管理班级:\t" + a.admArr[NoNum].getAdminClasses());
			} else {
				System.err.println("将要打印信息,编号为\t" + NoNum + "的管理人员信息不完整!请检查!");
			}
		} else {
			System.err.println("管理人员不存在!");
		}
	}
}
