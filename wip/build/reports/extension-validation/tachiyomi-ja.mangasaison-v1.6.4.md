# Extension Validation Report

- Extension: tachiyomi-ja.mangasaison-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7468001507218227155
- Source name: Manga Saison
- Source language: ja
- Selected manga input: latest offset 0: 愛知らずのアイラブユー VOL.1 (`.../2528206`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | キングダム (`.../153670`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | ゲーム中盤で死ぬ悪役貴族に転生したので、外れスキル【テイム】を駆使して最強を目指してみた (`.../1887939`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | 愛知らずのアイラブユー VOL.1 (`.../2528206`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 異世界から帰ってきた勇者は既に擦り切れている。 コミック版（分冊版）　【第5話】 (`.../2394984`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 愛知らずのアイラブユー (`.../2528206`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 🔒 (Preview) 愛知らずのアイラブユー VOL.1 (`.../5f02795f-869d-4c72-b6a6-c2c50a0c81f2`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image.mechacomi.jp/.../5f02795f-869d-4c72-b6a6-c2c50a0c81f2.jpg` (image/jpeg, 45111 bytes, 238x338) |  |  |  |
| details identity | UNUSUAL | Details changed selected title 愛知らずのアイラブユー VOL.1 to 愛知らずのアイラブユー |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://image.mechacomi.jp/.../2528206.jpg <redacted query values: ver>` (image/jpeg, 45111 bytes, 238x338) |  |  |  |
| details author | PASS | 猫屋タク |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女性, BL |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 愛されたくて、つい尽くしすぎてしまう狐宮 要は、 元恋人に逃げられ、借金まで背負うことに。 やけ酒をあおっていたある夜、 色気と危うさをまとった男・新堂 一虎と出会う。 「今日だけでも　オレが愛してあげるよ」 その言葉に甘えるように、要は一虎と身体を重ねる── 一夜限りのはずだった。 けれど翌日、一虎が再び要の前に現れて!? 執着ヤクザ × ご奉仕不憫　アダルティックラブ ※この作品は『iHZ［アイハーツ］』に収録されています。重複ご購入にご注意ください。<br><br>Alternative Title: アイシラズノアイラブユー<br><br>Publisher: 大洋図書 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://api.distribution.mediadotech.com/.../BT000252820600100101900209_00020261117150124.uze <redacted query values: Expires, Signature, and Key-Pair-Id>` could not be downloaded: java.util.zip.ZipException: Encrypted ZIP entries aren't supported | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
