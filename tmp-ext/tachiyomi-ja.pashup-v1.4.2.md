# Extension Validation Report

- Extension: tachiyomi-ja.pashup-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4500173675620672840
- Source name: Pash Up!
- Source language: ja
- Selected manga input: latest offset 0: 婚約破棄されたいので素顔を隠して残念令嬢になります！え？腹黒王子にバレてるとか聞いてないんですけど!? (`.../00003099`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | くま　クマ　熊　ベアー (`.../00000001`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | 小国の侯爵令嬢は敵国にて覚醒する (`.../00002480`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | 婚約破棄されたいので素顔を隠して残念令嬢になります！え？腹黒王子にバレてるとか聞いてないんですけど!? (`.../00003099`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | 婚約破棄された令嬢を拾った俺が、イケナイことを教え込む　〜美味しいものを食べさせておしゃれをさせて、世界一幸せな少女にプロデュース！〜 (`.../00000368`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 婚約破棄されたいので素顔を隠して残念令嬢になります！え？腹黒王子にバレてるとか聞いてないんですけど!? (`.../00003099`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 婚約破棄されたいので素顔を隠して残念令嬢になります！え？腹黒王子にバレてるとか聞いてないんですけど!? (`.../00003099`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | 🔒 婚約破棄されたいので素顔を隠して残念令嬢になります！え？腹黒王子にバレてるとか聞いてないんですけど!?（コミック）１ (`.../00003099`) |  | <1s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView and purchase this product to read. | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in via WebView and purchase this product to read. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=婚約破棄されたいので素顔を隠して残念令嬢になります！え？腹黒王子にバレてるとか聞いてないんですけど!?, URL=`00003099` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.pash-up.jp/.../00003099-t.jpg` (image/jpeg, 36464 bytes, 200x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `00003099` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.pash-up.jp/.../00003099-t.jpg` |  |  |  |
| details author | PASS | 漫画: 都筑せつり, 原作: 野原のこ, キャラクター原案: 南々瀬なつ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 伯爵令嬢のセラフィーナには大嫌いな婚約者がいる。 幼い頃からさんざん虐められ泣かされた侯爵令息のテディだ。 「全力で嫌われて、婚約破棄されてみせる！」そう誓って 顔も体型も偽装して”残念令嬢”として学園で過ごすセラフィーナだが、 そんな彼女に目をつけた第二王子レオナルドが ある取引を持ちかけてきて……!? なりふり構わぬはっちゃけ才女と貴公子面した腹黒王子の ”秘密の取引”から始まる溺愛コメディ！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView and purchase this product to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
