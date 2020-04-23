package xyz.mofangserver.stusys.functions;

import xyz.mofangserver.stusys.template.*;
import xyz.mofangserver.stusys.main.*;

/**
 * @author z_yu
 * @version 0.1
 * @serial SASYS(StudentAdminSystem)
 * @since 0.1
 */
public class PrintMarks {
	@SuppressWarnings("static-access")
	public final void printMarks(int NoNum, Student[] arr) {
		Main a = new Main();
		Admin a1 = new Admin();
		if (a1.exist(NoNum, arr[NoNum])) {
			System.out.println("======学生" + a.stuArr[NoNum].getName() + "的成绩报告======");
			System.out.println("语文成绩:\t" + a.stuArr[NoNum].getChineseMark());
			System.out.println("数学成绩:\t" + a.stuArr[NoNum].getMathsMark());
			System.out.println("英语成绩:\t" + a.stuArr[NoNum].getEnglishMark());
			System.out.println("物理成绩:\t" + a.stuArr[NoNum].getPhysicsMark());
			System.out.println("化学成绩:\t" + a.stuArr[NoNum].getChemistryMark());
			System.out.println("历史成绩:\t" + a.stuArr[NoNum].getHistoryMark());
			System.out.println("政治成绩:\t" + a.stuArr[NoNum].getPoliticalMark());
			System.out.println();
			a.stuArr[NoNum].setSum();
			a.stuArr[NoNum].setAvg();
			System.out.println("总成绩:\t" + a.stuArr[NoNum].getSum());
			System.out.println("平均分:\t" + a.stuArr[NoNum].getAvg());
		} else {
			System.err.println("学生不存在!");
		}
	}

	@SuppressWarnings("static-access")
	public final void printTeaKHMarks(int NoNum, Teacher[] arr) {
		Main a = new Main();
		TeacherAdmin a1 = new TeacherAdmin();
		if (a1.exist(NoNum, arr[NoNum])) {
			System.out.println("======学生" + a.teaArr[NoNum].getName() + "的考核分报告======");
			System.out.println("考核分为:" + a.teaArr[NoNum].getkhMark());
		} else {
			System.err.println("学生不存在!");
		}
	}
}
