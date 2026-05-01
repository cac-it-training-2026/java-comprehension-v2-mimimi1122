package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する
		ConsoleReader reader = new ConsoleReader();
		Member loginUser = null; // ログインしたユーザー情報を保持する変数

		// isLoginがfalseの間（つまり、ログインが成功するまで）ループし続ける
		while (!isLogin) {
			try {
				System.out.print("input id>>");
				int id = reader.inputNumber();

				System.out.print("input password>>");
				String password = reader.inputString();

				loginUser = loginService.doLogin(id, password);

				if (loginUser == null) {
					System.out.println("ID またはパスワードが違っています。再度入力してください。");
				} else {
					System.out.println("ログインに成功しました");
					isLogin = true; // ログイン成功！フラグをtrueにしてループを終わらせる
				}

			} catch (NumberFormatException e) {
				// IDに数字以外の文字が入力された場合
				System.out.println("不正な入力です。再度入力してください");
			} catch (IOException e) {
				// その他の入出力エラーが発生した場合
				e.printStackTrace();
			}
		}

		// ループを抜けた後の処理
		System.out.println("ログインユーザ情報を表示します。");
		loginUser.showMember();

	}

}
