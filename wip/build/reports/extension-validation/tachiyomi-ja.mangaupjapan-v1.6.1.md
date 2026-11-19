# Extension Validation Report

- Extension: tachiyomi-ja.mangaupjapan-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 697820552173578283
- Source name: Manga UP! (Japan)
- Source language: ja
- Selected manga input: popular offset 0: 社畜剣聖、配信者になる 〜ブラックギルド会社員、うっかり会社用回線でS級モンスターを相手に無双するところを全国配信してしまう〜 (`.../1295`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 社畜剣聖、配信者になる 〜ブラックギルド会社員、うっかり会社用回線でS級モンスターを相手に無双するところを全国配信してしまう〜 (`.../1295`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 68 | リピート・ヴァイス～悪役貴族は死にたくないので四天王になるのをやめました～ (`.../1529`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 社畜剣聖、配信者になる 〜ブラックギルド会社員、うっかり会社用回線でS級モンスターを相手に無双するところを全国配信してしまう〜 (`.../1295`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 社畜剣聖、配信者になる 〜ブラックギルド会社員、うっかり会社用回線でS級モンスターを相手に無双するところを全国配信してしまう〜 (`.../1295`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 65 | 第1話 - 田中、退職するってよ① (`.../267853`) |  | <1s |
| pages | `getPageList(chapter)` | success | 53 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 68 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=社畜剣聖、配信者になる 〜ブラックギルド会社員、うっかり会社用回線でS級モンスターを相手に無双するところを全国配信してしまう〜, URL=`.../1295` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 119/119 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 119/119 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ja-img.manga-up.com/.../1295.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 47656 bytes, 640x442) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1295` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ja-img.manga-up.com/.../1295.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 220240 bytes, 1242x828) |  |  |  |
| details author | PASS | 原作：熊乃げん骨, 原作イラスト：タジマ粒子, 漫画：上山ジョジョ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 青年, バトル・格闘・アクション, 異世界, 冒険, ファンタジー・幻想, バトル・格闘・アクション |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「就職こそ、人生の墓場だ……」ため息をつきながら、 今日も仕事でダンジョンに挑むブラックギルド所属のサラリーマン、田中誠。 ある日、業務記録用の配信設定を誤り、ダンジョン攻略の様子を全国配信してしまう。 〈タイラントドラゴンが一撃!? 〈現代に剣聖現る 常識外れの実力を披露する田中の姿に、配信はお祭り状態に!? 「ど、同接１億人……!?」 図らずも超絶人気配信者になった田中は、 ブラック職場を辞めて配信者として独立することになり―― 「－－さあ、業務（しごと）の時間だ」元社畜のダンジョン配信ライフ、開幕！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 65 chapters |  |  |  |
| chapter dates | LINT | All 65 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=65 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ja-img.manga-up.com/.../1563f9660_1_001.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 92828 bytes, 1080x1536) |  |  |  |
