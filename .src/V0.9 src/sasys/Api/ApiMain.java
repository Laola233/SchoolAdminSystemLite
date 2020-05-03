package sasys.Api;

public class ApiMain {
	public String welcome() {
		return "欢迎使用SASYS API";
	}

	@Override
	public String toString() {
		return "已经重写toString方法,无法获取内存地址!";
	}
}
