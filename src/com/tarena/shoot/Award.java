package com.tarena.shoot;
/** 奖励 */
public interface Award {
	public int DOUBLE_FIRE = 0; //火力�?
	public int LIFE = 1; //�?
	
	/** 获取奖励类型 返回0代表奖励为火力�?? 返回1代表奖励为命 */
	public int getType();
}

















