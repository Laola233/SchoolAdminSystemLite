package xyz.mofangserver.sasys.fuctions;


import xyz.mofangserver.sasys.template.*;

/**
 * @author z_yu
 * @version 0.1
 * @since 0.1
 * @serial SASYS(StudentAdminSystem)
 */
public class AdministratorsAdmin {
	private final String msg = "\t编号\t姓名\t年龄\t性别\t入职时间\t职务\t管理班级";

	public final int checkLast(Administrators[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				return i;
			}
		}
		return 99999;
	}

	public final void print(Administrators[] arr) {
		System.out.println(msg);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
	}

	public final boolean exist(int No, Administrators adm) {
		if (adm != null) {
			if (adm.getNo() == No) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public final void addTargetA(String name, int age, char gender, String getJobDate, Administrators[] arr) {
		Administrators adm = new Administrators();
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
			Administrators[] arr) {
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

	public final void findTarget(int No, Administrators[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(No, arr[i])) {
				System.out.println("成功!");
				System.out.println(arr[i]);
				return;
			}
		}
		System.err.println("管理人员不存在!");
	}

	public final void deleteAdm(int No, Administrators[] arr) {
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

	public final void setAdmJob(int No, String Job, Administrators[] arr) {
		if (this.exist(No, arr[No])) {
			arr[No].setJob(Job);
			System.out.println("成功!");
		} else {
			System.err.println("管理人员不存在!");
			return;
		}
		this.print(arr);
	}

	public final void setAdminClasses(int No, String adminClasses, Administrators[] arr) {
		if (this.exist(No, arr[No])) {
			arr[No].setAdminClasses(adminClasses);
			System.out.println("成功!");
		} else {
			System.err.println("管理人员不存在!");
			return;
		}
		this.print(arr);
	}
}