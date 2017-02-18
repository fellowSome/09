package api.day08;
/**
 *  自定义异常
 *  
 *  通常是用来描述蘑菇业务逻辑上出现的问题
 *  自定义异常应该见名思义
 *  
 * @author Administrator
 *
 */

public class ExceptionBySelfeDefine extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionBySelfeDefine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExceptionBySelfeDefine(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ExceptionBySelfeDefine(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ExceptionBySelfeDefine(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExceptionBySelfeDefine(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

    

}
