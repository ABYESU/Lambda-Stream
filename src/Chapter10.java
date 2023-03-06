import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chapter10 {
	public static void main(String[] args) throws Exception {
		List<Task> list = new ArrayList<>();
		list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
		list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接", false));
		list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う", true));
		list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く", false));
		list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));

		// 以下記述
		long count = list.stream()// streamを生成
				.filter(t -> t.isDone() == false)// 見実行のタスクを検索
				.count();// 要素の数を返す
		System.out.println("未完了のタスクの個数は" + count);// タスクの個数を出力
		System.out.println(" 【未完了のタスクを昇順に並べて一覧表示】");

		list.stream() // streamを生成
				.filter(t -> t.isDone() == false)// 見実行のタスクを検索
				.sorted()// タスクをソート
				.forEach(System.out::println);// タスクを出力
	}
}