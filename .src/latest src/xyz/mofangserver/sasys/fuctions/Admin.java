package xyz.mofangserver.sasys.fuctions;

import xyz.mofangserver.sasys.template.*;
import java.util.Scanner;

/**
 * @author z_yu
 * @version 0.1
 * @serial SASYS(SchoolAdminSystem)
 * @since SASYS 0.1
 */
public class Admin {
	public final static String say = "\t编号\t姓名\t年龄\t性别\t入学时间\t\t学籍号\t语文成绩\t数学成绩\t英语成绩\t物理成绩\t化学成绩\t历史成绩\t政治成绩\t总分\t平均分";

	public final int checkLast(Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				return i;
			}
		}
		return 99999;
	}

	public final void addTargetS(String name, int age, char gender, String enterdate, int educatenum, Student[] arr) {
		Student stu = new Student();
		stu.setName(name);
		stu.setAge(age);
		stu.setGender(gender);
		stu.setEnterDate(enterdate);
		stu.setEducatenum(educatenum);
		int i = this.checkLast(arr);
		stu.setOn(i);
		if (i == 99999) {
			System.out.println("学生人数已到最大，不能再添加了");
		} else {
			arr[i] = stu;
		}
		this.print(arr);
	}

	public final void print(Student[] arr) {
		System.out.println(say);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].setSum();
				arr[i].setAvg();
				System.out.println(arr[i]);
			}
		}
	}

	public final boolean exist(int on, Student stu) {
		if (stu != null) {
			if (stu.getOn() == on) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public final void findTarget(int on, Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i])) {
				System.out.println(arr[i]);
				return;
			}
		}
		System.out.println("学生不存在!");
	}

	public final void replaceStuInfo(int on, String name, int age, char gender, String enterdate, int educatenum,
			Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i])) {
				arr[i].setName(name);
				arr[i].setAge(age);
				arr[i].setGender(gender);
				arr[i].setEnterDate(enterdate);
				arr[i].setEducatenum(educatenum);
				System.out.println("更新学生信息成功!");
				this.print(arr);
				return;
			}
		}
		System.out.println("学生不存在!更新信息失败!");
	}

	public final void deleteStu(int on, Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i])) {
				arr[i] = null;
				this.print(arr);
				return;
			}
		}
		System.out.println("学生不存在!");
	}

	public final void inputMarks(int on, Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i])) {
				System.out.println("Notice!输入的成绩必须带小数点或者是整数!");
				@SuppressWarnings("resource")
				Scanner setMarksca = new Scanner(System.in);
				System.out.println("请输入" + arr[i].getName() + "的语文成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setChineseMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + arr[i].getName() + "的数学成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setMathsMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + arr[i].getName() + "的英语成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setEnglishMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + arr[i].getName() + "的物理成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setPhysicsMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + arr[i].getName() + "的化学成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setChemistryMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + arr[i].getName() + "的历史成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setHistoryMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + arr[i].getName() + "的政治成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					arr[i].setPoliticalMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				this.print(arr);
				break;
			}
		}
	}

	public final void setSort(int chosesubj, Student[] arr) {
		if (chosesubj == 1) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getChineseMark() < arr[c].getChineseMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 2) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getMathsMark() < arr[c].getMathsMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 3) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getEnglishMark() < arr[c].getEnglishMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 4) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getPhysicsMark() < arr[c].getPhysicsMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 5) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getChemistryMark() < arr[c].getChemistryMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 6) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getHistoryMark() < arr[c].getHistoryMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		} else if (chosesubj == 7) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int c = i + 1; c < arr.length; c++) {
					if (arr[i] != null && arr[c] != null) {
						if (arr[i].getPoliticalMark() < arr[c].getPoliticalMark()) {
							Student lei = arr[i];
							arr[i] = arr[c];
							arr[c] = lei;
						}
					}
				}
			}
		}
		this.print(arr);
	}

	public final void setSumSort(Student[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			for (int c = i + 1; c < arr.length; c++) {
				if (arr[i] != null && arr[c] != null) {
					if (arr[i].getSum() < arr[c].getSum()) {
						Student lei = arr[i];
						arr[i] = arr[c];
						arr[c] = lei;
					}
				}
			}
		}
		this.print(arr);
	}
}
