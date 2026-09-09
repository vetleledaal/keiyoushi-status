# Extension Validation Report

- Extension: tachiyomi-ja.amebamanga-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2623577517578458051
- Source name: Ameba Manga
- Source language: ja
- Selected manga input: latest offset 0: 火の神さまの掃除人ですが、いつの間にか花嫁として溺愛されています (`.../753827`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | キングダム (`.../6176`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | 「姉のスペア」と呼ばれた身代わり人生は、今日でやめることにします～辺境で自由を満喫中なので、今さら真の聖女と言われても知りません！～【電子単行本版／特典おまけ付き】 (`.../922802`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 50 | 火の神さまの掃除人ですが、いつの間にか花嫁として溺愛されています (`.../753827`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | 女王の烙印～滅びの国の夜伽巫女～ (`.../809039`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | 火の神さまの掃除人ですが、いつの間にか花嫁として溺愛されています (`.../753827`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 火の神さまの掃除人ですが、いつの間にか花嫁として溺愛されています (`.../753827`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 12 | 🔒 火の神さまの掃除人ですが、いつの間にか花嫁として溺愛されています 1 (`.../2039366`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=火の神さまの掃除人ですが、いつの間にか花嫁として溺愛されています, URL=`753827` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 203/203 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 203/203 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://stat.dokusho-ojikan.jp/.../0e9b3a73-36b8-4830-8877-07537a7d5dd2.jpg` (image/jpeg, 585822 bytes, 1445x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `753827` |  |  |  |
| details thumbnail URL | PASS | `https://stat.dokusho-ojikan.jp/.../0e9b3a73-36b8-4830-8877-07537a7d5dd2.jpg` |  |  |  |
| details author | PASS | 山田こもも, 浅木伊都, ＳＮＣ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 異世界, 異世界・ファンタジー, 結婚生活, 夫婦関係, ラブコメ, 夫婦, 異世界, 主人公が愛される, クール男子, 長身男子, 和装 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 絢爛豪華な大正結婚溺愛ファンタジー！<br><br>強い異能を用いて神々を喜ばせる巫(かんなぎ)の家に生まれた令嬢・小夜。<br>だが、その能力は弱く、義理の母や姉に迫害され、<br>やがて異界の猩々(しょうじょう)に売り飛ばされてしまう。<br><br>売られた先で、小夜は醜く忌み嫌われている神・鬼灯（ほおずき）と出会うが、<br>小夜の瞳に映るその姿は……？<br><br>呪われた神と追放された令嬢の契約結婚！<br>浪漫溢れる最高級の大正溺愛ファンタジー!!<br><br>Publisher: 小学館 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | LINT | All 12 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=12 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 500 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
