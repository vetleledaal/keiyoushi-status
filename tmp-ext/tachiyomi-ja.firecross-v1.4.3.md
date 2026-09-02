# Extension Validation Report

- Extension: tachiyomi-ja.firecross-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6276622162610581454
- Source name: FireCross
- Source language: ja
- Selected manga input: popular offset 0: 女神から『孵化』のスキルを授かった俺が、なぜか幻獣や神獣を従える最強テイマーになるまで (`.../549`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | 女神から『孵化』のスキルを授かった俺が、なぜか幻獣や神獣を従える最強テイマーになるまで (`.../549`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | 勇者宇宙（ブレイブユニバース）ソーグレーダー (`.../514`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | 女神から『孵化』のスキルを授かった俺が、なぜか幻獣や神獣を従える最強テイマーになるまで (`.../548`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 女神から『孵化』のスキルを授かった俺が、なぜか幻獣や神獣を従える最強テイマーになるまで (`.../549`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 32 | 第1話 (`.../%7B%22token%22:%22RChfNEXmKHMWmVAUf4xvNa9uLSAvturKD87HwqyO%22,%22id%22:%2212865%22%7D`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 46 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=女神から『孵化』のスキルを授かった俺が、なぜか幻獣や神獣を従える最強テイマーになるまで, URL=`.../549` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://firecross.jp/.../e4089397-b075-4f79-895f-ec78770fd22e.jpg` (image/jpeg, 266156 bytes, 980x980) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../549` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 漫画 春夏冬 唯人, 原作 まるせい, キャラクター原案 珀石碧 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ファンタジー, バトル, 異世界 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 落雷に打たれ死の淵を彷徨うクラウスが女神より授かったのは・スキル「孵化」。 卵を孵化させるという何の変哲もないスキルにみえたが、偶然発見した魔物の卵にスキルを使用してみると―― 生まれた魔物がまさかのレアモンスター！　さらに平凡だったはずのクラウスのステータスも超成長して!? 自分で孵した可愛すぎる相棒たちと共に楽しい冒険者ライフを送る、Webで超人気のテイマーファンタジー!!　コミカライズ連載開始！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 32 chapters |  |  |  |
| chapter dates | PASS | 32 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://firecross.jp/.../diazepam_hybrid.php <redacted query values: mode, file, reqtype, and param>` (image/jpeg, 412549 bytes, 1000x1421) |  |  |  |
