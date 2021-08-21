package icu.mofangserver.SchoolAdminSystemLite.fuctions;

import java.util.Scanner;

import icu.mofangserver.SchoolAdminSystemLite.template.*;

/**
 * @author z_yu
 * @version 1.2
 * @serial SchoolAdminSystemLite
 * @since SchoolAdminSystemLite 0.1
 */
public class MembersAdmin {
	private final static String says = "\t编号\t姓名\t年龄\t性别\t入学时间\t\t学籍号\t语文成绩\t数学成绩\t英语成绩\t物理成绩\t化学成绩\t历史成绩\t政治成绩\t总分\t平均分";
	private final static String msgt = "\t编号\t姓名\t年龄\t性别\t入职时间\t职务\t管理班级";
	private final static String sayt = "\t编号\t姓名\t年龄\t性别\t加入学校日期\t\t\t负责学科\t负责班级\t\t考核分";

	public final int checkLast(Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				return i;
			}
		}
		return 99999;
	}

	public final void addTarget(String name, int age, char gender, String enterdate, int educatenum, Student[] arr) {
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
		System.out.println(says);
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

	public final int checkLast(Administrator[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				return i;
			}
		}
		return 99999;
	}

	public final void print(Administrator[] arr) {
		System.out.println(msgt);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
	}

	public final boolean exist(int No, Administrator adm) {
		if (adm != null) {
			if (adm.getNo() == No) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public final void addTargetA(String name, int age, char gender, String getJobDate, Administrator[] arr) {
		Administrator adm = new Administrator();
		adm.setName(name);
		adm.setAge(age);
		adm.setGender(gender);
		adm.setGetJobDate(getJobDate);
		int i = checkLast(arr);
		adm.setNo(i);
		if (i == 99999) {
			System.err.println("管理人员人数已经达到最大,不能再添加!");
		} else {
			System.out.println("成功!");
			arr[i] = adm;
		}
		this.print(arr);
	}

	public final void replaceAdmInfo(int No, String name, int age, char gender, String getJobDate,
			Administrator[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				arr[i].setName(name);
				arr[i].setAge(age);
				arr[i].setGender(gender);
				arr[i].setGetJobDate(getJobDate);
				System.out.println("更新管理人员信息成功!");
				this.print(arr);
				return;
			}
		}
		System.err.println("管理人员不存在!更新信息失败!");
	}

	public final void findTarget(int No, Administrator[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				System.out.println("成功!");
				System.out.println(arr[i]);
				return;
			}
		}
		System.err.println("管理人员不存在!");
	}

	public final void deleteAdm(int No, Administrator[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				arr[i] = null;
				System.out.println("成功!");
				this.print(arr);
				return;
			}
		}
		System.err.println("管理人员不存在!");
	}

	public final void setAdmJob(int No, String Job, Administrator[] arr) {
		if (this.exist(No, arr[No])) {
			arr[No].setJob(Job);
			System.out.println("成功!");
		} else {
			System.err.println("管理人员不存在!");
			return;
		}
		this.print(arr);
	}

	public final void setAdminClasses(int No, String adminClasses, Administrator[] arr) {
		if (this.exist(No, arr[No])) {
			arr[No].setAdminClasses(adminClasses);
			System.out.println("成功!");
		} else {
			System.err.println("管理人员不存在!");
			return;
		}
		this.print(arr);
	}

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
		System.out.println(sayt);
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
