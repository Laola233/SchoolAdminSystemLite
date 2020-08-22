package xyz.mofangserver.sasys.fuctions;

import java.util.Scanner;

import xyz.mofangserver.sasys.template.*;

/**
 * @author z_yu
 * @serial SASYS(SchoolAdminSystem)
 * @version 0.1
 * @since 0.5
 */
public class TeacherAdmin {
	public static String say = "\t编号\t姓名\t年龄\t性别\t加入学校日期\t\t\t负责学科\t负责班级\t\t考核分";

	public final int checkLast(Teacher[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				return i;
			}
		}
		return 99999;
	}

	public final void addTargetT(String name, int age, char gender, String getProjDate, Teacher[] arr) {
		Teacher tea = new Teacher();
		tea.setName(name);
		tea.setAge(age);
		tea.setGender(gender);
		tea.setGetProjDate(getProjDate);
		int i = checkLast(arr);
		tea.setNo(i);
		if (i == 99999) {
			System.err.println("教师人数已经达到最大,不能再添加!");
		} else {
			arr[i] = tea;
		}
		this.print(arr);
	}

	public final void print(Teacher[] arr) {
		System.out.println(say);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
	}

	public final boolean exist(int No, Teacher tea) {
		if (tea != null) {
			if (tea.getNo() == No) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public final void findTarget(int No, Teacher[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				System.out.println(arr[i]);
				return;
			}
		}
		System.err.println("教师不存在!");
	}

	public final void replaceTeaInfo(int No, String name, int age, char gender, String getProjDate, Teacher[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				arr[i].setName(name);
				arr[i].setAge(age);
				arr[i].setGender(gender);
				arr[i].setGetProjDate(getProjDate);
				System.out.println("更新教师信息成功!");
				this.print(arr);
				return;
			}
		}
		System.err.println("教师不存在!更新信息失败!");
	}

	public final void deleteTea(int No, Teacher[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				arr[i] = null;
				this.print(arr);
				return;
			}
		}
		System.err.println("教师不存在!");
	}

	public final void inputkhMarks(int No, Teacher[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				System.out.println("Notice!输入的考核分必须带小数点或者是整数!");
				@SuppressWarnings("resource")
				Scanner setMarksca = new Scanner(System.in);
				System.out.println("请输入" + arr[i].getName() + "老师的考核分");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setkhMark(setMarksca.nextDouble());
				} else {
					System.err.println("非法输入!请检查!");
				}
				this.print(arr);
				break;
			}
		}
	}

	public final void setTeaProj(int No, String Proj, Teacher[] arr) {
		if (this.exist(No, arr[No])) {
			arr[No].setProj(Proj);
		} else {
			System.err.println("教师不存在!");
			return;
		}
		this.print(arr);
	}

	public final void setTeaclassProj(int No, String classProj, Teacher[] arr) {
		if (this.exist(No, arr[No])) {
			arr[No].setClassProj(classProj);
		} else {
			System.err.println("教师不存在!");
			return;
		}
		this.print(arr);
	}

	public final void setKHMarkSort(Teacher[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int c = i + 1; c < arr.length; c++) {
				if (arr[i] != null && arr[c] != null) {
					if (arr[i].getkhMark() < arr[c].getkhMark()) {
						Teacher zj = arr[i];
						arr[i] = arr[c];
						arr[c] = zj;
					}
				}
			}
		}
		this.print(arr);
	}
}
