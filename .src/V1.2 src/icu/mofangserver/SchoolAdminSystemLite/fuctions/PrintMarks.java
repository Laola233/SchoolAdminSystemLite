package icu.mofangserver.SchoolAdminSystemLite.fuctions;

import icu.mofangserver.SchoolAdminSystemLite.template.Student;
import icu.mofangserver.SchoolAdminSystemLite.template.Teacher;
import icu.mofangserver.SchoolAdminSystemLite.main.*;

/**
 * @author z_yu
 * @version 0.4
 * @serial SchoolAdminSystemLite
 * @since SchoolAdminSystemLite 0.1
 */
public class PrintMarks {
	@SuppressWarnings("static-access")
	public final void printMarks(int NoNum, Student[] arr) {
		Main a = new Main();
		MembersAdmin a1 = new MembersAdmin();
		if (a1.exist(NoNum, arr[NoNum])) {
			System.out.println("======ѧ��" + a.stuArr[NoNum].getName() + "�ĳɼ�����======");
			System.out.println("���ĳɼ�:\t" + a.stuArr[NoNum].getChineseMark());
			System.out.println("��ѧ�ɼ�:\t" + a.stuArr[NoNum].getMathsMark());
			System.out.println("Ӣ��ɼ�:\t" + a.stuArr[NoNum].getEnglishMark());
			System.out.println("����ɼ�:\t" + a.stuArr[NoNum].getPhysicsMark());
			System.out.println("��ѧ�ɼ�:\t" + a.stuArr[NoNum].getChemistryMark());
			System.out.println("��ʷ�ɼ�:\t" + a.stuArr[NoNum].getHistoryMark());
			System.out.println("���γɼ�:\t" + a.stuArr[NoNum].getPoliticalMark());
			System.out.println();
			a.stuArr[NoNum].setSum();
			a.stuArr[NoNum].setAvg();
			System.out.println("�ܳɼ�:\t" + a.stuArr[NoNum].getSum());
			System.out.println("ƽ����:\t" + a.stuArr[NoNum].getAvg());
		} else {
			System.err.println("ѧ��������!");
		}
	}

	@SuppressWarnings("static-access")
	public final void printTeaKHMarks(int NoNum, Teacher[] arr) {
		Main a = new Main();
		MembersAdmin a1 = new MembersAdmin();
		if (a1.exist(NoNum, arr[NoNum])) {
			System.out.println("======��ʦ" + a.teaArr[NoNum].getName() + "�Ŀ��˷ֱ���======");
			System.out.println("���˷�Ϊ:" + a.teaArr[NoNum].getkhMark());
		} else {
			System.err.println("ѧ��������!");
		}
	}
}
