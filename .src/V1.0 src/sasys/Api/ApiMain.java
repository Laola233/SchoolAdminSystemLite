package sasys.Api;

/**
 * 
 * @author z_yu
 * @version 0.2
 * @deprecated
 * @serial SASYS(SchoolAdminSystem)
 * @since 0.6
 */
public class ApiMain {
	public String welcome() {
		return "欢迎使用SASYS API";
	}

	@Override
	public String toString() {
		return "已经重写toString方法,无法获取内存地址!";
	}
}
