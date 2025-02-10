package sec03.verify.exam01;

public class FileDownloadServlet extends HttpServlet{

	FileDownloadServlet(){}
	
	@Override
	public void service() {
		System.out.println("파일 다운로드합니다.");
	}
}
