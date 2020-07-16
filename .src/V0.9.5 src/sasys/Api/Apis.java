package sasys.Api;

import xyz.mofangserver.sasys.main.*;
import xyz.mofangserver.sasys.fuctions.*;
import xyz.mofangserver.sasys.template.*;

/**
 * @author z_yu
 * @version 0.1
 * @since 0.1 <br>
 *        SASYS(StudentAdminSystem)的API
 * @serial SASYS(StudentAdminSystem) <br>
 *         使用方法:在所需要API类中继承该类
 */
public abstract class Apis {
	protected double apiversion = 0.1;

	private final static boolean exist(int on, int on1, Student[] stu) {
		if (stu[on] != null && stu[on1] != null) {
			if (stu[on].getOn() == on && stu[on1].getOn() == on1) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	private final static boolean exist(int on, int on1, Teacher[] tea) {
		if (tea[on] != null && tea[on1] != null) {
			if (tea[on].getNo() == on && tea[on1].getNo() == on1) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	private final static boolean exist(int on, int on1, Administrators[] adm) {
		if (adm[on] != null && adm[on1] != null) {
			if (adm[on].getNo() == on && adm[on1].getNo() == on1) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	/**
	 * <code>获取程序里的学生信息</code>
	 * 
	 * @return Student 学生信息
	 * @param No 学生编号
	 */
	public final Student getthisStudentInfoApi(int No) {
		return Main.stuArr[No];
	}

	/**
	 * <code>获取程序里的教师信息</code>
	 * 
	 * @return Teacher 教师信息
	 * @param No 教师编号
	 */
	public final Teacher getthisTeacherInfoApi(int No) {
		return Main.teaArr[No];
	}

	/**
	 * <code>获取程序里的管理人员信息</code>
	 * 
	 * @return Administrators 管理人员信息
	 * @param No 管理人员编号
	 */
	public final Administrators getthisAdministratorsInfoApi(int No) {
		return Main.admArr[No];
	}

	/**
	 * <code>获取其他程序的学生信息</code>
	 * 
	 * @return Student 学生信息
	 * @param No  学生编号
	 * @param arr 你所定义的学生数组
	 */
	public final Student getotherStudentInfoApi(int No, Student[] arr) {
		return arr[No];
	}

	/**
	 * <code>获取其他程序里的教师信息</code>
	 * 
	 * @return Teacher 教师信息
	 * @param No  教师编号
	 * @param arr 你所定义的教师数组
	 */
	public final Teacher getotherTeacherInfoApi(int No, Teacher[] arr) {
		return arr[No];
	}

	/**
	 * <code>获取其他程序里的管理人员信息</code>
	 * 
	 * @return Administrators 管理人员信息
	 * @param No  管理人员编号
	 * @param arr 你所定义的管理人员数组
	 */
	public final Administrators getotherAdministratorsInfoApi(int No, Administrators[] arr) {
		return arr[No];
	}

	/**
	 * <code> 获取当前时间 </code>
	 * 
	 * @deprecated
	 * @return String 时间字符串
	 */
	public final String getTime() {
		return GetNowTime.Date();
	}

	/**
	 * <code> 获取目标类型 API </code>
	 * 
	 * @return String 目标类型
	 * @param No  目标编号
	 * @param arr 你所定义的目标的数组名称
	 */
	public final String getTargetType(int No, Student[] arr) {
		return arr[No].getType();
	}

	/**
	 * <code> 获取目标类型 API </code>
	 * 
	 * @return String 目标类型
	 * @param No  目标编号
	 * @param arr 你所定义的目标的数组名称
	 */
	public final String getTargetType(int No, Teacher[] arr) {
		return arr[No].getType();
	}

	/**
	 * <code> 获取目标类型 API </code>
	 * 
	 * @return String 目标类型
	 * @param No  目标编号
	 * @param arr 你所定义的目标的数组名称
	 */
	public final String getTargetType(int No, Administrators[] arr) {
		return arr[No].getType();
	}

	/**
	 * <code> 设置学生数组(懒人专用) </code>
	 * 
	 * @return Student[] 学生数组
	 * @param amount 数组下标数
	 */
	public final Student[] returnStudentArr(int amount) {
		Student[] arr = new Student[amount];
		return arr;
	}

	/**
	 * <code> 设置教师数组(懒人专用) </code>
	 * 
	 * @return Teacher[] 教师数组
	 * @param amount 数组下标数
	 */
	public final Teacher[] returnTeacherArr(int amount) {
		Teacher[] arr = new Teacher[amount];
		return arr;
	}

	/**
	 * <code> 设置管理人员数组(懒人专用) </code>
	 * 
	 * @return Administrators[] 管理人员数组
	 * @param amount 数组下标数
	 */
	public final Administrators[] returnAdministratorsArr(int amount) {
		Administrators[] arr = new Administrators[amount];
		return arr;
	}

	/**
	 * <code> 克隆学生一个基础信息 </code>
	 * 
	 * @param targetno      克隆模板的编号
	 * @param clonetargetno 被克隆学生的编号
	 * @param arr           学生数组
	 * @param cloneINF1     克隆信息的标记1 <br>
	 *                      <strong>注意!克隆标记只有: name , age , gender , enterdate
	 *                      ,educatenum </strong>
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Student[] arr, String cloneINF1) {
		if (exist(targetno, clonetargetno, arr)) {
			if (cloneINF1.equals("name") || cloneINF1.equals("age") || cloneINF1.equals("gender")
					|| cloneINF1.equals("enterdate") || cloneINF1.equals("educatenum")) {
				if (cloneINF1.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF1.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF1.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else if (cloneINF1.equals("enterdate")) {
					arr[clonetargetno].setEnterDate(arr[targetno].getEnterDate());
				} else {
					arr[clonetargetno].setEducatenum(arr[targetno].getEducatenum());
				}
			} else {
				System.err.println("克隆参数1错误!请检查!支持的参数有:name , age , gender , enterdate , educatenum");
			}
		} else {
			System.out.println("您所指定的两人有一人或者两人都不存在!请检查!");
		}
	}

	/**
	 * <code> 克隆学生两个基础信息 </code>
	 * 
	 * @param targetno      克隆模板的编号
	 * @param clonetargetno 被克隆学生的编号
	 * @param arr           学生数组
	 * @param cloneINF1     克隆信息的标记1
	 * @param cloneINF2     克隆信息的标记2 <br>
	 *                      <strong>注意!克隆标记只有: name , age , gender , enterdate
	 *                      ,educatenum </strong>
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Student[] arr, String cloneINF1, String cloneINF2) {
		if (exist(targetno, clonetargetno, arr)) {
			if (cloneINF1.equals("name") || cloneINF1.equals("age") || cloneINF1.equals("gender")
					|| cloneINF1.equals("enterdate") || cloneINF1.equals("educatenum")) {
				if (cloneINF1.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF1.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF1.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else if (cloneINF1.equals("enterdate")) {
					arr[clonetargetno].setEnterDate(arr[targetno].getEnterDate());
				} else {
					arr[clonetargetno].setEducatenum(arr[targetno].getEducatenum());
				}
			} else {
				System.err.println("克隆参数1错误!请检查!支持的参数有:name , age , gender , enterdate , educatenum");
			}

			if (cloneINF2.equals("name") || cloneINF2.equals("age") || cloneINF2.equals("gender")
					|| cloneINF2.equals("enterdate") || cloneINF2.equals("educatenum")) {
				if (cloneINF2.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF2.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF2.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else if (cloneINF2.equals("enterdate")) {
					arr[clonetargetno].setEnterDate(arr[targetno].getEnterDate());
				} else {
					arr[clonetargetno].setEducatenum(arr[targetno].getEducatenum());
				}
			} else {
				System.err.println("克隆参数2错误!请检查!支持的参数有:name , age , gender , enterdate , educatenum");
			}
		} else {
			System.out.println("您所指定的两人有一人或者两人都不存在!请检查!");
		}
	}

	/**
	 * <code> 克隆学生三个基础信息 </code>
	 * 
	 * @param targetno      克隆模板的编号
	 * @param clonetargetno 被克隆学生的编号
	 * @param arr           学生数组
	 * @param cloneINF1     克隆信息的标记1
	 * @param cloneINF2     克隆信息的标记2
	 * @param cloneINF3     克隆信息的标记3 <br>
	 *                      <strong>注意!克隆标记只有: name , age , gender , enterdate
	 *                      ,educatenum </strong>
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Student[] arr, String cloneINF1, String cloneINF2,
			String cloneINF3) {
		if (exist(targetno, clonetargetno, arr)) {
			if (cloneINF1.equals("name") || cloneINF1.equals("age") || cloneINF1.equals("gender")
					|| cloneINF1.equals("enterdate") || cloneINF1.equals("educatenum")) {
				if (cloneINF1.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF1.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF1.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else if (cloneINF1.equals("enterdate")) {
					arr[clonetargetno].setEnterDate(arr[targetno].getEnterDate());
				} else {
					arr[clonetargetno].setEducatenum(arr[targetno].getEducatenum());
				}
			} else {
				System.err.println("克隆参数1错误!请检查!支持的参数有:name , age , gender , enterdate , educatenum");
			}

			if (cloneINF2.equals("name") || cloneINF2.equals("age") || cloneINF2.equals("gender")
					|| cloneINF2.equals("enterdate") || cloneINF2.equals("educatenum")) {
				if (cloneINF2.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF2.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF2.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else if (cloneINF2.equals("enterdate")) {
					arr[clonetargetno].setEnterDate(arr[targetno].getEnterDate());
				} else {
					arr[clonetargetno].setEducatenum(arr[targetno].getEducatenum());
				}
			} else {
				System.err.println("克隆参数2错误!请检查!支持的参数有:name , age , gender , enterdate , educatenum");
			}

			if (cloneINF3.equals("name") || cloneINF3.equals("age") || cloneINF3.equals("gender")
					|| cloneINF3.equals("enterdate") || cloneINF3.equals("educatenum")) {
				if (cloneINF3.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF3.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF3.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else if (cloneINF3.equals("enterdate")) {
					arr[clonetargetno].setEnterDate(arr[targetno].getEnterDate());
				} else {
					arr[clonetargetno].setEducatenum(arr[targetno].getEducatenum());
				}
			} else {
				System.err.println("克隆参数3错误!请检查!支持的参数有:name , age , gender , enterdate , educatenum");
			}
		} else {
			System.out.println("您所指定的两人有一人或者两人都不存在!请检查!");
		}
	}

	/**
	 * <code> 克隆学生四个基础信息 </code>
	 * 
	 * @param targetno      克隆模板的编号
	 * @param clonetargetno 被克隆学生的编号
	 * @param arr           学生数组
	 * @param cloneINF1     克隆信息的标记1
	 * @param cloneINF2     克隆信息的标记2
	 * @param cloneINF3     克隆信息的标记3
	 * @param cloneINF4     克隆信息的标记4 <br>
	 *                      <strong>注意!克隆标记只有: name , age , gender , enterdate
	 *                      ,educatenum </strong>
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Student[] arr, String cloneINF1, String cloneINF2,
			String cloneINF3, String cloneINF4) {
		if (exist(targetno, clonetargetno, arr)) {
			if (cloneINF1.equals("name") || cloneINF1.equals("age") || cloneINF1.equals("gender")
					|| cloneINF1.equals("enterdate") || cloneINF1.equals("educatenum")) {
				if (cloneINF1.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF1.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF1.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else if (cloneINF1.equals("enterdate")) {
					arr[clonetargetno].setEnterDate(arr[targetno].getEnterDate());
				} else {
					arr[clonetargetno].setEducatenum(arr[targetno].getEducatenum());
				}
			} else {
				System.err.println("克隆参数1错误!请检查!支持的参数有:name , age , gender , enterdate , educatenum");
			}

			if (cloneINF2.equals("name") || cloneINF2.equals("age") || cloneINF2.equals("gender")
					|| cloneINF2.equals("enterdate") || cloneINF2.equals("educatenum")) {
				if (cloneINF2.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF2.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF2.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else if (cloneINF2.equals("enterdate")) {
					arr[clonetargetno].setEnterDate(arr[targetno].getEnterDate());
				} else {
					arr[clonetargetno].setEducatenum(arr[targetno].getEducatenum());
				}
			} else {
				System.err.println("克隆参数2错误!请检查!支持的参数有:name , age , gender , enterdate , educatenum");
			}

			if (cloneINF3.equals("name") || cloneINF3.equals("age") || cloneINF3.equals("gender")
					|| cloneINF3.equals("enterdate") || cloneINF3.equals("educatenum")) {
				if (cloneINF3.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF3.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF3.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else if (cloneINF3.equals("enterdate")) {
					arr[clonetargetno].setEnterDate(arr[targetno].getEnterDate());
				} else {
					arr[clonetargetno].setEducatenum(arr[targetno].getEducatenum());
				}
			} else {
				System.err.println("克隆参数3错误!请检查!支持的参数有:name , age , gender , enterdate , educatenum");
			}

			if (cloneINF4.equals("name") || cloneINF4.equals("age") || cloneINF4.equals("gender")
					|| cloneINF4.equals("enterdate") || cloneINF4.equals("educatenum")) {
				if (cloneINF4.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF4.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF4.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else if (cloneINF4.equals("enterdate")) {
					arr[clonetargetno].setEnterDate(arr[targetno].getEnterDate());
				} else {
					arr[clonetargetno].setEducatenum(arr[targetno].getEducatenum());
				}
			} else {
				System.err.println("克隆参数4错误!请检查!支持的参数有:name , age , gender , enterdate , educatenum");
			}
		} else {
			System.out.println("您所指定的两人有一人或者两人都不存在!请检查!");
		}
	}

	/**
	 * <code> 克隆学生所有基础信息 </code>
	 * 
	 * @param targetno      克隆模板的编号
	 * @param clonetargetno 被克隆学生的编号
	 * @param arr           学生数组
	 * @param submits       确认克隆
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Student[] arr, boolean submits) {
		if (submits) {
			if (exist(targetno, clonetargetno, arr)) {
				arr[clonetargetno].setName(arr[targetno].getName());
				arr[clonetargetno].setAge(arr[targetno].getAge());
				arr[clonetargetno].setGender(arr[targetno].getGender());
				arr[clonetargetno].setEnterDate(arr[targetno].getEnterDate());
				arr[clonetargetno].setEducatenum(arr[targetno].getEducatenum());
			} else {
				System.out.println("您所指定的两人有一人或者两人都不存在!请检查!");
			}
		} else {
			System.err.println("未允许克隆!");
		}
	}

	/**
	 * <code> 克隆教师的1个基础信息 </code>
	 * 
	 * @param targetno      克隆模板编号
	 * @param clonetargetno 被克隆教师编号
	 * @param arr           教师数组
	 * @param cloneINF1     克隆信息的标记1 <br>
	 *                      <strong>注意!克隆标记只有: name , age , gender , getProjDate
	 *                      </strong>
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Teacher[] arr, String cloneINF1) {
		if (exist(targetno, clonetargetno, arr)) {
			if (cloneINF1.equals("name") || cloneINF1.equals("age") || cloneINF1.equals("gender")
					|| cloneINF1.equals("getProjDate")) {
				if (cloneINF1.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF1.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF1.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else {
					arr[clonetargetno].setGetProjDate(arr[targetno].getGetProjDate());
				}
			} else {
				System.err.println("克隆参数1错误!请检查!支持的参数有:name , age , gender , getProjDate");
			}
		} else {
			System.out.println("您所指定的两人有一人或者两人都不存在!请检查!");
		}
	}

	/**
	 * <code> 克隆教师的2个基础信息 </code>
	 * 
	 * @param targetno      克隆模板编号
	 * @param clonetargetno 被克隆教师编号
	 * @param arr           教师数组
	 * @param cloneINF1     克隆信息的标记1
	 * @param cloneINF2     克隆信息的标记2 <br>
	 *                      <strong>注意!克隆标记只有: name , age , gender , getProjDate
	 *                      </strong>
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Teacher[] arr, String cloneINF1, String cloneINF2) {
		if (exist(targetno, clonetargetno, arr)) {

			if (cloneINF1.equals("name") || cloneINF1.equals("age") || cloneINF1.equals("gender")
					|| cloneINF1.equals("getProjDate")) {
				if (cloneINF1.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF1.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF1.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else {
					arr[clonetargetno].setGetProjDate(arr[targetno].getGetProjDate());
				}
			} else {
				System.err.println("克隆参数1错误!请检查!支持的参数有:name , age , gender , getProjDate");
			}

			if (cloneINF2.equals("name") || cloneINF2.equals("age") || cloneINF2.equals("gender")
					|| cloneINF2.equals("getProjDate")) {
				if (cloneINF2.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF2.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF2.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else {
					arr[clonetargetno].setGetProjDate(arr[targetno].getGetProjDate());
				}
			} else {
				System.err.println("克隆参数2错误!请检查!支持的参数有:name , age , gender , getProjDate");
			}
		} else {
			System.out.println("您所指定的两人有一人或者两人都不存在!请检查!");
		}
	}

	/**
	 * <code> 克隆教师的3个基础信息 </code>
	 * 
	 * @param targetno      克隆模板编号
	 * @param clonetargetno 被克隆教师编号
	 * @param arr           教师数组
	 * @param cloneINF1     克隆信息的标记1
	 * @param cloneINF2     克隆信息的标记2
	 * @param cloneINF3     克隆信息的标记3 <br>
	 *                      <strong>注意!克隆标记只有: name , age , gender , getProjDate
	 *                      </strong>
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Teacher[] arr, String cloneINF1, String cloneINF2,
			String cloneINF3) {
		if (exist(targetno, clonetargetno, arr)) {

			if (cloneINF1.equals("name") || cloneINF1.equals("age") || cloneINF1.equals("gender")
					|| cloneINF1.equals("getProjDate")) {
				if (cloneINF1.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF1.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF1.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else {
					arr[clonetargetno].setGetProjDate(arr[targetno].getGetProjDate());
				}
			} else {
				System.err.println("克隆参数1错误!请检查!支持的参数有:name , age , gender , getProjDate");
			}

			if (cloneINF2.equals("name") || cloneINF2.equals("age") || cloneINF2.equals("gender")
					|| cloneINF2.equals("getProjDate")) {
				if (cloneINF2.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF2.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF2.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else {
					arr[clonetargetno].setGetProjDate(arr[targetno].getGetProjDate());
				}
			} else {
				System.err.println("克隆参数2错误!请检查!支持的参数有:name , age , gender , getProjDate");
			}

			if (cloneINF3.equals("name") || cloneINF3.equals("age") || cloneINF3.equals("gender")
					|| cloneINF3.equals("getProjDate")) {
				if (cloneINF3.equals("name")) {
					arr[clonetargetno].setName(arr[targetno].getName());
				} else if (cloneINF3.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF3.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else {
					arr[clonetargetno].setGetProjDate(arr[targetno].getGetProjDate());
				}
			} else {
				System.err.println("克隆参数3错误!请检查!支持的参数有:name , age , gender , getProjDate");
			}
		} else {
			System.out.println("您所指定的两人有一人或者两人都不存在!请检查!");
		}
	}

	/**
	 * <code> 克隆教师的所有基础信息 </code>
	 * 
	 * @param targetno      克隆模板编号
	 * @param clonetargetno 被克隆教师编号
	 * @param arr           教师数组
	 * @param submits       确认克隆
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Teacher[] arr, boolean submits) {
		if (submits) {
			if (exist(targetno, clonetargetno, arr)) {
				arr[clonetargetno].setName(arr[targetno].getName());
				arr[clonetargetno].setAge(arr[targetno].getAge());
				arr[clonetargetno].setGender(arr[targetno].getGender());
				arr[clonetargetno].setGetProjDate(arr[targetno].getGetProjDate());
			} else {
				System.out.println("您所指定的两人有一人或者两人都不存在!请检查!");
			}
		} else {
			System.err.println("未允许克隆!");
		}
	}

	/**
	 * <code>克隆管理人员的1个基础信息</code>
	 * 
	 * @param targetno      克隆模板编号
	 * @param clonetargetno 被克隆管理人源编号
	 * @param arr           管理人员数组
	 * @param cloneINF1     克隆信息的标记1 <br>
	 *                      <strong>注意!克隆标记只有: name , age , gender , getProjDate
	 *                      </strong>
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Administrators[] arr, String cloneINF1) {
		if (exist(targetno, clonetargetno, arr)) {
			if (cloneINF1.equals("name") || cloneINF1.equals("age") || cloneINF1.equals("gender")
					|| cloneINF1.equals("getJobDate")) {
				if (cloneINF1.equals("name")) {
					arr[clonetargetno].setJob(arr[targetno].getName());
				} else if (cloneINF1.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF1.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else {
					arr[clonetargetno].setGetJobDate(arr[targetno].getGetJobDate());
				}
			} else {
				System.err.println("克隆参数1错误!请检查!支持的参数有:name , age , gender , getJobDate");
			}
		} else {
			System.out.println("您所指定的两人有一人或者两人都不存在!请检查!");
		}
	}

	/**
	 * <code>克隆管理人员的2个基础信息</code>
	 * 
	 * @param targetno      克隆模板编号
	 * @param clonetargetno 被克隆管理人源编号
	 * @param arr           管理人员数组
	 * @param cloneINF1     克隆信息的标记1
	 * @param cloneINF2     克隆信息的标记2 <br>
	 *                      <strong>注意!克隆标记只有: name , age , gender , getProjDate
	 *                      </strong>
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int clonetargetno, int targetno, Administrators[] arr, String cloneINF1,
			String cloneINF2) {
		if (exist(targetno, clonetargetno, arr)) {
			if (cloneINF1.equals("name") || cloneINF1.equals("age") || cloneINF1.equals("gender")
					|| cloneINF1.equals("getJobDate")) {
				if (cloneINF1.equals("name")) {
					arr[clonetargetno].setJob(arr[targetno].getName());
				} else if (cloneINF1.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF1.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else {
					arr[clonetargetno].setGetJobDate(arr[targetno].getGetJobDate());
				}
			} else {
				System.err.println("克隆参数1错误!请检查!支持的参数有:name , age , gender , getJobDate");
			}
			if (cloneINF2.equals("name") || cloneINF2.equals("age") || cloneINF2.equals("gender")
					|| cloneINF2.equals("getJobDate")) {
				if (cloneINF2.equals("name")) {
					arr[clonetargetno].setJob(arr[targetno].getName());
				} else if (cloneINF2.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF2.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else {
					arr[clonetargetno].setGetJobDate(arr[targetno].getGetJobDate());
				}
			} else {
				System.err.println("克隆参数2错误!请检查!支持的参数有:name , age , gender , getJobDate");
			}
		} else {
			System.out.println("您所指定的两人有一人或者两人都不存在!请检查!");
		}
	}

	/**
	 * <code>克隆管理人员的3个基础信息</code>
	 * 
	 * @param targetno      克隆模板编号
	 * @param clonetargetno 被克隆管理人源编号
	 * @param arr           管理人员数组
	 * @param cloneINF1     克隆信息的标记1
	 * @param cloneINF2     克隆信息的标记2
	 * @param cloneINF3     克隆信息的标记3 <br>
	 *                      <strong>注意!克隆标记只有: name , age , gender , getProjDate
	 *                      </strong>
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Administrators[] arr, String cloneINF1,
			String cloneINF2, String cloneINF3) {
		if (exist(targetno, clonetargetno, arr)) {
			if (cloneINF1.equals("name") || cloneINF1.equals("age") || cloneINF1.equals("gender")
					|| cloneINF1.equals("getJobDate")) {
				if (cloneINF1.equals("name")) {
					arr[clonetargetno].setJob(arr[targetno].getName());
				} else if (cloneINF1.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF1.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else {
					arr[clonetargetno].setGetJobDate(arr[targetno].getGetJobDate());
				}
			} else {
				System.err.println("克隆参数1错误!请检查!支持的参数有:name , age , gender , getJobDate");
			}
			if (cloneINF2.equals("name") || cloneINF2.equals("age") || cloneINF2.equals("gender")
					|| cloneINF2.equals("getJobDate")) {
				if (cloneINF2.equals("name")) {
					arr[clonetargetno].setJob(arr[targetno].getName());
				} else if (cloneINF2.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF2.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else {
					arr[clonetargetno].setGetJobDate(arr[targetno].getGetJobDate());
				}
			} else {
				System.err.println("克隆参数2错误!请检查!支持的参数有:name , age , gender , getJobDate");
			}
			if (cloneINF3.equals("name") || cloneINF3.equals("age") || cloneINF3.equals("gender")
					|| cloneINF3.equals("getJobDate")) {
				if (cloneINF3.equals("name")) {
					arr[clonetargetno].setJob(arr[targetno].getName());
				} else if (cloneINF3.equals("age")) {
					arr[clonetargetno].setAge(arr[targetno].getAge());
				} else if (cloneINF3.equals("gender")) {
					arr[clonetargetno].setGender(arr[targetno].getGender());
				} else {
					arr[clonetargetno].setGetJobDate(arr[targetno].getGetJobDate());
				}
			} else {
				System.err.println("克隆参数3错误!请检查!支持的参数有:name , age , gender , getJobDate");
			}
		} else {
			System.out.println("您所指定的两人有一人或者两人都不存在!请检查!");
		}
	}

	/**
	 * <code>克隆管理人员所有的基础信息</code>
	 * 
	 * @param targetno      克隆模板的编号
	 * @param clonetargetno 被克隆管理人员的编号
	 * @param arr           管理人员数组
	 * @param submits       确认克隆
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Administrators[] arr, boolean submits) {
		if (submits) {
			if (exist(targetno, clonetargetno, arr)) {
				arr[clonetargetno].setName(arr[targetno].getName());
				arr[clonetargetno].setAge(arr[targetno].getAge());
				arr[clonetargetno].setGender(arr[targetno].getGender());
				arr[clonetargetno].setGetJobDate(arr[targetno].getGetJobDate());
			} else {
				System.out.println("您所指定的两人有一人或者两人都不存在!请检查!");
			}
		} else {
			System.err.println("未允许克隆!");
		}
	}

	/**
	 * <code> 确认使用API </code> <br>
	 * <strong> 实现此方法即可使用本API </strong> <br>
	 * <strong> 返回类型: void </strong> <br>
	 * <span> 例如:protected void submits() {} </span> <br>
	 * <code> 可以提高访问等级,但不能降低 </code>
	 */
	protected abstract void submits();

	@Override
	public String toString() {
		return "Error";
	}
}
