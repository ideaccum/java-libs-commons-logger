package org.ideaccum.libs.commons.logger;

import org.ideaccum.libs.commons.message.Messages;

/**
 * ロギングクライスインスタンスを生成するインタフェースを提供します。<br>
 * <p>
 * slf4jを利用したログ出力時のロガークラスインスタンスを生成する際と類似の{@link #getLogger(Class)}を提供します。<br>
 * 既存実装において、slf4jの{@link org.slf4j.Logger}を利用している個所について、置換を行う際に修正個所を局所的にすることを目的としています。<br>
 * </p>
 * 
 *<!--
 * 更新日      更新者           更新内容
 * 2018/06/13  Kitagawa         新規作成
 *-->
 */
public class LoggerFactory {

	/**
	 * コンストラクタ<br>
	 */
	private LoggerFactory() {
		super();
	}

	/**
	 * ロギングクラスインスタンスを提供します。<br>
	 * @param clazz ログ出力元クラス
	 * @param messages メッセージ定義情報
	 * @return ロギングクラスインスタンス
	 */
	public static Logger getLogger(Class<?> clazz, Messages messages) {
		return new LoggerImpl(org.slf4j.LoggerFactory.getLogger(clazz), messages);
	}

	/**
	 * ロギングクラスインスタンスを提供します。<br>
	 * @param clazz ログ出力元クラス
	 * @return ロギングクラスインスタンス
	 */
	public static Logger getLogger(Class<?> clazz) {
		return new LoggerImpl(org.slf4j.LoggerFactory.getLogger(clazz));
	}

	/**
	 * ロギングクラスインスタンスを提供します。<br>
	 * @param name ロガー名称
	 * @param messages メッセージ定義情報
	 * @return ロギングクラスインスタンス
	 */
	public static Logger getLogger(String name, Messages messages) {
		return new LoggerImpl(org.slf4j.LoggerFactory.getLogger(name), messages);
	}

	/**
	 * ロギングクラスインスタンスを提供します。<br>
	 * @param name ロガー名称
	 * @return ロギングクラスインスタンス
	 */
	public static Logger getLogger(String name) {
		return new LoggerImpl(org.slf4j.LoggerFactory.getLogger(name));
	}
}
