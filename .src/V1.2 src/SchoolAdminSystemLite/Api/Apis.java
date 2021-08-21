package SchoolAdminSystemLite.Api;

import icu.mofangserver.SchoolAdminSystemLite.fuctions.GetNowTime;
import icu.mofangserver.SchoolAdminSystemLite.main.Main;
import icu.mofangserver.SchoolAdminSystemLite.template.Administrator;
import icu.mofangserver.SchoolAdminSystemLite.template.Student;
import icu.mofangserver.SchoolAdminSystemLite.template.Teacher;

/**
 * @author z_yu
 * @version 1.0
 * @serial SchoolAdminSystemLite
 * @since SchoolAdminSystemLite 0.3
 */

public final class Apis {
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

	private final static boolean exist(int on, int on1, Administrator[] adm) {
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
	 * <code>��ȡ�������ѧ����Ϣ</code>
	 * 
	 * @return Student ѧ����Ϣ
	 * @param No ѧ�����
	 */
	public final Student getthisStudentInfoApi(int No) {
		return Main.stuArr[No];
	}

	/**
	 * <code>��ȡ������Ľ�ʦ��Ϣ</code>
	 * 
	 * @return Teacher ��ʦ��Ϣ
	 * @param No ��ʦ���
	 */
	public final Teacher getthisTeacherInfoApi(int No) {
		return Main.teaArr[No];
	}

	/**
	 * <code>��ȡ������Ĺ�����Ա��Ϣ</code>
	 * 
	 * @return Administrators ������Ա��Ϣ
	 * @param No ������Ա���
	 */
	public final Administrator getthisAdministratorsInfoApi(int No) {
		return Main.admArr[No];
	}

	/**
	 * <code>��ȡ���������ѧ����Ϣ</code>
	 * 
	 * @return Student ѧ����Ϣ
	 * @param No  ѧ�����
	 * @param arr ���������ѧ������
	 */
	public final Student getotherStudentInfoApi(int No, Student[] arr) {
		return arr[No];
	}

	/**
	 * <code>��ȡ����������Ľ�ʦ��Ϣ</code>
	 * 
	 * @return Teacher ��ʦ��Ϣ
	 * @param No  ��ʦ���
	 * @param arr ��������Ľ�ʦ����
	 */
	public final Teacher getotherTeacherInfoApi(int No, Teacher[] arr) {
		return arr[No];
	}

	/**
	 * <code>��ȡ����������Ĺ�����Ա��Ϣ</code>
	 * 
	 * @return Administrators ������Ա��Ϣ
	 * @param No  ������Ա���
	 * @param arr ��������Ĺ�����Ա����
	 */
	public final Administrator getotherAdministratorsInfoApi(int No, Administrator[] arr) {
		return arr[No];
	}

	/**
	 * <code> ��ȡ��ǰʱ�� </code>
	 * 
	 * @deprecated
	 * @return String ʱ���ַ���
	 */
	public final String getTime() {
		return GetNowTime.Date();
	}

	/**
	 * <code> ��ȡĿ������ API </code>
	 * 
	 * @return String Ŀ������
	 * @param No  Ŀ����
	 * @param arr ���������Ŀ�����������
	 */
	public final String getTargetType(int No, Student[] arr) {
		return arr[No].getType();
	}

	/**
	 * <code> ��ȡĿ������ API </code>
	 * 
	 * @return String Ŀ������
	 * @param No  Ŀ����
	 * @param arr ���������Ŀ�����������
	 */
	public final String getTargetType(int No, Teacher[] arr) {
		return arr[No].getType();
	}

	/**
	 * <code> ��ȡĿ������ API </code>
	 * 
	 * @return String Ŀ������
	 * @param No  Ŀ����
	 * @param arr ���������Ŀ�����������
	 */
	public final String getTargetType(int No, Administrator[] arr) {
		return arr[No].getType();
	}

	/**
	 * <code> ����ѧ������(����ר��) </code>
	 * 
	 * @return Student[] ѧ������
	 * @param amount �����±���
	 */
	public final Student[] returnStudentArr(int amount) {
		Student[] arr = new Student[amount];
		return arr;
	}

	/**
	 * <code> ���ý�ʦ����(����ר��) </code>
	 * 
	 * @return Teacher[] ��ʦ����
	 * @param amount �����±���
	 */
	public final Teacher[] returnTeacherArr(int amount) {
		Teacher[] arr = new Teacher[amount];
		return arr;
	}

	/**
	 * <code> ���ù�����Ա����(����ר��) </code>
	 * 
	 * @return Administrators[] ������Ա����
	 * @param amount �����±���
	 */
	public final Administrator[] returnAdministratorsArr(int amount) {
		Administrator[] arr = new Administrator[amount];
		return arr;
	}

	/**
	 * <code> ��¡ѧ��һ��������Ϣ </code>
	 * 
	 * @param targetno      ��¡ģ��ı��
	 * @param clonetargetno ����¡ѧ���ı��
	 * @param arr           ѧ������
	 * @param cloneINF1     ��¡��Ϣ�ı��1 <br>
	 *                      <strong>ע��!��¡���ֻ��: name , age , gender , enterdate
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
				System.err.println("��¡����1����!����!֧�ֵĲ�����:name , age , gender , enterdate , educatenum");
			}
		} else {
			System.out.println("����ָ����������һ�˻������˶�������!����!");
		}
	}

	/**
	 * <code> ��¡ѧ������������Ϣ </code>
	 * 
	 * @param targetno      ��¡ģ��ı��
	 * @param clonetargetno ����¡ѧ���ı��
	 * @param arr           ѧ������
	 * @param cloneINF1     ��¡��Ϣ�ı��1
	 * @param cloneINF2     ��¡��Ϣ�ı��2 <br>
	 *                      <strong>ע��!��¡���ֻ��: name , age , gender , enterdate
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
				System.err.println("��¡����1����!����!֧�ֵĲ�����:name , age , gender , enterdate , educatenum");
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
				System.err.println("��¡����2����!����!֧�ֵĲ�����:name , age , gender , enterdate , educatenum");
			}
		} else {
			System.out.println("����ָ����������һ�˻������˶�������!����!");
		}
	}

	/**
	 * <code> ��¡ѧ������������Ϣ </code>
	 * 
	 * @param targetno      ��¡ģ��ı��
	 * @param clonetargetno ����¡ѧ���ı��
	 * @param arr           ѧ������
	 * @param cloneINF1     ��¡��Ϣ�ı��1
	 * @param cloneINF2     ��¡��Ϣ�ı��2
	 * @param cloneINF3     ��¡��Ϣ�ı��3 <br>
	 *                      <strong>ע��!��¡���ֻ��: name , age , gender , enterdate
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
				System.err.println("��¡����1����!����!֧�ֵĲ�����:name , age , gender , enterdate , educatenum");
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
				System.err.println("��¡����2����!����!֧�ֵĲ�����:name , age , gender , enterdate , educatenum");
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
				System.err.println("��¡����3����!����!֧�ֵĲ�����:name , age , gender , enterdate , educatenum");
			}
		} else {
			System.out.println("����ָ����������һ�˻������˶�������!����!");
		}
	}

	/**
	 * <code> ��¡ѧ���ĸ�������Ϣ </code>
	 * 
	 * @param targetno      ��¡ģ��ı��
	 * @param clonetargetno ����¡ѧ���ı��
	 * @param arr           ѧ������
	 * @param cloneINF1     ��¡��Ϣ�ı��1
	 * @param cloneINF2     ��¡��Ϣ�ı��2
	 * @param cloneINF3     ��¡��Ϣ�ı��3
	 * @param cloneINF4     ��¡��Ϣ�ı��4 <br>
	 *                      <strong>ע��!��¡���ֻ��: name , age , gender , enterdate
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
				System.err.println("��¡����1����!����!֧�ֵĲ�����:name , age , gender , enterdate , educatenum");
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
				System.err.println("��¡����2����!����!֧�ֵĲ�����:name , age , gender , enterdate , educatenum");
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
				System.err.println("��¡����3����!����!֧�ֵĲ�����:name , age , gender , enterdate , educatenum");
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
				System.err.println("��¡����4����!����!֧�ֵĲ�����:name , age , gender , enterdate , educatenum");
			}
		} else {
			System.out.println("����ָ����������һ�˻������˶�������!����!");
		}
	}

	/**
	 * <code> ��¡ѧ�����л�����Ϣ </code>
	 * 
	 * @param targetno      ��¡ģ��ı��
	 * @param clonetargetno ����¡ѧ���ı��
	 * @param arr           ѧ������
	 * @param submits       ȷ�Ͽ�¡
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
				System.out.println("����ָ����������һ�˻������˶�������!����!");
			}
		} else {
			System.err.println("δ�����¡!");
		}
	}

	/**
	 * <code> ��¡��ʦ��1��������Ϣ </code>
	 * 
	 * @param targetno      ��¡ģ����
	 * @param clonetargetno ����¡��ʦ���
	 * @param arr           ��ʦ����
	 * @param cloneINF1     ��¡��Ϣ�ı��1 <br>
	 *                      <strong>ע��!��¡���ֻ��: name , age , gender , getProjDate
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
				System.err.println("��¡����1����!����!֧�ֵĲ�����:name , age , gender , getProjDate");
			}
		} else {
			System.out.println("����ָ����������һ�˻������˶�������!����!");
		}
	}

	/**
	 * <code> ��¡��ʦ��2��������Ϣ </code>
	 * 
	 * @param targetno      ��¡ģ����
	 * @param clonetargetno ����¡��ʦ���
	 * @param arr           ��ʦ����
	 * @param cloneINF1     ��¡��Ϣ�ı��1
	 * @param cloneINF2     ��¡��Ϣ�ı��2 <br>
	 *                      <strong>ע��!��¡���ֻ��: name , age , gender , getProjDate
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
				System.err.println("��¡����1����!����!֧�ֵĲ�����:name , age , gender , getProjDate");
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
				System.err.println("��¡����2����!����!֧�ֵĲ�����:name , age , gender , getProjDate");
			}
		} else {
			System.out.println("����ָ����������һ�˻������˶�������!����!");
		}
	}

	/**
	 * <code> ��¡��ʦ��3��������Ϣ </code>
	 * 
	 * @param targetno      ��¡ģ����
	 * @param clonetargetno ����¡��ʦ���
	 * @param arr           ��ʦ����
	 * @param cloneINF1     ��¡��Ϣ�ı��1
	 * @param cloneINF2     ��¡��Ϣ�ı��2
	 * @param cloneINF3     ��¡��Ϣ�ı��3 <br>
	 *                      <strong>ע��!��¡���ֻ��: name , age , gender , getProjDate
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
				System.err.println("��¡����1����!����!֧�ֵĲ�����:name , age , gender , getProjDate");
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
				System.err.println("��¡����2����!����!֧�ֵĲ�����:name , age , gender , getProjDate");
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
				System.err.println("��¡����3����!����!֧�ֵĲ�����:name , age , gender , getProjDate");
			}
		} else {
			System.out.println("����ָ����������һ�˻������˶�������!����!");
		}
	}

	/**
	 * <code> ��¡��ʦ�����л�����Ϣ </code>
	 * 
	 * @param targetno      ��¡ģ����
	 * @param clonetargetno ����¡��ʦ���
	 * @param arr           ��ʦ����
	 * @param submits       ȷ�Ͽ�¡
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Teacher[] arr, boolean submits) {
		if (submits) {
			if (exist(targetno, clonetargetno, arr)) {
				arr[clonetargetno].setName(arr[targetno].getName());
				arr[clonetargetno].setAge(arr[targetno].getAge());
				arr[clonetargetno].setGender(arr[targetno].getGender());
				arr[clonetargetno].setGetProjDate(arr[targetno].getGetProjDate());
			} else {
				System.out.println("����ָ����������һ�˻������˶�������!����!");
			}
		} else {
			System.err.println("δ�����¡!");
		}
	}

	/**
	 * <code>��¡������Ա��1��������Ϣ</code>
	 * 
	 * @param targetno      ��¡ģ����
	 * @param clonetargetno ����¡������Դ���
	 * @param arr           ������Ա����
	 * @param cloneINF1     ��¡��Ϣ�ı��1 <br>
	 *                      <strong>ע��!��¡���ֻ��: name , age , gender , getProjDate
	 *                      </strong>
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Administrator[] arr, String cloneINF1) {
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
				System.err.println("��¡����1����!����!֧�ֵĲ�����:name , age , gender , getJobDate");
			}
		} else {
			System.out.println("����ָ����������һ�˻������˶�������!����!");
		}
	}

	/**
	 * <code>��¡������Ա��2��������Ϣ</code>
	 * 
	 * @param targetno      ��¡ģ����
	 * @param clonetargetno ����¡������Դ���
	 * @param arr           ������Ա����
	 * @param cloneINF1     ��¡��Ϣ�ı��1
	 * @param cloneINF2     ��¡��Ϣ�ı��2 <br>
	 *                      <strong>ע��!��¡���ֻ��: name , age , gender , getProjDate
	 *                      </strong>
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Administrator[] arr, String cloneINF1,
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
				System.err.println("��¡����1����!����!֧�ֵĲ�����:name , age , gender , getJobDate");
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
				System.err.println("��¡����2����!����!֧�ֵĲ�����:name , age , gender , getJobDate");
			}
		} else {
			System.out.println("����ָ����������һ�˻������˶�������!����!");
		}
	}

	/**
	 * <code>��¡������Ա��3��������Ϣ</code>
	 * 
	 * @param targetno      ��¡ģ����
	 * @param clonetargetno ����¡������Դ���
	 * @param arr           ������Ա����
	 * @param cloneINF1     ��¡��Ϣ�ı��1
	 * @param cloneINF2     ��¡��Ϣ�ı��2
	 * @param cloneINF3     ��¡��Ϣ�ı��3 <br>
	 *                      <strong>ע��!��¡���ֻ��: name , age , gender , getProjDate
	 *                      </strong>
	 * @since SASYS 0.9
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Administrator[] arr, String cloneINF1, String cloneINF2,
			String cloneINF3) {
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
				System.err.println("��¡����1����!����!֧�ֵĲ�����:name , age , gender , getJobDate");
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
				System.err.println("��¡����2����!����!֧�ֵĲ�����:name , age , gender , getJobDate");
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
				System.err.println("��¡����3����!����!֧�ֵĲ�����:name , age , gender , getJobDate");
			}
		} else {
			System.out.println("����ָ����������һ�˻������˶�������!����!");
		}
	}

	/**
	 * <code>��¡������Ա���еĻ�����Ϣ</code>
	 * 
	 * @param targetno      ��¡ģ��ı��
	 * @param clonetargetno ����¡������Ա�ı��
	 * @param arr           ������Ա����
	 * @param submits       ȷ�Ͽ�¡
	 */
	public final void cloneIMF(int targetno, int clonetargetno, Administrator[] arr, boolean submits) {
		if (submits) {
			if (exist(targetno, clonetargetno, arr)) {
				arr[clonetargetno].setName(arr[targetno].getName());
				arr[clonetargetno].setAge(arr[targetno].getAge());
				arr[clonetargetno].setGender(arr[targetno].getGender());
				arr[clonetargetno].setGetJobDate(arr[targetno].getGetJobDate());
			} else {
				System.out.println("����ָ����������һ�˻������˶�������!����!");
			}
		} else {
			System.err.println("δ�����¡!");
		}
	}

	/**
	 * <code>��ӡ����ѧ���ĸ�����Ϣ</code> <br>
	 * <strong>ע��,��������ֵΪ��ϣ��ֵ,������ѧ�����Ƿ񸲸���toString����!</strong> <br>
	 * <strong>ѧ����toString������׼д��:</strong> <br>
	 * <code>@Override</code> <br>
	 * <code>public final String toString() {</code> <br>
	 * <code>&nbsp&nbsp&nbsp&nbspString msg = "\t" + this.on + "\t" + this.name + "\t" + this.age + "\t" + this.gender + "\t" + this.enterdate</code>
	 * <br>
	 * <code>		+ "\t" + this.educatenum + "\t" + this.chinese + "\t" + this.maths + "\t" + this.english + "\t"</code>
	 * <br>
	 * <code>		+ this.physics + "\t" + this.chemistry + "\t" + this.history + "\t" + this.political + "\t" + this.sum</code>
	 * <br>
	 * <code>		+ "\t" + this.avg;</code> <br>
	 * <code>&nbsp&nbsp&nbsp&nbspreturn msg;</code> <br>
	 * <code>}</code>
	 * 
	 * @param arr ѧ������
	 */
	public final void printArraysAllTargetInfo(Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
	}

	/**
	 * <code>��ӡ���н�ʦ�ĸ�����Ϣ</code> <br>
	 * <strong>ע��,��������ֵΪ��ϣ��ֵ,�������ʦ���Ƿ񸲸���toString����!</strong> <br>
	 * <strong>��ʦ��toString������׼д��:</strong> <br>
	 * <code>@Override</code> <br>
	 * <code>public final String toString() {</code> <br>
	 * <code>&nbsp&nbsp&nbsp&nbspString msg = "\t" + this.No + "\t" + this.name + "\t" + this.age + "\t" + this.gender + "\t" + this.getProjDate</code>
	 * <br>
	 * <code>		+ "\t" + this.Proj + "\t" + this.classProj + "\t" + this.khMark;</code>
	 * <br>
	 * <code>&nbsp&nbsp&nbsp&nbspreturn msg;</code> <br>
	 * <code> }</code>
	 * 
	 * @param arr ��ʦ����
	 */
	public final void printArraysAllTargetInfo(Teacher[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
	}

	/**
	 * <code>��ӡ���й�����Ա��Ϣ</code> <br>
	 * <strong>ע��,��������ֵΪ��ϣ��ֵ,�����������Ա���Ƿ񸲸���toString����!</strong> <br>
	 * <strong>������Ա��toString������׼д��:</strong> <br>
	 * <code>@Override <br>
	 * <code>public final String toString() { <br>
	 * <code>&nbsp&nbsp&nbsp&nbspString msg = "\t" + this.No + "\t" + this.name +
	 * "\t" + this.age + "\t" + this.gender + "\t" + this.getJobDate <br>
	 * <code> + "\t" + this.Job + "\t" + this.adminClasses; <br>
	 * <code>&nbsp&nbsp&nbsp&nbspreturn msg; <br>
	 * <code>}
	 * 
	 * @param arr ������Ա����
	 */
	public final void printArraysAllTargetInfo(Administrator[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
	}

	@Override
	public String toString() {
		return "Error!";
	}
}
