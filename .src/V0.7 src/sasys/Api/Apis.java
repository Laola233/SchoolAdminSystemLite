package sasys.Api;

import xyz.mofangserver.sasys.main.*;
import xyz.mofangserver.sasys.fuctions.*;
import xyz.mofangserver.sasys.template.*;

/**
 * @author z_yu
 * @version 0.1
 * @since 0.1
 * <br> SASYS(StudentAdminSystem)的API
 * @serial SASYS(StudentAdminSystem)
 * <br> 使用方法:在所需要API类中继承该类
 */
public abstract class Apis {
	protected double apiversion = 0.1;

	/**
	 * <code>获取程序里的学生信息</code>
	 * @return Student 学生信息
	 * @param No 学生编号
	 */
	public final Student getthisStudentInfoApi(int No) {
		return Main.stuArr[No];
	}

	/**
	 * <code>获取程序里的教师信息</code>
	 * @return Teacher 教师信息
	 * @param No 教师编号
	 */
	public final Teacher getthisTeacherInfoApi(int No) {
		return Main.teaArr[No];
	}

	/**
	 * <code>获取程序里的管理人员信息</code>
	 * @return Administrators 管理人员信息
	 * @param No 管理人员编号
	 */
	public final Administrators getthisAdministratorsInfoApi(int No) {
		return Main.admArr[No];
	}

	/**
	 * <code>获取其他程序的学生信息</code>
	 * @return Student 学生信息
	 * @param No 学生编号 
	 * @param arr 你所定义的学生数组
	 */
	public final Student getotherStudentInfoApi(int No, Student[] arr) {
		return arr[No];
	}

	/**
	 * <code>获取其他程序里的教师信息</code>
	 * @return Teacher 教师信息
	 * @param No 教师编号
	 * @param arr 你所定义的教师数组
	 */
	public final Teacher getotherTeacherInfoApi(int No, Teacher[] arr) {
		return arr[No];
	}

	/**
	 * <code>获取其他程序里的管理人员信息</code>
	 * @return Administrators 管理人员信息
	 * @param No 管理人员编号
	 * @param arr 你所定义的管理人员数组
	 */
	public final Administrators getotherAdministratorsInfoApi(int No, Administrators[] arr) {
		return arr[No];
	}

	/**
	 * <code> 获取当前时间 </code>
	 * @deprecated
	 * @return String 时间字符串
	 */
	public final String getTime() {
		return GetNowTime.Date();
	}

	/**
	 * <code> 获取目标类型 API </code> 
	 * @return String 目标类型
	 * @param No 目标编号
	 * @param arr 你所定义的目标的数组名称
	 */
	public final String getTargetType(int No, Student[] arr) {
		return arr[No].getType();
	}

	/**
	 * <code> 获取目标类型 API </code> 
	 * @return String 目标类型
	 * @param No 目标编号
	 * @param arr 你所定义的目标的数组名称
	 */
	public final String getTargetType(int No, Teacher[] arr) {
		return arr[No].getType();
	}

	/**
	 * <code> 获取目标类型 API </code> 
	 * @return String 目标类型
	 * @param No 目标编号
	 * @param arr 你所定义的目标的数组名称
	 */
	public final String getTargetType(int No, Administrators[] arr) {
		return arr[No].getType();
	}

	/**
	 * <code> 设置学生数组(懒人专用) </code>
	 * @return Student[] 学生数组
	 * @param amount 数组下标数
	 */
	public final Student[] returnStudentArr(int amount) {
		Student[] arr = new Student[amount];
		return arr;
	}

	/**
	 * <code> 设置教师数组(懒人专用) </code>
	 * @return Teacher[] 教师数组
	 * @param amount 数组下标数
	 */
	public final Teacher[] returnTeacherArr(int amount) {
		Teacher[] arr = new Teacher[amount];
		return arr;
	}

	/**
	 * <code> 设置管理人员数组(懒人专用) </code>
	 * @return Administrators[] 管理人员数组
	 * @param amount 数组下标数
	 */
	public final Administrators[] returnAdministratorsArr(int amount) {
		Administrators[] arr = new Administrators[amount];
		return arr;
	}

	/**
	 * <code> 确认使用API </code>
	 * <br><strong> 实现此方法即可使用本API </strong>
	 * <br><strong> 返回类型: void </strong>
	 * <br><span> 例如:void submits() {} </span>
	 */
	abstract void submits();
}
