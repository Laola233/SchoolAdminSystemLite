package icu.mofangserver.SchoolAdminSystemLite.fuctions;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author z_yu
 * @version 0.1
 * @serial SchoolAdminSystemLite
 * @since SchoolAdminSystemLite 0.1
 */
public class GetNowTime {
	public final static String Date() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		return dateString;
	}
}
