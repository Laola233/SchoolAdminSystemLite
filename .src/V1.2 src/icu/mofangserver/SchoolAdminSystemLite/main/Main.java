package icu.mofangserver.SchoolAdminSystemLite.main;

import java.util.Scanner;

import icu.mofangserver.SchoolAdminSystemLite.fuctions.EmptyPlaceholder;
import icu.mofangserver.SchoolAdminSystemLite.fuctions.GetNowTime;
import icu.mofangserver.SchoolAdminSystemLite.fuctions.MembersAdmin;
import icu.mofangserver.SchoolAdminSystemLite.fuctions.PrintInfo;
import icu.mofangserver.SchoolAdminSystemLite.fuctions.PrintMarks;
import icu.mofangserver.SchoolAdminSystemLite.template.Administrator;
import icu.mofangserver.SchoolAdminSystemLite.template.Student;
import icu.mofangserver.SchoolAdminSystemLite.template.Teacher;

/**
 * @author z_yu
 * @version 0.7
 * @serial SchoolAdminSystemLite
 * @since SchoolAdminSystemLite 0.1
 */
public final class Main {
	public static Student[] stuArr = new Student[99999];
	public static Teacher[] teaArr = new Teacher[99999];
	public static Administrator[] admArr = new Administrator[99999];
	public static int chose1;

	@SuppressWarnings({ "static-access" })
	public final static void main(String[] args) throws Exception {
		String Equals = null;
		@SuppressWarnings("resource")
		Scanner setIn = new Scanner(System.in);
		EmptyPlaceholder phr = new EmptyPlaceholder();
		MembersAdmin a = new MembersAdmin();
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
			System.out.println("========ѧУ����ϵͳ========");
			System.out.println("����ʱ��:" + time.Date());
			System.out.println("1:����ѧ������ϵͳ");
			System.out.println("2:�����ʦ����ϵͳ");
			System.out.println("3:���������Ա����ϵͳ");
			System.out.println("4:����ģ�忪��");
			System.out.println("666:�˳�ϵͳ");
			System.out.println("������ѡ��Ĺ��ܱ��:");
			try {
				chose1 = setIn.nextInt();
			} catch (Exception e) {
				System.err.println("�Ƿ�����!����!");
			}
			switch (chose1) {
			case 1:
				while (true) {
					phr.printPlaceholder(2);
					System.out.println("==========ѧ������ϵͳ==========");
					System.out.println("1:���һ��ѧ��");
					System.out.println("2:����һ��ѧ��");
					System.out.println("3:���ݱ�Ÿ���ѧ���Ļ�����Ϣ");
					System.out.println("4:���ݱ��ɾ��ѧ��");
					System.out.println("5:���ݱ������ѧ���ĸ��ųɼ�");
					System.out.println("6:����ĳ�ųɼ���������");
					System.out.println("7:�����ֽܷ�������");
					System.out.println("8:��ӡѧ����Ϣ");
					System.out.println("9:��ӡѧ���ɼ�����");
					System.out.println("666:�����ϼ��˵�");
					System.out.println("��Ҫִ�еĹ���:");

					try {
						Equals = setIn.next();
					} catch (Exception e) {
						System.err.println("�Ƿ�����!����!");
						continue;
					}

					if (Equals.equals("1")) {
						MembersAdmin a1 = new MembersAdmin();
						@SuppressWarnings("resource")
						Scanner getTargetType = new Scanner(System.in);
						@SuppressWarnings("resource")
						Scanner getInfo = new Scanner(System.in);
						System.out.println("ִ�����ѧ������");
						System.out.println("����ģ����:\tStudent");
						System.out.println("���봴��������ʹ�õ�ģ��:\t");
						String targetType = getTargetType.next();
						switch (targetType) {
						case "Student":
							if (Student.getIsEnabled() == true) {
								try {
									System.out.println("������ѧ��������");
									String name = getInfo.next();
									System.out.println("������ѧ��������");
									int age = getInfo.nextInt();
									System.out.println("������ѧ�����Ա�");
									char gender = getInfo.next().charAt(0);
									System.out.println("������ѧ������ѧ����");
									String enterdate = getInfo.next();
									System.out.println("������ѧ����ѧ����");
									int educatenum = getInfo.nextInt();
									a1.addTarget(name, age, gender, enterdate, educatenum, stuArr);
								} catch (Exception e) {
									System.err.println("�Ƿ�����!����!");
									continue;
								}
							} else {
								System.err.println("ģ���Ѿ�����!");
							}
							break;
						}
					} else if (Equals.equals("2")) {
						System.out.println("����ģ��");
						System.out.println("������ѧ���ı��:");
						int on = setIn.nextInt();
						a.findTarget(on, stuArr);
					} else if (Equals.equals("3")) {
						System.out.println("ִ�и���ѧ���Ļ�����Ϣ");
						System.out.println("������ѧ���ı�ţ�");
						int on = setIn.nextInt();
						if (a.exist(on, stuArr[on])) {
							System.out.println("������ѧ����������");
							String name = setIn.next();
							System.out.println("������ѧ��������:");
							int age = setIn.nextInt();
							System.out.println("������ѧ�����Ա�");
							char gender = setIn.next().charAt(0);
							System.out.println("������ѧ������ѧ����");
							String enterdate = setIn.next();
							System.out.println("������ѧ����ѧ����");
							int educatenum = setIn.nextInt();
							a.replaceStuInfo(on, name, age, gender, enterdate, educatenum, stuArr);
						} else {
							System.err.println("ѧ��������!");
						}
					} else if (Equals.equals("4")) {
						System.out.println("ִ��ɾ������");
						System.out.println("������ѧ���ı��:");
						int on = setIn.nextInt();
						a.deleteStu(on, stuArr);
					} else if (Equals.equals("5")) {
						System.out.println("ִ������ѧ���ɼ�����");
						System.out.println("������ѧ���ı��:");
						int on = setIn.nextInt();
						a.inputMarks(on, stuArr);
					} else if (Equals.equals("6")) {
						System.out.println("ִ�и���ĳ��Ŀ�ɼ������������");
						System.out.println("����(1) ��ѧ(2) Ӣ��(3) ����(4) ��ѧ(5) ��ʷ(6) ����(7)");
						System.out.println("��ָ����Ŀ:");
						int chosesubj = setIn.nextInt();
						a.setSort(chosesubj, stuArr);
					} else if (Equals.contentEquals("7")) {
						System.out.println("ִ�а����ܷ��������");
						a.setSumSort(stuArr);
					} else if (Equals.contentEquals("666")) {
						phr.printPlaceholder(true);
						System.out.println("���Ѿ��˳�ѧ������ϵͳ!");
						break;
					} else if (Equals.equals("8")) {
						System.out.println("ִ�д�ӡѧ����Ϣ����");
						System.out.println("������ѧ�����");
						if (setIn.hasNextInt()) {
							int NoNum = setIn.nextInt();
							PrintInfo a2 = new PrintInfo();
							a2.printInfo(NoNum, stuArr);
						} else {
							System.out.println("�Ƿ�����!����!");
						}
					} else if (Equals.equals("9")) {
						System.out.println("ִ�д�ӡѧ���ɼ�����");
						System.out.println("������ѧ�����");
						if (setIn.hasNextInt()) {
							int NoNum = setIn.nextInt();
							PrintMarks a2 = new PrintMarks();
							a2.printMarks(NoNum, stuArr);
						} else {
							System.out.println("�Ƿ�����!����!");
						}
					}
				}
				break;
			case 2:
				while (true) {
					PrintInfo a3 = new PrintInfo();
					PrintMarks a4 = new PrintMarks();
					MembersAdmin a2 = new MembersAdmin();
					phr.printPlaceholder(2);
					System.out.println("==========��ʦ����ϵͳ==========");
					System.out.println("1:���һ����ʦ");
					System.out.println("2:����һ����ʦ");
					System.out.println("3:ɾ��һ����ʦ");
					System.out.println("4:����һ����ʦ�Ŀ��˷�");
					System.out.println("5:���ݿ��˷�����");
					System.out.println("6:��ӡ��ʦ��Ϣ");
					System.out.println("7:��ӡ��ʦ���˷���");
					System.out.println("8:������ʦ��Ϣ");
					System.out.println("9:������ʦ����ѧ��");
					System.out.println("10:����������İ༶");
					System.out.println("666:�����ϼ��˵�");
					System.out.println("��Ҫִ�еĹ���:");
					Equals = setIn.next();
					if (Equals.equals("1")) {
						@SuppressWarnings("resource")
						Scanner getInfo = new Scanner(System.in);
						@SuppressWarnings("resource")
						Scanner getTargetTyoe = new Scanner(System.in);
						System.out.println("����ģ����:\t" + "Teacher");
						System.out.println("��������Ҫʹ�õ�ģ��:");
						String targettype = getTargetTyoe.next();
						switch (targettype) {
						case "Teacher":
							if (Teacher.getIsEnabled() == true) {
								System.out.println("������ӽ�ʦ����");
								System.out.println("�������ʦ������:");
								String namezj = getInfo.next();
								System.out.println("�������ʦ������:");
								int agezj = getInfo.nextInt();
								System.out.println("�������ʦ���Ա�:");
								char genderzj = getInfo.next().charAt(0);
								System.out.println("�������ʦ����ְʱ��:");
								String getProjDatezj = getInfo.next();
								a2.addTargetT(namezj, agezj, genderzj, getProjDatezj, teaArr);
							} else {
								System.err.println("ģ���Ѿ�����!");
							}
							break;
						}
					} else if (Equals.equals("2")) {
						System.out.println("ִ�в��ҽ�ʦ�Ĳ���");
						System.out.println("�������ʦ�ı��");
						int No = setIn.nextInt();
						a2.findTarget(No, teaArr);
					} else if (Equals.equals("3")) {
						System.out.println("ִ��ɾ����ʦ�Ĳ���");
						System.out.println("�������ʦ�ı��");
						int No = setIn.nextInt();
						a2.deleteTea(No, teaArr);
					} else if (Equals.contentEquals("4")) {
						System.out.println("ִ��������ʦ���˷ֲ���");
						System.out.println("�������ʦ�ı��");
						int No = setIn.nextInt();
						a2.inputkhMarks(No, teaArr);
					} else if (Equals.equals("5")) {
						System.out.println("ִ�и��ݿ��˷��������");
						a2.setKHMarkSort(teaArr);
					} else if (Equals.equals("6")) {
						System.out.println("ִ�д�ӡ��ʦ��Ϣ����");
						System.out.println("�������ʦ�ı��");
						int No = setIn.nextInt();
						a3.printTeaInfo(No, teaArr);
					} else if (Equals.equals("7")) {
						System.out.println("ִ�д�ӡ���˷ֲ���");
						System.out.println("�������ʦ�ı��");
						int No = setIn.nextInt();
						a4.printTeaKHMarks(No, teaArr);
					} else if (Equals.equals("666")) {
						phr.printPlaceholder(true);
						System.out.println("�����˳���ʦ����ϵͳ!");
						break;
					} else if (Equals.equals("8")) {
						System.out.println("���и��½�ʦ��Ϣ����");
						System.out.println("�������ʦ�ı�ţ�");
						int Nozj = setIn.nextInt();

						MembersAdmin a5 = new MembersAdmin();
						if (a5.exist(Nozj, teaArr[Nozj])) {
							System.out.println("�������ʦ������:");
							String namezj = setIn.next();
							System.out.println("�������ʦ������:");
							int agezj = setIn.nextInt();
							System.out.println("�������ʦ���Ա�:");
							char genderzj = setIn.next().charAt(0);
							System.out.println("�������ʦ����ְʱ��:");
							String getProjDatezj = setIn.next();
							a2.replaceTeaInfo(Nozj, namezj, agezj, genderzj, getProjDatezj, teaArr);
						} else {
							System.err.println("��ʦ������!");
						}
					} else if (Equals.equals("9")) {
						System.out.println("�������ʦ�ı�ţ�");
						int Nozj = setIn.nextInt();
						System.out.println("�������ʦ�����̿�Ŀ");
						String Projzj = setIn.next();

						MembersAdmin a5 = new MembersAdmin();
						a5.setTeaProj(Nozj, Projzj, teaArr);
					} else if (Equals.equals("10")) {
						System.out.println("�������ʦ�ı�ţ�");
						int Nozj = setIn.nextInt();
						System.out.println("�������ʦ�����̰༶");
						String classProjzj = setIn.next();

						MembersAdmin a5 = new MembersAdmin();
						a5.setTeaclassProj(Nozj, classProjzj, teaArr);
					}
				}
				break;
			case 3:
				while (true) {

					MembersAdmin ad1 = new MembersAdmin();
					phr.printPlaceholder(2);
					System.out.println("==========������Ա����ϵͳ==========");
					System.out.println("1:���һ��������Ա");
					System.out.println("2:����һ��������Ա");
					System.out.println("3:ɾ��һ��������Ա");
					System.out.println("4:����һ��������Ա��Ϣ");
					System.out.println("5:���ù�����Աְλ");
					System.out.println("6:���ù���༶");
					System.out.println("7����ӡ������Ա��Ϣ");
					System.out.println("666:�����ϼ��˵�");
					Equals = setIn.next();
					if (Equals.equals("1")) {
						System.out.println("����ģ����:\t" + "Administrator");
						System.out.println("��������Ҫʹ�õ�ģ��:");
						String targettype = setIn.next();
						switch (targettype) {
						case "Administrator":
							if (Administrator.getIsEnabled()) {
								System.out.println("������ӹ�����Ա����");
								System.out.println("�����������Ա������:");
								String namezj = setIn.next();
								System.out.println("�����������Ա������:");
								int agezj = setIn.nextInt();
								System.out.println("�����������Ա���Ա�:");
								char genderzj = setIn.next().charAt(0);
								System.out.println("�����������Ա����ְʱ��:");
								String getProjDatezj = setIn.next();
								ad1.addTargetA(namezj, agezj, genderzj, getProjDatezj, admArr);
							} else {
								System.err.println("ģ���Ѿ�����!");
							}
							break;
						}
					} else if (Equals.equals("2")) {
						System.out.println("ִ�в��ҹ�����Ա�Ĳ���");
						System.out.println("�����������Ա�ı��");
						int No = setIn.nextInt();
						ad1.findTarget(No, admArr);
					} else if (Equals.equals("3")) {
						System.out.println("ִ��ɾ��������Ա�Ĳ���");
						System.out.println("�����������Ա�ı��");
						int No = setIn.nextInt();
						ad1.deleteAdm(No, admArr);
					} else if (Equals.equals("4")) {
						System.out.println("���и��¹�����Ա��Ϣ����");
						System.out.println("�����������Ա�ı�ţ�");
						int Nozj = setIn.nextInt();

						MembersAdmin a5 = new MembersAdmin();
						if (a5.exist(Nozj, admArr[Nozj])) {
							System.out.println("�����������Ա������:");
							String namezj = setIn.next();
							System.out.println("�����������Ա������:");
							int agezj = setIn.nextInt();
							System.out.println("�����������Ա���Ա�:");
							char genderzj = setIn.next().charAt(0);
							System.out.println("�����������Ա����ְʱ��:");
							String getJobDatezj = setIn.next();
							ad1.replaceAdmInfo(Nozj, namezj, agezj, genderzj, getJobDatezj, admArr);
						} else {
							System.err.println("������Ա������!");
						}
					} else if (Equals.equals("5")) {
						System.out.println("�����������Ա�ı�ţ�");
						int Nozj = setIn.nextInt();
						System.out.println("�����������Ա��ְ��:");
						String Jobzj = setIn.next();
						ad1.setAdmJob(Nozj, Jobzj, admArr);
					} else if (Equals.equals("6")) {
						System.out.println("�����������Ա�ı�ţ�");
						int Nozj = setIn.nextInt();
						System.out.println("�����������Ա������İ༶:");
						String adminClassesezj = setIn.next();
						ad1.setAdminClasses(Nozj, adminClassesezj, admArr);
					} else if (Equals.equals("666")) {
						phr.printPlaceholder(true);
						System.out.println("�����˳�������Աϵͳ!");
						break;
					} else if (Equals.equals("7")) {
						System.out.println("�����������Ա�ı�ţ�");
						int Nozj = setIn.nextInt();
						PrintInfo ad2 = new PrintInfo();
						ad2.printAdmInfo(Nozj, admArr);
					} else {
						System.err.println("�������!����!");
					}
				}
				break;
			case 4:
				while (true) {
					Student b = new Student();
					Teacher b1 = new Teacher();
					Administrator b2 = new Administrator();
					phr.printPlaceholder(2);
					System.out.println("==========ģ�����==========");
					System.out.println("1:�鿴ģ���������");
					System.out.println("2:����ģ���������");
					System.out.println("666:�����ϼ��˵�");
					Equals = setIn.next();
					if (Equals.equals("1")) {
						System.out.println("����ģ������״��(true -- ���� , false -- ����)");
						System.out.println("Student:" + b.getIsEnabled());
						System.out.println("Teacher:" + b1.getIsEnabled());
						System.out.println("Administrators:" + b2.getIsEnabled());
					} else if (Equals.equals("2")) {
						System.out.println("����ģ����:\tStudent\tTeacher\tAdministrators");
						System.out.println("������Ҫ���õ�ģ������");
						String templname = setIn.next();
						if (templname.equals("Student")) {
							System.out.println("�����벼��ֵ(true -- ���� , false -- ����)");
							if (setIn.hasNextBoolean()) {
								boolean setenabled = setIn.nextBoolean();
								b.setIsEnabled(setenabled);
								System.out.println("�ɹ�!");
							} else {
								System.err.println("�Ƿ�����!����!");
							}
						} else if (templname.equals("Teacher")) {
							System.out.println("�����벼��ֵ(true -- ���� , false -- ����)");
							if (setIn.hasNextBoolean()) {
								boolean setenabled = setIn.nextBoolean();
								b1.setIsEnabled(setenabled);
								System.out.println("�ɹ�!");
							} else {
								System.err.println("�Ƿ�����!����!");
							}
						} else if (templname.equals("Administrators")) {
							System.out.println("�����벼��ֵ(true -- ���� , false -- ����)");
							if (setIn.hasNextBoolean()) {
								boolean setenabled = setIn.nextBoolean();
								b2.setIsEnabled(setenabled);
								System.out.println("�ɹ�!");
							} else {
								System.err.println("�Ƿ�����!����!");
							}
						}
					} else if (Equals.equals("666")) {
						phr.printPlaceholder(true);
						System.out.println("���Ѿ��˳�ģ�����!");
						break;
					}
				}
				break;
			case 666:
				phr.printPlaceholder(true);
				System.out.println("�����˳�ѧУ����ϵͳ!");
				System.exit(0);
			}
		}
	}
}
